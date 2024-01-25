import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public abstract class Class53 implements Interface15 {

	@OriginalMember(owner = "client!ch", name = "n", descriptor = "Lclient!cba;")
	private Class46 aClass46_11 = Static472.aClass46_9;

	@OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
	protected final int anInt8203;

	@OriginalMember(owner = "client!ch", name = "p", descriptor = "Lclient!dc;")
	protected final Class66_Sub1_Sub1 aClass66_Sub1_Sub1_10;

	@OriginalMember(owner = "client!ch", name = "g", descriptor = "Z")
	private final boolean aBoolean564;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
	private final int anInt8199;

	@OriginalMember(owner = "client!ch", name = "m", descriptor = "Lclient!hi;")
	protected final Class141 aClass141_15;

	@OriginalMember(owner = "client!ch", name = "v", descriptor = "Lclient!ne;")
	protected final Class239 aClass239_19;

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
	private int anInt8200;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lclient!dc;ILclient!hi;Lclient!ne;IZ)V")
	protected Class53(@OriginalArg(0) Class66_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class141 arg2, @OriginalArg(3) Class239 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt8203 = arg1;
		this.aClass66_Sub1_Sub1_10 = arg0;
		this.aBoolean564 = arg5;
		this.anInt8199 = arg4;
		this.aClass141_15 = arg2;
		this.aClass239_19 = arg3;
		OpenGL.glGenTextures(1, Static274.anIntArray449, 0);
		this.anInt8200 = Static274.anIntArray449[0];
		this.method6768();
		this.method6767();
	}

	@OriginalMember(owner = "client!ch", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method6766();
		super.finalize();
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)I")
	private int method6764() {
		@Pc(19) int local19 = this.aClass239_19.anInt6113 * this.aClass141_15.anInt4189 * this.anInt8199;
		return this.aBoolean564 ? local19 * 4 / 3 : local19;
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V")
	private void method6766() {
		if (this.anInt8200 > 0) {
			this.aClass66_Sub1_Sub1_10.method2035(this.method6764(), this.anInt8200);
			this.anInt8200 = 0;
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)V")
	private void method6767() {
		this.aClass66_Sub1_Sub1_10.anInt8408 += this.method6764();
	}

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)V")
	private void method6768() {
		this.aClass66_Sub1_Sub1_10.method6979(this);
		if (this.aClass46_11 == Static472.aClass46_9) {
			OpenGL.glTexParameteri(this.anInt8203, 10241, this.aBoolean564 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt8203, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt8203, 10241, this.aBoolean564 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt8203, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(II[FII)V")
	protected final void method6769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3) {
		if (arg0 > 0 && !Static422.method6062(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static422.method6062(arg1)) {
			@Pc(35) int local35 = this.aClass141_15.anInt4189;
			@Pc(37) int local37 = 0;
			@Pc(44) int local44 = arg0 < arg1 ? arg0 : arg1;
			@Pc(48) int local48 = arg0 >> 1;
			@Pc(52) int local52 = arg1 >> 1;
			@Pc(54) float[] local54 = arg2;
			@Pc(61) float[] local61 = new float[local35 * local48 * local52];
			while (true) {
				OpenGL.glTexImage2Df(arg3, local37, this.method6770(), arg0, arg1, 0, Static241.method4095(this.aClass141_15), 5126, local54, 0);
				if (local44 <= 1) {
					return;
				}
				@Pc(85) int local85 = arg0 * local35;
				@Pc(87) float[] local87 = local61;
				for (@Pc(89) int local89 = 0; local89 < local35; local89++) {
					@Pc(93) int local93 = local89;
					@Pc(95) int local95 = local89;
					@Pc(99) int local99 = local85 + local89;
					for (@Pc(101) int local101 = 0; local101 < local52; local101++) {
						for (@Pc(105) int local105 = 0; local105 < local48; local105++) {
							@Pc(111) float local111 = local54[local95];
							local95 += local35;
							@Pc(121) float local121 = local111 + local54[local95];
							@Pc(127) float local127 = local121 + local54[local99];
							local95 += local35;
							local99 += local35;
							@Pc(141) float local141 = local127 + local54[local99];
							local61[local93] = local141 * 0.25F;
							local99 += local35;
							local93 += local35;
						}
						local95 += local85;
						local99 += local85;
					}
				}
				local61 = local54;
				arg0 = local48;
				arg1 = local52;
				local54 = local87;
				local48 >>= 0x1;
				local52 >>= 0x1;
				local44 >>= 0x1;
				local37++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(B)V")
	@Override
	public final void method6761() {
		@Pc(8) int local8 = this.aClass66_Sub1_Sub1_10.method6966();
		@Pc(23) int local23 = this.aClass66_Sub1_Sub1_10.anIntArray221[local8];
		if (local23 != this.anInt8203) {
			if (local23 != 0) {
				OpenGL.glBindTexture(local23, 0);
				OpenGL.glDisable(local23);
			}
			OpenGL.glEnable(this.anInt8203);
			this.aClass66_Sub1_Sub1_10.anIntArray221[local8] = this.anInt8203;
		}
		OpenGL.glBindTexture(this.anInt8203, this.anInt8200);
	}

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "(I)I")
	protected final int method6770() {
		if (Static349.aClass239_12 == this.aClass239_19) {
			if (Static431.aClass141_11 == this.aClass141_15) {
				return 6407;
			}
			if (Static85.aClass141_2 == this.aClass141_15) {
				return 6408;
			}
			if (Static106.aClass141_3 == this.aClass141_15) {
				return 6406;
			}
			if (this.aClass141_15 == Static128.aClass141_6) {
				return 6409;
			}
			if (this.aClass141_15 == Static471.aClass141_13) {
				return 6410;
			}
			if (this.aClass141_15 == Static129.aClass141_7) {
				return 6145;
			}
		} else if (this.aClass239_19 == Static349.aClass239_15) {
			if (Static431.aClass141_11 == this.aClass141_15) {
				return 34843;
			}
			if (Static85.aClass141_2 == this.aClass141_15) {
				return 34842;
			}
			if (Static106.aClass141_3 == this.aClass141_15) {
				return 34844;
			}
			if (Static128.aClass141_6 == this.aClass141_15) {
				return 34846;
			}
			if (this.aClass141_15 == Static471.aClass141_13) {
				return 34847;
			}
			if (this.aClass141_15 == Static129.aClass141_7) {
				return 6145;
			}
		} else if (this.aClass239_19 == Static349.aClass239_16) {
			if (this.aClass141_15 == Static431.aClass141_11) {
				return 34837;
			}
			if (this.aClass141_15 == Static85.aClass141_2) {
				return 34836;
			}
			if (Static106.aClass141_3 == this.aClass141_15) {
				return 34838;
			}
			if (this.aClass141_15 == Static128.aClass141_6) {
				return 34840;
			}
			if (this.aClass141_15 == Static471.aClass141_13) {
				return 34841;
			}
			if (Static129.aClass141_7 == this.aClass141_15) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I[IIII)V")
	protected final void method6771(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 > 0 && !Static422.method6062(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 > 0 && !Static422.method6062(arg3)) {
			throw new IllegalArgumentException("");
		} else if (Static85.aClass141_2 == this.aClass141_15) {
			@Pc(42) int local42 = 0;
			@Pc(49) int local49 = arg2 >= arg3 ? arg3 : arg2;
			@Pc(53) int local53 = arg2 >> 1;
			@Pc(57) int local57 = arg3 >> 1;
			@Pc(59) int[] local59 = arg1;
			@Pc(64) int[] local64 = new int[local53 * local57];
			while (true) {
				OpenGL.glTexImage2Di(arg0, local42, this.method6770(), arg2, arg3, 0, 32993, this.aClass66_Sub1_Sub1_10.anInt2250, local59, 0);
				if (local49 <= 1) {
					return;
				}
				@Pc(88) int local88 = 0;
				@Pc(90) int local90 = 0;
				@Pc(94) int local94 = arg2;
				for (@Pc(96) int local96 = 0; local96 < local57; local96++) {
					for (@Pc(100) int local100 = 0; local100 < local53; local100++) {
						@Pc(107) int local107 = local59[local90++];
						@Pc(112) int local112 = local59[local90++];
						@Pc(117) int local117 = local59[local94++];
						@Pc(123) int local123 = local107 >> 8 & 0xFF;
						@Pc(128) int local128 = local59[local94++];
						@Pc(134) int local134 = local107 >> 16 & 0xFF;
						@Pc(140) int local140 = local107 >> 24 & 0xFF;
						@Pc(144) int local144 = local107 & 0xFF;
						@Pc(152) int local152 = local134 + (local112 >> 16 & 0xFF);
						@Pc(160) int local160 = local123 + (local112 >> 8 & 0xFF);
						@Pc(166) int local166 = local144 + (local112 & 0xFF);
						@Pc(174) int local174 = local140 + (local112 >> 24 & 0xFF);
						@Pc(182) int local182 = local174 + (local117 >> 24 & 0xFF);
						@Pc(190) int local190 = local160 + (local117 >> 8 & 0xFF);
						@Pc(196) int local196 = local166 + (local117 & 0xFF);
						@Pc(204) int local204 = local152 + (local117 >> 16 & 0xFF);
						@Pc(212) int local212 = local190 + (local128 >> 8 & 0xFF);
						@Pc(220) int local220 = local204 + (local128 >> 16 & 0xFF);
						@Pc(226) int local226 = local196 + (local128 & 0xFF);
						@Pc(234) int local234 = local182 + (local128 >> 24 & 0xFF);
						local64[local88++] = local226 >> 2 & 0xFF | (local234 & 0x3FC) << 22 | (local220 & 0x3FC) << 14 | (local212 & 0x3FC) << 6;
					}
					local90 += arg2;
					local94 += arg2;
				}
				@Pc(287) int[] local287 = local64;
				local64 = local59;
				local59 = local287;
				arg3 = local57;
				arg2 = local53;
				local42++;
				local57 >>= 0x1;
				local53 >>= 0x1;
				local49 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!cba;I)V")
	@Override
	public final void method6762(@OriginalArg(0) Class46 arg0) {
		if (arg0 != this.aClass46_11) {
			this.aClass46_11 = arg0;
			this.method6768();
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I[BIII)V")
	protected final void method6772(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 > 0 && !Static422.method6062(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static422.method6062(arg2)) {
			@Pc(37) int local37 = this.aClass141_15.anInt4189;
			@Pc(44) int local44 = 0;
			@Pc(55) int local55 = arg3 >= arg2 ? arg2 : arg3;
			@Pc(59) int local59 = arg3 >> 1;
			@Pc(63) int local63 = arg2 >> 1;
			@Pc(65) byte[] local65 = arg1;
			@Pc(72) byte[] local72 = new byte[local63 * local59 * local37];
			while (true) {
				OpenGL.glTexImage2Dub(arg0, local44, this.method6770(), arg3, arg2, 0, Static241.method4095(this.aClass141_15), 5121, local65, 0);
				if (local55 <= 1) {
					return;
				}
				@Pc(101) int local101 = local37 * arg3;
				@Pc(103) byte[] local103 = local72;
				for (@Pc(105) int local105 = 0; local105 < local37; local105++) {
					@Pc(109) int local109 = local105;
					@Pc(111) int local111 = local105;
					@Pc(115) int local115 = local105 + local101;
					for (@Pc(117) int local117 = 0; local117 < local63; local117++) {
						for (@Pc(121) int local121 = 0; local121 < local59; local121++) {
							@Pc(127) byte local127 = local65[local111];
							local111 += local37;
							@Pc(137) int local137 = local127 + local65[local111];
							local111 += local37;
							@Pc(147) int local147 = local137 + local65[local115];
							local115 += local37;
							@Pc(157) int local157 = local147 + local65[local115];
							local115 += local37;
							local72[local109] = (byte) (local157 >> 2);
							local109 += local37;
						}
						local111 += local101;
						local115 += local101;
					}
				}
				local72 = local65;
				arg2 = local63;
				local65 = local103;
				arg3 = local59;
				local63 >>= 0x1;
				local44++;
				local59 >>= 0x1;
				local55 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
