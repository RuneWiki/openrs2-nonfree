import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mr")
public final class Class202 {

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "[[Lclient!ka;")
	private Class168[][] aClass168ArrayArray1;

	@OriginalMember(owner = "client!mr", name = "C", descriptor = "Lclient!jj;")
	private final Class62_Sub3 aClass62_Sub3_23;

	@OriginalMember(owner = "client!mr", name = "f", descriptor = "Lclient!vh;")
	private final Class131_Sub3 aClass131_Sub3_3;

	@OriginalMember(owner = "client!mr", name = "u", descriptor = "I")
	public final int anInt6123;

	@OriginalMember(owner = "client!mr", name = "l", descriptor = "I")
	private final int anInt6118;

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "[B")
	public final byte[] aByteArray82;

	@OriginalMember(owner = "client!mr", name = "h", descriptor = "I")
	private final int anInt6115;

	@OriginalMember(owner = "client!mr", name = "n", descriptor = "I")
	private final int anInt6120;

	@OriginalMember(owner = "client!mr", name = "e", descriptor = "I")
	private final int anInt6114;

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lclient!jj;Lclient!vh;)V")
	public Class202(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) Class131_Sub3 arg1) {
		this.aClass62_Sub3_23 = arg0;
		this.aClass131_Sub3_3 = arg1;
		this.anInt6123 = (this.aClass131_Sub3_3.anInt8874 * this.aClass131_Sub3_3.anInt8873 >> this.aClass62_Sub3_23.anInt4622) + 2;
		this.anInt6118 = (this.aClass131_Sub3_3.anInt8874 * this.aClass131_Sub3_3.anInt8871 >> this.aClass62_Sub3_23.anInt4622) + 2;
		this.aByteArray82 = new byte[this.anInt6123 * this.anInt6118];
		this.anInt6115 = this.aClass62_Sub3_23.anInt4622 + 7 - this.aClass131_Sub3_3.anInt8869;
		this.anInt6120 = this.aClass131_Sub3_3.anInt8873 >> this.anInt6115;
		this.anInt6114 = this.aClass131_Sub3_3.anInt8871 >> this.anInt6115;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)V")
	public void method5081() {
		this.aClass168ArrayArray1 = new Class168[this.anInt6120][this.anInt6114];
		for (@Pc(14) int local14 = 0; local14 < this.anInt6114; local14++) {
			for (@Pc(23) int local23 = 0; local23 < this.anInt6120; local23++) {
				this.aClass168ArrayArray1[local23][local14] = new Class168(this.aClass62_Sub3_23, this, this.aClass131_Sub3_3, local23, local14, this.anInt6115, local23 * 128 + 1, local14 * 128 - -1);
			}
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIIII)V")
	private void method5083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass168ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg1 - 1 >> 7;
		@Pc(25) int local25 = arg1 + arg3 - 1 - 1 >> 7;
		@Pc(31) int local31 = arg0 - 1 >> 7;
		@Pc(39) int local39 = arg0 + arg2 - 2 >> 7;
		for (@Pc(51) int local51 = local15; local51 <= local25; local51++) {
			@Pc(58) Class168[] local58 = this.aClass168ArrayArray1[local51];
			for (@Pc(60) int local60 = local31; local60 <= local39; local60++) {
				local58[local60].aBoolean347 = true;
			}
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(ZI[[ZIII)V")
	public void method5084(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aClass62_Sub3_23.method3970(false);
		this.aClass62_Sub3_23.method3989(false);
		this.aClass62_Sub3_23.method3933(-2);
		this.aClass62_Sub3_23.method3999(1);
		this.aClass62_Sub3_23.method3979(1);
		@Pc(39) float local39 = 1.0F / (float) (this.aClass62_Sub3_23.anInt4624 * 128);
		@Pc(47) int local47;
		@Pc(54) int local54;
		@Pc(61) int local61;
		@Pc(63) int local63;
		@Pc(70) int local70;
		@Pc(77) int local77;
		@Pc(79) int local79;
		if (arg0) {
			for (local47 = 0; local47 < this.anInt6114; local47++) {
				local54 = local47 << this.anInt6115;
				local61 = local47 + 1 << this.anInt6115;
				label128: for (local63 = 0; local63 < this.anInt6120; local63++) {
					local70 = local63 << this.anInt6115;
					local77 = local63 + 1 << this.anInt6115;
					for (local79 = local70; local79 < local77; local79++) {
						if (local79 - arg2 >= -arg4 && local79 - arg2 <= arg4) {
							for (@Pc(100) int local100 = local54; local100 < local61; local100++) {
								if (-arg4 <= local100 - arg3 && arg4 >= local100 - arg3 && arg1[arg4 + local79 - arg2][local100 + arg4 - arg3]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local39, local39, 1.0F);
									OpenGL.glTranslatef((float) -local63 / local39, (float) -local47 / local39, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass168ArrayArray1[local63][local47].method4244();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local47 = 0; local47 < this.anInt6114; local47++) {
				local54 = local47 << this.anInt6115;
				local61 = local47 + 1 << this.anInt6115;
				for (local63 = 0; local63 < this.anInt6120; local63++) {
					local70 = 0;
					local77 = local63 << this.anInt6115;
					local79 = local63 + 1 << this.anInt6115;
					@Pc(227) Class5_Sub3_Sub2 local227 = this.aClass62_Sub3_23.aClass5_Sub3_Sub2_3;
					local227.anInt4960 = 0;
					for (@Pc(232) int local232 = local54; local232 < local61; local232++) {
						if (-arg4 <= local232 - arg3 && arg4 >= local232 - arg3) {
							@Pc(255) int local255 = this.aClass131_Sub3_3.anInt8873 * local232 + local77;
							for (@Pc(257) int local257 = local77; local257 < local79; local257++) {
								if (local257 - arg2 >= -arg4 && arg4 >= local257 - arg2 && arg1[arg4 + local257 - arg2][local232 + arg4 - arg3]) {
									@Pc(302) short[] local302 = this.aClass131_Sub3_3.aShortArrayArray9[local255];
									if (local302 != null) {
										@Pc(310) int local310;
										if (this.aClass62_Sub3_23.aBoolean278) {
											for (local310 = 0; local310 < local302.length; local310++) {
												local70++;
												local227.method4181(local302[local310] & 0xFFFF);
											}
										} else {
											for (local310 = 0; local310 < local302.length; local310++) {
												local227.method4195(local302[local310] & 0xFFFF);
												local70++;
											}
										}
									}
								}
								local255++;
							}
						}
					}
					if (local70 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local39, local39, 1.0F);
						OpenGL.glTranslatef((float) -local63 / local39, (float) -local47 / local39, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass168ArrayArray1[local63][local47].method4245(local70, local227.aByteArray66);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!k;BII)V")
	public void method5085(@OriginalArg(0) Class5_Sub2_Sub13 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class5_Sub2_Sub13_Sub1 local6 = (Class5_Sub2_Sub13_Sub1) arg0;
		arg1 += local6.anInt2324 + 1;
		arg2 += local6.anInt2326 + 1;
		@Pc(27) int local27 = this.anInt6123 * arg1 + arg2;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt2322;
		@Pc(35) int local35 = local6.anInt2323;
		@Pc(41) int local41 = this.anInt6123 - local35;
		@Pc(43) int local43 = 0;
		@Pc(53) int local53;
		if (arg1 <= 0) {
			local53 = 1 - arg1;
			local27 += local53 * this.anInt6123;
			local29 = local53 * local35;
			local32 -= local53;
			arg1 = 1;
		}
		if (arg1 + local32 >= this.anInt6118) {
			local53 = local32 + arg1 + 1 - this.anInt6118;
			local32 -= local53;
		}
		if (arg2 <= 0) {
			local53 = 1 - arg2;
			local29 += local53;
			local27 += local53;
			local35 -= local53;
			local41 += local53;
			local43 = local53;
			arg2 = 1;
		}
		if (this.anInt6123 <= local35 + arg2) {
			local53 = arg2 + local35 + 1 - this.anInt6123;
			local41 += local53;
			local35 -= local53;
			local43 += local53;
		}
		if (local35 > 0 && local32 > 0) {
			Static48.method1058(local29, local41, local43, local6.aByteArray33, local35, local32, local27, this.aByteArray82);
			this.method5083(arg1, arg2, local32, local35);
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(ILclient!k;II)Z")
	public boolean method5086(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub2_Sub13 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class5_Sub2_Sub13_Sub1 local6 = (Class5_Sub2_Sub13_Sub1) arg1;
		arg2 += local6.anInt2324 + 1;
		arg0 += local6.anInt2326 + 1;
		@Pc(27) int local27 = arg2 * this.anInt6123 + arg0;
		@Pc(30) int local30 = local6.anInt2322;
		@Pc(33) int local33 = local6.anInt2323;
		@Pc(43) int local43;
		if (arg2 <= 0) {
			local43 = 1 - arg2;
			local27 += local43 * this.anInt6123;
			local30 -= local43;
			arg2 = 1;
		}
		@Pc(61) int local61 = this.anInt6123 - local33;
		if (this.anInt6118 <= arg2 + local30) {
			local43 = arg2 + local30 + 1 - this.anInt6118;
			local30 -= local43;
		}
		if (arg0 <= 0) {
			local43 = 1 - arg0;
			local33 -= local43;
			local27 += local43;
			arg0 = 1;
			local61 += local43;
		}
		if (arg0 + local33 >= this.anInt6123) {
			local43 = local33 + arg0 + 1 - this.anInt6123;
			local33 -= local43;
			local61 += local43;
		}
		if (local33 > 0 && local30 > 0) {
			local61 += this.anInt6123 * 7;
			return Static226.method4332(local30, local61, this.aByteArray82, local27, local33);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIBLclient!k;)V")
	public void method5088(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class5_Sub2_Sub13 arg2) {
		@Pc(6) Class5_Sub2_Sub13_Sub1 local6 = (Class5_Sub2_Sub13_Sub1) arg2;
		arg0 += local6.anInt2324 + 1;
		arg1 += local6.anInt2326 + 1;
		@Pc(27) int local27 = arg1 + arg0 * this.anInt6123;
		@Pc(39) int local39 = 0;
		@Pc(42) int local42 = local6.anInt2322;
		@Pc(45) int local45 = local6.anInt2323;
		@Pc(50) int local50 = this.anInt6123 - local45;
		@Pc(60) int local60;
		if (arg0 <= 0) {
			local60 = 1 - arg0;
			arg0 = 1;
			local27 += this.anInt6123 * local60;
			local39 = local45 * local60;
			local42 -= local60;
		}
		@Pc(81) int local81 = 0;
		if (local42 + arg0 >= this.anInt6118) {
			local60 = local42 + arg0 + 1 - this.anInt6118;
			local42 -= local60;
		}
		if (arg1 <= 0) {
			local60 = 1 - arg1;
			local45 -= local60;
			local50 += local60;
			local27 += local60;
			local81 = local60;
			arg1 = 1;
			local39 += local60;
		}
		if (this.anInt6123 <= local45 + arg1) {
			local60 = arg1 + local45 + 1 - this.anInt6123;
			local50 += local60;
			local45 -= local60;
			local81 += local60;
		}
		if (local45 > 0 && local42 > 0) {
			Static383.method5691(local81, local39, local45, local6.aByteArray33, local42, local27, local50, this.aByteArray82);
			this.method5083(arg0, arg1, local42, local45);
		}
	}
}
