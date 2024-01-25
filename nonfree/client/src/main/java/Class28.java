import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public abstract class Class28 implements Interface25 {

	@OriginalMember(owner = "client!lk", name = "i", descriptor = "Lclient!gk;")
	private Class137 aClass137_12 = Static306.aClass137_8;

	@OriginalMember(owner = "client!lk", name = "l", descriptor = "Lclient!md;")
	protected final Class144_Sub1_Sub2 aClass144_Sub1_Sub2_12;

	@OriginalMember(owner = "client!lk", name = "n", descriptor = "Lclient!o;")
	protected final Class260 aClass260_15;

	@OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
	protected final int anInt11032;

	@OriginalMember(owner = "client!lk", name = "m", descriptor = "Z")
	private final boolean aBoolean771;

	@OriginalMember(owner = "client!lk", name = "t", descriptor = "Lclient!al;")
	protected final Class19 aClass19_20;

	@OriginalMember(owner = "client!lk", name = "s", descriptor = "I")
	private final int anInt11015;

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
	private int anInt11022;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lclient!md;ILclient!o;Lclient!al;IZ)V")
	protected Class28(@OriginalArg(0) Class144_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class260 arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aClass144_Sub1_Sub2_12 = arg0;
		this.aClass260_15 = arg2;
		this.anInt11032 = arg1;
		this.aBoolean771 = arg5;
		this.aClass19_20 = arg3;
		this.anInt11015 = arg4;
		OpenGL.glGenTextures(1, Static447.anIntArray398, 0);
		this.anInt11022 = Static447.anIntArray398[0];
		this.method9358();
		this.method9360();
	}

	@OriginalMember(owner = "client!lk", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method9352();
		super.finalize();
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z[BIII)V")
	protected final void method9350(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 > 0 && !Static670.method9288(89, arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static670.method9288(81, arg2)) {
			@Pc(40) int local40 = this.aClass260_15.anInt7205;
			@Pc(42) int local42 = 0;
			@Pc(50) int local50 = arg2 <= arg3 ? arg2 : arg3;
			@Pc(61) int local61 = arg3 >> 1;
			@Pc(65) int local65 = arg2 >> 1;
			@Pc(67) byte[] local67 = arg0;
			@Pc(74) byte[] local74 = new byte[local61 * local65 * local40];
			while (true) {
				OpenGL.glTexImage2Dub(arg1, local42, this.method9353(), arg3, arg2, 0, Static40.method669(this.aClass260_15), 5121, local67, 0);
				if (local50 <= 1) {
					return;
				}
				@Pc(101) int local101 = arg3 * local40;
				@Pc(103) byte[] local103 = local74;
				for (@Pc(105) int local105 = 0; local105 < local40; local105++) {
					@Pc(111) int local111 = local105;
					@Pc(113) int local113 = local105;
					@Pc(117) int local117 = local101 + local105;
					for (@Pc(119) int local119 = 0; local119 < local65; local119++) {
						for (@Pc(123) int local123 = 0; local123 < local61; local123++) {
							@Pc(131) byte local131 = local67[local113];
							local113 += local40;
							@Pc(141) int local141 = local131 + local67[local113];
							@Pc(147) int local147 = local141 + local67[local117];
							local113 += local40;
							local117 += local40;
							@Pc(161) int local161 = local147 + local67[local117];
							local117 += local40;
							local74[local111] = (byte) (local161 >> 2);
							local111 += local40;
						}
						local113 += local101;
						local117 += local101;
					}
				}
				local74 = local67;
				arg3 = local61;
				arg2 = local65;
				local67 = local103;
				local61 >>= 0x1;
				local65 >>= 0x1;
				local50 >>= 0x1;
				local42++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIII[I)V")
	protected final void method9351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg2 > 0 && !Static670.method9288(79, arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg0 > 0 && !Static670.method9288(113, arg0)) {
			throw new IllegalArgumentException("");
		} else if (this.aClass260_15 == Static641.aClass260_12) {
			@Pc(45) int local45 = 0;
			@Pc(57) int local57 = arg2 < arg0 ? arg2 : arg0;
			@Pc(61) int local61 = arg2 >> 1;
			@Pc(65) int local65 = arg0 >> 1;
			@Pc(67) int[] local67 = arg3;
			@Pc(82) int[] local82 = new int[local61 * local65];
			while (true) {
				OpenGL.glTexImage2Di(arg1, local45, this.method9353(), arg2, arg0, 0, 32993, this.aClass144_Sub1_Sub2_12.anInt6620, local67, 0);
				if (local57 <= 1) {
					return;
				}
				@Pc(104) int local104 = 0;
				@Pc(106) int local106 = 0;
				@Pc(110) int local110 = arg2;
				@Pc(112) int[] local112 = local82;
				for (@Pc(114) int local114 = 0; local114 < local65; local114++) {
					for (@Pc(120) int local120 = 0; local120 < local61; local120++) {
						@Pc(129) int local129 = local67[local106++];
						@Pc(134) int local134 = local67[local106++];
						@Pc(139) int local139 = local67[local110++];
						@Pc(145) int local145 = local129 >> 8 & 0xFF;
						@Pc(151) int local151 = local129 >> 24 & 0xFF;
						@Pc(156) int local156 = local67[local110++];
						@Pc(162) int local162 = local129 >> 16 & 0xFF;
						@Pc(166) int local166 = local129 & 0xFF;
						@Pc(174) int local174 = local151 + (local134 >> 24 & 0xFF);
						@Pc(180) int local180 = local166 + (local134 & 0xFF);
						@Pc(188) int local188 = local145 + (local134 >> 8 & 0xFF);
						@Pc(196) int local196 = local162 + (local134 >> 16 & 0xFF);
						@Pc(202) int local202 = local180 + (local139 & 0xFF);
						@Pc(210) int local210 = local196 + (local139 >> 16 & 0xFF);
						@Pc(218) int local218 = local174 + (local139 >> 24 & 0xFF);
						@Pc(226) int local226 = local188 + (local139 >> 8 & 0xFF);
						@Pc(234) int local234 = local218 + (local156 >> 24 & 0xFF);
						@Pc(240) int local240 = local202 + (local156 & 0xFF);
						@Pc(248) int local248 = local210 + (local156 >> 16 & 0xFF);
						@Pc(256) int local256 = local226 + (local156 >> 8 & 0xFF);
						local82[local104++] = (local256 & 0x3FC) << 6 | local234 << 22 & 0xFF000000 | (local248 & 0x3FC) << 14 | local240 >> 2 & 0xFF;
					}
					local106 += arg2;
					local110 += arg2;
				}
				local82 = local67;
				arg2 = local61;
				arg0 = local65;
				local67 = local112;
				local57 >>= 0x1;
				local65 >>= 0x1;
				local61 >>= 0x1;
				local45++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "(I)V")
	private void method9352() {
		if (this.anInt11022 > 0) {
			this.aClass144_Sub1_Sub2_12.method5785(this.method9356(), this.anInt11022);
			this.anInt11022 = 0;
		}
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)V")
	@Override
	public final void method9348() {
		@Pc(13) int local13 = this.aClass144_Sub1_Sub2_12.method5770();
		@Pc(19) int local19 = this.aClass144_Sub1_Sub2_12.anIntArray343[local13];
		if (this.anInt11032 != local19) {
			if (local19 != 0) {
				OpenGL.glBindTexture(local19, 0);
				OpenGL.glDisable(local19);
			}
			OpenGL.glEnable(this.anInt11032);
			this.aClass144_Sub1_Sub2_12.anIntArray343[local13] = this.anInt11032;
		}
		OpenGL.glBindTexture(this.anInt11032, this.anInt11022);
	}

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "(B)I")
	protected final int method9353() {
		if (Static18.aClass19_4 == this.aClass19_20) {
			if (Static466.aClass260_10 == this.aClass260_15) {
				return 6407;
			}
			if (this.aClass260_15 == Static641.aClass260_12) {
				return 6408;
			}
			if (this.aClass260_15 == Static60.aClass260_3) {
				return 6406;
			}
			if (Static393.aClass260_8 == this.aClass260_15) {
				return 6409;
			}
			if (this.aClass260_15 == Static608.aClass260_11) {
				return 6410;
			}
			if (this.aClass260_15 == Static646.aClass260_13) {
				return 6145;
			}
		} else if (Static18.aClass19_7 == this.aClass19_20) {
			if (Static466.aClass260_10 == this.aClass260_15) {
				return 34843;
			}
			if (Static641.aClass260_12 == this.aClass260_15) {
				return 34842;
			}
			if (this.aClass260_15 == Static60.aClass260_3) {
				return 34844;
			}
			if (Static393.aClass260_8 == this.aClass260_15) {
				return 34846;
			}
			if (this.aClass260_15 == Static608.aClass260_11) {
				return 34847;
			}
			if (this.aClass260_15 == Static646.aClass260_13) {
				return 6145;
			}
		} else if (Static18.aClass19_8 == this.aClass19_20) {
			if (this.aClass260_15 == Static466.aClass260_10) {
				return 34837;
			}
			if (this.aClass260_15 == Static641.aClass260_12) {
				return 34836;
			}
			if (Static60.aClass260_3 == this.aClass260_15) {
				return 34838;
			}
			if (this.aClass260_15 == Static393.aClass260_8) {
				return 34840;
			}
			if (this.aClass260_15 == Static608.aClass260_11) {
				return 34841;
			}
			if (Static646.aClass260_13 == this.aClass260_15) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZLclient!gk;)V")
	@Override
	public final void method9349(@OriginalArg(1) Class137 arg0) {
		if (arg0 != this.aClass137_12) {
			this.aClass137_12 = arg0;
			this.method9358();
		}
	}

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "(I)I")
	private int method9356() {
		@Pc(20) int local20 = this.aClass19_20.anInt242 * this.aClass260_15.anInt7205 * this.anInt11015;
		return this.aBoolean771 ? local20 * 4 / 3 : local20;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(I[FIBI)V")
	protected final void method9357(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 > 0 && !Static670.method9288(78, arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static670.method9288(122, arg2)) {
			@Pc(42) int local42 = this.aClass260_15.anInt7205;
			@Pc(44) int local44 = 0;
			@Pc(56) int local56 = arg2 <= arg0 ? arg2 : arg0;
			@Pc(60) int local60 = arg0 >> 1;
			@Pc(64) int local64 = arg2 >> 1;
			@Pc(66) float[] local66 = arg1;
			@Pc(73) float[] local73 = new float[local64 * local60 * local42];
			while (true) {
				OpenGL.glTexImage2Df(arg3, local44, this.method9353(), arg0, arg2, 0, Static40.method669(this.aClass260_15), 5126, local66, 0);
				if (local56 <= 1) {
					return;
				}
				@Pc(100) int local100 = local42 * arg0;
				@Pc(102) float[] local102 = local73;
				for (@Pc(104) int local104 = 0; local104 < local42; local104++) {
					@Pc(110) int local110 = local104;
					@Pc(112) int local112 = local104;
					@Pc(116) int local116 = local100 + local104;
					for (@Pc(118) int local118 = 0; local118 < local64; local118++) {
						for (@Pc(122) int local122 = 0; local122 < local60; local122++) {
							@Pc(128) float local128 = local66[local112];
							local112 += local42;
							@Pc(138) float local138 = local128 + local66[local112];
							@Pc(144) float local144 = local138 + local66[local116];
							local112 += local42;
							local116 += local42;
							@Pc(158) float local158 = local144 + local66[local116];
							local73[local110] = local158 * 0.25F;
							local116 += local42;
							local110 += local42;
						}
						local112 += local100;
						local116 += local100;
					}
				}
				local73 = local66;
				arg0 = local60;
				arg2 = local64;
				local66 = local102;
				local60 >>= 0x1;
				local44++;
				local64 >>= 0x1;
				local56 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)V")
	private void method9358() {
		this.aClass144_Sub1_Sub2_12.method5643(this);
		if (Static306.aClass137_8 == this.aClass137_12) {
			OpenGL.glTexParameteri(this.anInt11032, 10241, this.aBoolean771 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt11032, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt11032, 10241, this.aBoolean771 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt11032, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)V")
	private void method9360() {
		this.aClass144_Sub1_Sub2_12.anInt6490 += this.method9356();
	}
}
