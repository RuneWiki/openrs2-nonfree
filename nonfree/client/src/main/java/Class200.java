import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class200 {

	@OriginalMember(owner = "client!mg", name = "o", descriptor = "[[Lclient!ii;")
	private Class144[][] aClass144ArrayArray1;

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "Lclient!en;")
	private final Class90_Sub1 aClass90_Sub1_26;

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "Lclient!ot;")
	private final Class46_Sub3 aClass46_Sub3_2;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
	public final int anInt6109;

	@OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
	private final int anInt6117;

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
	private final int anInt6113;

	@OriginalMember(owner = "client!mg", name = "l", descriptor = "[B")
	public final byte[] aByteArray78;

	@OriginalMember(owner = "client!mg", name = "t", descriptor = "I")
	private final int anInt6121;

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
	private final int anInt6115;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lclient!en;Lclient!ot;)V")
	public Class200(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) Class46_Sub3 arg1) {
		this.aClass90_Sub1_26 = arg0;
		this.aClass46_Sub3_2 = arg1;
		this.anInt6109 = (this.aClass46_Sub3_2.anInt9997 * this.aClass46_Sub3_2.anInt9998 >> this.aClass90_Sub1_26.anInt2433) + 2;
		this.anInt6117 = (this.aClass46_Sub3_2.anInt9995 * this.aClass46_Sub3_2.anInt9998 >> this.aClass90_Sub1_26.anInt2433) + 2;
		this.anInt6113 = this.aClass90_Sub1_26.anInt2433 + 7 - this.aClass46_Sub3_2.anInt10000;
		this.aByteArray78 = new byte[this.anInt6117 * this.anInt6109];
		this.anInt6121 = this.aClass46_Sub3_2.anInt9997 >> this.anInt6113;
		this.anInt6115 = this.aClass46_Sub3_2.anInt9995 >> this.anInt6113;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILclient!w;II)Z")
	public boolean method4955(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub5_Sub10 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class6_Sub5_Sub10_Sub2 local6 = (Class6_Sub5_Sub10_Sub2) arg1;
		arg0 += local6.anInt6252 + 1;
		arg2 += local6.anInt6246 + 1;
		@Pc(32) int local32 = arg0 + arg2 * this.anInt6109;
		@Pc(35) int local35 = local6.anInt6247;
		@Pc(38) int local38 = local6.anInt6253;
		@Pc(44) int local44 = this.anInt6109 - local38;
		@Pc(53) int local53;
		if (arg2 <= 0) {
			local53 = 1 - arg2;
			arg2 = 1;
			local32 += local53 * this.anInt6109;
			local35 -= local53;
		}
		if (this.anInt6117 <= local35 + arg2) {
			local53 = local35 + arg2 + 1 - this.anInt6117;
			local35 -= local53;
		}
		if (arg0 <= 0) {
			local53 = 1 - arg0;
			arg0 = 1;
			local32 += local53;
			local38 -= local53;
			local44 += local53;
		}
		if (this.anInt6109 <= arg0 + local38) {
			local53 = arg0 + local38 + 1 - this.anInt6109;
			local44 += local53;
			local38 -= local53;
		}
		if (local38 > 0 && local35 > 0) {
			local44 += this.anInt6109 * 7;
			return Static185.method3093(this.aByteArray78, local38, local44, local32, local35);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIII)V")
	private void method4957(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass144ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg0 - 1 >> 7;
		@Pc(25) int local25 = arg1 + arg0 - 1 - 1 >> 7;
		@Pc(31) int local31 = arg3 - 1 >> 7;
		@Pc(50) int local50 = arg3 + arg2 - 1 - 1 >> 7;
		for (@Pc(52) int local52 = local15; local52 <= local25; local52++) {
			@Pc(59) Class144[] local59 = this.aClass144ArrayArray1[local52];
			for (@Pc(61) int local61 = local31; local61 <= local50; local61++) {
				local59[local61].aBoolean313 = true;
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
	public void method4958() {
		this.aClass144ArrayArray1 = new Class144[this.anInt6121][this.anInt6115];
		for (@Pc(14) int local14 = 0; local14 < this.anInt6115; local14++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt6121; local18++) {
				this.aClass144ArrayArray1[local18][local14] = new Class144(this.aClass90_Sub1_26, this, this.aClass46_Sub3_2, local18, local14, this.anInt6113, local18 * 128 + 1, local14 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!w;IBI)V")
	public void method4960(@OriginalArg(0) Class6_Sub5_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class6_Sub5_Sub10_Sub2 local6 = (Class6_Sub5_Sub10_Sub2) arg0;
		arg1 += local6.anInt6252 + 1;
		arg2 += local6.anInt6246 + 1;
		@Pc(27) int local27 = arg1 + this.anInt6109 * arg2;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt6247;
		@Pc(43) int local43 = local6.anInt6253;
		@Pc(49) int local49 = this.anInt6109 - local43;
		@Pc(51) int local51 = 0;
		@Pc(61) int local61;
		if (arg2 <= 0) {
			local61 = 1 - arg2;
			local27 += local61 * this.anInt6109;
			local32 -= local61;
			local29 = local43 * local61;
			arg2 = 1;
		}
		if (this.anInt6117 <= local32 + arg2) {
			local61 = arg2 + local32 + 1 - this.anInt6117;
			local32 -= local61;
		}
		if (arg1 <= 0) {
			local61 = 1 - arg1;
			local51 = local61;
			local43 -= local61;
			local27 += local61;
			arg1 = 1;
			local49 += local61;
			local29 += local61;
		}
		if (arg1 + local43 >= this.anInt6109) {
			local61 = arg1 + local43 + 1 - this.anInt6109;
			local49 += local61;
			local43 -= local61;
			local51 += local61;
		}
		if (local43 > 0 && local32 > 0) {
			Static337.method5188(local27, this.aByteArray78, local29, local32, local51, local49, local43, local6.aByteArray80);
			this.method4957(arg1, local43, local32, arg2);
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I[[ZIIIZ)V")
	public void method4963(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		this.aClass90_Sub1_26.method2099(false);
		this.aClass90_Sub1_26.method2127(false);
		this.aClass90_Sub1_26.method2111(-2);
		this.aClass90_Sub1_26.method2123(1);
		this.aClass90_Sub1_26.method2090(1);
		@Pc(44) float local44 = 1.0F / (float) (this.aClass90_Sub1_26.anInt2435 * 128);
		@Pc(48) int local48;
		@Pc(55) int local55;
		@Pc(62) int local62;
		@Pc(64) int local64;
		@Pc(71) int local71;
		@Pc(78) int local78;
		@Pc(80) int local80;
		if (arg4) {
			for (local48 = 0; local48 < this.anInt6115; local48++) {
				local55 = local48 << this.anInt6113;
				local62 = local48 + 1 << this.anInt6113;
				label128: for (local64 = 0; local64 < this.anInt6121; local64++) {
					local71 = local64 << this.anInt6113;
					local78 = local64 + 1 << this.anInt6113;
					for (local80 = local71; local80 < local78; local80++) {
						if (-arg3 <= local80 - arg0 && local80 - arg0 <= arg3) {
							for (@Pc(101) int local101 = local55; local101 < local62; local101++) {
								if (-arg3 <= local101 - arg2 && arg3 >= local101 - arg2 && arg1[arg3 + local80 - arg0][arg3 + local101 - arg2]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local44, local44, 1.0F);
									OpenGL.glTranslatef((float) -local64 / local44, (float) -local48 / local44, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass144ArrayArray1[local64][local48].method3516();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local48 = 0; local48 < this.anInt6115; local48++) {
				local55 = local48 << this.anInt6113;
				local62 = local48 + 1 << this.anInt6113;
				for (local64 = 0; local64 < this.anInt6121; local64++) {
					local71 = 0;
					local78 = local64 << this.anInt6113;
					local80 = local64 + 1 << this.anInt6113;
					@Pc(227) Class6_Sub12_Sub1 local227 = this.aClass90_Sub1_26.aClass6_Sub12_Sub1_1;
					local227.anInt7556 = 0;
					for (@Pc(232) int local232 = local55; local232 < local62; local232++) {
						if (local232 - arg2 >= -arg3 && local232 - arg2 <= arg3) {
							@Pc(259) int local259 = local78 + local232 * this.aClass46_Sub3_2.anInt9997;
							for (@Pc(261) int local261 = local78; local261 < local80; local261++) {
								if (local261 - arg0 >= -arg3 && arg3 >= local261 - arg0 && arg1[local261 + arg3 - arg0][arg3 + local232 - arg2]) {
									@Pc(302) short[] local302 = this.aClass46_Sub3_2.aShortArrayArray22[local259];
									if (local302 != null) {
										@Pc(310) int local310;
										if (this.aClass90_Sub1_26.aBoolean176) {
											for (local310 = 0; local310 < local302.length; local310++) {
												local227.method6032(local302[local310] & 0xFFFF);
												local71++;
											}
										} else {
											for (local310 = 0; local310 < local302.length; local310++) {
												local71++;
												local227.method6021(local302[local310] & 0xFFFF);
											}
										}
									}
								}
								local259++;
							}
						}
					}
					if (local71 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local44, local44, 1.0F);
						OpenGL.glTranslatef((float) -local64 / local44, (float) -local48 / local44, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass144ArrayArray1[local64][local48].method3517(local227.aByteArray97, local71);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!w;III)V")
	public void method4964(@OriginalArg(0) Class6_Sub5_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class6_Sub5_Sub10_Sub2 local6 = (Class6_Sub5_Sub10_Sub2) arg0;
		arg2 += local6.anInt6246 + 1;
		arg1 += local6.anInt6252 + 1;
		@Pc(27) int local27 = this.anInt6109 * arg2 + arg1;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt6247;
		@Pc(35) int local35 = local6.anInt6253;
		@Pc(40) int local40 = this.anInt6109 - local35;
		@Pc(50) int local50;
		if (arg2 <= 0) {
			local50 = 1 - arg2;
			local29 = local50 * local35;
			local27 += this.anInt6109 * local50;
			arg2 = 1;
			local32 -= local50;
		}
		@Pc(71) int local71 = 0;
		if (arg2 + local32 >= this.anInt6117) {
			local50 = arg2 + local32 + 1 - this.anInt6117;
			local32 -= local50;
		}
		if (arg1 <= 0) {
			local50 = 1 - arg1;
			local71 = local50;
			local40 += local50;
			local29 += local50;
			local35 -= local50;
			arg1 = 1;
			local27 += local50;
		}
		if (this.anInt6109 <= local35 + arg1) {
			local50 = arg1 + local35 + 1 - this.anInt6109;
			local40 += local50;
			local71 += local50;
			local35 -= local50;
		}
		if (local35 > 0 && local32 > 0) {
			Static217.method3475(local27, local29, local40, local35, local32, this.aByteArray78, local6.aByteArray80, local71);
			this.method4957(arg1, local35, local32, arg2);
		}
	}
}
