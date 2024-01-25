import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public abstract class Class19 implements Interface24 {

	@OriginalMember(owner = "client!n", name = "q", descriptor = "Lclient!dca;")
	private Class65 aClass65_10 = Static93.aClass65_7;

	@OriginalMember(owner = "client!n", name = "m", descriptor = "I")
	protected final int anInt3834;

	@OriginalMember(owner = "client!n", name = "u", descriptor = "Lclient!bea;")
	protected final Class31_Sub1_Sub1 aClass31_Sub1_Sub1_7;

	@OriginalMember(owner = "client!n", name = "s", descriptor = "Lclient!mg;")
	protected final Class204 aClass204_8;

	@OriginalMember(owner = "client!n", name = "i", descriptor = "I")
	private final int anInt3830;

	@OriginalMember(owner = "client!n", name = "g", descriptor = "Z")
	private final boolean aBoolean266;

	@OriginalMember(owner = "client!n", name = "f", descriptor = "Lclient!os;")
	protected final Class245 aClass245_10;

	@OriginalMember(owner = "client!n", name = "o", descriptor = "I")
	private int anInt3836;

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lclient!bea;ILclient!os;Lclient!mg;IZ)V")
	protected Class19(@OriginalArg(0) Class31_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class245 arg2, @OriginalArg(3) Class204 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt3834 = arg1;
		this.aClass31_Sub1_Sub1_7 = arg0;
		this.aClass204_8 = arg3;
		this.anInt3830 = arg4;
		this.aBoolean266 = arg5;
		this.aClass245_10 = arg2;
		OpenGL.glGenTextures(1, Static558.anIntArray560, 0);
		this.anInt3836 = Static558.anIntArray560[0];
		this.method3102();
		this.method3095();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!dca;B)V")
	@Override
	public final void method7711(@OriginalArg(0) Class65 arg0) {
		if (arg0 != this.aClass65_10) {
			this.aClass65_10 = arg0;
			this.method3102();
		}
	}

	@OriginalMember(owner = "client!n", name = "d", descriptor = "(I)V")
	@Override
	public final void method7712() {
		@Pc(10) int local10 = this.aClass31_Sub1_Sub1_7.method7138();
		@Pc(16) int local16 = this.aClass31_Sub1_Sub1_7.anIntArray28[local10];
		if (local16 != this.anInt3834) {
			if (local16 != 0) {
				OpenGL.glBindTexture(local16, 0);
				OpenGL.glDisable(local16);
			}
			OpenGL.glEnable(this.anInt3834);
			this.aClass31_Sub1_Sub1_7.anIntArray28[local10] = this.anInt3834;
		}
		OpenGL.glBindTexture(this.anInt3834, this.anInt3836);
	}

	@OriginalMember(owner = "client!n", name = "e", descriptor = "(I)I")
	protected final int method3094() {
		if (Static331.aClass204_13 == this.aClass204_8) {
			if (this.aClass245_10 == Static475.aClass245_14) {
				return 6407;
			}
			if (this.aClass245_10 == Static18.aClass245_3) {
				return 6408;
			}
			if (Static199.aClass245_11 == this.aClass245_10) {
				return 6406;
			}
			if (Static21.aClass245_6 == this.aClass245_10) {
				return 6409;
			}
			if (Static201.aClass245_12 == this.aClass245_10) {
				return 6410;
			}
			if (this.aClass245_10 == Static323.aClass245_13) {
				return 6145;
			}
		} else if (this.aClass204_8 == Static331.aClass204_16) {
			if (this.aClass245_10 == Static475.aClass245_14) {
				return 34843;
			}
			if (this.aClass245_10 == Static18.aClass245_3) {
				return 34842;
			}
			if (this.aClass245_10 == Static199.aClass245_11) {
				return 34844;
			}
			if (Static21.aClass245_6 == this.aClass245_10) {
				return 34846;
			}
			if (Static201.aClass245_12 == this.aClass245_10) {
				return 34847;
			}
			if (Static323.aClass245_13 == this.aClass245_10) {
				return 6145;
			}
		} else if (this.aClass204_8 == Static331.aClass204_17) {
			if (this.aClass245_10 == Static475.aClass245_14) {
				return 34837;
			}
			if (Static18.aClass245_3 == this.aClass245_10) {
				return 34836;
			}
			if (this.aClass245_10 == Static199.aClass245_11) {
				return 34838;
			}
			if (this.aClass245_10 == Static21.aClass245_6) {
				return 34840;
			}
			if (this.aClass245_10 == Static201.aClass245_12) {
				return 34841;
			}
			if (Static323.aClass245_13 == this.aClass245_10) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IB)V")
	private void method3095() {
		this.aClass31_Sub1_Sub1_7.anInt9099 += this.method3096();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(B)I")
	private int method3096() {
		@Pc(19) int local19 = this.aClass204_8.anInt6009 * this.aClass245_10.anInt6985 * this.anInt3830;
		return this.aBoolean266 ? local19 * 4 / 3 : local19;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "([IIIIB)V")
	protected final void method3097(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 > 0 && !Static249.method6960(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg2 > 0 && !Static249.method6960(arg2)) {
			throw new IllegalArgumentException("");
		} else if (this.aClass245_10 == Static18.aClass245_3) {
			@Pc(43) int local43 = 0;
			@Pc(54) int local54 = arg2 > arg3 ? arg3 : arg2;
			@Pc(58) int local58 = arg3 >> 1;
			@Pc(62) int local62 = arg2 >> 1;
			@Pc(64) int[] local64 = arg0;
			@Pc(69) int[] local69 = new int[local58 * local62];
			while (true) {
				OpenGL.glTexImage2Di(arg1, local43, this.method3094(), arg3, arg2, 0, 32993, this.aClass31_Sub1_Sub1_7.anInt1093, local64, 0);
				if (local54 <= 1) {
					return;
				}
				@Pc(91) int local91 = 0;
				@Pc(93) int local93 = 0;
				@Pc(98) int local98 = arg3;
				@Pc(100) int[] local100 = local69;
				for (@Pc(102) int local102 = 0; local102 < local62; local102++) {
					for (@Pc(106) int local106 = 0; local106 < local58; local106++) {
						@Pc(113) int local113 = local64[local93++];
						@Pc(118) int local118 = local64[local93++];
						@Pc(123) int local123 = local64[local98++];
						@Pc(129) int local129 = local113 >> 24 & 0xFF;
						@Pc(135) int local135 = local113 >> 16 & 0xFF;
						@Pc(139) int local139 = local113 & 0xFF;
						@Pc(144) int local144 = local64[local98++];
						@Pc(150) int local150 = local113 >> 8 & 0xFF;
						@Pc(158) int local158 = local135 + (local118 >> 16 & 0xFF);
						@Pc(166) int local166 = local150 + (local118 >> 8 & 0xFF);
						@Pc(172) int local172 = local139 + (local118 & 0xFF);
						@Pc(180) int local180 = local129 + (local118 >> 24 & 0xFF);
						@Pc(188) int local188 = local158 + (local123 >> 16 & 0xFF);
						@Pc(196) int local196 = local180 + (local123 >> 24 & 0xFF);
						@Pc(204) int local204 = local166 + (local123 >> 8 & 0xFF);
						@Pc(210) int local210 = local172 + (local123 & 0xFF);
						@Pc(218) int local218 = local196 + (local144 >> 24 & 0xFF);
						@Pc(226) int local226 = local204 + (local144 >> 8 & 0xFF);
						@Pc(232) int local232 = local210 + (local144 & 0xFF);
						@Pc(240) int local240 = local188 + (local144 >> 16 & 0xFF);
						local69[local91++] = local232 >> 2 & 0xFF | (local226 & 0x3FC) << 6 | (local240 & 0x3FC) << 14 | (local218 & 0x3FC) << 22;
					}
					local98 += arg3;
					local93 += arg3;
				}
				local69 = local64;
				arg2 = local62;
				local64 = local100;
				arg3 = local58;
				local43++;
				local58 >>= 0x1;
				local54 >>= 0x1;
				local62 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "([FIIII)V")
	protected final void method3099(@OriginalArg(0) float[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 > 0 && !Static249.method6960(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static249.method6960(arg1)) {
			@Pc(43) int local43 = this.aClass245_10.anInt6985;
			@Pc(45) int local45 = 0;
			@Pc(52) int local52 = arg2 >= arg1 ? arg1 : arg2;
			@Pc(56) int local56 = arg2 >> 1;
			@Pc(60) int local60 = arg1 >> 1;
			@Pc(62) float[] local62 = arg0;
			@Pc(69) float[] local69 = new float[local60 * local56 * local43];
			while (true) {
				OpenGL.glTexImage2Df(arg3, local45, this.method3094(), arg2, arg1, 0, Static580.method7901(this.aClass245_10), 5126, local62, 0);
				if (local52 <= 1) {
					return;
				}
				@Pc(94) int local94 = local43 * arg2;
				for (@Pc(96) int local96 = 0; local96 < local43; local96++) {
					@Pc(100) int local100 = local96;
					@Pc(102) int local102 = local96;
					@Pc(107) int local107 = local96 + local94;
					for (@Pc(109) int local109 = 0; local109 < local60; local109++) {
						for (@Pc(113) int local113 = 0; local113 < local56; local113++) {
							@Pc(119) float local119 = local62[local102];
							local102 += local43;
							@Pc(129) float local129 = local119 + local62[local102];
							@Pc(135) float local135 = local129 + local62[local107];
							local102 += local43;
							local107 += local43;
							@Pc(149) float local149 = local135 + local62[local107];
							local107 += local43;
							local69[local100] = local149 * 0.25F;
							local100 += local43;
						}
						local107 += local94;
						local102 += local94;
					}
				}
				@Pc(193) float[] local193 = local69;
				local69 = local62;
				arg2 = local56;
				arg1 = local60;
				local62 = local193;
				local60 >>= 0x1;
				local45++;
				local56 >>= 0x1;
				local52 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(III[BI)V")
	protected final void method3100(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 > 0 && !Static249.method6960(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static249.method6960(arg3)) {
			@Pc(37) int local37 = this.aClass245_10.anInt6985;
			@Pc(43) int local43 = 0;
			@Pc(54) int local54 = arg3 > arg0 ? arg0 : arg3;
			@Pc(58) int local58 = arg0 >> 1;
			@Pc(62) int local62 = arg3 >> 1;
			@Pc(64) byte[] local64 = arg2;
			@Pc(71) byte[] local71 = new byte[local58 * local62 * local37];
			while (true) {
				OpenGL.glTexImage2Dub(arg1, local43, this.method3094(), arg0, arg3, 0, Static580.method7901(this.aClass245_10), 5121, local64, 0);
				if (local54 <= 1) {
					return;
				}
				@Pc(97) int local97 = local37 * arg0;
				@Pc(99) byte[] local99 = local71;
				for (@Pc(101) int local101 = 0; local101 < local37; local101++) {
					@Pc(105) int local105 = local101;
					@Pc(107) int local107 = local101;
					@Pc(111) int local111 = local97 + local101;
					for (@Pc(113) int local113 = 0; local113 < local62; local113++) {
						for (@Pc(117) int local117 = 0; local117 < local58; local117++) {
							@Pc(123) byte local123 = local64[local107];
							local107 += local37;
							@Pc(133) int local133 = local123 + local64[local107];
							@Pc(139) int local139 = local133 + local64[local111];
							local107 += local37;
							local111 += local37;
							@Pc(153) int local153 = local139 + local64[local111];
							local71[local105] = (byte) (local153 >> 2);
							local111 += local37;
							local105 += local37;
						}
						local111 += local97;
						local107 += local97;
					}
				}
				local71 = local64;
				arg3 = local62;
				arg0 = local58;
				local64 = local99;
				local43++;
				local58 >>= 0x1;
				local54 >>= 0x1;
				local62 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!n", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method3103();
		super.finalize();
	}

	@OriginalMember(owner = "client!n", name = "g", descriptor = "(I)V")
	private void method3102() {
		this.aClass31_Sub1_Sub1_7.method7129(this);
		if (Static93.aClass65_7 == this.aClass65_10) {
			OpenGL.glTexParameteri(this.anInt3834, 10241, this.aBoolean266 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt3834, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt3834, 10241, this.aBoolean266 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt3834, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!n", name = "h", descriptor = "(I)V")
	private void method3103() {
		if (this.anInt3836 > 0) {
			this.aClass31_Sub1_Sub1_7.method1020(this.anInt3836, this.method3096());
			this.anInt3836 = 0;
		}
	}
}
