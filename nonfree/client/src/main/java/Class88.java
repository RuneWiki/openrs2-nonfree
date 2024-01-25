import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mba")
public abstract class Class88 implements Interface15 {

	@OriginalMember(owner = "client!mba", name = "n", descriptor = "Lclient!gu;")
	private Class113 aClass113_11 = Static402.aClass113_9;

	@OriginalMember(owner = "client!mba", name = "h", descriptor = "Z")
	private final boolean aBoolean623;

	@OriginalMember(owner = "client!mba", name = "w", descriptor = "I")
	private final int anInt8890;

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "Lclient!sb;")
	protected final Class264 aClass264_20;

	@OriginalMember(owner = "client!mba", name = "t", descriptor = "Lclient!ph;")
	protected final Class122_Sub2_Sub2 aClass122_Sub2_Sub2_10;

	@OriginalMember(owner = "client!mba", name = "e", descriptor = "I")
	protected final int anInt8877;

	@OriginalMember(owner = "client!mba", name = "d", descriptor = "Lclient!uda;")
	protected final Class292 aClass292_16;

	@OriginalMember(owner = "client!mba", name = "k", descriptor = "I")
	private int anInt8881;

	@OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Lclient!ph;ILclient!uda;Lclient!sb;IZ)V")
	protected Class88(@OriginalArg(0) Class122_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class292 arg2, @OriginalArg(3) Class264 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aBoolean623 = arg5;
		this.anInt8890 = arg4;
		this.aClass264_20 = arg3;
		this.aClass122_Sub2_Sub2_10 = arg0;
		this.anInt8877 = arg1;
		this.aClass292_16 = arg2;
		OpenGL.glGenTextures(1, Static275.anIntArray527, 0);
		this.anInt8881 = Static275.anIntArray527[0];
		this.method7311();
		this.method7312();
	}

	@OriginalMember(owner = "client!mba", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7314();
		super.finalize();
	}

	@OriginalMember(owner = "client!mba", name = "d", descriptor = "(I)I")
	private int method7304() {
		@Pc(19) int local19 = this.aClass292_16.anInt8024 * this.aClass264_20.anInt7501 * this.anInt8890;
		return this.aBoolean623 ? local19 * 4 / 3 : local19;
	}

	@OriginalMember(owner = "client!mba", name = "c", descriptor = "(I)V")
	@Override
	public final void method7303() {
		@Pc(8) int local8 = this.aClass122_Sub2_Sub2_10.method5680();
		@Pc(14) int local14 = this.aClass122_Sub2_Sub2_10.anIntArray661[local8];
		if (local14 != this.anInt8877) {
			if (local14 != 0) {
				OpenGL.glBindTexture(local14, 0);
				OpenGL.glDisable(local14);
			}
			OpenGL.glEnable(this.anInt8877);
			this.aClass122_Sub2_Sub2_10.anIntArray661[local8] = this.anInt8877;
		}
		OpenGL.glBindTexture(this.anInt8877, this.anInt8881);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IIZI[F)V")
	protected final void method7307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float[] arg3) {
		if (arg2 > 0 && !Static535.method7411(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static535.method7411(arg0)) {
			@Pc(42) int local42 = this.aClass292_16.anInt8024;
			@Pc(44) int local44 = 0;
			@Pc(55) int local55 = arg0 <= arg2 ? arg0 : arg2;
			@Pc(59) int local59 = arg2 >> 1;
			@Pc(63) int local63 = arg0 >> 1;
			@Pc(65) float[] local65 = arg3;
			@Pc(72) float[] local72 = new float[local59 * local63 * local42];
			while (true) {
				OpenGL.glTexImage2Df(arg1, local44, this.method7309(), arg2, arg0, 0, Static168.method4654(this.aClass292_16), 5126, local65, 0);
				if (local55 <= 1) {
					return;
				}
				@Pc(96) int local96 = local42 * arg2;
				for (@Pc(98) int local98 = 0; local98 < local42; local98++) {
					@Pc(102) int local102 = local98;
					@Pc(104) int local104 = local98;
					@Pc(108) int local108 = local98 + local96;
					for (@Pc(110) int local110 = 0; local110 < local63; local110++) {
						for (@Pc(114) int local114 = 0; local114 < local59; local114++) {
							@Pc(120) float local120 = local65[local104];
							local104 += local42;
							@Pc(130) float local130 = local120 + local65[local104];
							local104 += local42;
							@Pc(140) float local140 = local130 + local65[local108];
							local108 += local42;
							@Pc(150) float local150 = local140 + local65[local108];
							local108 += local42;
							local72[local102] = local150 * 0.25F;
							local102 += local42;
						}
						local104 += local96;
						local108 += local96;
					}
				}
				@Pc(190) float[] local190 = local72;
				local72 = local65;
				local65 = local190;
				arg2 = local59;
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

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Z[IIII)V")
	protected final void method7308(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 > 0 && !Static535.method7411(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg1 > 0 && !Static535.method7411(arg1)) {
			throw new IllegalArgumentException("");
		} else if (this.aClass292_16 == Static542.aClass292_17) {
			@Pc(44) int local44 = 0;
			@Pc(55) int local55 = arg1 <= arg2 ? arg1 : arg2;
			@Pc(59) int local59 = arg2 >> 1;
			@Pc(63) int local63 = arg1 >> 1;
			@Pc(69) int[] local69 = arg0;
			@Pc(74) int[] local74 = new int[local59 * local63];
			while (true) {
				OpenGL.glTexImage2Di(arg3, local44, this.method7309(), arg2, arg1, 0, 32993, this.aClass122_Sub2_Sub2_10.anInt6812, local69, 0);
				if (local55 <= 1) {
					return;
				}
				@Pc(95) int local95 = 0;
				@Pc(97) int local97 = 0;
				@Pc(101) int local101 = arg2;
				for (@Pc(103) int local103 = 0; local103 < local63; local103++) {
					for (@Pc(107) int local107 = 0; local107 < local59; local107++) {
						@Pc(114) int local114 = local69[local97++];
						@Pc(119) int local119 = local69[local101++];
						@Pc(124) int local124 = local69[local97++];
						@Pc(129) int local129 = local69[local101++];
						@Pc(133) int local133 = local114 & 0xFF;
						@Pc(139) int local139 = local114 >> 8 & 0xFF;
						@Pc(145) int local145 = local114 >> 24 & 0xFF;
						@Pc(151) int local151 = local114 >> 16 & 0xFF;
						@Pc(157) int local157 = local133 + (local124 & 0xFF);
						@Pc(165) int local165 = local139 + (local124 >> 8 & 0xFF);
						@Pc(173) int local173 = local145 + (local124 >> 24 & 0xFF);
						@Pc(181) int local181 = local151 + (local124 >> 16 & 0xFF);
						@Pc(189) int local189 = local181 + (local119 >> 16 & 0xFF);
						@Pc(197) int local197 = local165 + (local119 >> 8 & 0xFF);
						@Pc(205) int local205 = local173 + (local119 >> 24 & 0xFF);
						@Pc(211) int local211 = local157 + (local119 & 0xFF);
						@Pc(219) int local219 = local197 + (local129 >> 8 & 0xFF);
						@Pc(227) int local227 = local189 + (local129 >> 16 & 0xFF);
						@Pc(233) int local233 = local211 + (local129 & 0xFF);
						@Pc(241) int local241 = local205 + (local129 >> 24 & 0xFF);
						local74[local95++] = local233 >> 2 & 0xFF | (local227 & 0x3FC) << 14 | (local241 & 0x3FC) << 22 | (local219 & 0x3FC) << 6;
					}
					local101 += arg2;
					local97 += arg2;
				}
				@Pc(286) int[] local286 = local74;
				local74 = local69;
				arg2 = local59;
				local69 = local286;
				arg1 = local63;
				local44++;
				local55 >>= 0x1;
				local63 >>= 0x1;
				local59 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!mba", name = "g", descriptor = "(I)I")
	protected final int method7309() {
		if (this.aClass264_20 == Static431.aClass264_15) {
			if (Static252.aClass292_9 == this.aClass292_16) {
				return 6407;
			}
			if (Static542.aClass292_17 == this.aClass292_16) {
				return 6408;
			}
			if (this.aClass292_16 == Static526.aClass292_15) {
				return 6406;
			}
			if (Static299.aClass292_10 == this.aClass292_16) {
				return 6409;
			}
			if (this.aClass292_16 == Static184.aClass292_13) {
				return 6410;
			}
			if (Static521.aClass292_14 == this.aClass292_16) {
				return 6145;
			}
		} else if (this.aClass264_20 == Static431.aClass264_18) {
			if (Static252.aClass292_9 == this.aClass292_16) {
				return 34843;
			}
			if (Static542.aClass292_17 == this.aClass292_16) {
				return 34842;
			}
			if (Static526.aClass292_15 == this.aClass292_16) {
				return 34844;
			}
			if (Static299.aClass292_10 == this.aClass292_16) {
				return 34846;
			}
			if (Static184.aClass292_13 == this.aClass292_16) {
				return 34847;
			}
			if (Static521.aClass292_14 == this.aClass292_16) {
				return 6145;
			}
		} else if (Static431.aClass264_19 == this.aClass264_20) {
			if (Static252.aClass292_9 == this.aClass292_16) {
				return 34837;
			}
			if (Static542.aClass292_17 == this.aClass292_16) {
				return 34836;
			}
			if (this.aClass292_16 == Static526.aClass292_15) {
				return 34838;
			}
			if (this.aClass292_16 == Static299.aClass292_10) {
				return 34840;
			}
			if (this.aClass292_16 == Static184.aClass292_13) {
				return 34841;
			}
			if (this.aClass292_16 == Static521.aClass292_14) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lclient!gu;I)V")
	@Override
	public final void method7302(@OriginalArg(0) Class113 arg0) {
		if (this.aClass113_11 != arg0) {
			this.aClass113_11 = arg0;
			this.method7311();
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(I[BZII)V")
	protected final void method7310(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 > 0 && !Static535.method7411(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static535.method7411(arg0)) {
			@Pc(34) int local34 = this.aClass292_16.anInt8024;
			@Pc(36) int local36 = 0;
			@Pc(47) int local47 = arg3 < arg0 ? arg3 : arg0;
			@Pc(51) int local51 = arg3 >> 1;
			@Pc(59) int local59 = arg0 >> 1;
			@Pc(61) byte[] local61 = arg1;
			@Pc(68) byte[] local68 = new byte[local34 * local59 * local51];
			while (true) {
				OpenGL.glTexImage2Dub(arg2, local36, this.method7309(), arg3, arg0, 0, Static168.method4654(this.aClass292_16), 5121, local61, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(91) int local91 = arg3 * local34;
				@Pc(93) byte[] local93 = local68;
				for (@Pc(95) int local95 = 0; local95 < local34; local95++) {
					@Pc(99) int local99 = local95;
					@Pc(101) int local101 = local95;
					@Pc(105) int local105 = local91 + local95;
					for (@Pc(107) int local107 = 0; local107 < local59; local107++) {
						for (@Pc(111) int local111 = 0; local111 < local51; local111++) {
							@Pc(117) byte local117 = local61[local101];
							local101 += local34;
							@Pc(127) int local127 = local117 + local61[local101];
							local101 += local34;
							@Pc(137) int local137 = local127 + local61[local105];
							local105 += local34;
							@Pc(147) int local147 = local137 + local61[local105];
							local68[local99] = (byte) (local147 >> 2);
							local105 += local34;
							local99 += local34;
						}
						local105 += local91;
						local101 += local91;
					}
				}
				local68 = local61;
				arg3 = local51;
				local61 = local93;
				arg0 = local59;
				local36++;
				local51 >>= 0x1;
				local59 >>= 0x1;
				local47 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!mba", name = "h", descriptor = "(I)V")
	private void method7311() {
		this.aClass122_Sub2_Sub2_10.method5651(this);
		if (this.aClass113_11 == Static402.aClass113_9) {
			OpenGL.glTexParameteri(this.anInt8877, 10241, this.aBoolean623 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt8877, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt8877, 10241, this.aBoolean623 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt8877, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IB)V")
	private void method7312() {
		this.aClass122_Sub2_Sub2_10.anInt6686 += this.method7304();
	}

	@OriginalMember(owner = "client!mba", name = "i", descriptor = "(I)V")
	private void method7314() {
		if (this.anInt8881 > 0) {
			this.aClass122_Sub2_Sub2_10.method5691(this.method7304(), this.anInt8881);
			this.anInt8881 = 0;
		}
	}
}
