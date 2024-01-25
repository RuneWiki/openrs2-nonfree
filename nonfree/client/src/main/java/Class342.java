import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tv")
public final class Class342 {

	@OriginalMember(owner = "client!tv", name = "r", descriptor = "[[Lclient!kf;")
	private Class194[][] aClass194ArrayArray1;

	@OriginalMember(owner = "client!tv", name = "k", descriptor = "Lclient!ru;")
	private final Class61_Sub2 aClass61_Sub2_3;

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "Lclient!rs;")
	private final Class133_Sub3 aClass133_Sub3_35;

	@OriginalMember(owner = "client!tv", name = "f", descriptor = "I")
	public final int anInt9354;

	@OriginalMember(owner = "client!tv", name = "s", descriptor = "I")
	private final int anInt9365;

	@OriginalMember(owner = "client!tv", name = "d", descriptor = "[B")
	public final byte[] aByteArray99;

	@OriginalMember(owner = "client!tv", name = "p", descriptor = "I")
	private final int anInt9363;

	@OriginalMember(owner = "client!tv", name = "q", descriptor = "I")
	private final int anInt9364;

	@OriginalMember(owner = "client!tv", name = "n", descriptor = "I")
	private final int anInt9361;

	@OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(Lclient!rs;Lclient!ru;)V")
	public Class342(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) Class61_Sub2 arg1) {
		this.aClass61_Sub2_3 = arg1;
		this.aClass133_Sub3_35 = arg0;
		this.anInt9354 = (this.aClass61_Sub2_3.anInt10026 * this.aClass61_Sub2_3.anInt10027 >> this.aClass133_Sub3_35.anInt8529) + 2;
		this.anInt9365 = (this.aClass61_Sub2_3.anInt10029 * this.aClass61_Sub2_3.anInt10027 >> this.aClass133_Sub3_35.anInt8529) + 2;
		this.aByteArray99 = new byte[this.anInt9365 * this.anInt9354];
		this.anInt9363 = this.aClass133_Sub3_35.anInt8529 + 7 - this.aClass61_Sub2_3.anInt10031;
		this.anInt9364 = this.aClass61_Sub2_3.anInt10026 >> this.anInt9363;
		this.anInt9361 = this.aClass61_Sub2_3.anInt10029 >> this.anInt9363;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIILclient!r;)Z")
	public boolean method8068(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5_Sub5_Sub14 arg2) {
		@Pc(11) Class5_Sub5_Sub14_Sub1 local11 = (Class5_Sub5_Sub14_Sub1) arg2;
		arg0 += local11.anInt6223 + 1;
		arg1 += local11.anInt6232 + 1;
		@Pc(32) int local32 = arg0 * this.anInt9354 + arg1;
		@Pc(35) int local35 = local11.anInt6235;
		@Pc(38) int local38 = local11.anInt6227;
		@Pc(47) int local47;
		if (arg0 <= 0) {
			local47 = 1 - arg0;
			local32 += this.anInt9354 * local47;
			local35 -= local47;
			arg0 = 1;
		}
		@Pc(66) int local66 = this.anInt9354 - local38;
		if (local35 + arg0 >= this.anInt9365) {
			local47 = arg0 + local35 + 1 - this.anInt9365;
			local35 -= local47;
		}
		if (arg1 <= 0) {
			local47 = 1 - arg1;
			local38 -= local47;
			local66 += local47;
			arg1 = 1;
			local32 += local47;
		}
		if (local38 + arg1 >= this.anInt9354) {
			local47 = arg1 + local38 + 1 - this.anInt9354;
			local66 += local47;
			local38 -= local47;
		}
		if (local38 > 0 && local35 > 0) {
			local66 += this.anInt9354 * 7;
			return Static386.method5644(local32, local66, local35, local38, this.aByteArray99);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(B)V")
	public void method8069() {
		this.aClass194ArrayArray1 = new Class194[this.anInt9364][this.anInt9361];
		for (@Pc(20) int local20 = 0; local20 < this.anInt9361; local20++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt9364; local24++) {
				this.aClass194ArrayArray1[local24][local20] = new Class194(this.aClass133_Sub3_35, this, this.aClass61_Sub2_3, local24, local20, this.anInt9363, local24 * 128 + 1, local20 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIIZI)V")
	private void method8070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass194ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg1 - 1 >> 7;
		@Pc(25) int local25 = arg3 + arg1 - 1 - 1 >> 7;
		@Pc(37) int local37 = arg0 - 1 >> 7;
		@Pc(47) int local47 = arg2 + arg0 - 1 - 1 >> 7;
		for (@Pc(49) int local49 = local15; local49 <= local25; local49++) {
			@Pc(56) Class194[] local56 = this.aClass194ArrayArray1[local49];
			for (@Pc(58) int local58 = local37; local58 <= local47; local58++) {
				local56[local58].aBoolean375 = true;
			}
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIZIB[[Z)V")
	public void method8072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean[][] arg4) {
		this.aClass133_Sub3_35.method7359(false);
		this.aClass133_Sub3_35.method7346(false);
		this.aClass133_Sub3_35.method7395(-2);
		this.aClass133_Sub3_35.method7401(1);
		this.aClass133_Sub3_35.method7388(1);
		@Pc(47) float local47 = 1.0F / (float) (this.aClass133_Sub3_35.anInt8531 * 128);
		@Pc(51) int local51;
		@Pc(58) int local58;
		@Pc(65) int local65;
		@Pc(67) int local67;
		@Pc(71) int local71;
		@Pc(76) int local76;
		@Pc(83) int local83;
		if (arg2) {
			for (local51 = 0; local51 < this.anInt9361; local51++) {
				local58 = local51 << this.anInt9363;
				local65 = local51 + 1 << this.anInt9363;
				label81: for (local67 = 0; local67 < this.anInt9364; local67++) {
					local71 = local67 << this.anInt9363;
					local76 = local67 + 1 << this.anInt9363;
					for (local83 = local71; local83 < local76; local83++) {
						if (local83 - arg0 >= -arg1 && local83 - arg0 <= arg1) {
							for (@Pc(334) int local334 = local58; local334 < local65; local334++) {
								if (local334 - arg3 >= -arg1 && local334 - arg3 <= arg1 && arg4[arg1 + local83 - arg0][local334 + arg1 - arg3]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local47, local47, 1.0F);
									OpenGL.glTranslatef((float) -local67 / local47, (float) -local51 / local47, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass194ArrayArray1[local67][local51].method4492();
									continue label81;
								}
							}
						}
					}
				}
			}
		} else {
			for (local51 = 0; local51 < this.anInt9361; local51++) {
				local58 = local51 << this.anInt9363;
				local65 = local51 + 1 << this.anInt9363;
				for (local67 = 0; local67 < this.anInt9364; local67++) {
					local71 = 0;
					local76 = local67 << this.anInt9363;
					local83 = local67 + 1 << this.anInt9363;
					@Pc(87) Class5_Sub22_Sub2 local87 = this.aClass133_Sub3_35.aClass5_Sub22_Sub2_3;
					local87.anInt6629 = 0;
					for (@Pc(92) int local92 = local58; local92 < local65; local92++) {
						if (local92 - arg3 >= -arg1 && local92 - arg3 <= arg1) {
							@Pc(119) int local119 = this.aClass61_Sub2_3.anInt10026 * local92 + local76;
							for (@Pc(121) int local121 = local76; local121 < local83; local121++) {
								if (-arg1 <= local121 - arg0 && local121 - arg0 <= arg1 && arg4[arg1 + local121 - arg0][local92 + arg1 - arg3]) {
									@Pc(167) short[] local167 = this.aClass61_Sub2_3.aShortArrayArray26[local119];
									if (local167 != null) {
										@Pc(175) int local175;
										if (this.aClass133_Sub3_35.aBoolean611) {
											for (local175 = 0; local175 < local167.length; local175++) {
												local87.method5918(local167[local175] & 0xFFFF);
												local71++;
											}
										} else {
											for (local175 = 0; local175 < local167.length; local175++) {
												local87.method5948(local167[local175] & 0xFFFF);
												local71++;
											}
										}
									}
								}
								local119++;
							}
						}
					}
					if (local71 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local47, local47, 1.0F);
						OpenGL.glTranslatef((float) -local67 / local47, (float) -local51 / local47, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass194ArrayArray1[local67][local51].method4489(local87.aByteArray71, local71);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILclient!r;II)V")
	public void method8073(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub5_Sub14 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class5_Sub5_Sub14_Sub1 local6 = (Class5_Sub5_Sub14_Sub1) arg1;
		arg0 += local6.anInt6223 + 1;
		arg2 += local6.anInt6232 + 1;
		@Pc(27) int local27 = this.anInt9354 * arg0 + arg2;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt6235;
		@Pc(39) int local39 = local6.anInt6227;
		@Pc(45) int local45 = this.anInt9354 - local39;
		@Pc(47) int local47 = 0;
		@Pc(57) int local57;
		if (arg0 <= 0) {
			local57 = 1 - arg0;
			local29 = local39 * local57;
			arg0 = 1;
			local27 += local57 * this.anInt9354;
			local32 -= local57;
		}
		if (this.anInt9365 <= arg0 + local32) {
			local57 = arg0 + local32 + 1 - this.anInt9365;
			local32 -= local57;
		}
		if (arg2 <= 0) {
			local57 = 1 - arg2;
			local47 = local57;
			local39 -= local57;
			local27 += local57;
			local29 += local57;
			local45 += local57;
			arg2 = 1;
		}
		if (local39 + arg2 >= this.anInt9354) {
			local57 = local39 + arg2 + 1 - this.anInt9354;
			local39 -= local57;
			local47 += local57;
			local45 += local57;
		}
		if (local39 > 0 && local32 > 0) {
			Static550.method8024(local6.aByteArray62, local47, this.aByteArray99, local32, local27, local39, local29, local45);
			this.method8070(arg0, arg2, local32, local39);
		}
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(ILclient!r;II)V")
	public void method8074(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub5_Sub14 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class5_Sub5_Sub14_Sub1 local6 = (Class5_Sub5_Sub14_Sub1) arg1;
		arg0 += local6.anInt6232 + 1;
		arg2 += local6.anInt6223 + 1;
		@Pc(27) int local27 = this.anInt9354 * arg2 + arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt6235;
		@Pc(35) int local35 = local6.anInt6227;
		@Pc(41) int local41 = this.anInt9354 - local35;
		@Pc(49) int local49;
		if (arg2 <= 0) {
			local49 = 1 - arg2;
			arg2 = 1;
			local32 -= local49;
			local29 = local49 * local35;
			local27 += local49 * this.anInt9354;
		}
		@Pc(70) int local70 = 0;
		if (this.anInt9365 <= local32 + arg2) {
			local49 = local32 + arg2 + 1 - this.anInt9365;
			local32 -= local49;
		}
		if (arg0 <= 0) {
			local49 = 1 - arg0;
			local29 += local49;
			local35 -= local49;
			local41 += local49;
			arg0 = 1;
			local27 += local49;
			local70 = local49;
		}
		if (local35 + arg0 >= this.anInt9354) {
			local49 = local35 + arg0 + 1 - this.anInt9354;
			local35 -= local49;
			local70 += local49;
			local41 += local49;
		}
		if (local35 > 0 && local32 > 0) {
			Static169.method2495(local6.aByteArray62, local35, local29, local70, local27, this.aByteArray99, local32, local41);
			this.method8070(arg2, arg0, local32, local35);
		}
	}
}
