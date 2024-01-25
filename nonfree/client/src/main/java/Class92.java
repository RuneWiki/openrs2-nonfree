import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class92 {

	@OriginalMember(owner = "client!gf", name = "t", descriptor = "[[Lclient!ko;")
	private Class142[][] aClass142ArrayArray1;

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "Lclient!on;")
	private final Class163_Sub1 aClass163_Sub1_1;

	@OriginalMember(owner = "client!gf", name = "i", descriptor = "Lclient!od;")
	private final Class128_Sub2 aClass128_Sub2_13;

	@OriginalMember(owner = "client!gf", name = "n", descriptor = "I")
	public final int anInt2270;

	@OriginalMember(owner = "client!gf", name = "r", descriptor = "I")
	private final int anInt2274;

	@OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
	private final int anInt2267;

	@OriginalMember(owner = "client!gf", name = "l", descriptor = "[B")
	public final byte[] aByteArray19;

	@OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
	private final int anInt2271;

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
	private final int anInt2265;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lclient!od;Lclient!on;)V")
	public Class92(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) Class163_Sub1 arg1) {
		this.aClass163_Sub1_1 = arg1;
		this.aClass128_Sub2_13 = arg0;
		this.anInt2270 = (this.aClass163_Sub1_1.anInt5792 * this.aClass163_Sub1_1.anInt5796 >> this.aClass128_Sub2_13.anInt4606) + 2;
		this.anInt2274 = (this.aClass163_Sub1_1.anInt5795 * this.aClass163_Sub1_1.anInt5792 >> this.aClass128_Sub2_13.anInt4606) + 2;
		this.anInt2267 = this.aClass128_Sub2_13.anInt4606 + 7 - this.aClass163_Sub1_1.anInt5797;
		this.aByteArray19 = new byte[this.anInt2274 * this.anInt2270];
		this.anInt2271 = this.aClass163_Sub1_1.anInt5796 >> this.anInt2267;
		this.anInt2265 = this.aClass163_Sub1_1.anInt5795 >> this.anInt2267;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
	public void method1785() {
		this.aClass142ArrayArray1 = new Class142[this.anInt2271][this.anInt2265];
		for (@Pc(18) int local18 = 0; local18 < this.anInt2265; local18++) {
			for (@Pc(22) int local22 = 0; local22 < this.anInt2271; local22++) {
				this.aClass142ArrayArray1[local22][local18] = new Class142(this.aClass128_Sub2_13, this, this.aClass163_Sub1_1, local22, local18, this.anInt2267, local22 * 128 + 1, local18 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!j;III)V")
	public void method1788(@OriginalArg(0) Class1_Sub3_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class1_Sub3_Sub10_Sub1 local6 = (Class1_Sub3_Sub10_Sub1) arg0;
		arg2 += local6.anInt5355 + 1;
		arg1 += local6.anInt5364 + 1;
		@Pc(27) int local27 = this.anInt2270 * arg1 + arg2;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt5353;
		@Pc(35) int local35 = local6.anInt5358;
		@Pc(41) int local41 = this.anInt2270 - local35;
		@Pc(48) int local48;
		if (arg1 <= 0) {
			local48 = 1 - arg1;
			local32 -= local48;
			local27 += this.anInt2270 * local48;
			arg1 = 1;
			local29 = local35 * local48;
		}
		@Pc(69) int local69 = 0;
		if (arg1 + local32 >= this.anInt2274) {
			local48 = local32 + arg1 + 1 - this.anInt2274;
			local32 -= local48;
		}
		if (arg2 <= 0) {
			local48 = 1 - arg2;
			local69 = local48;
			local29 += local48;
			local41 += local48;
			arg2 = 1;
			local27 += local48;
			local35 -= local48;
		}
		if (arg2 + local35 >= this.anInt2270) {
			local48 = local35 + arg2 + 1 - this.anInt2270;
			local69 += local48;
			local35 -= local48;
			local41 += local48;
		}
		if (local35 > 0 && local32 > 0) {
			Static353.method4549(local35, local69, local27, local6.aByteArray60, local32, this.aByteArray19, local41, local29);
			this.method1793(local32, local35, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!j;IB)Z")
	public boolean method1789(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub3_Sub10 arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class1_Sub3_Sub10_Sub1 local13 = (Class1_Sub3_Sub10_Sub1) arg1;
		arg2 += local13.anInt5355 + 1;
		arg0 += local13.anInt5364 + 1;
		@Pc(34) int local34 = arg0 * this.anInt2270 + arg2;
		@Pc(37) int local37 = local13.anInt5353;
		@Pc(40) int local40 = local13.anInt5358;
		@Pc(50) int local50;
		if (arg0 <= 0) {
			local50 = 1 - arg0;
			local34 += this.anInt2270 * local50;
			local37 -= local50;
			arg0 = 1;
		}
		@Pc(69) int local69 = this.anInt2270 - local40;
		if (arg0 + local37 >= this.anInt2274) {
			local50 = local37 + arg0 + 1 - this.anInt2274;
			local37 -= local50;
		}
		if (arg2 <= 0) {
			local50 = 1 - arg2;
			arg2 = 1;
			local40 -= local50;
			local34 += local50;
			local69 += local50;
		}
		if (arg2 + local40 >= this.anInt2270) {
			local50 = arg2 + local40 + 1 - this.anInt2270;
			local69 += local50;
			local40 -= local50;
		}
		if (local40 > 0 && local37 > 0) {
			local69 += this.anInt2270 * 7;
			return Static440.method5526(this.aByteArray19, local37, local40, local69, local34);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZI[[ZIII)V")
	public void method1790(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aClass128_Sub2_13.method3621(false);
		this.aClass128_Sub2_13.method3668(false);
		this.aClass128_Sub2_13.method3652(-2);
		this.aClass128_Sub2_13.method3677(1);
		this.aClass128_Sub2_13.method3653(1);
		@Pc(44) float local44 = 1.0F / (float) (this.aClass128_Sub2_13.anInt4605 * 128);
		@Pc(48) int local48;
		@Pc(55) int local55;
		@Pc(62) int local62;
		@Pc(64) int local64;
		@Pc(71) int local71;
		@Pc(78) int local78;
		@Pc(80) int local80;
		if (arg0) {
			for (local48 = 0; local48 < this.anInt2265; local48++) {
				local55 = local48 << this.anInt2267;
				local62 = local48 + 1 << this.anInt2267;
				label128: for (local64 = 0; local64 < this.anInt2271; local64++) {
					local71 = local64 << this.anInt2267;
					local78 = local64 + 1 << this.anInt2267;
					for (local80 = local71; local80 < local78; local80++) {
						if (local80 - arg1 >= -arg3 && arg3 >= local80 - arg1) {
							for (@Pc(105) int local105 = local55; local105 < local62; local105++) {
								if (local105 - arg4 >= -arg3 && arg3 >= local105 - arg4 && arg2[arg3 + local80 - arg1][arg3 + local105 - arg4]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local44, local44, 1.0F);
									OpenGL.glTranslatef((float) -local64 / local44, (float) -local48 / local44, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass142ArrayArray1[local64][local48].method2836();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local48 = 0; local48 < this.anInt2265; local48++) {
				local55 = local48 << this.anInt2267;
				local62 = local48 + 1 << this.anInt2267;
				for (local64 = 0; local64 < this.anInt2271; local64++) {
					local71 = 0;
					local78 = local64 << this.anInt2267;
					local80 = local64 + 1 << this.anInt2267;
					@Pc(231) Class1_Sub11 local231 = Static298.aClass1_Sub11_5;
					local231.anInt5766 = 0;
					for (@Pc(236) int local236 = local55; local236 < local62; local236++) {
						if (local236 - arg4 >= -arg3 && arg3 >= local236 - arg4) {
							@Pc(259) int local259 = local236 * this.aClass163_Sub1_1.anInt5796 + local78;
							for (@Pc(261) int local261 = local78; local261 < local80; local261++) {
								if (-arg3 <= local261 - arg1 && arg3 >= local261 - arg1 && arg2[local261 + arg3 - arg1][arg3 + local236 - arg4]) {
									@Pc(297) short[] local297 = this.aClass163_Sub1_1.aShortArrayArray23[local259];
									if (local297 != null) {
										@Pc(305) int local305;
										if (this.aClass128_Sub2_13.aBoolean360) {
											for (local305 = 0; local305 < local297.length; local305++) {
												local71++;
												local231.method4448(local297[local305] & 0xFFFF);
											}
										} else {
											for (local305 = 0; local305 < local297.length; local305++) {
												local231.method4488(local297[local305] & 0xFFFF);
												local71++;
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
						this.aClass142ArrayArray1[local64][local48].method2840(local231.aByteArray64, local71);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIILclient!j;)V")
	public void method1792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub3_Sub10 arg2) {
		@Pc(6) Class1_Sub3_Sub10_Sub1 local6 = (Class1_Sub3_Sub10_Sub1) arg2;
		arg0 += local6.anInt5355 + 1;
		arg1 += local6.anInt5364 + 1;
		@Pc(34) int local34 = arg0 + this.anInt2270 * arg1;
		@Pc(36) int local36 = 0;
		@Pc(39) int local39 = local6.anInt5353;
		@Pc(42) int local42 = local6.anInt5358;
		@Pc(47) int local47 = this.anInt2270 - local42;
		@Pc(49) int local49 = 0;
		@Pc(55) int local55;
		if (arg1 <= 0) {
			local55 = 1 - arg1;
			local39 -= local55;
			local36 = local42 * local55;
			local34 += this.anInt2270 * local55;
			arg1 = 1;
		}
		if (local39 + arg1 >= this.anInt2274) {
			local55 = arg1 + local39 + 1 - this.anInt2274;
			local39 -= local55;
		}
		if (arg0 <= 0) {
			local55 = 1 - arg0;
			local36 += local55;
			arg0 = 1;
			local34 += local55;
			local49 = local55;
			local47 += local55;
			local42 -= local55;
		}
		if (arg0 + local42 >= this.anInt2270) {
			local55 = local42 + arg0 + 1 - this.anInt2270;
			local42 -= local55;
			local47 += local55;
			local49 += local55;
		}
		if (local42 > 0 && local39 > 0) {
			Static259.method3353(local42, local49, this.aByteArray19, local36, local6.aByteArray60, local34, local47, local39);
			this.method1793(local39, local42, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIII)V")
	private void method1793(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass142ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg3 - 1 >> 7;
		@Pc(26) int local26 = arg3 + arg1 - 1 - 1 >> 7;
		@Pc(32) int local32 = arg2 - 1 >> 7;
		@Pc(47) int local47 = arg2 + arg0 - 1 - 1 >> 7;
		for (@Pc(49) int local49 = local15; local49 <= local26; local49++) {
			@Pc(56) Class142[] local56 = this.aClass142ArrayArray1[local49];
			for (@Pc(58) int local58 = local32; local58 <= local47; local58++) {
				local56[local58].aBoolean273 = true;
			}
		}
	}
}
