import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public abstract class Class93 implements Interface3 {

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "Lclient!wga;")
	private Class385 aClass385_33 = Static198.aClass385_42;

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
	private final int anInt9303;

	@OriginalMember(owner = "client!pg", name = "w", descriptor = "Lclient!sw;")
	protected final Class327 aClass327_16;

	@OriginalMember(owner = "client!pg", name = "m", descriptor = "Lclient!pa;")
	protected final Class13_Sub1_Sub1 aClass13_Sub1_Sub1_11;

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "Lclient!ig;")
	protected final Class152 aClass152_20;

	@OriginalMember(owner = "client!pg", name = "u", descriptor = "Z")
	private final boolean aBoolean721;

	@OriginalMember(owner = "client!pg", name = "v", descriptor = "I")
	protected final int anInt9318;

	@OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
	private int anInt9308;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lclient!pa;ILclient!sw;Lclient!ig;IZ)V")
	protected Class93(@OriginalArg(0) Class13_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class327 arg2, @OriginalArg(3) Class152 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt9303 = arg4;
		this.aClass327_16 = arg2;
		this.aClass13_Sub1_Sub1_11 = arg0;
		this.aClass152_20 = arg3;
		this.aBoolean721 = arg5;
		this.anInt9318 = arg1;
		OpenGL.glGenTextures(1, Static671.anIntArray957, 0);
		this.anInt9308 = Static671.anIntArray957[0];
		this.method8139();
		this.method8143();
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)V")
	private void method8139() {
		this.aClass13_Sub1_Sub1_11.method7530(this);
		if (this.aClass385_33 == Static198.aClass385_42) {
			OpenGL.glTexParameteri(this.anInt9318, 10241, this.aBoolean721 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt9318, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt9318, 10241, this.aBoolean721 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt9318, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
	@Override
	public final void method8138() {
		@Pc(8) int local8 = this.aClass13_Sub1_Sub1_11.method7473();
		@Pc(14) int local14 = this.aClass13_Sub1_Sub1_11.anIntArray633[local8];
		if (this.anInt9318 != local14) {
			if (local14 != 0) {
				OpenGL.glBindTexture(local14, 0);
				OpenGL.glDisable(local14);
			}
			OpenGL.glEnable(this.anInt9318);
			this.aClass13_Sub1_Sub1_11.anIntArray633[local8] = this.anInt9318;
		}
		OpenGL.glBindTexture(this.anInt9318, this.anInt9308);
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(B)V")
	private void method8141() {
		if (this.anInt9308 > 0) {
			this.aClass13_Sub1_Sub1_11.method6534(this.anInt9308, this.method8145());
			this.anInt9308 = 0;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IZ)V")
	private void method8143() {
		this.aClass13_Sub1_Sub1_11.anInt8588 += this.method8145();
	}

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "(I)I")
	protected final int method8144() {
		if (this.aClass152_20 == Static246.aClass152_10) {
			if (Static357.aClass327_14 == this.aClass327_16) {
				return 6407;
			}
			if (this.aClass327_16 == Static419.aClass327_2) {
				return 6408;
			}
			if (this.aClass327_16 == Static337.aClass327_12) {
				return 6406;
			}
			if (Static276.aClass327_10 == this.aClass327_16) {
				return 6409;
			}
			if (Static338.aClass327_13 == this.aClass327_16) {
				return 6410;
			}
			if (Static181.aClass327_5 == this.aClass327_16) {
				return 6145;
			}
		} else if (Static246.aClass152_13 == this.aClass152_20) {
			if (this.aClass327_16 == Static357.aClass327_14) {
				return 34843;
			}
			if (Static419.aClass327_2 == this.aClass327_16) {
				return 34842;
			}
			if (Static337.aClass327_12 == this.aClass327_16) {
				return 34844;
			}
			if (this.aClass327_16 == Static276.aClass327_10) {
				return 34846;
			}
			if (this.aClass327_16 == Static338.aClass327_13) {
				return 34847;
			}
			if (Static181.aClass327_5 == this.aClass327_16) {
				return 6145;
			}
		} else if (this.aClass152_20 == Static246.aClass152_14) {
			if (Static357.aClass327_14 == this.aClass327_16) {
				return 34837;
			}
			if (Static419.aClass327_2 == this.aClass327_16) {
				return 34836;
			}
			if (Static337.aClass327_12 == this.aClass327_16) {
				return 34838;
			}
			if (this.aClass327_16 == Static276.aClass327_10) {
				return 34840;
			}
			if (Static338.aClass327_13 == this.aClass327_16) {
				return 34841;
			}
			if (Static181.aClass327_5 == this.aClass327_16) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "(I)I")
	private int method8145() {
		@Pc(22) int local22 = this.anInt9303 * this.aClass152_20.anInt4478 * this.aClass327_16.anInt9117;
		return this.aBoolean721 ? local22 * 4 / 3 : local22;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(B[BIII)V")
	protected final void method8146(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 > 0 && !Static129.method2437(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static129.method2437(arg2)) {
			@Pc(31) int local31 = this.aClass327_16.anInt9117;
			@Pc(33) int local33 = 0;
			@Pc(40) int local40 = arg1 < arg2 ? arg1 : arg2;
			@Pc(44) int local44 = arg1 >> 1;
			@Pc(54) int local54 = arg2 >> 1;
			@Pc(56) byte[] local56 = arg0;
			@Pc(63) byte[] local63 = new byte[local31 * local54 * local44];
			while (true) {
				OpenGL.glTexImage2Dub(arg3, local33, this.method8144(), arg1, arg2, 0, Static282.method4524(this.aClass327_16), 5121, local56, 0);
				if (local40 <= 1) {
					return;
				}
				@Pc(89) int local89 = arg1 * local31;
				for (@Pc(91) int local91 = 0; local91 < local31; local91++) {
					@Pc(95) int local95 = local91;
					@Pc(97) int local97 = local91;
					@Pc(101) int local101 = local89 + local91;
					for (@Pc(103) int local103 = 0; local103 < local54; local103++) {
						for (@Pc(107) int local107 = 0; local107 < local44; local107++) {
							@Pc(113) byte local113 = local56[local97];
							local97 += local31;
							@Pc(123) int local123 = local113 + local56[local97];
							local97 += local31;
							@Pc(133) int local133 = local123 + local56[local101];
							local101 += local31;
							@Pc(143) int local143 = local133 + local56[local101];
							local101 += local31;
							local63[local95] = (byte) (local143 >> 2);
							local95 += local31;
						}
						local97 += local89;
						local101 += local89;
					}
				}
				@Pc(184) byte[] local184 = local63;
				local63 = local56;
				local56 = local184;
				arg1 = local44;
				arg2 = local54;
				local40 >>= 0x1;
				local44 >>= 0x1;
				local33++;
				local54 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILclient!wga;)V")
	@Override
	public final void method8137(@OriginalArg(1) Class385 arg0) {
		if (arg0 != this.aClass385_33) {
			this.aClass385_33 = arg0;
			this.method8139();
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(II[FII)V")
	protected final void method8147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 > 0 && !Static129.method2437(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static129.method2437(arg0)) {
			@Pc(41) int local41 = this.aClass327_16.anInt9117;
			@Pc(43) int local43 = 0;
			@Pc(54) int local54 = arg0 <= arg1 ? arg0 : arg1;
			@Pc(58) int local58 = arg1 >> 1;
			@Pc(62) int local62 = arg0 >> 1;
			@Pc(64) float[] local64 = arg2;
			@Pc(71) float[] local71 = new float[local41 * local58 * local62];
			while (true) {
				OpenGL.glTexImage2Df(arg3, local43, this.method8144(), arg1, arg0, 0, Static282.method4524(this.aClass327_16), 5126, local64, 0);
				if (local54 <= 1) {
					return;
				}
				@Pc(94) int local94 = arg1 * local41;
				for (@Pc(96) int local96 = 0; local96 < local41; local96++) {
					@Pc(100) int local100 = local96;
					@Pc(102) int local102 = local96;
					@Pc(106) int local106 = local94 + local96;
					for (@Pc(108) int local108 = 0; local108 < local62; local108++) {
						for (@Pc(112) int local112 = 0; local112 < local58; local112++) {
							@Pc(118) float local118 = local64[local102];
							local102 += local41;
							@Pc(128) float local128 = local118 + local64[local102];
							@Pc(134) float local134 = local128 + local64[local106];
							local102 += local41;
							local106 += local41;
							@Pc(148) float local148 = local134 + local64[local106];
							local106 += local41;
							local71[local100] = local148 * 0.25F;
							local100 += local41;
						}
						local106 += local94;
						local102 += local94;
					}
				}
				@Pc(188) float[] local188 = local71;
				local71 = local64;
				local64 = local188;
				arg1 = local58;
				arg0 = local62;
				local54 >>= 0x1;
				local62 >>= 0x1;
				local58 >>= 0x1;
				local43++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "([IIIZI)V")
	protected final void method8150(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 > 0 && !Static129.method2437(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 > 0 && !Static129.method2437(arg3)) {
			throw new IllegalArgumentException("");
		} else if (this.aClass327_16 == Static419.aClass327_2) {
			@Pc(44) int local44 = 0;
			@Pc(51) int local51 = arg3 <= arg2 ? arg3 : arg2;
			@Pc(55) int local55 = arg2 >> 1;
			@Pc(63) int local63 = arg3 >> 1;
			@Pc(65) int[] local65 = arg0;
			@Pc(70) int[] local70 = new int[local63 * local55];
			while (true) {
				OpenGL.glTexImage2Di(arg1, local44, this.method8144(), arg2, arg3, 0, 32993, this.aClass13_Sub1_Sub1_11.anInt7382, local65, 0);
				if (local51 <= 1) {
					return;
				}
				@Pc(90) int local90 = 0;
				@Pc(92) int local92 = 0;
				@Pc(96) int local96 = arg2;
				@Pc(98) int[] local98 = local70;
				for (@Pc(100) int local100 = 0; local100 < local63; local100++) {
					for (@Pc(104) int local104 = 0; local104 < local55; local104++) {
						@Pc(111) int local111 = local65[local92++];
						@Pc(116) int local116 = local65[local96++];
						@Pc(121) int local121 = local65[local92++];
						@Pc(127) int local127 = local111 >> 24 & 0xFF;
						@Pc(133) int local133 = local111 >> 8 & 0xFF;
						@Pc(139) int local139 = local111 >> 16 & 0xFF;
						@Pc(144) int local144 = local65[local96++];
						@Pc(148) int local148 = local111 & 0xFF;
						@Pc(156) int local156 = local127 + (local121 >> 24 & 0xFF);
						@Pc(164) int local164 = local133 + (local121 >> 8 & 0xFF);
						@Pc(170) int local170 = local148 + (local121 & 0xFF);
						@Pc(178) int local178 = local139 + (local121 >> 16 & 0xFF);
						@Pc(186) int local186 = local178 + (local116 >> 16 & 0xFF);
						@Pc(194) int local194 = local156 + (local116 >> 24 & 0xFF);
						@Pc(200) int local200 = local170 + (local116 & 0xFF);
						@Pc(208) int local208 = local164 + (local116 >> 8 & 0xFF);
						@Pc(216) int local216 = local208 + (local144 >> 8 & 0xFF);
						@Pc(224) int local224 = local194 + (local144 >> 24 & 0xFF);
						@Pc(232) int local232 = local186 + (local144 >> 16 & 0xFF);
						@Pc(238) int local238 = local200 + (local144 & 0xFF);
						local70[local90++] = (local232 & 0x3FC) << 14 | (local224 & 0x3FC) << 22 | (local216 & 0x3FC) << 6 | local238 >> 2 & 0xFF;
					}
					local96 += arg2;
					local92 += arg2;
				}
				local70 = local65;
				local65 = local98;
				arg2 = local55;
				arg3 = local63;
				local51 >>= 0x1;
				local63 >>= 0x1;
				local55 >>= 0x1;
				local44++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!pg", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method8141();
		super.finalize();
	}
}
