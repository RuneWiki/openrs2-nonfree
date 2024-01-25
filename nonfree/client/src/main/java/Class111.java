import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jv")
public abstract class Class111 implements Interface1 {

	@OriginalMember(owner = "client!jv", name = "e", descriptor = "Lclient!ag;")
	private Class8 aClass8_10 = Static608.aClass8_11;

	@OriginalMember(owner = "client!jv", name = "o", descriptor = "Z")
	private final boolean aBoolean639;

	@OriginalMember(owner = "client!jv", name = "d", descriptor = "I")
	protected final int anInt9160;

	@OriginalMember(owner = "client!jv", name = "u", descriptor = "Lclient!wj;")
	protected final Class389 aClass389_11;

	@OriginalMember(owner = "client!jv", name = "s", descriptor = "Lclient!sha;")
	protected final Class95_Sub1_Sub1 aClass95_Sub1_Sub1_12;

	@OriginalMember(owner = "client!jv", name = "j", descriptor = "Lclient!g;")
	protected final Class122 aClass122_18;

	@OriginalMember(owner = "client!jv", name = "c", descriptor = "I")
	private final int anInt9159;

	@OriginalMember(owner = "client!jv", name = "i", descriptor = "I")
	private int anInt9164;

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Lclient!sha;ILclient!g;Lclient!wj;IZ)V")
	protected Class111(@OriginalArg(0) Class95_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class122 arg2, @OriginalArg(3) Class389 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aBoolean639 = arg5;
		this.anInt9160 = arg1;
		this.aClass389_11 = arg3;
		this.aClass95_Sub1_Sub1_12 = arg0;
		this.aClass122_18 = arg2;
		this.anInt9159 = arg4;
		OpenGL.glGenTextures(1, Static235.anIntArray249, 0);
		this.anInt9164 = Static235.anIntArray249[0];
		this.method7465();
		this.method7466();
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)V")
	@Override
	public final void method7463() {
		@Pc(16) int local16 = this.aClass95_Sub1_Sub1_12.method8092();
		@Pc(22) int local22 = this.aClass95_Sub1_Sub1_12.anIntArray476[local16];
		if (this.anInt9160 != local22) {
			if (local22 != 0) {
				OpenGL.glBindTexture(local22, 0);
				OpenGL.glDisable(local22);
			}
			OpenGL.glEnable(this.anInt9160);
			this.aClass95_Sub1_Sub1_12.anIntArray476[local16] = this.anInt9160;
		}
		OpenGL.glBindTexture(this.anInt9160, this.anInt9164);
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(I[IBII)V")
	protected final void method7464(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 > 0 && !Static365.method5254(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg2 > 0 && !Static365.method5254(arg2)) {
			throw new IllegalArgumentException("");
		} else if (this.aClass122_18 == Static21.aClass122_14) {
			@Pc(49) int local49 = 0;
			@Pc(60) int local60 = arg0 >= arg2 ? arg2 : arg0;
			@Pc(64) int local64 = arg0 >> 1;
			@Pc(68) int local68 = arg2 >> 1;
			@Pc(70) int[] local70 = arg1;
			@Pc(75) int[] local75 = new int[local64 * local68];
			while (true) {
				OpenGL.glTexImage2Di(arg3, local49, this.method7471(), arg0, arg2, 0, 32993, this.aClass95_Sub1_Sub1_12.anInt8944, local70, 0);
				if (local60 <= 1) {
					return;
				}
				@Pc(96) int local96 = 0;
				@Pc(98) int local98 = 0;
				@Pc(102) int local102 = arg0;
				for (@Pc(104) int local104 = 0; local104 < local68; local104++) {
					for (@Pc(108) int local108 = 0; local108 < local64; local108++) {
						@Pc(115) int local115 = local70[local98++];
						@Pc(120) int local120 = local70[local98++];
						@Pc(125) int local125 = local70[local102++];
						@Pc(131) int local131 = local115 >> 16 & 0xFF;
						@Pc(135) int local135 = local115 & 0xFF;
						@Pc(141) int local141 = local115 >> 24 & 0xFF;
						@Pc(147) int local147 = local115 >> 8 & 0xFF;
						@Pc(152) int local152 = local70[local102++];
						@Pc(158) int local158 = local135 + (local120 & 0xFF);
						@Pc(166) int local166 = local131 + (local120 >> 16 & 0xFF);
						@Pc(174) int local174 = local147 + (local120 >> 8 & 0xFF);
						@Pc(182) int local182 = local141 + (local120 >> 24 & 0xFF);
						@Pc(190) int local190 = local174 + (local125 >> 8 & 0xFF);
						@Pc(196) int local196 = local158 + (local125 & 0xFF);
						@Pc(204) int local204 = local182 + (local125 >> 24 & 0xFF);
						@Pc(212) int local212 = local166 + (local125 >> 16 & 0xFF);
						@Pc(220) int local220 = local190 + (local152 >> 8 & 0xFF);
						@Pc(226) int local226 = local196 + (local152 & 0xFF);
						@Pc(234) int local234 = local212 + (local152 >> 16 & 0xFF);
						@Pc(242) int local242 = local204 + (local152 >> 24 & 0xFF);
						local75[local96++] = (local220 & 0x3FC) << 6 | (local242 & 0x3FC) << 22 | (local234 & 0x3FC) << 14 | local226 >> 2 & 0xFF;
					}
					local102 += arg0;
					local98 += arg0;
				}
				@Pc(287) int[] local287 = local75;
				local75 = local70;
				arg2 = local68;
				local70 = local287;
				arg0 = local64;
				local64 >>= 0x1;
				local49++;
				local68 >>= 0x1;
				local60 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(B)V")
	private void method7465() {
		this.aClass95_Sub1_Sub1_12.method8147(this);
		if (this.aClass8_10 == Static608.aClass8_11) {
			OpenGL.glTexParameteri(this.anInt9160, 10241, this.aBoolean639 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt9160, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt9160, 10241, this.aBoolean639 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt9160, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(II)V")
	private void method7466() {
		this.aClass95_Sub1_Sub1_12.anInt10020 += this.method7473();
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(BLclient!ag;)V")
	@Override
	public final void method7462(@OriginalArg(1) Class8 arg0) {
		if (this.aClass8_10 != arg0) {
			this.aClass8_10 = arg0;
			this.method7465();
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(I[BIII)V")
	protected final void method7467(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 > 0 && !Static365.method5254(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static365.method5254(arg0)) {
			@Pc(34) int local34 = this.aClass122_18.anInt3389;
			@Pc(42) int local42 = 0;
			@Pc(49) int local49 = arg0 > arg2 ? arg2 : arg0;
			@Pc(53) int local53 = arg2 >> 1;
			@Pc(57) int local57 = arg0 >> 1;
			@Pc(59) byte[] local59 = arg1;
			@Pc(66) byte[] local66 = new byte[local34 * local53 * local57];
			while (true) {
				OpenGL.glTexImage2Dub(arg3, local42, this.method7471(), arg2, arg0, 0, Static450.method6089(this.aClass122_18), 5121, local59, 0);
				if (local49 <= 1) {
					return;
				}
				@Pc(92) int local92 = arg2 * local34;
				for (@Pc(94) int local94 = 0; local94 < local34; local94++) {
					@Pc(98) int local98 = local94;
					@Pc(100) int local100 = local94;
					@Pc(105) int local105 = local94 + local92;
					for (@Pc(107) int local107 = 0; local107 < local57; local107++) {
						for (@Pc(111) int local111 = 0; local111 < local53; local111++) {
							@Pc(117) byte local117 = local59[local100];
							local100 += local34;
							@Pc(127) int local127 = local117 + local59[local100];
							@Pc(133) int local133 = local127 + local59[local105];
							local100 += local34;
							local105 += local34;
							@Pc(147) int local147 = local133 + local59[local105];
							local105 += local34;
							local66[local98] = (byte) (local147 >> 2);
							local98 += local34;
						}
						local105 += local92;
						local100 += local92;
					}
				}
				@Pc(192) byte[] local192 = local66;
				local66 = local59;
				arg0 = local57;
				arg2 = local53;
				local59 = local192;
				local53 >>= 0x1;
				local49 >>= 0x1;
				local57 >>= 0x1;
				local42++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!jv", name = "c", descriptor = "(B)V")
	private void method7468() {
		if (this.anInt9164 > 0) {
			this.aClass95_Sub1_Sub1_12.method7302(this.anInt9164, this.method7473());
			this.anInt9164 = 0;
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IIII[F)V")
	protected final void method7469(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float[] arg3) {
		if (arg0 > 0 && !Static365.method5254(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static365.method5254(arg1)) {
			@Pc(43) int local43 = this.aClass122_18.anInt3389;
			@Pc(45) int local45 = 0;
			@Pc(56) int local56 = arg0 >= arg1 ? arg1 : arg0;
			@Pc(60) int local60 = arg0 >> 1;
			@Pc(64) int local64 = arg1 >> 1;
			@Pc(66) float[] local66 = arg3;
			@Pc(73) float[] local73 = new float[local43 * local64 * local60];
			while (true) {
				OpenGL.glTexImage2Df(arg2, local45, this.method7471(), arg0, arg1, 0, Static450.method6089(this.aClass122_18), 5126, local66, 0);
				if (local56 <= 1) {
					return;
				}
				@Pc(99) int local99 = local43 * arg0;
				for (@Pc(101) int local101 = 0; local101 < local43; local101++) {
					@Pc(105) int local105 = local101;
					@Pc(107) int local107 = local101;
					@Pc(111) int local111 = local101 + local99;
					for (@Pc(113) int local113 = 0; local113 < local64; local113++) {
						for (@Pc(117) int local117 = 0; local117 < local60; local117++) {
							@Pc(123) float local123 = local66[local107];
							local107 += local43;
							@Pc(133) float local133 = local123 + local66[local107];
							local107 += local43;
							@Pc(143) float local143 = local133 + local66[local111];
							local111 += local43;
							@Pc(153) float local153 = local143 + local66[local111];
							local111 += local43;
							local73[local105] = local153 * 0.25F;
							local105 += local43;
						}
						local107 += local99;
						local111 += local99;
					}
				}
				@Pc(197) float[] local197 = local73;
				local73 = local66;
				arg0 = local60;
				local66 = local197;
				arg1 = local64;
				local56 >>= 0x1;
				local64 >>= 0x1;
				local60 >>= 0x1;
				local45++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!jv", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7468();
		super.finalize();
	}

	@OriginalMember(owner = "client!jv", name = "d", descriptor = "(I)I")
	protected final int method7471() {
		if (Static666.aClass389_16 == this.aClass389_11) {
			if (this.aClass122_18 == Static147.aClass122_6) {
				return 6407;
			}
			if (this.aClass122_18 == Static21.aClass122_14) {
				return 6408;
			}
			if (Static111.aClass122_5 == this.aClass122_18) {
				return 6406;
			}
			if (Static618.aClass122_19 == this.aClass122_18) {
				return 6409;
			}
			if (this.aClass122_18 == Static511.aClass122_15) {
				return 6410;
			}
			if (Static80.aClass122_4 == this.aClass122_18) {
				return 6145;
			}
		} else if (Static666.aClass389_19 == this.aClass389_11) {
			if (Static147.aClass122_6 == this.aClass122_18) {
				return 34843;
			}
			if (this.aClass122_18 == Static21.aClass122_14) {
				return 34842;
			}
			if (this.aClass122_18 == Static111.aClass122_5) {
				return 34844;
			}
			if (Static618.aClass122_19 == this.aClass122_18) {
				return 34846;
			}
			if (Static511.aClass122_15 == this.aClass122_18) {
				return 34847;
			}
			if (Static80.aClass122_4 == this.aClass122_18) {
				return 6145;
			}
		} else if (Static666.aClass389_20 == this.aClass389_11) {
			if (Static147.aClass122_6 == this.aClass122_18) {
				return 34837;
			}
			if (this.aClass122_18 == Static21.aClass122_14) {
				return 34836;
			}
			if (Static111.aClass122_5 == this.aClass122_18) {
				return 34838;
			}
			if (this.aClass122_18 == Static618.aClass122_19) {
				return 34840;
			}
			if (this.aClass122_18 == Static511.aClass122_15) {
				return 34841;
			}
			if (this.aClass122_18 == Static80.aClass122_4) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jv", name = "d", descriptor = "(B)I")
	private int method7473() {
		@Pc(22) int local22 = this.aClass122_18.anInt3389 * this.aClass389_11.anInt10800 * this.anInt9159;
		return this.aBoolean639 ? local22 * 4 / 3 : local22;
	}
}
