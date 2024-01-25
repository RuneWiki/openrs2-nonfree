import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qga")
public final class Class284 {

	@OriginalMember(owner = "client!qga", name = "i", descriptor = "[[Lclient!qia;")
	private Class286[][] aClass286ArrayArray1;

	@OriginalMember(owner = "client!qga", name = "e", descriptor = "Lclient!dia;")
	private final Class13_Sub2 aClass13_Sub2_34;

	@OriginalMember(owner = "client!qga", name = "j", descriptor = "Lclient!ct;")
	private final Class21_Sub2 aClass21_Sub2_2;

	@OriginalMember(owner = "client!qga", name = "n", descriptor = "I")
	public final int anInt8055;

	@OriginalMember(owner = "client!qga", name = "q", descriptor = "I")
	private final int anInt8056;

	@OriginalMember(owner = "client!qga", name = "o", descriptor = "[B")
	public final byte[] aByteArray85;

	@OriginalMember(owner = "client!qga", name = "d", descriptor = "I")
	private final int anInt8049;

	@OriginalMember(owner = "client!qga", name = "f", descriptor = "I")
	private final int anInt8050;

	@OriginalMember(owner = "client!qga", name = "h", descriptor = "I")
	private final int anInt8052;

	@OriginalMember(owner = "client!qga", name = "<init>", descriptor = "(Lclient!dia;Lclient!ct;)V")
	public Class284(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) Class21_Sub2 arg1) {
		this.aClass13_Sub2_34 = arg0;
		this.aClass21_Sub2_2 = arg1;
		this.anInt8055 = (this.aClass21_Sub2_2.anInt9123 * this.aClass21_Sub2_2.anInt9129 >> this.aClass13_Sub2_34.anInt2154) + 2;
		this.anInt8056 = (this.aClass21_Sub2_2.anInt9123 * this.aClass21_Sub2_2.anInt9128 >> this.aClass13_Sub2_34.anInt2154) + 2;
		this.aByteArray85 = new byte[this.anInt8055 * this.anInt8056];
		this.anInt8049 = this.aClass13_Sub2_34.anInt2154 + 7 - this.aClass21_Sub2_2.anInt9125;
		this.anInt8050 = this.aClass21_Sub2_2.anInt9129 >> this.anInt8049;
		this.anInt8052 = this.aClass21_Sub2_2.anInt9128 >> this.anInt8049;
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(II[[ZIZZ)V")
	public void method7041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		this.aClass13_Sub2_34.method1988(false);
		this.aClass13_Sub2_34.method1954(false);
		this.aClass13_Sub2_34.method2011(-2);
		this.aClass13_Sub2_34.method1960(1);
		this.aClass13_Sub2_34.method2019(1);
		@Pc(43) float local43 = 1.0F / (float) (this.aClass13_Sub2_34.anInt2156 * 128);
		@Pc(47) int local47;
		@Pc(54) int local54;
		@Pc(61) int local61;
		@Pc(63) int local63;
		@Pc(70) int local70;
		@Pc(77) int local77;
		@Pc(79) int local79;
		if (arg4) {
			for (local47 = 0; local47 < this.anInt8052; local47++) {
				local54 = local47 << this.anInt8049;
				local61 = local47 + 1 << this.anInt8049;
				label128: for (local63 = 0; local63 < this.anInt8050; local63++) {
					local70 = local63 << this.anInt8049;
					local77 = local63 + 1 << this.anInt8049;
					for (local79 = local70; local79 < local77; local79++) {
						if (local79 - arg0 >= -arg3 && local79 - arg0 <= arg3) {
							for (@Pc(104) int local104 = local54; local104 < local61; local104++) {
								if (-arg3 <= local104 - arg1 && arg3 >= local104 - arg1 && arg2[arg3 + local79 - arg0][arg3 + local104 - arg1]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local43, local43, 1.0F);
									OpenGL.glTranslatef((float) -local63 / local43, (float) -local47 / local43, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass286ArrayArray1[local63][local47].method7086();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local47 = 0; local47 < this.anInt8052; local47++) {
				local54 = local47 << this.anInt8049;
				local61 = local47 + 1 << this.anInt8049;
				for (local63 = 0; local63 < this.anInt8050; local63++) {
					local70 = 0;
					local77 = local63 << this.anInt8049;
					local79 = local63 + 1 << this.anInt8049;
					@Pc(236) Class3_Sub25_Sub2 local236 = this.aClass13_Sub2_34.aClass3_Sub25_Sub2_1;
					local236.anInt9765 = 0;
					for (@Pc(241) int local241 = local54; local241 < local61; local241++) {
						if (local241 - arg1 >= -arg3 && arg3 >= local241 - arg1) {
							@Pc(268) int local268 = local77 + local241 * this.aClass21_Sub2_2.anInt9129;
							for (@Pc(270) int local270 = local77; local270 < local79; local270++) {
								if (local270 - arg0 >= -arg3 && local270 - arg0 <= arg3 && arg2[arg3 + local270 - arg0][arg3 + local241 - arg1]) {
									@Pc(306) short[] local306 = this.aClass21_Sub2_2.aShortArrayArray3[local268];
									if (local306 != null) {
										@Pc(314) int local314;
										if (this.aClass13_Sub2_34.aBoolean166) {
											for (local314 = 0; local314 < local306.length; local314++) {
												local70++;
												local236.method8649(local306[local314] & 0xFFFF);
											}
										} else {
											for (local314 = 0; local314 < local306.length; local314++) {
												local236.method8602(local306[local314] & 0xFFFF);
												local70++;
											}
										}
									}
								}
								local268++;
							}
						}
					}
					if (local70 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local43, local43, 1.0F);
						OpenGL.glTranslatef((float) -local63 / local43, (float) -local47 / local43, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass286ArrayArray1[local63][local47].method7087(local70, local236.aByteArray106);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(Lclient!r;III)Z")
	public boolean method7042(@OriginalArg(0) Class3_Sub11_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub11_Sub3_Sub2 local6 = (Class3_Sub11_Sub3_Sub2) arg0;
		arg2 += local6.anInt7829 + 1;
		arg1 += local6.anInt7827 + 1;
		@Pc(27) int local27 = arg1 + this.anInt8055 * arg2;
		@Pc(30) int local30 = local6.anInt7822;
		@Pc(33) int local33 = local6.anInt7823;
		@Pc(39) int local39 = this.anInt8055 - local33;
		@Pc(49) int local49;
		if (arg2 <= 0) {
			local49 = 1 - arg2;
			local27 += this.anInt8055 * local49;
			arg2 = 1;
			local30 -= local49;
		}
		if (local30 + arg2 >= this.anInt8056) {
			local49 = arg2 + local30 + 1 - this.anInt8056;
			local30 -= local49;
		}
		if (arg1 <= 0) {
			local49 = 1 - arg1;
			arg1 = 1;
			local39 += local49;
			local27 += local49;
			local33 -= local49;
		}
		if (local33 + arg1 >= this.anInt8055) {
			local49 = arg1 + local33 + 1 - this.anInt8055;
			local33 -= local49;
			local39 += local49;
		}
		if (local33 > 0 && local30 > 0) {
			local39 += this.anInt8055 * 7;
			return Static451.method6587(local30, local39, this.aByteArray85, local27, local33);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(IIIII)V")
	private void method7044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass286ArrayArray1 == null) {
			return;
		}
		@Pc(19) int local19 = arg3 - 1 >> 7;
		@Pc(29) int local29 = arg0 + arg3 - 1 - 1 >> 7;
		@Pc(35) int local35 = arg2 - 1 >> 7;
		@Pc(46) int local46 = arg2 + arg1 - 1 - 1 >> 7;
		for (@Pc(48) int local48 = local19; local48 <= local29; local48++) {
			@Pc(55) Class286[] local55 = this.aClass286ArrayArray1[local48];
			for (@Pc(57) int local57 = local35; local57 <= local46; local57++) {
				local55[local57].aBoolean613 = true;
			}
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(IILclient!r;I)V")
	public void method7045(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub11_Sub3 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub11_Sub3_Sub2 local6 = (Class3_Sub11_Sub3_Sub2) arg1;
		arg0 += local6.anInt7829 + 1;
		arg2 += local6.anInt7827 + 1;
		@Pc(27) int local27 = arg2 + this.anInt8055 * arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt7822;
		@Pc(41) int local41 = local6.anInt7823;
		@Pc(47) int local47 = this.anInt8055 - local41;
		@Pc(53) int local53;
		if (arg0 <= 0) {
			local53 = 1 - arg0;
			arg0 = 1;
			local27 += local53 * this.anInt8055;
			local29 = local53 * local41;
			local32 -= local53;
		}
		@Pc(74) int local74 = 0;
		if (this.anInt8056 <= local32 + arg0) {
			local53 = local32 + arg0 + 1 - this.anInt8056;
			local32 -= local53;
		}
		if (arg2 <= 0) {
			local53 = 1 - arg2;
			local47 += local53;
			arg2 = 1;
			local29 += local53;
			local74 = local53;
			local41 -= local53;
			local27 += local53;
		}
		if (this.anInt8055 <= local41 + arg2) {
			local53 = local41 + arg2 + 1 - this.anInt8055;
			local41 -= local53;
			local74 += local53;
			local47 += local53;
		}
		if (local41 > 0 && local32 > 0) {
			Static341.method5110(local27, local74, local41, this.aByteArray85, local29, local47, local32, local6.aByteArray84);
			this.method7044(local41, local32, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(ILclient!r;II)V")
	public void method7046(@OriginalArg(1) Class3_Sub11_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub11_Sub3_Sub2 local6 = (Class3_Sub11_Sub3_Sub2) arg0;
		arg1 += local6.anInt7829 + 1;
		arg2 += local6.anInt7827 + 1;
		@Pc(36) int local36 = arg2 + arg1 * this.anInt8055;
		@Pc(38) int local38 = 0;
		@Pc(41) int local41 = local6.anInt7822;
		@Pc(44) int local44 = local6.anInt7823;
		@Pc(49) int local49 = this.anInt8055 - local44;
		@Pc(59) int local59;
		if (arg1 <= 0) {
			local59 = 1 - arg1;
			local41 -= local59;
			local36 += this.anInt8055 * local59;
			local38 = local59 * local44;
			arg1 = 1;
		}
		@Pc(80) int local80 = 0;
		if (this.anInt8056 <= local41 + arg1) {
			local59 = local41 + arg1 + 1 - this.anInt8056;
			local41 -= local59;
		}
		if (arg2 <= 0) {
			local59 = 1 - arg2;
			local44 -= local59;
			local36 += local59;
			local49 += local59;
			local80 = local59;
			arg2 = 1;
			local38 += local59;
		}
		if (arg2 + local44 >= this.anInt8055) {
			local59 = local44 + arg2 + 1 - this.anInt8055;
			local80 += local59;
			local44 -= local59;
			local49 += local59;
		}
		if (local44 > 0 && local41 > 0) {
			Static110.method2080(local6.aByteArray84, local49, local80, local36, local41, local38, local44, this.aByteArray85);
			this.method7044(local44, local41, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)V")
	public void method7047() {
		this.aClass286ArrayArray1 = new Class286[this.anInt8050][this.anInt8052];
		for (@Pc(14) int local14 = 0; local14 < this.anInt8052; local14++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt8050; local24++) {
				this.aClass286ArrayArray1[local24][local14] = new Class286(this.aClass13_Sub2_34, this, this.aClass21_Sub2_2, local24, local14, this.anInt8049, local24 * 128 + 1, local14 * 128 + 1);
			}
		}
	}
}
