import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jca")
public abstract class Class66 implements Interface3 {

	@OriginalMember(owner = "client!jca", name = "l", descriptor = "Lclient!fj;")
	private Class101 aClass101_12 = Static342.aClass101_4;

	@OriginalMember(owner = "client!jca", name = "y", descriptor = "Lclient!dk;")
	protected final Class72 aClass72_14;

	@OriginalMember(owner = "client!jca", name = "f", descriptor = "Lclient!pi;")
	protected final Class42_Sub1_Sub2 aClass42_Sub1_Sub2_9;

	@OriginalMember(owner = "client!jca", name = "z", descriptor = "Lclient!ge;")
	protected final Class114 aClass114_18;

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "I")
	private final int anInt8478;

	@OriginalMember(owner = "client!jca", name = "p", descriptor = "I")
	protected final int anInt8488;

	@OriginalMember(owner = "client!jca", name = "i", descriptor = "Z")
	private final boolean aBoolean603;

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "I")
	private int anInt8479;

	@OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(Lclient!pi;ILclient!dk;Lclient!ge;IZ)V")
	protected Class66(@OriginalArg(0) Class42_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class72 arg2, @OriginalArg(3) Class114 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aClass72_14 = arg2;
		this.aClass42_Sub1_Sub2_9 = arg0;
		this.aClass114_18 = arg3;
		this.anInt8478 = arg4;
		this.anInt8488 = arg1;
		this.aBoolean603 = arg5;
		OpenGL.glGenTextures(1, Static307.anIntArray416, 0);
		this.anInt8479 = Static307.anIntArray416[0];
		this.method6974();
		this.method6973();
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)V")
	@Override
	public final void method6969() {
		@Pc(13) int local13 = this.aClass42_Sub1_Sub2_9.method5922();
		@Pc(19) int local19 = this.aClass42_Sub1_Sub2_9.anIntArray482[local13];
		if (this.anInt8488 != local19) {
			if (local19 != 0) {
				OpenGL.glBindTexture(local19, 0);
				OpenGL.glDisable(local19);
			}
			OpenGL.glEnable(this.anInt8488);
			this.aClass42_Sub1_Sub2_9.anIntArray482[local13] = this.anInt8488;
		}
		OpenGL.glBindTexture(this.anInt8488, this.anInt8479);
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(III[BI)V")
	protected final void method6970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		if (arg0 > 0 && !Static78.method1703(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static78.method1703(arg1)) {
			@Pc(34) int local34 = this.aClass72_14.anInt2163;
			@Pc(36) int local36 = 0;
			@Pc(49) int local49 = arg1 <= arg0 ? arg1 : arg0;
			@Pc(53) int local53 = arg0 >> 1;
			@Pc(57) int local57 = arg1 >> 1;
			@Pc(59) byte[] local59 = arg3;
			@Pc(66) byte[] local66 = new byte[local53 * local57 * local34];
			while (true) {
				OpenGL.glTexImage2Dub(arg2, local36, this.method6976(), arg0, arg1, 0, Static37.method6278(this.aClass72_14), 5121, local59, 0);
				if (local49 <= 1) {
					return;
				}
				@Pc(89) int local89 = arg0 * local34;
				for (@Pc(91) int local91 = 0; local91 < local34; local91++) {
					@Pc(95) int local95 = local91;
					@Pc(97) int local97 = local91;
					@Pc(101) int local101 = local91 + local89;
					for (@Pc(103) int local103 = 0; local103 < local57; local103++) {
						for (@Pc(107) int local107 = 0; local107 < local53; local107++) {
							@Pc(113) byte local113 = local59[local97];
							local97 += local34;
							@Pc(123) int local123 = local113 + local59[local97];
							local97 += local34;
							@Pc(133) int local133 = local123 + local59[local101];
							local101 += local34;
							@Pc(143) int local143 = local133 + local59[local101];
							local101 += local34;
							local66[local95] = (byte) (local143 >> 2);
							local95 += local34;
						}
						local101 += local89;
						local97 += local89;
					}
				}
				@Pc(188) byte[] local188 = local66;
				local66 = local59;
				arg0 = local53;
				arg1 = local57;
				local59 = local188;
				local36++;
				local49 >>= 0x1;
				local57 >>= 0x1;
				local53 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(II)V")
	private void method6973() {
		this.aClass42_Sub1_Sub2_9.anInt7093 += this.method6977();
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(ZLclient!fj;)V")
	@Override
	public final void method6968(@OriginalArg(1) Class101 arg0) {
		if (arg0 != this.aClass101_12) {
			this.aClass101_12 = arg0;
			this.method6974();
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(B)V")
	private void method6974() {
		this.aClass42_Sub1_Sub2_9.method5868(this);
		if (Static342.aClass101_4 == this.aClass101_12) {
			OpenGL.glTexParameteri(this.anInt8488, 10241, this.aBoolean603 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt8488, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt8488, 10241, this.aBoolean603 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt8488, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!jca", name = "e", descriptor = "(I)I")
	protected final int method6976() {
		if (this.aClass114_18 == Static155.aClass114_6) {
			if (Static332.aClass72_8 == this.aClass72_14) {
				return 6407;
			}
			if (Static306.aClass72_5 == this.aClass72_14) {
				return 6408;
			}
			if (Static61.aClass72_1 == this.aClass72_14) {
				return 6406;
			}
			if (this.aClass72_14 == Static173.aClass72_4) {
				return 6409;
			}
			if (Static473.aClass72_15 == this.aClass72_14) {
				return 6410;
			}
			if (Static392.aClass72_11 == this.aClass72_14) {
				return 6145;
			}
		} else if (this.aClass114_18 == Static155.aClass114_9) {
			if (this.aClass72_14 == Static332.aClass72_8) {
				return 34843;
			}
			if (this.aClass72_14 == Static306.aClass72_5) {
				return 34842;
			}
			if (Static61.aClass72_1 == this.aClass72_14) {
				return 34844;
			}
			if (this.aClass72_14 == Static173.aClass72_4) {
				return 34846;
			}
			if (this.aClass72_14 == Static473.aClass72_15) {
				return 34847;
			}
			if (this.aClass72_14 == Static392.aClass72_11) {
				return 6145;
			}
		} else if (Static155.aClass114_10 == this.aClass114_18) {
			if (Static332.aClass72_8 == this.aClass72_14) {
				return 34837;
			}
			if (this.aClass72_14 == Static306.aClass72_5) {
				return 34836;
			}
			if (Static61.aClass72_1 == this.aClass72_14) {
				return 34838;
			}
			if (this.aClass72_14 == Static173.aClass72_4) {
				return 34840;
			}
			if (this.aClass72_14 == Static473.aClass72_15) {
				return 34841;
			}
			if (this.aClass72_14 == Static392.aClass72_11) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "(B)I")
	private int method6977() {
		@Pc(19) int local19 = this.aClass72_14.anInt2163 * this.aClass114_18.anInt3379 * this.anInt8478;
		return this.aBoolean603 ? local19 * 4 / 3 : local19;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "([IIBII)V")
	protected final void method6978(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 > 0 && !Static78.method1703(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg1 > 0 && !Static78.method1703(arg1)) {
			throw new IllegalArgumentException("");
		} else if (Static306.aClass72_5 == this.aClass72_14) {
			@Pc(38) int local38 = 0;
			@Pc(53) int local53 = arg1 <= arg3 ? arg1 : arg3;
			@Pc(57) int local57 = arg3 >> 1;
			@Pc(61) int local61 = arg1 >> 1;
			@Pc(63) int[] local63 = arg0;
			@Pc(68) int[] local68 = new int[local57 * local61];
			while (true) {
				OpenGL.glTexImage2Di(arg2, local38, this.method6976(), arg3, arg1, 0, 32993, this.aClass42_Sub1_Sub2_9.anInt7221, local63, 0);
				if (local53 <= 1) {
					return;
				}
				@Pc(91) int local91 = 0;
				@Pc(93) int local93 = 0;
				@Pc(98) int local98 = arg3;
				@Pc(100) int[] local100 = local68;
				for (@Pc(102) int local102 = 0; local102 < local61; local102++) {
					for (@Pc(106) int local106 = 0; local106 < local57; local106++) {
						@Pc(113) int local113 = local63[local93++];
						@Pc(118) int local118 = local63[local93++];
						@Pc(123) int local123 = local63[local98++];
						@Pc(127) int local127 = local113 & 0xFF;
						@Pc(133) int local133 = local113 >> 8 & 0xFF;
						@Pc(139) int local139 = local113 >> 24 & 0xFF;
						@Pc(144) int local144 = local63[local98++];
						@Pc(150) int local150 = local113 >> 16 & 0xFF;
						@Pc(158) int local158 = local139 + (local118 >> 24 & 0xFF);
						@Pc(166) int local166 = local150 + (local118 >> 16 & 0xFF);
						@Pc(174) int local174 = local133 + (local118 >> 8 & 0xFF);
						@Pc(180) int local180 = local127 + (local118 & 0xFF);
						@Pc(186) int local186 = local180 + (local123 & 0xFF);
						@Pc(194) int local194 = local166 + (local123 >> 16 & 0xFF);
						@Pc(202) int local202 = local174 + (local123 >> 8 & 0xFF);
						@Pc(210) int local210 = local158 + (local123 >> 24 & 0xFF);
						@Pc(216) int local216 = local186 + (local144 & 0xFF);
						@Pc(224) int local224 = local210 + (local144 >> 24 & 0xFF);
						@Pc(232) int local232 = local202 + (local144 >> 8 & 0xFF);
						@Pc(240) int local240 = local194 + (local144 >> 16 & 0xFF);
						local68[local91++] = (local232 & 0x3FC) << 6 | local240 << 14 & 0xFF0000 | (local224 & 0x3FC) << 22 | local216 >> 2 & 0xFF;
					}
					local93 += arg3;
					local98 += arg3;
				}
				local68 = local63;
				arg1 = local61;
				arg3 = local57;
				local63 = local100;
				local38++;
				local57 >>= 0x1;
				local53 >>= 0x1;
				local61 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!jca", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method6979();
		super.finalize();
	}

	@OriginalMember(owner = "client!jca", name = "c", descriptor = "(B)V")
	private void method6979() {
		if (this.anInt8479 > 0) {
			this.aClass42_Sub1_Sub2_9.method6002(this.method6977(), this.anInt8479);
			this.anInt8479 = 0;
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIII[F)V")
	protected final void method6980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float[] arg3) {
		if (arg2 > 0 && !Static78.method1703(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static78.method1703(arg0)) {
			@Pc(42) int local42 = this.aClass72_14.anInt2163;
			@Pc(44) int local44 = 0;
			@Pc(55) int local55 = arg0 <= arg2 ? arg0 : arg2;
			@Pc(59) int local59 = arg2 >> 1;
			@Pc(63) int local63 = arg0 >> 1;
			@Pc(65) float[] local65 = arg3;
			@Pc(72) float[] local72 = new float[local59 * local63 * local42];
			while (true) {
				OpenGL.glTexImage2Df(arg1, local44, this.method6976(), arg2, arg0, 0, Static37.method6278(this.aClass72_14), 5126, local65, 0);
				if (local55 <= 1) {
					return;
				}
				@Pc(98) int local98 = local42 * arg2;
				for (@Pc(100) int local100 = 0; local100 < local42; local100++) {
					@Pc(104) int local104 = local100;
					@Pc(106) int local106 = local100;
					@Pc(111) int local111 = local100 + local98;
					for (@Pc(113) int local113 = 0; local113 < local63; local113++) {
						for (@Pc(117) int local117 = 0; local117 < local59; local117++) {
							@Pc(123) float local123 = local65[local106];
							local106 += local42;
							@Pc(133) float local133 = local123 + local65[local106];
							@Pc(139) float local139 = local133 + local65[local111];
							local106 += local42;
							local111 += local42;
							@Pc(153) float local153 = local139 + local65[local111];
							local111 += local42;
							local72[local104] = local153 * 0.25F;
							local104 += local42;
						}
						local106 += local98;
						local111 += local98;
					}
				}
				@Pc(189) float[] local189 = local72;
				local72 = local65;
				arg2 = local59;
				local65 = local189;
				arg0 = local63;
				local55 >>= 0x1;
				local63 >>= 0x1;
				local59 >>= 0x1;
				local44++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
