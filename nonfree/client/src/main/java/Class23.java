import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mba")
public abstract class Class23 implements Interface17 {

	@OriginalMember(owner = "client!mba", name = "g", descriptor = "Lclient!cw;")
	private Class59 aClass59_10 = Static70.aClass59_5;

	@OriginalMember(owner = "client!mba", name = "m", descriptor = "Lclient!oaa;")
	protected final Class132_Sub1_Sub1 aClass132_Sub1_Sub1_12;

	@OriginalMember(owner = "client!mba", name = "l", descriptor = "I")
	private final int anInt9758;

	@OriginalMember(owner = "client!mba", name = "w", descriptor = "I")
	protected final int anInt9768;

	@OriginalMember(owner = "client!mba", name = "j", descriptor = "Z")
	private final boolean aBoolean695;

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "Lclient!pb;")
	protected final Class265 aClass265_17;

	@OriginalMember(owner = "client!mba", name = "x", descriptor = "Lclient!oea;")
	protected final Class250 aClass250_19;

	@OriginalMember(owner = "client!mba", name = "c", descriptor = "I")
	private int anInt9753;

	@OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Lclient!oaa;ILclient!pb;Lclient!oea;IZ)V")
	protected Class23(@OriginalArg(0) Class132_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class265 arg2, @OriginalArg(3) Class250 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aClass132_Sub1_Sub1_12 = arg0;
		this.anInt9758 = arg4;
		this.anInt9768 = arg1;
		this.aBoolean695 = arg5;
		this.aClass265_17 = arg2;
		this.aClass250_19 = arg3;
		OpenGL.glGenTextures(1, Static502.anIntArray553, 0);
		this.anInt9753 = Static502.anIntArray553[0];
		this.method8242();
		this.method8255();
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(BLclient!cw;)V")
	@Override
	public final void method8893(@OriginalArg(1) Class59 arg0) {
		if (arg0 != this.aClass59_10) {
			this.aClass59_10 = arg0;
			this.method8242();
		}
	}

	@OriginalMember(owner = "client!mba", name = "c", descriptor = "(I)V")
	private void method8242() {
		this.aClass132_Sub1_Sub1_12.method7635(this);
		if (this.aClass59_10 == Static70.aClass59_5) {
			OpenGL.glTexParameteri(this.anInt9768, 10241, this.aBoolean695 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt9768, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt9768, 10241, this.aBoolean695 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt9768, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!mba", name = "d", descriptor = "(I)I")
	private int method8244() {
		@Pc(24) int local24 = this.aClass250_19.anInt7253 * this.aClass265_17.anInt7469 * this.anInt9758;
		return this.aBoolean695 ? local24 * 4 / 3 : local24;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(III[II)V")
	protected final void method8245(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 > 0 && !Static177.method2498(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg3 > 0 && !Static177.method2498(arg3)) {
			throw new IllegalArgumentException("");
		} else if (Static169.aClass265_9 == this.aClass265_17) {
			@Pc(43) int local43 = 0;
			@Pc(60) int local60 = arg3 > arg0 ? arg0 : arg3;
			@Pc(64) int local64 = arg0 >> 1;
			@Pc(68) int local68 = arg3 >> 1;
			@Pc(70) int[] local70 = arg2;
			@Pc(75) int[] local75 = new int[local68 * local64];
			while (true) {
				OpenGL.glTexImage2Di(arg1, local43, this.method8248(), arg0, arg3, 0, 32993, this.aClass132_Sub1_Sub1_12.anInt7181, local70, 0);
				if (local60 <= 1) {
					return;
				}
				@Pc(96) int local96 = 0;
				@Pc(98) int local98 = 0;
				@Pc(103) int local103 = arg0;
				@Pc(105) int[] local105 = local75;
				for (@Pc(107) int local107 = 0; local107 < local68; local107++) {
					for (@Pc(111) int local111 = 0; local111 < local64; local111++) {
						@Pc(118) int local118 = local70[local98++];
						@Pc(123) int local123 = local70[local103++];
						@Pc(128) int local128 = local70[local98++];
						@Pc(132) int local132 = local118 & 0xFF;
						@Pc(138) int local138 = local118 >> 16 & 0xFF;
						@Pc(143) int local143 = local70[local103++];
						@Pc(149) int local149 = local118 >> 24 & 0xFF;
						@Pc(155) int local155 = local118 >> 8 & 0xFF;
						@Pc(163) int local163 = local155 + (local128 >> 8 & 0xFF);
						@Pc(171) int local171 = local138 + (local128 >> 16 & 0xFF);
						@Pc(179) int local179 = local149 + (local128 >> 24 & 0xFF);
						@Pc(185) int local185 = local132 + (local128 & 0xFF);
						@Pc(193) int local193 = local179 + (local123 >> 24 & 0xFF);
						@Pc(201) int local201 = local171 + (local123 >> 16 & 0xFF);
						@Pc(207) int local207 = local185 + (local123 & 0xFF);
						@Pc(215) int local215 = local163 + (local123 >> 8 & 0xFF);
						@Pc(223) int local223 = local201 + (local143 >> 16 & 0xFF);
						@Pc(231) int local231 = local215 + (local143 >> 8 & 0xFF);
						@Pc(237) int local237 = local207 + (local143 & 0xFF);
						@Pc(245) int local245 = local193 + (local143 >> 24 & 0xFF);
						local75[local96++] = (local223 & 0x3FC) << 14 | local245 << 22 & 0xFF000000 | (local231 & 0x3FC) << 6 | local237 >> 2 & 0xFF;
					}
					local98 += arg0;
					local103 += arg0;
				}
				local75 = local70;
				local70 = local105;
				arg0 = local64;
				arg3 = local68;
				local43++;
				local68 >>= 0x1;
				local64 >>= 0x1;
				local60 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "(I)V")
	@Override
	public final void method8895() {
		@Pc(8) int local8 = this.aClass132_Sub1_Sub1_12.method7629();
		@Pc(18) int local18 = this.aClass132_Sub1_Sub1_12.anIntArray440[local8];
		if (local18 != this.anInt9768) {
			if (local18 != 0) {
				OpenGL.glBindTexture(local18, 0);
				OpenGL.glDisable(local18);
			}
			OpenGL.glEnable(this.anInt9768);
			this.aClass132_Sub1_Sub1_12.anIntArray440[local8] = this.anInt9768;
		}
		OpenGL.glBindTexture(this.anInt9768, this.anInt9753);
	}

	@OriginalMember(owner = "client!mba", name = "f", descriptor = "(I)V")
	private void method8247() {
		if (this.anInt9753 > 0) {
			this.aClass132_Sub1_Sub1_12.method6166(this.method8244(), this.anInt9753);
			this.anInt9753 = 0;
		}
	}

	@OriginalMember(owner = "client!mba", name = "g", descriptor = "(I)I")
	protected final int method8248() {
		if (this.aClass250_19 == Static417.aClass250_14) {
			if (Static289.aClass265_13 == this.aClass265_17) {
				return 6407;
			}
			if (this.aClass265_17 == Static169.aClass265_9) {
				return 6408;
			}
			if (Static447.aClass265_15 == this.aClass265_17) {
				return 6406;
			}
			if (this.aClass265_17 == Static356.aClass265_14) {
				return 6409;
			}
			if (Static98.aClass265_16 == this.aClass265_17) {
				return 6410;
			}
			if (this.aClass265_17 == Static662.aClass265_19) {
				return 6145;
			}
		} else if (this.aClass250_19 == Static417.aClass250_17) {
			if (this.aClass265_17 == Static289.aClass265_13) {
				return 34843;
			}
			if (Static169.aClass265_9 == this.aClass265_17) {
				return 34842;
			}
			if (Static447.aClass265_15 == this.aClass265_17) {
				return 34844;
			}
			if (this.aClass265_17 == Static356.aClass265_14) {
				return 34846;
			}
			if (this.aClass265_17 == Static98.aClass265_16) {
				return 34847;
			}
			if (this.aClass265_17 == Static662.aClass265_19) {
				return 6145;
			}
		} else if (Static417.aClass250_18 == this.aClass250_19) {
			if (Static289.aClass265_13 == this.aClass265_17) {
				return 34837;
			}
			if (this.aClass265_17 == Static169.aClass265_9) {
				return 34836;
			}
			if (Static447.aClass265_15 == this.aClass265_17) {
				return 34838;
			}
			if (Static356.aClass265_14 == this.aClass265_17) {
				return 34840;
			}
			if (this.aClass265_17 == Static98.aClass265_16) {
				return 34841;
			}
			if (Static662.aClass265_19 == this.aClass265_17) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(III[FI)V")
	protected final void method8252(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 > 0 && !Static177.method2498(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static177.method2498(arg0)) {
			@Pc(34) int local34 = this.aClass265_17.anInt7469;
			@Pc(44) int local44 = 0;
			@Pc(51) int local51 = arg0 > arg1 ? arg1 : arg0;
			@Pc(55) int local55 = arg1 >> 1;
			@Pc(59) int local59 = arg0 >> 1;
			@Pc(61) float[] local61 = arg2;
			@Pc(68) float[] local68 = new float[local55 * local59 * local34];
			while (true) {
				OpenGL.glTexImage2Df(arg3, local44, this.method8248(), arg1, arg0, 0, Static233.method3518(this.aClass265_17), 5126, local61, 0);
				if (local51 <= 1) {
					return;
				}
				@Pc(93) int local93 = local34 * arg1;
				@Pc(95) float[] local95 = local68;
				for (@Pc(97) int local97 = 0; local97 < local34; local97++) {
					@Pc(101) int local101 = local97;
					@Pc(103) int local103 = local97;
					@Pc(107) int local107 = local93 + local97;
					for (@Pc(109) int local109 = 0; local109 < local59; local109++) {
						for (@Pc(113) int local113 = 0; local113 < local55; local113++) {
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
						local107 += local93;
						local103 += local93;
					}
				}
				local68 = local61;
				arg0 = local59;
				local61 = local95;
				arg1 = local55;
				local44++;
				local55 >>= 0x1;
				local59 >>= 0x1;
				local51 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!mba", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method8247();
		super.finalize();
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "([BIIII)V")
	protected final void method8254(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 > 0 && !Static177.method2498(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static177.method2498(arg1)) {
			@Pc(42) int local42 = this.aClass265_17.anInt7469;
			@Pc(44) int local44 = 0;
			@Pc(55) int local55 = arg2 < arg1 ? arg2 : arg1;
			@Pc(59) int local59 = arg2 >> 1;
			@Pc(63) int local63 = arg1 >> 1;
			@Pc(65) byte[] local65 = arg0;
			@Pc(72) byte[] local72 = new byte[local42 * local59 * local63];
			while (true) {
				OpenGL.glTexImage2Dub(arg3, local44, this.method8248(), arg2, arg1, 0, Static233.method3518(this.aClass265_17), 5121, local65, 0);
				if (local55 <= 1) {
					return;
				}
				@Pc(95) int local95 = arg2 * local42;
				for (@Pc(97) int local97 = 0; local97 < local42; local97++) {
					@Pc(101) int local101 = local97;
					@Pc(103) int local103 = local97;
					@Pc(108) int local108 = local97 + local95;
					for (@Pc(110) int local110 = 0; local110 < local63; local110++) {
						for (@Pc(114) int local114 = 0; local114 < local59; local114++) {
							@Pc(120) byte local120 = local65[local103];
							local103 += local42;
							@Pc(130) int local130 = local120 + local65[local103];
							@Pc(136) int local136 = local130 + local65[local108];
							local103 += local42;
							local108 += local42;
							@Pc(150) int local150 = local136 + local65[local108];
							local108 += local42;
							local72[local101] = (byte) (local150 >> 2);
							local101 += local42;
						}
						local103 += local95;
						local108 += local95;
					}
				}
				@Pc(199) byte[] local199 = local72;
				local72 = local65;
				local65 = local199;
				arg2 = local59;
				arg1 = local63;
				local59 >>= 0x1;
				local55 >>= 0x1;
				local63 >>= 0x1;
				local44++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IB)V")
	private void method8255() {
		this.aClass132_Sub1_Sub1_12.anInt8966 += this.method8244();
	}
}
