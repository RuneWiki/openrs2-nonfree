import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gp")
public abstract class Class48 implements Interface27 {

	@OriginalMember(owner = "client!gp", name = "j", descriptor = "Lclient!kha;")
	private Class189 aClass189_14 = Static276.aClass189_15;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "Lclient!laa;")
	protected final Class126_Sub2_Sub1 aClass126_Sub2_Sub1_12;

	@OriginalMember(owner = "client!gp", name = "q", descriptor = "I")
	protected final int anInt8874;

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "Z")
	private final boolean aBoolean723;

	@OriginalMember(owner = "client!gp", name = "y", descriptor = "Lclient!qda;")
	protected final Class281 aClass281_18;

	@OriginalMember(owner = "client!gp", name = "v", descriptor = "Lclient!ns;")
	protected final Class247 aClass247_20;

	@OriginalMember(owner = "client!gp", name = "x", descriptor = "I")
	private final int anInt8880;

	@OriginalMember(owner = "client!gp", name = "m", descriptor = "I")
	private int anInt8871;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Lclient!laa;ILclient!qda;Lclient!ns;IZ)V")
	protected Class48(@OriginalArg(0) Class126_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class281 arg2, @OriginalArg(3) Class247 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aClass126_Sub2_Sub1_12 = arg0;
		this.anInt8874 = arg1;
		this.aBoolean723 = arg5;
		this.aClass281_18 = arg2;
		this.aClass247_20 = arg3;
		this.anInt8880 = arg4;
		OpenGL.glGenTextures(1, Static47.anIntArray62, 0);
		this.anInt8871 = Static47.anIntArray62[0];
		this.method7618();
		this.method7614();
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Z)V")
	private void method7612() {
		if (this.anInt8871 > 0) {
			this.aClass126_Sub2_Sub1_12.method4914(this.method7613(), this.anInt8871);
			this.anInt8871 = 0;
		}
	}

	@OriginalMember(owner = "client!gp", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7612();
		super.finalize();
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(I)I")
	private int method7613() {
		@Pc(19) int local19 = this.aClass281_18.anInt7736 * this.aClass247_20.anInt6763 * this.anInt8880;
		return this.aBoolean723 ? local19 * 4 / 3 : local19;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IZ)V")
	private void method7614() {
		this.aClass126_Sub2_Sub1_12.anInt6245 += this.method7613();
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)V")
	@Override
	public final void method7610() {
		@Pc(14) int local14 = this.aClass126_Sub2_Sub1_12.method5483();
		@Pc(20) int local20 = this.aClass126_Sub2_Sub1_12.anIntArray393[local14];
		if (this.anInt8874 != local20) {
			if (local20 != 0) {
				OpenGL.glBindTexture(local20, 0);
				OpenGL.glDisable(local20);
			}
			OpenGL.glEnable(this.anInt8874);
			this.aClass126_Sub2_Sub1_12.anIntArray393[local14] = this.anInt8874;
		}
		OpenGL.glBindTexture(this.anInt8874, this.anInt8871);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILclient!kha;)V")
	@Override
	public final void method7609(@OriginalArg(1) Class189 arg0) {
		if (arg0 != this.aClass189_14) {
			this.aClass189_14 = arg0;
			this.method7618();
		}
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(Z)I")
	protected final int method7616() {
		if (Static385.aClass247_14 == this.aClass247_20) {
			if (Static507.aClass281_21 == this.aClass281_18) {
				return 6407;
			}
			if (Static208.aClass281_10 == this.aClass281_18) {
				return 6408;
			}
			if (this.aClass281_18 == Static225.aClass281_13) {
				return 6406;
			}
			if (this.aClass281_18 == Static274.aClass281_22) {
				return 6409;
			}
			if (Static191.aClass281_9 == this.aClass281_18) {
				return 6410;
			}
			if (Static582.aClass281_20 == this.aClass281_18) {
				return 6145;
			}
		} else if (Static385.aClass247_17 == this.aClass247_20) {
			if (this.aClass281_18 == Static507.aClass281_21) {
				return 34843;
			}
			if (this.aClass281_18 == Static208.aClass281_10) {
				return 34842;
			}
			if (this.aClass281_18 == Static225.aClass281_13) {
				return 34844;
			}
			if (Static274.aClass281_22 == this.aClass281_18) {
				return 34846;
			}
			if (Static191.aClass281_9 == this.aClass281_18) {
				return 34847;
			}
			if (this.aClass281_18 == Static582.aClass281_20) {
				return 6145;
			}
		} else if (Static385.aClass247_18 == this.aClass247_20) {
			if (Static507.aClass281_21 == this.aClass281_18) {
				return 34837;
			}
			if (this.aClass281_18 == Static208.aClass281_10) {
				return 34836;
			}
			if (Static225.aClass281_13 == this.aClass281_18) {
				return 34838;
			}
			if (Static274.aClass281_22 == this.aClass281_18) {
				return 34840;
			}
			if (Static191.aClass281_9 == this.aClass281_18) {
				return 34841;
			}
			if (this.aClass281_18 == Static582.aClass281_20) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "([BBIII)V")
	protected final void method7617(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 > 0 && !Static586.method8223(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static586.method8223(arg1)) {
			@Pc(36) int local36 = this.aClass281_18.anInt7736;
			@Pc(38) int local38 = 0;
			@Pc(49) int local49 = arg3 >= arg1 ? arg1 : arg3;
			@Pc(53) int local53 = arg3 >> 1;
			@Pc(57) int local57 = arg1 >> 1;
			@Pc(59) byte[] local59 = arg0;
			@Pc(71) byte[] local71 = new byte[local36 * local53 * local57];
			while (true) {
				OpenGL.glTexImage2Dub(arg2, local38, this.method7616(), arg3, arg1, 0, Static350.method5350(this.aClass281_18), 5121, local59, 0);
				if (local49 <= 1) {
					return;
				}
				@Pc(97) int local97 = local36 * arg3;
				for (@Pc(99) int local99 = 0; local99 < local36; local99++) {
					@Pc(103) int local103 = local99;
					@Pc(105) int local105 = local99;
					@Pc(109) int local109 = local97 + local99;
					for (@Pc(111) int local111 = 0; local111 < local57; local111++) {
						for (@Pc(115) int local115 = 0; local115 < local53; local115++) {
							@Pc(121) byte local121 = local59[local105];
							local105 += local36;
							@Pc(131) int local131 = local121 + local59[local105];
							@Pc(137) int local137 = local131 + local59[local109];
							local105 += local36;
							local109 += local36;
							@Pc(151) int local151 = local137 + local59[local109];
							local71[local103] = (byte) (local151 >> 2);
							local109 += local36;
							local103 += local36;
						}
						local109 += local97;
						local105 += local97;
					}
				}
				@Pc(196) byte[] local196 = local71;
				local71 = local59;
				arg3 = local53;
				local59 = local196;
				arg1 = local57;
				local57 >>= 0x1;
				local49 >>= 0x1;
				local38++;
				local53 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!gp", name = "e", descriptor = "(B)V")
	private void method7618() {
		this.aClass126_Sub2_Sub1_12.method5449(this);
		if (Static276.aClass189_15 == this.aClass189_14) {
			OpenGL.glTexParameteri(this.anInt8874, 10241, this.aBoolean723 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt8874, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt8874, 10241, this.aBoolean723 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt8874, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IBII[F)V")
	protected final void method7621(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float[] arg3) {
		if (arg2 > 0 && !Static586.method8223(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static586.method8223(arg0)) {
			@Pc(34) int local34 = this.aClass281_18.anInt7736;
			@Pc(36) int local36 = 0;
			@Pc(47) int local47 = arg0 <= arg2 ? arg0 : arg2;
			@Pc(51) int local51 = arg2 >> 1;
			@Pc(61) int local61 = arg0 >> 1;
			@Pc(63) float[] local63 = arg3;
			@Pc(70) float[] local70 = new float[local61 * local51 * local34];
			while (true) {
				OpenGL.glTexImage2Df(arg1, local36, this.method7616(), arg2, arg0, 0, Static350.method5350(this.aClass281_18), 5126, local63, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(96) int local96 = arg2 * local34;
				@Pc(98) float[] local98 = local70;
				for (@Pc(100) int local100 = 0; local100 < local34; local100++) {
					@Pc(104) int local104 = local100;
					@Pc(106) int local106 = local100;
					@Pc(110) int local110 = local96 + local100;
					for (@Pc(112) int local112 = 0; local112 < local61; local112++) {
						for (@Pc(116) int local116 = 0; local116 < local51; local116++) {
							@Pc(122) float local122 = local63[local106];
							local106 += local34;
							@Pc(132) float local132 = local122 + local63[local106];
							local106 += local34;
							@Pc(142) float local142 = local132 + local63[local110];
							local110 += local34;
							@Pc(152) float local152 = local142 + local63[local110];
							local70[local104] = local152 * 0.25F;
							local110 += local34;
							local104 += local34;
						}
						local110 += local96;
						local106 += local96;
					}
				}
				local70 = local63;
				arg2 = local51;
				local63 = local98;
				arg0 = local61;
				local61 >>= 0x1;
				local51 >>= 0x1;
				local47 >>= 0x1;
				local36++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "([IIIZI)V")
	protected final void method7622(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 > 0 && !Static586.method8223(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg2 > 0 && !Static586.method8223(arg2)) {
			throw new IllegalArgumentException("");
		} else if (Static208.aClass281_10 == this.aClass281_18) {
			@Pc(41) int local41 = 0;
			@Pc(52) int local52 = arg3 >= arg2 ? arg2 : arg3;
			@Pc(56) int local56 = arg3 >> 1;
			@Pc(60) int local60 = arg2 >> 1;
			@Pc(66) int[] local66 = arg0;
			@Pc(71) int[] local71 = new int[local60 * local56];
			while (true) {
				OpenGL.glTexImage2Di(arg1, local41, this.method7616(), arg3, arg2, 0, 32993, this.aClass126_Sub2_Sub1_12.anInt5452, local66, 0);
				if (local52 <= 1) {
					return;
				}
				@Pc(94) int local94 = 0;
				@Pc(96) int local96 = 0;
				@Pc(100) int local100 = arg3;
				for (@Pc(102) int local102 = 0; local102 < local60; local102++) {
					for (@Pc(106) int local106 = 0; local106 < local56; local106++) {
						@Pc(113) int local113 = local66[local96++];
						@Pc(118) int local118 = local66[local100++];
						@Pc(123) int local123 = local66[local96++];
						@Pc(127) int local127 = local113 & 0xFF;
						@Pc(133) int local133 = local113 >> 24 & 0xFF;
						@Pc(139) int local139 = local113 >> 8 & 0xFF;
						@Pc(144) int local144 = local66[local100++];
						@Pc(150) int local150 = local113 >> 16 & 0xFF;
						@Pc(158) int local158 = local150 + (local123 >> 16 & 0xFF);
						@Pc(166) int local166 = local133 + (local123 >> 24 & 0xFF);
						@Pc(174) int local174 = local139 + (local123 >> 8 & 0xFF);
						@Pc(180) int local180 = local127 + (local123 & 0xFF);
						@Pc(188) int local188 = local158 + (local118 >> 16 & 0xFF);
						@Pc(196) int local196 = local166 + (local118 >> 24 & 0xFF);
						@Pc(204) int local204 = local174 + (local118 >> 8 & 0xFF);
						@Pc(210) int local210 = local180 + (local118 & 0xFF);
						@Pc(218) int local218 = local196 + (local144 >> 24 & 0xFF);
						@Pc(226) int local226 = local204 + (local144 >> 8 & 0xFF);
						@Pc(232) int local232 = local210 + (local144 & 0xFF);
						@Pc(240) int local240 = local188 + (local144 >> 16 & 0xFF);
						local71[local94++] = local232 >> 2 & 0xFF | (local226 & 0x3FC) << 6 | (local240 & 0x3FC) << 14 | (local218 & 0x3FC) << 22;
					}
					local100 += arg3;
					local96 += arg3;
				}
				@Pc(289) int[] local289 = local71;
				local71 = local66;
				local66 = local289;
				arg2 = local60;
				arg3 = local56;
				local56 >>= 0x1;
				local52 >>= 0x1;
				local41++;
				local60 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
