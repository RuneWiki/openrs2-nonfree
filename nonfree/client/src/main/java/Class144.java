import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public abstract class Class144 implements Interface11 {

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "Lclient!qq;")
	private Class240 aClass240_10 = Static539.aClass240_11;

	@OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
	protected final int anInt8539;

	@OriginalMember(owner = "client!ld", name = "i", descriptor = "Lclient!qba;")
	protected final Class39_Sub2_Sub2 aClass39_Sub2_Sub2_10;

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "Lclient!lc;")
	protected final Class171 aClass171_20;

	@OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
	private final int anInt8535;

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "Lclient!jt;")
	protected final Class150 aClass150_15;

	@OriginalMember(owner = "client!ld", name = "u", descriptor = "Z")
	private final boolean aBoolean615;

	@OriginalMember(owner = "client!ld", name = "x", descriptor = "I")
	private int anInt8547;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!qba;ILclient!jt;Lclient!lc;IZ)V")
	protected Class144(@OriginalArg(0) Class39_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class150 arg2, @OriginalArg(3) Class171 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt8539 = arg1;
		this.aClass39_Sub2_Sub2_10 = arg0;
		this.aClass171_20 = arg3;
		this.anInt8535 = arg4;
		this.aClass150_15 = arg2;
		this.aBoolean615 = arg5;
		OpenGL.glGenTextures(1, Static426.anIntArray601, 0);
		this.anInt8547 = Static426.anIntArray601[0];
		this.method7137();
		this.method7132();
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)V")
	private void method7132() {
		this.aClass39_Sub2_Sub2_10.anInt7274 += this.method7135();
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "([BIIIZ)V")
	protected final void method7133(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 > 0 && !Static150.method2607(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static150.method2607(arg3)) {
			@Pc(41) int local41 = this.aClass150_15.anInt4202;
			@Pc(43) int local43 = 0;
			@Pc(50) int local50 = arg2 >= arg3 ? arg3 : arg2;
			@Pc(54) int local54 = arg2 >> 1;
			@Pc(58) int local58 = arg3 >> 1;
			@Pc(60) byte[] local60 = arg0;
			@Pc(67) byte[] local67 = new byte[local41 * local54 * local58];
			while (true) {
				OpenGL.glTexImage2Dub(arg1, local43, this.method7134(), arg2, arg3, 0, Static126.method6453(this.aClass150_15), 5121, local60, 0);
				if (local50 <= 1) {
					return;
				}
				@Pc(93) int local93 = local41 * arg2;
				@Pc(95) byte[] local95 = local67;
				for (@Pc(97) int local97 = 0; local97 < local41; local97++) {
					@Pc(101) int local101 = local97;
					@Pc(103) int local103 = local97;
					@Pc(107) int local107 = local97 + local93;
					for (@Pc(109) int local109 = 0; local109 < local58; local109++) {
						for (@Pc(113) int local113 = 0; local113 < local54; local113++) {
							@Pc(119) byte local119 = local60[local103];
							local103 += local41;
							@Pc(129) int local129 = local119 + local60[local103];
							@Pc(135) int local135 = local129 + local60[local107];
							local103 += local41;
							local107 += local41;
							@Pc(149) int local149 = local135 + local60[local107];
							local67[local101] = (byte) (local149 >> 2);
							local107 += local41;
							local101 += local41;
						}
						local103 += local93;
						local107 += local93;
					}
				}
				local67 = local60;
				local60 = local95;
				arg3 = local58;
				arg2 = local54;
				local54 >>= 0x1;
				local50 >>= 0x1;
				local43++;
				local58 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "(I)I")
	protected final int method7134() {
		if (Static268.aClass171_10 == this.aClass171_20) {
			if (Static297.aClass150_11 == this.aClass150_15) {
				return 6407;
			}
			if (this.aClass150_15 == Static51.aClass150_1) {
				return 6408;
			}
			if (this.aClass150_15 == Static160.aClass150_3) {
				return 6406;
			}
			if (Static225.aClass150_9 == this.aClass150_15) {
				return 6409;
			}
			if (Static189.aClass150_4 == this.aClass150_15) {
				return 6410;
			}
			if (Static120.aClass150_2 == this.aClass150_15) {
				return 6145;
			}
		} else if (Static268.aClass171_13 == this.aClass171_20) {
			if (this.aClass150_15 == Static297.aClass150_11) {
				return 34843;
			}
			if (Static51.aClass150_1 == this.aClass150_15) {
				return 34842;
			}
			if (this.aClass150_15 == Static160.aClass150_3) {
				return 34844;
			}
			if (Static225.aClass150_9 == this.aClass150_15) {
				return 34846;
			}
			if (this.aClass150_15 == Static189.aClass150_4) {
				return 34847;
			}
			if (Static120.aClass150_2 == this.aClass150_15) {
				return 6145;
			}
		} else if (Static268.aClass171_14 == this.aClass171_20) {
			if (this.aClass150_15 == Static297.aClass150_11) {
				return 34837;
			}
			if (Static51.aClass150_1 == this.aClass150_15) {
				return 34836;
			}
			if (this.aClass150_15 == Static160.aClass150_3) {
				return 34838;
			}
			if (this.aClass150_15 == Static225.aClass150_9) {
				return 34840;
			}
			if (this.aClass150_15 == Static189.aClass150_4) {
				return 34841;
			}
			if (Static120.aClass150_2 == this.aClass150_15) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)I")
	private int method7135() {
		@Pc(14) int local14 = this.aClass150_15.anInt4202 * this.aClass171_20.anInt4927 * this.anInt8535;
		return this.aBoolean615 ? local14 * 4 / 3 : local14;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V")
	private void method7137() {
		this.aClass39_Sub2_Sub2_10.method6179(this);
		if (Static539.aClass240_11 == this.aClass240_10) {
			OpenGL.glTexParameteri(this.anInt8539, 10241, this.aBoolean615 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt8539, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt8539, 10241, this.aBoolean615 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt8539, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V")
	@Override
	public final void method7131() {
		@Pc(8) int local8 = this.aClass39_Sub2_Sub2_10.method6175();
		@Pc(18) int local18 = this.aClass39_Sub2_Sub2_10.anIntArray570[local8];
		if (local18 != this.anInt8539) {
			if (local18 != 0) {
				OpenGL.glBindTexture(local18, 0);
				OpenGL.glDisable(local18);
			}
			OpenGL.glEnable(this.anInt8539);
			this.aClass39_Sub2_Sub2_10.anIntArray570[local8] = this.anInt8539;
		}
		OpenGL.glBindTexture(this.anInt8539, this.anInt8547);
	}

	@OriginalMember(owner = "client!ld", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7138();
		super.finalize();
	}

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "(I)V")
	private void method7138() {
		if (this.anInt8547 > 0) {
			this.aClass39_Sub2_Sub2_10.method6224(this.anInt8547, this.method7135());
			this.anInt8547 = 0;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(III[II)V")
	protected final void method7141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 > 0 && !Static150.method2607(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg0 > 0 && !Static150.method2607(arg0)) {
			throw new IllegalArgumentException("");
		} else if (this.aClass150_15 == Static51.aClass150_1) {
			@Pc(44) int local44 = 0;
			@Pc(51) int local51 = arg1 < arg0 ? arg1 : arg0;
			@Pc(55) int local55 = arg1 >> 1;
			@Pc(59) int local59 = arg0 >> 1;
			@Pc(61) int[] local61 = arg2;
			@Pc(66) int[] local66 = new int[local55 * local59];
			while (true) {
				OpenGL.glTexImage2Di(arg3, local44, this.method7134(), arg1, arg0, 0, 32993, this.aClass39_Sub2_Sub2_10.anInt7396, local61, 0);
				if (local51 <= 1) {
					return;
				}
				@Pc(93) int local93 = 0;
				@Pc(95) int local95 = 0;
				@Pc(100) int local100 = arg1;
				for (@Pc(102) int local102 = 0; local102 < local59; local102++) {
					for (@Pc(106) int local106 = 0; local106 < local55; local106++) {
						@Pc(113) int local113 = local61[local95++];
						@Pc(118) int local118 = local61[local95++];
						@Pc(123) int local123 = local61[local100++];
						@Pc(127) int local127 = local113 & 0xFF;
						@Pc(132) int local132 = local61[local100++];
						@Pc(138) int local138 = local113 >> 24 & 0xFF;
						@Pc(144) int local144 = local113 >> 8 & 0xFF;
						@Pc(150) int local150 = local113 >> 16 & 0xFF;
						@Pc(158) int local158 = local150 + (local118 >> 16 & 0xFF);
						@Pc(166) int local166 = local138 + (local118 >> 24 & 0xFF);
						@Pc(174) int local174 = local144 + (local118 >> 8 & 0xFF);
						@Pc(180) int local180 = local127 + (local118 & 0xFF);
						@Pc(188) int local188 = local174 + (local123 >> 8 & 0xFF);
						@Pc(194) int local194 = local180 + (local123 & 0xFF);
						@Pc(202) int local202 = local166 + (local123 >> 24 & 0xFF);
						@Pc(210) int local210 = local158 + (local123 >> 16 & 0xFF);
						@Pc(218) int local218 = local202 + (local132 >> 24 & 0xFF);
						@Pc(224) int local224 = local194 + (local132 & 0xFF);
						@Pc(232) int local232 = local188 + (local132 >> 8 & 0xFF);
						@Pc(240) int local240 = local210 + (local132 >> 16 & 0xFF);
						local66[local93++] = local224 >> 2 & 0xFF | (local240 & 0x3FC) << 14 | (local218 & 0x3FC) << 22 | (local232 & 0x3FC) << 6;
					}
					local100 += arg1;
					local95 += arg1;
				}
				@Pc(289) int[] local289 = local66;
				local66 = local61;
				arg0 = local59;
				local61 = local289;
				arg1 = local55;
				local44++;
				local55 >>= 0x1;
				local51 >>= 0x1;
				local59 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!qq;I)V")
	@Override
	public final void method7130(@OriginalArg(0) Class240 arg0) {
		if (arg0 != this.aClass240_10) {
			this.aClass240_10 = arg0;
			this.method7137();
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(III[FI)V")
	protected final void method7142(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 > 0 && !Static150.method2607(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static150.method2607(arg0)) {
			@Pc(36) int local36 = this.aClass150_15.anInt4202;
			@Pc(45) int local45 = 0;
			@Pc(52) int local52 = arg0 > arg1 ? arg1 : arg0;
			@Pc(56) int local56 = arg1 >> 1;
			@Pc(60) int local60 = arg0 >> 1;
			@Pc(62) float[] local62 = arg2;
			@Pc(69) float[] local69 = new float[local36 * local56 * local60];
			while (true) {
				OpenGL.glTexImage2Df(arg3, local45, this.method7134(), arg1, arg0, 0, Static126.method6453(this.aClass150_15), 5126, local62, 0);
				if (local52 <= 1) {
					return;
				}
				@Pc(94) int local94 = arg1 * local36;
				for (@Pc(96) int local96 = 0; local96 < local36; local96++) {
					@Pc(100) int local100 = local96;
					@Pc(102) int local102 = local96;
					@Pc(106) int local106 = local96 + local94;
					for (@Pc(108) int local108 = 0; local108 < local60; local108++) {
						for (@Pc(112) int local112 = 0; local112 < local56; local112++) {
							@Pc(118) float local118 = local62[local102];
							local102 += local36;
							@Pc(128) float local128 = local118 + local62[local102];
							@Pc(134) float local134 = local128 + local62[local106];
							local102 += local36;
							local106 += local36;
							@Pc(148) float local148 = local134 + local62[local106];
							local69[local100] = local148 * 0.25F;
							local106 += local36;
							local100 += local36;
						}
						local102 += local94;
						local106 += local94;
					}
				}
				@Pc(196) float[] local196 = local69;
				local69 = local62;
				local62 = local196;
				arg1 = local56;
				arg0 = local60;
				local60 >>= 0x1;
				local56 >>= 0x1;
				local45++;
				local52 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
