import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public abstract class Class59 implements Interface17 {

	@OriginalMember(owner = "client!jg", name = "u", descriptor = "Lclient!tb;")
	private Class328 aClass328_8 = Static541.aClass328_10;

	@OriginalMember(owner = "client!jg", name = "o", descriptor = "Lclient!kea;")
	protected final Class188 aClass188_10;

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
	private final int anInt5587;

	@OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
	protected final int anInt5594;

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "Z")
	private final boolean aBoolean406;

	@OriginalMember(owner = "client!jg", name = "A", descriptor = "Lclient!kf;")
	protected final Class189 aClass189_17;

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "Lclient!sb;")
	protected final Class95_Sub3_Sub2 aClass95_Sub3_Sub2_8;

	@OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
	private int anInt5596;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lclient!sb;ILclient!kea;Lclient!kf;IZ)V")
	protected Class59(@OriginalArg(0) Class95_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class188 arg2, @OriginalArg(3) Class189 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aClass188_10 = arg2;
		this.anInt5587 = arg4;
		this.anInt5594 = arg1;
		this.aBoolean406 = arg5;
		this.aClass189_17 = arg3;
		this.aClass95_Sub3_Sub2_8 = arg0;
		OpenGL.glGenTextures(1, Static411.anIntArray472, 0);
		this.anInt5596 = Static411.anIntArray472[0];
		this.method4773();
		this.method4771();
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIZ[FI)V")
	protected final void method4764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 > 0 && !Static485.method6790(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static485.method6790(arg0)) {
			@Pc(34) int local34 = this.aClass188_10.anInt4725;
			@Pc(36) int local36 = 0;
			@Pc(47) int local47 = arg0 > arg3 ? arg3 : arg0;
			@Pc(51) int local51 = arg3 >> 1;
			@Pc(55) int local55 = arg0 >> 1;
			@Pc(57) float[] local57 = arg2;
			@Pc(71) float[] local71 = new float[local34 * local55 * local51];
			while (true) {
				OpenGL.glTexImage2Df(arg1, local36, this.method4765(), arg3, arg0, 0, Static269.method3772(this.aClass188_10), 5126, local57, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(97) int local97 = arg3 * local34;
				for (@Pc(99) int local99 = 0; local99 < local34; local99++) {
					@Pc(103) int local103 = local99;
					@Pc(105) int local105 = local99;
					@Pc(109) int local109 = local97 + local99;
					for (@Pc(111) int local111 = 0; local111 < local55; local111++) {
						for (@Pc(115) int local115 = 0; local115 < local51; local115++) {
							@Pc(121) float local121 = local57[local105];
							local105 += local34;
							@Pc(131) float local131 = local121 + local57[local105];
							@Pc(137) float local137 = local131 + local57[local109];
							local105 += local34;
							local109 += local34;
							@Pc(151) float local151 = local137 + local57[local109];
							local109 += local34;
							local71[local103] = local151 * 0.25F;
							local103 += local34;
						}
						local109 += local97;
						local105 += local97;
					}
				}
				@Pc(191) float[] local191 = local71;
				local71 = local57;
				arg3 = local51;
				local57 = local191;
				arg0 = local55;
				local47 >>= 0x1;
				local51 >>= 0x1;
				local36++;
				local55 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!jg", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method4766();
		super.finalize();
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)I")
	protected final int method4765() {
		if (this.aClass189_17 == Static290.aClass189_11) {
			if (this.aClass188_10 == Static566.aClass188_13) {
				return 6407;
			}
			if (this.aClass188_10 == Static393.aClass188_12) {
				return 6408;
			}
			if (Static588.aClass188_15 == this.aClass188_10) {
				return 6406;
			}
			if (Static154.aClass188_7 == this.aClass188_10) {
				return 6409;
			}
			if (Static389.aClass188_11 == this.aClass188_10) {
				return 6410;
			}
			if (this.aClass188_10 == Static254.aClass188_9) {
				return 6145;
			}
		} else if (Static290.aClass189_14 == this.aClass189_17) {
			if (this.aClass188_10 == Static566.aClass188_13) {
				return 34843;
			}
			if (this.aClass188_10 == Static393.aClass188_12) {
				return 34842;
			}
			if (Static588.aClass188_15 == this.aClass188_10) {
				return 34844;
			}
			if (Static154.aClass188_7 == this.aClass188_10) {
				return 34846;
			}
			if (this.aClass188_10 == Static389.aClass188_11) {
				return 34847;
			}
			if (this.aClass188_10 == Static254.aClass188_9) {
				return 6145;
			}
		} else if (Static290.aClass189_15 == this.aClass189_17) {
			if (Static566.aClass188_13 == this.aClass188_10) {
				return 34837;
			}
			if (Static393.aClass188_12 == this.aClass188_10) {
				return 34836;
			}
			if (Static588.aClass188_15 == this.aClass188_10) {
				return 34838;
			}
			if (this.aClass188_10 == Static154.aClass188_7) {
				return 34840;
			}
			if (Static389.aClass188_11 == this.aClass188_10) {
				return 34841;
			}
			if (this.aClass188_10 == Static254.aClass188_9) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "(I)V")
	private void method4766() {
		if (this.anInt5596 > 0) {
			this.aClass95_Sub3_Sub2_8.method7154(this.method4772(), this.anInt5596);
			this.anInt5596 = 0;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I[BIII)V")
	protected final void method4767(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 > 0 && !Static485.method6790(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static485.method6790(arg3)) {
			@Pc(34) int local34 = this.aClass188_10.anInt4725;
			@Pc(36) int local36 = 0;
			@Pc(47) int local47 = arg2 >= arg3 ? arg3 : arg2;
			@Pc(51) int local51 = arg2 >> 1;
			@Pc(55) int local55 = arg3 >> 1;
			@Pc(65) byte[] local65 = arg1;
			@Pc(72) byte[] local72 = new byte[local55 * local51 * local34];
			while (true) {
				OpenGL.glTexImage2Dub(arg0, local36, this.method4765(), arg2, arg3, 0, Static269.method3772(this.aClass188_10), 5121, local65, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(98) int local98 = arg2 * local34;
				@Pc(100) byte[] local100 = local72;
				for (@Pc(102) int local102 = 0; local102 < local34; local102++) {
					@Pc(106) int local106 = local102;
					@Pc(108) int local108 = local102;
					@Pc(112) int local112 = local98 + local102;
					for (@Pc(114) int local114 = 0; local114 < local55; local114++) {
						for (@Pc(118) int local118 = 0; local118 < local51; local118++) {
							@Pc(124) byte local124 = local65[local108];
							local108 += local34;
							@Pc(134) int local134 = local124 + local65[local108];
							local108 += local34;
							@Pc(144) int local144 = local134 + local65[local112];
							local112 += local34;
							@Pc(154) int local154 = local144 + local65[local112];
							local72[local106] = (byte) (local154 >> 2);
							local112 += local34;
							local106 += local34;
						}
						local108 += local98;
						local112 += local98;
					}
				}
				local72 = local65;
				arg2 = local51;
				arg3 = local55;
				local65 = local100;
				local47 >>= 0x1;
				local55 >>= 0x1;
				local51 >>= 0x1;
				local36++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(II[III)V")
	protected final void method4768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		if (arg0 > 0 && !Static485.method6790(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg1 > 0 && !Static485.method6790(arg1)) {
			throw new IllegalArgumentException("");
		} else if (Static393.aClass188_12 == this.aClass188_10) {
			@Pc(38) int local38 = 0;
			@Pc(49) int local49 = arg0 < arg1 ? arg0 : arg1;
			@Pc(53) int local53 = arg0 >> 1;
			@Pc(62) int local62 = arg1 >> 1;
			@Pc(64) int[] local64 = arg2;
			@Pc(69) int[] local69 = new int[local53 * local62];
			while (true) {
				OpenGL.glTexImage2Di(arg3, local38, this.method4765(), arg0, arg1, 0, 32993, this.aClass95_Sub3_Sub2_8.anInt8480, local64, 0);
				if (local49 <= 1) {
					return;
				}
				@Pc(92) int local92 = 0;
				@Pc(94) int local94 = 0;
				@Pc(98) int local98 = arg0;
				for (@Pc(100) int local100 = 0; local100 < local62; local100++) {
					for (@Pc(104) int local104 = 0; local104 < local53; local104++) {
						@Pc(111) int local111 = local64[local94++];
						@Pc(116) int local116 = local64[local94++];
						@Pc(121) int local121 = local64[local98++];
						@Pc(125) int local125 = local111 & 0xFF;
						@Pc(131) int local131 = local111 >> 24 & 0xFF;
						@Pc(137) int local137 = local111 >> 8 & 0xFF;
						@Pc(142) int local142 = local64[local98++];
						@Pc(148) int local148 = local111 >> 16 & 0xFF;
						@Pc(156) int local156 = local137 + (local116 >> 8 & 0xFF);
						@Pc(164) int local164 = local131 + (local116 >> 24 & 0xFF);
						@Pc(170) int local170 = local125 + (local116 & 0xFF);
						@Pc(178) int local178 = local148 + (local116 >> 16 & 0xFF);
						@Pc(186) int local186 = local156 + (local121 >> 8 & 0xFF);
						@Pc(194) int local194 = local164 + (local121 >> 24 & 0xFF);
						@Pc(200) int local200 = local170 + (local121 & 0xFF);
						@Pc(208) int local208 = local178 + (local121 >> 16 & 0xFF);
						@Pc(216) int local216 = local186 + (local142 >> 8 & 0xFF);
						@Pc(222) int local222 = local200 + (local142 & 0xFF);
						@Pc(230) int local230 = local194 + (local142 >> 24 & 0xFF);
						@Pc(238) int local238 = local208 + (local142 >> 16 & 0xFF);
						local69[local92++] = (local230 & 0x3FC) << 22 | (local238 & 0x3FC) << 14 | (local216 & 0x3FC) << 6 | local222 >> 2 & 0xFF;
					}
					local98 += arg0;
					local94 += arg0;
				}
				@Pc(287) int[] local287 = local69;
				local69 = local64;
				local64 = local287;
				arg0 = local53;
				arg1 = local62;
				local49 >>= 0x1;
				local38++;
				local62 >>= 0x1;
				local53 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BLclient!tb;)V")
	@Override
	public final void method7837(@OriginalArg(1) Class328 arg0) {
		if (this.aClass328_8 != arg0) {
			this.aClass328_8 = arg0;
			this.method4773();
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
	@Override
	public final void method7839() {
		@Pc(8) int local8 = this.aClass95_Sub3_Sub2_8.method7146();
		@Pc(14) int local14 = this.aClass95_Sub3_Sub2_8.anIntArray575[local8];
		if (local14 != this.anInt5594) {
			if (local14 != 0) {
				OpenGL.glBindTexture(local14, 0);
				OpenGL.glDisable(local14);
			}
			OpenGL.glEnable(this.anInt5594);
			this.aClass95_Sub3_Sub2_8.anIntArray575[local8] = this.anInt5594;
		}
		OpenGL.glBindTexture(this.anInt5594, this.anInt5596);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)V")
	private void method4771() {
		this.aClass95_Sub3_Sub2_8.anInt8342 += this.method4772();
	}

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "(I)I")
	private int method4772() {
		@Pc(19) int local19 = this.aClass189_17.anInt4729 * this.aClass188_10.anInt4725 * this.anInt5587;
		return this.aBoolean406 ? local19 * 4 / 3 : local19;
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)V")
	private void method4773() {
		this.aClass95_Sub3_Sub2_8.method7112(this);
		if (Static541.aClass328_10 == this.aClass328_8) {
			OpenGL.glTexParameteri(this.anInt5594, 10241, this.aBoolean406 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt5594, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt5594, 10241, this.aBoolean406 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt5594, 10240, 9728);
		}
	}
}
