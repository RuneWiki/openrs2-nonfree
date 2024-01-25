import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public abstract class Class30 implements Interface12 {

	@OriginalMember(owner = "client!be", name = "n", descriptor = "Lclient!qo;")
	private Class277 aClass277_9 = Static579.aClass277_10;

	@OriginalMember(owner = "client!be", name = "s", descriptor = "Lclient!jm;")
	protected final Class160 aClass160_18;

	@OriginalMember(owner = "client!be", name = "w", descriptor = "I")
	private final int anInt9807;

	@OriginalMember(owner = "client!be", name = "h", descriptor = "Lclient!wd;")
	protected final Class366 aClass366_13;

	@OriginalMember(owner = "client!be", name = "u", descriptor = "I")
	protected final int anInt9806;

	@OriginalMember(owner = "client!be", name = "q", descriptor = "Z")
	private final boolean aBoolean696;

	@OriginalMember(owner = "client!be", name = "v", descriptor = "Lclient!ai;")
	protected final Class16_Sub1_Sub1 aClass16_Sub1_Sub1_12;

	@OriginalMember(owner = "client!be", name = "k", descriptor = "I")
	private int anInt9800;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!ai;ILclient!wd;Lclient!jm;IZ)V")
	protected Class30(@OriginalArg(0) Class16_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class366 arg2, @OriginalArg(3) Class160 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aClass160_18 = arg3;
		this.anInt9807 = arg4;
		this.aClass366_13 = arg2;
		this.anInt9806 = arg1;
		this.aBoolean696 = arg5;
		this.aClass16_Sub1_Sub1_12 = arg0;
		OpenGL.glGenTextures(1, Static338.anIntArray375, 0);
		this.anInt9800 = Static338.anIntArray375[0];
		this.method7916();
		this.method7922();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!qo;I)V")
	@Override
	public final void method8280(@OriginalArg(0) Class277 arg0) {
		if (this.aClass277_9 != arg0) {
			this.aClass277_9 = arg0;
			this.method7916();
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(Z)V")
	private void method7913() {
		if (this.anInt9800 > 0) {
			this.aClass16_Sub1_Sub1_12.method757(this.anInt9800, this.method7920());
			this.anInt9800 = 0;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II[III)V")
	protected final void method7914(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 > 0 && !Static439.method6796(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg3 > 0 && !Static439.method6796(arg3)) {
			throw new IllegalArgumentException("");
		} else if (this.aClass366_13 == Static456.aClass366_9) {
			@Pc(44) int local44 = 0;
			@Pc(51) int local51 = arg0 < arg3 ? arg0 : arg3;
			@Pc(55) int local55 = arg0 >> 1;
			@Pc(59) int local59 = arg3 >> 1;
			@Pc(66) int[] local66 = arg2;
			@Pc(71) int[] local71 = new int[local59 * local55];
			while (true) {
				OpenGL.glTexImage2Di(arg1, local44, this.method7917(), arg0, arg3, 0, 32993, this.aClass16_Sub1_Sub1_12.anInt775, local66, 0);
				if (local51 <= 1) {
					return;
				}
				@Pc(91) int local91 = 0;
				@Pc(93) int local93 = 0;
				@Pc(98) int local98 = arg0;
				@Pc(100) int[] local100 = local71;
				for (@Pc(102) int local102 = 0; local102 < local59; local102++) {
					for (@Pc(106) int local106 = 0; local106 < local55; local106++) {
						@Pc(113) int local113 = local66[local93++];
						@Pc(118) int local118 = local66[local98++];
						@Pc(123) int local123 = local66[local93++];
						@Pc(129) int local129 = local113 >> 16 & 0xFF;
						@Pc(134) int local134 = local66[local98++];
						@Pc(138) int local138 = local113 & 0xFF;
						@Pc(144) int local144 = local113 >> 8 & 0xFF;
						@Pc(150) int local150 = local113 >> 24 & 0xFF;
						@Pc(158) int local158 = local150 + (local123 >> 24 & 0xFF);
						@Pc(164) int local164 = local138 + (local123 & 0xFF);
						@Pc(172) int local172 = local129 + (local123 >> 16 & 0xFF);
						@Pc(180) int local180 = local144 + (local123 >> 8 & 0xFF);
						@Pc(188) int local188 = local172 + (local118 >> 16 & 0xFF);
						@Pc(196) int local196 = local158 + (local118 >> 24 & 0xFF);
						@Pc(204) int local204 = local180 + (local118 >> 8 & 0xFF);
						@Pc(210) int local210 = local164 + (local118 & 0xFF);
						@Pc(218) int local218 = local196 + (local134 >> 24 & 0xFF);
						@Pc(226) int local226 = local204 + (local134 >> 8 & 0xFF);
						@Pc(232) int local232 = local210 + (local134 & 0xFF);
						@Pc(240) int local240 = local188 + (local134 >> 16 & 0xFF);
						local71[local91++] = local232 >> 2 & 0xFF | (local226 & 0x3FC) << 6 | (local240 & 0x3FC) << 14 | (local218 & 0x3FC) << 22;
					}
					local98 += arg0;
					local93 += arg0;
				}
				local71 = local66;
				arg0 = local55;
				local66 = local100;
				arg3 = local59;
				local51 >>= 0x1;
				local55 >>= 0x1;
				local59 >>= 0x1;
				local44++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(III[BI)V")
	protected final void method7915(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		if (arg0 > 0 && !Static439.method6796(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static439.method6796(arg1)) {
			@Pc(31) int local31 = this.aClass366_13.anInt10394;
			@Pc(33) int local33 = 0;
			@Pc(44) int local44 = arg1 > arg0 ? arg0 : arg1;
			@Pc(48) int local48 = arg0 >> 1;
			@Pc(52) int local52 = arg1 >> 1;
			@Pc(54) byte[] local54 = arg3;
			@Pc(61) byte[] local61 = new byte[local31 * local48 * local52];
			while (true) {
				OpenGL.glTexImage2Dub(arg2, local33, this.method7917(), arg0, arg1, 0, Static215.method4064(this.aClass366_13), 5121, local54, 0);
				if (local44 <= 1) {
					return;
				}
				@Pc(94) int local94 = local31 * arg0;
				for (@Pc(96) int local96 = 0; local96 < local31; local96++) {
					@Pc(100) int local100 = local96;
					@Pc(102) int local102 = local96;
					@Pc(106) int local106 = local96 + local94;
					for (@Pc(108) int local108 = 0; local108 < local52; local108++) {
						for (@Pc(112) int local112 = 0; local112 < local48; local112++) {
							@Pc(118) byte local118 = local54[local102];
							local102 += local31;
							@Pc(128) int local128 = local118 + local54[local102];
							@Pc(134) int local134 = local128 + local54[local106];
							local102 += local31;
							local106 += local31;
							@Pc(148) int local148 = local134 + local54[local106];
							local106 += local31;
							local61[local100] = (byte) (local148 >> 2);
							local100 += local31;
						}
						local106 += local94;
						local102 += local94;
					}
				}
				@Pc(189) byte[] local189 = local61;
				local61 = local54;
				arg0 = local48;
				arg1 = local52;
				local54 = local189;
				local48 >>= 0x1;
				local44 >>= 0x1;
				local52 >>= 0x1;
				local33++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
	private void method7916() {
		this.aClass16_Sub1_Sub1_12.method3889(this);
		if (Static579.aClass277_10 == this.aClass277_9) {
			OpenGL.glTexParameteri(this.anInt9806, 10241, this.aBoolean696 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt9806, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt9806, 10241, this.aBoolean696 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt9806, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(Z)I")
	protected final int method7917() {
		if (Static258.aClass160_9 == this.aClass160_18) {
			if (this.aClass366_13 == Static527.aClass366_12) {
				return 6407;
			}
			if (this.aClass366_13 == Static456.aClass366_9) {
				return 6408;
			}
			if (Static526.aClass366_11 == this.aClass366_13) {
				return 6406;
			}
			if (Static20.aClass366_1 == this.aClass366_13) {
				return 6409;
			}
			if (this.aClass366_13 == Static627.aClass366_15) {
				return 6410;
			}
			if (this.aClass366_13 == Static95.aClass366_3) {
				return 6145;
			}
		} else if (this.aClass160_18 == Static258.aClass160_12) {
			if (this.aClass366_13 == Static527.aClass366_12) {
				return 34843;
			}
			if (this.aClass366_13 == Static456.aClass366_9) {
				return 34842;
			}
			if (this.aClass366_13 == Static526.aClass366_11) {
				return 34844;
			}
			if (Static20.aClass366_1 == this.aClass366_13) {
				return 34846;
			}
			if (this.aClass366_13 == Static627.aClass366_15) {
				return 34847;
			}
			if (Static95.aClass366_3 == this.aClass366_13) {
				return 6145;
			}
		} else if (this.aClass160_18 == Static258.aClass160_13) {
			if (this.aClass366_13 == Static527.aClass366_12) {
				return 34837;
			}
			if (Static456.aClass366_9 == this.aClass366_13) {
				return 34836;
			}
			if (Static526.aClass366_11 == this.aClass366_13) {
				return 34838;
			}
			if (this.aClass366_13 == Static20.aClass366_1) {
				return 34840;
			}
			if (Static627.aClass366_15 == this.aClass366_13) {
				return 34841;
			}
			if (Static95.aClass366_3 == this.aClass366_13) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
	@Override
	public final void method8281() {
		@Pc(14) int local14 = this.aClass16_Sub1_Sub1_12.method3958();
		@Pc(20) int local20 = this.aClass16_Sub1_Sub1_12.anIntArray16[local14];
		if (this.anInt9806 != local20) {
			if (local20 != 0) {
				OpenGL.glBindTexture(local20, 0);
				OpenGL.glDisable(local20);
			}
			OpenGL.glEnable(this.anInt9806);
			this.aClass16_Sub1_Sub1_12.anIntArray16[local14] = this.anInt9806;
		}
		OpenGL.glBindTexture(this.anInt9806, this.anInt9800);
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(I)I")
	private int method7920() {
		@Pc(14) int local14 = this.anInt9807 * this.aClass366_13.anInt10394 * this.aClass160_18.anInt5547;
		return this.aBoolean696 ? local14 * 4 / 3 : local14;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(III[FI)V")
	protected final void method7921(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 > 0 && !Static439.method6796(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static439.method6796(arg1)) {
			@Pc(38) int local38 = this.aClass366_13.anInt10394;
			@Pc(40) int local40 = 0;
			@Pc(51) int local51 = arg1 > arg0 ? arg0 : arg1;
			@Pc(55) int local55 = arg0 >> 1;
			@Pc(59) int local59 = arg1 >> 1;
			@Pc(61) float[] local61 = arg2;
			@Pc(68) float[] local68 = new float[local38 * local59 * local55];
			while (true) {
				OpenGL.glTexImage2Df(arg3, local40, this.method7917(), arg0, arg1, 0, Static215.method4064(this.aClass366_13), 5126, local61, 0);
				if (local51 <= 1) {
					return;
				}
				@Pc(92) int local92 = local38 * arg0;
				for (@Pc(94) int local94 = 0; local94 < local38; local94++) {
					@Pc(98) int local98 = local94;
					@Pc(100) int local100 = local94;
					@Pc(104) int local104 = local92 + local94;
					for (@Pc(106) int local106 = 0; local106 < local59; local106++) {
						for (@Pc(110) int local110 = 0; local110 < local55; local110++) {
							@Pc(116) float local116 = local61[local100];
							local100 += local38;
							@Pc(126) float local126 = local116 + local61[local100];
							@Pc(132) float local132 = local126 + local61[local104];
							local100 += local38;
							local104 += local38;
							@Pc(146) float local146 = local132 + local61[local104];
							local104 += local38;
							local68[local98] = local146 * 0.25F;
							local98 += local38;
						}
						local104 += local92;
						local100 += local92;
					}
				}
				@Pc(194) float[] local194 = local68;
				local68 = local61;
				local61 = local194;
				arg0 = local55;
				arg1 = local59;
				local51 >>= 0x1;
				local59 >>= 0x1;
				local40++;
				local55 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)V")
	private void method7922() {
		this.aClass16_Sub1_Sub1_12.anInt4893 += this.method7920();
	}

	@OriginalMember(owner = "client!be", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7913();
		super.finalize();
	}
}
