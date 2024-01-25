import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public abstract class Class39 implements Interface12 {

	@OriginalMember(owner = "client!vf", name = "y", descriptor = "Lclient!vea;")
	private Class384 aClass384_11 = Static108.aClass384_7;

	@OriginalMember(owner = "client!vf", name = "p", descriptor = "I")
	private final int anInt11099;

	@OriginalMember(owner = "client!vf", name = "z", descriptor = "Lclient!ns;")
	protected final Class261 aClass261_20;

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
	protected final int anInt11091;

	@OriginalMember(owner = "client!vf", name = "n", descriptor = "Z")
	private final boolean aBoolean801;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "Lclient!hd;")
	protected final Class145 aClass145_16;

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "Lclient!lt;")
	protected final Class67_Sub1_Sub2 aClass67_Sub1_Sub2_12;

	@OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
	private int anInt11086;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lclient!lt;ILclient!hd;Lclient!ns;IZ)V")
	protected Class39(@OriginalArg(0) Class67_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class145 arg2, @OriginalArg(3) Class261 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt11099 = arg4;
		this.aClass261_20 = arg3;
		this.anInt11091 = arg1;
		this.aBoolean801 = arg5;
		this.aClass145_16 = arg2;
		this.aClass67_Sub1_Sub2_12 = arg0;
		OpenGL.glGenTextures(1, Static155.anIntArray138, 0);
		this.anInt11086 = Static155.anIntArray138[0];
		this.method9259();
		this.method9261();
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(B)V")
	private void method9259() {
		this.aClass67_Sub1_Sub2_12.method5612(this);
		if (Static108.aClass384_7 == this.aClass384_11) {
			OpenGL.glTexParameteri(this.anInt11091, 10241, this.aBoolean801 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt11091, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt11091, 10241, this.aBoolean801 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt11091, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!vea;I)V")
	@Override
	public final void method9258(@OriginalArg(0) Class384 arg0) {
		if (this.aClass384_11 != arg0) {
			this.aClass384_11 = arg0;
			this.method9259();
		}
	}

	@OriginalMember(owner = "client!vf", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method9262();
		super.finalize();
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)V")
	@Override
	public final void method9257() {
		@Pc(13) int local13 = this.aClass67_Sub1_Sub2_12.method5643();
		@Pc(19) int local19 = this.aClass67_Sub1_Sub2_12.anIntArray362[local13];
		if (local19 != this.anInt11091) {
			if (local19 != 0) {
				OpenGL.glBindTexture(local19, 0);
				OpenGL.glDisable(local19);
			}
			OpenGL.glEnable(this.anInt11091);
			this.aClass67_Sub1_Sub2_12.anIntArray362[local13] = this.anInt11091;
		}
		OpenGL.glBindTexture(this.anInt11091, this.anInt11086);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z[IIII)V")
	protected final void method9260(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 > 0 && !Static28.method398(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg1 > 0 && !Static28.method398(arg1)) {
			throw new IllegalArgumentException("");
		} else if (this.aClass145_16 == Static557.aClass145_14) {
			@Pc(53) int local53 = 0;
			@Pc(61) int local61 = arg3 < arg1 ? arg3 : arg1;
			@Pc(65) int local65 = arg3 >> 1;
			@Pc(69) int local69 = arg1 >> 1;
			@Pc(71) int[] local71 = arg0;
			@Pc(76) int[] local76 = new int[local69 * local65];
			while (true) {
				OpenGL.glTexImage2Di(arg2, local53, this.method9264(), arg3, arg1, 0, 32993, this.aClass67_Sub1_Sub2_12.anInt6778, local71, 0);
				if (local61 <= 1) {
					return;
				}
				@Pc(98) int local98 = 0;
				@Pc(100) int local100 = 0;
				@Pc(104) int local104 = arg3;
				for (@Pc(106) int local106 = 0; local106 < local69; local106++) {
					for (@Pc(112) int local112 = 0; local112 < local65; local112++) {
						@Pc(121) int local121 = local71[local100++];
						@Pc(126) int local126 = local71[local104++];
						@Pc(131) int local131 = local71[local100++];
						@Pc(135) int local135 = local121 & 0xFF;
						@Pc(141) int local141 = local121 >> 16 & 0xFF;
						@Pc(147) int local147 = local121 >> 8 & 0xFF;
						@Pc(152) int local152 = local71[local104++];
						@Pc(158) int local158 = local121 >> 24 & 0xFF;
						@Pc(166) int local166 = local158 + (local131 >> 24 & 0xFF);
						@Pc(174) int local174 = local147 + (local131 >> 8 & 0xFF);
						@Pc(182) int local182 = local141 + (local131 >> 16 & 0xFF);
						@Pc(188) int local188 = local135 + (local131 & 0xFF);
						@Pc(196) int local196 = local174 + (local126 >> 8 & 0xFF);
						@Pc(204) int local204 = local166 + (local126 >> 24 & 0xFF);
						@Pc(210) int local210 = local188 + (local126 & 0xFF);
						@Pc(218) int local218 = local182 + (local126 >> 16 & 0xFF);
						@Pc(226) int local226 = local196 + (local152 >> 8 & 0xFF);
						@Pc(232) int local232 = local210 + (local152 & 0xFF);
						@Pc(240) int local240 = local204 + (local152 >> 24 & 0xFF);
						@Pc(248) int local248 = local218 + (local152 >> 16 & 0xFF);
						local76[local98++] = local232 >> 2 & 0xFF | (local240 & 0x3FC) << 22 | (local248 & 0x3FC) << 14 | (local226 & 0x3FC) << 6;
					}
					local100 += arg3;
					local104 += arg3;
				}
				@Pc(303) int[] local303 = local76;
				local76 = local71;
				arg3 = local65;
				arg1 = local69;
				local71 = local303;
				local61 >>= 0x1;
				local53++;
				local69 >>= 0x1;
				local65 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)V")
	private void method9261() {
		this.aClass67_Sub1_Sub2_12.anInt6648 += this.method9263();
	}

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "(B)V")
	private void method9262() {
		if (this.anInt11086 > 0) {
			this.aClass67_Sub1_Sub2_12.method5696(this.anInt11086, this.method9263());
			this.anInt11086 = 0;
		}
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)I")
	private int method9263() {
		@Pc(22) int local22 = this.aClass261_20.anInt7631 * this.aClass145_16.anInt4448 * this.anInt11099;
		return this.aBoolean801 ? local22 * 4 / 3 : local22;
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)I")
	protected final int method9264() {
		if (Static438.aClass261_14 == this.aClass261_20) {
			if (Static702.aClass145_15 == this.aClass145_16) {
				return 6407;
			}
			if (Static557.aClass145_14 == this.aClass145_16) {
				return 6408;
			}
			if (this.aClass145_16 == Static407.aClass145_13) {
				return 6406;
			}
			if (this.aClass145_16 == Static184.aClass145_7) {
				return 6409;
			}
			if (Static349.aClass145_9 == this.aClass145_16) {
				return 6410;
			}
			if (this.aClass145_16 == Static618.aClass145_11) {
				return 6145;
			}
		} else if (Static438.aClass261_17 == this.aClass261_20) {
			if (Static702.aClass145_15 == this.aClass145_16) {
				return 34843;
			}
			if (Static557.aClass145_14 == this.aClass145_16) {
				return 34842;
			}
			if (this.aClass145_16 == Static407.aClass145_13) {
				return 34844;
			}
			if (Static184.aClass145_7 == this.aClass145_16) {
				return 34846;
			}
			if (Static349.aClass145_9 == this.aClass145_16) {
				return 34847;
			}
			if (this.aClass145_16 == Static618.aClass145_11) {
				return 6145;
			}
		} else if (Static438.aClass261_18 == this.aClass261_20) {
			if (this.aClass145_16 == Static702.aClass145_15) {
				return 34837;
			}
			if (this.aClass145_16 == Static557.aClass145_14) {
				return 34836;
			}
			if (this.aClass145_16 == Static407.aClass145_13) {
				return 34838;
			}
			if (Static184.aClass145_7 == this.aClass145_16) {
				return 34840;
			}
			if (Static349.aClass145_9 == this.aClass145_16) {
				return 34841;
			}
			if (Static618.aClass145_11 == this.aClass145_16) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(III[FZ)V")
	protected final void method9265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3) {
		if (arg1 > 0 && !Static28.method398(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static28.method398(arg2)) {
			@Pc(37) int local37 = this.aClass145_16.anInt4448;
			@Pc(39) int local39 = 0;
			@Pc(47) int local47 = arg2 > arg1 ? arg1 : arg2;
			@Pc(51) int local51 = arg1 >> 1;
			@Pc(64) int local64 = arg2 >> 1;
			@Pc(66) float[] local66 = arg3;
			@Pc(73) float[] local73 = new float[local64 * local51 * local37];
			while (true) {
				OpenGL.glTexImage2Df(arg0, local39, this.method9264(), arg1, arg2, 0, Static235.method3664(this.aClass145_16), 5126, local66, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(96) int local96 = local37 * arg1;
				for (@Pc(98) int local98 = 0; local98 < local37; local98++) {
					@Pc(104) int local104 = local98;
					@Pc(106) int local106 = local98;
					@Pc(110) int local110 = local98 + local96;
					for (@Pc(112) int local112 = 0; local112 < local64; local112++) {
						for (@Pc(116) int local116 = 0; local116 < local51; local116++) {
							@Pc(122) float local122 = local66[local106];
							local106 += local37;
							@Pc(132) float local132 = local122 + local66[local106];
							local106 += local37;
							@Pc(142) float local142 = local132 + local66[local110];
							local110 += local37;
							@Pc(152) float local152 = local142 + local66[local110];
							local73[local104] = local152 * 0.25F;
							local110 += local37;
							local104 += local37;
						}
						local110 += local96;
						local106 += local96;
					}
				}
				@Pc(190) float[] local190 = local73;
				local73 = local66;
				local66 = local190;
				arg2 = local64;
				arg1 = local51;
				local51 >>= 0x1;
				local64 >>= 0x1;
				local47 >>= 0x1;
				local39++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBI[BI)V")
	protected final void method9267(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 > 0 && !Static28.method398(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static28.method398(arg0)) {
			@Pc(50) int local50 = this.aClass145_16.anInt4448;
			@Pc(52) int local52 = 0;
			@Pc(64) int local64 = arg0 <= arg1 ? arg0 : arg1;
			@Pc(68) int local68 = arg1 >> 1;
			@Pc(72) int local72 = arg0 >> 1;
			@Pc(74) byte[] local74 = arg2;
			@Pc(81) byte[] local81 = new byte[local68 * local72 * local50];
			while (true) {
				OpenGL.glTexImage2Dub(arg3, local52, this.method9264(), arg1, arg0, 0, Static235.method3664(this.aClass145_16), 5121, local74, 0);
				if (local64 <= 1) {
					return;
				}
				@Pc(108) int local108 = arg1 * local50;
				for (@Pc(110) int local110 = 0; local110 < local50; local110++) {
					@Pc(116) int local116 = local110;
					@Pc(118) int local118 = local110;
					@Pc(122) int local122 = local110 + local108;
					for (@Pc(124) int local124 = 0; local124 < local72; local124++) {
						for (@Pc(128) int local128 = 0; local128 < local68; local128++) {
							@Pc(136) byte local136 = local74[local118];
							local118 += local50;
							@Pc(146) int local146 = local136 + local74[local118];
							@Pc(152) int local152 = local146 + local74[local122];
							local118 += local50;
							local122 += local50;
							@Pc(166) int local166 = local152 + local74[local122];
							local81[local116] = (byte) (local166 >> 2);
							local122 += local50;
							local116 += local50;
						}
						local118 += local108;
						local122 += local108;
					}
				}
				@Pc(211) byte[] local211 = local81;
				local81 = local74;
				arg0 = local72;
				arg1 = local68;
				local74 = local211;
				local64 >>= 0x1;
				local72 >>= 0x1;
				local52++;
				local68 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
