import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!av")
public abstract class Class19 implements Interface11 {

	@OriginalMember(owner = "client!av", name = "d", descriptor = "[C")
	public static final char[] aCharArray10 = new char[64];

	@OriginalMember(owner = "client!av", name = "e", descriptor = "Lclient!gw;")
	private Class123 aClass123_13 = Static40.aClass123_9;

	@OriginalMember(owner = "client!av", name = "z", descriptor = "I")
	protected final int anInt8940;

	@OriginalMember(owner = "client!av", name = "w", descriptor = "Lclient!ro;")
	protected final Class292 aClass292_20;

	@OriginalMember(owner = "client!av", name = "A", descriptor = "Lclient!jq;")
	protected final Class43_Sub1_Sub2 aClass43_Sub1_Sub2_12;

	@OriginalMember(owner = "client!av", name = "a", descriptor = "Z")
	private final boolean aBoolean699;

	@OriginalMember(owner = "client!av", name = "h", descriptor = "I")
	private final int anInt8926;

	@OriginalMember(owner = "client!av", name = "o", descriptor = "Lclient!fda;")
	protected final Class93 aClass93_12;

	@OriginalMember(owner = "client!av", name = "j", descriptor = "I")
	private int anInt8928;

	static {
		for (@Pc(4) int local4 = 0; local4 < 26; local4++) {
			aCharArray10[local4] = (char) (local4 + 65);
		}
		for (@Pc(20) int local20 = 26; local20 < 52; local20++) {
			aCharArray10[local20] = (char) (local20 + 97 - 26);
		}
		for (@Pc(38) int local38 = 52; local38 < 62; local38++) {
			aCharArray10[local38] = (char) (local38 + 48 - 52);
		}
		aCharArray10[63] = '-';
		aCharArray10[62] = '*';
	}

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Lclient!jq;ILclient!fda;Lclient!ro;IZ)V")
	protected Class19(@OriginalArg(0) Class43_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93 arg2, @OriginalArg(3) Class292 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt8940 = arg1;
		this.aClass292_20 = arg3;
		this.aClass43_Sub1_Sub2_12 = arg0;
		this.aBoolean699 = arg5;
		this.anInt8926 = arg4;
		this.aClass93_12 = arg2;
		OpenGL.glGenTextures(1, Static433.anIntArray565, 0);
		this.anInt8928 = Static433.anIntArray565[0];
		this.method7429();
		this.method7431();
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(B)V")
	private void method7424() {
		if (this.anInt8928 > 0) {
			this.aClass43_Sub1_Sub2_12.method4308(this.anInt8928, this.method7435());
			this.anInt8928 = 0;
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IIII[I)V")
	protected final void method7427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg0 > 0 && !Static159.method2855(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg2 > 0 && !Static159.method2855(arg2)) {
			throw new IllegalArgumentException("");
		} else if (this.aClass93_12 == Static581.aClass93_14) {
			@Pc(42) int local42 = 0;
			@Pc(49) int local49 = arg2 <= arg0 ? arg2 : arg0;
			@Pc(53) int local53 = arg0 >> 1;
			@Pc(57) int local57 = arg2 >> 1;
			@Pc(59) int[] local59 = arg3;
			@Pc(64) int[] local64 = new int[local57 * local53];
			while (true) {
				OpenGL.glTexImage2Di(arg1, local42, this.method7428(), arg0, arg2, 0, 32993, this.aClass43_Sub1_Sub2_12.anInt4926, local59, 0);
				if (local49 <= 1) {
					return;
				}
				@Pc(86) int local86 = 0;
				@Pc(88) int local88 = 0;
				@Pc(92) int local92 = arg0;
				for (@Pc(94) int local94 = 0; local94 < local57; local94++) {
					for (@Pc(98) int local98 = 0; local98 < local53; local98++) {
						@Pc(105) int local105 = local59[local88++];
						@Pc(110) int local110 = local59[local92++];
						@Pc(115) int local115 = local59[local88++];
						@Pc(120) int local120 = local59[local92++];
						@Pc(124) int local124 = local105 & 0xFF;
						@Pc(130) int local130 = local105 >> 24 & 0xFF;
						@Pc(136) int local136 = local105 >> 8 & 0xFF;
						@Pc(142) int local142 = local105 >> 16 & 0xFF;
						@Pc(150) int local150 = local142 + (local115 >> 16 & 0xFF);
						@Pc(156) int local156 = local124 + (local115 & 0xFF);
						@Pc(164) int local164 = local130 + (local115 >> 24 & 0xFF);
						@Pc(172) int local172 = local136 + (local115 >> 8 & 0xFF);
						@Pc(180) int local180 = local172 + (local110 >> 8 & 0xFF);
						@Pc(186) int local186 = local156 + (local110 & 0xFF);
						@Pc(194) int local194 = local164 + (local110 >> 24 & 0xFF);
						@Pc(202) int local202 = local150 + (local110 >> 16 & 0xFF);
						@Pc(208) int local208 = local186 + (local120 & 0xFF);
						@Pc(216) int local216 = local180 + (local120 >> 8 & 0xFF);
						@Pc(224) int local224 = local194 + (local120 >> 24 & 0xFF);
						@Pc(232) int local232 = local202 + (local120 >> 16 & 0xFF);
						local64[local86++] = local208 >> 2 & 0xFF | (local232 & 0x3FC) << 14 | (local224 & 0x3FC) << 22 | (local216 & 0x3FC) << 6;
					}
					local92 += arg0;
					local88 += arg0;
				}
				@Pc(281) int[] local281 = local64;
				local64 = local59;
				arg2 = local57;
				local59 = local281;
				arg0 = local53;
				local42++;
				local53 >>= 0x1;
				local49 >>= 0x1;
				local57 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!av", name = "f", descriptor = "(I)I")
	protected final int method7428() {
		if (this.aClass292_20 == Static461.aClass292_14) {
			if (this.aClass93_12 == Static146.aClass93_6) {
				return 6407;
			}
			if (this.aClass93_12 == Static581.aClass93_14) {
				return 6408;
			}
			if (Static563.aClass93_13 == this.aClass93_12) {
				return 6406;
			}
			if (Static423.aClass93_9 == this.aClass93_12) {
				return 6409;
			}
			if (Static58.aClass93_4 == this.aClass93_12) {
				return 6410;
			}
			if (Static586.aClass93_15 == this.aClass93_12) {
				return 6145;
			}
		} else if (this.aClass292_20 == Static461.aClass292_17) {
			if (this.aClass93_12 == Static146.aClass93_6) {
				return 34843;
			}
			if (Static581.aClass93_14 == this.aClass93_12) {
				return 34842;
			}
			if (Static563.aClass93_13 == this.aClass93_12) {
				return 34844;
			}
			if (this.aClass93_12 == Static423.aClass93_9) {
				return 34846;
			}
			if (Static58.aClass93_4 == this.aClass93_12) {
				return 34847;
			}
			if (Static586.aClass93_15 == this.aClass93_12) {
				return 6145;
			}
		} else if (Static461.aClass292_18 == this.aClass292_20) {
			if (this.aClass93_12 == Static146.aClass93_6) {
				return 34837;
			}
			if (Static581.aClass93_14 == this.aClass93_12) {
				return 34836;
			}
			if (this.aClass93_12 == Static563.aClass93_13) {
				return 34838;
			}
			if (Static423.aClass93_9 == this.aClass93_12) {
				return 34840;
			}
			if (this.aClass93_12 == Static58.aClass93_4) {
				return 34841;
			}
			if (this.aClass93_12 == Static586.aClass93_15) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(B)V")
	private void method7429() {
		this.aClass43_Sub1_Sub2_12.method4298(this);
		if (this.aClass123_13 == Static40.aClass123_9) {
			OpenGL.glTexParameteri(this.anInt8940, 10241, this.aBoolean699 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt8940, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt8940, 10241, this.aBoolean699 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt8940, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IIIZ[B)V")
	protected final void method7430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3) {
		if (arg0 > 0 && !Static159.method2855(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static159.method2855(arg1)) {
			@Pc(37) int local37 = this.aClass93_12.anInt2936;
			@Pc(39) int local39 = 0;
			@Pc(50) int local50 = arg1 <= arg0 ? arg1 : arg0;
			@Pc(54) int local54 = arg0 >> 1;
			@Pc(58) int local58 = arg1 >> 1;
			@Pc(60) byte[] local60 = arg3;
			@Pc(67) byte[] local67 = new byte[local54 * local58 * local37];
			while (true) {
				OpenGL.glTexImage2Dub(arg2, local39, this.method7428(), arg0, arg1, 0, Static428.method1615(this.aClass93_12), 5121, local60, 0);
				if (local50 <= 1) {
					return;
				}
				@Pc(92) int local92 = local37 * arg0;
				@Pc(94) byte[] local94 = local67;
				for (@Pc(96) int local96 = 0; local96 < local37; local96++) {
					@Pc(100) int local100 = local96;
					@Pc(102) int local102 = local96;
					@Pc(106) int local106 = local92 + local96;
					for (@Pc(108) int local108 = 0; local108 < local58; local108++) {
						for (@Pc(112) int local112 = 0; local112 < local54; local112++) {
							@Pc(118) byte local118 = local60[local102];
							local102 += local37;
							@Pc(128) int local128 = local118 + local60[local102];
							@Pc(134) int local134 = local128 + local60[local106];
							local102 += local37;
							local106 += local37;
							@Pc(148) int local148 = local134 + local60[local106];
							local67[local100] = (byte) (local148 >> 2);
							local106 += local37;
							local100 += local37;
						}
						local106 += local92;
						local102 += local92;
					}
				}
				local67 = local60;
				arg0 = local54;
				arg1 = local58;
				local60 = local94;
				local58 >>= 0x1;
				local50 >>= 0x1;
				local39++;
				local54 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(II)V")
	private void method7431() {
		this.aClass43_Sub1_Sub2_12.anInt4791 += this.method7435();
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "([FIIII)V")
	protected final void method7433(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 > 0 && !Static159.method2855(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static159.method2855(arg3)) {
			@Pc(34) int local34 = this.aClass93_12.anInt2936;
			@Pc(36) int local36 = 0;
			@Pc(43) int local43 = arg1 < arg3 ? arg1 : arg3;
			@Pc(47) int local47 = arg1 >> 1;
			@Pc(51) int local51 = arg3 >> 1;
			@Pc(53) float[] local53 = arg0;
			@Pc(60) float[] local60 = new float[local34 * local47 * local51];
			while (true) {
				OpenGL.glTexImage2Df(arg2, local36, this.method7428(), arg1, arg3, 0, Static428.method1615(this.aClass93_12), 5126, local53, 0);
				if (local43 <= 1) {
					return;
				}
				@Pc(87) int local87 = local34 * arg1;
				for (@Pc(89) int local89 = 0; local89 < local34; local89++) {
					@Pc(93) int local93 = local89;
					@Pc(95) int local95 = local89;
					@Pc(99) int local99 = local87 + local89;
					for (@Pc(101) int local101 = 0; local101 < local51; local101++) {
						for (@Pc(105) int local105 = 0; local105 < local47; local105++) {
							@Pc(111) float local111 = local53[local95];
							local95 += local34;
							@Pc(121) float local121 = local111 + local53[local95];
							local95 += local34;
							@Pc(131) float local131 = local121 + local53[local99];
							local99 += local34;
							@Pc(141) float local141 = local131 + local53[local99];
							local60[local93] = local141 * 0.25F;
							local99 += local34;
							local93 += local34;
						}
						local99 += local87;
						local95 += local87;
					}
				}
				@Pc(181) float[] local181 = local60;
				local60 = local53;
				arg3 = local51;
				local53 = local181;
				arg1 = local47;
				local36++;
				local47 >>= 0x1;
				local43 >>= 0x1;
				local51 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!av", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7424();
		super.finalize();
	}

	@OriginalMember(owner = "client!av", name = "d", descriptor = "(I)V")
	@Override
	public final void method7423() {
		@Pc(8) int local8 = this.aClass43_Sub1_Sub2_12.method4174();
		@Pc(14) int local14 = this.aClass43_Sub1_Sub2_12.anIntArray374[local8];
		if (local14 != this.anInt8940) {
			if (local14 != 0) {
				OpenGL.glBindTexture(local14, 0);
				OpenGL.glDisable(local14);
			}
			OpenGL.glEnable(this.anInt8940);
			this.aClass43_Sub1_Sub2_12.anIntArray374[local8] = this.anInt8940;
		}
		OpenGL.glBindTexture(this.anInt8940, this.anInt8928);
	}

	@OriginalMember(owner = "client!av", name = "c", descriptor = "(B)I")
	private int method7435() {
		@Pc(21) int local21 = this.anInt8926 * this.aClass292_20.anInt7532 * this.aClass93_12.anInt2936;
		return this.aBoolean699 ? local21 * 4 / 3 : local21;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(ZLclient!gw;)V")
	@Override
	public final void method7422(@OriginalArg(1) Class123 arg0) {
		if (this.aClass123_13 != arg0) {
			this.aClass123_13 = arg0;
			this.method7429();
		}
	}
}
