import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class206 {

	@OriginalMember(owner = "client!mi", name = "m", descriptor = "[[Lclient!lba;")
	private Class182[][] aClass182ArrayArray1;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "Lclient!er;")
	private final Class31_Sub2 aClass31_Sub2_29;

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "Lclient!tv;")
	private final Class127_Sub2 aClass127_Sub2_1;

	@OriginalMember(owner = "client!mi", name = "p", descriptor = "I")
	public final int anInt6043;

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
	private final int anInt6036;

	@OriginalMember(owner = "client!mi", name = "k", descriptor = "[B")
	public final byte[] aByteArray154;

	@OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
	private final int anInt6039;

	@OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
	private final int anInt6038;

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
	private final int anInt6032;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Lclient!er;Lclient!tv;)V")
	public Class206(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) Class127_Sub2 arg1) {
		this.aClass31_Sub2_29 = arg0;
		this.aClass127_Sub2_1 = arg1;
		this.anInt6043 = (this.aClass127_Sub2_1.anInt10009 * this.aClass127_Sub2_1.anInt10004 >> this.aClass31_Sub2_29.anInt3133) + 2;
		this.anInt6036 = (this.aClass127_Sub2_1.anInt10007 * this.aClass127_Sub2_1.anInt10009 >> this.aClass31_Sub2_29.anInt3133) + 2;
		this.aByteArray154 = new byte[this.anInt6043 * this.anInt6036];
		this.anInt6039 = this.aClass31_Sub2_29.anInt3133 + 7 - this.aClass127_Sub2_1.anInt10008;
		this.anInt6038 = this.aClass127_Sub2_1.anInt10004 >> this.anInt6039;
		this.anInt6032 = this.aClass127_Sub2_1.anInt10007 >> this.anInt6039;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIII)V")
	private void method4891(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass182ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg2 - 1 >> 7;
		@Pc(25) int local25 = arg1 + arg2 - 1 - 1 >> 7;
		@Pc(31) int local31 = arg3 - 1 >> 7;
		@Pc(41) int local41 = arg0 + arg3 - 1 - 1 >> 7;
		for (@Pc(52) int local52 = local15; local52 <= local25; local52++) {
			@Pc(59) Class182[] local59 = this.aClass182ArrayArray1[local52];
			for (@Pc(61) int local61 = local31; local61 <= local41; local61++) {
				local59[local61].aBoolean382 = true;
			}
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZIILclient!ha;)V")
	public void method4892(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub7_Sub3 arg2) {
		@Pc(6) Class3_Sub7_Sub3_Sub1 local6 = (Class3_Sub7_Sub3_Sub1) arg2;
		arg0 += local6.anInt1587 + 1;
		arg1 += local6.anInt1589 + 1;
		@Pc(31) int local31 = arg1 + this.anInt6043 * arg0;
		@Pc(33) int local33 = 0;
		@Pc(36) int local36 = local6.anInt1592;
		@Pc(39) int local39 = local6.anInt1594;
		@Pc(45) int local45 = this.anInt6043 - local39;
		@Pc(47) int local47 = 0;
		@Pc(53) int local53;
		if (arg0 <= 0) {
			local53 = 1 - arg0;
			local36 -= local53;
			arg0 = 1;
			local33 = local39 * local53;
			local31 += this.anInt6043 * local53;
		}
		if (this.anInt6036 <= local36 + arg0) {
			local53 = local36 + arg0 + 1 - this.anInt6036;
			local36 -= local53;
		}
		if (arg1 <= 0) {
			local53 = 1 - arg1;
			local45 += local53;
			arg1 = 1;
			local31 += local53;
			local33 += local53;
			local47 = local53;
			local39 -= local53;
		}
		if (arg1 + local39 >= this.anInt6043) {
			local53 = arg1 + local39 + 1 - this.anInt6043;
			local39 -= local53;
			local45 += local53;
			local47 += local53;
		}
		if (local39 > 0 && local36 > 0) {
			Static457.method6286(local33, local31, local39, local45, local6.aByteArray19, this.aByteArray154, local36, local47);
			this.method4891(local36, local39, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
	public void method4893() {
		this.aClass182ArrayArray1 = new Class182[this.anInt6038][this.anInt6032];
		for (@Pc(14) int local14 = 0; local14 < this.anInt6032; local14++) {
			for (@Pc(20) int local20 = 0; local20 < this.anInt6038; local20++) {
				this.aClass182ArrayArray1[local20][local14] = new Class182(this.aClass31_Sub2_29, this, this.aClass127_Sub2_1, local20, local14, this.anInt6039, local20 * 128 + 1, local14 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IZIB[[ZI)V")
	public void method4894(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean[][] arg3, @OriginalArg(5) int arg4) {
		this.aClass31_Sub2_29.method2545(false);
		this.aClass31_Sub2_29.method2556(false);
		this.aClass31_Sub2_29.method2566(-2);
		this.aClass31_Sub2_29.method2495(1);
		this.aClass31_Sub2_29.method2568(1);
		@Pc(47) float local47 = 1.0F / (float) (this.aClass31_Sub2_29.anInt3132 * 128);
		@Pc(51) int local51;
		@Pc(58) int local58;
		@Pc(65) int local65;
		@Pc(67) int local67;
		@Pc(71) int local71;
		@Pc(76) int local76;
		@Pc(83) int local83;
		if (arg1) {
			for (local51 = 0; local51 < this.anInt6032; local51++) {
				local58 = local51 << this.anInt6039;
				local65 = local51 + 1 << this.anInt6039;
				label81: for (local67 = 0; local67 < this.anInt6038; local67++) {
					local71 = local67 << this.anInt6039;
					local76 = local67 + 1 << this.anInt6039;
					for (local83 = local71; local83 < local76; local83++) {
						if (local83 - arg0 >= -arg4 && local83 - arg0 <= arg4) {
							for (@Pc(326) int local326 = local58; local326 < local65; local326++) {
								if (local326 - arg2 >= -arg4 && arg4 >= local326 - arg2 && arg3[local83 + arg4 - arg0][arg4 + local326 - arg2]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local47, local47, 1.0F);
									OpenGL.glTranslatef((float) -local67 / local47, (float) -local51 / local47, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass182ArrayArray1[local67][local51].method4552();
									continue label81;
								}
							}
						}
					}
				}
			}
		} else {
			for (local51 = 0; local51 < this.anInt6032; local51++) {
				local58 = local51 << this.anInt6039;
				local65 = local51 + 1 << this.anInt6039;
				for (local67 = 0; local67 < this.anInt6038; local67++) {
					local71 = 0;
					local76 = local67 << this.anInt6039;
					local83 = local67 + 1 << this.anInt6039;
					@Pc(87) Class3_Sub26_Sub2 local87 = this.aClass31_Sub2_29.aClass3_Sub26_Sub2_2;
					local87.anInt8703 = 0;
					for (@Pc(92) int local92 = local58; local92 < local65; local92++) {
						if (local92 - arg2 >= -arg4 && arg4 >= local92 - arg2) {
							@Pc(115) int local115 = local76 + local92 * this.aClass127_Sub2_1.anInt10004;
							for (@Pc(117) int local117 = local76; local117 < local83; local117++) {
								if (local117 - arg0 >= -arg4 && arg4 >= local117 - arg0 && arg3[local117 + arg4 - arg0][arg4 + local92 - arg2]) {
									@Pc(155) short[] local155 = this.aClass127_Sub2_1.aShortArrayArray8[local115];
									if (local155 != null) {
										@Pc(163) int local163;
										if (this.aClass31_Sub2_29.aBoolean216) {
											for (local163 = 0; local163 < local155.length; local163++) {
												local87.method6769(local155[local163] & 0xFFFF);
												local71++;
											}
										} else {
											for (local163 = 0; local163 < local155.length; local163++) {
												local71++;
												local87.method6793(local155[local163] & 0xFFFF);
											}
										}
									}
								}
								local115++;
							}
						}
					}
					if (local71 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local47, local47, 1.0F);
						OpenGL.glTranslatef((float) -local67 / local47, (float) -local51 / local47, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass182ArrayArray1[local67][local51].method4555(local71, local87.aByteArray213);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!ha;IBI)V")
	public void method4895(@OriginalArg(0) Class3_Sub7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub7_Sub3_Sub1 local6 = (Class3_Sub7_Sub3_Sub1) arg0;
		arg2 += local6.anInt1589 + 1;
		arg1 += local6.anInt1587 + 1;
		@Pc(33) int local33 = this.anInt6043 * arg1 + arg2;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = local6.anInt1592;
		@Pc(41) int local41 = local6.anInt1594;
		@Pc(46) int local46 = this.anInt6043 - local41;
		@Pc(52) int local52;
		if (arg1 <= 0) {
			local52 = 1 - arg1;
			local38 -= local52;
			local33 += this.anInt6043 * local52;
			local35 = local41 * local52;
			arg1 = 1;
		}
		@Pc(73) int local73 = 0;
		if (this.anInt6036 <= arg1 + local38) {
			local52 = arg1 + local38 + 1 - this.anInt6036;
			local38 -= local52;
		}
		if (arg2 <= 0) {
			local52 = 1 - arg2;
			local41 -= local52;
			local33 += local52;
			local46 += local52;
			local35 += local52;
			local73 = local52;
			arg2 = 1;
		}
		if (local41 + arg2 >= this.anInt6043) {
			local52 = arg2 + local41 + 1 - this.anInt6043;
			local46 += local52;
			local73 += local52;
			local41 -= local52;
		}
		if (local41 > 0 && local38 > 0) {
			Static409.method1338(local6.aByteArray19, local38, local35, local73, local46, local41, this.aByteArray154, local33);
			this.method4891(local38, local41, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IILclient!ha;I)Z")
	public boolean method4896(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub7_Sub3 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub7_Sub3_Sub1 local6 = (Class3_Sub7_Sub3_Sub1) arg1;
		arg2 += local6.anInt1589 + 1;
		arg0 += local6.anInt1587 + 1;
		@Pc(27) int local27 = this.anInt6043 * arg0 + arg2;
		@Pc(30) int local30 = local6.anInt1592;
		@Pc(33) int local33 = local6.anInt1594;
		@Pc(40) int local40;
		if (arg0 <= 0) {
			local40 = 1 - arg0;
			local30 -= local40;
			arg0 = 1;
			local27 += this.anInt6043 * local40;
		}
		@Pc(58) int local58 = this.anInt6043 - local33;
		if (this.anInt6036 <= local30 + arg0) {
			local40 = arg0 + local30 + 1 - this.anInt6036;
			local30 -= local40;
		}
		if (arg2 <= 0) {
			local40 = 1 - arg2;
			local27 += local40;
			arg2 = 1;
			local58 += local40;
			local33 -= local40;
		}
		if (arg2 + local33 >= this.anInt6043) {
			local40 = local33 + arg2 + 1 - this.anInt6043;
			local33 -= local40;
			local58 += local40;
		}
		if (local33 > 0 && local30 > 0) {
			local58 += this.anInt6043 * 7;
			return Static361.method5138(this.aByteArray154, local58, local30, local27, local33);
		} else {
			return false;
		}
	}
}
