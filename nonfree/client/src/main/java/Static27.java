import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "Lclient!oc;")
	public static Class56 aClass56_26;

	@OriginalMember(owner = "client!ea", name = "s", descriptor = "Lclient!le;")
	public static Class50 aClass50_2;

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "Lclient!fc;")
	private static Class25 aClass25_328 = Static78.method1313("Please wait )2 attempting to reestablish");

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "Lclient!fc;")
	private static Class25 aClass25_330 = Static78.method1313("Enter name:");

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "Lclient!fc;")
	public static Class25 aClass25_329 = aClass25_330;

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "Z")
	public static boolean aBoolean24 = false;

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "Z")
	public static boolean aBoolean25 = false;

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "Lclient!fc;")
	public static Class25 aClass25_331 = aClass25_328;

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "Lclient!fc;")
	public static Class25 aClass25_332 = Static78.method1313("null");

	@OriginalMember(owner = "client!ea", name = "q", descriptor = "Lclient!fc;")
	public static Class25 aClass25_333 = Static78.method1313("Lade Spiel)2Fenster )2 ");

	@OriginalMember(owner = "client!ea", name = "v", descriptor = "I")
	public static int anInt743 = 0;

	@OriginalMember(owner = "client!ea", name = "w", descriptor = "B")
	public static byte aByte2 = 0;

	@OriginalMember(owner = "client!ea", name = "x", descriptor = "Lclient!fc;")
	public static Class25 aClass25_334 = Static78.method1313("Wen m-Ochten Sie entfernen?");

	@OriginalMember(owner = "client!ea", name = "y", descriptor = "I")
	public static int anInt744 = 0;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILclient!ob;[Ljava/lang/Object;Lclient!ob;III)V")
	public static void method600(@OriginalArg(1) Class1_Sub2_Sub14 arg0, @OriginalArg(2) Object[] arg1, @OriginalArg(3) Class1_Sub2_Sub14 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = (Integer) arg1[0];
		@Pc(15) Class1_Sub2_Sub5 local15 = Static33.method739(local7);
		if (local15 == null) {
			return;
		}
		@Pc(20) int local20 = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = -1;
		@Pc(32) int[] local32 = local15.anIntArray149;
		@Pc(34) byte local34 = -1;
		@Pc(37) int[] local37 = local15.anIntArray147;
		try {
			Static108.anIntArray425 = new int[local15.anInt698];
			Static85.aClass25Array15 = new Class25[local15.anInt695];
			@Pc(47) int local47 = 0;
			@Pc(49) int local49 = 0;
			@Pc(79) int local79;
			for (@Pc(51) int local51 = 1; local51 < arg1.length; local51++) {
				if (arg1[local51] instanceof Integer) {
					local79 = (Integer) arg1[local51];
					if (local79 == -2147483647) {
						local79 = arg3;
					}
					if (local79 == -2147483646) {
						local79 = arg4;
					}
					if (local79 == -2147483645) {
						local79 = arg0 == null ? -1 : arg0.anInt1937;
					}
					if (local79 == -2147483644) {
						local79 = arg5;
					}
					if (local79 == -2147483643) {
						local79 = arg0 == null ? -1 : arg0.anInt1942;
					}
					if (local79 == -2147483642) {
						local79 = arg2 == null ? -1 : arg2.anInt1937;
					}
					if (local79 == -2147483641) {
						local79 = arg2 == null ? -1 : arg2.anInt1942;
					}
					Static108.anIntArray425[local47++] = local79;
				} else if (arg1[local51] instanceof Class25) {
					Static85.aClass25Array15[local49++] = (Class25) arg1[local51];
				}
			}
			local79 = 0;
			label1408: while (true) {
				local79++;
				if (local79 > 200000) {
					throw new RuntimeException("slow");
				}
				local29++;
				@Pc(170) int local170 = local37[local29];
				@Pc(726) int local726;
				@Pc(584) int local584;
				@Pc(721) int local721;
				@Pc(605) int local605;
				@Pc(540) Class25 local540;
				if (local170 < 100) {
					if (local170 == 0) {
						Static37.anIntArray195[local20++] = local32[local29];
						continue;
					}
					@Pc(196) int local196;
					if (local170 == 1) {
						local196 = local32[local29];
						Static37.anIntArray195[local20++] = Static95.anIntArray385[local196];
						continue;
					}
					if (local170 == 2) {
						local196 = local32[local29];
						local20--;
						Static95.anIntArray385[local196] = Static37.anIntArray195[local20];
						continue;
					}
					if (local170 == 3) {
						Static67.aClass25Array7[local27++] = local15.aClass25Array3[local29];
						continue;
					}
					if (local170 == 6) {
						local29 += local32[local29];
						continue;
					}
					if (local170 == 7) {
						local20 -= 2;
						if (Static37.anIntArray195[local20] != Static37.anIntArray195[local20 + 1]) {
							local29 += local32[local29];
						}
						continue;
					}
					if (local170 == 8) {
						local20 -= 2;
						if (Static37.anIntArray195[local20 + 1] == Static37.anIntArray195[local20]) {
							local29 += local32[local29];
						}
						continue;
					}
					if (local170 == 9) {
						local20 -= 2;
						if (Static37.anIntArray195[local20] < Static37.anIntArray195[local20 + 1]) {
							local29 += local32[local29];
						}
						continue;
					}
					if (local170 == 10) {
						local20 -= 2;
						if (Static37.anIntArray195[local20 + 1] < Static37.anIntArray195[local20]) {
							local29 += local32[local29];
						}
						continue;
					}
					if (local170 == 21) {
						if (Static52.anInt1257 == 0) {
							return;
						}
						@Pc(361) Class67 local361 = Static93.aClass67Array1[--Static52.anInt1257];
						Static108.anIntArray425 = local361.anIntArray400;
						local29 = local361.anInt2317;
						Static85.aClass25Array15 = local361.aClass25Array21;
						local15 = local361.aClass1_Sub2_Sub5_1;
						local32 = local15.anIntArray149;
						local37 = local15.anIntArray147;
						continue;
					}
					if (local170 == 25) {
						local196 = local32[local29];
						Static37.anIntArray195[local20++] = Static49.method984(local196);
						continue;
					}
					if (local170 == 27) {
						local196 = local32[local29];
						local20--;
						Static45.method963(Static37.anIntArray195[local20], local196);
						continue;
					}
					if (local170 == 31) {
						local20 -= 2;
						if (Static37.anIntArray195[local20 + 1] >= Static37.anIntArray195[local20]) {
							local29 += local32[local29];
						}
						continue;
					}
					if (local170 == 32) {
						local20 -= 2;
						if (Static37.anIntArray195[local20] >= Static37.anIntArray195[local20 + 1]) {
							local29 += local32[local29];
						}
						continue;
					}
					if (local170 == 33) {
						Static37.anIntArray195[local20++] = Static108.anIntArray425[local32[local29]];
						continue;
					}
					@Pc(488) int local488;
					if (local170 == 34) {
						local488 = local32[local29];
						local20--;
						Static108.anIntArray425[local488] = Static37.anIntArray195[local20];
						continue;
					}
					if (local170 == 35) {
						Static67.aClass25Array7[local27++] = Static85.aClass25Array15[local32[local29]];
						continue;
					}
					if (local170 == 36) {
						local488 = local32[local29];
						local27--;
						Static85.aClass25Array15[local488] = Static67.aClass25Array7[local27];
						continue;
					}
					if (local170 == 37) {
						local196 = local32[local29];
						local27 -= local196;
						local540 = Static8.method228(local27, Static67.aClass25Array7, local196);
						Static67.aClass25Array7[local27++] = local540;
						continue;
					}
					if (local170 == 38) {
						local20--;
						continue;
					}
					if (local170 == 39) {
						local27--;
						continue;
					}
					if (local170 == 40) {
						local196 = local32[local29];
						@Pc(574) Class1_Sub2_Sub5 local574 = Static33.method739(local196);
						@Pc(578) int[] local578 = new int[local574.anInt698];
						@Pc(582) Class25[] local582 = new Class25[local574.anInt695];
						for (local584 = 0; local584 < local574.anInt696; local584++) {
							local578[local584] = Static37.anIntArray195[local584 + local20 - local574.anInt696];
						}
						for (local605 = 0; local605 < local574.anInt697; local605++) {
							local582[local605] = Static67.aClass25Array7[local605 + local27 - local574.anInt697];
						}
						local27 -= local574.anInt697;
						local20 -= local574.anInt696;
						@Pc(638) Class67 local638 = new Class67();
						local638.anInt2317 = local29;
						local638.aClass25Array21 = Static85.aClass25Array15;
						local29 = -1;
						local638.anIntArray400 = Static108.anIntArray425;
						local638.aClass1_Sub2_Sub5_1 = local15;
						local15 = local574;
						Static93.aClass67Array1[Static52.anInt1257++] = local638;
						local32 = local574.anIntArray149;
						local37 = local574.anIntArray147;
						Static108.anIntArray425 = local578;
						Static85.aClass25Array15 = local582;
						continue;
					}
					if (local170 == 42) {
						Static37.anIntArray195[local20++] = Static86.anIntArray342[local32[local29]];
						continue;
					}
					if (local170 == 43) {
						local488 = local32[local29];
						local20--;
						Static86.anIntArray342[local488] = Static37.anIntArray195[local20];
						continue;
					}
					if (local170 == 44) {
						local196 = local32[local29] >> 16;
						local721 = local32[local29] & 0xFFFF;
						local20--;
						local726 = Static37.anIntArray195[local20];
						if (local726 >= 0 && local726 <= 5000) {
							Static80.anIntArray321[local196] = local726;
							@Pc(743) byte local743 = -1;
							if (local721 == 105) {
								local743 = 0;
							}
							local584 = 0;
							while (true) {
								if (local584 >= local726) {
									continue label1408;
								}
								Static76.anIntArrayArray15[local196][local584] = local743;
								local584++;
							}
						}
						throw new RuntimeException();
					}
					if (local170 == 45) {
						local196 = local32[local29];
						local20--;
						local721 = Static37.anIntArray195[local20];
						if (local721 >= 0 && local721 < Static80.anIntArray321[local196]) {
							Static37.anIntArray195[local20++] = Static76.anIntArrayArray15[local196][local721];
							continue;
						}
						throw new RuntimeException();
					}
					if (local170 == 46) {
						local20 -= 2;
						local721 = Static37.anIntArray195[local20];
						local196 = local32[local29];
						if (local721 >= 0 && Static80.anIntArray321[local196] > local721) {
							Static76.anIntArrayArray15[local196][local721] = Static37.anIntArray195[local20 + 1];
							continue;
						}
						throw new RuntimeException();
					}
				}
				@Pc(853) boolean local853;
				if (local32[local29] == 1) {
					local853 = true;
				} else {
					local853 = false;
				}
				@Pc(889) Class1_Sub2_Sub14 local889;
				@Pc(1079) int local1079;
				@Pc(2288) int local2288;
				if (local170 < 1000) {
					if (local170 == 100) {
						local20 -= 3;
						local721 = Static37.anIntArray195[local20];
						local726 = Static37.anIntArray195[local20 + 1];
						local1079 = Static37.anIntArray195[local20 + 2];
						if (local726 == 0) {
							throw new RuntimeException();
						}
						@Pc(4776) Class1_Sub2_Sub14 local4776 = Static46.method968(local721);
						if (local4776.aClass1_Sub2_Sub14Array2 == null) {
							local4776.aClass1_Sub2_Sub14Array2 = new Class1_Sub2_Sub14[local1079 + 1];
						}
						if (local1079 >= local4776.aClass1_Sub2_Sub14Array2.length) {
							@Pc(4795) Class1_Sub2_Sub14[] local4795 = new Class1_Sub2_Sub14[local1079 + 1];
							for (local2288 = 0; local2288 < local4776.aClass1_Sub2_Sub14Array2.length; local2288++) {
								local4795[local2288] = local4776.aClass1_Sub2_Sub14Array2[local2288];
							}
							local4776.aClass1_Sub2_Sub14Array2 = local4795;
						}
						if (local1079 > 0 && local4776.aClass1_Sub2_Sub14Array2[local1079 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local1079 - 1));
						}
						@Pc(4845) Class1_Sub2_Sub14 local4845 = new Class1_Sub2_Sub14();
						local4845.anInt1960 = local726;
						local4845.aBoolean90 = true;
						local4845.anInt1905 = local4845.anInt1937 = local4776.anInt1937;
						local4845.anInt1942 = local1079;
						local4776.aClass1_Sub2_Sub14Array2[local1079] = local4845;
						if (local853) {
							Static99.aClass1_Sub2_Sub14_6 = local4845;
						} else {
							Static57.aClass1_Sub2_Sub14_7 = local4845;
						}
						Static32.method728(local4776);
						continue;
					}
					if (local170 == 101) {
						local889 = local853 ? Static99.aClass1_Sub2_Sub14_6 : Static57.aClass1_Sub2_Sub14_7;
						@Pc(4895) Class1_Sub2_Sub14 local4895 = Static46.method968(local889.anInt1937);
						local4895.aClass1_Sub2_Sub14Array2[local889.anInt1942] = null;
						Static32.method728(local4895);
						continue;
					}
					if (local170 == 102) {
						local20--;
						local889 = Static46.method968(Static37.anIntArray195[local20]);
						local889.aClass1_Sub2_Sub14Array2 = null;
						Static32.method728(local889);
						continue;
					}
					if (local170 == 200) {
						local20 -= 2;
						local721 = Static37.anIntArray195[local20];
						local726 = Static37.anIntArray195[local20 + 1];
						@Pc(4947) Class1_Sub2_Sub14 local4947 = Static62.method1091(local721, local726);
						if (local4947 != null && local726 != -1) {
							Static37.anIntArray195[local20++] = 1;
							if (local853) {
								Static99.aClass1_Sub2_Sub14_6 = local4947;
							} else {
								Static57.aClass1_Sub2_Sub14_7 = local4947;
							}
							continue;
						}
						Static37.anIntArray195[local20++] = 0;
						continue;
					}
				} else if (local170 >= 1000 && local170 < 1100 || !(local170 < 2000 || local170 >= 2100)) {
					if (local170 < 2000) {
						local889 = local853 ? Static99.aClass1_Sub2_Sub14_6 : Static57.aClass1_Sub2_Sub14_7;
					} else {
						local170 -= 1000;
						local20--;
						local889 = Static46.method968(Static37.anIntArray195[local20]);
					}
					Static32.method728(local889);
					if (local170 == 1000) {
						local20 -= 2;
						local889.anInt1959 = Static37.anIntArray195[local20];
						local889.anInt1917 = Static37.anIntArray195[local20 + 1];
						continue;
					}
					if (local170 == 1001) {
						local20 -= 2;
						local889.anInt1911 = Static37.anIntArray195[local20];
						local889.anInt1923 = Static37.anIntArray195[local20 + 1];
						continue;
					}
					if (local170 == 1003) {
						local20--;
						local889.aBoolean89 = Static37.anIntArray195[local20] == 1;
						continue;
					}
				} else if (local170 >= 1100 && local170 < 1200 || !(local170 < 2100 || local170 >= 2200)) {
					if (local170 >= 2000) {
						local20--;
						local889 = Static46.method968(Static37.anIntArray195[local20]);
						local170 -= 1000;
					} else {
						local889 = local853 ? Static99.aClass1_Sub2_Sub14_6 : Static57.aClass1_Sub2_Sub14_7;
					}
					Static32.method728(local889);
					if (local170 == 1100) {
						local20 -= 2;
						local889.anInt1949 = Static37.anIntArray195[local20];
						if (local889.anInt1949 > local889.anInt1900 - local889.anInt1911) {
							local889.anInt1949 = local889.anInt1900 - local889.anInt1911;
						}
						if (local889.anInt1949 < 0) {
							local889.anInt1949 = 0;
						}
						local889.anInt1957 = Static37.anIntArray195[local20 + 1];
						if (local889.anInt1912 - local889.anInt1923 < local889.anInt1957) {
							local889.anInt1957 = local889.anInt1912 - local889.anInt1923;
						}
						if (local889.anInt1957 < 0) {
							local889.anInt1957 = 0;
						}
						continue;
					}
					if (local170 == 1101) {
						local20--;
						local889.anInt1956 = Static37.anIntArray195[local20];
						continue;
					}
					if (local170 == 1102) {
						local20--;
						local889.aBoolean91 = Static37.anIntArray195[local20] == 1;
						continue;
					}
					if (local170 == 1103) {
						local20--;
						local889.anInt1909 = Static37.anIntArray195[local20];
						continue;
					}
					if (local170 == 1104) {
						local20--;
						local889.anInt1958 = Static37.anIntArray195[local20];
						continue;
					}
					if (local170 == 1105) {
						local20--;
						local889.anInt1941 = Static37.anIntArray195[local20];
						continue;
					}
					if (local170 == 1106) {
						local20--;
						local889.anInt1897 = Static37.anIntArray195[local20];
						continue;
					}
					if (local170 == 1107) {
						local20--;
						local889.aBoolean88 = Static37.anIntArray195[local20] == 1;
						continue;
					}
					if (local170 == 1108) {
						local889.anInt1930 = 1;
						local20--;
						local889.anInt1951 = Static37.anIntArray195[local20];
						continue;
					}
					if (local170 == 1109) {
						local20 -= 6;
						local889.anInt1963 = Static37.anIntArray195[local20];
						local889.anInt1943 = Static37.anIntArray195[local20 + 1];
						local889.anInt1902 = Static37.anIntArray195[local20 + 2];
						local889.anInt1924 = Static37.anIntArray195[local20 + 3];
						local889.anInt1935 = Static37.anIntArray195[local20 + 4];
						local889.anInt1962 = Static37.anIntArray195[local20 + 5];
						continue;
					}
					if (local170 == 1110) {
						local20--;
						local889.anInt1946 = Static37.anIntArray195[local20];
						continue;
					}
					if (local170 == 1111) {
						local20--;
						local889.aBoolean94 = Static37.anIntArray195[local20] == 1;
						continue;
					}
					if (local170 == 1112) {
						local27--;
						local889.aClass25_941 = Static67.aClass25Array7[local27];
						continue;
					}
					if (local170 == 1113) {
						local20--;
						local889.anInt1928 = Static37.anIntArray195[local20];
						continue;
					}
					if (local170 == 1114) {
						local20 -= 3;
						local889.anInt1952 = Static37.anIntArray195[local20];
						local889.anInt1932 = Static37.anIntArray195[local20 + 1];
						local889.anInt1954 = Static37.anIntArray195[local20 + 2];
						continue;
					}
					if (local170 == 1115) {
						local20--;
						local889.aBoolean86 = Static37.anIntArray195[local20] == 1;
						continue;
					}
					if (local170 == 1116) {
						local20--;
						local889.anInt1915 = Static37.anIntArray195[local20];
						continue;
					}
					if (local170 == 1117) {
						local20--;
						local889.anInt1916 = Static37.anIntArray195[local20];
						continue;
					}
					if (local170 == 1118) {
						local20--;
						local889.aBoolean87 = Static37.anIntArray195[local20] == 1;
						continue;
					}
					if (local170 == 1119) {
						local20--;
						local889.aBoolean93 = Static37.anIntArray195[local20] == 1;
						continue;
					}
					if (local170 == 1120) {
						local20 -= 2;
						local889.anInt1900 = Static37.anIntArray195[local20];
						local889.anInt1912 = Static37.anIntArray195[local20 + 1];
						continue;
					}
				} else if (local170 >= 1200 && local170 < 1300 || !(local170 < 2200 || local170 >= 2300)) {
					if (local170 < 2000) {
						local889 = local853 ? Static99.aClass1_Sub2_Sub14_6 : Static57.aClass1_Sub2_Sub14_7;
					} else {
						local20--;
						local889 = Static46.method968(Static37.anIntArray195[local20]);
						local170 -= 1000;
					}
					Static32.method728(local889);
					if (local170 == 1200) {
						local20 -= 2;
						local1079 = Static37.anIntArray195[local20 + 1];
						local726 = Static37.anIntArray195[local20];
						local889.anInt1903 = local1079;
						local889.anInt1904 = local726;
						@Pc(4247) Class1_Sub2_Sub16 local4247 = Static33.method736(local726);
						local889.anInt1924 = local4247.anInt2113;
						local889.anInt1935 = local4247.anInt2161;
						local889.anInt1963 = local4247.anInt2150;
						local889.anInt1902 = local4247.anInt2151;
						local889.anInt1962 = local4247.anInt2136;
						if (local889.anInt1911 > 0) {
							local889.anInt1962 = local889.anInt1962 * 32 / local889.anInt1911;
						}
						local889.anInt1943 = local4247.anInt2126;
						continue;
					}
					if (local170 == 1201) {
						local889.anInt1930 = 2;
						local20--;
						local889.anInt1951 = Static37.anIntArray195[local20];
						continue;
					}
					if (local170 == 1202) {
						local889.anInt1930 = 3;
						local889.anInt1951 = Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.aClass75_2.method1853();
						continue;
					}
				} else if (local170 >= 1300 && local170 < 1400 || local170 >= 2300 && local170 < 2400) {
					if (local170 >= 2000) {
						local20--;
						local889 = Static46.method968(Static37.anIntArray195[local20]);
						local170 -= 1000;
					} else {
						local889 = local853 ? Static99.aClass1_Sub2_Sub14_6 : Static57.aClass1_Sub2_Sub14_7;
					}
					if (local170 == 1300) {
						local20--;
						local726 = Static37.anIntArray195[local20] - 1;
						if (local726 >= 0 && local726 <= 9) {
							local27--;
							local889.method1434(local726, Static67.aClass25Array7[local27]);
							continue;
						}
						local27--;
						continue;
					}
					if (local170 == 1301) {
						local20 -= 2;
						local726 = Static37.anIntArray195[local20];
						local1079 = Static37.anIntArray195[local20 + 1];
						local889.aClass1_Sub2_Sub14_5 = Static62.method1091(local726, local1079);
						continue;
					}
					if (local170 == 1302) {
						local20--;
						local889.aBoolean84 = Static37.anIntArray195[local20] == 1;
						continue;
					}
					if (local170 == 1303) {
						local20--;
						local889.anInt1927 = Static37.anIntArray195[local20];
						continue;
					}
					if (local170 == 1304) {
						local20--;
						local889.anInt1908 = Static37.anIntArray195[local20];
						continue;
					}
					if (local170 == 1305) {
						local27--;
						local889.aClass25_939 = Static67.aClass25Array7[local27];
						continue;
					}
					if (local170 == 1306) {
						local27--;
						local889.aClass25_935 = Static67.aClass25Array7[local27];
						continue;
					}
				} else {
					@Pc(1197) Class25 local1197;
					if (local170 >= 1400 && local170 < 1500 || local170 >= 2400 && local170 < 2500) {
						if (local170 >= 2000) {
							local170 -= 1000;
							local20--;
							local889 = Static46.method968(Static37.anIntArray195[local20]);
						} else {
							local889 = local853 ? Static99.aClass1_Sub2_Sub14_6 : Static57.aClass1_Sub2_Sub14_7;
						}
						local27--;
						local1197 = Static67.aClass25Array7[local27];
						@Pc(1206) Object[] local1206 = new Object[local1197.method762() + 1];
						for (local584 = local1206.length - 1; local584 >= 1; local584--) {
							if (local1197.method767(local584 - 1) == 115) {
								local27--;
								local1206[local584] = Static67.aClass25Array7[local27];
							} else {
								local20--;
								local1206[local584] = Integer.valueOf(Static37.anIntArray195[local20]);
							}
						}
						local20--;
						local605 = Static37.anIntArray195[local20];
						if (local605 == -1) {
							local1206 = null;
						} else {
							local1206[0] = Integer.valueOf(local605);
						}
						if (local170 == 1408) {
							local889.anObjectArray6 = local1206;
						}
						if (local170 == 1415) {
							local889.anObjectArray17 = local1206;
						}
						if (local170 == 1406) {
							local889.anObjectArray10 = local1206;
						}
						if (local170 == 1409) {
							local889.anObjectArray18 = local1206;
						}
						if (local170 == 1416) {
							local889.anObjectArray11 = local1206;
						}
						if (local170 == 1405) {
							local889.anObjectArray19 = local1206;
						}
						if (local170 == 1403) {
							local889.anObjectArray16 = local1206;
						}
						if (local170 == 1414) {
							local889.anObjectArray9 = local1206;
						}
						if (local170 == 1402) {
							local889.anObjectArray7 = local1206;
						}
						local889.aBoolean92 = true;
						if (local170 == 1417) {
							local889.anObjectArray8 = local1206;
						}
						if (local170 == 1413) {
							local889.anObjectArray12 = local1206;
						}
						if (local170 == 1407) {
							local889.anObjectArray15 = local1206;
						}
						if (local170 == 1412) {
							local889.anObjectArray5 = local1206;
						}
						if (local170 == 1410) {
							local889.anObjectArray13 = local1206;
						}
						if (local170 == 1401) {
							local889.anObjectArray3 = local1206;
						}
						if (local170 == 1411) {
							local889.anObjectArray4 = local1206;
						}
						if (local170 == 1404) {
							local889.anObjectArray21 = local1206;
						}
						if (local170 == 1400) {
							local889.anObjectArray20 = local1206;
						}
						continue;
					}
					if (local170 < 1600) {
						local889 = local853 ? Static99.aClass1_Sub2_Sub14_6 : Static57.aClass1_Sub2_Sub14_7;
						if (local170 == 1500) {
							Static37.anIntArray195[local20++] = local889.anInt1959;
							continue;
						}
						if (local170 == 1501) {
							Static37.anIntArray195[local20++] = local889.anInt1917;
							continue;
						}
						if (local170 == 1502) {
							Static37.anIntArray195[local20++] = local889.anInt1911;
							continue;
						}
						if (local170 == 1503) {
							Static37.anIntArray195[local20++] = local889.anInt1923;
							continue;
						}
						if (local170 == 1504) {
							Static37.anIntArray195[local20++] = local889.aBoolean89 ? 1 : 0;
							continue;
						}
						if (local170 == 1505) {
							Static37.anIntArray195[local20++] = local889.anInt1905;
							continue;
						}
					} else if (local170 < 1700) {
						local889 = local853 ? Static99.aClass1_Sub2_Sub14_6 : Static57.aClass1_Sub2_Sub14_7;
						if (local170 == 1600) {
							Static37.anIntArray195[local20++] = local889.anInt1949;
							continue;
						}
						if (local170 == 1601) {
							Static37.anIntArray195[local20++] = local889.anInt1957;
							continue;
						}
						if (local170 == 1602) {
							Static67.aClass25Array7[local27++] = local889.aClass25_941;
							continue;
						}
						if (local170 == 1603) {
							Static37.anIntArray195[local20++] = local889.anInt1900;
							continue;
						}
						if (local170 == 1604) {
							Static37.anIntArray195[local20++] = local889.anInt1912;
							continue;
						}
						if (local170 == 1605) {
							Static37.anIntArray195[local20++] = local889.anInt1962;
							continue;
						}
						if (local170 == 1606) {
							Static37.anIntArray195[local20++] = local889.anInt1902;
							continue;
						}
						if (local170 == 1607) {
							Static37.anIntArray195[local20++] = local889.anInt1935;
							continue;
						}
						if (local170 == 1608) {
							Static37.anIntArray195[local20++] = local889.anInt1924;
							continue;
						}
					} else if (local170 < 1800) {
						local889 = local853 ? Static99.aClass1_Sub2_Sub14_6 : Static57.aClass1_Sub2_Sub14_7;
						if (local170 == 1700) {
							Static37.anIntArray195[local20++] = local889.anInt1904;
							continue;
						}
						if (local170 == 1701) {
							if (local889.anInt1904 == -1) {
								Static37.anIntArray195[local20++] = 0;
							} else {
								Static37.anIntArray195[local20++] = local889.anInt1903;
							}
							continue;
						}
						if (local170 == 1702) {
							Static37.anIntArray195[local20++] = local889.anInt1942;
							continue;
						}
					} else if (local170 < 1900) {
						local889 = local853 ? Static99.aClass1_Sub2_Sub14_6 : Static57.aClass1_Sub2_Sub14_7;
						if (local170 == 1800) {
							Static37.anIntArray195[local20++] = Static58.method1057(Static77.method1300(local889));
							continue;
						}
						if (local170 == 1801) {
							local20--;
							local726 = Static37.anIntArray195[local20];
							if (local889.aClass25Array17 != null && local726 < local889.aClass25Array17.length && local889.aClass25Array17[local726] != null) {
								Static67.aClass25Array7[local27++] = local889.aClass25Array17[local726];
								continue;
							}
							Static67.aClass25Array7[local27++] = Static49.aClass25_510;
							continue;
						}
						if (local170 == 1802) {
							if (local889.aClass25_939 == null) {
								Static67.aClass25Array7[local27++] = Static49.aClass25_510;
							} else {
								Static67.aClass25Array7[local27++] = local889.aClass25_939;
							}
							continue;
						}
					} else if (local170 < 2600) {
						local20--;
						local889 = Static46.method968(Static37.anIntArray195[local20]);
						if (local170 == 2500) {
							Static37.anIntArray195[local20++] = local889.anInt1959;
							continue;
						}
						if (local170 == 2501) {
							Static37.anIntArray195[local20++] = local889.anInt1917;
							continue;
						}
						if (local170 == 2502) {
							Static37.anIntArray195[local20++] = local889.anInt1911;
							continue;
						}
						if (local170 == 2503) {
							Static37.anIntArray195[local20++] = local889.anInt1923;
							continue;
						}
						if (local170 == 2504) {
							Static37.anIntArray195[local20++] = local889.aBoolean89 ? 1 : 0;
							continue;
						}
						if (local170 == 2505) {
							Static37.anIntArray195[local20++] = local889.anInt1905;
							continue;
						}
					} else if (local170 < 2700) {
						local20--;
						local889 = Static46.method968(Static37.anIntArray195[local20]);
						if (local170 == 2600) {
							Static37.anIntArray195[local20++] = local889.anInt1949;
							continue;
						}
						if (local170 == 2601) {
							Static37.anIntArray195[local20++] = local889.anInt1957;
							continue;
						}
						if (local170 == 2602) {
							Static67.aClass25Array7[local27++] = local889.aClass25_941;
							continue;
						}
						if (local170 == 2603) {
							Static37.anIntArray195[local20++] = local889.anInt1900;
							continue;
						}
						if (local170 == 2604) {
							Static37.anIntArray195[local20++] = local889.anInt1912;
							continue;
						}
						if (local170 == 2605) {
							Static37.anIntArray195[local20++] = local889.anInt1962;
							continue;
						}
						if (local170 == 2606) {
							Static37.anIntArray195[local20++] = local889.anInt1902;
							continue;
						}
						if (local170 == 2607) {
							Static37.anIntArray195[local20++] = local889.anInt1935;
							continue;
						}
						if (local170 == 2608) {
							Static37.anIntArray195[local20++] = local889.anInt1924;
							continue;
						}
					} else if (local170 < 2800) {
						local20--;
						local889 = Static46.method968(Static37.anIntArray195[local20]);
						if (local170 == 2700) {
							Static37.anIntArray195[local20++] = local889.anInt1904;
							continue;
						}
						if (local170 == 2701) {
							if (local889.anInt1904 == -1) {
								Static37.anIntArray195[local20++] = 0;
							} else {
								Static37.anIntArray195[local20++] = local889.anInt1903;
							}
							continue;
						}
					} else if (local170 < 2900) {
						local20--;
						local889 = Static46.method968(Static37.anIntArray195[local20]);
						if (local170 == 2800) {
							Static37.anIntArray195[local20++] = Static58.method1057(Static77.method1300(local889));
							continue;
						}
						if (local170 == 2801) {
							local20--;
							local726 = Static37.anIntArray195[local20];
							if (local889.aClass25Array17 != null && local726 < local889.aClass25Array17.length && local889.aClass25Array17[local726] != null) {
								Static67.aClass25Array7[local27++] = local889.aClass25Array17[local726];
								continue;
							}
							Static67.aClass25Array7[local27++] = Static49.aClass25_510;
							continue;
						}
						if (local170 == 2802) {
							if (local889.aClass25_939 == null) {
								Static67.aClass25Array7[local27++] = Static49.aClass25_510;
							} else {
								Static67.aClass25Array7[local27++] = local889.aClass25_939;
							}
							continue;
						}
					} else if (local170 < 3200) {
						if (local170 == 3100) {
							local27--;
							local540 = Static67.aClass25Array7[local27];
							Static25.method584(0, local540, Static49.aClass25_510);
							continue;
						}
						if (local170 == 3101) {
							local20 -= 2;
							Static24.method574(Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1, Static37.anIntArray195[local20], Static37.anIntArray195[local20 + 1]);
							continue;
						}
						if (local170 == 3102) {
							local20--;
							local721 = Static37.anIntArray195[local20];
							if (local721 >= 0 && Static22.anIntArray162.length > local721 && Static22.anIntArray162[local721] != -1) {
								Static90.anInt2027 = local721;
								Static120.aBoolean126 = true;
								Static90.aBoolean98 = true;
							}
							continue;
						}
						if (local170 == 3103) {
							Static9.method238();
							continue;
						}
					} else if (local170 < 3300) {
						if (local170 == 3200) {
							local20 -= 3;
							Static25.method590(Static37.anIntArray195[local20], Static37.anIntArray195[local20 + 2], Static37.anIntArray195[local20 + 1]);
							continue;
						}
						if (local170 == 3201) {
							local20--;
							Static74.method1215(Static37.anIntArray195[local20]);
							continue;
						}
						if (local170 == 3202) {
							local20 -= 2;
							Static5.method98(Static37.anIntArray195[local20 + 1], Static37.anIntArray195[local20]);
							continue;
						}
					} else if (local170 < 3400) {
						if (local170 == 3300) {
							Static37.anIntArray195[local20++] = Static60.anInt1366;
							continue;
						}
						if (local170 == 3301) {
							local20 -= 2;
							local721 = Static37.anIntArray195[local20];
							local726 = Static37.anIntArray195[local20 + 1];
							Static37.anIntArray195[local20++] = Static67.method1136(local721, local726);
							continue;
						}
						if (local170 == 3302) {
							local20 -= 2;
							local721 = Static37.anIntArray195[local20];
							local726 = Static37.anIntArray195[local20 + 1];
							Static37.anIntArray195[local20++] = Static100.method1656(local726, local721);
							continue;
						}
						if (local170 == 3303) {
							local20 -= 2;
							local726 = Static37.anIntArray195[local20 + 1];
							local721 = Static37.anIntArray195[local20];
							Static37.anIntArray195[local20++] = Static2.method31(local721, local726);
							continue;
						}
						if (local170 == 3304) {
							local20--;
							local721 = Static37.anIntArray195[local20];
							Static37.anIntArray195[local20++] = Static68.method1142(local721).anInt1390;
							continue;
						}
						if (local170 == 3305) {
							local20--;
							local721 = Static37.anIntArray195[local20];
							Static37.anIntArray195[local20++] = Static15.anIntArray79[local721];
							continue;
						}
						if (local170 == 3306) {
							local20--;
							local721 = Static37.anIntArray195[local20];
							Static37.anIntArray195[local20++] = Static50.anIntArray245[local721];
							continue;
						}
						if (local170 == 3307) {
							local20--;
							local721 = Static37.anIntArray195[local20];
							Static37.anIntArray195[local20++] = Static120.anIntArray487[local721];
							continue;
						}
						if (local170 == 3308) {
							local721 = Static21.anInt596;
							local726 = Static46.anInt1190 + (Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2832 >> 7);
							local1079 = (Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2827 >> 7) + Static47.anInt1211;
							Static37.anIntArray195[local20++] = local1079 + (local721 << 28) + (local726 << 14);
							continue;
						}
						if (local170 == 3309) {
							local20--;
							local721 = Static37.anIntArray195[local20];
							Static37.anIntArray195[local20++] = local721 >> 14 & 0x3FFF;
							continue;
						}
						if (local170 == 3310) {
							local20--;
							local721 = Static37.anIntArray195[local20];
							Static37.anIntArray195[local20++] = local721 >> 28;
							continue;
						}
						if (local170 == 3311) {
							local20--;
							local721 = Static37.anIntArray195[local20];
							Static37.anIntArray195[local20++] = local721 & 0x3FFF;
							continue;
						}
						if (local170 == 3312) {
							Static37.anIntArray195[local20++] = Static23.aBoolean21 ? 1 : 0;
							continue;
						}
						if (local170 == 3313) {
							local20 -= 2;
							local726 = Static37.anIntArray195[local20 + 1];
							local721 = Static37.anIntArray195[local20] + 32768;
							Static37.anIntArray195[local20++] = Static67.method1136(local721, local726);
							continue;
						}
						if (local170 == 3314) {
							local20 -= 2;
							local721 = Static37.anIntArray195[local20] + 32768;
							local726 = Static37.anIntArray195[local20 + 1];
							Static37.anIntArray195[local20++] = Static100.method1656(local726, local721);
							continue;
						}
						if (local170 == 3315) {
							local20 -= 2;
							local721 = Static37.anIntArray195[local20] + 32768;
							local726 = Static37.anIntArray195[local20 + 1];
							Static37.anIntArray195[local20++] = Static2.method31(local721, local726);
							continue;
						}
					} else if (local170 < 3500) {
						if (local170 == 3400) {
							local20 -= 2;
							local721 = Static37.anIntArray195[local20];
							local726 = Static37.anIntArray195[local20 + 1];
							@Pc(2183) Class1_Sub2_Sub7 local2183 = Static13.method343(local721);
							for (local584 = 0; local584 < local2183.anInt903; local584++) {
								if (local726 == local2183.anIntArray175[local584]) {
									Static67.aClass25Array7[local27++] = local2183.aClass25Array5[local584];
									local2183 = null;
									break;
								}
							}
							if (local2183 != null) {
								Static67.aClass25Array7[local27++] = local2183.aClass25_384;
							}
							continue;
						}
						if (local170 == 3408) {
							local20 -= 4;
							local726 = Static37.anIntArray195[local20 + 1];
							local1079 = Static37.anIntArray195[local20 + 2];
							local721 = Static37.anIntArray195[local20];
							local584 = Static37.anIntArray195[local20 + 3];
							@Pc(2257) Class1_Sub2_Sub7 local2257 = Static13.method343(local1079);
							if (local721 == local2257.anInt904 && local2257.anInt899 == local726) {
								for (local2288 = 0; local2288 < local2257.anInt903; local2288++) {
									if (local2257.anIntArray175[local2288] == local584) {
										if (local726 == 115) {
											Static67.aClass25Array7[local27++] = local2257.aClass25Array5[local2288];
										} else {
											Static37.anIntArray195[local20++] = local2257.anIntArray176[local2288];
										}
										local2257 = null;
										break;
									}
								}
								if (local2257 != null) {
									if (local726 == 115) {
										Static67.aClass25Array7[local27++] = local2257.aClass25_384;
									} else {
										Static37.anIntArray195[local20++] = local2257.anInt896;
									}
								}
								continue;
							}
							if (local726 == 115) {
								Static67.aClass25Array7[local27++] = Static52.aClass25_539;
							} else {
								Static37.anIntArray195[local20++] = 0;
							}
							continue;
						}
					} else if (local170 < 3700) {
						if (local170 == 3600) {
							if (Static50.anInt1235 == 0) {
								Static37.anIntArray195[local20++] = -2;
							} else if (Static50.anInt1235 == 1) {
								Static37.anIntArray195[local20++] = -1;
							} else {
								Static37.anIntArray195[local20++] = Static80.anInt1786;
							}
							continue;
						}
						if (local170 == 3601) {
							local20--;
							local721 = Static37.anIntArray195[local20];
							if (Static50.anInt1235 == 2 && local721 < Static80.anInt1786) {
								Static67.aClass25Array7[local27++] = Static118.aClass25Array22[local721];
								continue;
							}
							Static67.aClass25Array7[local27++] = Static49.aClass25_510;
							continue;
						}
						if (local170 == 3602) {
							local20--;
							local721 = Static37.anIntArray195[local20];
							if (Static50.anInt1235 == 2 && local721 < Static80.anInt1786) {
								Static37.anIntArray195[local20++] = Static47.anIntArray241[local721];
								continue;
							}
							Static37.anIntArray195[local20++] = 0;
							continue;
						}
						if (local170 == 3603) {
							local20--;
							local721 = Static37.anIntArray195[local20];
							if (Static50.anInt1235 == 2 && Static80.anInt1786 > local721) {
								Static37.anIntArray195[local20++] = Static3.anIntArray12[local721];
								continue;
							}
							Static37.anIntArray195[local20++] = 0;
							continue;
						}
						if (local170 == 3604) {
							local27--;
							local540 = Static67.aClass25Array7[local27];
							local20--;
							local726 = Static37.anIntArray195[local20];
							Static76.method1236(local540, local726);
							continue;
						}
						if (local170 == 3611) {
							if (Static22.aClass25_341 == null) {
								Static67.aClass25Array7[local27++] = Static49.aClass25_510;
							} else {
								Static67.aClass25Array7[local27++] = Static22.aClass25_341;
							}
							continue;
						}
						if (local170 == 3612) {
							if (Static22.aClass25_341 == null) {
								Static37.anIntArray195[local20++] = 0;
							} else {
								Static37.anIntArray195[local20++] = Static42.anInt1134;
							}
							continue;
						}
						if (local170 == 3613) {
							local20--;
							local721 = Static37.anIntArray195[local20];
							if (Static22.aClass25_341 != null && local721 < Static42.anInt1134) {
								Static67.aClass25Array7[local27++] = Static82.aClass1_Sub11Array1[local721].aClass25_646;
								continue;
							}
							Static67.aClass25Array7[local27++] = Static49.aClass25_510;
							continue;
						}
						if (local170 == 3614) {
							local20--;
							local721 = Static37.anIntArray195[local20];
							if (Static22.aClass25_341 != null && local721 < Static42.anInt1134) {
								Static37.anIntArray195[local20++] = Static82.aClass1_Sub11Array1[local721].anInt1413;
								continue;
							}
							Static37.anIntArray195[local20++] = 0;
							continue;
						}
						if (local170 == 3615) {
							local20--;
							local721 = Static37.anIntArray195[local20];
							if (Static22.aClass25_341 != null && local721 < Static42.anInt1134) {
								Static37.anIntArray195[local20++] = Static82.aClass1_Sub11Array1[local721].aByte3;
								continue;
							}
							Static37.anIntArray195[local20++] = 0;
							continue;
						}
					} else if (local170 < 4100) {
						if (local170 == 4000) {
							local20 -= 2;
							local726 = Static37.anIntArray195[local20 + 1];
							local721 = Static37.anIntArray195[local20];
							Static37.anIntArray195[local20++] = local726 + local721;
							continue;
						}
						if (local170 == 4001) {
							local20 -= 2;
							local721 = Static37.anIntArray195[local20];
							local726 = Static37.anIntArray195[local20 + 1];
							Static37.anIntArray195[local20++] = local721 - local726;
							continue;
						}
						if (local170 == 4002) {
							local20 -= 2;
							local726 = Static37.anIntArray195[local20 + 1];
							local721 = Static37.anIntArray195[local20];
							Static37.anIntArray195[local20++] = local721 * local726;
							continue;
						}
						if (local170 == 4003) {
							local20 -= 2;
							local721 = Static37.anIntArray195[local20];
							local726 = Static37.anIntArray195[local20 + 1];
							Static37.anIntArray195[local20++] = local721 / local726;
							continue;
						}
						if (local170 == 4004) {
							local20--;
							local721 = Static37.anIntArray195[local20];
							Static37.anIntArray195[local20++] = (int) (Math.random() * (double) local721);
							continue;
						}
						if (local170 == 4005) {
							local20--;
							local721 = Static37.anIntArray195[local20];
							Static37.anIntArray195[local20++] = (int) (Math.random() * (double) (local721 + 1));
							continue;
						}
						if (local170 == 4006) {
							local20 -= 5;
							local726 = Static37.anIntArray195[local20 + 1];
							local721 = Static37.anIntArray195[local20];
							local1079 = Static37.anIntArray195[local20 + 2];
							local605 = Static37.anIntArray195[local20 + 4];
							local584 = Static37.anIntArray195[local20 + 3];
							Static37.anIntArray195[local20++] = (local605 - local1079) * (-local721 + local726) / (local584 - local1079) + local721;
							continue;
						}
						if (local170 == 4007) {
							local20 -= 2;
							local721 = Static37.anIntArray195[local20];
							local726 = Static37.anIntArray195[local20 + 1];
							Static37.anIntArray195[local20++] = local721 + local721 * local726 / 100;
							continue;
						}
						if (local170 == 4008) {
							local20 -= 2;
							local726 = Static37.anIntArray195[local20 + 1];
							local721 = Static37.anIntArray195[local20];
							Static37.anIntArray195[local20++] = 0x1 << local726 | local721;
							continue;
						}
						if (local170 == 4009) {
							local20 -= 2;
							local721 = Static37.anIntArray195[local20];
							local726 = Static37.anIntArray195[local20 + 1];
							Static37.anIntArray195[local20++] = -(0x1 << local726) - 1 & local721;
							continue;
						}
						if (local170 == 4010) {
							local20 -= 2;
							local721 = Static37.anIntArray195[local20];
							local726 = Static37.anIntArray195[local20 + 1];
							Static37.anIntArray195[local20++] = (0x1 << local726 & local721) == 0 ? 0 : 1;
							continue;
						}
						if (local170 == 4011) {
							local20 -= 2;
							local721 = Static37.anIntArray195[local20];
							local726 = Static37.anIntArray195[local20 + 1];
							Static37.anIntArray195[local20++] = local721 % local726;
							continue;
						}
						if (local170 == 4012) {
							local20 -= 2;
							local721 = Static37.anIntArray195[local20];
							local726 = Static37.anIntArray195[local20 + 1];
							if (local721 == 0) {
								Static37.anIntArray195[local20++] = 0;
							} else {
								Static37.anIntArray195[local20++] = (int) Math.pow((double) local721, (double) local726);
							}
							continue;
						}
						if (local170 == 4013) {
							local20 -= 2;
							local726 = Static37.anIntArray195[local20 + 1];
							local721 = Static37.anIntArray195[local20];
							if (local721 == 0) {
								Static37.anIntArray195[local20++] = 0;
							} else if (local726 == 0) {
								Static37.anIntArray195[local20++] = Integer.MAX_VALUE;
							} else {
								Static37.anIntArray195[local20++] = (int) Math.pow((double) local721, 1.0D / (double) local726);
							}
							continue;
						}
						if (local170 == 4014) {
							local20 -= 2;
							local721 = Static37.anIntArray195[local20];
							local726 = Static37.anIntArray195[local20 + 1];
							Static37.anIntArray195[local20++] = local721 & local726;
							continue;
						}
						if (local170 == 4015) {
							local20 -= 2;
							local721 = Static37.anIntArray195[local20];
							local726 = Static37.anIntArray195[local20 + 1];
							Static37.anIntArray195[local20++] = local726 | local721;
							continue;
						}
					} else if (local170 < 4200) {
						if (local170 == 4100) {
							local20--;
							local726 = Static37.anIntArray195[local20];
							local27--;
							local540 = Static67.aClass25Array7[local27];
							Static67.aClass25Array7[local27++] = Static116.method1859(new Class25[] { local540, Static74.method1214(local726) });
							continue;
						}
						if (local170 == 4101) {
							local27 -= 2;
							local540 = Static67.aClass25Array7[local27];
							local1197 = Static67.aClass25Array7[local27 + 1];
							Static67.aClass25Array7[local27++] = Static116.method1859(new Class25[] { local540, local1197 });
							continue;
						}
						if (local170 == 4102) {
							local27--;
							local540 = Static67.aClass25Array7[local27];
							local20--;
							local726 = Static37.anIntArray195[local20];
							Static67.aClass25Array7[local27++] = Static116.method1859(new Class25[] { local540, Static16.method376(local726) });
							continue;
						}
						if (local170 == 4103) {
							local27--;
							local540 = Static67.aClass25Array7[local27];
							Static67.aClass25Array7[local27++] = local540.method777();
							continue;
						}
						if (local170 == 4104) {
							local20--;
							local721 = Static37.anIntArray195[local20];
							@Pc(3066) long local3066 = (long) local721 * 86400000L + 1014768000000L;
							Static59.aCalendar1.setTime(new Date(local3066));
							local584 = Static59.aCalendar1.get(5);
							local605 = Static59.aCalendar1.get(2);
							local2288 = Static59.aCalendar1.get(1);
							Static67.aClass25Array7[local27++] = Static116.method1859(new Class25[] { Static74.method1214(local584), Static33.aClass25_385, Static83.aClass25Array13[local605], Static33.aClass25_385, Static74.method1214(local2288) });
							continue;
						}
						if (local170 == 4105) {
							local27 -= 2;
							local540 = Static67.aClass25Array7[local27];
							local1197 = Static67.aClass25Array7[local27 + 1];
							if (Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.aClass75_2 != null && Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.aClass75_2.aBoolean119) {
								Static67.aClass25Array7[local27++] = local1197;
								continue;
							}
							Static67.aClass25Array7[local27++] = local540;
							continue;
						}
						if (local170 == 4106) {
							local20--;
							local721 = Static37.anIntArray195[local20];
							Static67.aClass25Array7[local27++] = Static74.method1214(local721);
							continue;
						}
						if (local170 == 4107) {
							local27 -= 2;
							Static37.anIntArray195[local20++] = Static67.aClass25Array7[local27].method780(Static67.aClass25Array7[local27 + 1]);
							continue;
						}
						@Pc(3221) byte[] local3221;
						@Pc(3226) Class1_Sub2_Sub2_Sub3 local3226;
						if (local170 == 4108) {
							local20 -= 2;
							local726 = Static37.anIntArray195[local20];
							local27--;
							local540 = Static67.aClass25Array7[local27];
							local1079 = Static37.anIntArray195[local20 + 1];
							local3221 = Static111.aClass56_Sub1_18.method1269(local1079, 0);
							local3226 = new Class1_Sub2_Sub2_Sub3(local3221);
							Static37.anIntArray195[local20++] = local3226.method1198(local540, local726);
							continue;
						}
						if (local170 == 4109) {
							local27--;
							local540 = Static67.aClass25Array7[local27];
							local20 -= 2;
							local726 = Static37.anIntArray195[local20];
							local1079 = Static37.anIntArray195[local20 + 1];
							local3221 = Static111.aClass56_Sub1_18.method1269(local1079, 0);
							local3226 = new Class1_Sub2_Sub2_Sub3(local3221);
							Static37.anIntArray195[local20++] = local3226.method1186(local540, local726);
							continue;
						}
						if (local170 == 4110) {
							local27 -= 2;
							local540 = Static67.aClass25Array7[local27];
							local1197 = Static67.aClass25Array7[local27 + 1];
							local20--;
							if (Static37.anIntArray195[local20] == 1) {
								Static67.aClass25Array7[local27++] = local540;
							} else {
								Static67.aClass25Array7[local27++] = local1197;
							}
							continue;
						}
					} else if (local170 < 4300) {
						if (local170 == 4200) {
							local20--;
							local721 = Static37.anIntArray195[local20];
							Static67.aClass25Array7[local27++] = Static33.method736(local721).aClass25_1018;
							continue;
						}
						@Pc(2699) Class1_Sub2_Sub16 local2699;
						if (local170 == 4201) {
							local20 -= 2;
							local721 = Static37.anIntArray195[local20];
							local726 = Static37.anIntArray195[local20 + 1];
							local2699 = Static33.method736(local721);
							if (local726 >= 1 && local726 <= 5 && local2699.aClass25Array18[local726 - 1] != null) {
								Static67.aClass25Array7[local27++] = local2699.aClass25Array18[local726 - 1];
								continue;
							}
							Static67.aClass25Array7[local27++] = Static49.aClass25_510;
							continue;
						}
						if (local170 == 4202) {
							local20 -= 2;
							local721 = Static37.anIntArray195[local20];
							local726 = Static37.anIntArray195[local20 + 1];
							local2699 = Static33.method736(local721);
							if (local726 >= 1 && local726 <= 5 && local2699.aClass25Array19[local726 - 1] != null) {
								Static67.aClass25Array7[local27++] = local2699.aClass25Array19[local726 - 1];
								continue;
							}
							Static67.aClass25Array7[local27++] = Static49.aClass25_510;
							continue;
						}
						if (local170 == 4203) {
							local20--;
							local721 = Static37.anIntArray195[local20];
							Static37.anIntArray195[local20++] = Static33.method736(local721).anInt2149;
							continue;
						}
						if (local170 == 4204) {
							local20--;
							local721 = Static37.anIntArray195[local20];
							Static37.anIntArray195[local20++] = Static33.method736(local721).anInt2152 == 1 ? 1 : 0;
							continue;
						}
						@Pc(2848) Class1_Sub2_Sub16 local2848;
						if (local170 == 4205) {
							local20--;
							local721 = Static37.anIntArray195[local20];
							local2848 = Static33.method736(local721);
							if (local2848.anInt2147 == -1 && local2848.anInt2144 >= 0) {
								Static37.anIntArray195[local20++] = local2848.anInt2144;
								continue;
							}
							Static37.anIntArray195[local20++] = local721;
							continue;
						}
						if (local170 == 4206) {
							local20--;
							local721 = Static37.anIntArray195[local20];
							local2848 = Static33.method736(local721);
							if (local2848.anInt2147 >= 0 && local2848.anInt2144 >= 0) {
								Static37.anIntArray195[local20++] = local2848.anInt2144;
								continue;
							}
							Static37.anIntArray195[local20++] = local721;
							continue;
						}
						if (local170 == 4207) {
							local20--;
							local721 = Static37.anIntArray195[local20];
							Static37.anIntArray195[local20++] = Static33.method736(local721).aBoolean104 ? 1 : 0;
							continue;
						}
					}
				}
				Static120.method1980("CS2 - nosuchop:" + local170, null);
				return;
			}
		} catch (@Pc(4988) Exception local4988) {
			Static120.method1980("CS2 - scr:" + local15.aLong184 + " op:" + local34, local4988);
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
	public static void method601() {
		@Pc(7) int local7 = Static81.anInt1798;
		@Pc(9) int local9 = Static39.anInt1094;
		@Pc(11) int local11 = Static123.anInt2888;
		@Pc(13) int local13 = Static101.anInt2344;
		Static128.method1935(local9, local7, local11, local13, 6116423);
		Static128.method1935(local9 + 1, local7 + 1, local11 - 2, 16, 0);
		Static128.method1938(local9 + 1, local7 + 18, local11 - 2, local13 + -19, 0);
		Static83.aClass1_Sub2_Sub2_Sub3_3.method1180(Static111.aClass25_1251, local9 + 3, local7 + 14, 6116423, -1);
		@Pc(60) int local60 = Static111.anInt2597;
		@Pc(62) int local62 = Static10.anInt264;
		if (Static42.anInt1133 == 0) {
			local62 -= 4;
			local60 -= 4;
		}
		if (Static42.anInt1133 == 1) {
			local60 -= 205;
			local62 -= 553;
		}
		if (Static42.anInt1133 == 2) {
			local62 -= 17;
			local60 -= 357;
		}
		for (@Pc(87) int local87 = 0; local87 < Static108.anInt2503; local87++) {
			@Pc(103) int local103 = local7 + (-local87 + -1 + Static108.anInt2503) * 15 + 31;
			@Pc(105) int local105 = 16777215;
			if (local62 > local9 && local11 + local9 > local62 && local60 > local103 - 13 && local103 + 3 > local60) {
				local105 = 16776960;
			}
			Static83.aClass1_Sub2_Sub2_Sub3_3.method1180(Static84.aClass25Array14[local87], local9 + 3, local103, local105, 0);
		}
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V")
	public static void method602() {
		Static116.aClass63_24.method1513();
		Static99.aClass63_19.method1513();
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZ)V")
	public static void method603(@OriginalArg(1) boolean arg0) {
		if (Static18.aClass77_3 == null) {
			return;
		}
		try {
			@Pc(11) Class1_Sub5 local11 = new Class1_Sub5(4);
			local11.method676(arg0 ? 2 : 3);
			local11.method659(0);
			Static18.aClass77_3.method1904(4, local11.aByteArray13);
		} catch (@Pc(37) IOException local37) {
			try {
				Static18.aClass77_3.method1909();
			} catch (@Pc(42) Exception local42) {
			}
			Static18.aClass77_3 = null;
			Static21.anInt590++;
		}
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
	public static void method604() {
		aClass25_334 = null;
		aClass25_330 = null;
		aClass56_26 = null;
		aClass25_329 = null;
		aClass25_332 = null;
		aClass25_333 = null;
		aClass50_2 = null;
		aClass25_328 = null;
		aClass25_331 = null;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/lang/Object;ZI)[B")
	public static byte[] method605(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg0;
			return arg1 ? Static95.method1597(local13) : local13;
		} else if (arg0 instanceof Class37) {
			@Pc(27) Class37 local27 = (Class37) arg0;
			return local27.method1778();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
