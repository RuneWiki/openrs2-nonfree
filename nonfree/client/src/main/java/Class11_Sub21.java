import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class11_Sub21 extends Class11 {

	@OriginalMember(owner = "client!ik", name = "v", descriptor = "I")
	private int anInt2399;

	@OriginalMember(owner = "client!ik", name = "A", descriptor = "I")
	private int anInt2400;

	@OriginalMember(owner = "client!ik", name = "x", descriptor = "Lclient!bh;")
	private final Class11_Sub5 aClass11_Sub5_1;

	@OriginalMember(owner = "client!ik", name = "m", descriptor = "Lclient!tb;")
	private final Class129_Sub2 aClass129_Sub2_19;

	@OriginalMember(owner = "client!ik", name = "z", descriptor = "Lclient!fq;")
	private final Class77_Sub1 aClass77_Sub1_3;

	@OriginalMember(owner = "client!ik", name = "k", descriptor = "I")
	private final int anInt2395;

	@OriginalMember(owner = "client!ik", name = "p", descriptor = "I")
	private final int anInt2396;

	@OriginalMember(owner = "client!ik", name = "q", descriptor = "I")
	private final int anInt2397;

	@OriginalMember(owner = "client!ik", name = "s", descriptor = "I")
	private final int anInt2398;

	@OriginalMember(owner = "client!ik", name = "B", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!ik", name = "w", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!ik", name = "y", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!ik", name = "t", descriptor = "Lclient!kh;")
	private Class11_Sub25 aClass11_Sub25_3;

	@OriginalMember(owner = "client!ik", name = "j", descriptor = "Lclient!to;")
	private Class11_Sub25_Sub2 aClass11_Sub25_Sub2_2;

	@OriginalMember(owner = "client!ik", name = "n", descriptor = "Lclient!ec;")
	private Class58 aClass58_15;

	@OriginalMember(owner = "client!ik", name = "o", descriptor = "Lclient!ok;")
	private final Interface5 anInterface5_3;

	@OriginalMember(owner = "client!ik", name = "l", descriptor = "Lclient!qb;")
	private final Interface6 anInterface6_3;

	@OriginalMember(owner = "client!ik", name = "u", descriptor = "Lclient!q;")
	private final Class160 aClass160_10;

	@OriginalMember(owner = "client!ik", name = "r", descriptor = "Lclient!q;")
	private final Class160 aClass160_9;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lclient!tb;Lclient!fq;Lclient!bh;[I)V")
	public Class11_Sub21(@OriginalArg(0) Class129_Sub2 arg0, @OriginalArg(1) Class77_Sub1 arg1, @OriginalArg(2) Class11_Sub5 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass11_Sub5_1 = arg2;
		this.aClass129_Sub2_19 = arg0;
		this.aClass77_Sub1_3 = arg1;
		@Pc(19) int local19 = this.aClass11_Sub5_1.anInt1289 - (arg1.anInt1677 >> 1);
		this.anInt2395 = this.aClass11_Sub5_1.anInt1285 - local19 >> arg1.anInt1681;
		this.anInt2396 = this.aClass11_Sub5_1.anInt1285 + local19 >> arg1.anInt1681;
		this.anInt2397 = this.aClass11_Sub5_1.anInt1286 - local19 >> arg1.anInt1681;
		this.anInt2398 = this.aClass11_Sub5_1.anInt1286 + local19 >> arg1.anInt1681;
		@Pc(70) int local70 = this.anInt2396 + 1 - this.anInt2395;
		@Pc(79) int local79 = this.anInt2398 + 1 - this.anInt2397;
		this.aFloatArrayArray8 = new float[local70 + 1][local79 + 1];
		this.aFloatArrayArray6 = new float[local70 + 1][local79 + 1];
		this.aFloatArrayArray7 = new float[local70 + 1][local79 + 1];
		@Pc(108) int local108;
		@Pc(120) int local120;
		@Pc(132) int local132;
		@Pc(144) int local144;
		@Pc(172) int local172;
		@Pc(186) int local186;
		for (local108 = 0; local108 <= local79; local108++) {
			local120 = local108 + this.anInt2397;
			if (local120 > 0 && local120 < this.aClass77_Sub1_3.anInt4672 - 1) {
				for (local132 = 0; local132 <= local70; local132++) {
					local144 = this.anInt2395 + local132;
					if (local144 > 0 && this.aClass77_Sub1_3.anInt4673 - 1 > local144) {
						local172 = arg1.method4122(local144 + 1, local120) - arg1.method4122(local144 - 1, local120);
						local186 = arg1.method4122(local144, local120 + 1) - arg1.method4122(local144, local120 - 1);
						@Pc(202) float local202 = (float) (1.0D / Math.sqrt((double) (local172 * local172 + local186 * local186 + 65536)));
						this.aFloatArrayArray7[local132][local108] = local202 * (float) local172;
						this.aFloatArrayArray6[local132][local108] = -256.0F * local202;
						this.aFloatArrayArray8[local132][local108] = (float) local186 * local202;
					}
				}
			}
		}
		local108 = 0;
		local120 = 0;
		for (local132 = this.anInt2397; local132 <= this.anInt2398; local132++) {
			if (local132 >= 0 && arg1.anInt4672 > local132) {
				for (local144 = this.anInt2395; local144 <= this.anInt2396; local144++) {
					if (local144 >= 0 && local144 < arg1.anInt4673) {
						local172 = arg3[local120];
						@Pc(291) int[] local291 = arg1.anIntArrayArrayArray4[local144][local132];
						if (local291 != null && local172 != 0) {
							if (local172 == 1) {
								local108 += local291.length;
							} else {
								local108 += 3;
							}
						}
					}
					local120++;
				}
			} else {
				local120 += this.anInt2396 - this.anInt2395;
			}
		}
		if (local108 > 0) {
			this.aClass11_Sub25_3 = new Class11_Sub25(local108 * 2);
			this.aClass11_Sub25_Sub2_2 = new Class11_Sub25_Sub2(local108 * 16);
			this.aClass58_15 = new Class58(Static90.method4097(local108));
			local120 = 0;
			local132 = 0;
			for (local144 = this.anInt2397; local144 <= this.anInt2398; local144++) {
				if (local144 >= 0 && local144 < arg1.anInt4672) {
					local172 = 0;
					for (local186 = this.anInt2395; local186 <= this.anInt2396; local186++) {
						if (local186 >= 0 && arg1.anInt4673 > local186) {
							@Pc(400) int local400 = arg3[local120];
							@Pc(407) int[] local407 = arg1.anIntArrayArrayArray4[local186][local144];
							@Pc(414) int[] local414 = arg1.anIntArrayArrayArray3[local186][local144];
							if (local407 != null && local400 != 0) {
								if (local400 == 1) {
									for (@Pc(427) int local427 = 0; local427 < local407.length; local427++) {
										this.method2003(local414[local427], local172, local132, local186, local144, local407[local427]);
									}
								} else if (local400 == 3) {
									this.method2003(0, local172, local132, local186, local144, 0);
									this.method2003(0, local172, local132, local186, local144, arg1.anInt1677);
									this.method2003(arg1.anInt1677, local172, local132, local186, local144, 0);
								} else if (local400 == 2) {
									this.method2003(0, local172, local132, local186, local144, arg1.anInt1677);
									this.method2003(arg1.anInt1677, local172, local132, local186, local144, arg1.anInt1677);
									this.method2003(0, local172, local132, local186, local144, 0);
								} else if (local400 == 5) {
									this.method2003(arg1.anInt1677, local172, local132, local186, local144, arg1.anInt1677);
									this.method2003(arg1.anInt1677, local172, local132, local186, local144, 0);
									this.method2003(0, local172, local132, local186, local144, arg1.anInt1677);
								} else if (local400 == 4) {
									this.method2003(arg1.anInt1677, local172, local132, local186, local144, 0);
									this.method2003(0, local172, local132, local186, local144, 0);
									this.method2003(arg1.anInt1677, local172, local132, local186, local144, arg1.anInt1677);
								}
							}
						}
						local120++;
						local172++;
					}
				} else {
					local120 += this.anInt2396 - this.anInt2395;
				}
				local132++;
			}
			this.anInterface5_3 = this.aClass129_Sub2_19.method5060(this.aClass11_Sub25_3.aByteArray93, this.aClass11_Sub25_3.anInt6076, false);
			this.anInterface6_3 = this.aClass129_Sub2_19.method5079(16, this.aClass11_Sub25_Sub2_2.aByteArray93, this.aClass11_Sub25_Sub2_2.anInt6076, false);
			this.aClass160_10 = new Class160(this.aClass129_Sub2_19, this.anInterface6_3, 5126, 3, 0);
			this.aClass160_9 = new Class160(this.aClass129_Sub2_19, this.anInterface6_3, 5121, 4, 12);
		} else {
			this.aClass160_9 = null;
			this.anInterface6_3 = null;
			this.aClass160_10 = null;
			this.anInterface5_3 = null;
		}
		this.aFloatArrayArray7 = this.aFloatArrayArray6 = this.aFloatArrayArray8 = null;
		this.aClass11_Sub25_Sub2_2 = null;
		this.aClass11_Sub25_3 = null;
		this.aClass58_15 = null;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIII[[Z)V")
	public void method2001(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3) {
		if (this.anInterface5_3 == null || (arg2 + arg1 < this.anInt2395 || (arg1 - arg2 > this.anInt2396 || (this.anInt2397 > arg0 + arg2 || arg0 - arg2 > this.anInt2398)))) {
			return;
		}
		for (@Pc(51) int local51 = this.anInt2397; local51 <= this.anInt2398; local51++) {
			for (@Pc(58) int local58 = this.anInt2395; local58 <= this.anInt2396; local58++) {
				@Pc(67) int local67 = local58 - arg1;
				@Pc(71) int local71 = local51 - arg0;
				if (-arg2 < local67 && local67 < arg2 && -arg2 < local71 && local71 < arg2 && arg3[local67 + arg2][local71 + arg2]) {
					this.aClass129_Sub2_19.method5074((int) (this.aClass11_Sub5_1.aFloat9 * 255.0F) << 24);
					this.aClass129_Sub2_19.method5038(this.aClass160_10, null, this.aClass160_9, null);
					this.aClass129_Sub2_19.method5092(this.anInterface5_3, 0, this.anInt2400);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IS)V")
	private void method2002(@OriginalArg(1) short arg0) {
		if (this.aClass129_Sub2_19.aBoolean377) {
			this.aClass11_Sub25_3.method5204(arg0);
		} else {
			this.aClass11_Sub25_3.method5223(arg0);
		}
		this.anInt2400++;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIIII)V")
	private void method2003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) long local1 = -1L;
		@Pc(9) int local9 = (arg3 << this.aClass77_Sub1_3.anInt1681) + arg5;
		@Pc(17) int local17 = (arg4 << this.aClass77_Sub1_3.anInt1681) + arg0;
		@Pc(23) int local23 = this.aClass77_Sub1_3.method4133(local9, local17);
		if ((arg5 & 0x7F) == 0 || (arg0 & 0x7F) == 0) {
			local1 = (long) local9 & 0xFFFFL | ((long) local17 & 0xFFFFL) << 16;
			@Pc(55) Class11 local55 = this.aClass58_15.method1009(local1);
			if (local55 != null) {
				this.method2002(((Class11_Sub18) local55).aShort18);
				return;
			}
		}
		@Pc(77) short local77 = (short) this.anInt2399++;
		if (local1 != -1L) {
			this.aClass58_15.method1006(local1, new Class11_Sub18(local77));
		}
		@Pc(109) float local109;
		@Pc(102) float local102;
		@Pc(116) float local116;
		@Pc(253) float local253;
		@Pc(261) float local261;
		@Pc(268) float local268;
		@Pc(275) float local275;
		@Pc(282) float local282;
		@Pc(291) float local291;
		@Pc(300) float local300;
		@Pc(327) float local327;
		if (arg5 == 0 && arg0 == 0) {
			local102 = this.aFloatArrayArray6[arg1][arg2];
			local109 = this.aFloatArrayArray7[arg1][arg2];
			local116 = this.aFloatArrayArray8[arg1][arg2];
		} else if (arg5 == this.aClass77_Sub1_3.anInt1677 && arg0 == 0) {
			local116 = this.aFloatArrayArray8[arg1 + 1][arg2];
			local109 = this.aFloatArrayArray7[arg1 + 1][arg2];
			local102 = this.aFloatArrayArray6[arg1 + 1][arg2];
		} else if (arg5 == this.aClass77_Sub1_3.anInt1677 && this.aClass77_Sub1_3.anInt1677 == arg0) {
			local102 = this.aFloatArrayArray6[arg1 + 1][arg2 + 1];
			local109 = this.aFloatArrayArray7[arg1 + 1][arg2 + 1];
			local116 = this.aFloatArrayArray8[arg1 + 1][arg2 + 1];
		} else if (arg5 == 0 && this.aClass77_Sub1_3.anInt1677 == arg0) {
			local109 = this.aFloatArrayArray7[arg1][arg2 + 1];
			local116 = this.aFloatArrayArray8[arg1][arg2 + 1];
			local102 = this.aFloatArrayArray6[arg1][arg2 + 1];
		} else {
			local253 = (float) arg5 / (float) this.aClass77_Sub1_3.anInt1677;
			local261 = (float) arg0 / (float) this.aClass77_Sub1_3.anInt1677;
			local268 = this.aFloatArrayArray7[arg1][arg2];
			local275 = this.aFloatArrayArray6[arg1][arg2];
			local282 = this.aFloatArrayArray8[arg1][arg2];
			local291 = this.aFloatArrayArray7[arg1 + 1][arg2];
			local300 = this.aFloatArrayArray6[arg1 + 1][arg2];
			@Pc(318) float local318 = local291 + (this.aFloatArrayArray7[arg1 + 1][arg2 + 1] - local291) * local253;
			local327 = this.aFloatArrayArray8[arg1 + 1][arg2];
			@Pc(342) float local342 = local268 + local253 * (this.aFloatArrayArray7[arg1][arg2 + 1] - local268);
			@Pc(357) float local357 = local282 + (this.aFloatArrayArray8[arg1][arg2 + 1] - local282) * local253;
			@Pc(375) float local375 = local300 + (this.aFloatArrayArray6[arg1 + 1][arg2 + 1] - local300) * local253;
			@Pc(390) float local390 = local275 + local253 * (this.aFloatArrayArray6[arg1][arg2 + 1] - local275);
			@Pc(408) float local408 = local327 + (this.aFloatArrayArray8[arg1 + 1][arg2 + 1] - local327) * local253;
			local109 = local342 + (local318 - local342) * local261;
			local102 = local390 + local261 * (local375 - local390);
			local116 = local357 + (local408 - local357) * local261;
		}
		local253 = this.aClass11_Sub5_1.anInt1285 - local9;
		local261 = this.aClass11_Sub5_1.anInt1287 - local23;
		local268 = this.aClass11_Sub5_1.anInt1286 - local17;
		local275 = (float) Math.sqrt((double) (local268 * local268 + local253 * local253 + local261 * local261));
		local282 = 1.0F / local275;
		local253 *= local282;
		local261 *= local282;
		local268 *= local282;
		local291 = local275 / (float) this.aClass11_Sub5_1.anInt1289;
		local300 = 1.0F - local291 * local291;
		if (local300 < 0.0F) {
			local300 = 0.0F;
		}
		local327 = local116 * local268 + local261 * local102 + local109 * local253;
		if (local327 < 0.0F) {
			local327 = 0.0F;
		}
		@Pc(533) float local533 = local300 * 2.0F * local327;
		if (local533 > 1.0F) {
			local533 = 1.0F;
		}
		@Pc(544) int local544 = this.aClass11_Sub5_1.anInt1290;
		@Pc(554) int local554 = (int) (local533 * (float) (local544 >> 16 & 0xFF));
		if (local554 > 255) {
			local554 = 255;
		}
		@Pc(572) int local572 = (int) ((float) (local544 >> 8 & 0xFF) * local533);
		if (local572 > 255) {
			local572 = 255;
		}
		@Pc(585) int local585 = (int) (local533 * (float) (local544 & 0xFF));
		if (local585 > 255) {
			local585 = 255;
		}
		if (this.aClass129_Sub2_19.aBoolean377) {
			this.aClass11_Sub25_Sub2_2.method5228((float) local9);
			this.aClass11_Sub25_Sub2_2.method5228((float) local23);
			this.aClass11_Sub25_Sub2_2.method5228((float) local17);
		} else {
			this.aClass11_Sub25_Sub2_2.method5229((float) local9);
			this.aClass11_Sub25_Sub2_2.method5229((float) local23);
			this.aClass11_Sub25_Sub2_2.method5229((float) local17);
		}
		this.aClass11_Sub25_Sub2_2.method5186(local554);
		this.aClass11_Sub25_Sub2_2.method5186(local572);
		this.aClass11_Sub25_Sub2_2.method5186(local585);
		this.aClass11_Sub25_Sub2_2.method5186(255);
		this.method2002(local77);
	}
}
