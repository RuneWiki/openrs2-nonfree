import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class4_Sub21 extends Class4 {

	@OriginalMember(owner = "client!jh", name = "r", descriptor = "I")
	private int anInt3727;

	@OriginalMember(owner = "client!jh", name = "w", descriptor = "I")
	private int anInt3730;

	@OriginalMember(owner = "client!jh", name = "I", descriptor = "Lclient!ni;")
	private final Class4_Sub17 aClass4_Sub17_1;

	@OriginalMember(owner = "client!jh", name = "L", descriptor = "Lclient!bt;")
	private final Class30_Sub1 aClass30_Sub1_20;

	@OriginalMember(owner = "client!jh", name = "G", descriptor = "Lclient!gu;")
	private final Class14_Sub2 aClass14_Sub2_2;

	@OriginalMember(owner = "client!jh", name = "O", descriptor = "I")
	private final int anInt3739;

	@OriginalMember(owner = "client!jh", name = "x", descriptor = "I")
	private final int anInt3731;

	@OriginalMember(owner = "client!jh", name = "S", descriptor = "I")
	private final int anInt3741;

	@OriginalMember(owner = "client!jh", name = "C", descriptor = "I")
	private final int anInt3735;

	@OriginalMember(owner = "client!jh", name = "J", descriptor = "[[F")
	private float[][] aFloatArrayArray26;

	@OriginalMember(owner = "client!jh", name = "F", descriptor = "[[F")
	private float[][] aFloatArrayArray25;

	@OriginalMember(owner = "client!jh", name = "A", descriptor = "[[F")
	private float[][] aFloatArrayArray24;

	@OriginalMember(owner = "client!jh", name = "p", descriptor = "Lclient!wn;")
	private Class4_Sub20 aClass4_Sub20_2;

	@OriginalMember(owner = "client!jh", name = "M", descriptor = "Lclient!ow;")
	private Class4_Sub20_Sub2 aClass4_Sub20_Sub2_2;

	@OriginalMember(owner = "client!jh", name = "q", descriptor = "Lclient!hl;")
	private Class96 aClass96_27;

	@OriginalMember(owner = "client!jh", name = "Q", descriptor = "Lclient!vn;")
	private final Interface11 anInterface11_2;

	@OriginalMember(owner = "client!jh", name = "N", descriptor = "Lclient!us;")
	private final Interface9 anInterface9_5;

	@OriginalMember(owner = "client!jh", name = "s", descriptor = "Lclient!jd;")
	private final Class118 aClass118_7;

	@OriginalMember(owner = "client!jh", name = "P", descriptor = "Lclient!jd;")
	private final Class118 aClass118_8;

	static {
		new Class21(null, "geschickt werden.", null, null);
	}

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lclient!bt;Lclient!gu;Lclient!ni;[I)V")
	public Class4_Sub21(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) Class14_Sub2 arg1, @OriginalArg(2) Class4_Sub17 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass4_Sub17_1 = arg2;
		this.aClass30_Sub1_20 = arg0;
		this.aClass14_Sub2_2 = arg1;
		@Pc(23) int local23 = this.aClass4_Sub17_1.method6160() - (arg1.anInt2831 >> 1);
		this.anInt3739 = this.aClass4_Sub17_1.method6165() - local23 >> arg1.anInt2830;
		this.anInt3731 = local23 + this.aClass4_Sub17_1.method6165() >> arg1.anInt2830;
		this.anInt3741 = this.aClass4_Sub17_1.method6161() - local23 >> arg1.anInt2830;
		this.anInt3735 = local23 + this.aClass4_Sub17_1.method6161() >> arg1.anInt2830;
		@Pc(76) int local76 = this.anInt3731 + 1 - this.anInt3739;
		@Pc(85) int local85 = this.anInt3735 + 1 - this.anInt3741;
		this.aFloatArrayArray26 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray25 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray24 = new float[local76 + 1][local85 + 1];
		@Pc(122) int local122;
		@Pc(136) int local136;
		@Pc(143) int local143;
		@Pc(167) int local167;
		@Pc(182) int local182;
		for (@Pc(114) int local114 = 0; local114 <= local85; local114++) {
			local122 = local114 + this.anInt3741;
			if (local122 > 0 && local122 < this.aClass14_Sub2_2.anInt2835 - 1) {
				for (local136 = 0; local136 <= local76; local136++) {
					local143 = local136 + this.anInt3739;
					if (local143 > 0 && local143 < this.aClass14_Sub2_2.anInt2832 - 1) {
						local167 = arg1.oa(local143 + 1, local122) - arg1.oa(local143 - 1, local122);
						local182 = arg1.oa(local143, local122 + 1) - arg1.oa(local143, local122 - 1);
						@Pc(197) float local197 = (float) (1.0D / Math.sqrt((double) (local182 * local182 + local167 * local167 + 65536)));
						this.aFloatArrayArray24[local136][local114] = local197 * (float) local167;
						this.aFloatArrayArray26[local136][local114] = local197 * -256.0F;
						this.aFloatArrayArray25[local136][local114] = (float) local182 * local197;
					}
				}
			}
		}
		local122 = 0;
		local136 = 0;
		for (local143 = this.anInt3741; local143 <= this.anInt3735; local143++) {
			if (local143 >= 0 && local143 < arg1.anInt2835) {
				for (local167 = this.anInt3739; local167 <= this.anInt3731; local167++) {
					if (local167 >= 0 && arg1.anInt2832 > local167) {
						local182 = arg3[local136];
						@Pc(278) int[] local278 = arg1.anIntArrayArrayArray2[local167][local143];
						if (local278 != null && local182 != 0) {
							if (local182 == 1) {
								local122 += local278.length;
							} else {
								local122 += 3;
							}
						}
					}
					local136++;
				}
			} else {
				local136 += this.anInt3731 - this.anInt3739;
			}
		}
		if (local122 > 0) {
			this.aClass4_Sub20_2 = new Class4_Sub20(local122 * 2);
			this.aClass4_Sub20_Sub2_2 = new Class4_Sub20_Sub2(local122 * 16);
			this.aClass96_27 = new Class96(Static84.method6309(local122));
			local136 = 0;
			local167 = 0;
			for (local182 = this.anInt3741; local182 <= this.anInt3735; local182++) {
				if (local182 >= 0 && local182 < arg1.anInt2835) {
					@Pc(383) int local383 = 0;
					for (@Pc(386) int local386 = this.anInt3739; local386 <= this.anInt3731; local386++) {
						if (local386 >= 0 && arg1.anInt2832 > local386) {
							@Pc(401) int local401 = arg3[local136];
							@Pc(408) int[] local408 = arg1.anIntArrayArrayArray2[local386][local182];
							@Pc(415) int[] local415 = arg1.anIntArrayArrayArray4[local386][local182];
							if (local408 != null && local401 != 0) {
								if (local401 == 1) {
									for (@Pc(426) int local426 = 0; local426 < local408.length; local426++) {
										this.method3361(local383, local408[local426], local386, local415[local426], local182, local167);
									}
								} else if (local401 == 3) {
									this.method3361(local383, 0, local386, 0, local182, local167);
									this.method3361(local383, arg1.anInt2831, local386, 0, local182, local167);
									this.method3361(local383, 0, local386, arg1.anInt2831, local182, local167);
								} else if (local401 == 2) {
									this.method3361(local383, arg1.anInt2831, local386, 0, local182, local167);
									this.method3361(local383, arg1.anInt2831, local386, arg1.anInt2831, local182, local167);
									this.method3361(local383, 0, local386, 0, local182, local167);
								} else if (local401 == 5) {
									this.method3361(local383, arg1.anInt2831, local386, arg1.anInt2831, local182, local167);
									this.method3361(local383, 0, local386, arg1.anInt2831, local182, local167);
									this.method3361(local383, arg1.anInt2831, local386, 0, local182, local167);
								} else if (local401 == 4) {
									this.method3361(local383, 0, local386, arg1.anInt2831, local182, local167);
									this.method3361(local383, 0, local386, 0, local182, local167);
									this.method3361(local383, arg1.anInt2831, local386, arg1.anInt2831, local182, local167);
								}
							}
						}
						local136++;
						local383++;
					}
				} else {
					local136 += this.anInt3731 - this.anInt3739;
				}
				local167++;
			}
			this.anInterface11_2 = this.aClass30_Sub1_20.method723(false, this.aClass4_Sub20_2.aByteArray77, this.aClass4_Sub20_2.anInt5526);
			this.anInterface9_5 = this.aClass30_Sub1_20.method686(false, 16, this.aClass4_Sub20_Sub2_2.anInt5526, this.aClass4_Sub20_Sub2_2.aByteArray77);
			this.aClass118_7 = new Class118(this.anInterface9_5, 5126, 3, 0);
			this.aClass118_8 = new Class118(this.anInterface9_5, 5121, 4, 12);
		} else {
			this.anInterface9_5 = null;
			this.aClass118_7 = null;
			this.aClass118_8 = null;
			this.anInterface11_2 = null;
		}
		this.aClass4_Sub20_Sub2_2 = null;
		this.aClass4_Sub20_2 = null;
		this.aClass96_27 = null;
		this.aFloatArrayArray24 = this.aFloatArrayArray26 = this.aFloatArrayArray25 = null;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(SZ)V")
	private void method3357(@OriginalArg(0) short arg0) {
		if (this.aClass30_Sub1_20.aBoolean51) {
			this.aClass4_Sub20_2.method4558(arg0);
		} else {
			this.aClass4_Sub20_2.method4604(arg0);
		}
		this.anInt3730++;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIII[[Z)V")
	public void method3359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3) {
		if (this.anInterface11_2 == null || (this.anInt3739 > arg1 + arg2 || (this.anInt3731 < arg1 - arg2 || (this.anInt3741 > arg0 + arg2 || arg0 - arg2 > this.anInt3735)))) {
			return;
		}
		for (@Pc(53) int local53 = this.anInt3741; local53 <= this.anInt3735; local53++) {
			for (@Pc(58) int local58 = this.anInt3739; local58 <= this.anInt3731; local58++) {
				@Pc(65) int local65 = local58 - arg1;
				@Pc(70) int local70 = local53 - arg0;
				if (-arg2 < local65 && local65 < arg2 && -arg2 < local70 && arg2 > local70 && arg3[arg2 + local65][arg2 + local70]) {
					this.aClass30_Sub1_20.method765((int) (this.aClass4_Sub17_1.method6158() * 255.0F) << 24);
					this.aClass30_Sub1_20.method748(this.aClass118_8, null, null, this.aClass118_7);
					this.aClass30_Sub1_20.method721(0, this.anInt3730, this.anInterface11_2);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIIII)V")
	private void method3361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = arg1 + (arg2 << this.aClass14_Sub2_2.anInt2830);
		@Pc(24) int local24 = arg3 + (arg4 << this.aClass14_Sub2_2.anInt2830);
		@Pc(30) int local30 = this.aClass14_Sub2_2.R(local15, local24);
		if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
			local7 = (long) local24 << 16 & 0xFFFFL << 16 | (long) local15 & 0xFFFFL;
			@Pc(61) Class4 local61 = this.aClass96_27.method2797(local7);
			if (local61 != null) {
				this.method3357(((Class4_Sub27) local61).aShort55);
				return;
			}
		}
		@Pc(79) short local79 = (short) this.anInt3727++;
		if (local7 != -1L) {
			this.aClass96_27.method2805(local7, new Class4_Sub27(local79));
		}
		@Pc(125) float local125;
		@Pc(111) float local111;
		@Pc(118) float local118;
		@Pc(233) float local233;
		@Pc(241) float local241;
		@Pc(248) float local248;
		@Pc(255) float local255;
		@Pc(262) float local262;
		@Pc(271) float local271;
		@Pc(280) float local280;
		@Pc(370) float local370;
		if (arg1 == 0 && arg3 == 0) {
			local111 = this.aFloatArrayArray26[arg0][arg5];
			local118 = this.aFloatArrayArray25[arg0][arg5];
			local125 = this.aFloatArrayArray24[arg0][arg5];
		} else if (this.aClass14_Sub2_2.anInt2831 == arg1 && arg3 == 0) {
			local118 = this.aFloatArrayArray25[arg0 + 1][arg5];
			local111 = this.aFloatArrayArray26[arg0 + 1][arg5];
			local125 = this.aFloatArrayArray24[arg0 + 1][arg5];
		} else if (this.aClass14_Sub2_2.anInt2831 == arg1 && this.aClass14_Sub2_2.anInt2831 == arg3) {
			local111 = this.aFloatArrayArray26[arg0 + 1][arg5 + 1];
			local118 = this.aFloatArrayArray25[arg0 + 1][arg5 + 1];
			local125 = this.aFloatArrayArray24[arg0 + 1][arg5 + 1];
		} else if (arg1 == 0 && this.aClass14_Sub2_2.anInt2831 == arg3) {
			local125 = this.aFloatArrayArray24[arg0][arg5 + 1];
			local118 = this.aFloatArrayArray25[arg0][arg5 + 1];
			local111 = this.aFloatArrayArray26[arg0][arg5 + 1];
		} else {
			local233 = (float) arg1 / (float) this.aClass14_Sub2_2.anInt2831;
			local241 = (float) arg3 / (float) this.aClass14_Sub2_2.anInt2831;
			local248 = this.aFloatArrayArray24[arg0][arg5];
			local255 = this.aFloatArrayArray26[arg0][arg5];
			local262 = this.aFloatArrayArray25[arg0][arg5];
			local271 = this.aFloatArrayArray24[arg0 + 1][arg5];
			local280 = this.aFloatArrayArray26[arg0 + 1][arg5];
			@Pc(297) float local297 = local280 + (this.aFloatArrayArray26[arg0 + 1][arg5 + 1] - local280) * local233;
			@Pc(313) float local313 = local262 + local233 * (this.aFloatArrayArray25[arg0][arg5 + 1] - local262);
			@Pc(330) float local330 = local271 + local233 * (this.aFloatArrayArray24[arg0 + 1][arg5 + 1] - local271);
			@Pc(345) float local345 = local255 + (this.aFloatArrayArray26[arg0][arg5 + 1] - local255) * local233;
			@Pc(361) float local361 = local248 + local233 * (this.aFloatArrayArray24[arg0][arg5 + 1] - local248);
			local370 = this.aFloatArrayArray25[arg0 + 1][arg5];
			@Pc(388) float local388 = local370 + (this.aFloatArrayArray25[arg0 + 1][arg5 + 1] - local370) * local233;
			local125 = local241 * (local330 - local361) + local361;
			local111 = (local297 - local345) * local241 + local345;
			local118 = local241 * (local388 - local313) + local313;
		}
		local233 = this.aClass4_Sub17_1.method6165() - local15;
		local241 = this.aClass4_Sub17_1.method6162() - local30;
		local248 = this.aClass4_Sub17_1.method6161() - local24;
		local255 = (float) Math.sqrt((double) (local248 * local248 + local241 * local241 + local233 * local233));
		local262 = 1.0F / local255;
		local248 *= local262;
		local233 *= local262;
		local241 *= local262;
		local271 = local255 / (float) this.aClass4_Sub17_1.method6160();
		local280 = 1.0F - local271 * local271;
		if (local280 < 0.0F) {
			local280 = 0.0F;
		}
		local370 = local118 * local248 + local111 * local241 + local125 * local233;
		if (local370 < 0.0F) {
			local370 = 0.0F;
		}
		@Pc(552) float local552 = local280 * 2.0F * local370;
		if (local552 > 1.0F) {
			local552 = 1.0F;
		}
		@Pc(563) int local563 = this.aClass4_Sub17_1.method6159();
		@Pc(573) int local573 = (int) ((float) (local563 >> 16 & 0xFF) * local552);
		if (local573 > 255) {
			local573 = 255;
		}
		@Pc(588) int local588 = (int) ((float) (local563 >> 8 & 0xFF) * local552);
		if (local588 > 255) {
			local588 = 255;
		}
		@Pc(601) int local601 = (int) (local552 * (float) (local563 & 0xFF));
		if (local601 > 255) {
			local601 = 255;
		}
		if (this.aClass30_Sub1_20.aBoolean51) {
			this.aClass4_Sub20_Sub2_2.method4626((float) local15);
			this.aClass4_Sub20_Sub2_2.method4626((float) local30);
			this.aClass4_Sub20_Sub2_2.method4626((float) local24);
		} else {
			this.aClass4_Sub20_Sub2_2.method4627((float) local15);
			this.aClass4_Sub20_Sub2_2.method4627((float) local30);
			this.aClass4_Sub20_Sub2_2.method4627((float) local24);
		}
		this.aClass4_Sub20_Sub2_2.method4590(local573);
		this.aClass4_Sub20_Sub2_2.method4590(local588);
		this.aClass4_Sub20_Sub2_2.method4590(local601);
		this.aClass4_Sub20_Sub2_2.method4590(255);
		this.method3357(local79);
	}
}
