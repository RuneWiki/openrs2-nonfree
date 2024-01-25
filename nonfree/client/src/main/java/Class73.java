import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mfa")
public abstract class Class73 implements Interface11 {

	@OriginalMember(owner = "client!mfa", name = "b", descriptor = "Lclient!dj;")
	private Class71 aClass71_9 = Static567.aClass71_11;

	@OriginalMember(owner = "client!mfa", name = "f", descriptor = "Z")
	private final boolean aBoolean530;

	@OriginalMember(owner = "client!mfa", name = "r", descriptor = "Lclient!rt;")
	protected final Class298 aClass298_10;

	@OriginalMember(owner = "client!mfa", name = "l", descriptor = "I")
	protected final int anInt7096;

	@OriginalMember(owner = "client!mfa", name = "p", descriptor = "Lclient!sq;")
	protected final Class314 aClass314_18;

	@OriginalMember(owner = "client!mfa", name = "n", descriptor = "I")
	private final int anInt7098;

	@OriginalMember(owner = "client!mfa", name = "d", descriptor = "Lclient!mr;")
	protected final Class45_Sub2_Sub2 aClass45_Sub2_Sub2_10;

	@OriginalMember(owner = "client!mfa", name = "g", descriptor = "I")
	private int anInt7091;

	@OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(Lclient!mr;ILclient!sq;Lclient!rt;IZ)V")
	protected Class73(@OriginalArg(0) Class45_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class314 arg2, @OriginalArg(3) Class298 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aBoolean530 = arg5;
		this.aClass298_10 = arg3;
		this.anInt7096 = arg1;
		this.aClass314_18 = arg2;
		this.anInt7098 = arg4;
		this.aClass45_Sub2_Sub2_10 = arg0;
		OpenGL.glGenTextures(1, Static128.anIntArray132, 0);
		this.anInt7091 = Static128.anIntArray132[0];
		this.method5960();
		this.method5956();
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Z)V")
	@Override
	public final void method6965() {
		@Pc(12) int local12 = this.aClass45_Sub2_Sub2_10.method5006();
		@Pc(18) int local18 = this.aClass45_Sub2_Sub2_10.anIntArray319[local12];
		if (local18 != this.anInt7096) {
			if (local18 != 0) {
				OpenGL.glBindTexture(local18, 0);
				OpenGL.glDisable(local18);
			}
			OpenGL.glEnable(this.anInt7096);
			this.aClass45_Sub2_Sub2_10.anIntArray319[local12] = this.anInt7096;
		}
		OpenGL.glBindTexture(this.anInt7096, this.anInt7091);
	}

	@OriginalMember(owner = "client!mfa", name = "d", descriptor = "(I)V")
	private void method5954() {
		if (this.anInt7091 > 0) {
			this.aClass45_Sub2_Sub2_10.method5031(this.method5959(), this.anInt7091);
			this.anInt7091 = 0;
		}
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(I[BIII)V")
	protected final void method5955(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 > 0 && !Static259.method3984(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static259.method3984(arg2)) {
			@Pc(41) int local41 = this.aClass314_18.anInt8032;
			@Pc(43) int local43 = 0;
			@Pc(54) int local54 = arg2 > arg0 ? arg0 : arg2;
			@Pc(58) int local58 = arg0 >> 1;
			@Pc(62) int local62 = arg2 >> 1;
			@Pc(64) byte[] local64 = arg1;
			@Pc(71) byte[] local71 = new byte[local62 * local58 * local41];
			while (true) {
				OpenGL.glTexImage2Dub(arg3, local43, this.method5957(), arg0, arg2, 0, Static537.method7176(this.aClass314_18), 5121, local64, 0);
				if (local54 <= 1) {
					return;
				}
				@Pc(97) int local97 = arg0 * local41;
				for (@Pc(99) int local99 = 0; local99 < local41; local99++) {
					@Pc(103) int local103 = local99;
					@Pc(105) int local105 = local99;
					@Pc(110) int local110 = local99 + local97;
					for (@Pc(112) int local112 = 0; local112 < local62; local112++) {
						for (@Pc(116) int local116 = 0; local116 < local58; local116++) {
							@Pc(122) byte local122 = local64[local105];
							local105 += local41;
							@Pc(132) int local132 = local122 + local64[local105];
							@Pc(138) int local138 = local132 + local64[local110];
							local105 += local41;
							local110 += local41;
							@Pc(152) int local152 = local138 + local64[local110];
							local71[local103] = (byte) (local152 >> 2);
							local110 += local41;
							local103 += local41;
						}
						local105 += local97;
						local110 += local97;
					}
				}
				@Pc(197) byte[] local197 = local71;
				local71 = local64;
				local64 = local197;
				arg0 = local58;
				arg2 = local62;
				local62 >>= 0x1;
				local43++;
				local54 >>= 0x1;
				local58 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IZ)V")
	private void method5956() {
		this.aClass45_Sub2_Sub2_10.anInt5826 += this.method5959();
	}

	@OriginalMember(owner = "client!mfa", name = "e", descriptor = "(I)I")
	protected final int method5957() {
		if (this.aClass298_10 == Static471.aClass298_15) {
			if (this.aClass314_18 == Static485.aClass314_20) {
				return 6407;
			}
			if (Static469.aClass314_11 == this.aClass314_18) {
				return 6408;
			}
			if (Static213.aClass314_19 == this.aClass314_18) {
				return 6406;
			}
			if (Static394.aClass314_17 == this.aClass314_18) {
				return 6409;
			}
			if (this.aClass314_18 == Static386.aClass314_16) {
				return 6410;
			}
			if (this.aClass314_18 == Static366.aClass314_15) {
				return 6145;
			}
		} else if (Static471.aClass298_18 == this.aClass298_10) {
			if (this.aClass314_18 == Static485.aClass314_20) {
				return 34843;
			}
			if (this.aClass314_18 == Static469.aClass314_11) {
				return 34842;
			}
			if (Static213.aClass314_19 == this.aClass314_18) {
				return 34844;
			}
			if (this.aClass314_18 == Static394.aClass314_17) {
				return 34846;
			}
			if (this.aClass314_18 == Static386.aClass314_16) {
				return 34847;
			}
			if (Static366.aClass314_15 == this.aClass314_18) {
				return 6145;
			}
		} else if (this.aClass298_10 == Static471.aClass298_19) {
			if (Static485.aClass314_20 == this.aClass314_18) {
				return 34837;
			}
			if (this.aClass314_18 == Static469.aClass314_11) {
				return 34836;
			}
			if (Static213.aClass314_19 == this.aClass314_18) {
				return 34838;
			}
			if (Static394.aClass314_17 == this.aClass314_18) {
				return 34840;
			}
			if (this.aClass314_18 == Static386.aClass314_16) {
				return 34841;
			}
			if (this.aClass314_18 == Static366.aClass314_15) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Lclient!dj;B)V")
	@Override
	public final void method6963(@OriginalArg(0) Class71 arg0) {
		if (this.aClass71_9 != arg0) {
			this.aClass71_9 = arg0;
			this.method5960();
		}
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(II[III)V")
	protected final void method5958(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 > 0 && !Static259.method3984(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg0 > 0 && !Static259.method3984(arg0)) {
			throw new IllegalArgumentException("");
		} else if (this.aClass314_18 == Static469.aClass314_11) {
			@Pc(38) int local38 = 0;
			@Pc(49) int local49 = arg3 >= arg0 ? arg0 : arg3;
			@Pc(53) int local53 = arg3 >> 1;
			@Pc(57) int local57 = arg0 >> 1;
			@Pc(59) int[] local59 = arg1;
			@Pc(64) int[] local64 = new int[local57 * local53];
			while (true) {
				OpenGL.glTexImage2Di(arg2, local38, this.method5957(), arg3, arg0, 0, 32993, this.aClass45_Sub2_Sub2_10.anInt5961, local59, 0);
				if (local49 <= 1) {
					return;
				}
				@Pc(92) int local92 = 0;
				@Pc(94) int local94 = 0;
				@Pc(98) int local98 = arg3;
				@Pc(100) int[] local100 = local64;
				for (@Pc(102) int local102 = 0; local102 < local57; local102++) {
					for (@Pc(106) int local106 = 0; local106 < local53; local106++) {
						@Pc(113) int local113 = local59[local94++];
						@Pc(118) int local118 = local59[local94++];
						@Pc(123) int local123 = local59[local98++];
						@Pc(128) int local128 = local59[local98++];
						@Pc(132) int local132 = local113 & 0xFF;
						@Pc(138) int local138 = local113 >> 8 & 0xFF;
						@Pc(144) int local144 = local113 >> 16 & 0xFF;
						@Pc(150) int local150 = local113 >> 24 & 0xFF;
						@Pc(158) int local158 = local150 + (local118 >> 24 & 0xFF);
						@Pc(164) int local164 = local132 + (local118 & 0xFF);
						@Pc(172) int local172 = local144 + (local118 >> 16 & 0xFF);
						@Pc(180) int local180 = local138 + (local118 >> 8 & 0xFF);
						@Pc(188) int local188 = local158 + (local123 >> 24 & 0xFF);
						@Pc(194) int local194 = local164 + (local123 & 0xFF);
						@Pc(202) int local202 = local180 + (local123 >> 8 & 0xFF);
						@Pc(210) int local210 = local172 + (local123 >> 16 & 0xFF);
						@Pc(218) int local218 = local188 + (local128 >> 24 & 0xFF);
						@Pc(226) int local226 = local210 + (local128 >> 16 & 0xFF);
						@Pc(234) int local234 = local202 + (local128 >> 8 & 0xFF);
						@Pc(240) int local240 = local194 + (local128 & 0xFF);
						local64[local92++] = local240 >> 2 & 0xFF | (local218 & 0x3FC) << 22 | (local226 & 0x3FC) << 14 | (local234 & 0x3FC) << 6;
					}
					local94 += arg3;
					local98 += arg3;
				}
				local64 = local59;
				arg0 = local57;
				arg3 = local53;
				local59 = local100;
				local49 >>= 0x1;
				local57 >>= 0x1;
				local53 >>= 0x1;
				local38++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!mfa", name = "f", descriptor = "(I)I")
	private int method5959() {
		@Pc(21) int local21 = this.aClass298_10.anInt7812 * this.aClass314_18.anInt8032 * this.anInt7098;
		return this.aBoolean530 ? local21 * 4 / 3 : local21;
	}

	@OriginalMember(owner = "client!mfa", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method5954();
		super.finalize();
	}

	@OriginalMember(owner = "client!mfa", name = "b", descriptor = "(Z)V")
	private void method5960() {
		this.aClass45_Sub2_Sub2_10.method4926(this);
		if (Static567.aClass71_11 == this.aClass71_9) {
			OpenGL.glTexParameteri(this.anInt7096, 10241, this.aBoolean530 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt7096, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt7096, 10241, this.aBoolean530 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt7096, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "([FIIII)V")
	protected final void method5961(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 > 0 && !Static259.method3984(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static259.method3984(arg3)) {
			@Pc(32) int local32 = this.aClass314_18.anInt8032;
			@Pc(34) int local34 = 0;
			@Pc(41) int local41 = arg3 > arg2 ? arg2 : arg3;
			@Pc(45) int local45 = arg2 >> 1;
			@Pc(49) int local49 = arg3 >> 1;
			@Pc(51) float[] local51 = arg0;
			@Pc(58) float[] local58 = new float[local49 * local45 * local32];
			while (true) {
				OpenGL.glTexImage2Df(arg1, local34, this.method5957(), arg2, arg3, 0, Static537.method7176(this.aClass314_18), 5126, local51, 0);
				if (local41 <= 1) {
					return;
				}
				@Pc(81) int local81 = local32 * arg2;
				@Pc(83) float[] local83 = local58;
				for (@Pc(85) int local85 = 0; local85 < local32; local85++) {
					@Pc(89) int local89 = local85;
					@Pc(91) int local91 = local85;
					@Pc(95) int local95 = local85 + local81;
					for (@Pc(97) int local97 = 0; local97 < local49; local97++) {
						for (@Pc(101) int local101 = 0; local101 < local45; local101++) {
							@Pc(107) float local107 = local51[local91];
							local91 += local32;
							@Pc(117) float local117 = local107 + local51[local91];
							@Pc(123) float local123 = local117 + local51[local95];
							local91 += local32;
							local95 += local32;
							@Pc(137) float local137 = local123 + local51[local95];
							local95 += local32;
							local58[local89] = local137 * 0.25F;
							local89 += local32;
						}
						local91 += local81;
						local95 += local81;
					}
				}
				local58 = local51;
				arg2 = local45;
				local51 = local83;
				arg3 = local49;
				local41 >>= 0x1;
				local34++;
				local45 >>= 0x1;
				local49 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
