import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!haa")
public final class Class121 {

	@OriginalMember(owner = "client!haa", name = "t", descriptor = "[[Lclient!lh;")
	private Class192[][] aClass192ArrayArray1;

	@OriginalMember(owner = "client!haa", name = "l", descriptor = "Lclient!vj;")
	private final Class45_Sub3 aClass45_Sub3_22;

	@OriginalMember(owner = "client!haa", name = "j", descriptor = "Lclient!mea;")
	private final Class34_Sub3 aClass34_Sub3_2;

	@OriginalMember(owner = "client!haa", name = "c", descriptor = "I")
	public final int anInt3599;

	@OriginalMember(owner = "client!haa", name = "k", descriptor = "I")
	private final int anInt3604;

	@OriginalMember(owner = "client!haa", name = "p", descriptor = "I")
	private final int anInt3608;

	@OriginalMember(owner = "client!haa", name = "e", descriptor = "[B")
	public final byte[] aByteArray38;

	@OriginalMember(owner = "client!haa", name = "v", descriptor = "I")
	private final int anInt3612;

	@OriginalMember(owner = "client!haa", name = "f", descriptor = "I")
	private final int anInt3601;

	@OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(Lclient!vj;Lclient!mea;)V")
	public Class121(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) Class34_Sub3 arg1) {
		this.aClass45_Sub3_22 = arg0;
		this.aClass34_Sub3_2 = arg1;
		this.anInt3599 = (this.aClass34_Sub3_2.anInt7850 * this.aClass34_Sub3_2.anInt7854 >> this.aClass45_Sub3_22.anInt9043) + 2;
		this.anInt3604 = (this.aClass34_Sub3_2.anInt7850 * this.aClass34_Sub3_2.anInt7852 >> this.aClass45_Sub3_22.anInt9043) + 2;
		this.anInt3608 = this.aClass45_Sub3_22.anInt9043 + 7 - this.aClass34_Sub3_2.anInt7856;
		this.aByteArray38 = new byte[this.anInt3604 * this.anInt3599];
		this.anInt3612 = this.aClass34_Sub3_2.anInt7854 >> this.anInt3608;
		this.anInt3601 = this.aClass34_Sub3_2.anInt7852 >> this.anInt3608;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(I)V")
	public void method3208() {
		this.aClass192ArrayArray1 = new Class192[this.anInt3612][this.anInt3601];
		for (@Pc(22) int local22 = 0; local22 < this.anInt3601; local22++) {
			for (@Pc(26) int local26 = 0; local26 < this.anInt3612; local26++) {
				this.aClass192ArrayArray1[local26][local22] = new Class192(this.aClass45_Sub3_22, this, this.aClass34_Sub3_2, local26, local22, this.anInt3608, local26 * 128 + 1, local22 * 128 - -1);
			}
		}
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IILclient!ha;I)Z")
	public boolean method3210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub7_Sub13 arg2) {
		@Pc(6) Class3_Sub7_Sub13_Sub1 local6 = (Class3_Sub7_Sub13_Sub1) arg2;
		arg1 += local6.anInt6512 + 1;
		arg0 += local6.anInt6519 + 1;
		@Pc(27) int local27 = arg1 * this.anInt3599 + arg0;
		@Pc(30) int local30 = local6.anInt6516;
		@Pc(42) int local42 = local6.anInt6511;
		@Pc(48) int local48 = this.anInt3599 - local42;
		@Pc(57) int local57;
		if (arg1 <= 0) {
			local57 = 1 - arg1;
			local27 += this.anInt3599 * local57;
			local30 -= local57;
			arg1 = 1;
		}
		if (this.anInt3604 <= arg1 + local30) {
			local57 = arg1 + local30 + 1 - this.anInt3604;
			local30 -= local57;
		}
		if (arg0 <= 0) {
			local57 = 1 - arg0;
			local27 += local57;
			local42 -= local57;
			local48 += local57;
			arg0 = 1;
		}
		if (this.anInt3599 <= arg0 + local42) {
			local57 = arg0 + local42 + 1 - this.anInt3599;
			local48 += local57;
			local42 -= local57;
		}
		if (local42 > 0 && local30 > 0) {
			local48 += this.anInt3599 * 7;
			return Static108.method6606(this.aByteArray38, local48, local27, local30, local42);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(ILclient!ha;ZI)V")
	public void method3213(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7_Sub13 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub7_Sub13_Sub1 local6 = (Class3_Sub7_Sub13_Sub1) arg1;
		arg0 += local6.anInt6512 + 1;
		arg2 += local6.anInt6519 + 1;
		@Pc(28) int local28 = arg2 + arg0 * this.anInt3599;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt6516;
		@Pc(36) int local36 = local6.anInt6511;
		@Pc(42) int local42 = this.anInt3599 - local36;
		@Pc(44) int local44 = 0;
		@Pc(54) int local54;
		if (arg0 <= 0) {
			local54 = 1 - arg0;
			local28 += this.anInt3599 * local54;
			arg0 = 1;
			local30 = local36 * local54;
			local33 -= local54;
		}
		if (arg0 + local33 >= this.anInt3604) {
			local54 = arg0 + local33 + 1 - this.anInt3604;
			local33 -= local54;
		}
		if (arg2 <= 0) {
			local54 = 1 - arg2;
			local36 -= local54;
			local42 += local54;
			local30 += local54;
			local44 = local54;
			local28 += local54;
			arg2 = 1;
		}
		if (local36 + arg2 >= this.anInt3599) {
			local54 = arg2 + local36 + 1 - this.anInt3599;
			local42 += local54;
			local36 -= local54;
			local44 += local54;
		}
		if (local36 > 0 && local33 > 0) {
			Static291.method4372(local30, local44, local28, local33, local6.aByteArray71, local42, this.aByteArray38, local36);
			this.method3218(arg2, arg0, local36, local33);
		}
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(IILclient!ha;I)V")
	public void method3215(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub7_Sub13 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub7_Sub13_Sub1 local6 = (Class3_Sub7_Sub13_Sub1) arg1;
		arg2 += local6.anInt6519 + 1;
		arg0 += local6.anInt6512 + 1;
		@Pc(27) int local27 = this.anInt3599 * arg0 + arg2;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt6516;
		@Pc(39) int local39 = local6.anInt6511;
		@Pc(44) int local44 = this.anInt3599 - local39;
		@Pc(51) int local51;
		if (arg0 <= 0) {
			local51 = 1 - arg0;
			local32 -= local51;
			local27 += local51 * this.anInt3599;
			local29 = local39 * local51;
			arg0 = 1;
		}
		@Pc(72) int local72 = 0;
		if (this.anInt3604 <= arg0 + local32) {
			local51 = arg0 + local32 + 1 - this.anInt3604;
			local32 -= local51;
		}
		if (arg2 <= 0) {
			local51 = 1 - arg2;
			local27 += local51;
			local29 += local51;
			local44 += local51;
			arg2 = 1;
			local72 = local51;
			local39 -= local51;
		}
		if (local39 + arg2 >= this.anInt3599) {
			local51 = local39 + arg2 + 1 - this.anInt3599;
			local44 += local51;
			local39 -= local51;
			local72 += local51;
		}
		if (local39 > 0 && local32 > 0) {
			Static183.method3143(local32, local6.aByteArray71, local72, local29, local27, local44, local39, this.aByteArray38);
			this.method3218(arg2, arg0, local39, local32);
		}
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "([[ZZIZII)V")
	public void method3217(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aClass45_Sub3_22.method7489(false);
		this.aClass45_Sub3_22.method7437(false);
		this.aClass45_Sub3_22.method7505(-2);
		this.aClass45_Sub3_22.method7500(1);
		this.aClass45_Sub3_22.method7465(1);
		@Pc(39) float local39 = 1.0F / (float) (this.aClass45_Sub3_22.anInt9044 * 128);
		@Pc(43) int local43;
		@Pc(50) int local50;
		@Pc(57) int local57;
		@Pc(59) int local59;
		@Pc(66) int local66;
		@Pc(73) int local73;
		@Pc(75) int local75;
		if (arg1) {
			for (local43 = 0; local43 < this.anInt3601; local43++) {
				local50 = local43 << this.anInt3608;
				local57 = local43 + 1 << this.anInt3608;
				label128: for (local59 = 0; local59 < this.anInt3612; local59++) {
					local66 = local59 << this.anInt3608;
					local73 = local59 + 1 << this.anInt3608;
					for (local75 = local66; local75 < local73; local75++) {
						if (-arg2 <= local75 - arg3 && arg2 >= local75 - arg3) {
							for (@Pc(95) int local95 = local50; local95 < local57; local95++) {
								if (local95 - arg4 >= -arg2 && local95 - arg4 <= arg2 && arg0[local75 + arg2 - arg3][arg2 + local95 - arg4]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local39, local39, 1.0F);
									OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass192ArrayArray1[local59][local43].method4450();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local43 = 0; local43 < this.anInt3601; local43++) {
				local50 = local43 << this.anInt3608;
				local57 = local43 + 1 << this.anInt3608;
				for (local59 = 0; local59 < this.anInt3612; local59++) {
					local66 = 0;
					local73 = local59 << this.anInt3608;
					local75 = local59 + 1 << this.anInt3608;
					@Pc(239) Class3_Sub11_Sub2 local239 = this.aClass45_Sub3_22.aClass3_Sub11_Sub2_3;
					local239.anInt6128 = 0;
					for (@Pc(244) int local244 = local50; local244 < local57; local244++) {
						if (local244 - arg4 >= -arg2 && local244 - arg4 <= arg2) {
							@Pc(266) int local266 = local73 + local244 * this.aClass34_Sub3_2.anInt7854;
							for (@Pc(268) int local268 = local73; local268 < local75; local268++) {
								if (-arg2 <= local268 - arg3 && arg2 >= local268 - arg3 && arg0[arg2 + local268 - arg3][arg2 + local244 - arg4]) {
									@Pc(308) short[] local308 = this.aClass34_Sub3_2.aShortArrayArray20[local266];
									if (local308 != null) {
										@Pc(316) int local316;
										if (this.aClass45_Sub3_22.aBoolean687) {
											for (local316 = 0; local316 < local308.length; local316++) {
												local66++;
												local239.method5200(local308[local316] & 0xFFFF);
											}
										} else {
											for (local316 = 0; local316 < local308.length; local316++) {
												local66++;
												local239.method5222(local308[local316] & 0xFFFF);
											}
										}
									}
								}
								local266++;
							}
						}
					}
					if (local66 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local39, local39, 1.0F);
						OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass192ArrayArray1[local59][local43].method4449(local66, local239.aByteArray62);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IIIIZ)V")
	private void method3218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass192ArrayArray1 == null) {
			return;
		}
		@Pc(21) int local21 = arg0 - 1 >> 7;
		@Pc(29) int local29 = arg2 + arg0 - 2 >> 7;
		@Pc(35) int local35 = arg1 - 1 >> 7;
		@Pc(45) int local45 = arg3 + arg1 - 1 - 1 >> 7;
		for (@Pc(47) int local47 = local21; local47 <= local29; local47++) {
			@Pc(54) Class192[] local54 = this.aClass192ArrayArray1[local47];
			for (@Pc(56) int local56 = local35; local56 <= local45; local56++) {
				local54[local56].aBoolean378 = true;
			}
		}
	}
}
