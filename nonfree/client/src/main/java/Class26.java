import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public abstract class Class26 implements Interface3 {

	@OriginalMember(owner = "client!bn", name = "h", descriptor = "Lclient!qaa;")
	private Class257 aClass257_10 = Static467.aClass257_9;

	@OriginalMember(owner = "client!bn", name = "u", descriptor = "I")
	private final int anInt8840;

	@OriginalMember(owner = "client!bn", name = "k", descriptor = "Lclient!kf;")
	protected final Class171 aClass171_16;

	@OriginalMember(owner = "client!bn", name = "s", descriptor = "Z")
	private final boolean aBoolean573;

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "Lclient!ps;")
	protected final Class254 aClass254_20;

	@OriginalMember(owner = "client!bn", name = "t", descriptor = "Lclient!mc;")
	protected final Class90_Sub3_Sub1 aClass90_Sub3_Sub1_10;

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
	protected final int anInt8827;

	@OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
	private int anInt8830;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Lclient!mc;ILclient!kf;Lclient!ps;IZ)V")
	protected Class26(@OriginalArg(0) Class90_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2, @OriginalArg(3) Class254 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt8840 = arg4;
		this.aClass171_16 = arg2;
		this.aBoolean573 = arg5;
		this.aClass254_20 = arg3;
		this.aClass90_Sub3_Sub1_10 = arg0;
		this.anInt8827 = arg1;
		OpenGL.glGenTextures(1, Static344.anIntArray456, 0);
		this.anInt8830 = Static344.anIntArray456[0];
		this.method7045();
		this.method7044();
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(I[FIIB)V")
	protected final void method7035(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 > 0 && !Static331.method5078(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static331.method5078(arg0)) {
			@Pc(34) int local34 = this.aClass171_16.anInt4736;
			@Pc(36) int local36 = 0;
			@Pc(47) int local47 = arg2 >= arg0 ? arg0 : arg2;
			@Pc(51) int local51 = arg2 >> 1;
			@Pc(55) int local55 = arg0 >> 1;
			@Pc(61) float[] local61 = arg1;
			@Pc(68) float[] local68 = new float[local51 * local55 * local34];
			while (true) {
				OpenGL.glTexImage2Df(arg3, local36, this.method7040(), arg2, arg0, 0, Static474.method6581(this.aClass171_16), 5126, local61, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(93) int local93 = arg2 * local34;
				@Pc(95) float[] local95 = local68;
				for (@Pc(97) int local97 = 0; local97 < local34; local97++) {
					@Pc(101) int local101 = local97;
					@Pc(103) int local103 = local97;
					@Pc(107) int local107 = local93 + local97;
					for (@Pc(109) int local109 = 0; local109 < local55; local109++) {
						for (@Pc(113) int local113 = 0; local113 < local51; local113++) {
							@Pc(119) float local119 = local61[local103];
							local103 += local34;
							@Pc(129) float local129 = local119 + local61[local103];
							local103 += local34;
							@Pc(139) float local139 = local129 + local61[local107];
							local107 += local34;
							@Pc(149) float local149 = local139 + local61[local107];
							local68[local101] = local149 * 0.25F;
							local107 += local34;
							local101 += local34;
						}
						local103 += local93;
						local107 += local93;
					}
				}
				local68 = local61;
				arg2 = local51;
				arg0 = local55;
				local61 = local95;
				local36++;
				local51 >>= 0x1;
				local47 >>= 0x1;
				local55 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V")
	@Override
	public final void method7033() {
		@Pc(12) int local12 = this.aClass90_Sub3_Sub1_10.method7543();
		@Pc(18) int local18 = this.aClass90_Sub3_Sub1_10.anIntArray435[local12];
		if (this.anInt8827 != local18) {
			if (local18 != 0) {
				OpenGL.glBindTexture(local18, 0);
				OpenGL.glDisable(local18);
			}
			OpenGL.glEnable(this.anInt8827);
			this.aClass90_Sub3_Sub1_10.anIntArray435[local12] = this.anInt8827;
		}
		OpenGL.glBindTexture(this.anInt8827, this.anInt8830);
	}

	@OriginalMember(owner = "client!bn", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7037();
		super.finalize();
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIII[B)V")
	protected final void method7036(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		if (arg2 > 0 && !Static331.method5078(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static331.method5078(arg0)) {
			@Pc(34) int local34 = this.aClass171_16.anInt4736;
			@Pc(53) int local53 = 0;
			@Pc(64) int local64 = arg0 <= arg2 ? arg0 : arg2;
			@Pc(68) int local68 = arg2 >> 1;
			@Pc(72) int local72 = arg0 >> 1;
			@Pc(74) byte[] local74 = arg3;
			@Pc(81) byte[] local81 = new byte[local72 * local68 * local34];
			while (true) {
				OpenGL.glTexImage2Dub(arg1, local53, this.method7040(), arg2, arg0, 0, Static474.method6581(this.aClass171_16), 5121, local74, 0);
				if (local64 <= 1) {
					return;
				}
				@Pc(105) int local105 = arg2 * local34;
				@Pc(107) byte[] local107 = local81;
				for (@Pc(109) int local109 = 0; local109 < local34; local109++) {
					@Pc(113) int local113 = local109;
					@Pc(115) int local115 = local109;
					@Pc(119) int local119 = local105 + local109;
					for (@Pc(121) int local121 = 0; local121 < local72; local121++) {
						for (@Pc(125) int local125 = 0; local125 < local68; local125++) {
							@Pc(131) byte local131 = local74[local115];
							local115 += local34;
							@Pc(141) int local141 = local131 + local74[local115];
							@Pc(147) int local147 = local141 + local74[local119];
							local115 += local34;
							local119 += local34;
							@Pc(161) int local161 = local147 + local74[local119];
							local119 += local34;
							local81[local113] = (byte) (local161 >> 2);
							local113 += local34;
						}
						local115 += local105;
						local119 += local105;
					}
				}
				local81 = local74;
				local74 = local107;
				arg2 = local68;
				arg0 = local72;
				local68 >>= 0x1;
				local53++;
				local72 >>= 0x1;
				local64 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)V")
	private void method7037() {
		if (this.anInt8830 > 0) {
			this.aClass90_Sub3_Sub1_10.method4887(this.anInt8830, this.method7042());
			this.anInt8830 = 0;
		}
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(Z)I")
	protected final int method7040() {
		if (this.aClass254_20 == Static407.aClass254_14) {
			if (this.aClass171_16 == Static246.aClass171_17) {
				return 6407;
			}
			if (this.aClass171_16 == Static493.aClass171_15) {
				return 6408;
			}
			if (Static357.aClass171_12 == this.aClass171_16) {
				return 6406;
			}
			if (Static436.aClass171_14 == this.aClass171_16) {
				return 6409;
			}
			if (Static102.aClass171_6 == this.aClass171_16) {
				return 6410;
			}
			if (this.aClass171_16 == Static16.aClass171_1) {
				return 6145;
			}
		} else if (Static407.aClass254_17 == this.aClass254_20) {
			if (Static246.aClass171_17 == this.aClass171_16) {
				return 34843;
			}
			if (this.aClass171_16 == Static493.aClass171_15) {
				return 34842;
			}
			if (Static357.aClass171_12 == this.aClass171_16) {
				return 34844;
			}
			if (this.aClass171_16 == Static436.aClass171_14) {
				return 34846;
			}
			if (this.aClass171_16 == Static102.aClass171_6) {
				return 34847;
			}
			if (Static16.aClass171_1 == this.aClass171_16) {
				return 6145;
			}
		} else if (Static407.aClass254_18 == this.aClass254_20) {
			if (Static246.aClass171_17 == this.aClass171_16) {
				return 34837;
			}
			if (this.aClass171_16 == Static493.aClass171_15) {
				return 34836;
			}
			if (Static357.aClass171_12 == this.aClass171_16) {
				return 34838;
			}
			if (this.aClass171_16 == Static436.aClass171_14) {
				return 34840;
			}
			if (this.aClass171_16 == Static102.aClass171_6) {
				return 34841;
			}
			if (Static16.aClass171_1 == this.aClass171_16) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(III[II)V")
	protected final void method7041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 > 0 && !Static331.method5078(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg0 > 0 && !Static331.method5078(arg0)) {
			throw new IllegalArgumentException("");
		} else if (Static493.aClass171_15 == this.aClass171_16) {
			@Pc(45) int local45 = 0;
			@Pc(52) int local52 = arg1 < arg0 ? arg1 : arg0;
			@Pc(56) int local56 = arg1 >> 1;
			@Pc(60) int local60 = arg0 >> 1;
			@Pc(62) int[] local62 = arg2;
			@Pc(67) int[] local67 = new int[local56 * local60];
			while (true) {
				OpenGL.glTexImage2Di(arg3, local45, this.method7040(), arg1, arg0, 0, 32993, this.aClass90_Sub3_Sub1_10.anInt6027, local62, 0);
				if (local52 <= 1) {
					return;
				}
				@Pc(88) int local88 = 0;
				@Pc(90) int local90 = 0;
				@Pc(94) int local94 = arg1;
				@Pc(96) int[] local96 = local67;
				for (@Pc(98) int local98 = 0; local98 < local60; local98++) {
					for (@Pc(102) int local102 = 0; local102 < local56; local102++) {
						@Pc(109) int local109 = local62[local90++];
						@Pc(114) int local114 = local62[local90++];
						@Pc(119) int local119 = local62[local94++];
						@Pc(124) int local124 = local62[local94++];
						@Pc(128) int local128 = local109 & 0xFF;
						@Pc(134) int local134 = local109 >> 24 & 0xFF;
						@Pc(140) int local140 = local109 >> 8 & 0xFF;
						@Pc(146) int local146 = local109 >> 16 & 0xFF;
						@Pc(154) int local154 = local140 + (local114 >> 8 & 0xFF);
						@Pc(162) int local162 = local134 + (local114 >> 24 & 0xFF);
						@Pc(168) int local168 = local128 + (local114 & 0xFF);
						@Pc(176) int local176 = local146 + (local114 >> 16 & 0xFF);
						@Pc(184) int local184 = local162 + (local119 >> 24 & 0xFF);
						@Pc(192) int local192 = local154 + (local119 >> 8 & 0xFF);
						@Pc(200) int local200 = local176 + (local119 >> 16 & 0xFF);
						@Pc(206) int local206 = local168 + (local119 & 0xFF);
						@Pc(212) int local212 = local206 + (local124 & 0xFF);
						@Pc(220) int local220 = local192 + (local124 >> 8 & 0xFF);
						@Pc(228) int local228 = local184 + (local124 >> 24 & 0xFF);
						@Pc(236) int local236 = local200 + (local124 >> 16 & 0xFF);
						local67[local88++] = (local220 & 0x3FC) << 6 | (local236 & 0x3FC) << 14 | (local228 & 0x3FC) << 22 | local212 >> 2 & 0xFF;
					}
					local94 += arg1;
					local90 += arg1;
				}
				local67 = local62;
				arg0 = local60;
				arg1 = local56;
				local62 = local96;
				local60 >>= 0x1;
				local56 >>= 0x1;
				local52 >>= 0x1;
				local45++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "(I)I")
	private int method7042() {
		@Pc(19) int local19 = this.anInt8840 * this.aClass171_16.anInt4736 * this.aClass254_20.anInt7322;
		return this.aBoolean573 ? local19 * 4 / 3 : local19;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(BLclient!qaa;)V")
	@Override
	public final void method7034(@OriginalArg(1) Class257 arg0) {
		if (arg0 != this.aClass257_10) {
			this.aClass257_10 = arg0;
			this.method7045();
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(II)V")
	private void method7044() {
		this.aClass90_Sub3_Sub1_10.anInt9532 += this.method7042();
	}

	@OriginalMember(owner = "client!bn", name = "e", descriptor = "(I)V")
	private void method7045() {
		this.aClass90_Sub3_Sub1_10.method7624(this);
		if (Static467.aClass257_9 == this.aClass257_10) {
			OpenGL.glTexParameteri(this.anInt8827, 10241, this.aBoolean573 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt8827, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt8827, 10241, this.aBoolean573 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt8827, 10240, 9728);
		}
	}
}
