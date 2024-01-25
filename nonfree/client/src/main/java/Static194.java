import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!lb", name = "M", descriptor = "Lclient!sm;")
	public static final Class210 aClass210_26 = new Class210();

	@OriginalMember(owner = "client!lb", name = "S", descriptor = "I")
	public static int anInt3430 = 0;

	@OriginalMember(owner = "client!lb", name = "eb", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!lb", name = "fb", descriptor = "I")
	public static int anInt3441 = -1;

	@OriginalMember(owner = "client!lb", name = "hb", descriptor = "J")
	public static long aLong113 = 0L;

	@OriginalMember(owner = "client!lb", name = "ib", descriptor = "Z")
	public static boolean aBoolean254 = true;

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(IB)V")
	public static void method3167(@OriginalArg(0) int arg0) {
		@Pc(16) Class2_Sub1_Sub2 local16 = Static323.method4982(arg0, 7);
		local16.method412();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIIB)V")
	public static void method3168(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		@Pc(7) int local7 = Static168.anInt3003;
		@Pc(9) int[] local9 = Static7.anIntArray24;
		Static338.anInt5999 = 0;
		@Pc(22) byte local22 = Static292.method4434() == 2 ? (byte) Static47.anInt936 : 1;
		@Pc(82) int local82;
		@Pc(87) int local87;
		@Pc(274) int local274;
		@Pc(451) int local451;
		@Pc(573) int local573;
		@Pc(323) int local323;
		@Pc(688) int local688;
		@Pc(508) int local508;
		label434: for (@Pc(24) int local24 = 0; local24 < local7 + Static199.anInt3672; local24++) {
			@Pc(28) Class240 local28 = null;
			@Pc(44) Class12_Sub1_Sub2 local44;
			if (local7 <= local24) {
				local44 = Static107.aClass12_Sub1_Sub2_Sub1Array1[Static346.anIntArray730[local24 - local7]];
				local28 = ((Class12_Sub1_Sub2_Sub1) local44).aClass240_1;
				if (local28.anIntArray781 != null) {
					local28 = local28.method5567(Static248.aClass125_1);
					if (local28 == null) {
						continue;
					}
				}
			} else {
				local44 = Static90.aClass12_Sub1_Sub2_Sub2Array1[local9[local24]];
			}
			if (local44.anInt5361 >= 0) {
				if (Static75.aByteArrayArrayArray5 != null && local44.aByte74 > Static267.aClass12_Sub1_Sub2_Sub2_1.aByte74) {
					for (local82 = local44.aShort97; local82 <= local44.aShort96; local82++) {
						for (local87 = local44.aShort94; local87 <= local44.aShort95; local87++) {
							if (local22 == Static75.aByteArrayArrayArray5[local44.aByte74][local82][local87]) {
								continue label434;
							}
						}
					}
				}
				Static243.method3900(local44, local44.method4709(), arg1 >> 1, arg2 >> 1);
				if (Static136.anIntArray287[0] >= 0) {
					if (local44.aString50 != null && (local7 <= local24 || Static160.anInt2918 == 0 || Static160.anInt2918 == 3 || Static160.anInt2918 == 1 && Static326.method5042(((Class12_Sub1_Sub2_Sub2) local44).aString51)) && Static338.anInt5999 < Static276.anInt4915) {
						Static276.anIntArray606[Static338.anInt5999] = Static60.aClass216_3.method5073(local44.aString50) / 2;
						Static276.anIntArray608[Static338.anInt5999] = Static136.anIntArray287[0];
						Static276.anIntArray605[Static338.anInt5999] = Static136.anIntArray287[1];
						Static276.anIntArray609[Static338.anInt5999] = local44.anInt5329;
						Static276.anIntArray607[Static338.anInt5999] = local44.anInt5350;
						Static276.anIntArray604[Static338.anInt5999] = local44.anInt5335;
						Static276.aStringArray31[Static338.anInt5999] = local44.aString50;
						Static338.anInt5999++;
					}
					@Pc(215) Class5 local215 = Static124.aClass5Array18[0];
					local87 = Static136.anIntArray287[1] + arg3 - Math.max(Static60.aClass216_3.anInt5799, local215.method4999());
					@Pc(242) Class5 local242;
					@Pc(335) int local335;
					if (!local44.aBoolean421 && Static295.anInt5281 < local44.anInt5322) {
						local242 = Static124.aClass5Array18[1];
						if (local44 instanceof Class12_Sub1_Sub2_Sub1) {
							@Pc(248) Class12_Sub1_Sub2_Sub1 local248 = (Class12_Sub1_Sub2_Sub1) local44;
							@Pc(257) Class5[] local257 = (Class5[]) Static142.aClass154_24.method3751((long) local248.aClass240_1.anInt6463);
							if (local257 == null) {
								@Pc(266) Class224[] local266 = Static404.method5314(Static119.aClass71_25, local248.aClass240_1.anInt6463);
								if (local266 != null) {
									local257 = new Class5[local266.length];
									for (local274 = 0; local274 < local266.length; local274++) {
										local257[local274] = Static304.aClass82_4.method4514(local266[local274]);
									}
									Static142.aClass154_24.method3745((long) local248.aClass240_1.anInt6463, local257);
								}
							}
							if (local257 != null && local257.length == 2) {
								local242 = local257[1];
								local215 = local257[0];
							}
						}
						local323 = arg0 + Static136.anIntArray287[0] - (local215.method5002() >> 1);
						local215.method5004(local323, local87);
						local335 = local215.method5002() * local44.anInt5360 / 255;
						if (local44.anInt5360 > 0 && local335 < 2) {
							local335 = 2;
						}
						Static304.aClass82_4.method4542(local323, local87, local323 + local335, local215.method4999() + local87);
						local242.method5004(local323, local87);
						Static304.aClass82_4.method4477(arg0, arg3, arg0 + arg1, arg2 + arg3);
					}
					local87 -= 2;
					if (!local44.aBoolean421) {
						if (local44.anInt5319 > Static295.anInt5281) {
							local242 = Static61.aClass5Array4[local44.aBoolean420 ? 2 : 0];
							@Pc(401) Class5 local401 = Static61.aClass5Array4[local44.aBoolean420 ? 3 : 1];
							if (local44 instanceof Class12_Sub1_Sub2_Sub1) {
								local335 = local28.anInt6486;
								if (local335 == -1) {
									local335 = local44.method4711().anInt4534;
								}
							} else {
								local335 = local44.method4711().anInt4534;
							}
							if (local335 != -1) {
								@Pc(436) Class5[] local436 = (Class5[]) Static195.aClass154_25.method3751((long) local335);
								if (local436 == null) {
									@Pc(443) Class224[] local443 = Static404.method5314(Static119.aClass71_25, local335);
									if (local443 != null) {
										local436 = new Class5[local443.length];
										for (local451 = 0; local451 < local443.length; local451++) {
											local436[local451] = Static304.aClass82_4.method4514(local443[local451]);
										}
										Static195.aClass154_25.method3745((long) local335, local436);
									}
								}
								if (local436 != null && local436.length == 4) {
									local401 = local436[local44.aBoolean420 ? 3 : 1];
									local242 = local436[local44.aBoolean420 ? 2 : 0];
								}
							}
							local508 = local44.anInt5319 - Static295.anInt5281;
							if (local44.anInt5320 >= local508) {
								local274 = local242.method5002();
							} else {
								local508 -= local44.anInt5320;
								local451 = local44.anInt5373 == 0 ? 0 : local44.anInt5373 * ((local44.anInt5359 - local508) / local44.anInt5373);
								local274 = local242.method5002() * local451 / local44.anInt5359;
							}
							local451 = local242.method4999();
							local87 -= local451;
							local573 = arg0 + Static136.anIntArray287[0] - (local242.method5002() >> 1);
							local242.method5004(local573, local87);
							Static304.aClass82_4.method4542(local573, local87, local573 + local274, local451 + local87);
							local401.method5004(local573, local87);
							local87 -= 2;
							Static304.aClass82_4.method4477(arg0, arg3, arg1 + arg0, arg2 + arg3);
						}
						if (local24 < local7) {
							@Pc(643) Class12_Sub1_Sub2_Sub2 local643 = (Class12_Sub1_Sub2_Sub2) local44;
							if (local643.anInt5389 != -1) {
								local87 -= 25;
								Static85.aClass5Array6[local643.anInt5389].method5004(arg0 + Static136.anIntArray287[0] - 12, local87);
								local87 -= 2;
							}
							if (local643.anInt5398 != -1) {
								local87 -= 25;
								Static190.aClass5Array9[local643.anInt5398].method5004(Static136.anIntArray287[0] + arg0 - 12, local87);
								local87 -= 2;
							}
						} else if (local28.anInt6493 >= 0 && Static190.aClass5Array9.length > local28.anInt6493) {
							local87 -= 25;
							local242 = Static190.aClass5Array9[local28.anInt6493];
							local242.method5004(arg0 + Static136.anIntArray287[0] - (local242.method5002() >> 1), local87);
							local87 -= 2;
						}
					}
					@Pc(690) Class97[] local690;
					@Pc(698) Class97 local698;
					@Pc(722) Class5 local722;
					if (!(local44 instanceof Class12_Sub1_Sub2_Sub2)) {
						local688 = 0;
						local690 = Static239.aClass97Array1;
						for (local335 = 0; local335 < local690.length; local335++) {
							local698 = local690[local335];
							if (local698 != null && local698.anInt2442 == 1 && Static346.anIntArray730[local24 - local7] == local698.anInt2444) {
								local722 = Static275.aClass5Array14[local698.anInt2456];
								if (local688 < local722.method4999()) {
									local688 = local722.method4999();
								}
								if (Static295.anInt5281 % 20 < 10) {
									local722.method5004(Static136.anIntArray287[0] + arg0 - 12, local87 + -local722.method4999());
								}
							}
						}
						if (local688 > 0) {
						}
					} else if (local24 >= 0) {
						local688 = 0;
						local690 = Static239.aClass97Array1;
						for (local335 = 0; local335 < local690.length; local335++) {
							local698 = local690[local335];
							if (local698 != null && local698.anInt2442 == 10 && local9[local24] == local698.anInt2444) {
								local722 = Static275.aClass5Array14[local698.anInt2456];
								if (local722.method4999() > local688) {
									local688 = local722.method4999();
								}
								local722.method5004(Static136.anIntArray287[0] + arg0 - 12, -local722.method4999() + local87);
							}
						}
						if (local688 > 0) {
						}
					}
					for (local688 = 0; local688 < 4; local688++) {
						if (Static295.anInt5281 < local44.anIntArray656[local688]) {
							local323 = local44.method4709() / 2;
							Static243.method3900(local44, local323, arg1 >> 1, arg2 >> 1);
							if (Static136.anIntArray287[0] > -1) {
								if (local688 == 1) {
									Static136.anIntArray287[1] -= 20;
								}
								if (local688 == 2) {
									Static136.anIntArray287[0] -= 15;
									Static136.anIntArray287[1] -= 10;
								}
								if (local688 == 3) {
									Static136.anIntArray287[1] -= 10;
									Static136.anIntArray287[0] += 15;
								}
								Static356.aClass5Array17[local44.anIntArray657[local688]].method5004(arg0 + Static136.anIntArray287[0] - 12, Static136.anIntArray287[1] + arg3 + -12);
								Static91.aClass13_2.method5617(Static136.anIntArray287[0] + arg0 - 1, -1, 0, Integer.toString(local44.anIntArray655[local688]), Static136.anIntArray287[1] + arg3 + 3);
							}
						}
					}
				}
			}
		}
		@Pc(991) int local991;
		for (@Pc(985) int local985 = 0; local985 < Static306.anInt5453; local985++) {
			local991 = Static193.anIntArray806[local985];
			@Pc(1000) Class12_Sub1_Sub2 local1000;
			if (local991 < 2048) {
				local1000 = Static90.aClass12_Sub1_Sub2_Sub2Array1[local991];
			} else {
				local1000 = Static107.aClass12_Sub1_Sub2_Sub1Array1[local991 - 2048];
			}
			local87 = Static116.anIntArray257[local985];
			@Pc(1021) Class12_Sub1_Sub2 local1021;
			if (local87 < 2048) {
				local1021 = Static90.aClass12_Sub1_Sub2_Sub2Array1[local87];
			} else {
				local1021 = Static107.aClass12_Sub1_Sub2_Sub1Array1[local87 - 2048];
			}
			Static300.method4719(arg0, --local1000.anInt5333, local1021, arg3, arg2, local1000, arg1);
		}
		local991 = Static60.aClass216_3.anInt5799 + Static60.aClass216_3.anInt5794 + 2;
		for (local82 = 0; local82 < Static338.anInt5999; local82++) {
			local87 = Static276.anIntArray608[local82];
			local688 = Static276.anIntArray605[local82];
			local323 = Static276.anIntArray606[local82];
			@Pc(1081) boolean local1081 = true;
			while (local1081) {
				local1081 = false;
				for (local508 = 0; local508 < local82; local508++) {
					if (Static276.anIntArray605[local508] - local991 < local688 + 2 && local688 - local991 < Static276.anIntArray605[local508] + 2 && Static276.anIntArray606[local508] + Static276.anIntArray608[local508] > -local323 + local87 && Static276.anIntArray608[local508] - Static276.anIntArray606[local508] < local87 - -local323 && local688 > Static276.anIntArray605[local508] - local991) {
						local1081 = true;
						local688 = Static276.anIntArray605[local508] - local991;
					}
				}
			}
			Static276.anIntArray605[local82] = local688;
			@Pc(1179) String local1179 = Static276.aStringArray31[local82];
			if (Static356.anInt6258 == 0) {
				local274 = 16776960;
				if (Static276.anIntArray609[local82] < 6) {
					local274 = Static360.anIntArray765[Static276.anIntArray609[local82]];
				}
				if (Static276.anIntArray609[local82] == 6) {
					local274 = Static47.anInt936 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static276.anIntArray609[local82] == 7) {
					local274 = Static47.anInt936 % 20 < 10 ? 255 : 65535;
				}
				if (Static276.anIntArray609[local82] == 8) {
					local274 = Static47.anInt936 % 20 < 10 ? 45056 : 8454016;
				}
				if (Static276.anIntArray609[local82] == 9) {
					local451 = 150 - Static276.anIntArray604[local82];
					if (local451 < 50) {
						local274 = local451 * 1280 + 16711680;
					} else if (local451 < 100) {
						local274 = 16384000 + 16776960 - local451 * 327680;
					} else if (local451 < 150) {
						local274 = (local451 - 100) * 5 + 65280;
					}
				}
				if (Static276.anIntArray609[local82] == 10) {
					local451 = 150 - Static276.anIntArray604[local82];
					if (local451 < 50) {
						local274 = local451 * 5 + 16711680;
					} else if (local451 < 100) {
						local274 = 16711935 - (local451 - 50) * 327680;
					} else if (local451 < 150) {
						local274 = local451 * 327680 + 255 - (local451 - 100) * 5 - 32768000;
					}
				}
				if (Static276.anIntArray609[local82] == 11) {
					local451 = 150 - Static276.anIntArray604[local82];
					if (local451 < 50) {
						local274 = 16777215 - local451 * 327685;
					} else if (local451 < 100) {
						local274 = local451 * 327685 + 65280 - 16384250;
					} else if (local451 < 150) {
						local274 = 49545215 - local451 * 327680;
					}
				}
				local451 = local274 | 0xFF000000;
				if (Static276.anIntArray607[local82] == 0) {
					Static34.aClass13_1.method5617(arg0 + local87, local451, -16777216, local1179, arg3 + local688);
				}
				if (Static276.anIntArray607[local82] == 1) {
					Static34.aClass13_1.method5622(arg3 + local688, local451, local1179, arg0 + local87, Static47.anInt936);
				}
				if (Static276.anIntArray607[local82] == 2) {
					Static34.aClass13_1.method5613(local1179, arg0 + local87, local688 + arg3, Static47.anInt936, local451);
				}
				if (Static276.anIntArray607[local82] == 3) {
					Static34.aClass13_1.method5608(local1179, local688 + arg3, local451, arg0 + local87, Static47.anInt936, 150 - Static276.anIntArray604[local82]);
				}
				if (Static276.anIntArray607[local82] == 4) {
					local573 = (150 - Static276.anIntArray604[local82]) * (Static60.aClass216_3.method5073(local1179) - -100) / 150;
					Static304.aClass82_4.method4542(arg0 + local87 - 50, arg3, arg0 + local87 + 50, arg2 + arg3);
					Static34.aClass13_1.method5602(local688 + arg3, local1179, local451, -16777216, local87 + arg0 + 50 - local573);
					Static304.aClass82_4.method4477(arg0, arg3, arg0 + arg1, arg3 + arg2);
				}
				if (Static276.anIntArray607[local82] == 5) {
					local573 = 150 - Static276.anIntArray604[local82];
					@Pc(1586) int local1586 = 0;
					if (local573 < 25) {
						local1586 = local573 - 25;
					} else if (local573 > 125) {
						local1586 = local573 - 125;
					}
					@Pc(1610) int local1610 = Static60.aClass216_3.anInt5794 + Static60.aClass216_3.anInt5799;
					Static304.aClass82_4.method4542(arg0, arg3 + local688 - local1610 - 1, arg0 + arg1, arg3 + local688 + 5);
					Static34.aClass13_1.method5617(local87 + arg0, local451, -16777216, local1179, arg3 + local688 + local1586);
					Static304.aClass82_4.method4477(arg0, arg3, arg1 + arg0, arg3 - -arg2);
				}
			} else {
				Static34.aClass13_1.method5617(arg0 + local87, -256, -16777216, local1179, local688 + arg3);
			}
		}
	}
}
