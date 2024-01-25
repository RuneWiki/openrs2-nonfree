import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class206 {

	@OriginalMember(owner = "client!lg", name = "e", descriptor = "[[Lclient!ol;")
	private Class255[][] aClass255ArrayArray1;

	@OriginalMember(owner = "client!lg", name = "j", descriptor = "Lclient!hca;")
	private final Class129_Sub1 aClass129_Sub1_2;

	@OriginalMember(owner = "client!lg", name = "q", descriptor = "Lclient!lj;")
	private final Class78_Sub3 aClass78_Sub3_22;

	@OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
	public final int anInt5315;

	@OriginalMember(owner = "client!lg", name = "r", descriptor = "I")
	private final int anInt5320;

	@OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
	private final int anInt5314;

	@OriginalMember(owner = "client!lg", name = "s", descriptor = "[B")
	public final byte[] aByteArray42;

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
	private final int anInt5310;

	@OriginalMember(owner = "client!lg", name = "v", descriptor = "I")
	private final int anInt5321;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lclient!lj;Lclient!hca;)V")
	public Class206(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) Class129_Sub1 arg1) {
		this.aClass129_Sub1_2 = arg1;
		this.aClass78_Sub3_22 = arg0;
		this.anInt5315 = (this.aClass129_Sub1_2.anInt8065 * this.aClass129_Sub1_2.anInt8060 >> this.aClass78_Sub3_22.anInt5557) + 2;
		this.anInt5320 = (this.aClass129_Sub1_2.anInt8058 * this.aClass129_Sub1_2.anInt8060 >> this.aClass78_Sub3_22.anInt5557) + 2;
		this.anInt5314 = this.aClass78_Sub3_22.anInt5557 + 7 - this.aClass129_Sub1_2.anInt8066;
		this.aByteArray42 = new byte[this.anInt5315 * this.anInt5320];
		this.anInt5310 = this.aClass129_Sub1_2.anInt8065 >> this.anInt5314;
		this.anInt5321 = this.aClass129_Sub1_2.anInt8058 >> this.anInt5314;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZIIII)V")
	private void method4375(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass255ArrayArray1 == null) {
			return;
		}
		@Pc(20) int local20 = arg1 - 1 >> 7;
		@Pc(30) int local30 = arg1 + arg3 - 1 - 1 >> 7;
		@Pc(36) int local36 = arg0 - 1 >> 7;
		@Pc(44) int local44 = arg2 + arg0 - 2 >> 7;
		for (@Pc(46) int local46 = local20; local46 <= local30; local46++) {
			@Pc(53) Class255[] local53 = this.aClass255ArrayArray1[local46];
			for (@Pc(55) int local55 = local36; local55 <= local44; local55++) {
				local53[local55].aBoolean522 = true;
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILclient!ha;BI)V")
	public void method4377(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub8_Sub4 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class1_Sub8_Sub4_Sub1 local6 = (Class1_Sub8_Sub4_Sub1) arg1;
		arg0 += local6.anInt2970 + 1;
		arg2 += local6.anInt2973 + 1;
		@Pc(27) int local27 = arg0 * this.anInt5315 + arg2;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36 = local6.anInt2967;
		@Pc(39) int local39 = local6.anInt2971;
		@Pc(44) int local44 = this.anInt5315 - local39;
		@Pc(46) int local46 = 0;
		@Pc(53) int local53;
		if (arg0 <= 0) {
			local53 = 1 - arg0;
			local29 = local53 * local39;
			local36 -= local53;
			local27 += this.anInt5315 * local53;
			arg0 = 1;
		}
		if (this.anInt5320 <= local36 + arg0) {
			local53 = arg0 + local36 + 1 - this.anInt5320;
			local36 -= local53;
		}
		if (arg2 <= 0) {
			local53 = 1 - arg2;
			arg2 = 1;
			local44 += local53;
			local39 -= local53;
			local46 = local53;
			local29 += local53;
			local27 += local53;
		}
		if (this.anInt5315 <= local39 + arg2) {
			local53 = arg2 + local39 + 1 - this.anInt5315;
			local39 -= local53;
			local46 += local53;
			local44 += local53;
		}
		if (local39 > 0 && local36 > 0) {
			Static316.method4691(local39, local6.aByteArray16, this.aByteArray42, local27, local46, local36, local29, local44);
			this.method4375(arg0, arg2, local36, local39);
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIZIB[[Z)V")
	public void method4378(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean[][] arg4) {
		this.aClass78_Sub3_22.method4524(false);
		this.aClass78_Sub3_22.method4542(false);
		this.aClass78_Sub3_22.method4567(-2);
		this.aClass78_Sub3_22.method4534(1);
		this.aClass78_Sub3_22.method4566(1);
		@Pc(55) float local55 = 1.0F / (float) (this.aClass78_Sub3_22.anInt5558 * 128);
		@Pc(59) int local59;
		@Pc(66) int local66;
		@Pc(73) int local73;
		@Pc(75) int local75;
		@Pc(82) int local82;
		@Pc(89) int local89;
		@Pc(91) int local91;
		if (arg2) {
			for (local59 = 0; local59 < this.anInt5321; local59++) {
				local66 = local59 << this.anInt5314;
				local73 = local59 + 1 << this.anInt5314;
				label128: for (local75 = 0; local75 < this.anInt5310; local75++) {
					local82 = local75 << this.anInt5314;
					local89 = local75 + 1 << this.anInt5314;
					for (local91 = local82; local91 < local89; local91++) {
						if (-arg3 <= local91 - arg0 && arg3 >= local91 - arg0) {
							for (@Pc(116) int local116 = local66; local116 < local73; local116++) {
								if (local116 - arg1 >= -arg3 && arg3 >= local116 - arg1 && arg4[local91 + arg3 - arg0][arg3 + local116 - arg1]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local55, local55, 1.0F);
									OpenGL.glTranslatef((float) -local75 / local55, (float) -local59 / local55, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass255ArrayArray1[local75][local59].method5465();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local59 = 0; local59 < this.anInt5321; local59++) {
				local66 = local59 << this.anInt5314;
				local73 = local59 + 1 << this.anInt5314;
				for (local75 = 0; local75 < this.anInt5310; local75++) {
					local82 = 0;
					local89 = local75 << this.anInt5314;
					local91 = local75 + 1 << this.anInt5314;
					@Pc(240) Class1_Sub3_Sub2 local240 = this.aClass78_Sub3_22.aClass1_Sub3_Sub2_1;
					local240.anInt9802 = 0;
					for (@Pc(245) int local245 = local66; local245 < local73; local245++) {
						if (local245 - arg1 >= -arg3 && arg3 >= local245 - arg1) {
							@Pc(275) int local275 = local89 + local245 * this.aClass129_Sub1_2.anInt8065;
							for (@Pc(277) int local277 = local89; local277 < local91; local277++) {
								if (local277 - arg0 >= -arg3 && local277 - arg0 <= arg3 && arg4[local277 + arg3 - arg0][arg3 + local245 - arg1]) {
									@Pc(313) short[] local313 = this.aClass129_Sub1_2.aShortArrayArray2[local275];
									if (local313 != null) {
										@Pc(321) int local321;
										if (this.aClass78_Sub3_22.aBoolean425) {
											for (local321 = 0; local321 < local313.length; local321++) {
												local82++;
												local240.method7937(local313[local321] & 0xFFFF);
											}
										} else {
											for (local321 = 0; local321 < local313.length; local321++) {
												local82++;
												local240.method7948(local313[local321] & 0xFFFF);
											}
										}
									}
								}
								local275++;
							}
						}
					}
					if (local82 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local55, local55, 1.0F);
						OpenGL.glTranslatef((float) -local75 / local55, (float) -local59 / local55, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass255ArrayArray1[local75][local59].method5463(local240.aByteArray104, local82);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V")
	public void method4379() {
		this.aClass255ArrayArray1 = new Class255[this.anInt5310][this.anInt5321];
		for (@Pc(21) int local21 = 0; local21 < this.anInt5321; local21++) {
			for (@Pc(25) int local25 = 0; local25 < this.anInt5310; local25++) {
				this.aClass255ArrayArray1[local25][local21] = new Class255(this.aClass78_Sub3_22, this, this.aClass129_Sub1_2, local25, local21, this.anInt5314, local25 * 128 + 1, local21 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!ha;III)Z")
	public boolean method4382(@OriginalArg(0) Class1_Sub8_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class1_Sub8_Sub4_Sub1 local6 = (Class1_Sub8_Sub4_Sub1) arg0;
		arg2 += local6.anInt2970 + 1;
		arg1 += local6.anInt2973 + 1;
		@Pc(28) int local28 = arg1 + arg2 * this.anInt5315;
		@Pc(37) int local37 = local6.anInt2967;
		@Pc(40) int local40 = local6.anInt2971;
		@Pc(49) int local49;
		if (arg2 <= 0) {
			local49 = 1 - arg2;
			arg2 = 1;
			local37 -= local49;
			local28 += this.anInt5315 * local49;
		}
		@Pc(68) int local68 = this.anInt5315 - local40;
		if (this.anInt5320 <= arg2 + local37) {
			local49 = arg2 + local37 + 1 - this.anInt5320;
			local37 -= local49;
		}
		if (arg1 <= 0) {
			local49 = 1 - arg1;
			local40 -= local49;
			arg1 = 1;
			local68 += local49;
			local28 += local49;
		}
		if (arg1 + local40 >= this.anInt5315) {
			local49 = arg1 + local40 + 1 - this.anInt5315;
			local68 += local49;
			local40 -= local49;
		}
		if (local40 > 0 && local37 > 0) {
			local68 += this.anInt5315 * 7;
			return Static379.method5468(this.aByteArray42, local68, local37, local40, local28);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IILclient!ha;I)V")
	public void method4383(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub8_Sub4 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class1_Sub8_Sub4_Sub1 local6 = (Class1_Sub8_Sub4_Sub1) arg1;
		arg0 += local6.anInt2970 + 1;
		arg2 += local6.anInt2973 + 1;
		@Pc(27) int local27 = arg2 + arg0 * this.anInt5315;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt2967;
		@Pc(35) int local35 = local6.anInt2971;
		@Pc(49) int local49 = this.anInt5315 - local35;
		@Pc(56) int local56;
		if (arg0 <= 0) {
			local56 = 1 - arg0;
			local27 += local56 * this.anInt5315;
			local32 -= local56;
			arg0 = 1;
			local29 = local35 * local56;
		}
		@Pc(77) int local77 = 0;
		if (arg0 + local32 >= this.anInt5320) {
			local56 = arg0 + local32 + 1 - this.anInt5320;
			local32 -= local56;
		}
		if (arg2 <= 0) {
			local56 = 1 - arg2;
			local35 -= local56;
			arg2 = 1;
			local77 = local56;
			local27 += local56;
			local29 += local56;
			local49 += local56;
		}
		if (this.anInt5315 <= local35 + arg2) {
			local56 = arg2 + local35 + 1 - this.anInt5315;
			local35 -= local56;
			local49 += local56;
			local77 += local56;
		}
		if (local35 > 0 && local32 > 0) {
			Static155.method2550(local27, this.aByteArray42, local77, local29, local35, local49, local32, local6.aByteArray16);
			this.method4375(arg0, arg2, local32, local35);
		}
	}
}
