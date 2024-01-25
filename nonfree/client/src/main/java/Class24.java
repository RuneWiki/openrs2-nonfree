import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public abstract class Class24 implements Interface1 {

	@OriginalMember(owner = "client!oh", name = "j", descriptor = "Lclient!td;")
	private Class338 aClass338_13 = Static673.aClass338_15;

	@OriginalMember(owner = "client!oh", name = "n", descriptor = "I")
	private final int anInt10023;

	@OriginalMember(owner = "client!oh", name = "q", descriptor = "Z")
	private final boolean aBoolean738;

	@OriginalMember(owner = "client!oh", name = "g", descriptor = "Lclient!on;")
	protected final Class274 aClass274_20;

	@OriginalMember(owner = "client!oh", name = "p", descriptor = "Lclient!hh;")
	protected final Class155 aClass155_59;

	@OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
	protected final int anInt10024;

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "Lclient!dga;")
	protected final Class75_Sub1_Sub1 aClass75_Sub1_Sub1_12;

	@OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
	private int anInt10020;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lclient!dga;ILclient!hh;Lclient!on;IZ)V")
	protected Class24(@OriginalArg(0) Class75_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class155 arg2, @OriginalArg(3) Class274 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt10023 = arg4;
		this.aBoolean738 = arg5;
		this.aClass274_20 = arg3;
		this.aClass155_59 = arg2;
		this.anInt10024 = arg1;
		this.aClass75_Sub1_Sub1_12 = arg0;
		OpenGL.glGenTextures(1, Static252.anIntArray635, 0);
		this.anInt10020 = Static252.anIntArray635[0];
		this.method8715();
		this.method8709();
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(BI[BII)V")
	protected final void method8706(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 > 0 && !Static232.method4114(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static232.method4114(arg2)) {
			@Pc(51) int local51 = this.aClass155_59.anInt4383;
			@Pc(53) int local53 = 0;
			@Pc(65) int local65 = arg3 >= arg2 ? arg2 : arg3;
			@Pc(69) int local69 = arg3 >> 1;
			@Pc(73) int local73 = arg2 >> 1;
			@Pc(75) byte[] local75 = arg1;
			@Pc(82) byte[] local82 = new byte[local51 * local69 * local73];
			while (true) {
				OpenGL.glTexImage2Dub(arg0, local53, this.method8714(), arg3, arg2, 0, Static305.method5428(this.aClass155_59), 5121, local75, 0);
				if (local65 <= 1) {
					return;
				}
				@Pc(107) int local107 = local51 * arg3;
				for (@Pc(109) int local109 = 0; local109 < local51; local109++) {
					@Pc(115) int local115 = local109;
					@Pc(117) int local117 = local109;
					@Pc(122) int local122 = local109 + local107;
					for (@Pc(124) int local124 = 0; local124 < local73; local124++) {
						for (@Pc(128) int local128 = 0; local128 < local69; local128++) {
							@Pc(136) byte local136 = local75[local117];
							local117 += local51;
							@Pc(146) int local146 = local136 + local75[local117];
							@Pc(152) int local152 = local146 + local75[local122];
							local117 += local51;
							local122 += local51;
							@Pc(166) int local166 = local152 + local75[local122];
							local122 += local51;
							local82[local115] = (byte) (local166 >> 2);
							local115 += local51;
						}
						local122 += local107;
						local117 += local107;
					}
				}
				@Pc(215) byte[] local215 = local82;
				local82 = local75;
				arg3 = local69;
				local75 = local215;
				arg2 = local73;
				local53++;
				local65 >>= 0x1;
				local69 >>= 0x1;
				local73 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "(I)I")
	private int method8707() {
		@Pc(14) int local14 = this.anInt10023 * this.aClass155_59.anInt4383 * this.aClass274_20.anInt7437;
		return this.aBoolean738 ? local14 * 4 / 3 : local14;
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(IZ)V")
	private void method8709() {
		this.aClass75_Sub1_Sub1_12.anInt7648 += this.method8707();
	}

	@OriginalMember(owner = "client!oh", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method8713();
		super.finalize();
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(B[IIII)V")
	protected final void method8710(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 > 0 && !Static232.method4114(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 > 0 && !Static232.method4114(arg3)) {
			throw new IllegalArgumentException("");
		} else if (Static432.aClass155_45 == this.aClass155_59) {
			@Pc(48) int local48 = 0;
			@Pc(60) int local60 = arg2 >= arg3 ? arg3 : arg2;
			@Pc(64) int local64 = arg2 >> 1;
			@Pc(68) int local68 = arg3 >> 1;
			@Pc(70) int[] local70 = arg0;
			@Pc(75) int[] local75 = new int[local64 * local68];
			while (true) {
				OpenGL.glTexImage2Di(arg1, local48, this.method8714(), arg2, arg3, 0, 32993, this.aClass75_Sub1_Sub1_12.anInt2026, local70, 0);
				if (local60 <= 1) {
					return;
				}
				@Pc(103) int local103 = 0;
				@Pc(105) int local105 = 0;
				@Pc(109) int local109 = arg2;
				@Pc(111) int[] local111 = local75;
				for (@Pc(113) int local113 = 0; local113 < local68; local113++) {
					for (@Pc(119) int local119 = 0; local119 < local64; local119++) {
						@Pc(128) int local128 = local70[local105++];
						@Pc(133) int local133 = local70[local105++];
						@Pc(138) int local138 = local70[local109++];
						@Pc(144) int local144 = local128 >> 8 & 0xFF;
						@Pc(150) int local150 = local128 >> 16 & 0xFF;
						@Pc(156) int local156 = local128 >> 24 & 0xFF;
						@Pc(161) int local161 = local70[local109++];
						@Pc(165) int local165 = local128 & 0xFF;
						@Pc(173) int local173 = local150 + (local133 >> 16 & 0xFF);
						@Pc(179) int local179 = local165 + (local133 & 0xFF);
						@Pc(187) int local187 = local156 + (local133 >> 24 & 0xFF);
						@Pc(195) int local195 = local144 + (local133 >> 8 & 0xFF);
						@Pc(201) int local201 = local179 + (local138 & 0xFF);
						@Pc(209) int local209 = local195 + (local138 >> 8 & 0xFF);
						@Pc(217) int local217 = local173 + (local138 >> 16 & 0xFF);
						@Pc(225) int local225 = local187 + (local138 >> 24 & 0xFF);
						@Pc(233) int local233 = local209 + (local161 >> 8 & 0xFF);
						@Pc(239) int local239 = local201 + (local161 & 0xFF);
						@Pc(247) int local247 = local225 + (local161 >> 24 & 0xFF);
						@Pc(255) int local255 = local217 + (local161 >> 16 & 0xFF);
						local75[local103++] = local239 >> 2 & 0xFF | (local233 & 0x3FC) << 6 | (local255 & 0x3FC) << 14 | (local247 & 0x3FC) << 22;
					}
					local105 += arg2;
					local109 += arg2;
				}
				local75 = local70;
				arg2 = local64;
				local70 = local111;
				arg3 = local68;
				local60 >>= 0x1;
				local68 >>= 0x1;
				local64 >>= 0x1;
				local48++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!td;I)V")
	@Override
	public final void method8704(@OriginalArg(0) Class338 arg0) {
		if (arg0 != this.aClass338_13) {
			this.aClass338_13 = arg0;
			this.method8715();
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "([FIIII)V")
	protected final void method8711(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 > 0 && !Static232.method4114(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static232.method4114(arg3)) {
			@Pc(40) int local40 = this.aClass155_59.anInt4383;
			@Pc(42) int local42 = 0;
			@Pc(54) int local54 = arg2 < arg3 ? arg2 : arg3;
			@Pc(58) int local58 = arg2 >> 1;
			@Pc(70) int local70 = arg3 >> 1;
			@Pc(72) float[] local72 = arg0;
			@Pc(79) float[] local79 = new float[local40 * local58 * local70];
			while (true) {
				OpenGL.glTexImage2Df(arg1, local42, this.method8714(), arg2, arg3, 0, Static305.method5428(this.aClass155_59), 5126, local72, 0);
				if (local54 <= 1) {
					return;
				}
				@Pc(106) int local106 = local40 * arg2;
				@Pc(108) float[] local108 = local79;
				for (@Pc(110) int local110 = 0; local110 < local40; local110++) {
					@Pc(116) int local116 = local110;
					@Pc(118) int local118 = local110;
					@Pc(122) int local122 = local110 + local106;
					for (@Pc(124) int local124 = 0; local124 < local70; local124++) {
						for (@Pc(128) int local128 = 0; local128 < local58; local128++) {
							@Pc(134) float local134 = local72[local118];
							local118 += local40;
							@Pc(144) float local144 = local134 + local72[local118];
							@Pc(150) float local150 = local144 + local72[local122];
							local118 += local40;
							local122 += local40;
							@Pc(164) float local164 = local150 + local72[local122];
							local79[local116] = local164 * 0.25F;
							local122 += local40;
							local116 += local40;
						}
						local118 += local106;
						local122 += local106;
					}
				}
				local79 = local72;
				arg2 = local58;
				arg3 = local70;
				local72 = local108;
				local54 >>= 0x1;
				local58 >>= 0x1;
				local42++;
				local70 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "(I)V")
	private void method8713() {
		if (this.anInt10020 > 0) {
			this.aClass75_Sub1_Sub1_12.method1957(this.anInt10020, this.method8707());
			this.anInt10020 = 0;
		}
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(Z)I")
	protected final int method8714() {
		if (this.aClass274_20 == Static435.aClass274_13) {
			if (Static265.aClass155_24 == this.aClass155_59) {
				return 6407;
			}
			if (Static432.aClass155_45 == this.aClass155_59) {
				return 6408;
			}
			if (this.aClass155_59 == Static212.aClass155_46) {
				return 6406;
			}
			if (this.aClass155_59 == Static290.aClass155_60) {
				return 6409;
			}
			if (this.aClass155_59 == Static487.aClass155_62) {
				return 6410;
			}
			if (this.aClass155_59 == Static522.aClass155_50) {
				return 6145;
			}
		} else if (Static435.aClass274_16 == this.aClass274_20) {
			if (Static265.aClass155_24 == this.aClass155_59) {
				return 34843;
			}
			if (Static432.aClass155_45 == this.aClass155_59) {
				return 34842;
			}
			if (this.aClass155_59 == Static212.aClass155_46) {
				return 34844;
			}
			if (Static290.aClass155_60 == this.aClass155_59) {
				return 34846;
			}
			if (Static487.aClass155_62 == this.aClass155_59) {
				return 34847;
			}
			if (Static522.aClass155_50 == this.aClass155_59) {
				return 6145;
			}
		} else if (this.aClass274_20 == Static435.aClass274_17) {
			if (this.aClass155_59 == Static265.aClass155_24) {
				return 34837;
			}
			if (this.aClass155_59 == Static432.aClass155_45) {
				return 34836;
			}
			if (this.aClass155_59 == Static212.aClass155_46) {
				return 34838;
			}
			if (Static290.aClass155_60 == this.aClass155_59) {
				return 34840;
			}
			if (this.aClass155_59 == Static487.aClass155_62) {
				return 34841;
			}
			if (Static522.aClass155_50 == this.aClass155_59) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)V")
	private void method8715() {
		this.aClass75_Sub1_Sub1_12.method6814(this);
		if (Static673.aClass338_15 == this.aClass338_13) {
			OpenGL.glTexParameteri(this.anInt10024, 10241, this.aBoolean738 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt10024, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt10024, 10241, this.aBoolean738 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt10024, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
	@Override
	public final void method8703() {
		@Pc(8) int local8 = this.aClass75_Sub1_Sub1_12.method6762();
		@Pc(23) int local23 = this.aClass75_Sub1_Sub1_12.anIntArray95[local8];
		if (this.anInt10024 != local23) {
			if (local23 != 0) {
				OpenGL.glBindTexture(local23, 0);
				OpenGL.glDisable(local23);
			}
			OpenGL.glEnable(this.anInt10024);
			this.aClass75_Sub1_Sub1_12.anIntArray95[local8] = this.anInt10024;
		}
		OpenGL.glBindTexture(this.anInt10024, this.anInt10020);
	}
}
