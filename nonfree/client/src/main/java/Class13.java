import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public abstract class Class13 implements Interface21 {

	@OriginalMember(owner = "client!rc", name = "q", descriptor = "Lclient!on;")
	private Class280 aClass280_7 = Static131.aClass280_4;

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "Lclient!sca;")
	protected final Class335 aClass335_8;

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "Z")
	private final boolean aBoolean352;

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "Lclient!vaa;")
	protected final Class22_Sub2_Sub2 aClass22_Sub2_Sub2_8;

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
	protected final int anInt5293;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "Lclient!hu;")
	protected final Class167 aClass167_14;

	@OriginalMember(owner = "client!rc", name = "w", descriptor = "I")
	private final int anInt5302;

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
	private int anInt5306;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lclient!vaa;ILclient!sca;Lclient!hu;IZ)V")
	protected Class13(@OriginalArg(0) Class22_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class335 arg2, @OriginalArg(3) Class167 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aClass335_8 = arg2;
		this.aBoolean352 = arg5;
		this.aClass22_Sub2_Sub2_8 = arg0;
		this.anInt5293 = arg1;
		this.aClass167_14 = arg3;
		this.anInt5302 = arg4;
		OpenGL.glGenTextures(1, Static21.anIntArray47, 0);
		this.anInt5306 = Static21.anIntArray47[0];
		this.method4745();
		this.method4752();
	}

	@OriginalMember(owner = "client!rc", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method4748();
		super.finalize();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I[BIII)V")
	protected final void method4742(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 > 0 && !Static88.method1890(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static88.method1890(arg2)) {
			@Pc(40) int local40 = this.aClass335_8.anInt8864;
			@Pc(42) int local42 = 0;
			@Pc(54) int local54 = arg2 > arg0 ? arg0 : arg2;
			@Pc(58) int local58 = arg0 >> 1;
			@Pc(62) int local62 = arg2 >> 1;
			@Pc(64) byte[] local64 = arg1;
			@Pc(71) byte[] local71 = new byte[local40 * local58 * local62];
			while (true) {
				OpenGL.glTexImage2Dub(arg3, local42, this.method4743(), arg0, arg2, 0, Static82.method1790(this.aClass335_8), 5121, local64, 0);
				if (local54 <= 1) {
					return;
				}
				@Pc(104) int local104 = arg0 * local40;
				@Pc(106) byte[] local106 = local71;
				for (@Pc(108) int local108 = 0; local108 < local40; local108++) {
					@Pc(114) int local114 = local108;
					@Pc(116) int local116 = local108;
					@Pc(121) int local121 = local108 + local104;
					for (@Pc(123) int local123 = 0; local123 < local62; local123++) {
						for (@Pc(127) int local127 = 0; local127 < local58; local127++) {
							@Pc(135) byte local135 = local64[local116];
							local116 += local40;
							@Pc(145) int local145 = local135 + local64[local116];
							local116 += local40;
							@Pc(155) int local155 = local145 + local64[local121];
							local121 += local40;
							@Pc(165) int local165 = local155 + local64[local121];
							local121 += local40;
							local71[local114] = (byte) (local165 >> 2);
							local114 += local40;
						}
						local121 += local104;
						local116 += local104;
					}
				}
				local71 = local64;
				local64 = local106;
				arg2 = local62;
				arg0 = local58;
				local42++;
				local62 >>= 0x1;
				local58 >>= 0x1;
				local54 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)I")
	protected final int method4743() {
		if (this.aClass167_14 == Static259.aClass167_7) {
			if (this.aClass335_8 == Static661.aClass335_16) {
				return 6407;
			}
			if (this.aClass335_8 == Static646.aClass335_14) {
				return 6408;
			}
			if (this.aClass335_8 == Static702.aClass335_19) {
				return 6406;
			}
			if (this.aClass335_8 == Static514.aClass335_15) {
				return 6409;
			}
			if (Static109.aClass335_4 == this.aClass335_8) {
				return 6410;
			}
			if (Static684.aClass335_17 == this.aClass335_8) {
				return 6145;
			}
		} else if (Static259.aClass167_10 == this.aClass167_14) {
			if (this.aClass335_8 == Static661.aClass335_16) {
				return 34843;
			}
			if (Static646.aClass335_14 == this.aClass335_8) {
				return 34842;
			}
			if (this.aClass335_8 == Static702.aClass335_19) {
				return 34844;
			}
			if (this.aClass335_8 == Static514.aClass335_15) {
				return 34846;
			}
			if (Static109.aClass335_4 == this.aClass335_8) {
				return 34847;
			}
			if (Static684.aClass335_17 == this.aClass335_8) {
				return 6145;
			}
		} else if (Static259.aClass167_11 == this.aClass167_14) {
			if (this.aClass335_8 == Static661.aClass335_16) {
				return 34837;
			}
			if (Static646.aClass335_14 == this.aClass335_8) {
				return 34836;
			}
			if (Static702.aClass335_19 == this.aClass335_8) {
				return 34838;
			}
			if (Static514.aClass335_15 == this.aClass335_8) {
				return 34840;
			}
			if (this.aClass335_8 == Static109.aClass335_4) {
				return 34841;
			}
			if (this.aClass335_8 == Static684.aClass335_17) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIII[I)V")
	protected final void method4744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg0 > 0 && !Static88.method1890(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg1 > 0 && !Static88.method1890(arg1)) {
			throw new IllegalArgumentException("");
		} else if (this.aClass335_8 == Static646.aClass335_14) {
			@Pc(53) int local53 = 0;
			@Pc(69) int local69 = arg0 < arg1 ? arg0 : arg1;
			@Pc(73) int local73 = arg0 >> 1;
			@Pc(77) int local77 = arg1 >> 1;
			@Pc(79) int[] local79 = arg3;
			@Pc(84) int[] local84 = new int[local73 * local77];
			while (true) {
				OpenGL.glTexImage2Di(arg2, local53, this.method4743(), arg0, arg1, 0, 32993, this.aClass22_Sub2_Sub2_8.anInt10582, local79, 0);
				if (local69 <= 1) {
					return;
				}
				@Pc(106) int local106 = 0;
				@Pc(108) int local108 = 0;
				@Pc(112) int local112 = arg0;
				@Pc(114) int[] local114 = local84;
				for (@Pc(116) int local116 = 0; local116 < local77; local116++) {
					for (@Pc(122) int local122 = 0; local122 < local73; local122++) {
						@Pc(131) int local131 = local79[local108++];
						@Pc(136) int local136 = local79[local108++];
						@Pc(141) int local141 = local79[local112++];
						@Pc(147) int local147 = local131 >> 16 & 0xFF;
						@Pc(152) int local152 = local79[local112++];
						@Pc(158) int local158 = local131 >> 24 & 0xFF;
						@Pc(164) int local164 = local131 >> 8 & 0xFF;
						@Pc(168) int local168 = local131 & 0xFF;
						@Pc(176) int local176 = local164 + (local136 >> 8 & 0xFF);
						@Pc(184) int local184 = local147 + (local136 >> 16 & 0xFF);
						@Pc(192) int local192 = local158 + (local136 >> 24 & 0xFF);
						@Pc(198) int local198 = local168 + (local136 & 0xFF);
						@Pc(206) int local206 = local176 + (local141 >> 8 & 0xFF);
						@Pc(212) int local212 = local198 + (local141 & 0xFF);
						@Pc(220) int local220 = local184 + (local141 >> 16 & 0xFF);
						@Pc(228) int local228 = local192 + (local141 >> 24 & 0xFF);
						@Pc(236) int local236 = local228 + (local152 >> 24 & 0xFF);
						@Pc(244) int local244 = local206 + (local152 >> 8 & 0xFF);
						@Pc(252) int local252 = local220 + (local152 >> 16 & 0xFF);
						@Pc(258) int local258 = local212 + (local152 & 0xFF);
						local84[local106++] = local258 >> 2 & 0xFF | (local252 & 0x3FC) << 14 | (local236 & 0x3FC) << 22 | (local244 & 0x3FC) << 6;
					}
					local112 += arg0;
					local108 += arg0;
				}
				local84 = local79;
				arg1 = local77;
				arg0 = local73;
				local79 = local114;
				local73 >>= 0x1;
				local69 >>= 0x1;
				local53++;
				local77 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V")
	private void method4745() {
		this.aClass22_Sub2_Sub2_8.method8976(this);
		if (Static131.aClass280_4 == this.aClass280_7) {
			OpenGL.glTexParameteri(this.anInt5293, 10241, this.aBoolean352 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt5293, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt5293, 10241, this.aBoolean352 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt5293, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BI[FII)V")
	protected final void method4746(@OriginalArg(1) int arg0, @OriginalArg(2) float[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 > 0 && !Static88.method1890(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static88.method1890(arg3)) {
			@Pc(48) int local48 = this.aClass335_8.anInt8864;
			@Pc(50) int local50 = 0;
			@Pc(58) int local58 = arg3 <= arg0 ? arg3 : arg0;
			@Pc(62) int local62 = arg0 >> 1;
			@Pc(66) int local66 = arg3 >> 1;
			@Pc(68) float[] local68 = arg1;
			@Pc(75) float[] local75 = new float[local48 * local62 * local66];
			while (true) {
				OpenGL.glTexImage2Df(arg2, local50, this.method4743(), arg0, arg3, 0, Static82.method1790(this.aClass335_8), 5126, local68, 0);
				if (local58 <= 1) {
					return;
				}
				@Pc(104) int local104 = local48 * arg0;
				for (@Pc(106) int local106 = 0; local106 < local48; local106++) {
					@Pc(112) int local112 = local106;
					@Pc(114) int local114 = local106;
					@Pc(118) int local118 = local106 + local104;
					for (@Pc(120) int local120 = 0; local120 < local66; local120++) {
						for (@Pc(124) int local124 = 0; local124 < local62; local124++) {
							@Pc(130) float local130 = local68[local114];
							local114 += local48;
							@Pc(140) float local140 = local130 + local68[local114];
							@Pc(146) float local146 = local140 + local68[local118];
							local114 += local48;
							local118 += local48;
							@Pc(160) float local160 = local146 + local68[local118];
							local118 += local48;
							local75[local112] = local160 * 0.25F;
							local112 += local48;
						}
						local118 += local104;
						local114 += local104;
					}
				}
				@Pc(206) float[] local206 = local75;
				local75 = local68;
				arg0 = local62;
				local68 = local206;
				arg3 = local66;
				local50++;
				local66 >>= 0x1;
				local58 >>= 0x1;
				local62 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!on;B)V")
	@Override
	public final void method9229(@OriginalArg(0) Class280 arg0) {
		if (arg0 != this.aClass280_7) {
			this.aClass280_7 = arg0;
			this.method4745();
		}
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)V")
	private void method4748() {
		if (this.anInt5306 > 0) {
			this.aClass22_Sub2_Sub2_8.method8985(this.method4749(), this.anInt5306);
			this.anInt5306 = 0;
		}
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)I")
	private int method4749() {
		@Pc(26) int local26 = this.anInt5302 * this.aClass167_14.anInt3992 * this.aClass335_8.anInt8864;
		return this.aBoolean352 ? local26 * 4 / 3 : local26;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
	@Override
	public final void method9230() {
		@Pc(8) int local8 = this.aClass22_Sub2_Sub2_8.method8925();
		@Pc(14) int local14 = this.aClass22_Sub2_Sub2_8.anIntArray759[local8];
		if (this.anInt5293 != local14) {
			if (local14 != 0) {
				OpenGL.glBindTexture(local14, 0);
				OpenGL.glDisable(local14);
			}
			OpenGL.glEnable(this.anInt5293);
			this.aClass22_Sub2_Sub2_8.anIntArray759[local8] = this.anInt5293;
		}
		OpenGL.glBindTexture(this.anInt5293, this.anInt5306);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BI)V")
	private void method4752() {
		this.aClass22_Sub2_Sub2_8.anInt10451 += this.method4749();
	}
}
