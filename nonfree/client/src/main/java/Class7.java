import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public abstract class Class7 implements Interface13 {

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "Lclient!gv;")
	private Class130 aClass130_11 = Static247.aClass130_8;

	@OriginalMember(owner = "client!cl", name = "p", descriptor = "Lclient!ia;")
	protected final Class15_Sub2_Sub1 aClass15_Sub2_Sub1_10;

	@OriginalMember(owner = "client!cl", name = "z", descriptor = "I")
	private final int anInt10154;

	@OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
	protected final int anInt10141;

	@OriginalMember(owner = "client!cl", name = "h", descriptor = "Lclient!lj;")
	protected final Class200 aClass200_20;

	@OriginalMember(owner = "client!cl", name = "y", descriptor = "Lclient!pw;")
	protected final Class261 aClass261_15;

	@OriginalMember(owner = "client!cl", name = "u", descriptor = "Z")
	private final boolean aBoolean840;

	@OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
	private int anInt10143;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lclient!ia;ILclient!pw;Lclient!lj;IZ)V")
	protected Class7(@OriginalArg(0) Class15_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class261 arg2, @OriginalArg(3) Class200 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aClass15_Sub2_Sub1_10 = arg0;
		this.anInt10154 = arg4;
		this.anInt10141 = arg1;
		this.aClass200_20 = arg3;
		this.aClass261_15 = arg2;
		this.aBoolean840 = arg5;
		OpenGL.glGenTextures(1, Static164.anIntArray231, 0);
		this.anInt10143 = Static164.anIntArray231[0];
		this.method8228();
		this.method8232();
	}

	@OriginalMember(owner = "client!cl", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method8231();
		super.finalize();
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(II[IZI)V")
	protected final void method8225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 > 0 && !Static282.method4863(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg3 > 0 && !Static282.method4863(arg3)) {
			throw new IllegalArgumentException("");
		} else if (Static492.aClass261_14 == this.aClass261_15) {
			@Pc(44) int local44 = 0;
			@Pc(61) int local61 = arg3 > arg1 ? arg1 : arg3;
			@Pc(65) int local65 = arg1 >> 1;
			@Pc(69) int local69 = arg3 >> 1;
			@Pc(71) int[] local71 = arg2;
			@Pc(76) int[] local76 = new int[local69 * local65];
			while (true) {
				OpenGL.glTexImage2Di(arg0, local44, this.method8227(), arg1, arg3, 0, 32993, this.aClass15_Sub2_Sub1_10.anInt4275, local71, 0);
				if (local61 <= 1) {
					return;
				}
				@Pc(97) int local97 = 0;
				@Pc(99) int local99 = 0;
				@Pc(103) int local103 = arg1;
				for (@Pc(105) int local105 = 0; local105 < local69; local105++) {
					for (@Pc(109) int local109 = 0; local109 < local65; local109++) {
						@Pc(116) int local116 = local71[local99++];
						@Pc(121) int local121 = local71[local99++];
						@Pc(126) int local126 = local71[local103++];
						@Pc(132) int local132 = local116 >> 16 & 0xFF;
						@Pc(138) int local138 = local116 >> 8 & 0xFF;
						@Pc(144) int local144 = local116 >> 24 & 0xFF;
						@Pc(148) int local148 = local116 & 0xFF;
						@Pc(153) int local153 = local71[local103++];
						@Pc(161) int local161 = local144 + (local121 >> 24 & 0xFF);
						@Pc(169) int local169 = local132 + (local121 >> 16 & 0xFF);
						@Pc(177) int local177 = local138 + (local121 >> 8 & 0xFF);
						@Pc(183) int local183 = local148 + (local121 & 0xFF);
						@Pc(189) int local189 = local183 + (local126 & 0xFF);
						@Pc(197) int local197 = local169 + (local126 >> 16 & 0xFF);
						@Pc(205) int local205 = local177 + (local126 >> 8 & 0xFF);
						@Pc(213) int local213 = local161 + (local126 >> 24 & 0xFF);
						@Pc(221) int local221 = local213 + (local153 >> 24 & 0xFF);
						@Pc(227) int local227 = local189 + (local153 & 0xFF);
						@Pc(235) int local235 = local197 + (local153 >> 16 & 0xFF);
						@Pc(243) int local243 = local205 + (local153 >> 8 & 0xFF);
						local76[local97++] = (local235 & 0x3FC) << 14 | (local221 & 0x3FC) << 22 | (local243 & 0x3FC) << 6 | local227 >> 2 & 0xFF;
					}
					local99 += arg1;
					local103 += arg1;
				}
				@Pc(292) int[] local292 = local76;
				local76 = local71;
				local71 = local292;
				arg1 = local65;
				arg3 = local69;
				local44++;
				local65 >>= 0x1;
				local69 >>= 0x1;
				local61 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "(B)I")
	protected final int method8227() {
		if (this.aClass200_20 == Static302.aClass200_11) {
			if (Static593.aClass261_16 == this.aClass261_15) {
				return 6407;
			}
			if (this.aClass261_15 == Static492.aClass261_14) {
				return 6408;
			}
			if (Static379.aClass261_10 == this.aClass261_15) {
				return 6406;
			}
			if (Static120.aClass261_9 == this.aClass261_15) {
				return 6409;
			}
			if (Static249.aClass261_8 == this.aClass261_15) {
				return 6410;
			}
			if (Static438.aClass261_11 == this.aClass261_15) {
				return 6145;
			}
		} else if (Static302.aClass200_14 == this.aClass200_20) {
			if (this.aClass261_15 == Static593.aClass261_16) {
				return 34843;
			}
			if (this.aClass261_15 == Static492.aClass261_14) {
				return 34842;
			}
			if (this.aClass261_15 == Static379.aClass261_10) {
				return 34844;
			}
			if (this.aClass261_15 == Static120.aClass261_9) {
				return 34846;
			}
			if (this.aClass261_15 == Static249.aClass261_8) {
				return 34847;
			}
			if (this.aClass261_15 == Static438.aClass261_11) {
				return 6145;
			}
		} else if (this.aClass200_20 == Static302.aClass200_15) {
			if (Static593.aClass261_16 == this.aClass261_15) {
				return 34837;
			}
			if (this.aClass261_15 == Static492.aClass261_14) {
				return 34836;
			}
			if (Static379.aClass261_10 == this.aClass261_15) {
				return 34838;
			}
			if (this.aClass261_15 == Static120.aClass261_9) {
				return 34840;
			}
			if (this.aClass261_15 == Static249.aClass261_8) {
				return 34841;
			}
			if (this.aClass261_15 == Static438.aClass261_11) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "(I)V")
	private void method8228() {
		this.aClass15_Sub2_Sub1_10.method5414(this);
		if (Static247.aClass130_8 == this.aClass130_11) {
			OpenGL.glTexParameteri(this.anInt10141, 10241, this.aBoolean840 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt10141, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt10141, 10241, this.aBoolean840 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt10141, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIII[B)V")
	protected final void method8229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		if (arg0 > 0 && !Static282.method4863(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static282.method4863(arg1)) {
			@Pc(37) int local37 = this.aClass261_15.anInt8160;
			@Pc(39) int local39 = 0;
			@Pc(54) int local54 = arg1 > arg0 ? arg0 : arg1;
			@Pc(58) int local58 = arg0 >> 1;
			@Pc(62) int local62 = arg1 >> 1;
			@Pc(64) byte[] local64 = arg3;
			@Pc(71) byte[] local71 = new byte[local37 * local62 * local58];
			while (true) {
				OpenGL.glTexImage2Dub(arg2, local39, this.method8227(), arg0, arg1, 0, Static282.method4862(this.aClass261_15), 5121, local64, 0);
				if (local54 <= 1) {
					return;
				}
				@Pc(96) int local96 = arg0 * local37;
				for (@Pc(98) int local98 = 0; local98 < local37; local98++) {
					@Pc(102) int local102 = local98;
					@Pc(104) int local104 = local98;
					@Pc(108) int local108 = local96 + local98;
					for (@Pc(110) int local110 = 0; local110 < local62; local110++) {
						for (@Pc(114) int local114 = 0; local114 < local58; local114++) {
							@Pc(120) byte local120 = local64[local104];
							local104 += local37;
							@Pc(130) int local130 = local120 + local64[local104];
							local104 += local37;
							@Pc(140) int local140 = local130 + local64[local108];
							local108 += local37;
							@Pc(150) int local150 = local140 + local64[local108];
							local108 += local37;
							local71[local102] = (byte) (local150 >> 2);
							local102 += local37;
						}
						local104 += local96;
						local108 += local96;
					}
				}
				@Pc(191) byte[] local191 = local71;
				local71 = local64;
				arg0 = local58;
				local64 = local191;
				arg1 = local62;
				local54 >>= 0x1;
				local62 >>= 0x1;
				local39++;
				local58 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
	@Override
	public final void method8223() {
		@Pc(12) int local12 = this.aClass15_Sub2_Sub1_10.method5363();
		@Pc(18) int local18 = this.aClass15_Sub2_Sub1_10.anIntArray276[local12];
		if (local18 != this.anInt10141) {
			if (local18 != 0) {
				OpenGL.glBindTexture(local18, 0);
				OpenGL.glDisable(local18);
			}
			OpenGL.glEnable(this.anInt10141);
			this.aClass15_Sub2_Sub1_10.anIntArray276[local12] = this.anInt10141;
		}
		OpenGL.glBindTexture(this.anInt10141, this.anInt10143);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!gv;I)V")
	@Override
	public final void method8222(@OriginalArg(0) Class130 arg0) {
		if (this.aClass130_11 != arg0) {
			this.aClass130_11 = arg0;
			this.method8228();
		}
	}

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "(I)V")
	private void method8231() {
		if (this.anInt10143 > 0) {
			this.aClass15_Sub2_Sub1_10.method3628(this.anInt10143, this.method8234());
			this.anInt10143 = 0;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)V")
	private void method8232() {
		this.aClass15_Sub2_Sub1_10.anInt6517 += this.method8234();
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(II[FIB)V")
	protected final void method8233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3) {
		if (arg3 > 0 && !Static282.method4863(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static282.method4863(arg1)) {
			@Pc(38) int local38 = this.aClass261_15.anInt8160;
			@Pc(40) int local40 = 0;
			@Pc(51) int local51 = arg3 >= arg1 ? arg1 : arg3;
			@Pc(55) int local55 = arg3 >> 1;
			@Pc(59) int local59 = arg1 >> 1;
			@Pc(61) float[] local61 = arg2;
			@Pc(68) float[] local68 = new float[local59 * local55 * local38];
			while (true) {
				OpenGL.glTexImage2Df(arg0, local40, this.method8227(), arg3, arg1, 0, Static282.method4862(this.aClass261_15), 5126, local61, 0);
				if (local51 <= 1) {
					return;
				}
				@Pc(94) int local94 = local38 * arg3;
				for (@Pc(96) int local96 = 0; local96 < local38; local96++) {
					@Pc(100) int local100 = local96;
					@Pc(102) int local102 = local96;
					@Pc(106) int local106 = local96 + local94;
					for (@Pc(108) int local108 = 0; local108 < local59; local108++) {
						for (@Pc(112) int local112 = 0; local112 < local55; local112++) {
							@Pc(118) float local118 = local61[local102];
							local102 += local38;
							@Pc(128) float local128 = local118 + local61[local102];
							@Pc(134) float local134 = local128 + local61[local106];
							local102 += local38;
							local106 += local38;
							@Pc(148) float local148 = local134 + local61[local106];
							local68[local100] = local148 * 0.25F;
							local106 += local38;
							local100 += local38;
						}
						local106 += local94;
						local102 += local94;
					}
				}
				@Pc(192) float[] local192 = local68;
				local68 = local61;
				local61 = local192;
				arg1 = local59;
				arg3 = local55;
				local59 >>= 0x1;
				local55 >>= 0x1;
				local40++;
				local51 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "(B)I")
	private int method8234() {
		@Pc(20) int local20 = this.aClass261_15.anInt8160 * this.aClass200_20.anInt6064 * this.anInt10154;
		return this.aBoolean840 ? local20 * 4 / 3 : local20;
	}
}
