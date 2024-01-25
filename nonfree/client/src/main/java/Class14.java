import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public abstract class Class14 implements Interface3 {

	@OriginalMember(owner = "client!te", name = "m", descriptor = "Lclient!gaa;")
	private Class115 aClass115_9 = Static440.aClass115_11;

	@OriginalMember(owner = "client!te", name = "n", descriptor = "Lclient!lca;")
	protected final Class203 aClass203_12;

	@OriginalMember(owner = "client!te", name = "s", descriptor = "Z")
	private final boolean aBoolean471;

	@OriginalMember(owner = "client!te", name = "x", descriptor = "Lclient!ig;")
	protected final Class155 aClass155_18;

	@OriginalMember(owner = "client!te", name = "e", descriptor = "I")
	private final int anInt6020;

	@OriginalMember(owner = "client!te", name = "g", descriptor = "I")
	protected final int anInt6022;

	@OriginalMember(owner = "client!te", name = "c", descriptor = "Lclient!hp;")
	protected final Class134_Sub1_Sub1 aClass134_Sub1_Sub1_9;

	@OriginalMember(owner = "client!te", name = "q", descriptor = "I")
	private int anInt6030;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lclient!hp;ILclient!lca;Lclient!ig;IZ)V")
	protected Class14(@OriginalArg(0) Class134_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class203 arg2, @OriginalArg(3) Class155 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aClass203_12 = arg2;
		this.aBoolean471 = arg5;
		this.aClass155_18 = arg3;
		this.anInt6020 = arg4;
		this.anInt6022 = arg1;
		this.aClass134_Sub1_Sub1_9 = arg0;
		OpenGL.glGenTextures(1, Static219.anIntArray576, 0);
		this.anInt6030 = Static219.anIntArray576[0];
		this.method4929();
		this.method4927();
	}

	@OriginalMember(owner = "client!te", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method4930();
		super.finalize();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(B)I")
	protected final int method4925() {
		if (this.aClass155_18 == Static215.aClass155_10) {
			if (Static288.aClass203_11 == this.aClass203_12) {
				return 6407;
			}
			if (Static129.aClass203_5 == this.aClass203_12) {
				return 6408;
			}
			if (Static194.aClass203_8 == this.aClass203_12) {
				return 6406;
			}
			if (this.aClass203_12 == Static565.aClass203_17) {
				return 6409;
			}
			if (Static194.aClass203_7 == this.aClass203_12) {
				return 6410;
			}
			if (this.aClass203_12 == Static457.aClass203_16) {
				return 6145;
			}
		} else if (this.aClass155_18 == Static215.aClass155_13) {
			if (this.aClass203_12 == Static288.aClass203_11) {
				return 34843;
			}
			if (Static129.aClass203_5 == this.aClass203_12) {
				return 34842;
			}
			if (this.aClass203_12 == Static194.aClass203_8) {
				return 34844;
			}
			if (this.aClass203_12 == Static565.aClass203_17) {
				return 34846;
			}
			if (Static194.aClass203_7 == this.aClass203_12) {
				return 34847;
			}
			if (this.aClass203_12 == Static457.aClass203_16) {
				return 6145;
			}
		} else if (Static215.aClass155_14 == this.aClass155_18) {
			if (Static288.aClass203_11 == this.aClass203_12) {
				return 34837;
			}
			if (Static129.aClass203_5 == this.aClass203_12) {
				return 34836;
			}
			if (this.aClass203_12 == Static194.aClass203_8) {
				return 34838;
			}
			if (Static565.aClass203_17 == this.aClass203_12) {
				return 34840;
			}
			if (this.aClass203_12 == Static194.aClass203_7) {
				return 34841;
			}
			if (Static457.aClass203_16 == this.aClass203_12) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(II)V")
	private void method4927() {
		this.aClass134_Sub1_Sub1_9.anInt8425 += this.method4934();
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(Z)V")
	private void method4929() {
		this.aClass134_Sub1_Sub1_9.method6766(this);
		if (this.aClass115_9 == Static440.aClass115_11) {
			OpenGL.glTexParameteri(this.anInt6022, 10241, this.aBoolean471 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt6022, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt6022, 10241, this.aBoolean471 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt6022, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "(Z)V")
	private void method4930() {
		if (this.anInt6030 > 0) {
			this.aClass134_Sub1_Sub1_9.method3212(this.anInt6030, this.method4934());
			this.anInt6030 = 0;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(II[BZI)V")
	protected final void method4931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 > 0 && !Static230.method3483(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static230.method3483(arg1)) {
			@Pc(34) int local34 = this.aClass203_12.anInt5023;
			@Pc(36) int local36 = 0;
			@Pc(43) int local43 = arg3 < arg1 ? arg3 : arg1;
			@Pc(47) int local47 = arg3 >> 1;
			@Pc(51) int local51 = arg1 >> 1;
			@Pc(53) byte[] local53 = arg2;
			@Pc(66) byte[] local66 = new byte[local34 * local47 * local51];
			while (true) {
				OpenGL.glTexImage2Dub(arg0, local36, this.method4925(), arg3, arg1, 0, Static28.method321(this.aClass203_12), 5121, local53, 0);
				if (local43 <= 1) {
					return;
				}
				@Pc(92) int local92 = local34 * arg3;
				@Pc(94) byte[] local94 = local66;
				for (@Pc(96) int local96 = 0; local96 < local34; local96++) {
					@Pc(100) int local100 = local96;
					@Pc(102) int local102 = local96;
					@Pc(106) int local106 = local92 + local96;
					for (@Pc(108) int local108 = 0; local108 < local51; local108++) {
						for (@Pc(112) int local112 = 0; local112 < local47; local112++) {
							@Pc(118) byte local118 = local53[local102];
							local102 += local34;
							@Pc(128) int local128 = local118 + local53[local102];
							@Pc(134) int local134 = local128 + local53[local106];
							local102 += local34;
							local106 += local34;
							@Pc(148) int local148 = local134 + local53[local106];
							local66[local100] = (byte) (local148 >> 2);
							local106 += local34;
							local100 += local34;
						}
						local102 += local92;
						local106 += local92;
					}
				}
				local66 = local53;
				local53 = local94;
				arg1 = local51;
				arg3 = local47;
				local36++;
				local51 >>= 0x1;
				local47 >>= 0x1;
				local43 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!gaa;I)V")
	@Override
	public final void method5452(@OriginalArg(0) Class115 arg0) {
		if (this.aClass115_9 != arg0) {
			this.aClass115_9 = arg0;
			this.method4929();
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
	@Override
	public final void method5454() {
		@Pc(8) int local8 = this.aClass134_Sub1_Sub1_9.method6754();
		@Pc(21) int local21 = this.aClass134_Sub1_Sub1_9.anIntArray319[local8];
		if (this.anInt6022 != local21) {
			if (local21 != 0) {
				OpenGL.glBindTexture(local21, 0);
				OpenGL.glDisable(local21);
			}
			OpenGL.glEnable(this.anInt6022);
			this.aClass134_Sub1_Sub1_9.anIntArray319[local8] = this.anInt6022;
		}
		OpenGL.glBindTexture(this.anInt6022, this.anInt6030);
	}

	@OriginalMember(owner = "client!te", name = "e", descriptor = "(Z)I")
	private int method4934() {
		@Pc(19) int local19 = this.aClass155_18.anInt4123 * this.aClass203_12.anInt5023 * this.anInt6020;
		return this.aBoolean471 ? local19 * 4 / 3 : local19;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I[FBII)V")
	protected final void method4936(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 > 0 && !Static230.method3483(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static230.method3483(arg2)) {
			@Pc(31) int local31 = this.aClass203_12.anInt5023;
			@Pc(33) int local33 = 0;
			@Pc(44) int local44 = arg0 >= arg2 ? arg2 : arg0;
			@Pc(58) int local58 = arg0 >> 1;
			@Pc(62) int local62 = arg2 >> 1;
			@Pc(64) float[] local64 = arg1;
			@Pc(71) float[] local71 = new float[local58 * local62 * local31];
			while (true) {
				OpenGL.glTexImage2Df(arg3, local33, this.method4925(), arg0, arg2, 0, Static28.method321(this.aClass203_12), 5126, local64, 0);
				if (local44 <= 1) {
					return;
				}
				@Pc(96) int local96 = local31 * arg0;
				@Pc(98) float[] local98 = local71;
				for (@Pc(100) int local100 = 0; local100 < local31; local100++) {
					@Pc(104) int local104 = local100;
					@Pc(106) int local106 = local100;
					@Pc(111) int local111 = local100 + local96;
					for (@Pc(113) int local113 = 0; local113 < local62; local113++) {
						for (@Pc(117) int local117 = 0; local117 < local58; local117++) {
							@Pc(123) float local123 = local64[local106];
							local106 += local31;
							@Pc(133) float local133 = local123 + local64[local106];
							@Pc(139) float local139 = local133 + local64[local111];
							local106 += local31;
							local111 += local31;
							@Pc(153) float local153 = local139 + local64[local111];
							local111 += local31;
							local71[local104] = local153 * 0.25F;
							local104 += local31;
						}
						local111 += local96;
						local106 += local96;
					}
				}
				local71 = local64;
				arg2 = local62;
				arg0 = local58;
				local64 = local98;
				local58 >>= 0x1;
				local62 >>= 0x1;
				local33++;
				local44 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "([IIIII)V")
	protected final void method4937(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 > 0 && !Static230.method3483(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 > 0 && !Static230.method3483(arg2)) {
			throw new IllegalArgumentException("");
		} else if (Static129.aClass203_5 == this.aClass203_12) {
			@Pc(40) int local40 = 0;
			@Pc(51) int local51 = arg2 <= arg1 ? arg2 : arg1;
			@Pc(55) int local55 = arg1 >> 1;
			@Pc(59) int local59 = arg2 >> 1;
			@Pc(61) int[] local61 = arg0;
			@Pc(66) int[] local66 = new int[local55 * local59];
			while (true) {
				OpenGL.glTexImage2Di(arg3, local40, this.method4925(), arg1, arg2, 0, 32993, this.aClass134_Sub1_Sub1_9.anInt3985, local61, 0);
				if (local51 <= 1) {
					return;
				}
				@Pc(86) int local86 = 0;
				@Pc(88) int local88 = 0;
				@Pc(93) int local93 = arg1;
				for (@Pc(95) int local95 = 0; local95 < local59; local95++) {
					for (@Pc(99) int local99 = 0; local99 < local55; local99++) {
						@Pc(106) int local106 = local61[local88++];
						@Pc(111) int local111 = local61[local93++];
						@Pc(116) int local116 = local61[local88++];
						@Pc(122) int local122 = local106 >> 16 & 0xFF;
						@Pc(126) int local126 = local106 & 0xFF;
						@Pc(131) int local131 = local61[local93++];
						@Pc(137) int local137 = local106 >> 8 & 0xFF;
						@Pc(143) int local143 = local106 >> 24 & 0xFF;
						@Pc(151) int local151 = local122 + (local116 >> 16 & 0xFF);
						@Pc(159) int local159 = local137 + (local116 >> 8 & 0xFF);
						@Pc(165) int local165 = local126 + (local116 & 0xFF);
						@Pc(173) int local173 = local143 + (local116 >> 24 & 0xFF);
						@Pc(181) int local181 = local151 + (local111 >> 16 & 0xFF);
						@Pc(189) int local189 = local173 + (local111 >> 24 & 0xFF);
						@Pc(195) int local195 = local165 + (local111 & 0xFF);
						@Pc(203) int local203 = local159 + (local111 >> 8 & 0xFF);
						@Pc(211) int local211 = local189 + (local131 >> 24 & 0xFF);
						@Pc(219) int local219 = local203 + (local131 >> 8 & 0xFF);
						@Pc(227) int local227 = local181 + (local131 >> 16 & 0xFF);
						@Pc(233) int local233 = local195 + (local131 & 0xFF);
						local66[local86++] = (local219 & 0x3FC) << 6 | (local211 & 0x3FC) << 22 | (local227 & 0x3FC) << 14 | local233 >> 2 & 0xFF;
					}
					local93 += arg1;
					local88 += arg1;
				}
				@Pc(278) int[] local278 = local66;
				local66 = local61;
				arg2 = local59;
				arg1 = local55;
				local61 = local278;
				local59 >>= 0x1;
				local40++;
				local55 >>= 0x1;
				local51 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
