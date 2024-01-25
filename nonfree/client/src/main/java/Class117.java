import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public abstract class Class117 implements Interface15 {

	@OriginalMember(owner = "client!ga", name = "u", descriptor = "Lclient!tda;")
	private Class334 aClass334_12 = Static159.aClass334_8;

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "Z")
	private final boolean aBoolean745;

	@OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
	private final int anInt10837;

	@OriginalMember(owner = "client!ga", name = "p", descriptor = "Lclient!vea;")
	protected final Class363 aClass363_16;

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "Lclient!bja;")
	protected final Class36 aClass36_19;

	@OriginalMember(owner = "client!ga", name = "r", descriptor = "Lclient!ko;")
	protected final Class137_Sub1_Sub1 aClass137_Sub1_Sub1_12;

	@OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
	protected final int anInt10830;

	@OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
	private int anInt10828;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lclient!ko;ILclient!vea;Lclient!bja;IZ)V")
	protected Class117(@OriginalArg(0) Class137_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class363 arg2, @OriginalArg(3) Class36 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aBoolean745 = arg5;
		this.anInt10837 = arg4;
		this.aClass363_16 = arg2;
		this.aClass36_19 = arg3;
		this.aClass137_Sub1_Sub1_12 = arg0;
		this.anInt10830 = arg1;
		OpenGL.glGenTextures(1, Static516.anIntArray663, 0);
		this.anInt10828 = Static516.anIntArray663[0];
		this.method9025();
		this.method9030();
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)I")
	private int method9021() {
		@Pc(14) int local14 = this.aClass363_16.anInt10558 * this.aClass36_19.anInt1130 * this.anInt10837;
		return this.aBoolean745 ? local14 * 4 / 3 : local14;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II[BII)V")
	protected final void method9023(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 > 0 && !Static178.method2845(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static178.method2845(arg2)) {
			@Pc(38) int local38 = this.aClass363_16.anInt10558;
			@Pc(40) int local40 = 0;
			@Pc(47) int local47 = arg2 <= arg0 ? arg2 : arg0;
			@Pc(51) int local51 = arg0 >> 1;
			@Pc(55) int local55 = arg2 >> 1;
			@Pc(61) byte[] local61 = arg1;
			@Pc(68) byte[] local68 = new byte[local55 * local51 * local38];
			while (true) {
				OpenGL.glTexImage2Dub(arg3, local40, this.method9026(), arg0, arg2, 0, Static1.method8561(this.aClass363_16), 5121, local61, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(91) int local91 = arg0 * local38;
				@Pc(93) byte[] local93 = local68;
				for (@Pc(95) int local95 = 0; local95 < local38; local95++) {
					@Pc(99) int local99 = local95;
					@Pc(101) int local101 = local95;
					@Pc(105) int local105 = local95 + local91;
					for (@Pc(107) int local107 = 0; local107 < local55; local107++) {
						for (@Pc(111) int local111 = 0; local111 < local51; local111++) {
							@Pc(117) byte local117 = local61[local101];
							local101 += local38;
							@Pc(127) int local127 = local117 + local61[local101];
							local101 += local38;
							@Pc(137) int local137 = local127 + local61[local105];
							local105 += local38;
							@Pc(147) int local147 = local137 + local61[local105];
							local105 += local38;
							local68[local99] = (byte) (local147 >> 2);
							local99 += local38;
						}
						local101 += local91;
						local105 += local91;
					}
				}
				local68 = local61;
				arg2 = local55;
				local61 = local93;
				arg0 = local51;
				local55 >>= 0x1;
				local51 >>= 0x1;
				local47 >>= 0x1;
				local40++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(B)V")
	private void method9024() {
		if (this.anInt10828 > 0) {
			this.aClass137_Sub1_Sub1_12.method4975(this.method9021(), this.anInt10828);
			this.anInt10828 = 0;
		}
	}

	@OriginalMember(owner = "client!ga", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method9024();
		super.finalize();
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(Z)V")
	private void method9025() {
		this.aClass137_Sub1_Sub1_12.method8007(this);
		if (this.aClass334_12 == Static159.aClass334_8) {
			OpenGL.glTexParameteri(this.anInt10830, 10241, this.aBoolean745 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt10830, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt10830, 10241, this.aBoolean745 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt10830, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)I")
	protected final int method9026() {
		if (Static47.aClass36_5 == this.aClass36_19) {
			if (Static532.aClass363_13 == this.aClass363_16) {
				return 6407;
			}
			if (this.aClass363_16 == Static238.aClass363_4) {
				return 6408;
			}
			if (this.aClass363_16 == Static202.aClass363_3) {
				return 6406;
			}
			if (this.aClass363_16 == Static487.aClass363_14) {
				return 6409;
			}
			if (this.aClass363_16 == Static649.aClass363_17) {
				return 6410;
			}
			if (Static195.aClass363_2 == this.aClass363_16) {
				return 6145;
			}
		} else if (Static47.aClass36_8 == this.aClass36_19) {
			if (Static532.aClass363_13 == this.aClass363_16) {
				return 34843;
			}
			if (this.aClass363_16 == Static238.aClass363_4) {
				return 34842;
			}
			if (this.aClass363_16 == Static202.aClass363_3) {
				return 34844;
			}
			if (this.aClass363_16 == Static487.aClass363_14) {
				return 34846;
			}
			if (this.aClass363_16 == Static649.aClass363_17) {
				return 34847;
			}
			if (Static195.aClass363_2 == this.aClass363_16) {
				return 6145;
			}
		} else if (Static47.aClass36_9 == this.aClass36_19) {
			if (Static532.aClass363_13 == this.aClass363_16) {
				return 34837;
			}
			if (Static238.aClass363_4 == this.aClass363_16) {
				return 34836;
			}
			if (this.aClass363_16 == Static202.aClass363_3) {
				return 34838;
			}
			if (Static487.aClass363_14 == this.aClass363_16) {
				return 34840;
			}
			if (Static649.aClass363_17 == this.aClass363_16) {
				return 34841;
			}
			if (Static195.aClass363_2 == this.aClass363_16) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIII[I)V")
	protected final void method9027(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg0 > 0 && !Static178.method2845(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg2 > 0 && !Static178.method2845(arg2)) {
			throw new IllegalArgumentException("");
		} else if (Static238.aClass363_4 == this.aClass363_16) {
			@Pc(41) int local41 = 0;
			@Pc(52) int local52 = arg0 >= arg2 ? arg2 : arg0;
			@Pc(56) int local56 = arg0 >> 1;
			@Pc(60) int local60 = arg2 >> 1;
			@Pc(62) int[] local62 = arg3;
			@Pc(67) int[] local67 = new int[local60 * local56];
			while (true) {
				OpenGL.glTexImage2Di(arg1, local41, this.method9026(), arg0, arg2, 0, 32993, this.aClass137_Sub1_Sub1_12.anInt5950, local62, 0);
				if (local52 <= 1) {
					return;
				}
				@Pc(87) int local87 = 0;
				@Pc(89) int local89 = 0;
				@Pc(93) int local93 = arg0;
				for (@Pc(95) int local95 = 0; local95 < local60; local95++) {
					for (@Pc(99) int local99 = 0; local99 < local56; local99++) {
						@Pc(106) int local106 = local62[local89++];
						@Pc(111) int local111 = local62[local93++];
						@Pc(116) int local116 = local62[local89++];
						@Pc(122) int local122 = local106 >> 24 & 0xFF;
						@Pc(128) int local128 = local106 >> 16 & 0xFF;
						@Pc(133) int local133 = local62[local93++];
						@Pc(137) int local137 = local106 & 0xFF;
						@Pc(143) int local143 = local106 >> 8 & 0xFF;
						@Pc(151) int local151 = local143 + (local116 >> 8 & 0xFF);
						@Pc(157) int local157 = local137 + (local116 & 0xFF);
						@Pc(165) int local165 = local128 + (local116 >> 16 & 0xFF);
						@Pc(173) int local173 = local122 + (local116 >> 24 & 0xFF);
						@Pc(179) int local179 = local157 + (local111 & 0xFF);
						@Pc(187) int local187 = local173 + (local111 >> 24 & 0xFF);
						@Pc(195) int local195 = local165 + (local111 >> 16 & 0xFF);
						@Pc(203) int local203 = local151 + (local111 >> 8 & 0xFF);
						@Pc(211) int local211 = local195 + (local133 >> 16 & 0xFF);
						@Pc(219) int local219 = local187 + (local133 >> 24 & 0xFF);
						@Pc(225) int local225 = local179 + (local133 & 0xFF);
						@Pc(233) int local233 = local203 + (local133 >> 8 & 0xFF);
						local67[local87++] = local225 >> 2 & 0xFF | (local219 & 0x3FC) << 22 | (local211 & 0x3FC) << 14 | (local233 & 0x3FC) << 6;
					}
					local93 += arg0;
					local89 += arg0;
				}
				@Pc(286) int[] local286 = local67;
				local67 = local62;
				arg0 = local56;
				local62 = local286;
				arg2 = local60;
				local56 >>= 0x1;
				local60 >>= 0x1;
				local52 >>= 0x1;
				local41++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIII[F)V")
	protected final void method9029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float[] arg3) {
		if (arg2 > 0 && !Static178.method2845(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static178.method2845(arg1)) {
			@Pc(34) int local34 = this.aClass363_16.anInt10558;
			@Pc(36) int local36 = 0;
			@Pc(47) int local47 = arg1 > arg2 ? arg2 : arg1;
			@Pc(51) int local51 = arg2 >> 1;
			@Pc(55) int local55 = arg1 >> 1;
			@Pc(57) float[] local57 = arg3;
			@Pc(64) float[] local64 = new float[local51 * local55 * local34];
			while (true) {
				OpenGL.glTexImage2Df(arg0, local36, this.method9026(), arg2, arg1, 0, Static1.method8561(this.aClass363_16), 5126, local57, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(92) int local92 = arg2 * local34;
				for (@Pc(94) int local94 = 0; local94 < local34; local94++) {
					@Pc(98) int local98 = local94;
					@Pc(100) int local100 = local94;
					@Pc(104) int local104 = local92 + local94;
					for (@Pc(106) int local106 = 0; local106 < local55; local106++) {
						for (@Pc(110) int local110 = 0; local110 < local51; local110++) {
							@Pc(116) float local116 = local57[local100];
							local100 += local34;
							@Pc(126) float local126 = local116 + local57[local100];
							local100 += local34;
							@Pc(136) float local136 = local126 + local57[local104];
							local104 += local34;
							@Pc(146) float local146 = local136 + local57[local104];
							local104 += local34;
							local64[local98] = local146 * 0.25F;
							local98 += local34;
						}
						local100 += local92;
						local104 += local92;
					}
				}
				@Pc(194) float[] local194 = local64;
				local64 = local57;
				local57 = local194;
				arg2 = local51;
				arg1 = local55;
				local36++;
				local51 >>= 0x1;
				local47 >>= 0x1;
				local55 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)V")
	private void method9030() {
		this.aClass137_Sub1_Sub1_12.anInt9705 += this.method9021();
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
	@Override
	public final void method9088() {
		@Pc(8) int local8 = this.aClass137_Sub1_Sub1_12.method8020();
		@Pc(22) int local22 = this.aClass137_Sub1_Sub1_12.anIntArray434[local8];
		if (this.anInt10830 != local22) {
			if (local22 != 0) {
				OpenGL.glBindTexture(local22, 0);
				OpenGL.glDisable(local22);
			}
			OpenGL.glEnable(this.anInt10830);
			this.aClass137_Sub1_Sub1_12.anIntArray434[local8] = this.anInt10830;
		}
		OpenGL.glBindTexture(this.anInt10830, this.anInt10828);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILclient!tda;)V")
	@Override
	public final void method9087(@OriginalArg(1) Class334 arg0) {
		if (arg0 != this.aClass334_12) {
			this.aClass334_12 = arg0;
			this.method9025();
		}
	}
}
