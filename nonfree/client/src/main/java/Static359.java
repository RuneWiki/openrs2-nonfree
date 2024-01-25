import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!ur", name = "R", descriptor = "I")
	public static int anInt6584;

	@OriginalMember(owner = "client!ur", name = "O", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger3 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!ur", name = "Q", descriptor = "Lclient!mc;")
	public static Class145 aClass145_1 = new Class145();

	@OriginalMember(owner = "client!ur", name = "S", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_102 = new Class183(45, -1);

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "(I)V")
	public static void method5671() {
		Static11.method104(false);
		Static51.anInt1104 = 0;
		@Pc(14) boolean local14 = true;
		for (@Pc(16) int local16 = 0; local16 < Static227.aByteArrayArray15.length; local16++) {
			if (Static1.anIntArray583[local16] != -1 && Static227.aByteArrayArray15[local16] == null) {
				Static227.aByteArrayArray15[local16] = Static90.aClass83_42.method1968(0, Static1.anIntArray583[local16]);
				if (Static227.aByteArrayArray15[local16] == null) {
					Static51.anInt1104++;
					local14 = false;
				}
			}
			if (Static51.anIntArray80[local16] != -1 && Static40.aByteArrayArray3[local16] == null) {
				Static40.aByteArrayArray3[local16] = Static90.aClass83_42.method1972(0, Static51.anIntArray80[local16], Static25.anIntArrayArray20[local16]);
				if (Static40.aByteArrayArray3[local16] == null) {
					local14 = false;
					Static51.anInt1104++;
				}
			}
			if (Static164.anIntArray263[local16] != -1 && Static146.aByteArrayArray12[local16] == null) {
				Static146.aByteArrayArray12[local16] = Static90.aClass83_42.method1968(0, Static164.anIntArray263[local16]);
				if (Static146.aByteArrayArray12[local16] == null) {
					local14 = false;
					Static51.anInt1104++;
				}
			}
			if (Static310.anIntArray498[local16] != -1 && Static297.aByteArrayArray17[local16] == null) {
				Static297.aByteArrayArray17[local16] = Static90.aClass83_42.method1968(0, Static310.anIntArray498[local16]);
				if (Static297.aByteArrayArray17[local16] == null) {
					local14 = false;
					Static51.anInt1104++;
				}
			}
			if (Static132.anIntArray220 != null && Static42.aByteArrayArray4[local16] == null && Static132.anIntArray220[local16] != -1) {
				Static42.aByteArrayArray4[local16] = Static90.aClass83_42.method1972(0, Static132.anIntArray220[local16], Static25.anIntArrayArray20[local16]);
				if (Static42.aByteArrayArray4[local16] == null) {
					local14 = false;
					Static51.anInt1104++;
				}
			}
		}
		if (Static206.aClass215_2 == null) {
			if (Static190.aClass2_Sub7_Sub12_2 == null || !Static86.aClass83_38.method1973(Static190.aClass2_Sub7_Sub12_2.aString42 + "_staticelements")) {
				Static206.aClass215_2 = new Class215(0);
			} else if (Static86.aClass83_38.method1963(Static190.aClass2_Sub7_Sub12_2.aString42 + "_staticelements")) {
				Static206.aClass215_2 = Static62.method4278(Static86.aClass83_38, Static180.aBoolean272, Static190.aClass2_Sub7_Sub12_2.aString42 + "_staticelements");
			} else {
				local14 = false;
				Static51.anInt1104++;
			}
		}
		if (!local14) {
			Static23.anInt364 = 1;
			return;
		}
		local14 = true;
		Static202.anInt4204 = 0;
		@Pc(270) int local270;
		@Pc(281) int local281;
		for (@Pc(252) int local252 = 0; local252 < Static227.aByteArrayArray15.length; local252++) {
			@Pc(258) byte[] local258 = Static40.aByteArrayArray3[local252];
			if (local258 != null) {
				local270 = (Static71.anIntArray118[local252] >> 8) * 64 - Static279.anInt5198;
				local281 = (Static71.anIntArray118[local252] & 0xFF) * 64 - Static350.anInt6470;
				if (Static139.aBoolean208) {
					local281 = 10;
					local270 = 10;
				}
				local14 &= Static285.method4701(local258, Static89.anInt1891, Static85.anInt1839, local270, local281);
			}
			local258 = Static297.aByteArrayArray17[local252];
			if (local258 != null) {
				local270 = (Static71.anIntArray118[local252] >> 8) * 64 - Static279.anInt5198;
				local281 = (Static71.anIntArray118[local252] & 0xFF) * 64 - Static350.anInt6470;
				if (Static139.aBoolean208) {
					local270 = 10;
					local281 = 10;
				}
				local14 &= Static285.method4701(local258, Static89.anInt1891, Static85.anInt1839, local270, local281);
			}
		}
		if (!local14) {
			Static23.anInt364 = 2;
			return;
		}
		if (Static23.anInt364 != 0) {
			Static88.method1497(true, Static31.aClass44_1, Static87.aClass62_60.method1389(Static200.anInt4144) + "<br>(100%)");
		}
		Static131.method2293();
		Static227.method4131();
		@Pc(379) boolean local379 = false;
		if (Static383.aClass48_9.method2473() && Static104.aBoolean168) {
			for (local270 = 0; local270 < Static227.aByteArrayArray15.length; local270++) {
				if (Static297.aByteArrayArray17[local270] != null || Static146.aByteArrayArray12[local270] != null) {
					local379 = true;
					break;
				}
			}
		}
		if (Static135.aBoolean204) {
			local270 = Class2_Sub11_Sub1.lb[Static203.anInt3962];
		} else {
			local270 = Static8.anIntArray50[Static203.anInt3962];
		}
		if (Static383.aClass48_9.method2511()) {
			local270++;
		}
		Static51.method780(Static89.anInt1891, Static85.anInt1839, local270, local379, Static383.aClass48_9.method2446() > 0);
		for (local281 = 0; local281 < 4; local281++) {
			Static165.aClass178Array1[local281].method4482();
		}
		Static82.method1418();
		Static7.method78(false);
		Static346.method5532();
		Static131.method2293();
		System.gc();
		Static11.method104(true);
		Static171.method3040();
		Static142.aBoolean214 = Static382.aBoolean487;
		Static315.aBoolean422 = Static104.aBoolean168;
		Static385.aBoolean496 = !Static135.aBoolean205;
		Static124.anInt4241 = Static266.anInt5047;
		Static230.aBoolean333 = Static199.anInt4131 >= 96;
		Static7.anInt158 = Static40.method575() ? -1 : Static73.anInt1627;
		Static318.aBoolean427 = Static36.anInt2910 == 1 || Static73.aBoolean126;
		Static57.aClass133_Sub1_2 = new Class133_Sub1(4, Static89.anInt1891, Static85.anInt1839, false);
		if (!Static139.aBoolean208) {
			Static330.method5314(Static57.aClass133_Sub1_2, Static227.aByteArrayArray15);
		}
		if (Static139.aBoolean208) {
			Static295.method4831(Static227.aByteArrayArray15, Static57.aClass133_Sub1_2);
		}
		Static106.method1901(Static85.anInt1839 >> 4, Static89.anInt1891 >> 4);
		Static147.method2659();
		if (local379) {
			Static307.method5020(true);
			Static11.aClass133_Sub1_1 = new Class133_Sub1(1, Static89.anInt1891, Static85.anInt1839, true);
			if (!Static139.aBoolean208) {
				Static330.method5314(Static11.aClass133_Sub1_1, Static146.aByteArrayArray12);
				Static11.method104(true);
			}
			if (Static139.aBoolean208) {
				Static295.method4831(Static146.aByteArrayArray12, Static11.aClass133_Sub1_1);
				Static11.method104(true);
			}
			Static11.aClass133_Sub1_1.method3465(Static57.aClass133_Sub1_2.anIntArrayArrayArray7[0]);
			Static11.aClass133_Sub1_1.method3459(Static383.aClass48_9, null, null);
			Static307.method5020(false);
		}
		Static57.aClass133_Sub1_2.method3459(Static383.aClass48_9, local379 ? Static11.aClass133_Sub1_1.anIntArrayArrayArray7 : null, Static165.aClass178Array1);
		if (!Static139.aBoolean208) {
			Static11.method104(true);
			Static53.method831(Static57.aClass133_Sub1_2, Static40.aByteArrayArray3);
			if (Static42.aByteArrayArray4 != null) {
				Static177.method3284();
			}
		}
		if (Static139.aBoolean208) {
			Static11.method104(true);
			Static333.method5394(Static40.aByteArrayArray3, Static57.aClass133_Sub1_2);
		}
		Static227.method4131();
		Static11.method104(true);
		Static57.aClass133_Sub1_2.method3464(Static383.aClass48_9, null, local379 ? Static248.aClass149Array3[0] : null);
		Static57.aClass133_Sub1_2.method3475(Static383.aClass48_9);
		Static11.method104(true);
		if (local379) {
			Static307.method5020(true);
			Static11.method104(true);
			if (!Static139.aBoolean208) {
				Static53.method831(Static11.aClass133_Sub1_1, Static297.aByteArrayArray17);
			}
			if (Static139.aBoolean208) {
				Static333.method5394(Static297.aByteArrayArray17, Static11.aClass133_Sub1_1);
			}
			Static227.method4131();
			Static11.method104(true);
			Static11.aClass133_Sub1_1.method3464(Static383.aClass48_9, Static210.aClass149Array5[0], null);
			Static11.aClass133_Sub1_1.method3475(Static383.aClass48_9);
			Static11.method104(true);
			Static307.method5020(false);
		}
		Static185.method3425();
		@Pc(699) int local699 = Static57.aClass133_Sub1_2.anInt3978;
		if (local699 > Static241.anInt2711) {
			local699 = Static241.anInt2711;
		}
		if (Static241.anInt2711 - 1 > local699) {
			local699 = Static241.anInt2711 - 1;
		}
		if (Static40.method575()) {
			Static316.method5106(0);
		} else {
			Static316.method5106(local699);
		}
		@Pc(732) int local732;
		@Pc(736) int local736;
		for (@Pc(728) int local728 = 0; local728 < 4; local728++) {
			for (local732 = 0; local732 < Static89.anInt1891; local732++) {
				for (local736 = 0; local736 < Static85.anInt1839; local736++) {
					Static89.method1500(local728, local736, local732);
				}
			}
		}
		Static369.method5878();
		Static131.method2293();
		Static112.method1690();
		Static227.method4131();
		Static355.aBoolean466 = false;
		Static102.method1834();
		if (Static115.aFrame3 != null && Static386.aClass226_4 != null && Static121.anInt6774 == 25) {
			Static77.method1332(Static26.aClass183_5);
			Static76.aClass2_Sub24_Sub2_7.method5734(1057001181);
		}
		if (!Static139.aBoolean208) {
			local732 = (Static196.anInt2477 - (Static89.anInt1891 >> 4)) / 8;
			local736 = ((Static89.anInt1891 >> 4) + Static196.anInt2477) / 8;
			@Pc(823) int local823 = (Static15.anInt270 - (Static85.anInt1839 >> 4)) / 8;
			@Pc(831) int local831 = ((Static85.anInt1839 >> 4) + Static15.anInt270) / 8;
			for (@Pc(835) int local835 = local732 - 1; local835 <= local736 + 1; local835++) {
				for (@Pc(841) int local841 = local823 - 1; local841 <= local831 + 1; local841++) {
					if (local732 > local835 || local736 < local835 || local841 < local823 || local831 < local841) {
						Static90.aClass83_42.method1974("m" + local835 + "_" + local841);
						Static90.aClass83_42.method1974("l" + local835 + "_" + local841);
					}
				}
			}
		}
		if (Static121.anInt6774 == 28) {
			Static181.method3326(10);
		} else {
			Static181.method3326(30);
			if (Static386.aClass226_4 != null) {
				Static77.method1332(Static371.aClass183_108);
			}
		}
		Static8.method372();
		Static131.method2293();
		Static119.method2131();
	}
}
