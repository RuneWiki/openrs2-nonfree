import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aea")
public abstract class Class8 implements Interface12 {

	@OriginalMember(owner = "client!aea", name = "o", descriptor = "Lclient!lba;")
	private Class172 aClass172_11 = Static50.aClass172_2;

	@OriginalMember(owner = "client!aea", name = "d", descriptor = "Z")
	private final boolean aBoolean555;

	@OriginalMember(owner = "client!aea", name = "c", descriptor = "I")
	private final int anInt7812;

	@OriginalMember(owner = "client!aea", name = "t", descriptor = "Lclient!kp;")
	protected final Class167 aClass167_12;

	@OriginalMember(owner = "client!aea", name = "f", descriptor = "I")
	protected final int anInt7814;

	@OriginalMember(owner = "client!aea", name = "l", descriptor = "Lclient!vt;")
	protected final Class310 aClass310_12;

	@OriginalMember(owner = "client!aea", name = "k", descriptor = "Lclient!gf;")
	protected final Class5_Sub3_Sub1 aClass5_Sub3_Sub1_9;

	@OriginalMember(owner = "client!aea", name = "q", descriptor = "I")
	private int anInt7822;

	@OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(Lclient!gf;ILclient!kp;Lclient!vt;IZ)V")
	protected Class8(@OriginalArg(0) Class5_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class167 arg2, @OriginalArg(3) Class310 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aBoolean555 = arg5;
		this.anInt7812 = arg4;
		this.aClass167_12 = arg2;
		this.anInt7814 = arg1;
		this.aClass310_12 = arg3;
		this.aClass5_Sub3_Sub1_9 = arg0;
		OpenGL.glGenTextures(1, Static392.anIntArray637, 0);
		this.anInt7822 = Static392.anIntArray637[0];
		this.method6472();
		this.method6476();
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(Lclient!lba;I)V")
	@Override
	public final void method6468(@OriginalArg(0) Class172 arg0) {
		if (this.aClass172_11 != arg0) {
			this.aClass172_11 = arg0;
			this.method6472();
		}
	}

	@OriginalMember(owner = "client!aea", name = "e", descriptor = "(I)V")
	private void method6471() {
		if (this.anInt7822 > 0) {
			this.aClass5_Sub3_Sub1_9.method3095(this.method6478(), this.anInt7822);
			this.anInt7822 = 0;
		}
	}

	@OriginalMember(owner = "client!aea", name = "d", descriptor = "(I)V")
	@Override
	public final void method6469() {
		@Pc(8) int local8 = this.aClass5_Sub3_Sub1_9.method6417();
		@Pc(14) int local14 = this.aClass5_Sub3_Sub1_9.anIntArray363[local8];
		if (this.anInt7814 != local14) {
			if (local14 != 0) {
				OpenGL.glBindTexture(local14, 0);
				OpenGL.glDisable(local14);
			}
			OpenGL.glEnable(this.anInt7814);
			this.aClass5_Sub3_Sub1_9.anIntArray363[local8] = this.anInt7814;
		}
		OpenGL.glBindTexture(this.anInt7814, this.anInt7822);
	}

	@OriginalMember(owner = "client!aea", name = "f", descriptor = "(I)V")
	private void method6472() {
		this.aClass5_Sub3_Sub1_9.method6416(this);
		if (this.aClass172_11 == Static50.aClass172_2) {
			OpenGL.glTexParameteri(this.anInt7814, 10241, this.aBoolean555 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt7814, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt7814, 10241, this.aBoolean555 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt7814, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!aea", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method6471();
		super.finalize();
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(I[FZII)V")
	protected final void method6474(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 > 0 && !Static260.method4582(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static260.method4582(arg2)) {
			@Pc(34) int local34 = this.aClass167_12.anInt5192;
			@Pc(36) int local36 = 0;
			@Pc(47) int local47 = arg3 >= arg2 ? arg2 : arg3;
			@Pc(58) int local58 = arg3 >> 1;
			@Pc(62) int local62 = arg2 >> 1;
			@Pc(64) float[] local64 = arg1;
			@Pc(71) float[] local71 = new float[local34 * local62 * local58];
			while (true) {
				OpenGL.glTexImage2Df(arg0, local36, this.method6479(), arg3, arg2, 0, Static88.method1793(this.aClass167_12), 5126, local64, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(96) int local96 = arg3 * local34;
				for (@Pc(98) int local98 = 0; local98 < local34; local98++) {
					@Pc(102) int local102 = local98;
					@Pc(104) int local104 = local98;
					@Pc(108) int local108 = local96 + local98;
					for (@Pc(110) int local110 = 0; local110 < local62; local110++) {
						for (@Pc(114) int local114 = 0; local114 < local58; local114++) {
							@Pc(120) float local120 = local64[local104];
							local104 += local34;
							@Pc(130) float local130 = local120 + local64[local104];
							local104 += local34;
							@Pc(140) float local140 = local130 + local64[local108];
							local108 += local34;
							@Pc(150) float local150 = local140 + local64[local108];
							local108 += local34;
							local71[local102] = local150 * 0.25F;
							local102 += local34;
						}
						local108 += local96;
						local104 += local96;
					}
				}
				@Pc(194) float[] local194 = local71;
				local71 = local64;
				local64 = local194;
				arg3 = local58;
				arg2 = local62;
				local36++;
				local58 >>= 0x1;
				local47 >>= 0x1;
				local62 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "([BIIII)V")
	protected final void method6475(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 > 0 && !Static260.method4582(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static260.method4582(arg3)) {
			@Pc(34) int local34 = this.aClass167_12.anInt5192;
			@Pc(36) int local36 = 0;
			@Pc(43) int local43 = arg3 > arg2 ? arg2 : arg3;
			@Pc(54) int local54 = arg2 >> 1;
			@Pc(58) int local58 = arg3 >> 1;
			@Pc(60) byte[] local60 = arg0;
			@Pc(67) byte[] local67 = new byte[local54 * local58 * local34];
			while (true) {
				OpenGL.glTexImage2Dub(arg1, local36, this.method6479(), arg2, arg3, 0, Static88.method1793(this.aClass167_12), 5121, local60, 0);
				if (local43 <= 1) {
					return;
				}
				@Pc(93) int local93 = local34 * arg2;
				@Pc(95) byte[] local95 = local67;
				for (@Pc(97) int local97 = 0; local97 < local34; local97++) {
					@Pc(101) int local101 = local97;
					@Pc(103) int local103 = local97;
					@Pc(108) int local108 = local97 + local93;
					for (@Pc(110) int local110 = 0; local110 < local58; local110++) {
						for (@Pc(114) int local114 = 0; local114 < local54; local114++) {
							@Pc(120) byte local120 = local60[local103];
							local103 += local34;
							@Pc(130) int local130 = local120 + local60[local103];
							@Pc(136) int local136 = local130 + local60[local108];
							local103 += local34;
							local108 += local34;
							@Pc(150) int local150 = local136 + local60[local108];
							local108 += local34;
							local67[local101] = (byte) (local150 >> 2);
							local101 += local34;
						}
						local103 += local93;
						local108 += local93;
					}
				}
				local67 = local60;
				arg2 = local54;
				local60 = local95;
				arg3 = local58;
				local36++;
				local58 >>= 0x1;
				local54 >>= 0x1;
				local43 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(II)V")
	private void method6476() {
		this.aClass5_Sub3_Sub1_9.anInt7743 += this.method6478();
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIII[I)V")
	protected final void method6477(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg1 > 0 && !Static260.method4582(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg0 > 0 && !Static260.method4582(arg0)) {
			throw new IllegalArgumentException("");
		} else if (Static468.aClass167_14 == this.aClass167_12) {
			@Pc(42) int local42 = 0;
			@Pc(57) int local57 = arg0 > arg1 ? arg1 : arg0;
			@Pc(61) int local61 = arg1 >> 1;
			@Pc(65) int local65 = arg0 >> 1;
			@Pc(67) int[] local67 = arg3;
			@Pc(72) int[] local72 = new int[local61 * local65];
			while (true) {
				OpenGL.glTexImage2Di(arg2, local42, this.method6479(), arg1, arg0, 0, 32993, this.aClass5_Sub3_Sub1_9.anInt3688, local67, 0);
				if (local57 <= 1) {
					return;
				}
				@Pc(92) int local92 = 0;
				@Pc(94) int local94 = 0;
				@Pc(98) int local98 = arg1;
				for (@Pc(100) int local100 = 0; local100 < local65; local100++) {
					for (@Pc(104) int local104 = 0; local104 < local61; local104++) {
						@Pc(111) int local111 = local67[local94++];
						@Pc(116) int local116 = local67[local94++];
						@Pc(121) int local121 = local67[local98++];
						@Pc(127) int local127 = local111 >> 8 & 0xFF;
						@Pc(131) int local131 = local111 & 0xFF;
						@Pc(137) int local137 = local111 >> 24 & 0xFF;
						@Pc(143) int local143 = local111 >> 16 & 0xFF;
						@Pc(148) int local148 = local67[local98++];
						@Pc(156) int local156 = local137 + (local116 >> 24 & 0xFF);
						@Pc(162) int local162 = local131 + (local116 & 0xFF);
						@Pc(170) int local170 = local127 + (local116 >> 8 & 0xFF);
						@Pc(178) int local178 = local143 + (local116 >> 16 & 0xFF);
						@Pc(186) int local186 = local178 + (local121 >> 16 & 0xFF);
						@Pc(194) int local194 = local170 + (local121 >> 8 & 0xFF);
						@Pc(202) int local202 = local156 + (local121 >> 24 & 0xFF);
						@Pc(208) int local208 = local162 + (local121 & 0xFF);
						@Pc(216) int local216 = local202 + (local148 >> 24 & 0xFF);
						@Pc(224) int local224 = local186 + (local148 >> 16 & 0xFF);
						@Pc(230) int local230 = local208 + (local148 & 0xFF);
						@Pc(238) int local238 = local194 + (local148 >> 8 & 0xFF);
						local72[local92++] = (local216 & 0x3FC) << 22 | (local224 & 0x3FC) << 14 | (local238 & 0x3FC) << 6 | local230 >> 2 & 0xFF;
					}
					local94 += arg1;
					local98 += arg1;
				}
				@Pc(287) int[] local287 = local72;
				local72 = local67;
				arg0 = local65;
				arg1 = local61;
				local67 = local287;
				local57 >>= 0x1;
				local61 >>= 0x1;
				local65 >>= 0x1;
				local42++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(B)I")
	private int method6478() {
		@Pc(14) int local14 = this.aClass167_12.anInt5192 * this.aClass310_12.anInt9119 * this.anInt7812;
		return this.aBoolean555 ? local14 * 4 / 3 : local14;
	}

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "(B)I")
	protected final int method6479() {
		if (Static524.aClass310_16 == this.aClass310_12) {
			if (Static178.aClass167_6 == this.aClass167_12) {
				return 6407;
			}
			if (this.aClass167_12 == Static468.aClass167_14) {
				return 6408;
			}
			if (this.aClass167_12 == Static212.aClass167_7) {
				return 6406;
			}
			if (Static217.aClass167_8 == this.aClass167_12) {
				return 6409;
			}
			if (this.aClass167_12 == Static521.aClass167_15) {
				return 6410;
			}
			if (Static447.aClass167_13 == this.aClass167_12) {
				return 6145;
			}
		} else if (this.aClass310_12 == Static524.aClass310_19) {
			if (this.aClass167_12 == Static178.aClass167_6) {
				return 34843;
			}
			if (Static468.aClass167_14 == this.aClass167_12) {
				return 34842;
			}
			if (Static212.aClass167_7 == this.aClass167_12) {
				return 34844;
			}
			if (this.aClass167_12 == Static217.aClass167_8) {
				return 34846;
			}
			if (this.aClass167_12 == Static521.aClass167_15) {
				return 34847;
			}
			if (Static447.aClass167_13 == this.aClass167_12) {
				return 6145;
			}
		} else if (Static524.aClass310_20 == this.aClass310_12) {
			if (Static178.aClass167_6 == this.aClass167_12) {
				return 34837;
			}
			if (this.aClass167_12 == Static468.aClass167_14) {
				return 34836;
			}
			if (this.aClass167_12 == Static212.aClass167_7) {
				return 34838;
			}
			if (Static217.aClass167_8 == this.aClass167_12) {
				return 34840;
			}
			if (this.aClass167_12 == Static521.aClass167_15) {
				return 34841;
			}
			if (Static447.aClass167_13 == this.aClass167_12) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}
}
