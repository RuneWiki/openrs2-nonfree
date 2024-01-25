import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ft")
public abstract class Class105 implements Interface3 {

	@OriginalMember(owner = "client!ft", name = "y", descriptor = "Lclient!bba;")
	private Class26 aClass26_11 = Static229.aClass26_6;

	@OriginalMember(owner = "client!ft", name = "l", descriptor = "I")
	private final int anInt8846;

	@OriginalMember(owner = "client!ft", name = "v", descriptor = "Lclient!ew;")
	protected final Class89 aClass89_19;

	@OriginalMember(owner = "client!ft", name = "q", descriptor = "Lclient!ck;")
	protected final Class33_Sub1_Sub1 aClass33_Sub1_Sub1_10;

	@OriginalMember(owner = "client!ft", name = "s", descriptor = "Lclient!em;")
	protected final Class82 aClass82_15;

	@OriginalMember(owner = "client!ft", name = "w", descriptor = "Z")
	private final boolean aBoolean746;

	@OriginalMember(owner = "client!ft", name = "g", descriptor = "I")
	protected final int anInt8841;

	@OriginalMember(owner = "client!ft", name = "p", descriptor = "I")
	private int anInt8850;

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(Lclient!ck;ILclient!em;Lclient!ew;IZ)V")
	protected Class105(@OriginalArg(0) Class33_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class82 arg2, @OriginalArg(3) Class89 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt8846 = arg4;
		this.aClass89_19 = arg3;
		this.aClass33_Sub1_Sub1_10 = arg0;
		this.aClass82_15 = arg2;
		this.aBoolean746 = arg5;
		this.anInt8841 = arg1;
		OpenGL.glGenTextures(1, Static425.anIntArray561, 0);
		this.anInt8850 = Static425.anIntArray561[0];
		this.method7301();
		this.method7305();
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "([IIIII)V")
	protected final void method7295(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 > 0 && !Static474.method7016(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg1 > 0 && !Static474.method7016(arg1)) {
			throw new IllegalArgumentException("");
		} else if (this.aClass82_15 == Static333.aClass82_9) {
			@Pc(44) int local44 = 0;
			@Pc(55) int local55 = arg2 >= arg1 ? arg1 : arg2;
			@Pc(59) int local59 = arg2 >> 1;
			@Pc(63) int local63 = arg1 >> 1;
			@Pc(65) int[] local65 = arg0;
			@Pc(70) int[] local70 = new int[local59 * local63];
			while (true) {
				OpenGL.glTexImage2Di(arg3, local44, this.method7307(), arg2, arg1, 0, 32993, this.aClass33_Sub1_Sub1_10.anInt1756, local65, 0);
				if (local55 <= 1) {
					return;
				}
				@Pc(92) int local92 = 0;
				@Pc(94) int local94 = 0;
				@Pc(98) int local98 = arg2;
				@Pc(100) int[] local100 = local70;
				for (@Pc(102) int local102 = 0; local102 < local63; local102++) {
					for (@Pc(106) int local106 = 0; local106 < local59; local106++) {
						@Pc(113) int local113 = local65[local94++];
						@Pc(118) int local118 = local65[local94++];
						@Pc(123) int local123 = local65[local98++];
						@Pc(128) int local128 = local65[local98++];
						@Pc(134) int local134 = local113 >> 16 & 0xFF;
						@Pc(140) int local140 = local113 >> 8 & 0xFF;
						@Pc(146) int local146 = local113 >> 24 & 0xFF;
						@Pc(150) int local150 = local113 & 0xFF;
						@Pc(158) int local158 = local140 + (local118 >> 8 & 0xFF);
						@Pc(166) int local166 = local134 + (local118 >> 16 & 0xFF);
						@Pc(174) int local174 = local146 + (local118 >> 24 & 0xFF);
						@Pc(180) int local180 = local150 + (local118 & 0xFF);
						@Pc(188) int local188 = local174 + (local123 >> 24 & 0xFF);
						@Pc(196) int local196 = local166 + (local123 >> 16 & 0xFF);
						@Pc(202) int local202 = local180 + (local123 & 0xFF);
						@Pc(210) int local210 = local158 + (local123 >> 8 & 0xFF);
						@Pc(218) int local218 = local188 + (local128 >> 24 & 0xFF);
						@Pc(226) int local226 = local196 + (local128 >> 16 & 0xFF);
						@Pc(234) int local234 = local210 + (local128 >> 8 & 0xFF);
						@Pc(240) int local240 = local202 + (local128 & 0xFF);
						local70[local92++] = (local234 & 0x3FC) << 6 | (local226 & 0x3FC) << 14 | (local218 & 0x3FC) << 22 | local240 >> 2 & 0xFF;
					}
					local94 += arg2;
					local98 += arg2;
				}
				local70 = local65;
				arg2 = local59;
				local65 = local100;
				arg1 = local63;
				local63 >>= 0x1;
				local55 >>= 0x1;
				local59 >>= 0x1;
				local44++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "(B)I")
	private int method7299() {
		@Pc(19) int local19 = this.aClass82_15.anInt3195 * this.aClass89_19.anInt3518 * this.anInt8846;
		return this.aBoolean746 ? local19 * 4 / 3 : local19;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!bba;I)V")
	@Override
	public final void method7294(@OriginalArg(0) Class26 arg0) {
		if (arg0 != this.aClass26_11) {
			this.aClass26_11 = arg0;
			this.method7301();
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Z)V")
	private void method7301() {
		this.aClass33_Sub1_Sub1_10.method1987(this);
		if (Static229.aClass26_6 == this.aClass26_11) {
			OpenGL.glTexParameteri(this.anInt8841, 10241, this.aBoolean746 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt8841, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt8841, 10241, this.aBoolean746 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt8841, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "([BIIII)V")
	protected final void method7302(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 > 0 && !Static474.method7016(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static474.method7016(arg2)) {
			@Pc(34) int local34 = this.aClass82_15.anInt3195;
			@Pc(36) int local36 = 0;
			@Pc(47) int local47 = arg3 < arg2 ? arg3 : arg2;
			@Pc(51) int local51 = arg3 >> 1;
			@Pc(64) int local64 = arg2 >> 1;
			@Pc(66) byte[] local66 = arg0;
			@Pc(73) byte[] local73 = new byte[local51 * local64 * local34];
			while (true) {
				OpenGL.glTexImage2Dub(arg1, local36, this.method7307(), arg3, arg2, 0, Static341.method5637(this.aClass82_15), 5121, local66, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(96) int local96 = local34 * arg3;
				@Pc(98) byte[] local98 = local73;
				for (@Pc(100) int local100 = 0; local100 < local34; local100++) {
					@Pc(104) int local104 = local100;
					@Pc(106) int local106 = local100;
					@Pc(110) int local110 = local96 + local100;
					for (@Pc(112) int local112 = 0; local112 < local64; local112++) {
						for (@Pc(116) int local116 = 0; local116 < local51; local116++) {
							@Pc(122) byte local122 = local66[local106];
							local106 += local34;
							@Pc(132) int local132 = local122 + local66[local106];
							@Pc(138) int local138 = local132 + local66[local110];
							local106 += local34;
							local110 += local34;
							@Pc(152) int local152 = local138 + local66[local110];
							local110 += local34;
							local73[local104] = (byte) (local152 >> 2);
							local104 += local34;
						}
						local110 += local96;
						local106 += local96;
					}
				}
				local73 = local66;
				local66 = local98;
				arg2 = local64;
				arg3 = local51;
				local64 >>= 0x1;
				local51 >>= 0x1;
				local47 >>= 0x1;
				local36++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "(I)V")
	@Override
	public final void method7293() {
		@Pc(8) int local8 = this.aClass33_Sub1_Sub1_10.method2093();
		@Pc(14) int local14 = this.aClass33_Sub1_Sub1_10.anIntArray73[local8];
		if (local14 != this.anInt8841) {
			if (local14 != 0) {
				OpenGL.glBindTexture(local14, 0);
				OpenGL.glDisable(local14);
			}
			OpenGL.glEnable(this.anInt8841);
			this.aClass33_Sub1_Sub1_10.anIntArray73[local8] = this.anInt8841;
		}
		OpenGL.glBindTexture(this.anInt8841, this.anInt8850);
	}

	@OriginalMember(owner = "client!ft", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7306();
		super.finalize();
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(I[FIII)V")
	protected final void method7304(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 > 0 && !Static474.method7016(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static474.method7016(arg2)) {
			@Pc(34) int local34 = this.aClass82_15.anInt3195;
			@Pc(36) int local36 = 0;
			@Pc(43) int local43 = arg0 < arg2 ? arg0 : arg2;
			@Pc(51) int local51 = arg0 >> 1;
			@Pc(55) int local55 = arg2 >> 1;
			@Pc(57) float[] local57 = arg1;
			@Pc(64) float[] local64 = new float[local55 * local51 * local34];
			while (true) {
				OpenGL.glTexImage2Df(arg3, local36, this.method7307(), arg0, arg2, 0, Static341.method5637(this.aClass82_15), 5126, local57, 0);
				if (local43 <= 1) {
					return;
				}
				@Pc(89) int local89 = arg0 * local34;
				for (@Pc(91) int local91 = 0; local91 < local34; local91++) {
					@Pc(95) int local95 = local91;
					@Pc(97) int local97 = local91;
					@Pc(101) int local101 = local89 + local91;
					for (@Pc(103) int local103 = 0; local103 < local55; local103++) {
						for (@Pc(107) int local107 = 0; local107 < local51; local107++) {
							@Pc(113) float local113 = local57[local97];
							local97 += local34;
							@Pc(123) float local123 = local113 + local57[local97];
							@Pc(129) float local129 = local123 + local57[local101];
							local97 += local34;
							local101 += local34;
							@Pc(143) float local143 = local129 + local57[local101];
							local101 += local34;
							local64[local95] = local143 * 0.25F;
							local95 += local34;
						}
						local101 += local89;
						local97 += local89;
					}
				}
				@Pc(183) float[] local183 = local64;
				local64 = local57;
				arg0 = local51;
				local57 = local183;
				arg2 = local55;
				local43 >>= 0x1;
				local55 >>= 0x1;
				local51 >>= 0x1;
				local36++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IZ)V")
	private void method7305() {
		this.aClass33_Sub1_Sub1_10.anInt2156 += this.method7299();
	}

	@OriginalMember(owner = "client!ft", name = "f", descriptor = "(I)V")
	private void method7306() {
		if (this.anInt8850 > 0) {
			this.aClass33_Sub1_Sub1_10.method1731(this.anInt8850, this.method7299());
			this.anInt8850 = 0;
		}
	}

	@OriginalMember(owner = "client!ft", name = "g", descriptor = "(I)I")
	protected final int method7307() {
		if (this.aClass89_19 == Static137.aClass89_8) {
			if (Static358.aClass82_12 == this.aClass82_15) {
				return 6407;
			}
			if (this.aClass82_15 == Static333.aClass82_9) {
				return 6408;
			}
			if (Static104.aClass82_3 == this.aClass82_15) {
				return 6406;
			}
			if (this.aClass82_15 == Static300.aClass82_10) {
				return 6409;
			}
			if (Static201.aClass82_6 == this.aClass82_15) {
				return 6410;
			}
			if (Static576.aClass82_16 == this.aClass82_15) {
				return 6145;
			}
		} else if (Static137.aClass89_11 == this.aClass89_19) {
			if (Static358.aClass82_12 == this.aClass82_15) {
				return 34843;
			}
			if (Static333.aClass82_9 == this.aClass82_15) {
				return 34842;
			}
			if (this.aClass82_15 == Static104.aClass82_3) {
				return 34844;
			}
			if (Static300.aClass82_10 == this.aClass82_15) {
				return 34846;
			}
			if (this.aClass82_15 == Static201.aClass82_6) {
				return 34847;
			}
			if (this.aClass82_15 == Static576.aClass82_16) {
				return 6145;
			}
		} else if (Static137.aClass89_12 == this.aClass89_19) {
			if (this.aClass82_15 == Static358.aClass82_12) {
				return 34837;
			}
			if (Static333.aClass82_9 == this.aClass82_15) {
				return 34836;
			}
			if (Static104.aClass82_3 == this.aClass82_15) {
				return 34838;
			}
			if (this.aClass82_15 == Static300.aClass82_10) {
				return 34840;
			}
			if (this.aClass82_15 == Static201.aClass82_6) {
				return 34841;
			}
			if (Static576.aClass82_16 == this.aClass82_15) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}
}
