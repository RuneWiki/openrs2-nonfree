import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class6_Sub51 extends Class6 {

	@OriginalMember(owner = "client!wr", name = "E", descriptor = "I")
	private int anInt9790;

	@OriginalMember(owner = "client!wr", name = "v", descriptor = "Lclient!od;")
	private final Class6_Sub29 aClass6_Sub29_3;

	@OriginalMember(owner = "client!wr", name = "I", descriptor = "Lclient!ap;")
	private final Class9_Sub2 aClass9_Sub2_43;

	@OriginalMember(owner = "client!wr", name = "p", descriptor = "Lclient!mh;")
	private final Class62_Sub2 aClass62_Sub2_3;

	@OriginalMember(owner = "client!wr", name = "F", descriptor = "I")
	private final int anInt9791;

	@OriginalMember(owner = "client!wr", name = "M", descriptor = "I")
	private final int anInt9793;

	@OriginalMember(owner = "client!wr", name = "m", descriptor = "I")
	private final int anInt9782;

	@OriginalMember(owner = "client!wr", name = "q", descriptor = "I")
	private final int anInt9784;

	@OriginalMember(owner = "client!wr", name = "J", descriptor = "[[F")
	private float[][] aFloatArrayArray15;

	@OriginalMember(owner = "client!wr", name = "A", descriptor = "[[F")
	private float[][] aFloatArrayArray14;

	@OriginalMember(owner = "client!wr", name = "z", descriptor = "[[F")
	private float[][] aFloatArrayArray13;

	@OriginalMember(owner = "client!wr", name = "B", descriptor = "I")
	private int anInt9788;

	@OriginalMember(owner = "client!wr", name = "K", descriptor = "Lclient!iaa;")
	private final Class6_Sub26 aClass6_Sub26_7;

	@OriginalMember(owner = "client!wr", name = "r", descriptor = "Lclient!jh;")
	private final Class6_Sub26_Sub1 aClass6_Sub26_Sub1_3;

	@OriginalMember(owner = "client!wr", name = "n", descriptor = "Lclient!tq;")
	private final Class305 aClass305_41;

	@OriginalMember(owner = "client!wr", name = "G", descriptor = "Lclient!fm;")
	private final Interface3 anInterface3_5;

	@OriginalMember(owner = "client!wr", name = "s", descriptor = "Lclient!rl;")
	private final Interface18 anInterface18_7;

	@OriginalMember(owner = "client!wr", name = "L", descriptor = "Lclient!jl;")
	private final Class166 aClass166_15;

	@OriginalMember(owner = "client!wr", name = "N", descriptor = "Lclient!jl;")
	private final Class166 aClass166_16;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lclient!ap;Lclient!mh;Lclient!od;[I)V")
	public Class6_Sub51(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) Class62_Sub2 arg1, @OriginalArg(2) Class6_Sub29 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass6_Sub29_3 = arg2;
		this.aClass9_Sub2_43 = arg0;
		this.aClass62_Sub2_3 = arg1;
		@Pc(22) int local22 = this.aClass6_Sub29_3.method6160() - (arg1.anInt9884 >> 1);
		this.anInt9791 = this.aClass6_Sub29_3.method6164() - local22 >> arg1.anInt9883;
		this.anInt9793 = local22 + this.aClass6_Sub29_3.method6164() >> arg1.anInt9883;
		this.anInt9782 = this.aClass6_Sub29_3.method6165() - local22 >> arg1.anInt9883;
		this.anInt9784 = local22 + this.aClass6_Sub29_3.method6165() >> arg1.anInt9883;
		@Pc(77) int local77 = this.anInt9793 + 1 - this.anInt9791;
		@Pc(86) int local86 = this.anInt9784 + 1 - this.anInt9782;
		this.aFloatArrayArray15 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray14 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray13 = new float[local77 + 1][local86 + 1];
		@Pc(137) int local137;
		@Pc(144) int local144;
		@Pc(172) int local172;
		@Pc(186) int local186;
		for (@Pc(115) int local115 = 0; local115 <= local86; local115++) {
			@Pc(122) int local122 = this.anInt9782 + local115;
			if (local122 > 0 && local122 < this.aClass62_Sub2_3.anInt9885 - 1) {
				for (local137 = 0; local137 <= local77; local137++) {
					local144 = this.anInt9791 + local137;
					if (local144 > 0 && local144 < this.aClass62_Sub2_3.anInt9881 - 1) {
						local172 = arg1.JA(local144 + 1, local122) - arg1.JA(local144 - 1, local122);
						local186 = arg1.JA(local144, local122 + 1) - arg1.JA(local144, local122 - 1);
						@Pc(202) float local202 = (float) (1.0D / Math.sqrt((double) (local172 * local172 + local186 * local186 + 65536)));
						this.aFloatArrayArray15[local137][local115] = (float) local172 * local202;
						this.aFloatArrayArray14[local137][local115] = local202 * -256.0F;
						this.aFloatArrayArray13[local137][local115] = local202 * (float) local186;
					}
				}
			}
		}
		local137 = 0;
		for (local144 = this.anInt9782; local144 <= this.anInt9784; local144++) {
			if (local144 >= 0 && arg1.anInt9885 > local144) {
				for (local172 = this.anInt9791; local172 <= this.anInt9793; local172++) {
					if (local172 >= 0 && local172 < arg1.anInt9881) {
						local186 = arg3[local137];
						@Pc(297) int[] local297 = arg1.anIntArrayArrayArray14[local172][local144];
						if (local297 != null && local186 != 0) {
							if (local186 == 1) {
								@Pc(306) int local306 = 0;
								while (local297.length > local306) {
									if (local297[local306++] != -1 && local297[local306++] != -1 && local297[local306++] != -1) {
										this.anInt9788 += 3;
									}
								}
							} else {
								this.anInt9788 += 3;
							}
						}
					}
					local137++;
				}
			} else {
				local137 += this.anInt9793 - this.anInt9791;
			}
		}
		this.anInterface18_7 = null;
		this.aClass166_16 = null;
		this.aClass166_15 = null;
		this.anInterface3_5 = null;
		this.aClass305_41 = null;
		this.aClass6_Sub26_7 = null;
		this.aClass6_Sub26_Sub1_3 = null;
		this.aFloatArrayArray15 = this.aFloatArrayArray14 = this.aFloatArrayArray13 = null;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(SZ)V")
	private void method8144(@OriginalArg(0) short arg0, @OriginalArg(1) boolean arg1) {
		if (!arg1) {
			return;
		}
		if (this.aClass9_Sub2_43.aBoolean65) {
			this.aClass6_Sub26_7.method4962(arg0);
		} else {
			this.aClass6_Sub26_7.method4993(arg0);
		}
		this.anInt9788++;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(B[[ZIII)V")
	public void method8145(@OriginalArg(1) boolean[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface3_5 == null || (arg2 + arg1 < this.anInt9791 || (arg2 - arg1 > this.anInt9793 || (this.anInt9782 > arg3 + arg1 || this.anInt9784 < arg3 - arg1)))) {
			return;
		}
		for (@Pc(51) int local51 = this.anInt9782; local51 <= this.anInt9784; local51++) {
			for (@Pc(64) int local64 = this.anInt9791; local64 <= this.anInt9793; local64++) {
				@Pc(71) int local71 = local64 - arg2;
				@Pc(75) int local75 = local51 - arg3;
				if (-arg1 < local71 && arg1 > local71 && -arg1 < local75 && arg1 > local75 && arg0[arg1 + local71][local75 + arg1]) {
					this.aClass9_Sub2_43.method753((int) (this.aClass6_Sub29_3.method6158() * 255.0F) << 24);
					this.aClass9_Sub2_43.method805(this.aClass166_15, null, this.aClass166_16, null);
					this.aClass9_Sub2_43.method790(this.anInt9788, 0, this.anInterface3_5);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIIIII)V")
	private void method8147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg5 << this.aClass62_Sub2_3.anInt9883) + arg1;
		@Pc(24) int local24 = arg2 + (arg6 << this.aClass62_Sub2_3.anInt9883);
		@Pc(30) int local30 = this.aClass62_Sub2_3.sa(local15, local24);
		if ((arg1 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local7 = ((long) local24 & 0xFFFFL) << 16 | (long) local15 & 0xFFFFL;
			@Pc(59) Class6 local59 = this.aClass305_41.method7447(local7);
			if (local59 != null) {
				this.method8144(((Class6_Sub16) local59).aShort28, true);
				return;
			}
		}
		@Pc(77) short local77 = (short) this.anInt9790++;
		if (local7 != -1L) {
			this.aClass305_41.method7448(local7, new Class6_Sub16(local77));
		}
		@Pc(123) float local123;
		@Pc(109) float local109;
		@Pc(116) float local116;
		@Pc(232) float local232;
		@Pc(240) float local240;
		@Pc(247) float local247;
		@Pc(254) float local254;
		@Pc(261) float local261;
		@Pc(270) float local270;
		@Pc(279) float local279;
		@Pc(369) float local369;
		if (arg1 == 0 && arg2 == 0) {
			local109 = this.aFloatArrayArray14[arg4][arg3];
			local116 = this.aFloatArrayArray13[arg4][arg3];
			local123 = this.aFloatArrayArray15[arg4][arg3];
		} else if (this.aClass62_Sub2_3.anInt9884 == arg1 && arg2 == 0) {
			local116 = this.aFloatArrayArray13[arg4 + 1][arg3];
			local109 = this.aFloatArrayArray14[arg4 + 1][arg3];
			local123 = this.aFloatArrayArray15[arg4 + 1][arg3];
		} else if (arg1 == this.aClass62_Sub2_3.anInt9884 && arg2 == this.aClass62_Sub2_3.anInt9884) {
			local123 = this.aFloatArrayArray15[arg4 + 1][arg3 + 1];
			local116 = this.aFloatArrayArray13[arg4 + 1][arg3 + 1];
			local109 = this.aFloatArrayArray14[arg4 + 1][arg3 + 1];
		} else if (arg1 == 0 && arg2 == this.aClass62_Sub2_3.anInt9884) {
			local123 = this.aFloatArrayArray15[arg4][arg3 + 1];
			local109 = this.aFloatArrayArray14[arg4][arg3 + 1];
			local116 = this.aFloatArrayArray13[arg4][arg3 + 1];
		} else {
			local232 = (float) arg1 / (float) this.aClass62_Sub2_3.anInt9884;
			local240 = (float) arg2 / (float) this.aClass62_Sub2_3.anInt9884;
			local247 = this.aFloatArrayArray15[arg4][arg3];
			local254 = this.aFloatArrayArray14[arg4][arg3];
			local261 = this.aFloatArrayArray13[arg4][arg3];
			local270 = this.aFloatArrayArray15[arg4 + 1][arg3];
			local279 = this.aFloatArrayArray14[arg4 + 1][arg3];
			@Pc(297) float local297 = local279 + local232 * (this.aFloatArrayArray14[arg4 + 1][arg3 + 1] - local279);
			@Pc(312) float local312 = local247 + (this.aFloatArrayArray15[arg4][arg3 + 1] - local247) * local232;
			@Pc(327) float local327 = local261 + (this.aFloatArrayArray13[arg4][arg3 + 1] - local261) * local232;
			@Pc(345) float local345 = local270 + local232 * (this.aFloatArrayArray15[arg4 + 1][arg3 + 1] - local270);
			@Pc(360) float local360 = local254 + local232 * (this.aFloatArrayArray14[arg4][arg3 + 1] - local254);
			local369 = this.aFloatArrayArray13[arg4 + 1][arg3];
			local123 = local240 * (local345 - local312) + local312;
			@Pc(395) float local395 = local369 + (this.aFloatArrayArray13[arg4 + 1][arg3 + 1] - local369) * local232;
			local109 = local360 + local240 * (local297 - local360);
			local116 = local327 + local240 * (local395 - local327);
		}
		local232 = this.aClass6_Sub29_3.method6164() - local15;
		local240 = this.aClass6_Sub29_3.method6161() - local30;
		local247 = this.aClass6_Sub29_3.method6165() - local24;
		local254 = (float) Math.sqrt((double) (local240 * local240 + local232 * local232 + local247 * local247));
		local261 = 1.0F / local254;
		local247 *= local261;
		local240 *= local261;
		local232 *= local261;
		local270 = local254 / (float) this.aClass6_Sub29_3.method6160();
		local279 = 1.0F - local270 * local270;
		if (local279 < 0.0F) {
			local279 = 0.0F;
		}
		local369 = local109 * local240 + local232 * local123 + local116 * local247;
		if (local369 < 0.0F) {
			local369 = 0.0F;
		}
		@Pc(542) float local542 = local369 * 2.0F * local279;
		if (local542 > 1.0F) {
			local542 = 1.0F;
		}
		@Pc(553) int local553 = this.aClass6_Sub29_3.method6157();
		@Pc(563) int local563 = (int) (local542 * (float) (local553 >> 16 & 0xFF));
		if (local563 > 255) {
			local563 = 255;
		}
		@Pc(580) int local580 = (int) ((float) (local553 >> 8 & 0xFF) * local542);
		if (local580 > 255) {
			local580 = 255;
		}
		@Pc(593) int local593 = (int) ((float) (local553 & 0xFF) * local542);
		if (local593 > arg0) {
			local593 = 255;
		}
		if (this.aClass9_Sub2_43.aBoolean65) {
			this.aClass6_Sub26_Sub1_3.method4361((float) local15);
			this.aClass6_Sub26_Sub1_3.method4361((float) local30);
			this.aClass6_Sub26_Sub1_3.method4361((float) local24);
		} else {
			this.aClass6_Sub26_Sub1_3.method4360((float) local15);
			this.aClass6_Sub26_Sub1_3.method4360((float) local30);
			this.aClass6_Sub26_Sub1_3.method4360((float) local24);
		}
		this.aClass6_Sub26_Sub1_3.method4950(local563, -81849);
		this.aClass6_Sub26_Sub1_3.method4950(local580, arg0 - 82104);
		this.aClass6_Sub26_Sub1_3.method4950(local593, arg0 ^ 0xFFFEC0B8);
		this.aClass6_Sub26_Sub1_3.method4950(255, -81849);
		this.method8144(local77, true);
	}
}
