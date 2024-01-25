import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!jv", name = "X", descriptor = "[Lclient!o;")
	public static Class169[] aClass169Array1;

	@OriginalMember(owner = "client!jv", name = "Z", descriptor = "Lclient!ns;")
	public static Class166 aClass166_144;

	@OriginalMember(owner = "client!jv", name = "gb", descriptor = "Lclient!oa;")
	public static Class105 aClass105_2;

	@OriginalMember(owner = "client!jv", name = "bb", descriptor = "I")
	public static int anInt3844 = 0;

	@OriginalMember(owner = "client!jv", name = "db", descriptor = "I")
	public static int anInt3846 = 0;

	@OriginalMember(owner = "client!jv", name = "eb", descriptor = "I")
	public static int anInt3847 = 765;

	@OriginalMember(owner = "client!jv", name = "fb", descriptor = "Z")
	public static boolean aBoolean292 = false;

	@OriginalMember(owner = "client!jv", name = "e", descriptor = "(B)V")
	public static void method2882() {
		Static209.method2982(Static278.aClass36_131);
		Static116.aClass4_Sub30_Sub1_1.method4846(Static368.anInt6522);
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(ILclient!ic;II)V")
	public static void method2883(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub21 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null || arg1 == Static126.aClass258_19.aClass4_240) {
			return;
		}
		@Pc(15) int local15 = arg1.anInt3043;
		@Pc(26) int local26 = arg1.anInt3040;
		@Pc(29) int local29 = arg1.anInt3041;
		@Pc(33) int local33 = (int) arg1.aLong82;
		@Pc(36) long local36 = arg1.aLong82;
		if (local29 >= 2000) {
			local29 -= 2000;
		}
		@Pc(51) Class6_Sub2_Sub1_Sub1 local51;
		if (local29 == 13) {
			local51 = Static171.aClass6_Sub2_Sub1_Sub1Array1[local33];
			if (local51 != null) {
				Static189.anInt3636 = 0;
				Static58.anInt4348 = 2;
				anInt3844 = arg2;
				Static292.anInt5295 = arg0;
				Static209.method2982(Static343.aClass36_110);
				Static116.aClass4_Sub30_Sub1_1.method4846(local33);
				Static116.aClass4_Sub30_Sub1_1.method4875(Static23.aClass14_1.method1510(82) ? 1 : 0);
				Static14.method4213(-2, 0, 0, true, local51.method4763(), local51.method4763(), local51.anIntArray537[0], local51.anIntArray536[0]);
			}
		}
		if (local29 == 51) {
			anInt3844 = arg2;
			Static292.anInt5295 = arg0;
			Static58.anInt4348 = 2;
			Static189.anInt3636 = 0;
			Static209.method2982(Static329.aClass36_103);
			Static116.aClass4_Sub30_Sub1_1.method4846(Static285.anInt5187 + local26);
			Static116.aClass4_Sub30_Sub1_1.method4883((int) (local36 >>> 32) & Integer.MAX_VALUE);
			Static116.aClass4_Sub30_Sub1_1.method4848(Static23.aClass14_1.method1510(82) ? 1 : 0);
			Static116.aClass4_Sub30_Sub1_1.method4883(Static381.anInt6688 + local15);
			Static70.method5670(local15, local26, local36);
		}
		if (local29 == 20) {
			if (Static189.anInt3643 > 0 && Static23.aClass14_1.method1510(82) && Static23.aClass14_1.method1510(81)) {
				Static215.method5518(Static375.aClass6_Sub2_Sub1_Sub1_3.aByte86, local26 + Static285.anInt5187, local15 + Static381.anInt6688);
			} else {
				Static58.anInt4348 = 1;
				anInt3844 = arg2;
				Static292.anInt5295 = arg0;
				Static189.anInt3636 = 0;
				Static209.method2982(Static282.aClass36_90);
				Static116.aClass4_Sub30_Sub1_1.method4828(local26 + Static285.anInt5187);
				Static116.aClass4_Sub30_Sub1_1.method4828(Static381.anInt6688 + local15);
			}
		}
		if (local29 == 45 && Static454.aClass126_17 == null) {
			Static362.method5026(local15, local26);
			Static454.aClass126_17 = Static299.method4154(local26, local15);
			Static430.method5524(Static454.aClass126_17);
		}
		if (local29 == 44) {
			local51 = Static171.aClass6_Sub2_Sub1_Sub1Array1[local33];
			if (local51 != null) {
				Static189.anInt3636 = 0;
				Static292.anInt5295 = arg0;
				anInt3844 = arg2;
				Static58.anInt4348 = 2;
				Static209.method2982(Static142.aClass36_60);
				Static116.aClass4_Sub30_Sub1_1.method4890(Static8.anInt336);
				Static116.aClass4_Sub30_Sub1_1.method4846(Static14.anInt5474);
				Static116.aClass4_Sub30_Sub1_1.method4828(local33);
				Static116.aClass4_Sub30_Sub1_1.method4883(Static384.anInt6284);
				Static116.aClass4_Sub30_Sub1_1.method4881(Static23.aClass14_1.method1510(82) ? 1 : 0);
				Static14.method4213(-2, 0, 0, true, local51.method4763(), local51.method4763(), local51.anIntArray537[0], local51.anIntArray536[0]);
			}
		}
		if (local29 == 60) {
			local51 = Static171.aClass6_Sub2_Sub1_Sub1Array1[local33];
			if (local51 != null) {
				Static189.anInt3636 = 0;
				anInt3844 = arg2;
				Static58.anInt4348 = 2;
				Static292.anInt5295 = arg0;
				Static209.method2982(Static82.aClass36_41);
				Static116.aClass4_Sub30_Sub1_1.method4835(local33);
				Static116.aClass4_Sub30_Sub1_1.method4848(Static23.aClass14_1.method1510(82) ? 1 : 0);
				Static14.method4213(-2, 0, 0, true, local51.method4763(), local51.method4763(), local51.anIntArray537[0], local51.anIntArray536[0]);
			}
		}
		if (local29 == 17) {
			local51 = Static171.aClass6_Sub2_Sub1_Sub1Array1[local33];
			if (local51 != null) {
				Static58.anInt4348 = 2;
				Static292.anInt5295 = arg0;
				anInt3844 = arg2;
				Static189.anInt3636 = 0;
				Static209.method2982(Static102.aClass36_52);
				Static116.aClass4_Sub30_Sub1_1.method4848(Static23.aClass14_1.method1510(82) ? 1 : 0);
				Static116.aClass4_Sub30_Sub1_1.method4883(local33);
				Static14.method4213(-2, 0, 0, true, local51.method4763(), local51.method4763(), local51.anIntArray537[0], local51.anIntArray536[0]);
			}
		}
		if (local29 == 5) {
			Static58.anInt4348 = 2;
			Static292.anInt5295 = arg0;
			anInt3844 = arg2;
			Static189.anInt3636 = 0;
			Static209.method2982(Static299.aClass36_98);
			Static116.aClass4_Sub30_Sub1_1.method4828(local33);
			Static116.aClass4_Sub30_Sub1_1.method4846(Static381.anInt6688 + local15);
			Static116.aClass4_Sub30_Sub1_1.method4881(Static23.aClass14_1.method1510(82) ? 1 : 0);
			Static116.aClass4_Sub30_Sub1_1.method4883(Static285.anInt5187 + local26);
			Static368.method5078(local26, local15);
		}
		@Pc(495) Class126 local495;
		if (local29 == 9) {
			local495 = Static299.method4154(local26, local15);
			if (local495 != null) {
				Static441.method3967(local495);
			}
		}
		if (local29 == 18) {
			anInt3844 = arg2;
			Static58.anInt4348 = 2;
			Static292.anInt5295 = arg0;
			Static189.anInt3636 = 0;
			Static209.method2982(Static92.aClass36_46);
			Static116.aClass4_Sub30_Sub1_1.method4883(Static384.anInt6284);
			Static116.aClass4_Sub30_Sub1_1.method4883(Static381.anInt6688 + local15);
			Static116.aClass4_Sub30_Sub1_1.method4835(local26 + Static285.anInt5187);
			Static116.aClass4_Sub30_Sub1_1.method4828(local33);
			Static116.aClass4_Sub30_Sub1_1.method4881(Static23.aClass14_1.method1510(82) ? 1 : 0);
			Static116.aClass4_Sub30_Sub1_1.method4878(Static8.anInt336);
			Static116.aClass4_Sub30_Sub1_1.method4835(Static14.anInt5474);
			Static368.method5078(local26, local15);
		}
		if (local29 == 58) {
			Static292.anInt5295 = arg0;
			Static58.anInt4348 = 1;
			anInt3844 = arg2;
			Static189.anInt3636 = 0;
			Static209.method2982(Static446.aClass36_137);
			Static116.aClass4_Sub30_Sub1_1.method4835(Static14.anInt5474);
			Static116.aClass4_Sub30_Sub1_1.method4883(local15 + Static381.anInt6688);
			Static116.aClass4_Sub30_Sub1_1.method4883(Static285.anInt5187 + local26);
			Static116.aClass4_Sub30_Sub1_1.method4883(Static384.anInt6284);
			Static116.aClass4_Sub30_Sub1_1.method4857(Static8.anInt336);
			Static14.method4213(-4, 0, 0, true, 1, 1, local26, local15);
		}
		@Pc(630) Class6_Sub2_Sub1_Sub2 local630;
		if (local29 == 50) {
			local630 = Static176.aClass6_Sub2_Sub1_Sub2Array1[local33];
			if (local630 != null) {
				Static58.anInt4348 = 2;
				Static292.anInt5295 = arg0;
				anInt3844 = arg2;
				Static189.anInt3636 = 0;
				Static209.method2982(Static100.aClass36_51);
				Static116.aClass4_Sub30_Sub1_1.method4881(Static23.aClass14_1.method1510(82) ? 1 : 0);
				Static116.aClass4_Sub30_Sub1_1.method4846(local33);
				Static14.method4213(-2, 0, 0, true, local630.method4763(), local630.method4763(), local630.anIntArray537[0], local630.anIntArray536[0]);
			}
		}
		if (local29 == 4) {
			Static292.anInt5295 = arg0;
			Static58.anInt4348 = 2;
			anInt3844 = arg2;
			Static189.anInt3636 = 0;
			Static209.method2982(Static423.aClass36_108);
			Static116.aClass4_Sub30_Sub1_1.method4835(Static285.anInt5187 + local26);
			Static116.aClass4_Sub30_Sub1_1.method4883((int) (local36 >>> 32) & Integer.MAX_VALUE);
			Static116.aClass4_Sub30_Sub1_1.method4883(Static384.anInt6284);
			Static116.aClass4_Sub30_Sub1_1.method4881(Static23.aClass14_1.method1510(82) ? 1 : 0);
			Static116.aClass4_Sub30_Sub1_1.method4878(Static8.anInt336);
			Static116.aClass4_Sub30_Sub1_1.method4828(local15 + Static381.anInt6688);
			Static116.aClass4_Sub30_Sub1_1.method4835(Static14.anInt5474);
			Static70.method5670(local15, local26, local36);
		}
		if (local29 == 10) {
			local51 = Static171.aClass6_Sub2_Sub1_Sub1Array1[local33];
			if (local51 != null) {
				anInt3844 = arg2;
				Static58.anInt4348 = 2;
				Static189.anInt3636 = 0;
				Static292.anInt5295 = arg0;
				Static209.method2982(Static83.aClass36_42);
				Static116.aClass4_Sub30_Sub1_1.method4875(Static23.aClass14_1.method1510(82) ? 1 : 0);
				Static116.aClass4_Sub30_Sub1_1.method4828(local33);
				Static14.method4213(-2, 0, 0, true, local51.method4763(), local51.method4763(), local51.anIntArray537[0], local51.anIntArray536[0]);
			}
		}
		if (local29 == 1006) {
			anInt3844 = arg2;
			Static58.anInt4348 = 2;
			Static189.anInt3636 = 0;
			Static292.anInt5295 = arg0;
			Static209.method2982(Static16.aClass36_109);
			Static116.aClass4_Sub30_Sub1_1.method4846(local33);
		}
		if (local29 == 23) {
			local630 = Static176.aClass6_Sub2_Sub1_Sub2Array1[local33];
			if (local630 != null) {
				Static58.anInt4348 = 2;
				Static189.anInt3636 = 0;
				anInt3844 = arg2;
				Static292.anInt5295 = arg0;
				Static209.method2982(Static5.aClass36_4);
				Static116.aClass4_Sub30_Sub1_1.method4881(Static23.aClass14_1.method1510(82) ? 1 : 0);
				Static116.aClass4_Sub30_Sub1_1.method4846(local33);
				Static14.method4213(-2, 0, 0, true, local630.method4763(), local630.method4763(), local630.anIntArray537[0], local630.anIntArray536[0]);
			}
		}
		if (local29 == 30) {
			local630 = Static176.aClass6_Sub2_Sub1_Sub2Array1[local33];
			if (local630 != null) {
				Static292.anInt5295 = arg0;
				Static189.anInt3636 = 0;
				Static58.anInt4348 = 2;
				anInt3844 = arg2;
				Static209.method2982(Static418.aClass36_129);
				Static116.aClass4_Sub30_Sub1_1.method4883(Static14.anInt5474);
				Static116.aClass4_Sub30_Sub1_1.method4883(Static384.anInt6284);
				Static116.aClass4_Sub30_Sub1_1.method4828(local33);
				Static116.aClass4_Sub30_Sub1_1.method4871(Static23.aClass14_1.method1510(82) ? 1 : 0);
				Static116.aClass4_Sub30_Sub1_1.method4857(Static8.anInt336);
				Static14.method4213(-2, 0, 0, true, local630.method4763(), local630.method4763(), local630.anIntArray537[0], local630.anIntArray536[0]);
			}
		}
		if (local29 == 21) {
			local51 = Static171.aClass6_Sub2_Sub1_Sub1Array1[local33];
			if (local51 != null) {
				Static292.anInt5295 = arg0;
				Static58.anInt4348 = 2;
				anInt3844 = arg2;
				Static189.anInt3636 = 0;
				Static209.method2982(Static2.aClass36_128);
				Static116.aClass4_Sub30_Sub1_1.method4883(local33);
				Static116.aClass4_Sub30_Sub1_1.method4848(Static23.aClass14_1.method1510(82) ? 1 : 0);
				Static14.method4213(-2, 0, 0, true, local51.method4763(), local51.method4763(), local51.anIntArray537[0], local51.anIntArray536[0]);
			}
		}
		if (local29 == 49) {
			Static58.anInt4348 = 2;
			anInt3844 = arg2;
			Static189.anInt3636 = 0;
			Static292.anInt5295 = arg0;
			Static209.method2982(Static102.aClass36_53);
			Static116.aClass4_Sub30_Sub1_1.method4883(local15 + Static381.anInt6688);
			Static116.aClass4_Sub30_Sub1_1.method4883(local33);
			Static116.aClass4_Sub30_Sub1_1.method4875(Static23.aClass14_1.method1510(82) ? 1 : 0);
			Static116.aClass4_Sub30_Sub1_1.method4828(Static285.anInt5187 + local26);
			Static368.method5078(local26, local15);
		}
		if (local29 == 1012 || local29 == 1011 || local29 == 1001 || local29 == 1010 || local29 == 1002) {
			Static112.method1772(local29, local33, local15);
		}
		if (local29 == 22) {
			local51 = Static171.aClass6_Sub2_Sub1_Sub1Array1[local33];
			if (local51 != null) {
				Static189.anInt3636 = 0;
				Static58.anInt4348 = 2;
				anInt3844 = arg2;
				Static292.anInt5295 = arg0;
				Static209.method2982(Static283.aClass36_92);
				Static116.aClass4_Sub30_Sub1_1.method4883(local33);
				Static116.aClass4_Sub30_Sub1_1.method4875(Static23.aClass14_1.method1510(82) ? 1 : 0);
				Static14.method4213(-2, 0, 0, true, local51.method4763(), local51.method4763(), local51.anIntArray537[0], local51.anIntArray536[0]);
			}
		}
		if (local29 == 6) {
			Static292.anInt5295 = arg0;
			Static189.anInt3636 = 0;
			Static58.anInt4348 = 2;
			anInt3844 = arg2;
			Static209.method2982(Static217.aClass36_77);
			Static116.aClass4_Sub30_Sub1_1.method4883(local26 + Static285.anInt5187);
			Static116.aClass4_Sub30_Sub1_1.method4848(Static23.aClass14_1.method1510(82) ? 1 : 0);
			Static116.aClass4_Sub30_Sub1_1.method4828((int) (local36 >>> 32) & Integer.MAX_VALUE);
			Static116.aClass4_Sub30_Sub1_1.method4835(local15 + Static381.anInt6688);
			Static70.method5670(local15, local26, local36);
		}
		if (local29 == 59) {
			Static292.anInt5295 = arg0;
			anInt3844 = arg2;
			Static189.anInt3636 = 0;
			Static58.anInt4348 = 2;
			Static209.method2982(Static230.aClass36_79);
			Static116.aClass4_Sub30_Sub1_1.method4881(Static23.aClass14_1.method1510(82) ? 1 : 0);
			Static116.aClass4_Sub30_Sub1_1.method4883(local26 + Static285.anInt5187);
			Static116.aClass4_Sub30_Sub1_1.method4828(local33);
			Static116.aClass4_Sub30_Sub1_1.method4835(local15 + Static381.anInt6688);
			Static368.method5078(local26, local15);
		}
		if (local29 == 16) {
			local51 = Static171.aClass6_Sub2_Sub1_Sub1Array1[local33];
			if (local51 != null) {
				Static189.anInt3636 = 0;
				Static58.anInt4348 = 2;
				anInt3844 = arg2;
				Static292.anInt5295 = arg0;
				Static209.method2982(Static4.aClass36_3);
				Static116.aClass4_Sub30_Sub1_1.method4881(Static23.aClass14_1.method1510(82) ? 1 : 0);
				Static116.aClass4_Sub30_Sub1_1.method4835(local33);
				Static14.method4213(-2, 0, 0, true, local51.method4763(), local51.method4763(), local51.anIntArray537[0], local51.anIntArray536[0]);
			}
		}
		if (local29 == 11) {
			anInt3844 = arg2;
			Static189.anInt3636 = 0;
			Static58.anInt4348 = 2;
			Static292.anInt5295 = arg0;
			Static209.method2982(Static169.aClass36_70);
			Static116.aClass4_Sub30_Sub1_1.method4835(local26 + Static285.anInt5187);
			Static116.aClass4_Sub30_Sub1_1.method4871(Static23.aClass14_1.method1510(82) ? 1 : 0);
			Static116.aClass4_Sub30_Sub1_1.method4846(Integer.MAX_VALUE & (int) (local36 >>> 32));
			Static116.aClass4_Sub30_Sub1_1.method4846(local15 + Static381.anInt6688);
			Static70.method5670(local15, local26, local36);
		}
		if (local29 == 48) {
			if (Static189.anInt3643 > 0 && Static23.aClass14_1.method1510(82) && Static23.aClass14_1.method1510(81)) {
				Static215.method5518(Static375.aClass6_Sub2_Sub1_Sub1_3.aByte86, local26 + Static285.anInt5187, local15 + Static381.anInt6688);
			} else {
				Static326.method2437(local33, local15, local26);
				if (local33 == 1) {
					Static116.aClass4_Sub30_Sub1_1.method4871(-1);
					Static116.aClass4_Sub30_Sub1_1.method4871(-1);
					Static116.aClass4_Sub30_Sub1_1.method4846((int) Static146.aFloat82);
					Static116.aClass4_Sub30_Sub1_1.method4871(57);
					Static116.aClass4_Sub30_Sub1_1.method4871(Static94.anInt2046);
					Static116.aClass4_Sub30_Sub1_1.method4871(Static109.anInt6939);
					Static116.aClass4_Sub30_Sub1_1.method4871(89);
					Static116.aClass4_Sub30_Sub1_1.method4846(Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6062);
					Static116.aClass4_Sub30_Sub1_1.method4846(Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6061);
					Static116.aClass4_Sub30_Sub1_1.method4871(63);
				} else {
					Static292.anInt5295 = arg0;
					Static189.anInt3636 = 0;
					anInt3844 = arg2;
					Static58.anInt4348 = 1;
				}
				Static14.method4213(-4, 0, 0, true, 1, 1, local26, local15);
			}
		}
		if (local29 == 19) {
			Static58.anInt4348 = 2;
			Static292.anInt5295 = arg0;
			Static189.anInt3636 = 0;
			anInt3844 = arg2;
			Static209.method2982(Static46.aClass36_97);
			Static116.aClass4_Sub30_Sub1_1.method4875(Static23.aClass14_1.method1510(82) ? 1 : 0);
			Static116.aClass4_Sub30_Sub1_1.method4835(Static285.anInt5187 + local26);
			Static116.aClass4_Sub30_Sub1_1.method4883(local33);
			Static116.aClass4_Sub30_Sub1_1.method4883(Static381.anInt6688 + local15);
			Static368.method5078(local26, local15);
		}
		if (local29 == 8) {
			local630 = Static176.aClass6_Sub2_Sub1_Sub2Array1[local33];
			if (local630 != null) {
				anInt3844 = arg2;
				Static58.anInt4348 = 2;
				Static189.anInt3636 = 0;
				Static292.anInt5295 = arg0;
				Static209.method2982(Static81.aClass36_40);
				Static116.aClass4_Sub30_Sub1_1.method4875(Static23.aClass14_1.method1510(82) ? 1 : 0);
				Static116.aClass4_Sub30_Sub1_1.method4883(local33);
				Static14.method4213(-2, 0, 0, true, local630.method4763(), local630.method4763(), local630.anIntArray537[0], local630.anIntArray536[0]);
			}
		}
		if (local29 == 25) {
			Static189.anInt3636 = 0;
			Static58.anInt4348 = 2;
			anInt3844 = arg2;
			Static292.anInt5295 = arg0;
			Static209.method2982(Static132.aClass36_59);
			Static116.aClass4_Sub30_Sub1_1.method4881(Static23.aClass14_1.method1510(82) ? 1 : 0);
			Static116.aClass4_Sub30_Sub1_1.method4835(Integer.MAX_VALUE & (int) (local36 >>> 32));
			Static116.aClass4_Sub30_Sub1_1.method4828(local26 + Static285.anInt5187);
			Static116.aClass4_Sub30_Sub1_1.method4846(local15 + Static381.anInt6688);
			Static70.method5670(local15, local26, local36);
		}
		if (local29 == 12) {
			local630 = Static176.aClass6_Sub2_Sub1_Sub2Array1[local33];
			if (local630 != null) {
				Static189.anInt3636 = 0;
				anInt3844 = arg2;
				Static292.anInt5295 = arg0;
				Static58.anInt4348 = 2;
				Static209.method2982(Static352.aClass36_112);
				Static116.aClass4_Sub30_Sub1_1.method4883(local33);
				Static116.aClass4_Sub30_Sub1_1.method4871(Static23.aClass14_1.method1510(82) ? 1 : 0);
				Static14.method4213(-2, 0, 0, true, local630.method4763(), local630.method4763(), local630.anIntArray537[0], local630.anIntArray536[0]);
			}
		}
		if (local29 == 1009) {
			Static189.anInt3636 = 0;
			Static292.anInt5295 = arg0;
			anInt3844 = arg2;
			Static58.anInt4348 = 2;
			local630 = Static176.aClass6_Sub2_Sub1_Sub2Array1[local33];
			if (local630 != null) {
				@Pc(1765) Class243 local1765 = local630.aClass243_1;
				if (local1765.anIntArray613 != null) {
					local1765 = local1765.method5337(Static155.aClass149_1);
				}
				if (local1765 != null) {
					Static209.method2982(Static66.aClass36_36);
					Static116.aClass4_Sub30_Sub1_1.method4846(local1765.anInt6911);
				}
			}
		}
		if (local29 == 47) {
			local630 = Static176.aClass6_Sub2_Sub1_Sub2Array1[local33];
			if (local630 != null) {
				Static58.anInt4348 = 2;
				Static189.anInt3636 = 0;
				Static292.anInt5295 = arg0;
				anInt3844 = arg2;
				Static209.method2982(Static62.aClass36_29);
				Static116.aClass4_Sub30_Sub1_1.method4875(Static23.aClass14_1.method1510(82) ? 1 : 0);
				Static116.aClass4_Sub30_Sub1_1.method4835(local33);
				Static14.method4213(-2, 0, 0, true, local630.method4763(), local630.method4763(), local630.anIntArray537[0], local630.anIntArray536[0]);
			}
		}
		if (local29 == 15) {
			anInt3844 = arg2;
			Static292.anInt5295 = arg0;
			Static189.anInt3636 = 0;
			Static58.anInt4348 = 2;
			Static209.method2982(Static142.aClass36_60);
			Static116.aClass4_Sub30_Sub1_1.method4890(Static8.anInt336);
			Static116.aClass4_Sub30_Sub1_1.method4846(Static14.anInt5474);
			Static116.aClass4_Sub30_Sub1_1.method4828(Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6078);
			Static116.aClass4_Sub30_Sub1_1.method4883(Static384.anInt6284);
			Static116.aClass4_Sub30_Sub1_1.method4881(Static23.aClass14_1.method1510(82) ? 1 : 0);
		}
		if (local29 == 57) {
			Static189.anInt3636 = 0;
			Static58.anInt4348 = 2;
			Static292.anInt5295 = arg0;
			anInt3844 = arg2;
			Static209.method2982(Static52.aClass36_26);
			Static116.aClass4_Sub30_Sub1_1.method4846(Static381.anInt6688 + local15);
			Static116.aClass4_Sub30_Sub1_1.method4848(Static23.aClass14_1.method1510(82) ? 1 : 0);
			Static116.aClass4_Sub30_Sub1_1.method4835(Static285.anInt5187 + local26);
			Static116.aClass4_Sub30_Sub1_1.method4835(local33);
			Static368.method5078(local26, local15);
		}
		if (local29 == 2 || local29 == 1008) {
			Static346.method4897(local15, local33, local26, arg1.aString36);
		}
		if (local29 == 1004) {
			Static292.anInt5295 = arg0;
			Static58.anInt4348 = 2;
			anInt3844 = arg2;
			Static189.anInt3636 = 0;
			Static209.method2982(Static258.aClass36_85);
			Static116.aClass4_Sub30_Sub1_1.method4846(local33);
		}
		if (local29 == 1007) {
			anInt3844 = arg2;
			Static292.anInt5295 = arg0;
			Static58.anInt4348 = 2;
			Static189.anInt3636 = 0;
			Static209.method2982(Static359.aClass36_116);
			Static116.aClass4_Sub30_Sub1_1.method4835((int) (local36 >>> 32) & Integer.MAX_VALUE);
			Static116.aClass4_Sub30_Sub1_1.method4871(Static23.aClass14_1.method1510(82) ? 1 : 0);
			Static116.aClass4_Sub30_Sub1_1.method4835(local15 + Static381.anInt6688);
			Static116.aClass4_Sub30_Sub1_1.method4883(Static285.anInt5187 + local26);
			Static70.method5670(local15, local26, local36);
		}
		if (local29 == 46) {
			local495 = Static299.method4154(local26, local15);
			if (local495 != null) {
				Static1.method29();
				@Pc(2064) Class4_Sub34 local2064 = Static55.method1118(local495);
				Static409.method5390(local2064.method4447(), local2064.anInt5773, local495);
				Static279.aString50 = Static169.method2490(local495);
				if (Static279.aString50 == null) {
					Static279.aString50 = "Null";
				}
				Static178.aString37 = local495.aString38 + "<col=ffffff>";
			}
			return;
		}
		if (local29 == 3) {
			local51 = Static171.aClass6_Sub2_Sub1_Sub1Array1[local33];
			if (local51 != null) {
				Static292.anInt5295 = arg0;
				Static189.anInt3636 = 0;
				anInt3844 = arg2;
				Static58.anInt4348 = 2;
				Static209.method2982(Static305.aClass36_99);
				Static116.aClass4_Sub30_Sub1_1.method4883(local33);
				Static116.aClass4_Sub30_Sub1_1.method4881(Static23.aClass14_1.method1510(82) ? 1 : 0);
				Static14.method4213(-2, 0, 0, true, local51.method4763(), local51.method4763(), local51.anIntArray537[0], local51.anIntArray536[0]);
			}
		}
		if (Static222.aBoolean305) {
			Static1.method29();
		}
		if (Static241.aClass126_12 != null && Static260.anInt7581 == 0) {
			Static430.method5524(Static241.aClass126_12);
		}
	}

	@OriginalMember(owner = "client!jv", name = "f", descriptor = "(B)V")
	public static void method2884() {
		@Pc(13) Class4_Sub1_Sub8 local13 = Static416.method5456(0, 15);
		local13.method2761();
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IIIIII)V")
	public static void method2885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static126.aClass67_Sub1_1.anInt5852 != 0 && arg1 != 0 && Static425.anInt7124 < 50 && arg3 != -1) {
			Static246.aClass200Array1[Static425.anInt7124++] = new Class200((byte) 1, arg3, arg1, arg4, arg0, arg2);
		}
	}
}
