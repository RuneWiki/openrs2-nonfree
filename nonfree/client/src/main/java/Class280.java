import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class280 {

	@OriginalMember(owner = "client!pk", name = "i", descriptor = "[[Lclient!kd;")
	private Class204[][] aClass204ArrayArray1;

	@OriginalMember(owner = "client!pk", name = "g", descriptor = "Lclient!hk;")
	private final Class16_Sub2 aClass16_Sub2_35;

	@OriginalMember(owner = "client!pk", name = "l", descriptor = "Lclient!vca;")
	private final Class104_Sub3 aClass104_Sub3_3;

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
	public final int anInt7923;

	@OriginalMember(owner = "client!pk", name = "q", descriptor = "I")
	private final int anInt7934;

	@OriginalMember(owner = "client!pk", name = "k", descriptor = "I")
	private final int anInt7930;

	@OriginalMember(owner = "client!pk", name = "m", descriptor = "[B")
	public final byte[] aByteArray74;

	@OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
	private final int anInt7927;

	@OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
	private final int anInt7929;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lclient!hk;Lclient!vca;)V")
	public Class280(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) Class104_Sub3 arg1) {
		this.aClass16_Sub2_35 = arg0;
		this.aClass104_Sub3_3 = arg1;
		this.anInt7923 = (this.aClass104_Sub3_3.anInt9716 * this.aClass104_Sub3_3.anInt9718 >> this.aClass16_Sub2_35.anInt4364) + 2;
		this.anInt7934 = (this.aClass104_Sub3_3.anInt9715 * this.aClass104_Sub3_3.anInt9716 >> this.aClass16_Sub2_35.anInt4364) + 2;
		this.anInt7930 = this.aClass16_Sub2_35.anInt4364 + 7 - this.aClass104_Sub3_3.anInt9717;
		this.aByteArray74 = new byte[this.anInt7934 * this.anInt7923];
		this.anInt7927 = this.aClass104_Sub3_3.anInt9718 >> this.anInt7930;
		this.anInt7929 = this.aClass104_Sub3_3.anInt9715 >> this.anInt7930;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "([[ZIIZII)V")
	public void method6641(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aClass16_Sub2_35.method3637(false);
		this.aClass16_Sub2_35.method3617(false);
		this.aClass16_Sub2_35.method3687(-2);
		this.aClass16_Sub2_35.method3680(1);
		this.aClass16_Sub2_35.method3654(1);
		@Pc(47) float local47 = 1.0F / (float) (this.aClass16_Sub2_35.anInt4363 * 128);
		@Pc(51) int local51;
		@Pc(58) int local58;
		@Pc(65) int local65;
		@Pc(67) int local67;
		@Pc(71) int local71;
		@Pc(76) int local76;
		@Pc(83) int local83;
		if (arg2) {
			for (local51 = 0; local51 < this.anInt7929; local51++) {
				local58 = local51 << this.anInt7930;
				local65 = local51 + 1 << this.anInt7930;
				label81: for (local67 = 0; local67 < this.anInt7927; local67++) {
					local71 = local67 << this.anInt7930;
					local76 = local67 + 1 << this.anInt7930;
					for (local83 = local71; local83 < local76; local83++) {
						if (local83 - arg1 >= -arg3 && arg3 >= local83 - arg1) {
							for (@Pc(335) int local335 = local58; local335 < local65; local335++) {
								if (local335 - arg4 >= -arg3 && arg3 >= local335 - arg4 && arg0[local83 + arg3 - arg1][arg3 + local335 - arg4]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local47, local47, 1.0F);
									OpenGL.glTranslatef((float) -local67 / local47, (float) -local51 / local47, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass204ArrayArray1[local67][local51].method4637();
									continue label81;
								}
							}
						}
					}
				}
			}
		} else {
			for (local51 = 0; local51 < this.anInt7929; local51++) {
				local58 = local51 << this.anInt7930;
				local65 = local51 + 1 << this.anInt7930;
				for (local67 = 0; local67 < this.anInt7927; local67++) {
					local71 = 0;
					local76 = local67 << this.anInt7930;
					local83 = local67 + 1 << this.anInt7930;
					@Pc(87) Class3_Sub17_Sub1 local87 = this.aClass16_Sub2_35.aClass3_Sub17_Sub1_1;
					local87.lb = 0;
					for (@Pc(92) int local92 = local58; local92 < local65; local92++) {
						if (-arg3 <= local92 - arg4 && arg3 >= local92 - arg4) {
							@Pc(123) int local123 = local76 + local92 * this.aClass104_Sub3_3.anInt9718;
							for (@Pc(125) int local125 = local76; local125 < local83; local125++) {
								if (-arg3 <= local125 - arg1 && local125 - arg1 <= arg3 && arg0[arg3 + local125 - arg1][arg3 + local92 - arg4]) {
									@Pc(162) short[] local162 = this.aClass104_Sub3_3.aShortArrayArray22[local123];
									if (local162 != null) {
										@Pc(170) int local170;
										if (this.aClass16_Sub2_35.aBoolean322) {
											for (local170 = 0; local170 < local162.length; local170++) {
												local71++;
												local87.method4876(local162[local170] & 0xFFFF);
											}
										} else {
											for (local170 = 0; local170 < local162.length; local170++) {
												local71++;
												local87.method4843(local162[local170] & 0xFFFF);
											}
										}
									}
								}
								local123++;
							}
						}
					}
					if (local71 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local47, local47, 1.0F);
						OpenGL.glTranslatef((float) -local67 / local47, (float) -local51 / local47, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass204ArrayArray1[local67][local51].method4640(local87.aByteArray59, local71);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIII)V")
	private void method6643(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass204ArrayArray1 == null) {
			return;
		}
		@Pc(20) int local20 = arg0 - 1 >> 7;
		@Pc(30) int local30 = arg3 + arg0 - 1 - 1 >> 7;
		@Pc(36) int local36 = arg2 - 1 >> 7;
		@Pc(46) int local46 = arg1 + arg2 - 1 - 1 >> 7;
		for (@Pc(48) int local48 = local20; local48 <= local30; local48++) {
			@Pc(55) Class204[] local55 = this.aClass204ArrayArray1[local48];
			for (@Pc(57) int local57 = local36; local57 <= local46; local57++) {
				local55[local57].aBoolean424 = true;
			}
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIILclient!r;)V")
	public void method6645(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub6_Sub12 arg2) {
		@Pc(6) Class3_Sub6_Sub12_Sub2 local6 = (Class3_Sub6_Sub12_Sub2) arg2;
		arg1 += local6.anInt9800 + 1;
		arg0 += local6.anInt9798 + 1;
		@Pc(27) int local27 = this.anInt7923 * arg0 + arg1;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36 = local6.anInt9803;
		@Pc(39) int local39 = local6.anInt9802;
		@Pc(45) int local45 = this.anInt7923 - local39;
		@Pc(52) int local52;
		if (arg0 <= 0) {
			local52 = 1 - arg0;
			local29 = local52 * local39;
			local36 -= local52;
			arg0 = 1;
			local27 += this.anInt7923 * local52;
		}
		@Pc(73) int local73 = 0;
		if (this.anInt7934 <= arg0 + local36) {
			local52 = arg0 + local36 + 1 - this.anInt7934;
			local36 -= local52;
		}
		if (arg1 <= 0) {
			local52 = 1 - arg1;
			local29 += local52;
			arg1 = 1;
			local27 += local52;
			local45 += local52;
			local39 -= local52;
			local73 = local52;
		}
		if (arg1 + local39 >= this.anInt7923) {
			local52 = arg1 + local39 + 1 - this.anInt7923;
			local73 += local52;
			local39 -= local52;
			local45 += local52;
		}
		if (local39 > 0 && local36 > 0) {
			Static351.method5272(local36, local73, local6.aByteArray107, local29, local39, local27, local45, this.aByteArray74);
			this.method6643(arg1, local36, arg0, local39);
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IILclient!r;I)V")
	public void method6646(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub6_Sub12 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub6_Sub12_Sub2 local6 = (Class3_Sub6_Sub12_Sub2) arg1;
		arg2 += local6.anInt9800 + 1;
		arg0 += local6.anInt9798 + 1;
		@Pc(27) int local27 = arg0 * this.anInt7923 + arg2;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt9803;
		@Pc(35) int local35 = local6.anInt9802;
		@Pc(40) int local40 = this.anInt7923 - local35;
		@Pc(42) int local42 = 0;
		@Pc(52) int local52;
		if (arg0 <= 0) {
			local52 = 1 - arg0;
			arg0 = 1;
			local27 += this.anInt7923 * local52;
			local29 = local52 * local35;
			local32 -= local52;
		}
		if (local32 + arg0 >= this.anInt7934) {
			local52 = local32 + arg0 + 1 - this.anInt7934;
			local32 -= local52;
		}
		if (arg2 <= 0) {
			local52 = 1 - arg2;
			arg2 = 1;
			local29 += local52;
			local27 += local52;
			local40 += local52;
			local35 -= local52;
			local42 = local52;
		}
		if (local35 + arg2 >= this.anInt7923) {
			local52 = local35 + arg2 + 1 - this.anInt7923;
			local40 += local52;
			local42 += local52;
			local35 -= local52;
		}
		if (local35 > 0 && local32 > 0) {
			Static48.method1276(local27, local42, local35, this.aByteArray74, local40, local29, local6.aByteArray107, local32);
			this.method6643(arg2, local32, arg0, local35);
		}
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)V")
	public void method6647() {
		this.aClass204ArrayArray1 = new Class204[this.anInt7927][this.anInt7929];
		for (@Pc(18) int local18 = 0; local18 < this.anInt7929; local18++) {
			for (@Pc(22) int local22 = 0; local22 < this.anInt7927; local22++) {
				this.aClass204ArrayArray1[local22][local18] = new Class204(this.aClass16_Sub2_35, this, this.aClass104_Sub3_3, local22, local18, this.anInt7930, local22 * 128 + 1, local18 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(IIILclient!r;)Z")
	public boolean method6648(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub6_Sub12 arg2) {
		@Pc(6) Class3_Sub6_Sub12_Sub2 local6 = (Class3_Sub6_Sub12_Sub2) arg2;
		arg0 += local6.anInt9800 + 1;
		arg1 += local6.anInt9798 + 1;
		@Pc(27) int local27 = arg1 * this.anInt7923 + arg0;
		@Pc(30) int local30 = local6.anInt9803;
		@Pc(33) int local33 = local6.anInt9802;
		@Pc(43) int local43;
		if (arg1 <= 0) {
			local43 = 1 - arg1;
			local27 += local43 * this.anInt7923;
			arg1 = 1;
			local30 -= local43;
		}
		@Pc(62) int local62 = this.anInt7923 - local33;
		if (local30 + arg1 >= this.anInt7934) {
			local43 = arg1 + local30 + 1 - this.anInt7934;
			local30 -= local43;
		}
		if (arg0 <= 0) {
			local43 = 1 - arg0;
			local27 += local43;
			arg0 = 1;
			local62 += local43;
			local33 -= local43;
		}
		if (local33 + arg0 >= this.anInt7923) {
			local43 = arg0 + local33 + 1 - this.anInt7923;
			local62 += local43;
			local33 -= local43;
		}
		if (local33 > 0 && local30 > 0) {
			local62 += this.anInt7923 * 7;
			return Static205.method3262(local30, local33, local27, local62, this.aByteArray74);
		} else {
			return false;
		}
	}
}
