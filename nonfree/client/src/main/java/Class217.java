import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ru")
public final class Class217 {

	@OriginalMember(owner = "client!ru", name = "s", descriptor = "[[Lclient!ed;")
	private Class61[][] aClass61ArrayArray1;

	@OriginalMember(owner = "client!ru", name = "f", descriptor = "Lclient!sp;")
	private final Class157_Sub2 aClass157_Sub2_2;

	@OriginalMember(owner = "client!ru", name = "q", descriptor = "Lclient!ur;")
	private final Class34_Sub2 aClass34_Sub2_31;

	@OriginalMember(owner = "client!ru", name = "d", descriptor = "I")
	public final int anInt6106;

	@OriginalMember(owner = "client!ru", name = "h", descriptor = "I")
	private final int anInt6108;

	@OriginalMember(owner = "client!ru", name = "e", descriptor = "I")
	private final int anInt6107;

	@OriginalMember(owner = "client!ru", name = "t", descriptor = "[B")
	public final byte[] aByteArray81;

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "I")
	private final int anInt6105;

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "I")
	private final int anInt6104;

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Lclient!ur;Lclient!sp;)V")
	public Class217(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) Class157_Sub2 arg1) {
		this.aClass157_Sub2_2 = arg1;
		this.aClass34_Sub2_31 = arg0;
		this.anInt6106 = (this.aClass157_Sub2_2.anInt6283 * this.aClass157_Sub2_2.anInt6284 >> this.aClass34_Sub2_31.anInt7072) + 2;
		this.anInt6108 = (this.aClass157_Sub2_2.anInt6284 * this.aClass157_Sub2_2.anInt6286 >> this.aClass34_Sub2_31.anInt7072) + 2;
		this.anInt6107 = this.aClass34_Sub2_31.anInt7072 + 7 - this.aClass157_Sub2_2.anInt6279;
		this.aByteArray81 = new byte[this.anInt6106 * this.anInt6108];
		this.anInt6105 = this.aClass157_Sub2_2.anInt6283 >> this.anInt6107;
		this.anInt6104 = this.aClass157_Sub2_2.anInt6286 >> this.anInt6107;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)V")
	public void method4810() {
		this.aClass61ArrayArray1 = new Class61[this.anInt6105][this.anInt6104];
		for (@Pc(23) int local23 = 0; local23 < this.anInt6104; local23++) {
			for (@Pc(27) int local27 = 0; local27 < this.anInt6105; local27++) {
				this.aClass61ArrayArray1[local27][local23] = new Class61(this.aClass34_Sub2_31, this, this.aClass157_Sub2_2, local27, local23, this.anInt6107, local27 * 128 + 1, local23 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IILclient!i;I)Z")
	public boolean method4811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub5_Sub10 arg2) {
		@Pc(6) Class1_Sub5_Sub10_Sub1 local6 = (Class1_Sub5_Sub10_Sub1) arg2;
		arg0 += local6.anInt5924 + 1;
		arg1 += local6.anInt5927 + 1;
		@Pc(28) int local28 = arg1 + arg0 * this.anInt6106;
		@Pc(31) int local31 = local6.anInt5928;
		@Pc(34) int local34 = local6.anInt5921;
		@Pc(43) int local43;
		if (arg0 <= 0) {
			local43 = 1 - arg0;
			arg0 = 1;
			local31 -= local43;
			local28 += this.anInt6106 * local43;
		}
		@Pc(62) int local62 = this.anInt6106 - local34;
		if (this.anInt6108 <= arg0 + local31) {
			local43 = local31 + arg0 + 1 - this.anInt6108;
			local31 -= local43;
		}
		if (arg1 <= 0) {
			local43 = 1 - arg1;
			local34 -= local43;
			local28 += local43;
			local62 += local43;
			arg1 = 1;
		}
		if (arg1 + local34 >= this.anInt6106) {
			local43 = arg1 + local34 + 1 - this.anInt6106;
			local62 += local43;
			local34 -= local43;
		}
		if (local34 > 0 && local31 > 0) {
			local62 += this.anInt6106 * 7;
			return Static47.method635(local31, local62, local34, local28, this.aByteArray81);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(ZIIII)V")
	private void method4812(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass61ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg0 - 1 >> 7;
		@Pc(25) int local25 = arg0 + arg2 - 1 - 1 >> 7;
		@Pc(31) int local31 = arg1 - 1 >> 7;
		@Pc(42) int local42 = arg1 + arg3 - 1 - 1 >> 7;
		for (@Pc(48) int local48 = local15; local48 <= local25; local48++) {
			@Pc(55) Class61[] local55 = this.aClass61ArrayArray1[local48];
			for (@Pc(57) int local57 = local31; local57 <= local42; local57++) {
				local55[local57].aBoolean184 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IB[[ZZII)V")
	public void method4813(@OriginalArg(0) int arg0, @OriginalArg(2) boolean[][] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aClass34_Sub2_31.method5487(false);
		this.aClass34_Sub2_31.method5546(false);
		this.aClass34_Sub2_31.method5556(-2);
		this.aClass34_Sub2_31.method5517(1);
		this.aClass34_Sub2_31.method5536(1);
		@Pc(44) float local44 = 1.0F / (float) (this.aClass34_Sub2_31.anInt7074 * 128);
		@Pc(48) int local48;
		@Pc(55) int local55;
		@Pc(62) int local62;
		@Pc(64) int local64;
		@Pc(71) int local71;
		@Pc(78) int local78;
		@Pc(80) int local80;
		if (arg2) {
			for (local48 = 0; local48 < this.anInt6104; local48++) {
				local55 = local48 << this.anInt6107;
				local62 = local48 + 1 << this.anInt6107;
				label128: for (local64 = 0; local64 < this.anInt6105; local64++) {
					local71 = local64 << this.anInt6107;
					local78 = local64 + 1 << this.anInt6107;
					for (local80 = local71; local80 < local78; local80++) {
						if (local80 - arg0 >= -arg4 && arg4 >= local80 - arg0) {
							for (@Pc(101) int local101 = local55; local101 < local62; local101++) {
								if (-arg4 <= local101 - arg3 && local101 - arg3 <= arg4 && arg1[arg4 + local80 - arg0][arg4 + local101 - arg3]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local44, local44, 1.0F);
									OpenGL.glTranslatef((float) -local64 / local44, (float) -local48 / local44, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass61ArrayArray1[local64][local48].method1405();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local48 = 0; local48 < this.anInt6104; local48++) {
				local55 = local48 << this.anInt6107;
				local62 = local48 + 1 << this.anInt6107;
				for (local64 = 0; local64 < this.anInt6105; local64++) {
					local71 = 0;
					local78 = local64 << this.anInt6107;
					local80 = local64 + 1 << this.anInt6107;
					@Pc(232) Class1_Sub28_Sub2 local232 = this.aClass34_Sub2_31.aClass1_Sub28_Sub2_3;
					local232.anInt6812 = 0;
					for (@Pc(237) int local237 = local55; local237 < local62; local237++) {
						if (-arg4 <= local237 - arg3 && local237 - arg3 <= arg4) {
							@Pc(265) int local265 = local237 * this.aClass157_Sub2_2.anInt6283 + local78;
							for (@Pc(267) int local267 = local78; local267 < local80; local267++) {
								if (local267 - arg0 >= -arg4 && local267 - arg0 <= arg4 && arg1[local267 + arg4 - arg0][local237 + arg4 - arg3]) {
									@Pc(302) short[] local302 = this.aClass157_Sub2_2.aShortArrayArray10[local265];
									if (local302 != null) {
										@Pc(310) int local310;
										if (this.aClass34_Sub2_31.aBoolean751) {
											for (local310 = 0; local310 < local302.length; local310++) {
												local71++;
												local232.method5393(local302[local310] & 0xFFFF);
											}
										} else {
											for (local310 = 0; local310 < local302.length; local310++) {
												local232.method5383(local302[local310] & 0xFFFF);
												local71++;
											}
										}
									}
								}
								local265++;
							}
						}
					}
					if (local71 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local44, local44, 1.0F);
						OpenGL.glTranslatef((float) -local64 / local44, (float) -local48 / local44, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass61ArrayArray1[local64][local48].method1408(local232.aByteArray86, local71);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IBILclient!i;)V")
	public void method4815(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub5_Sub10 arg2) {
		@Pc(6) Class1_Sub5_Sub10_Sub1 local6 = (Class1_Sub5_Sub10_Sub1) arg2;
		arg1 += local6.anInt5924 + 1;
		arg0 += local6.anInt5927 + 1;
		@Pc(27) int local27 = arg1 * this.anInt6106 + arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt5928;
		@Pc(35) int local35 = local6.anInt5921;
		@Pc(41) int local41 = this.anInt6106 - local35;
		@Pc(51) int local51;
		if (arg1 <= 0) {
			local51 = 1 - arg1;
			arg1 = 1;
			local27 += this.anInt6106 * local51;
			local32 -= local51;
			local29 = local51 * local35;
		}
		@Pc(72) int local72 = 0;
		if (local32 + arg1 >= this.anInt6108) {
			local51 = arg1 + local32 + 1 - this.anInt6108;
			local32 -= local51;
		}
		if (arg0 <= 0) {
			local51 = 1 - arg0;
			arg0 = 1;
			local35 -= local51;
			local41 += local51;
			local29 += local51;
			local72 = local51;
			local27 += local51;
		}
		if (local35 + arg0 >= this.anInt6106) {
			local51 = arg0 + local35 + 1 - this.anInt6106;
			local72 += local51;
			local41 += local51;
			local35 -= local51;
		}
		if (local35 > 0 && local32 > 0) {
			Static214.method3139(local29, this.aByteArray81, local72, local41, local32, local27, local6.aByteArray71, local35);
			this.method4812(arg0, arg1, local35, local32);
		}
	}

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "(IBILclient!i;)V")
	public void method4816(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub5_Sub10 arg2) {
		@Pc(6) Class1_Sub5_Sub10_Sub1 local6 = (Class1_Sub5_Sub10_Sub1) arg2;
		arg1 += local6.anInt5927 + 1;
		arg0 += local6.anInt5924 + 1;
		@Pc(27) int local27 = arg1 + this.anInt6106 * arg0;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36 = local6.anInt5928;
		@Pc(39) int local39 = local6.anInt5921;
		@Pc(45) int local45 = this.anInt6106 - local39;
		@Pc(51) int local51;
		if (arg0 <= 0) {
			local51 = 1 - arg0;
			arg0 = 1;
			local29 = local51 * local39;
			local36 -= local51;
			local27 += local51 * this.anInt6106;
		}
		@Pc(72) int local72 = 0;
		if (local36 + arg0 >= this.anInt6108) {
			local51 = local36 + arg0 + 1 - this.anInt6108;
			local36 -= local51;
		}
		if (arg1 <= 0) {
			local51 = 1 - arg1;
			local27 += local51;
			local39 -= local51;
			local29 += local51;
			local72 = local51;
			arg1 = 1;
			local45 += local51;
		}
		if (local39 + arg1 >= this.anInt6106) {
			local51 = local39 + arg1 + 1 - this.anInt6106;
			local45 += local51;
			local39 -= local51;
			local72 += local51;
		}
		if (local39 > 0 && local36 > 0) {
			Static118.method1886(this.aByteArray81, local6.aByteArray71, local36, local29, local72, local45, local39, local27);
			this.method4812(arg1, arg0, local39, local36);
		}
	}
}
