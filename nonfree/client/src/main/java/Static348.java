import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!wj", name = "J", descriptor = "[[Lclient!jf;")
	public static Class96[][] aClass96ArrayArray1;

	@OriginalMember(owner = "client!wj", name = "M", descriptor = "Lclient!ep;")
	public static Class60 aClass60_8;

	@OriginalMember(owner = "client!wj", name = "P", descriptor = "Ljava/lang/String;")
	public static String aString375 = "Allocated memory";

	@OriginalMember(owner = "client!wj", name = "h", descriptor = "(I)I")
	public static int method5750() {
		if (Static188.aBoolean264 || Static27.anInt5324 <= 0) {
			@Pc(16) int local16 = Static270.anInt5171;
			@Pc(18) int local18 = Static274.anInt5378;
			@Pc(20) int local20 = Static303.anInt5839;
			@Pc(22) int local22 = Static279.anInt5429;
			@Pc(24) int local24 = Static144.anInt2967;
			if (local16 > local20 && local20 + local24 > local16) {
				@Pc(43) int local43 = -1;
				@Pc(62) int local62;
				for (@Pc(45) int local45 = 0; local45 < Static27.anInt5324; local45++) {
					if (Static171.aBoolean254) {
						local62 = local22 + (Static27.anInt5324 - local45 + -1) * 16 + 33;
						if (local18 > local62 - 13 && local62 + 3 >= local18) {
							local43 = local45;
						}
					} else {
						local62 = (Static27.anInt5324 - local45 - 1) * 16 + local22 + 31;
						if (local18 > local62 - 13 && local62 + 3 >= local18) {
							local43 = local45;
						}
					}
				}
				if (local43 != -1) {
					local62 = 0;
					@Pc(126) Class191 local126 = new Class191(Static60.aClass211_4);
					for (@Pc(131) Class5_Sub4 local131 = (Class5_Sub4) local126.method5238(); local131 != null; local131 = (Class5_Sub4) local126.method5235()) {
						if (local43 == local62++) {
							return local131.anInt784;
						}
					}
				}
			}
			return -1;
		} else if (Static7.aBoolean6 && Static233.aBooleanArray19[81] && Static27.anInt5324 > 2) {
			return ((Class5_Sub4) Static60.aClass211_4.aClass5_235.aClass5_248.aClass5_248).anInt784;
		} else {
			return ((Class5_Sub4) Static60.aClass211_4.aClass5_235.aClass5_248).anInt784;
		}
	}

	@OriginalMember(owner = "client!wj", name = "i", descriptor = "(I)Z")
	public static boolean method5751() throws IOException {
		if (Static95.aClass68_23 == null) {
			return false;
		}
		@Pc(13) int local13 = Static95.aClass68_23.method1999();
		if (local13 == 0) {
			return false;
		}
		if (Static1.anInt4 == -1) {
			Static95.aClass68_23.method1993(Static6.aClass5_Sub1_Sub1_1.aByteArray18, 1, 0);
			Static6.aClass5_Sub1_Sub1_1.anInt2029 = 0;
			Static1.anInt4 = Static6.aClass5_Sub1_Sub1_1.method181();
			local13--;
			Static179.anInt3568 = Static215.anIntArray303[Static1.anInt4];
		}
		if (Static179.anInt3568 == -1) {
			if (local13 <= 0) {
				return false;
			}
			Static95.aClass68_23.method1993(Static6.aClass5_Sub1_Sub1_1.aByteArray18, 1, 0);
			local13--;
			Static179.anInt3568 = Static6.aClass5_Sub1_Sub1_1.aByteArray18[0] & 0xFF;
		}
		if (Static179.anInt3568 == -2) {
			if (local13 <= 1) {
				return false;
			}
			Static95.aClass68_23.method1993(Static6.aClass5_Sub1_Sub1_1.aByteArray18, 2, 0);
			Static6.aClass5_Sub1_Sub1_1.anInt2029 = 0;
			local13 -= 2;
			Static179.anInt3568 = Static6.aClass5_Sub1_Sub1_1.method1845();
		}
		if (Static179.anInt3568 > local13) {
			return false;
		}
		Static6.aClass5_Sub1_Sub1_1.anInt2029 = 0;
		Static95.aClass68_23.method1993(Static6.aClass5_Sub1_Sub1_1.aByteArray18, Static179.anInt3568, 0);
		Static316.anInt6045 = Static161.anInt3248;
		Static12.anInt371 = 0;
		Static161.anInt3248 = Static335.anInt6325;
		Static335.anInt6325 = Static1.anInt4;
		@Pc(136) int local136;
		@Pc(140) int local140;
		@Pc(167) int local167;
		@Pc(144) int local144;
		if (Static1.anInt4 == 67) {
			local136 = Static6.aClass5_Sub1_Sub1_1.method1867();
			local140 = Static6.aClass5_Sub1_Sub1_1.method1875();
			local144 = Static6.aClass5_Sub1_Sub1_1.method1832();
			if (Static295.method4992(local140)) {
				if (local144 == 2) {
					Static322.method5428();
				}
				Static207.anInt4106 = local136;
				Static62.method1263(local136);
				Static101.method2032(false);
				Static223.method3892(Static207.anInt4106);
				for (local167 = 0; local167 < 100; local167++) {
					Static293.aBooleanArray25[local167] = true;
				}
			}
			Static1.anInt4 = -1;
			return true;
		} else if (Static1.anInt4 == 104) {
			local136 = Static6.aClass5_Sub1_Sub1_1.method1828();
			local140 = Static6.aClass5_Sub1_Sub1_1.method1845();
			local144 = Static6.aClass5_Sub1_Sub1_1.method1875();
			local167 = Static6.aClass5_Sub1_Sub1_1.method1839();
			if (Static295.method4992(local167)) {
				Static45.method1032(local140 + (local144 << 16), local136);
			}
			Static1.anInt4 = -1;
			return true;
		} else if (Static1.anInt4 == 58) {
			local136 = Static6.aClass5_Sub1_Sub1_1.method1839();
			if (local136 == 65535) {
				local136 = -1;
			}
			local140 = Static6.aClass5_Sub1_Sub1_1.method1846();
			Static29.method722(local136, local140);
			Static1.anInt4 = -1;
			return true;
		} else if (Static1.anInt4 == 192) {
			local136 = Static6.aClass5_Sub1_Sub1_1.method1867();
			if (local136 == 65535) {
				local136 = -1;
			}
			local140 = Static6.aClass5_Sub1_Sub1_1.method1843();
			local144 = Static6.aClass5_Sub1_Sub1_1.method1885();
			Static62.method1258(local136, local140, local144);
			Static1.anInt4 = -1;
			return true;
		} else if (Static1.anInt4 == 91) {
			Static310.method5284();
			Static1.anInt4 = -1;
			return false;
		} else if (Static1.anInt4 == 226) {
			Static265.method5496();
			Static1.anInt4 = -1;
			return true;
		} else if (Static1.anInt4 == 92) {
			local136 = Static6.aClass5_Sub1_Sub1_1.method1846();
			local140 = Static6.aClass5_Sub1_Sub1_1.method1872();
			local144 = Static6.aClass5_Sub1_Sub1_1.method1885();
			Static156.anInt3123 = local140 >> 1;
			Static85.aClass25_Sub1_Sub1_Sub1_1.method3684(local136, (local140 & 0x1) == 1, local144, Static156.anInt3123);
			Static1.anInt4 = -1;
			return true;
		} else {
			@Pc(375) Class96 local375;
			@Pc(388) int local388;
			@Pc(390) int local390;
			if (Static1.anInt4 == 245) {
				local136 = Static6.aClass5_Sub1_Sub1_1.method1826();
				local140 = Static6.aClass5_Sub1_Sub1_1.method1845();
				if (local136 < -70000) {
					local140 += 32768;
				}
				if (local136 >= 0) {
					local375 = Static121.method2396(local136);
				} else {
					local375 = null;
				}
				while (Static179.anInt3568 > Static6.aClass5_Sub1_Sub1_1.anInt2029) {
					local167 = Static6.aClass5_Sub1_Sub1_1.method1866();
					local388 = Static6.aClass5_Sub1_Sub1_1.method1845();
					local390 = 0;
					if (local388 != 0) {
						local390 = Static6.aClass5_Sub1_Sub1_1.method1832();
						if (local390 == 255) {
							local390 = Static6.aClass5_Sub1_Sub1_1.method1826();
						}
					}
					if (local375 != null && local167 >= 0 && local167 < local375.anIntArray191.length) {
						local375.anIntArray191[local167] = local388;
						local375.anIntArray195[local167] = local390;
					}
					Static93.method1991(local388 - 1, local390, local167, local140);
				}
				if (local375 != null) {
					Static336.method4719(local375);
				}
				Static173.method3937();
				Static22.anIntArray29[Static75.anInt1825++ & 0x1F] = local140 & 0x7FFF;
				Static1.anInt4 = -1;
				return true;
			}
			@Pc(631) int local631;
			@Pc(638) int local638;
			@Pc(500) boolean local500;
			@Pc(656) Class205 local656;
			@Pc(635) boolean local635;
			if (Static1.anInt4 == 35) {
				Static277.anInt5401 = Static211.anInt4205;
				if (Static179.anInt3568 == 0) {
					Static117.anInt2498 = 0;
					Static305.aString337 = null;
					Static68.aString99 = null;
					Static1.anInt4 = -1;
					Static32.aClass205Array1 = null;
					return true;
				}
				Static68.aString99 = Static6.aClass5_Sub1_Sub1_1.method1840();
				local500 = Static6.aClass5_Sub1_Sub1_1.method1832() == 1;
				if (local500) {
					Static6.aClass5_Sub1_Sub1_1.method1840();
				}
				@Pc(510) long local510 = Static6.aClass5_Sub1_Sub1_1.method1884();
				Static305.aString337 = Static350.method5775(local510);
				Static334.aByte71 = Static6.aClass5_Sub1_Sub1_1.method1863();
				local167 = Static6.aClass5_Sub1_Sub1_1.method1832();
				if (local167 == 255) {
					Static1.anInt4 = -1;
					return true;
				}
				Static117.anInt2498 = local167;
				@Pc(536) Class205[] local536 = new Class205[100];
				for (local390 = 0; local390 < Static117.anInt2498; local390++) {
					local536[local390] = new Class205();
					local536[local390].aString348 = Static6.aClass5_Sub1_Sub1_1.method1840();
					local500 = Static6.aClass5_Sub1_Sub1_1.method1832() == 1;
					if (local500) {
						local536[local390].aString347 = Static6.aClass5_Sub1_Sub1_1.method1840();
					} else {
						local536[local390].aString347 = local536[local390].aString348;
					}
					local536[local390].anInt6109 = Static6.aClass5_Sub1_Sub1_1.method1845();
					local536[local390].aByte66 = Static6.aClass5_Sub1_Sub1_1.method1863();
					local536[local390].aString349 = Static6.aClass5_Sub1_Sub1_1.method1840();
					if (local536[local390].aString347.equals(Static85.aClass25_Sub1_Sub1_Sub1_1.aString237)) {
						Static134.aByte31 = local536[local390].aByte66;
					}
				}
				local631 = Static117.anInt2498;
				while (local631 > 0) {
					local635 = true;
					local631--;
					for (local638 = 0; local638 < local631; local638++) {
						if (local536[local638].aString348.compareTo(local536[local638 + 1].aString348) > 0) {
							local656 = local536[local638];
							local536[local638] = local536[local638 + 1];
							local536[local638 + 1] = local656;
							local635 = false;
						}
					}
					if (local635) {
						break;
					}
				}
				Static1.anInt4 = -1;
				Static32.aClass205Array1 = local536;
				return true;
			}
			@Pc(723) String local723;
			if (Static1.anInt4 == 160) {
				local136 = Static6.aClass5_Sub1_Sub1_1.method1867();
				if (local136 == 65535) {
					local136 = -1;
				}
				local140 = Static6.aClass5_Sub1_Sub1_1.method1832();
				local144 = Static6.aClass5_Sub1_Sub1_1.method1872();
				local723 = Static6.aClass5_Sub1_Sub1_1.method1840();
				if (local144 >= 1 && local144 <= 8) {
					if (local723.equalsIgnoreCase("null")) {
						local723 = null;
					}
					Static47.aStringArray4[local144 - 1] = local723;
					Static297.anIntArray439[local144 - 1] = local136;
					Static226.aBooleanArray18[local144 - 1] = local140 == 0;
				}
				Static1.anInt4 = -1;
				return true;
			}
			@Pc(994) int local994;
			@Pc(783) String local783;
			@Pc(779) String local779;
			@Pc(793) String local793;
			@Pc(812) int local812;
			@Pc(963) int local963;
			@Pc(1030) String local1030;
			@Pc(1012) String local1012;
			@Pc(1048) String local1048;
			if (Static1.anInt4 == 87) {
				local500 = Static6.aClass5_Sub1_Sub1_1.method1832() == 1;
				local779 = Static6.aClass5_Sub1_Sub1_1.method1840();
				local783 = Static6.aClass5_Sub1_Sub1_1.method1840();
				local167 = Static6.aClass5_Sub1_Sub1_1.method1845();
				local388 = Static6.aClass5_Sub1_Sub1_1.method1832();
				local793 = "";
				local635 = false;
				if (local167 > 0) {
					local793 = Static6.aClass5_Sub1_Sub1_1.method1840();
					local635 = Static6.aClass5_Sub1_Sub1_1.method1832() == 1;
				}
				for (local812 = 0; local812 < Static31.anInt829; local812++) {
					if (local500) {
						if (local783.equals(Static61.aStringArray8[local812])) {
							Static61.aStringArray8[local812] = local779;
							Static72.aStringArray9[local812] = local783;
							local779 = null;
							break;
						}
					} else if (local779.equals(Static61.aStringArray8[local812])) {
						if (Static19.anIntArray28[local812] != local167) {
							Static19.anIntArray28[local812] = local167;
							if (local167 > 0) {
								Static170.method3228(0, "", 5, local779 + Static183.aString219, "");
							}
							if (local167 == 0) {
								Static170.method3228(0, "", 5, local779 + Static211.aString243, "");
							}
						}
						Static72.aStringArray9[local812] = local783;
						Static93.aStringArray11[local812] = local793;
						Static51.anIntArray58[local812] = local388;
						local779 = null;
						Static34.aBooleanArray2[local812] = local635;
						break;
					}
				}
				if (local779 != null && Static31.anInt829 < 200) {
					Static61.aStringArray8[Static31.anInt829] = local779;
					Static72.aStringArray9[Static31.anInt829] = local783;
					Static19.anIntArray28[Static31.anInt829] = local167;
					Static93.aStringArray11[Static31.anInt829] = local793;
					Static51.anIntArray58[Static31.anInt829] = local388;
					Static34.aBooleanArray2[Static31.anInt829] = local635;
					Static31.anInt829++;
				}
				Static1.anInt8 = Static211.anInt4205;
				local638 = Static31.anInt829;
				while (local638 > 0) {
					@Pc(960) boolean local960 = true;
					local638--;
					for (local963 = 0; local963 < local638; local963++) {
						if (Static315.anInt6021 != Static19.anIntArray28[local963] && Static19.anIntArray28[local963 + 1] == Static315.anInt6021 || Static19.anIntArray28[local963] == 0 && Static19.anIntArray28[local963 + 1] != 0) {
							local994 = Static19.anIntArray28[local963];
							Static19.anIntArray28[local963] = Static19.anIntArray28[local963 + 1];
							Static19.anIntArray28[local963 + 1] = local994;
							local1012 = Static93.aStringArray11[local963];
							Static93.aStringArray11[local963] = Static93.aStringArray11[local963 + 1];
							Static93.aStringArray11[local963 + 1] = local1012;
							local1030 = Static61.aStringArray8[local963];
							Static61.aStringArray8[local963] = Static61.aStringArray8[local963 + 1];
							Static61.aStringArray8[local963 + 1] = local1030;
							local1048 = Static72.aStringArray9[local963];
							Static72.aStringArray9[local963] = Static72.aStringArray9[local963 + 1];
							Static72.aStringArray9[local963 + 1] = local1048;
							@Pc(1066) int local1066 = Static51.anIntArray58[local963];
							Static51.anIntArray58[local963] = Static51.anIntArray58[local963 + 1];
							Static51.anIntArray58[local963 + 1] = local1066;
							@Pc(1084) boolean local1084 = Static34.aBooleanArray2[local963];
							Static34.aBooleanArray2[local963] = Static34.aBooleanArray2[local963 + 1];
							Static34.aBooleanArray2[local963 + 1] = local1084;
							local960 = false;
						}
					}
					if (local960) {
						break;
					}
				}
				Static1.anInt4 = -1;
				return true;
			}
			@Pc(1163) long local1163;
			@Pc(1153) long local1153;
			@Pc(1158) long local1158;
			if (Static1.anInt4 == 148) {
				local500 = Static6.aClass5_Sub1_Sub1_1.method1832() == 1;
				local779 = Static6.aClass5_Sub1_Sub1_1.method1840();
				local783 = local779;
				if (local500) {
					local783 = Static6.aClass5_Sub1_Sub1_1.method1840();
				}
				local1153 = Static6.aClass5_Sub1_Sub1_1.method1884();
				local1158 = Static6.aClass5_Sub1_Sub1_1.method1845();
				local1163 = Static6.aClass5_Sub1_Sub1_1.method1843();
				local638 = Static6.aClass5_Sub1_Sub1_1.method1832();
				local963 = Static6.aClass5_Sub1_Sub1_1.method1845();
				@Pc(1177) long local1177 = local1163 + (local1158 << 32);
				@Pc(1179) boolean local1179 = false;
				@Pc(1181) int local1181 = 0;
				while (true) {
					if (local1181 >= 100) {
						if (local638 <= 1 && Static299.method5080(local783)) {
							local1179 = true;
						}
						break;
					}
					if (local1177 == Static59.aLongArray2[local1181]) {
						local1179 = true;
						break;
					}
					local1181++;
				}
				if (!local1179 && Static322.anInt6105 == 0) {
					Static59.aLongArray2[Static98.anInt2181] = local1177;
					Static98.anInt2181 = (Static98.anInt2181 + 1) % 100;
					local1048 = Static52.method1171(local963).method2634(Static6.aClass5_Sub1_Sub1_1);
					if (local638 == 2) {
						Static243.method4137("<img=1>" + local783, local1048, "<img=1>" + local779, local963, Static176.method1787(local1153), 20, 0);
					} else if (local638 == 1) {
						Static243.method4137("<img=0>" + local783, local1048, "<img=0>" + local779, local963, Static176.method1787(local1153), 20, 0);
					} else {
						Static243.method4137(local783, local1048, local779, local963, Static176.method1787(local1153), 20, 0);
					}
				}
				Static1.anInt4 = -1;
				return true;
			}
			@Pc(1321) String local1321;
			if (Static1.anInt4 == 36) {
				local1321 = Static6.aClass5_Sub1_Sub1_1.method1840();
				local140 = Static6.aClass5_Sub1_Sub1_1.method1875();
				local144 = Static6.aClass5_Sub1_Sub1_1.method1828();
				if (Static295.method4992(local140)) {
					Static203.method3628(local144, local1321);
				}
				Static1.anInt4 = -1;
				return true;
			} else if (Static1.anInt4 == 30) {
				local136 = Static6.aClass5_Sub1_Sub1_1.method1883();
				local140 = Static6.aClass5_Sub1_Sub1_1.method1867();
				if (local140 == 65535) {
					local140 = -1;
				}
				local144 = Static6.aClass5_Sub1_Sub1_1.method1875();
				if (Static295.method4992(local144)) {
					Static180.method3327(local140, -1, local136, 1);
				}
				Static1.anInt4 = -1;
				return true;
			} else if (Static1.anInt4 == 101) {
				local136 = Static6.aClass5_Sub1_Sub1_1.method1845();
				if (Static295.method4992(local136)) {
					Static181.method3379();
				}
				Static1.anInt4 = -1;
				return true;
			} else if (Static1.anInt4 == 66) {
				local136 = Static6.aClass5_Sub1_Sub1_1.method1875();
				local140 = Static6.aClass5_Sub1_Sub1_1.method1845();
				local144 = Static6.aClass5_Sub1_Sub1_1.method1853();
				if (Static295.method4992(local140)) {
					Static347.method5723(local136, local144);
				}
				Static1.anInt4 = -1;
				return true;
			} else if (Static1.anInt4 == 71) {
				local136 = Static6.aClass5_Sub1_Sub1_1.method1845();
				local140 = Static6.aClass5_Sub1_Sub1_1.method1832();
				local144 = Static6.aClass5_Sub1_Sub1_1.method1832();
				local167 = Static6.aClass5_Sub1_Sub1_1.method1832();
				local388 = Static6.aClass5_Sub1_Sub1_1.method1832();
				local390 = Static6.aClass5_Sub1_Sub1_1.method1845();
				if (Static295.method4992(local136)) {
					Static183.aBooleanArray16[local140] = true;
					Static326.anIntArray533[local140] = local144;
					Static76.anIntArray410[local140] = local167;
					Static195.anIntArray278[local140] = local388;
					Static238.anIntArray366[local140] = local390;
				}
				Static1.anInt4 = -1;
				return true;
			} else if (Static1.anInt4 == 227) {
				local136 = Static6.aClass5_Sub1_Sub1_1.method1828();
				local140 = Static6.aClass5_Sub1_Sub1_1.method1839();
				Static168.method3163(local140, local136);
				Static1.anInt4 = -1;
				return true;
			} else {
				@Pc(1573) long local1573;
				@Pc(1588) Class5_Sub10 local1588;
				@Pc(1579) Class5_Sub10 local1579;
				if (Static1.anInt4 == 254) {
					local136 = Static6.aClass5_Sub1_Sub1_1.method1875();
					if (local136 == 65535) {
						local136 = -1;
					}
					local140 = Static6.aClass5_Sub1_Sub1_1.method1845();
					local144 = Static6.aClass5_Sub1_Sub1_1.method1845();
					if (local144 == 65535) {
						local144 = -1;
					}
					local167 = Static6.aClass5_Sub1_Sub1_1.method1828();
					local388 = Static6.aClass5_Sub1_Sub1_1.method1845();
					if (Static295.method4992(local388)) {
						for (local390 = local136; local390 <= local144; local390++) {
							local1573 = ((long) local167 << 32) + ((long) local390);
							local1579 = (Class5_Sub10) Static61.aClass42_6.method1052(local1573);
							if (local1579 != null) {
								local1588 = new Class5_Sub10(local1579.anInt1281, local140);
								local1579.method5803();
							} else if (local390 == -1) {
								local1588 = new Class5_Sub10(Static121.method2396(local167).aClass5_Sub10_1.anInt1281, local140);
							} else {
								local1588 = new Class5_Sub10(0, local140);
							}
							Static61.aClass42_6.method1050(local1573, local1588);
						}
					}
					Static1.anInt4 = -1;
					return true;
				}
				@Pc(1663) Class5_Sub40 local1663;
				if (Static1.anInt4 == 96) {
					local136 = Static6.aClass5_Sub1_Sub1_1.method1828();
					local140 = Static6.aClass5_Sub1_Sub1_1.method1839();
					local144 = Static6.aClass5_Sub1_Sub1_1.method1828();
					if (Static295.method4992(local140)) {
						@Pc(1656) Class5_Sub40 local1656 = (Class5_Sub40) Static265.aClass42_53.method1052((long) local144);
						local1663 = (Class5_Sub40) Static265.aClass42_53.method1052((long) local136);
						if (local1663 != null) {
							Static339.method5623(local1656 == null || local1663.anInt6233 != local1656.anInt6233, local1663, false);
						}
						if (local1656 != null) {
							local1656.method5803();
							Static265.aClass42_53.method1050((long) local136, local1656);
						}
						@Pc(1698) Class96 local1698 = Static121.method2396(local144);
						if (local1698 != null) {
							Static336.method4719(local1698);
						}
						local1698 = Static121.method2396(local136);
						if (local1698 != null) {
							Static336.method4719(local1698);
							Static27.method4647(true, local1698);
						}
						if (Static207.anInt4106 != -1) {
							Static55.method1183(1, Static207.anInt4106);
						}
					}
					Static1.anInt4 = -1;
					return true;
				} else if (Static1.anInt4 == 99 || Static1.anInt4 == 116 || Static1.anInt4 == 78 || Static1.anInt4 == 244 || Static1.anInt4 == 133 || Static1.anInt4 == 44 || Static1.anInt4 == 232 || Static1.anInt4 == 24 || Static1.anInt4 == 183 || Static1.anInt4 == 195 || Static1.anInt4 == 13 || Static1.anInt4 == 204 || Static1.anInt4 == 141 || Static1.anInt4 == 149 || Static1.anInt4 == 42) {
					Static205.method3637();
					Static1.anInt4 = -1;
					return true;
				} else if (Static1.anInt4 == 145) {
					local136 = Static6.aClass5_Sub1_Sub1_1.method1828();
					local140 = Static6.aClass5_Sub1_Sub1_1.method1839();
					Static163.method3010(local140, local136);
					Static1.anInt4 = -1;
					return true;
				} else if (Static1.anInt4 == 134) {
					local136 = Static6.aClass5_Sub1_Sub1_1.method1832();
					if (Static6.aClass5_Sub1_Sub1_1.method1832() == 0) {
						Static333.aClass41Array2[local136] = new Class41();
					} else {
						Static6.aClass5_Sub1_Sub1_1.anInt2029--;
						Static333.aClass41Array2[local136] = new Class41(Static6.aClass5_Sub1_Sub1_1);
					}
					Static1.anInt4 = -1;
					Static211.anInt4203 = Static211.anInt4205;
					return true;
				} else if (Static1.anInt4 == 56) {
					local136 = Static6.aClass5_Sub1_Sub1_1.method1839();
					local140 = Static6.aClass5_Sub1_Sub1_1.method1853();
					local144 = Static6.aClass5_Sub1_Sub1_1.method1875();
					if (Static295.method4992(local136)) {
						Static320.method5397(local140, local144);
					}
					Static1.anInt4 = -1;
					return true;
				} else if (Static1.anInt4 == 11) {
					Static177.method2208();
					Static1.anInt4 = -1;
					return true;
				} else if (Static1.anInt4 == 238) {
					local136 = Static6.aClass5_Sub1_Sub1_1.method1832();
					local140 = Static6.aClass5_Sub1_Sub1_1.method1832();
					if (local136 == 255) {
						local136 = -1;
						local140 = -1;
					}
					Static10.method305(local136, local140);
					Static1.anInt4 = -1;
					return true;
				} else if (Static1.anInt4 == 64) {
					local136 = Static6.aClass5_Sub1_Sub1_1.method1845();
					if (Static295.method4992(local136)) {
						Static285.method5098();
					}
					Static1.anInt4 = -1;
					return true;
				} else if (Static1.anInt4 == 111) {
					local136 = Static6.aClass5_Sub1_Sub1_1.method1853();
					@Pc(1969) Class96 local1969 = Static121.method2396(local136);
					for (local144 = 0; local144 < local1969.anIntArray191.length; local144++) {
						local1969.anIntArray191[local144] = -1;
						local1969.anIntArray191[local144] = 0;
					}
					Static336.method4719(local1969);
					Static1.anInt4 = -1;
					return true;
				} else if (Static1.anInt4 == 198) {
					local1321 = Static6.aClass5_Sub1_Sub1_1.method1840();
					local779 = Static337.method5620(Static314.method5369(Static259.method2973(Static6.aClass5_Sub1_Sub1_1)));
					Static170.method3228(0, local1321, 6, local779, local1321);
					Static1.anInt4 = -1;
					return true;
				} else if (Static1.anInt4 == 205) {
					local136 = Static6.aClass5_Sub1_Sub1_1.method1845();
					local140 = Static6.aClass5_Sub1_Sub1_1.method1832();
					local144 = Static6.aClass5_Sub1_Sub1_1.method1832();
					local167 = Static6.aClass5_Sub1_Sub1_1.method1845();
					local388 = Static6.aClass5_Sub1_Sub1_1.method1832();
					local390 = Static6.aClass5_Sub1_Sub1_1.method1832();
					if (Static295.method4992(local136)) {
						Static236.method4033(local388, local140, local167, local390, local144);
					}
					Static1.anInt4 = -1;
					return true;
				} else if (Static1.anInt4 == 113) {
					local136 = Static6.aClass5_Sub1_Sub1_1.method1828();
					local140 = Static6.aClass5_Sub1_Sub1_1.method1883();
					local144 = Static6.aClass5_Sub1_Sub1_1.method1845();
					local167 = Static6.aClass5_Sub1_Sub1_1.method1845();
					if (local167 == 65535) {
						local167 = -1;
					}
					if (Static295.method4992(local144)) {
						@Pc(2110) Class96 local2110 = Static121.method2396(local136);
						@Pc(2124) Class165 local2124;
						if (local2110.aBoolean197) {
							Static162.method3003(local167, local136, local140);
							local2124 = Static88.method1382(local167);
							Static165.method3060(local2124.anInt4951, local136, local2124.anInt4940, local2124.anInt4958);
							Static155.method3613(local2124.anInt4948, local2124.anInt4946, local136, local2124.anInt4945);
						} else if (local167 == -1) {
							local2110.anInt2958 = 0;
							Static1.anInt4 = -1;
							return true;
						} else {
							local2124 = Static88.method1382(local167);
							local2110.anInt2958 = 4;
							local2110.anInt2886 = local2124.anInt4958;
							local2110.anInt2920 = local2124.anInt4951 * 100 / local140;
							local2110.anInt2927 = local2124.anInt4940;
							local2110.anInt2925 = local167;
							Static336.method4719(local2110);
						}
					}
					Static1.anInt4 = -1;
					return true;
				} else if (Static1.anInt4 == 84) {
					local500 = Static6.aClass5_Sub1_Sub1_1.method1832() == 1;
					local779 = Static6.aClass5_Sub1_Sub1_1.method1840();
					local783 = local779;
					if (local500) {
						local783 = Static6.aClass5_Sub1_Sub1_1.method1840();
					}
					local1153 = Static6.aClass5_Sub1_Sub1_1.method1845();
					local1158 = Static6.aClass5_Sub1_Sub1_1.method1843();
					local812 = Static6.aClass5_Sub1_Sub1_1.method1832();
					local631 = Static6.aClass5_Sub1_Sub1_1.method1845();
					@Pc(2242) long local2242 = local1158 + (local1153 << 32);
					@Pc(2244) boolean local2244 = false;
					@Pc(2246) int local2246 = 0;
					while (true) {
						if (local2246 >= 100) {
							if (local812 <= 1 && Static299.method5080(local783)) {
								local2244 = true;
							}
							break;
						}
						if (Static59.aLongArray2[local2246] == local2242) {
							local2244 = true;
							break;
						}
						local2246++;
					}
					if (!local2244 && Static322.anInt6105 == 0) {
						Static59.aLongArray2[Static98.anInt2181] = local2242;
						Static98.anInt2181 = (Static98.anInt2181 + 1) % 100;
						local1012 = Static52.method1171(local631).method2634(Static6.aClass5_Sub1_Sub1_1);
						if (local812 == 2) {
							Static243.method4137("<img=1>" + local783, local1012, "<img=1>" + local779, local631, null, 18, 0);
						} else if (local812 == 1) {
							Static243.method4137("<img=0>" + local783, local1012, "<img=0>" + local779, local631, null, 18, 0);
						} else {
							Static243.method4137(local783, local1012, local779, local631, null, 18, 0);
						}
					}
					Static1.anInt4 = -1;
					return true;
				} else if (Static1.anInt4 == 12) {
					local136 = Static6.aClass5_Sub1_Sub1_1.method1845();
					local140 = Static6.aClass5_Sub1_Sub1_1.method1867();
					local144 = Static6.aClass5_Sub1_Sub1_1.method1846();
					@Pc(2387) Class25_Sub1_Sub1_Sub2 local2387 = Static188.aClass25_Sub1_Sub1_Sub2Array1[local140];
					if (local2387 != null) {
						Static162.method3002(local136, local2387, local144);
					}
					Static1.anInt4 = -1;
					return true;
				} else if (Static1.anInt4 == 46) {
					local136 = Static6.aClass5_Sub1_Sub1_1.method1883();
					local140 = Static6.aClass5_Sub1_Sub1_1.method1867();
					local144 = Static6.aClass5_Sub1_Sub1_1.method1872();
					local167 = Static6.aClass5_Sub1_Sub1_1.method1845();
					if (Static295.method4992(local167)) {
						local1663 = (Class5_Sub40) Static265.aClass42_53.method1052((long) local136);
						if (local1663 != null) {
							Static339.method5623(local1663.anInt6233 != local140, local1663, false);
						}
						Static324.method5464(false, local144, local136, local140);
					}
					Static1.anInt4 = -1;
					return true;
				} else if (Static1.anInt4 == 26) {
					local136 = Static6.aClass5_Sub1_Sub1_1.method1826();
					local140 = Static6.aClass5_Sub1_Sub1_1.method1875();
					local144 = Static6.aClass5_Sub1_Sub1_1.method1867();
					if (Static295.method4992(local140)) {
						Static352.method5796(local144, local136);
					}
					Static1.anInt4 = -1;
					return true;
				} else if (Static1.anInt4 == 219) {
					local136 = Static6.aClass5_Sub1_Sub1_1.method1839();
					Static276.method4703(local136);
					Static22.anIntArray29[Static75.anInt1825++ & 0x1F] = local136 & 0x7FFF;
					Static1.anInt4 = -1;
					return true;
				} else {
					@Pc(2554) int local2554;
					if (Static1.anInt4 == 86) {
						local136 = Static6.aClass5_Sub1_Sub1_1.method1853();
						local140 = local136 >> 28 & 0x3;
						local144 = local136 >> 14 & 0x3FFF;
						local167 = local136 & 0x3FFF;
						local388 = Static6.aClass5_Sub1_Sub1_1.method1885();
						local390 = local388 >> 2;
						local2554 = local388 & 0x3;
						local812 = Static353.anIntArray564[local390];
						local631 = Static6.aClass5_Sub1_Sub1_1.method1839();
						local144 -= Static263.anInt5063;
						if (local631 == 65535) {
							local631 = -1;
						}
						local167 -= Static28.anInt773;
						Static48.method1062(local167, local2554, local812, local144, local390, local140, local631);
						Static1.anInt4 = -1;
						return true;
					} else if (Static1.anInt4 == 9) {
						Static115.anInt2459 = Static6.aClass5_Sub1_Sub1_1.method1832();
						Static1.anInt4 = -1;
						return true;
					} else if (Static1.anInt4 == 168) {
						Static32.anInt859 = Static6.aClass5_Sub1_Sub1_1.method1832();
						for (local136 = 0; local136 < Static32.anInt859; local136++) {
							Static31.aStringArray1[local136] = Static6.aClass5_Sub1_Sub1_1.method1840();
							Static138.aStringArray15[local136] = Static6.aClass5_Sub1_Sub1_1.method1840();
							if (Static138.aStringArray15[local136].equals("")) {
								Static138.aStringArray15[local136] = Static31.aStringArray1[local136];
							}
							Static44.aStringArray25[local136] = Static6.aClass5_Sub1_Sub1_1.method1840();
							Static50.aStringArray5[local136] = Static6.aClass5_Sub1_Sub1_1.method1840();
							if (Static50.aStringArray5[local136].equals("")) {
								Static50.aStringArray5[local136] = Static44.aStringArray25[local136];
							}
							Static62.aBooleanArray5[local136] = false;
						}
						Static1.anInt8 = Static211.anInt4205;
						Static1.anInt4 = -1;
						return true;
					} else if (Static1.anInt4 == 50) {
						local136 = Static6.aClass5_Sub1_Sub1_1.method1845();
						if (local136 == 65535) {
							local136 = -1;
						}
						local140 = Static6.aClass5_Sub1_Sub1_1.method1832();
						local144 = Static6.aClass5_Sub1_Sub1_1.method1845();
						local167 = Static6.aClass5_Sub1_Sub1_1.method1832();
						Static83.method1902(local144, local167, local140, local136);
						Static1.anInt4 = -1;
						return true;
					} else if (Static1.anInt4 == 252) {
						local136 = Static6.aClass5_Sub1_Sub1_1.method1867();
						local140 = Static6.aClass5_Sub1_Sub1_1.method1845();
						local144 = Static6.aClass5_Sub1_Sub1_1.method1875();
						local167 = Static6.aClass5_Sub1_Sub1_1.method1853();
						if (local167 >> 30 == 0) {
							@Pc(2885) Class128 local2885;
							@Pc(2932) Class128 local2932;
							@Pc(2945) Class17 local2945;
							@Pc(2897) Class17 local2897;
							@Pc(2950) Class17 local2950;
							if (local167 >> 29 != 0) {
								local388 = local167 & 0xFFFF;
								@Pc(3051) Class25_Sub1_Sub1_Sub2 local3051 = Static188.aClass25_Sub1_Sub1_Sub2Array1[local388];
								if (local3051 != null) {
									if (local140 == 65535) {
										local140 = -1;
									}
									local635 = true;
									if (local140 != -1 && local3051.anInt5269 != -1) {
										if (local3051.anInt5269 == local140) {
											local2885 = Static136.method2578(local140);
											if (local2885.aBoolean266 && local2885.anInt3759 != -1) {
												local2897 = Static261.method4492(local2885.anInt3759);
												local638 = local2897.anInt505;
												if (local638 == 0 || local638 == 2) {
													local635 = false;
												} else if (local638 == 1) {
													local635 = true;
												}
											}
										} else {
											local2885 = Static136.method2578(local140);
											local2932 = Static136.method2578(local3051.anInt5269);
											if (local2885.anInt3759 != -1 && local2932.anInt3759 != -1) {
												local2945 = Static261.method4492(local2885.anInt3759);
												local2950 = Static261.method4492(local2932.anInt3759);
												if (local2950.anInt506 > local2945.anInt506) {
													local635 = false;
												}
											}
										}
									}
									if (local635) {
										local3051.anInt5269 = local140;
										local3051.anInt5319 = local144;
										local3051.anInt5279 = 1;
										local3051.anInt5306 = local136 + Static180.anInt3606;
										local3051.anInt5330 = 0;
										local3051.anInt5315 = 0;
										if (Static180.anInt3606 < local3051.anInt5306) {
											local3051.anInt5315 = -1;
										}
										if (local3051.anInt5269 != -1 && local3051.anInt5306 == Static180.anInt3606) {
											local812 = Static136.method2578(local3051.anInt5269).anInt3759;
											if (local812 != -1) {
												local2897 = Static261.method4492(local812);
												if (local2897 != null && local2897.anIntArray24 != null) {
													Static207.method3696(0, local3051.anInt5769, local2897, local3051.anInt5773, false);
												}
											}
										}
									}
								}
							} else if (local167 >> 28 != 0) {
								local388 = local167 & 0xFFFF;
								@Pc(2848) Class25_Sub1_Sub1_Sub1 local2848;
								if (local388 == Static99.anInt2186) {
									local2848 = Static85.aClass25_Sub1_Sub1_Sub1_1;
								} else {
									local2848 = Static312.aClass25_Sub1_Sub1_Sub1Array1[local388];
								}
								if (local2848 != null) {
									if (local140 == 65535) {
										local140 = -1;
									}
									local635 = true;
									if (local140 != -1 && local2848.anInt5269 != -1) {
										if (local2848.anInt5269 == local140) {
											local2885 = Static136.method2578(local140);
											if (local2885.aBoolean266 && local2885.anInt3759 != -1) {
												local2897 = Static261.method4492(local2885.anInt3759);
												local638 = local2897.anInt505;
												if (local638 == 0 || local638 == 2) {
													local635 = false;
												} else if (local638 == 1) {
													local635 = true;
												}
											}
										} else {
											local2885 = Static136.method2578(local140);
											local2932 = Static136.method2578(local2848.anInt5269);
											if (local2885.anInt3759 != -1 && local2932.anInt3759 != -1) {
												local2945 = Static261.method4492(local2885.anInt3759);
												local2950 = Static261.method4492(local2932.anInt3759);
												if (local2950.anInt506 > local2945.anInt506) {
													local635 = false;
												}
											}
										}
									}
									if (local635) {
										local2848.anInt5306 = Static180.anInt3606 + local136;
										local2848.anInt5315 = 0;
										local2848.anInt5319 = local144;
										local2848.anInt5269 = local140;
										local2848.anInt5279 = 1;
										local2848.anInt5330 = 0;
										if (local2848.anInt5306 > Static180.anInt3606) {
											local2848.anInt5315 = -1;
										}
										if (local2848.anInt5269 == 65535) {
											local2848.anInt5269 = -1;
										}
										if (local2848.anInt5269 != -1 && Static180.anInt3606 == local2848.anInt5306) {
											local812 = Static136.method2578(local2848.anInt5269).anInt3759;
											if (local812 != -1) {
												local2897 = Static261.method4492(local812);
												if (local2897 != null && local2897.anIntArray24 != null) {
													Static207.method3696(0, local2848.anInt5769, local2897, local2848.anInt5773, Static85.aClass25_Sub1_Sub1_Sub1_1 == local2848);
												}
											}
										}
									}
								}
							}
						} else {
							local388 = local167 >> 28 & 0x3;
							local390 = (local167 >> 14 & 0x3FFF) - Static263.anInt5063;
							local2554 = (local167 & 0x3FFF) - Static28.anInt773;
							if (local390 >= 0 && local2554 >= 0 && Static266.anInt5101 > local390 && Static339.anInt6352 > local2554) {
								local812 = local390 * 128 + 64;
								local631 = local2554 * 128 + 64;
								@Pc(2822) Class25_Sub1_Sub5 local2822 = new Class25_Sub1_Sub5(local140, 0, Static180.anInt3606, local388, local812, Static66.method1393(local631, local388, local812) - local144, local631, local390, local390, local2554, local2554);
								Static316.aClass211_37.method5609(new Class5_Sub9_Sub7(local2822));
							}
						}
						Static1.anInt4 = -1;
						return true;
					} else if (Static1.anInt4 == 93) {
						Static173.method3937();
						Static7.anInt246 = Static6.aClass5_Sub1_Sub1_1.method1832();
						Static1.anInt4 = -1;
						Static233.anInt4549 = Static211.anInt4205;
						return true;
					} else if (Static1.anInt4 == 144) {
						Static173.method3937();
						local136 = Static6.aClass5_Sub1_Sub1_1.method1853();
						local140 = Static6.aClass5_Sub1_Sub1_1.method1885();
						local144 = Static6.aClass5_Sub1_Sub1_1.method1832();
						Static184.anIntArray536[local144] = local136;
						Static100.anIntArray129[local144] = local140;
						Static319.anIntArray517[local144] = 1;
						local167 = Static236.anIntArray365[local144] - 1;
						for (local388 = 0; local388 < local167; local388++) {
							if (Class5_Sub9_Sub8.anIntArray130[local388] <= local136) {
								Static319.anIntArray517[local144] = local388 + 2;
							}
						}
						Static219.anIntArray310[Static176.anInt1942++ & 0x1F] = local144;
						Static1.anInt4 = -1;
						return true;
					} else if (Static1.anInt4 == 70) {
						local136 = Static6.aClass5_Sub1_Sub1_1.method1845();
						local140 = Static6.aClass5_Sub1_Sub1_1.method1832();
						local144 = Static6.aClass5_Sub1_Sub1_1.method1832();
						local167 = Static6.aClass5_Sub1_Sub1_1.method1845();
						local388 = Static6.aClass5_Sub1_Sub1_1.method1832();
						local390 = Static6.aClass5_Sub1_Sub1_1.method1832();
						if (Static295.method4992(local136)) {
							Static108.method2166(local388, local144, true, local140, local167, local390);
						}
						Static1.anInt4 = -1;
						return true;
					} else if (Static1.anInt4 == 207) {
						local136 = Static6.aClass5_Sub1_Sub1_1.method1853();
						Static345.aClass60_7 = Static202.aClass10_3.method326(local136);
						Static1.anInt4 = -1;
						return true;
					} else if (Static1.anInt4 == 152) {
						local136 = Static6.aClass5_Sub1_Sub1_1.method1832();
						local140 = local136 >> 5;
						local144 = local136 & 0x1F;
						if (local144 == 0) {
							Static141.aClass104Array1[local140] = null;
							Static1.anInt4 = -1;
							return true;
						}
						@Pc(3411) Class104 local3411 = new Class104();
						local3411.anInt3106 = local144;
						local3411.anInt3094 = Static6.aClass5_Sub1_Sub1_1.method1832();
						if (local3411.anInt3094 >= 0 && local3411.anInt3094 < Static148.aClass54Array15.length) {
							if (local3411.anInt3106 == 1 || local3411.anInt3106 == 10) {
								local3411.anInt3095 = Static6.aClass5_Sub1_Sub1_1.method1845();
								Static6.aClass5_Sub1_Sub1_1.anInt2029 += 5;
							} else if (local3411.anInt3106 >= 2 && local3411.anInt3106 <= 6) {
								if (local3411.anInt3106 == 2) {
									local3411.anInt3093 = 64;
									local3411.anInt3104 = 64;
								}
								if (local3411.anInt3106 == 3) {
									local3411.anInt3104 = 64;
									local3411.anInt3093 = 0;
								}
								if (local3411.anInt3106 == 4) {
									local3411.anInt3093 = 128;
									local3411.anInt3104 = 64;
								}
								if (local3411.anInt3106 == 5) {
									local3411.anInt3104 = 0;
									local3411.anInt3093 = 64;
								}
								if (local3411.anInt3106 == 6) {
									local3411.anInt3093 = 64;
									local3411.anInt3104 = 128;
								}
								local3411.anInt3106 = 2;
								local3411.anInt3105 = Static6.aClass5_Sub1_Sub1_1.method1845();
								local3411.anInt3100 = Static6.aClass5_Sub1_Sub1_1.method1845();
								local3411.anInt3101 = Static6.aClass5_Sub1_Sub1_1.method1832();
								local3411.anInt3096 = Static6.aClass5_Sub1_Sub1_1.method1845();
							}
							local3411.anInt3092 = Static6.aClass5_Sub1_Sub1_1.method1845();
							if (local3411.anInt3092 == 65535) {
								local3411.anInt3092 = -1;
							}
							Static141.aClass104Array1[local140] = local3411;
						}
						Static1.anInt4 = -1;
						return true;
					} else if (Static1.anInt4 == 108) {
						local136 = Static6.aClass5_Sub1_Sub1_1.method1875();
						local140 = Static6.aClass5_Sub1_Sub1_1.method1826();
						local144 = Static6.aClass5_Sub1_Sub1_1.method1875();
						if (Static295.method4992(local136)) {
							Static355.method5838(local140, local144);
						}
						Static1.anInt4 = -1;
						return true;
					} else if (Static1.anInt4 == 88) {
						for (local136 = 0; local136 < Static69.anIntArray80.length; local136++) {
							if (Static2.anIntArray2[local136] != Static69.anIntArray80[local136]) {
								Static69.anIntArray80[local136] = Static2.anIntArray2[local136];
								Static25.method610(local136);
								Static254.anIntArray403[Static18.anInt538++ & 0x1F] = local136;
							}
						}
						Static1.anInt4 = -1;
						return true;
					} else if (Static1.anInt4 == 6) {
						local136 = Static6.aClass5_Sub1_Sub1_1.method1834();
						local140 = Static6.aClass5_Sub1_Sub1_1.method1834();
						local144 = Static6.aClass5_Sub1_Sub1_1.method1883();
						local167 = Static6.aClass5_Sub1_Sub1_1.method1839();
						if (Static295.method4992(local167)) {
							Static253.method4419(local144, local136, local140);
						}
						Static1.anInt4 = -1;
						return true;
					} else if (Static1.anInt4 == 119) {
						local136 = Static6.aClass5_Sub1_Sub1_1.method1867();
						local140 = Static6.aClass5_Sub1_Sub1_1.method1867();
						local144 = Static6.aClass5_Sub1_Sub1_1.method1853();
						local167 = Static6.aClass5_Sub1_Sub1_1.method1839();
						local388 = Static6.aClass5_Sub1_Sub1_1.method1867();
						if (Static295.method4992(local136)) {
							Static180.method3327(local140 << 16 | local167, local388, local144, 7);
						}
						Static1.anInt4 = -1;
						return true;
					} else if (Static1.anInt4 == 163) {
						local136 = Static6.aClass5_Sub1_Sub1_1.method1853();
						local140 = Static6.aClass5_Sub1_Sub1_1.method1845();
						local144 = Static6.aClass5_Sub1_Sub1_1.method1846();
						if (Static295.method4992(local140)) {
							Static333.method4068(local144, local136);
						}
						Static1.anInt4 = -1;
						return true;
					} else if (Static1.anInt4 == 83) {
						local136 = Static6.aClass5_Sub1_Sub1_1.method1839();
						local140 = Static6.aClass5_Sub1_Sub1_1.method1875();
						local144 = Static6.aClass5_Sub1_Sub1_1.method1845();
						local167 = Static6.aClass5_Sub1_Sub1_1.method1828();
						local388 = Static6.aClass5_Sub1_Sub1_1.method1839();
						if (Static295.method4992(local136)) {
							Static165.method3060(local388, local167, local144, local140);
						}
						Static1.anInt4 = -1;
						return true;
					} else if (Static1.anInt4 == 151) {
						Static123.anInt2598 = Static6.aClass5_Sub1_Sub1_1.method1832();
						Static1.anInt4 = -1;
						Static1.anInt8 = Static211.anInt4205;
						return true;
					} else if (Static1.anInt4 == 239) {
						Static207.method3697(false);
						Static1.anInt4 = -1;
						return true;
					} else if (Static1.anInt4 == 214) {
						Static173.method3937();
						Static213.anInt4226 = Static6.aClass5_Sub1_Sub1_1.method1834();
						Static233.anInt4549 = Static211.anInt4205;
						Static1.anInt4 = -1;
						return true;
					} else if (Static1.anInt4 == 117) {
						local500 = Static6.aClass5_Sub1_Sub1_1.method1832() == 1;
						local779 = Static6.aClass5_Sub1_Sub1_1.method1840();
						local783 = local779;
						if (local500) {
							local783 = Static6.aClass5_Sub1_Sub1_1.method1840();
						}
						local1153 = Static6.aClass5_Sub1_Sub1_1.method1845();
						local1158 = Static6.aClass5_Sub1_Sub1_1.method1843();
						local812 = Static6.aClass5_Sub1_Sub1_1.method1832();
						@Pc(3886) long local3886 = local1158 + (local1153 << 32);
						@Pc(3888) boolean local3888 = false;
						local994 = 0;
						while (true) {
							if (local994 >= 100) {
								if (local812 <= 1) {
									if (Static343.aBoolean474 && !Static92.aBoolean136 || Static21.aBoolean465) {
										local3888 = true;
									} else if (Static299.method5080(local783)) {
										local3888 = true;
									}
								}
								break;
							}
							if (local3886 == Static59.aLongArray2[local994]) {
								local3888 = true;
								break;
							}
							local994++;
						}
						if (!local3888 && Static322.anInt6105 == 0) {
							Static59.aLongArray2[Static98.anInt2181] = local3886;
							Static98.anInt2181 = (Static98.anInt2181 + 1) % 100;
							@Pc(3951) String local3951 = Static337.method5620(Static314.method5369(Static259.method2973(Static6.aClass5_Sub1_Sub1_1)));
							if (local812 == 2) {
								Static243.method4137("<img=1>" + local783, local3951, "<img=1>" + local779, -1, null, 7, 0);
							} else if (local812 == 1) {
								Static243.method4137("<img=0>" + local783, local3951, "<img=0>" + local779, -1, null, 7, 0);
							} else {
								Static243.method4137(local783, local3951, local779, -1, null, 3, 0);
							}
						}
						Static1.anInt4 = -1;
						return true;
					} else if (Static1.anInt4 == 3) {
						local136 = Static6.aClass5_Sub1_Sub1_1.method1867();
						@Pc(4033) byte local4033 = Static6.aClass5_Sub1_Sub1_1.method1841();
						Static168.method3163(local136, local4033);
						Static1.anInt4 = -1;
						return true;
					} else if (Static1.anInt4 == 115) {
						local136 = Static6.aClass5_Sub1_Sub1_1.method1875();
						local140 = Static6.aClass5_Sub1_Sub1_1.method1839();
						local144 = Static6.aClass5_Sub1_Sub1_1.method1853();
						local167 = Static6.aClass5_Sub1_Sub1_1.method1883();
						if (Static295.method4992(local136)) {
							Static180.method3327(local140, local144, local167, 5);
						}
						Static1.anInt4 = -1;
						return true;
					} else if (Static1.anInt4 == 230) {
						for (local136 = 0; local136 < Static312.aClass25_Sub1_Sub1_Sub1Array1.length; local136++) {
							if (Static312.aClass25_Sub1_Sub1_Sub1Array1[local136] != null) {
								Static312.aClass25_Sub1_Sub1_Sub1Array1[local136].anInt5312 = -1;
							}
						}
						for (local140 = 0; local140 < Static188.aClass25_Sub1_Sub1_Sub2Array1.length; local140++) {
							if (Static188.aClass25_Sub1_Sub1_Sub2Array1[local140] != null) {
								Static188.aClass25_Sub1_Sub1_Sub2Array1[local140].anInt5312 = -1;
							}
						}
						Static1.anInt4 = -1;
						return true;
					} else if (Static1.anInt4 == 174) {
						@Pc(4134) byte local4134 = Static6.aClass5_Sub1_Sub1_1.method1831();
						local140 = Static6.aClass5_Sub1_Sub1_1.method1839();
						local144 = Static6.aClass5_Sub1_Sub1_1.method1875();
						if (Static295.method4992(local144)) {
							Static347.method5723(local140, local4134);
						}
						Static1.anInt4 = -1;
						return true;
					} else {
						@Pc(4188) String local4188;
						if (Static1.anInt4 == 139) {
							local136 = Static6.aClass5_Sub1_Sub1_1.method1832();
							@Pc(4176) boolean local4176 = (local136 & 0x1) == 1;
							local783 = Static6.aClass5_Sub1_Sub1_1.method1840();
							local723 = Static6.aClass5_Sub1_Sub1_1.method1840();
							local4188 = Static6.aClass5_Sub1_Sub1_1.method1840();
							local793 = Static6.aClass5_Sub1_Sub1_1.method1840();
							if (local4176) {
								for (local2554 = 0; local2554 < Static32.anInt859; local2554++) {
									if (Static138.aStringArray15[local2554].equals(local793)) {
										Static31.aStringArray1[local2554] = local783;
										if (local723.equals("")) {
											Static138.aStringArray15[local2554] = local783;
										} else {
											Static138.aStringArray15[local2554] = local723;
										}
										Static44.aStringArray25[local2554] = local4188;
										if (local793.equals("")) {
											Static50.aStringArray5[local2554] = local4188;
										} else {
											Static50.aStringArray5[local2554] = local793;
										}
										break;
									}
								}
							} else {
								Static31.aStringArray1[Static32.anInt859] = local783;
								if (local723.equals("")) {
									Static138.aStringArray15[Static32.anInt859] = local783;
								} else {
									Static138.aStringArray15[Static32.anInt859] = local723;
								}
								Static44.aStringArray25[Static32.anInt859] = local4188;
								if (local793.equals("")) {
									Static50.aStringArray5[Static32.anInt859] = local4188;
								} else {
									Static50.aStringArray5[Static32.anInt859] = local793;
								}
								Static62.aBooleanArray5[Static32.anInt859] = (local136 & 0x2) == 2;
								Static32.anInt859++;
							}
							Static1.anInt8 = Static211.anInt4205;
							Static1.anInt4 = -1;
							return true;
						} else if (Static1.anInt4 == 147) {
							local1321 = Static6.aClass5_Sub1_Sub1_1.method1840();
							local140 = Static6.aClass5_Sub1_Sub1_1.method1867();
							local144 = Static6.aClass5_Sub1_Sub1_1.method1845();
							if (Static295.method4992(local144)) {
								Static49.method1096(local140, local1321);
							}
							Static1.anInt4 = -1;
							return true;
						} else if (Static1.anInt4 == 40) {
							local136 = Static6.aClass5_Sub1_Sub1_1.method1845();
							local140 = Static6.aClass5_Sub1_Sub1_1.method1883();
							local144 = Static6.aClass5_Sub1_Sub1_1.method1875();
							if (local144 == 65535) {
								local144 = -1;
							}
							if (Static295.method4992(local136)) {
								Static180.method3327(local144, -1, local140, 2);
							}
							Static1.anInt4 = -1;
							return true;
						} else if (Static1.anInt4 == 129) {
							local136 = Static6.aClass5_Sub1_Sub1_1.method1845();
							local140 = Static6.aClass5_Sub1_Sub1_1.method1845();
							local144 = Static6.aClass5_Sub1_Sub1_1.method1845();
							local167 = Static6.aClass5_Sub1_Sub1_1.method1845();
							if (Static295.method4992(local136) && aClass96ArrayArray1[local140] != null) {
								for (local388 = local144; local388 < local167; local388++) {
									local390 = Static6.aClass5_Sub1_Sub1_1.method1843();
									if (aClass96ArrayArray1[local140].length > local388 && aClass96ArrayArray1[local140][local388] != null) {
										aClass96ArrayArray1[local140][local388].anInt2937 = local390;
									}
								}
							}
							Static1.anInt4 = -1;
							return true;
						} else if (Static1.anInt4 == 166) {
							local136 = Static6.aClass5_Sub1_Sub1_1.method1875();
							if (local136 == 65535) {
								local136 = -1;
							}
							local140 = Static6.aClass5_Sub1_Sub1_1.method1845();
							if (local140 == 65535) {
								local140 = -1;
							}
							local144 = Static6.aClass5_Sub1_Sub1_1.method1828();
							local167 = Static6.aClass5_Sub1_Sub1_1.method1853();
							local388 = Static6.aClass5_Sub1_Sub1_1.method1839();
							if (Static295.method4992(local388)) {
								for (local390 = local136; local390 <= local140; local390++) {
									local1573 = (long) local390 + ((long) local144 << 32);
									local1579 = (Class5_Sub10) Static61.aClass42_6.method1052(local1573);
									if (local1579 != null) {
										local1588 = new Class5_Sub10(local167, local1579.anInt1278);
										local1579.method5803();
									} else if (local390 == -1) {
										local1588 = new Class5_Sub10(local167, Static121.method2396(local144).aClass5_Sub10_1.anInt1278);
									} else {
										local1588 = new Class5_Sub10(local167, -1);
									}
									Static61.aClass42_6.method1050(local1573, local1588);
								}
							}
							Static1.anInt4 = -1;
							return true;
						} else if (Static1.anInt4 == 65) {
							local136 = Static6.aClass5_Sub1_Sub1_1.method1828();
							local140 = Static6.aClass5_Sub1_Sub1_1.method1875();
							if (Static295.method4992(local140)) {
								Static180.method3327(2047, 0, local136, 5);
							}
							Static1.anInt4 = -1;
							return true;
						} else if (Static1.anInt4 == 188) {
							Static203.anInt3939 = Static6.aClass5_Sub1_Sub1_1.method1832();
							Static152.anInt3091 = Static6.aClass5_Sub1_Sub1_1.method1846();
							Static1.anInt4 = -1;
							return true;
						} else if (Static1.anInt4 == 82) {
							local136 = Static6.aClass5_Sub1_Sub1_1.method1845();
							local140 = Static6.aClass5_Sub1_Sub1_1.method1885();
							if (Static295.method4992(local136)) {
								Static76.anInt5488 = local140;
							}
							Static1.anInt4 = -1;
							return true;
						} else if (Static1.anInt4 == 16) {
							if (Static207.anInt4106 != -1) {
								Static55.method1183(0, Static207.anInt4106);
							}
							Static1.anInt4 = -1;
							return true;
						} else if (Static1.anInt4 == 105) {
							local1321 = Static6.aClass5_Sub1_Sub1_1.method1840();
							@Pc(4656) boolean local4656 = Static6.aClass5_Sub1_Sub1_1.method1832() == 1;
							if (local4656) {
								local779 = Static6.aClass5_Sub1_Sub1_1.method1840();
							} else {
								local779 = local1321;
							}
							local167 = Static6.aClass5_Sub1_Sub1_1.method1845();
							@Pc(4674) byte local4674 = Static6.aClass5_Sub1_Sub1_1.method1863();
							@Pc(4676) boolean local4676 = false;
							if (local4674 == -128) {
								local4676 = true;
							}
							if (local4676) {
								if (Static117.anInt2498 == 0) {
									Static1.anInt4 = -1;
									return true;
								}
								for (local2554 = 0; local2554 < Static117.anInt2498 && (!Static32.aClass205Array1[local2554].aString347.equals(local779) || Static32.aClass205Array1[local2554].anInt6109 != local167); local2554++) {
								}
								if (Static117.anInt2498 > local2554) {
									while (Static117.anInt2498 - 1 > local2554) {
										Static32.aClass205Array1[local2554] = Static32.aClass205Array1[local2554 + 1];
										local2554++;
									}
									Static117.anInt2498--;
									Static32.aClass205Array1[Static117.anInt2498] = null;
								}
							} else {
								@Pc(4759) String local4759 = Static6.aClass5_Sub1_Sub1_1.method1840();
								local656 = new Class205();
								local656.anInt6109 = local167;
								local656.aString348 = local1321;
								local656.aString349 = local4759;
								local656.aString347 = local779;
								local656.aByte66 = local4674;
								for (local631 = Static117.anInt2498 - 1; local631 >= 0; local631--) {
									local638 = Static32.aClass205Array1[local631].aString347.compareTo(local656.aString347);
									if (local638 == 0) {
										Static32.aClass205Array1[local631].anInt6109 = local167;
										Static32.aClass205Array1[local631].aByte66 = local4674;
										Static32.aClass205Array1[local631].aString349 = local4759;
										if (local779.equals(Static85.aClass25_Sub1_Sub1_Sub1_1.aString237)) {
											Static134.aByte31 = local4674;
										}
										Static1.anInt4 = -1;
										Static277.anInt5401 = Static211.anInt4205;
										return true;
									}
									if (local638 < 0) {
										break;
									}
								}
								if (Static117.anInt2498 >= Static32.aClass205Array1.length) {
									Static1.anInt4 = -1;
									return true;
								}
								for (local638 = Static117.anInt2498 - 1; local638 > local631; local638--) {
									Static32.aClass205Array1[local638 + 1] = Static32.aClass205Array1[local638];
								}
								if (Static117.anInt2498 == 0) {
									Static32.aClass205Array1 = new Class205[100];
								}
								Static32.aClass205Array1[local631 + 1] = local656;
								Static117.anInt2498++;
								if (local779.equals(Static85.aClass25_Sub1_Sub1_Sub1_1.aString237)) {
									Static134.aByte31 = local4674;
								}
							}
							Static277.anInt5401 = Static211.anInt4205;
							Static1.anInt4 = -1;
							return true;
						} else if (Static1.anInt4 == 63) {
							local136 = Static6.aClass5_Sub1_Sub1_1.method1866();
							local140 = Static6.aClass5_Sub1_Sub1_1.method1826();
							local144 = Static6.aClass5_Sub1_Sub1_1.method1832();
							local723 = "";
							local4188 = local723;
							if ((local144 & 0x1) != 0) {
								local723 = Static6.aClass5_Sub1_Sub1_1.method1840();
								if ((local144 & 0x2) == 0) {
									local4188 = local723;
								} else {
									local4188 = Static6.aClass5_Sub1_Sub1_1.method1840();
								}
							}
							local793 = Static6.aClass5_Sub1_Sub1_1.method1840();
							if (local136 == 99) {
								Static236.method4028(local793);
							} else if (local4188.equals("") || !Static299.method5080(local4188)) {
								Static170.method3228(local140, local4188, local136, local793, local723);
							} else {
								Static1.anInt4 = -1;
								return true;
							}
							Static1.anInt4 = -1;
							return true;
						} else if (Static1.anInt4 == 72) {
							local136 = Static6.aClass5_Sub1_Sub1_1.method1885();
							local140 = Static6.aClass5_Sub1_Sub1_1.method1867();
							Static163.method3010(local140, local136);
							Static1.anInt4 = -1;
							return true;
						} else if (Static1.anInt4 == 98) {
							local136 = Static6.aClass5_Sub1_Sub1_1.method1845();
							local140 = Static6.aClass5_Sub1_Sub1_1.method1826();
							if (Static295.method4992(local136)) {
								@Pc(5014) Class5_Sub40 local5014 = (Class5_Sub40) Static265.aClass42_53.method1052((long) local140);
								if (local5014 != null) {
									Static339.method5623(true, local5014, false);
								}
								if (Static323.aClass96_20 != null) {
									Static336.method4719(Static323.aClass96_20);
									Static323.aClass96_20 = null;
								}
							}
							Static1.anInt4 = -1;
							return true;
						} else if (Static1.anInt4 == 29) {
							local500 = Static6.aClass5_Sub1_Sub1_1.method1832() == 1;
							local779 = Static6.aClass5_Sub1_Sub1_1.method1840();
							local783 = local779;
							if (local500) {
								local783 = Static6.aClass5_Sub1_Sub1_1.method1840();
							}
							local1153 = Static6.aClass5_Sub1_Sub1_1.method1884();
							local1158 = Static6.aClass5_Sub1_Sub1_1.method1845();
							local1163 = Static6.aClass5_Sub1_Sub1_1.method1843();
							local638 = Static6.aClass5_Sub1_Sub1_1.method1832();
							@Pc(5086) long local5086 = local1163 + (local1158 << 32);
							@Pc(5088) boolean local5088 = false;
							@Pc(5090) int local5090 = 0;
							while (true) {
								if (local5090 >= 100) {
									if (local638 <= 1) {
										if (Static343.aBoolean474 && !Static92.aBoolean136 || Static21.aBoolean465) {
											local5088 = true;
										} else if (Static299.method5080(local783)) {
											local5088 = true;
										}
									}
									break;
								}
								if (Static59.aLongArray2[local5090] == local5086) {
									local5088 = true;
									break;
								}
								local5090++;
							}
							if (!local5088 && Static322.anInt6105 == 0) {
								Static59.aLongArray2[Static98.anInt2181] = local5086;
								Static98.anInt2181 = (Static98.anInt2181 + 1) % 100;
								local1030 = Static337.method5620(Static314.method5369(Static259.method2973(Static6.aClass5_Sub1_Sub1_1)));
								if (local638 == 2 || local638 == 3) {
									Static243.method4137("<img=1>" + local783, local1030, "<img=1>" + local779, -1, Static176.method1787(local1153), 9, 0);
								} else if (local638 == 1) {
									Static243.method4137("<img=0>" + local783, local1030, "<img=0>" + local779, -1, Static176.method1787(local1153), 9, 0);
								} else {
									Static243.method4137(local783, local1030, local779, -1, Static176.method1787(local1153), 9, 0);
								}
							}
							Static1.anInt4 = -1;
							return true;
						} else if (Static1.anInt4 == 251) {
							Static6.aClass5_Sub1_Sub1_1.anInt2029 += 28;
							if (Static6.aClass5_Sub1_Sub1_1.method1868()) {
								Static148.method2744(Static6.aClass5_Sub1_Sub1_1.anInt2029 - 28, Static6.aClass5_Sub1_Sub1_1);
							}
							Static1.anInt4 = -1;
							return true;
						} else if (Static1.anInt4 == 103) {
							Static269.anInt5162 = Static6.aClass5_Sub1_Sub1_1.method1867() * 30;
							Static233.anInt4549 = Static211.anInt4205;
							Static1.anInt4 = -1;
							return true;
						} else if (Static1.anInt4 == 126) {
							local136 = Static6.aClass5_Sub1_Sub1_1.method1867();
							local140 = Static6.aClass5_Sub1_Sub1_1.method1867();
							local783 = Static6.aClass5_Sub1_Sub1_1.method1840();
							if (Static295.method4992(local136)) {
								Static49.method1096(local140, local783);
							}
							Static1.anInt4 = -1;
							return true;
						} else if (Static1.anInt4 == 236) {
							Static316.method5378(Static6.aClass5_Sub1_Sub1_1.method1840());
							Static1.anInt4 = -1;
							return true;
						} else if (Static1.anInt4 == 253) {
							if (Static30.aFrame1 != null) {
								Static56.method1201(-1, -1, Static326.anInt6197, false);
							}
							@Pc(5340) byte[] local5340 = new byte[Static179.anInt3568];
							Static6.aClass5_Sub1_Sub1_1.method176(local5340, Static179.anInt3568);
							local779 = Static326.method5503(local5340, Static179.anInt3568, 0);
							Static254.method4680(Static202.aClass10_3, local779, Static134.anInt2746 == 1, true);
							Static1.anInt4 = -1;
							return true;
						} else if (Static1.anInt4 == 27) {
							if (Static179.anInt3568 == 0) {
								Static27.aString305 = Static136.aString177;
							} else {
								Static27.aString305 = Static6.aClass5_Sub1_Sub1_1.method1840();
							}
							Static1.anInt4 = -1;
							return true;
						} else if (Static1.anInt4 == 10) {
							local136 = Static6.aClass5_Sub1_Sub1_1.method1862();
							local140 = Static6.aClass5_Sub1_Sub1_1.method1875();
							local144 = Static6.aClass5_Sub1_Sub1_1.method1883();
							if (Static295.method4992(local140)) {
								Static269.method4545(local144, local136);
							}
							Static1.anInt4 = -1;
							return true;
						} else if (Static1.anInt4 == 241) {
							Static135.anInt2757 = Static6.aClass5_Sub1_Sub1_1.method1832();
							Static295.anInt5639 = Static6.aClass5_Sub1_Sub1_1.method1832();
							Static144.anInt2894 = Static6.aClass5_Sub1_Sub1_1.method1832();
							Static1.anInt4 = -1;
							return true;
						} else if (Static1.anInt4 == 154) {
							Static207.method3697(true);
							Static1.anInt4 = -1;
							return true;
						} else if (Static1.anInt4 == 181) {
							Static152.anInt3091 = Static6.aClass5_Sub1_Sub1_1.method1832();
							Static203.anInt3939 = Static6.aClass5_Sub1_Sub1_1.method1846();
							while (Static6.aClass5_Sub1_Sub1_1.anInt2029 < Static179.anInt3568) {
								Static1.anInt4 = Static6.aClass5_Sub1_Sub1_1.method1832();
								Static205.method3637();
							}
							Static1.anInt4 = -1;
							return true;
						} else if (Static1.anInt4 == 123) {
							Static42.method904(Static179.anInt3568, Static6.aClass5_Sub1_Sub1_1, Static202.aClass10_3);
							Static1.anInt4 = -1;
							return true;
						} else if (Static1.anInt4 == 23) {
							local136 = Static6.aClass5_Sub1_Sub1_1.method1845();
							local140 = Static6.aClass5_Sub1_Sub1_1.method1875();
							local144 = Static6.aClass5_Sub1_Sub1_1.method1867();
							if (Static295.method4992(local144)) {
								Static32.method795(local136, local140);
							}
							Static1.anInt4 = -1;
							return true;
						} else if (Static1.anInt4 == 74) {
							Static117.method2316();
							Static173.method3937();
							Static18.anInt538 += 32;
							Static1.anInt4 = -1;
							return true;
						} else if (Static1.anInt4 == 77) {
							local136 = Static6.aClass5_Sub1_Sub1_1.method1845();
							local779 = Static6.aClass5_Sub1_Sub1_1.method1840();
							@Pc(5556) Object[] local5556 = new Object[local779.length() + 1];
							for (local167 = local779.length() - 1; local167 >= 0; local167--) {
								if (local779.charAt(local167) == 's') {
									local5556[local167 + 1] = Static6.aClass5_Sub1_Sub1_1.method1840();
								} else {
									local5556[local167 + 1] = Integer.valueOf(Static6.aClass5_Sub1_Sub1_1.method1826());
								}
							}
							local5556[0] = Integer.valueOf(Static6.aClass5_Sub1_Sub1_1.method1826());
							if (Static295.method4992(local136)) {
								@Pc(5616) Class5_Sub12 local5616 = new Class5_Sub12();
								local5616.anObjectArray3 = local5556;
								Static223.method3891(local5616);
							}
							Static1.anInt4 = -1;
							return true;
						} else if (Static1.anInt4 == 128) {
							Static203.anInt3939 = Static6.aClass5_Sub1_Sub1_1.method1885();
							Static152.anInt3091 = Static6.aClass5_Sub1_Sub1_1.method1872();
							for (@Pc(5643) Class5_Sub16 local5643 = (Class5_Sub16) Static3.aClass42_56.method1060(); local5643 != null; local5643 = (Class5_Sub16) Static3.aClass42_56.method1055()) {
								local140 = (int) (local5643.aLong218 & 0x3FFFL);
								local144 = (int) (local5643.aLong218 >> 14 & 0x3FFFL);
								local167 = (int) (local5643.aLong218 >> 28 & 0x3L);
								if (Static156.anInt3123 == local167 && Static152.anInt3091 <= local140 && Static152.anInt3091 + 8 > local140 && local144 >= Static203.anInt3939 && Static203.anInt3939 + 8 > local144) {
									local5643.method5803();
									Static60.method1250(Static156.anInt3123, local144, local140);
								}
							}
							for (@Pc(5722) Class5_Sub29 local5722 = (Class5_Sub29) Static208.aClass211_18.method5608(); local5722 != null; local5722 = (Class5_Sub29) Static208.aClass211_18.method5603()) {
								if (local5722.anInt3819 >= Static152.anInt3091 && local5722.anInt3819 < Static152.anInt3091 + 8 && Static203.anInt3939 <= local5722.anInt3810 && local5722.anInt3810 < Static203.anInt3939 + 8 && local5722.anInt3813 == Static156.anInt3123) {
									local5722.anInt3811 = 0;
								}
							}
							Static1.anInt4 = -1;
							return true;
						} else if (Static1.anInt4 == 162) {
							local1321 = Static6.aClass5_Sub1_Sub1_1.method1840();
							local140 = Static6.aClass5_Sub1_Sub1_1.method1845();
							local783 = Static52.method1171(local140).method2634(Static6.aClass5_Sub1_Sub1_1);
							Static243.method4137(local1321, local783, local1321, local140, null, 19, 0);
							Static1.anInt4 = -1;
							return true;
						} else if (Static1.anInt4 == 8) {
							local136 = Static6.aClass5_Sub1_Sub1_1.method1853();
							local140 = Static6.aClass5_Sub1_Sub1_1.method1845();
							if (Static295.method4992(local140)) {
								Static180.method3327(-1, -1, local136, 3);
							}
							Static1.anInt4 = -1;
							return true;
						} else if (Static1.anInt4 == 76) {
							local136 = Static6.aClass5_Sub1_Sub1_1.method1826();
							local140 = Static6.aClass5_Sub1_Sub1_1.method1845();
							if (local136 < -70000) {
								local140 += 32768;
							}
							if (local136 < 0) {
								local375 = null;
							} else {
								local375 = Static121.method2396(local136);
							}
							if (local375 != null) {
								for (local167 = 0; local167 < local375.anIntArray191.length; local167++) {
									local375.anIntArray191[local167] = 0;
									local375.anIntArray195[local167] = 0;
								}
							}
							Static108.method2171(local140);
							local167 = Static6.aClass5_Sub1_Sub1_1.method1845();
							for (local388 = 0; local388 < local167; local388++) {
								local390 = Static6.aClass5_Sub1_Sub1_1.method1885();
								if (local390 == 255) {
									local390 = Static6.aClass5_Sub1_Sub1_1.method1826();
								}
								local2554 = Static6.aClass5_Sub1_Sub1_1.method1839();
								if (local375 != null && local388 < local375.anIntArray191.length) {
									local375.anIntArray191[local388] = local2554;
									local375.anIntArray195[local388] = local390;
								}
								Static93.method1991(local2554 - 1, local390, local388, local140);
							}
							if (local375 != null) {
								Static336.method4719(local375);
							}
							Static173.method3937();
							Static22.anIntArray29[Static75.anInt1825++ & 0x1F] = local140 & 0x7FFF;
							Static1.anInt4 = -1;
							return true;
						} else {
							Static113.method2252(null, "T1 - " + Static1.anInt4 + "," + Static161.anInt3248 + "," + Static316.anInt6045 + " - " + Static179.anInt3568);
							Static310.method5284();
							return true;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILclient!ra;)V")
	public static void method5753(@OriginalArg(1) Class170 arg0) {
		Static88.aClass170_22 = arg0;
		Static58.anInt1392 = Static88.aClass170_22.method4575(4);
	}
}
