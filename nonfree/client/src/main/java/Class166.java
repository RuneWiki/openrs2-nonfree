import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public final class Class166 {

	@OriginalMember(owner = "client!iu", name = "p", descriptor = "[[Lclient!km;")
	private Class193[][] aClass193ArrayArray1;

	@OriginalMember(owner = "client!iu", name = "q", descriptor = "Lclient!dga;")
	private final Class67_Sub2 aClass67_Sub2_3;

	@OriginalMember(owner = "client!iu", name = "s", descriptor = "Lclient!qj;")
	private final Class100_Sub3 aClass100_Sub3_25;

	@OriginalMember(owner = "client!iu", name = "m", descriptor = "I")
	public final int anInt4357;

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "I")
	private final int anInt4348;

	@OriginalMember(owner = "client!iu", name = "f", descriptor = "I")
	private final int anInt4351;

	@OriginalMember(owner = "client!iu", name = "t", descriptor = "[B")
	public final byte[] aByteArray51;

	@OriginalMember(owner = "client!iu", name = "r", descriptor = "I")
	private final int anInt4359;

	@OriginalMember(owner = "client!iu", name = "g", descriptor = "I")
	private final int anInt4352;

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Lclient!qj;Lclient!dga;)V")
	public Class166(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) Class67_Sub2 arg1) {
		this.aClass67_Sub2_3 = arg1;
		this.aClass100_Sub3_25 = arg0;
		this.anInt4357 = (this.aClass67_Sub2_3.anInt8104 * this.aClass67_Sub2_3.anInt8111 >> this.aClass100_Sub3_25.anInt7665) + 2;
		this.anInt4348 = (this.aClass67_Sub2_3.anInt8104 * this.aClass67_Sub2_3.anInt8110 >> this.aClass100_Sub3_25.anInt7665) + 2;
		this.anInt4351 = this.aClass100_Sub3_25.anInt7665 + 7 - this.aClass67_Sub2_3.anInt8108;
		this.aByteArray51 = new byte[this.anInt4348 * this.anInt4357];
		this.anInt4359 = this.aClass67_Sub2_3.anInt8111 >> this.anInt4351;
		this.anInt4352 = this.aClass67_Sub2_3.anInt8110 >> this.anInt4351;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IZIII)V")
	private void method3631(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass193ArrayArray1 == null) {
			return;
		}
		@Pc(24) int local24 = arg0 - 1 >> 7;
		@Pc(34) int local34 = arg0 + arg3 - 1 - 1 >> 7;
		@Pc(40) int local40 = arg2 - 1 >> 7;
		@Pc(48) int local48 = arg2 + arg1 - 2 >> 7;
		for (@Pc(50) int local50 = local24; local50 <= local34; local50++) {
			@Pc(57) Class193[] local57 = this.aClass193ArrayArray1[local50];
			for (@Pc(59) int local59 = local40; local59 <= local48; local59++) {
				local57[local59].aBoolean399 = true;
			}
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(II[[ZZZI)V")
	public void method3632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		this.aClass100_Sub3_25.method6327(false);
		this.aClass100_Sub3_25.method6270(false);
		this.aClass100_Sub3_25.method6278(-2);
		this.aClass100_Sub3_25.method6322(1);
		this.aClass100_Sub3_25.method6334(1);
		@Pc(50) float local50 = 1.0F / (float) (this.aClass100_Sub3_25.anInt7666 * 128);
		@Pc(54) int local54;
		@Pc(61) int local61;
		@Pc(68) int local68;
		@Pc(70) int local70;
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(86) int local86;
		if (arg3) {
			for (local54 = 0; local54 < this.anInt4352; local54++) {
				local61 = local54 << this.anInt4351;
				local68 = local54 + 1 << this.anInt4351;
				label128: for (local70 = 0; local70 < this.anInt4359; local70++) {
					local77 = local70 << this.anInt4351;
					local84 = local70 + 1 << this.anInt4351;
					for (local86 = local77; local86 < local84; local86++) {
						if (local86 - arg0 >= -arg4 && local86 - arg0 <= arg4) {
							for (@Pc(111) int local111 = local61; local111 < local68; local111++) {
								if (local111 - arg1 >= -arg4 && arg4 >= local111 - arg1 && arg2[arg4 + local86 - arg0][arg4 + local111 - arg1]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local50, local50, 1.0F);
									OpenGL.glTranslatef((float) -local70 / local50, (float) -local54 / local50, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass193ArrayArray1[local70][local54].method4211();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local54 = 0; local54 < this.anInt4352; local54++) {
				local61 = local54 << this.anInt4351;
				local68 = local54 + 1 << this.anInt4351;
				for (local70 = 0; local70 < this.anInt4359; local70++) {
					local77 = 0;
					local84 = local70 << this.anInt4351;
					local86 = local70 + 1 << this.anInt4351;
					@Pc(242) Class2_Sub15_Sub1 local242 = this.aClass100_Sub3_25.aClass2_Sub15_Sub1_2;
					local242.anInt5241 = 0;
					for (@Pc(247) int local247 = local61; local247 < local68; local247++) {
						if (-arg4 <= local247 - arg1 && local247 - arg1 <= arg4) {
							@Pc(271) int local271 = local247 * this.aClass67_Sub2_3.anInt8111 + local84;
							for (@Pc(273) int local273 = local84; local273 < local86; local273++) {
								if (-arg4 <= local273 - arg0 && arg4 >= local273 - arg0 && arg2[arg4 + local273 - arg0][local247 + arg4 - arg1]) {
									@Pc(315) short[] local315 = this.aClass67_Sub2_3.aShortArrayArray2[local271];
									if (local315 != null) {
										@Pc(323) int local323;
										if (this.aClass100_Sub3_25.aBoolean595) {
											for (local323 = 0; local323 < local315.length; local323++) {
												local242.method4350(local315[local323] & 0xFFFF);
												local77++;
											}
										} else {
											for (local323 = 0; local323 < local315.length; local323++) {
												local77++;
												local242.method4308(local315[local323] & 0xFFFF);
											}
										}
									}
								}
								local271++;
							}
						}
					}
					if (local77 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local50, local50, 1.0F);
						OpenGL.glTranslatef((float) -local70 / local50, (float) -local54 / local50, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass193ArrayArray1[local70][local54].method4210(local242.aByteArray62, local77);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lclient!ha;III)Z")
	public boolean method3633(@OriginalArg(0) Class2_Sub3_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class2_Sub3_Sub6_Sub2 local6 = (Class2_Sub3_Sub6_Sub2) arg0;
		arg2 += local6.anInt9185 + 1;
		arg1 += local6.anInt9194 + 1;
		@Pc(27) int local27 = arg1 * this.anInt4357 + arg2;
		@Pc(30) int local30 = local6.anInt9187;
		@Pc(33) int local33 = local6.anInt9186;
		@Pc(39) int local39 = this.anInt4357 - local33;
		@Pc(49) int local49;
		if (arg1 <= 0) {
			local49 = 1 - arg1;
			local27 += this.anInt4357 * local49;
			local30 -= local49;
			arg1 = 1;
		}
		if (this.anInt4348 <= arg1 + local30) {
			local49 = arg1 + local30 + 1 - this.anInt4348;
			local30 -= local49;
		}
		if (arg2 <= 0) {
			local49 = 1 - arg2;
			local27 += local49;
			local39 += local49;
			arg2 = 1;
			local33 -= local49;
		}
		if (arg2 + local33 >= this.anInt4357) {
			local49 = local33 + arg2 + 1 - this.anInt4357;
			local33 -= local49;
			local39 += local49;
		}
		if (local33 > 0 && local30 > 0) {
			local39 += this.anInt4357 * 7;
			return Static590.method7962(local33, local39, local27, this.aByteArray51, local30);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)V")
	public void method3634() {
		this.aClass193ArrayArray1 = new Class193[this.anInt4359][this.anInt4352];
		for (@Pc(18) int local18 = 0; local18 < this.anInt4352; local18++) {
			for (@Pc(22) int local22 = 0; local22 < this.anInt4359; local22++) {
				this.aClass193ArrayArray1[local22][local18] = new Class193(this.aClass100_Sub3_25, this, this.aClass67_Sub2_3, local22, local18, this.anInt4351, local22 * 128 + 1, local18 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(ILclient!ha;ZI)V")
	public void method3635(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub3_Sub6 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class2_Sub3_Sub6_Sub2 local6 = (Class2_Sub3_Sub6_Sub2) arg1;
		arg2 += local6.anInt9194 + 1;
		arg0 += local6.anInt9185 + 1;
		@Pc(27) int local27 = arg2 * this.anInt4357 + arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt9187;
		@Pc(35) int local35 = local6.anInt9186;
		@Pc(40) int local40 = this.anInt4357 - local35;
		@Pc(50) int local50 = 0;
		@Pc(57) int local57;
		if (arg2 <= 0) {
			local57 = 1 - arg2;
			local32 -= local57;
			local29 = local57 * local35;
			arg2 = 1;
			local27 += local57 * this.anInt4357;
		}
		if (local32 + arg2 >= this.anInt4348) {
			local57 = local32 + arg2 + 1 - this.anInt4348;
			local32 -= local57;
		}
		if (arg0 <= 0) {
			local57 = 1 - arg0;
			local27 += local57;
			local35 -= local57;
			local50 = local57;
			arg0 = 1;
			local29 += local57;
			local40 += local57;
		}
		if (this.anInt4357 <= arg0 + local35) {
			local57 = local35 + arg0 + 1 - this.anInt4357;
			local35 -= local57;
			local40 += local57;
			local50 += local57;
		}
		if (local35 > 0 && local32 > 0) {
			Static171.method7686(local35, local6.aByteArray98, local40, local29, this.aByteArray51, local32, local27, local50);
			this.method3631(arg0, local32, arg2, local35);
		}
	}

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(Lclient!ha;III)V")
	public void method3637(@OriginalArg(0) Class2_Sub3_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class2_Sub3_Sub6_Sub2 local6 = (Class2_Sub3_Sub6_Sub2) arg0;
		arg2 += local6.anInt9185 + 1;
		arg1 += local6.anInt9194 + 1;
		@Pc(27) int local27 = arg1 * this.anInt4357 + arg2;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt9187;
		@Pc(35) int local35 = local6.anInt9186;
		@Pc(41) int local41 = this.anInt4357 - local35;
		@Pc(47) int local47;
		if (arg1 <= 0) {
			local47 = 1 - arg1;
			local27 += local47 * this.anInt4357;
			local32 -= local47;
			local29 = local35 * local47;
			arg1 = 1;
		}
		@Pc(68) int local68 = 0;
		if (arg1 + local32 >= this.anInt4348) {
			local47 = local32 + arg1 + 1 - this.anInt4348;
			local32 -= local47;
		}
		if (arg2 <= 0) {
			local47 = 1 - arg2;
			local41 += local47;
			local29 += local47;
			local68 = local47;
			arg2 = 1;
			local35 -= local47;
			local27 += local47;
		}
		if (local35 + arg2 >= this.anInt4357) {
			local47 = arg2 + local35 + 1 - this.anInt4357;
			local41 += local47;
			local68 += local47;
			local35 -= local47;
		}
		if (local35 > 0 && local32 > 0) {
			Static215.method3471(local35, local68, this.aByteArray51, local29, local6.aByteArray98, local41, local32, local27);
			this.method3631(arg2, local32, arg1, local35);
		}
	}
}
