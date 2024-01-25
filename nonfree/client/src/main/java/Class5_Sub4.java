import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aq")
public final class Class5_Sub4 extends Class5 {

	@OriginalMember(owner = "client!aq", name = "A", descriptor = "I")
	private int anInt338;

	@OriginalMember(owner = "client!aq", name = "o", descriptor = "Lclient!vha;")
	private final Class61_Sub3 aClass61_Sub3_1;

	@OriginalMember(owner = "client!aq", name = "v", descriptor = "Lclient!vt;")
	private final Class5_Sub11 aClass5_Sub11_1;

	@OriginalMember(owner = "client!aq", name = "r", descriptor = "Lclient!pj;")
	private final Class133_Sub1 aClass133_Sub1_1;

	@OriginalMember(owner = "client!aq", name = "l", descriptor = "I")
	private final int anInt334;

	@OriginalMember(owner = "client!aq", name = "q", descriptor = "I")
	private final int anInt336;

	@OriginalMember(owner = "client!aq", name = "s", descriptor = "I")
	private final int anInt337;

	@OriginalMember(owner = "client!aq", name = "F", descriptor = "I")
	private final int anInt342;

	@OriginalMember(owner = "client!aq", name = "p", descriptor = "[[F")
	private float[][] aFloatArrayArray1;

	@OriginalMember(owner = "client!aq", name = "w", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!aq", name = "y", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!aq", name = "B", descriptor = "I")
	private int anInt339;

	@OriginalMember(owner = "client!aq", name = "t", descriptor = "Lclient!pl;")
	private Class273 aClass273_1;

	@OriginalMember(owner = "client!aq", name = "G", descriptor = "Lclient!oq;")
	private final Interface14 anInterface14_1;

	@OriginalMember(owner = "client!aq", name = "m", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream1;

	@OriginalMember(owner = "client!aq", name = "u", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream2;

	@OriginalMember(owner = "client!aq", name = "x", descriptor = "Lclient!fb;")
	private final Interface6 anInterface6_1;

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(Lclient!pj;Lclient!vha;Lclient!vt;[I)V")
	public Class5_Sub4(@OriginalArg(0) Class133_Sub1 arg0, @OriginalArg(1) Class61_Sub3 arg1, @OriginalArg(2) Class5_Sub11 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass61_Sub3_1 = arg1;
		this.aClass5_Sub11_1 = arg2;
		this.aClass133_Sub1_1 = arg0;
		@Pc(22) int local22 = this.aClass5_Sub11_1.method8099() - (arg1.anInt10027 >> 1);
		this.anInt334 = this.aClass5_Sub11_1.method8103() - local22 >> arg1.anInt10031;
		this.anInt336 = this.aClass5_Sub11_1.method8103() + local22 >> arg1.anInt10031;
		this.anInt337 = this.aClass5_Sub11_1.method8098() - local22 >> arg1.anInt10031;
		this.anInt342 = local22 + this.aClass5_Sub11_1.method8098() >> arg1.anInt10031;
		@Pc(78) int local78 = this.anInt336 + 1 - this.anInt334;
		@Pc(87) int local87 = this.anInt342 + 1 - this.anInt337;
		this.aFloatArrayArray1 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray2 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray3 = new float[local78 + 1][local87 + 1];
		@Pc(123) int local123;
		@Pc(134) int local134;
		@Pc(141) int local141;
		@Pc(174) int local174;
		@Pc(190) int local190;
		for (@Pc(116) int local116 = 0; local116 <= local87; local116++) {
			local123 = this.anInt337 + local116;
			if (local123 > 0 && this.aClass61_Sub3_1.anInt10029 - 1 > local123) {
				for (local134 = 0; local134 <= local78; local134++) {
					local141 = this.anInt334 + local134;
					if (local141 > 0 && this.aClass61_Sub3_1.anInt10026 - 1 > local141) {
						local174 = arg1.method8580(local123, local141 + 1) - arg1.method8580(local123, local141 - 1);
						local190 = arg1.method8580(local123 + 1, local141) - arg1.method8580(local123 - 1, local141);
						@Pc(205) float local205 = (float) (1.0D / Math.sqrt((double) (local190 * local190 + local174 * local174 + 65536)));
						this.aFloatArrayArray2[local134][local116] = local205 * (float) local174;
						this.aFloatArrayArray3[local134][local116] = local205 * -256.0F;
						this.aFloatArrayArray1[local134][local116] = (float) local190 * local205;
					}
				}
			}
		}
		local123 = 0;
		@Pc(308) int local308;
		for (local134 = this.anInt337; local134 <= this.anInt342; local134++) {
			if (local134 >= 0 && arg1.anInt10029 > local134) {
				for (local141 = this.anInt334; local141 <= this.anInt336; local141++) {
					if (local141 >= 0 && local141 < arg1.anInt10026) {
						local174 = arg3[local123];
						@Pc(299) int[] local299 = arg1.anIntArrayArrayArray15[local141][local134];
						if (local299 != null && local174 != 0) {
							if (local174 == 1) {
								local308 = 0;
								while (local308 < local299.length) {
									if (local299[local308++] != -1 && local299[local308++] != -1 && local299[local308++] != -1) {
										this.anInt339 += 3;
									}
								}
							} else {
								this.anInt339 += 3;
							}
						}
					}
					local123++;
				}
			} else {
				local123 += this.anInt336 - this.anInt334;
			}
		}
		if (this.anInt339 > 0) {
			this.aClass273_1 = new Class273(Static613.method8740(this.anInt339));
			this.anInterface14_1 = this.aClass133_Sub1_1.method6281(false);
			this.anInterface14_1.method6764(this.anInt339);
			@Pc(395) NativeHeapBuffer local395 = this.aClass133_Sub1_1.method6280(false, this.anInt339 * 16);
			this.aStream1 = new Stream(local395);
			while (true) {
				@Pc(407) Buffer local407;
				do {
					local407 = this.anInterface14_1.method6770();
				} while (local407 == null);
				this.aStream2 = new Stream(local407);
				local123 = 0;
				local190 = 0;
				for (local308 = this.anInt337; local308 <= this.anInt342; local308++) {
					if (local308 >= 0 && arg1.anInt10029 > local308) {
						@Pc(446) int local446 = 0;
						for (@Pc(449) int local449 = this.anInt334; local449 <= this.anInt336; local449++) {
							if (local449 >= 0 && arg1.anInt10026 > local449) {
								@Pc(465) int local465 = arg3[local123];
								@Pc(472) int[] local472 = arg1.anIntArrayArrayArray15[local449][local308];
								if (local472 != null && local465 != 0) {
									if (local465 == 1) {
										@Pc(491) int[] local491 = arg1.anIntArrayArrayArray18[local449][local308];
										@Pc(498) int[] local498 = arg1.anIntArrayArrayArray17[local449][local308];
										@Pc(500) int local500 = 0;
										label118: while (true) {
											while (true) {
												if (local500 >= local472.length) {
													break label118;
												}
												if (local472[local500] == -1 || local472[local500 + 1] == -1 || local472[local500 + 2] == -1) {
													local500 += 3;
												} else {
													this.method295(local449, local446, local308, local190, local498[local500], local491[local500]);
													local500++;
													this.method295(local449, local446, local308, local190, local498[local500], local491[local500]);
													local500++;
													this.method295(local449, local446, local308, local190, local498[local500], local491[local500]);
													local500++;
												}
											}
										}
									} else if (local465 == 3) {
										this.method295(local449, local446, local308, local190, 0, 0);
										this.method295(local449, local446, local308, local190, 0, arg1.anInt10027);
										this.method295(local449, local446, local308, local190, arg1.anInt10027, 0);
									} else if (local465 == 2) {
										this.method295(local449, local446, local308, local190, 0, arg1.anInt10027);
										this.method295(local449, local446, local308, local190, arg1.anInt10027, arg1.anInt10027);
										this.method295(local449, local446, local308, local190, 0, 0);
									} else if (local465 == 5) {
										this.method295(local449, local446, local308, local190, arg1.anInt10027, arg1.anInt10027);
										this.method295(local449, local446, local308, local190, arg1.anInt10027, 0);
										this.method295(local449, local446, local308, local190, 0, arg1.anInt10027);
									} else if (local465 == 4) {
										this.method295(local449, local446, local308, local190, arg1.anInt10027, 0);
										this.method295(local449, local446, local308, local190, 0, 0);
										this.method295(local449, local446, local308, local190, arg1.anInt10027, arg1.anInt10027);
									}
								}
							}
							local446++;
							local123++;
						}
					} else {
						local123 += this.anInt336 - this.anInt334;
					}
					local190++;
				}
				this.aStream2.b();
				if (this.anInterface14_1.method6769()) {
					this.aStream1.b();
					this.anInterface6_1 = this.aClass133_Sub1_1.method6196(false);
					this.anInterface6_1.method4125(local395, 16, this.anInt338 * 16);
					break;
				}
				this.aStream1.c(0);
				this.aClass273_1.method6586();
			}
		} else {
			this.anInterface6_1 = null;
			this.anInterface14_1 = null;
		}
		this.aStream1 = null;
		this.aFloatArrayArray2 = this.aFloatArrayArray3 = this.aFloatArrayArray1 = null;
		this.aClass273_1 = null;
		this.aStream2 = null;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIIBI)V")
	private void method295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = arg5 + (arg0 << this.aClass61_Sub3_1.anInt10031);
		@Pc(24) int local24 = arg4 + (arg2 << this.aClass61_Sub3_1.anInt10031);
		@Pc(33) int local33 = this.aClass61_Sub3_1.method8584(local24, local15);
		if ((arg5 & 0x7F) == 0 || (arg4 & 0x7F) == 0) {
			local7 = ((long) local24 & 0xFFFFL) << 16 | (long) local15 & 0xFFFFL;
			@Pc(62) Class5 local62 = this.aClass273_1.method6581(local7);
			if (local62 != null) {
				this.method297(((Class5_Sub12) local62).aShort32);
				return;
			}
		}
		@Pc(80) short local80 = (short) this.anInt338++;
		if (local7 != -1L) {
			this.aClass273_1.method6585(local7, new Class5_Sub12(local80));
		}
		@Pc(139) float local139;
		@Pc(130) float local130;
		@Pc(148) float local148;
		@Pc(239) float local239;
		@Pc(247) float local247;
		@Pc(254) float local254;
		@Pc(261) float local261;
		@Pc(268) float local268;
		@Pc(277) float local277;
		@Pc(286) float local286;
		@Pc(331) float local331;
		if (arg5 == 0 && arg4 == 0) {
			local148 = this.aFloatArrayArray1[arg1][arg3];
			local130 = this.aFloatArrayArray3[arg1][arg3];
			local139 = this.aFloatArrayArray2[arg1][arg3];
		} else if (arg5 == this.aClass61_Sub3_1.anInt10027 && arg4 == 0) {
			local130 = this.aFloatArrayArray3[arg1 + 1][arg3];
			local139 = this.aFloatArrayArray2[arg1 + 1][arg3];
			local148 = this.aFloatArrayArray1[arg1 + 1][arg3];
		} else if (arg5 == this.aClass61_Sub3_1.anInt10027 && this.aClass61_Sub3_1.anInt10027 == arg4) {
			local139 = this.aFloatArrayArray2[arg1 + 1][arg3 + 1];
			local148 = this.aFloatArrayArray1[arg1 + 1][arg3 + 1];
			local130 = this.aFloatArrayArray3[arg1 + 1][arg3 + 1];
		} else if (arg5 == 0 && this.aClass61_Sub3_1.anInt10027 == arg4) {
			local148 = this.aFloatArrayArray1[arg1][arg3 + 1];
			local139 = this.aFloatArrayArray2[arg1][arg3 + 1];
			local130 = this.aFloatArrayArray3[arg1][arg3 + 1];
		} else {
			local239 = (float) arg5 / (float) this.aClass61_Sub3_1.anInt10027;
			local247 = (float) arg4 / (float) this.aClass61_Sub3_1.anInt10027;
			local254 = this.aFloatArrayArray2[arg1][arg3];
			local261 = this.aFloatArrayArray3[arg1][arg3];
			local268 = this.aFloatArrayArray1[arg1][arg3];
			local277 = this.aFloatArrayArray2[arg1 + 1][arg3];
			local286 = this.aFloatArrayArray3[arg1 + 1][arg3];
			@Pc(304) float local304 = local277 + local239 * (this.aFloatArrayArray2[arg1 + 1][arg3 + 1] - local277);
			@Pc(322) float local322 = local286 + local239 * (this.aFloatArrayArray3[arg1 + 1][arg3 + 1] - local286);
			local331 = this.aFloatArrayArray1[arg1 + 1][arg3];
			@Pc(346) float local346 = local254 + (this.aFloatArrayArray2[arg1][arg3 + 1] - local254) * local239;
			@Pc(361) float local361 = local261 + local239 * (this.aFloatArrayArray3[arg1][arg3 + 1] - local261);
			@Pc(376) float local376 = local268 + local239 * (this.aFloatArrayArray1[arg1][arg3 + 1] - local268);
			local130 = local361 + (local322 - local361) * local247;
			local139 = (local304 - local346) * local247 + local346;
			@Pc(409) float local409 = local331 + local239 * (this.aFloatArrayArray1[arg1 + 1][arg3 + 1] - local331);
			local148 = local247 * (local409 - local376) + local376;
		}
		local239 = this.aClass5_Sub11_1.method8103() - local15;
		local247 = this.aClass5_Sub11_1.method8096() - local33;
		local254 = this.aClass5_Sub11_1.method8098() - local24;
		local261 = (float) Math.sqrt((double) (local239 * local239 + local247 * local247 + local254 * local254));
		local268 = 1.0F / local261;
		local239 *= local268;
		local254 *= local268;
		local247 *= local268;
		local277 = local261 / (float) this.aClass5_Sub11_1.method8099();
		local286 = 1.0F - local277 * local277;
		if (local286 < 0.0F) {
			local286 = 0.0F;
		}
		local331 = local239 * local139 + local247 * local130 + local148 * local254;
		if (local331 < 0.0F) {
			local331 = 0.0F;
		}
		@Pc(552) float local552 = local331 * local286 * 2.0F;
		if (local552 > 1.0F) {
			local552 = 1.0F;
		}
		@Pc(563) int local563 = this.aClass5_Sub11_1.method8102();
		@Pc(573) int local573 = (int) (local552 * (float) (local563 >> 16 & 0xFF));
		if (local573 > 255) {
			local573 = 255;
		}
		@Pc(588) int local588 = (int) (local552 * (float) (local563 >> 8 & 0xFF));
		if (local588 > 255) {
			local588 = 255;
		}
		@Pc(603) int local603 = (int) (local552 * (float) (local563 & 0xFF));
		if (local603 > 255) {
			local603 = 255;
		}
		if (Stream.a()) {
			this.aStream1.a((float) local15);
			this.aStream1.a((float) local33);
			this.aStream1.a((float) local24);
		} else {
			this.aStream1.b((float) local15);
			this.aStream1.b((float) local33);
			this.aStream1.b((float) local24);
		}
		if (this.aClass133_Sub1_1.anInt7000 == 0) {
			this.aStream1.a(local603);
			this.aStream1.a(local588);
			this.aStream1.a(local573);
		} else {
			this.aStream1.a(local573);
			this.aStream1.a(local588);
			this.aStream1.a(local603);
		}
		this.aStream1.a(255);
		this.method297(local80);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(III[[ZI)V")
	public void method296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3) {
		if (this.anInterface14_1 == null || (this.anInt334 > arg2 + arg0 || (arg0 - arg2 > this.anInt336 || (this.anInt337 > arg2 + arg1 || arg1 - arg2 > this.anInt342)))) {
			return;
		}
		for (@Pc(51) int local51 = this.anInt337; local51 <= this.anInt342; local51++) {
			for (@Pc(56) int local56 = this.anInt334; local56 <= this.anInt336; local56++) {
				@Pc(63) int local63 = local56 - arg0;
				@Pc(68) int local68 = local51 - arg1;
				if (-arg2 < local63 && local63 < arg2 && -arg2 < local68 && local68 < arg2 && arg3[arg2 + local63][arg2 + local68]) {
					this.aClass133_Sub1_1.method6195((byte) (this.aClass5_Sub11_1.method8101() * 255.0F));
					this.aClass133_Sub1_1.method6215(this.anInterface6_1, 0);
					this.aClass133_Sub1_1.method6217(this.aClass133_Sub1_1.aClass90_15);
					this.aClass133_Sub1_1.method6194(this.anInt339 / 3, this.anInt338, 0, this.anInterface14_1, 0, Static68.aClass303_2);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(SB)V")
	private void method297(@OriginalArg(0) short arg0) {
		if (Stream.a()) {
			this.aStream2.f(arg0);
		} else {
			this.aStream2.e(arg0);
		}
	}
}
