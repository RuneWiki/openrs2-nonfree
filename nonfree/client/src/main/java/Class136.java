import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public abstract class Class136 implements Interface7 {

	@OriginalMember(owner = "client!ic", name = "v", descriptor = "Lclient!qt;")
	private Class283 aClass283_9 = Static494.aClass283_8;

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "Z")
	private final boolean aBoolean632;

	@OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
	protected final int anInt8495;

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "Lclient!kca;")
	protected final Class187 aClass187_14;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
	private final int anInt8489;

	@OriginalMember(owner = "client!ic", name = "m", descriptor = "Lclient!eea;")
	protected final Class87_Sub1_Sub1 aClass87_Sub1_Sub1_9;

	@OriginalMember(owner = "client!ic", name = "n", descriptor = "Lclient!ti;")
	protected final Class324 aClass324_8;

	@OriginalMember(owner = "client!ic", name = "t", descriptor = "I")
	private int anInt8503;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lclient!eea;ILclient!kca;Lclient!ti;IZ)V")
	protected Class136(@OriginalArg(0) Class87_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class187 arg2, @OriginalArg(3) Class324 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aBoolean632 = arg5;
		this.anInt8495 = arg1;
		this.aClass187_14 = arg2;
		this.anInt8489 = arg4;
		this.aClass87_Sub1_Sub1_9 = arg0;
		this.aClass324_8 = arg3;
		OpenGL.glGenTextures(1, Static490.anIntArray571, 0);
		this.anInt8503 = Static490.anIntArray571[0];
		this.method7147();
		this.method7149();
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!qt;I)V")
	@Override
	public final void method8046(@OriginalArg(0) Class283 arg0) {
		if (this.aClass283_9 != arg0) {
			this.aClass283_9 = arg0;
			this.method7147();
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II[BII)V")
	protected final void method7140(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 > 0 && !Static504.method7825(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static504.method7825(arg2)) {
			@Pc(42) int local42 = this.aClass187_14.anInt5376;
			@Pc(44) int local44 = 0;
			@Pc(55) int local55 = arg2 > arg3 ? arg3 : arg2;
			@Pc(59) int local59 = arg3 >> 1;
			@Pc(63) int local63 = arg2 >> 1;
			@Pc(65) byte[] local65 = arg1;
			@Pc(72) byte[] local72 = new byte[local59 * local63 * local42];
			while (true) {
				OpenGL.glTexImage2Dub(arg0, local44, this.method7146(), arg3, arg2, 0, Static253.method4172(this.aClass187_14), 5121, local65, 0);
				if (local55 <= 1) {
					return;
				}
				@Pc(98) int local98 = arg3 * local42;
				@Pc(100) byte[] local100 = local72;
				for (@Pc(102) int local102 = 0; local102 < local42; local102++) {
					@Pc(106) int local106 = local102;
					@Pc(108) int local108 = local102;
					@Pc(112) int local112 = local98 + local102;
					for (@Pc(114) int local114 = 0; local114 < local63; local114++) {
						for (@Pc(118) int local118 = 0; local118 < local59; local118++) {
							@Pc(124) byte local124 = local65[local108];
							local108 += local42;
							@Pc(134) int local134 = local124 + local65[local108];
							@Pc(140) int local140 = local134 + local65[local112];
							local108 += local42;
							local112 += local42;
							@Pc(154) int local154 = local140 + local65[local112];
							local72[local106] = (byte) (local154 >> 2);
							local112 += local42;
							local106 += local42;
						}
						local108 += local98;
						local112 += local98;
					}
				}
				local72 = local65;
				arg3 = local59;
				arg2 = local63;
				local65 = local100;
				local55 >>= 0x1;
				local44++;
				local63 >>= 0x1;
				local59 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ic", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7144();
		super.finalize();
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)I")
	private int method7143() {
		@Pc(19) int local19 = this.anInt8489 * this.aClass324_8.anInt9051 * this.aClass187_14.anInt5376;
		return this.aBoolean632 ? local19 * 4 / 3 : local19;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)V")
	private void method7144() {
		if (this.anInt8503 > 0) {
			this.aClass87_Sub1_Sub1_9.method2403(this.anInt8503, this.method7143());
			this.anInt8503 = 0;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[IIII)V")
	protected final void method7145(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 > 0 && !Static504.method7825(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg2 > 0 && !Static504.method7825(arg2)) {
			throw new IllegalArgumentException("");
		} else if (this.aClass187_14 == Static524.aClass187_15) {
			@Pc(44) int local44 = 0;
			@Pc(51) int local51 = arg0 >= arg2 ? arg2 : arg0;
			@Pc(55) int local55 = arg0 >> 1;
			@Pc(59) int local59 = arg2 >> 1;
			@Pc(61) int[] local61 = arg1;
			@Pc(73) int[] local73 = new int[local59 * local55];
			while (true) {
				OpenGL.glTexImage2Di(arg3, local44, this.method7146(), arg0, arg2, 0, 32993, this.aClass87_Sub1_Sub1_9.anInt2786, local61, 0);
				if (local51 <= 1) {
					return;
				}
				@Pc(97) int local97 = 0;
				@Pc(99) int local99 = 0;
				@Pc(104) int local104 = arg0;
				for (@Pc(106) int local106 = 0; local106 < local59; local106++) {
					for (@Pc(110) int local110 = 0; local110 < local55; local110++) {
						@Pc(117) int local117 = local61[local99++];
						@Pc(122) int local122 = local61[local104++];
						@Pc(127) int local127 = local61[local99++];
						@Pc(131) int local131 = local117 & 0xFF;
						@Pc(137) int local137 = local117 >> 8 & 0xFF;
						@Pc(142) int local142 = local61[local104++];
						@Pc(148) int local148 = local117 >> 24 & 0xFF;
						@Pc(154) int local154 = local117 >> 16 & 0xFF;
						@Pc(160) int local160 = local131 + (local127 & 0xFF);
						@Pc(168) int local168 = local154 + (local127 >> 16 & 0xFF);
						@Pc(176) int local176 = local148 + (local127 >> 24 & 0xFF);
						@Pc(184) int local184 = local137 + (local127 >> 8 & 0xFF);
						@Pc(192) int local192 = local168 + (local122 >> 16 & 0xFF);
						@Pc(200) int local200 = local176 + (local122 >> 24 & 0xFF);
						@Pc(208) int local208 = local184 + (local122 >> 8 & 0xFF);
						@Pc(214) int local214 = local160 + (local122 & 0xFF);
						@Pc(220) int local220 = local214 + (local142 & 0xFF);
						@Pc(228) int local228 = local192 + (local142 >> 16 & 0xFF);
						@Pc(236) int local236 = local200 + (local142 >> 24 & 0xFF);
						@Pc(244) int local244 = local208 + (local142 >> 8 & 0xFF);
						local73[local97++] = local220 >> 2 & 0xFF | (local244 & 0x3FC) << 6 | (local236 & 0x3FC) << 22 | (local228 & 0x3FC) << 14;
					}
					local104 += arg0;
					local99 += arg0;
				}
				@Pc(297) int[] local297 = local73;
				local73 = local61;
				arg0 = local55;
				arg2 = local59;
				local61 = local297;
				local55 >>= 0x1;
				local44++;
				local59 >>= 0x1;
				local51 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
	@Override
	public final void method8048() {
		@Pc(16) int local16 = this.aClass87_Sub1_Sub1_9.method5070();
		@Pc(22) int local22 = this.aClass87_Sub1_Sub1_9.anIntArray201[local16];
		if (local22 != this.anInt8495) {
			if (local22 != 0) {
				OpenGL.glBindTexture(local22, 0);
				OpenGL.glDisable(local22);
			}
			OpenGL.glEnable(this.anInt8495);
			this.aClass87_Sub1_Sub1_9.anIntArray201[local16] = this.anInt8495;
		}
		OpenGL.glBindTexture(this.anInt8495, this.anInt8503);
	}

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "(I)I")
	protected final int method7146() {
		if (Static545.aClass324_12 == this.aClass324_8) {
			if (Static419.aClass187_11 == this.aClass187_14) {
				return 6407;
			}
			if (this.aClass187_14 == Static524.aClass187_15) {
				return 6408;
			}
			if (this.aClass187_14 == Static249.aClass187_7) {
				return 6406;
			}
			if (this.aClass187_14 == Static232.aClass187_10) {
				return 6409;
			}
			if (Static457.aClass187_13 == this.aClass187_14) {
				return 6410;
			}
			if (Static215.aClass187_4 == this.aClass187_14) {
				return 6145;
			}
		} else if (Static545.aClass324_15 == this.aClass324_8) {
			if (this.aClass187_14 == Static419.aClass187_11) {
				return 34843;
			}
			if (this.aClass187_14 == Static524.aClass187_15) {
				return 34842;
			}
			if (Static249.aClass187_7 == this.aClass187_14) {
				return 34844;
			}
			if (this.aClass187_14 == Static232.aClass187_10) {
				return 34846;
			}
			if (this.aClass187_14 == Static457.aClass187_13) {
				return 34847;
			}
			if (this.aClass187_14 == Static215.aClass187_4) {
				return 6145;
			}
		} else if (this.aClass324_8 == Static545.aClass324_16) {
			if (Static419.aClass187_11 == this.aClass187_14) {
				return 34837;
			}
			if (Static524.aClass187_15 == this.aClass187_14) {
				return 34836;
			}
			if (Static249.aClass187_7 == this.aClass187_14) {
				return 34838;
			}
			if (Static232.aClass187_10 == this.aClass187_14) {
				return 34840;
			}
			if (this.aClass187_14 == Static457.aClass187_13) {
				return 34841;
			}
			if (Static215.aClass187_4 == this.aClass187_14) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "(I)V")
	private void method7147() {
		this.aClass87_Sub1_Sub1_9.method5079(this);
		if (this.aClass283_9 == Static494.aClass283_8) {
			OpenGL.glTexParameteri(this.anInt8495, 10241, this.aBoolean632 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt8495, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt8495, 10241, this.aBoolean632 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt8495, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II[FII)V")
	protected final void method7148(@OriginalArg(1) int arg0, @OriginalArg(2) float[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 > 0 && !Static504.method7825(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static504.method7825(arg0)) {
			@Pc(34) int local34 = this.aClass187_14.anInt5376;
			@Pc(36) int local36 = 0;
			@Pc(43) int local43 = arg0 > arg3 ? arg3 : arg0;
			@Pc(47) int local47 = arg3 >> 1;
			@Pc(55) int local55 = arg0 >> 1;
			@Pc(57) float[] local57 = arg1;
			@Pc(64) float[] local64 = new float[local55 * local47 * local34];
			while (true) {
				OpenGL.glTexImage2Df(arg2, local36, this.method7146(), arg3, arg0, 0, Static253.method4172(this.aClass187_14), 5126, local57, 0);
				if (local43 <= 1) {
					return;
				}
				@Pc(88) int local88 = local34 * arg3;
				@Pc(90) float[] local90 = local64;
				for (@Pc(92) int local92 = 0; local92 < local34; local92++) {
					@Pc(96) int local96 = local92;
					@Pc(98) int local98 = local92;
					@Pc(102) int local102 = local92 + local88;
					for (@Pc(104) int local104 = 0; local104 < local55; local104++) {
						for (@Pc(108) int local108 = 0; local108 < local47; local108++) {
							@Pc(114) float local114 = local57[local98];
							local98 += local34;
							@Pc(124) float local124 = local114 + local57[local98];
							@Pc(130) float local130 = local124 + local57[local102];
							local98 += local34;
							local102 += local34;
							@Pc(144) float local144 = local130 + local57[local102];
							local102 += local34;
							local64[local96] = local144 * 0.25F;
							local96 += local34;
						}
						local98 += local88;
						local102 += local88;
					}
				}
				local64 = local57;
				arg3 = local47;
				arg0 = local55;
				local57 = local90;
				local47 >>= 0x1;
				local43 >>= 0x1;
				local36++;
				local55 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)V")
	private void method7149() {
		this.aClass87_Sub1_Sub1_9.anInt6110 += this.method7143();
	}
}
