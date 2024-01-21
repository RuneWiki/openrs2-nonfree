import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "Lclient!eh;")
	public static Class28 aClass28_180 = Static170.method3101("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
	public static int anInt481 = 0;

	@OriginalMember(owner = "client!bg", name = "k", descriptor = "Lclient!eh;")
	public static Class28 aClass28_181 = Static170.method3101("Spieler");

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
	public static void method525() {
		Static179.aBoolean202 = false;
		Static92.aBoolean194 = false;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!ph;")
	public static RuntimeException_Sub1 method526(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString2 = local12.aString2 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
	public static void method527() {
		Static63.aClass63_9.method2344();
		Static179.aClass63_31.method2344();
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)V")
	public static void method528() {
		aClass28_180 = null;
		aClass28_181 = null;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIIZ)Lclient!fb;")
	public static Class3_Sub2_Sub2_Sub4 method529(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(23) long local23 = ((long) arg2 << 40) + (long) arg0 + ((long) arg3 << 16) + ((long) arg1 << 38);
		@Pc(31) Class3_Sub2_Sub2_Sub4 local31;
		if (!arg4) {
			local31 = (Class3_Sub2_Sub2_Sub4) Static122.aClass63_21.method2337(local23);
			if (local31 != null) {
				return local31;
			}
		}
		@Pc(39) Class3_Sub2_Sub10 local39 = Static76.method1736(arg0);
		if (arg3 > 1 && local39.anIntArray322 != null) {
			@Pc(49) int local49 = -1;
			for (@Pc(51) int local51 = 0; local51 < 10; local51++) {
				if (arg3 >= local39.anIntArray321[local51] && local39.anIntArray321[local51] != 0) {
					local49 = local39.anIntArray322[local51];
				}
			}
			if (local49 != -1) {
				local39 = Static76.method1736(local49);
			}
		}
		@Pc(89) Class3_Sub2_Sub1_Sub1_Sub1 local89 = local39.method1455();
		if (local89 == null) {
			return null;
		}
		@Pc(95) Class3_Sub2_Sub2_Sub4 local95 = null;
		if (local39.anInt1890 != -1) {
			local95 = method529(local39.anInt1887, 1, 0, 10, true);
			if (local95 == null) {
				return null;
			}
		}
		@Pc(122) int[] local122 = Static147.anIntArray374;
		@Pc(124) int local124 = Static147.anInt2302;
		@Pc(126) int local126 = Static147.anInt2304;
		@Pc(129) int[] local129 = new int[4];
		Static147.method1769(local129);
		local31 = new Class3_Sub2_Sub2_Sub4(36, 32);
		Static147.method1780(local31.anIntArray222, 36, 32);
		Static147.method1776();
		Static13.method509();
		Static13.method510(16, 16);
		@Pc(150) int local150 = local39.anInt1880;
		if (arg4) {
			local150 = (int) ((double) local150 * 1.5D);
		} else if (arg1 == 2) {
			local150 = (int) ((double) local150 * 1.04D);
		}
		Static13.aBoolean28 = false;
		@Pc(181) int local181 = local150 * Class3_Sub2_Sub2_Sub2.anIntArray129[local39.anInt1895] >> 16;
		@Pc(190) int local190 = Class3_Sub2_Sub2_Sub2.anIntArray127[local39.anInt1895] * local150 >> 16;
		local89.method191();
		local89.method193(local39.anInt1873, local39.anInt1884, local39.anInt1895, local39.anInt1879, local190 + local39.anInt1867 - local89.aShort36 / 2, local39.anInt1867 + local181);
		if (arg1 >= 1) {
			local31.method985(1);
		}
		if (arg1 >= 2) {
			local31.method985(16777215);
		}
		if (arg2 != 0) {
			local31.method1003(arg2);
		}
		Static147.method1780(local31.anIntArray222, 36, 32);
		if (local39.anInt1890 != -1) {
			local95.method996(0, 0);
		}
		if (!arg4 && (local39.anInt1896 == 1 || arg3 != 1) && arg3 != -1) {
			Static72.aClass3_Sub2_Sub2_Sub1_Sub1_3.method1811(Static160.method2986(arg3), 0, 9, 16776960, 1);
		}
		if (!arg4) {
			Static122.aClass63_21.method2338(local23, local31);
		}
		Static147.method1780(local122, local126, local124);
		Static147.method1778(local129);
		Static13.method509();
		Static13.aBoolean28 = true;
		return local31;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIII)V")
	public static void method530(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static174.anInt4176 = 0;
		@Pc(158) int local158;
		for (@Pc(3) int local3 = -1; local3 < Static112.anInt2872 + Static69.anInt2115; local3++) {
			@Pc(9) Class3_Sub2_Sub1_Sub2 local9;
			if (local3 == -1) {
				local9 = Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1;
			} else if (local3 < Static112.anInt2872) {
				local9 = Static34.aClass3_Sub2_Sub1_Sub2_Sub1Array1[Static126.anIntArray557[local3]];
			} else {
				local9 = Static115.aClass3_Sub2_Sub1_Sub2_Sub2Array1[Static117.anIntArray523[local3 - Static112.anInt2872]];
			}
			if (local9 != null && local9.method1436()) {
				@Pc(47) Class3_Sub2_Sub7 local47;
				if (local9 instanceof Class3_Sub2_Sub1_Sub2_Sub2) {
					local47 = ((Class3_Sub2_Sub1_Sub2_Sub2) local9).aClass3_Sub2_Sub7_1;
					if (local47.anIntArray242 != null) {
						local47 = local47.method1118();
					}
					if (local47 == null) {
						continue;
					}
				}
				if (local3 >= Static112.anInt2872) {
					local47 = ((Class3_Sub2_Sub1_Sub2_Sub2) local9).aClass3_Sub2_Sub7_1;
					if (local47.anIntArray242 != null) {
						local47 = local47.method1118();
					}
					if (local47.anInt1313 >= 0 && Static118.aClass3_Sub2_Sub2_Sub4Array5.length > local47.anInt1313) {
						Static100.method2107(local9.method1438() + 15, local9);
						if (Static137.anInt3510 > -1) {
							Static118.aClass3_Sub2_Sub2_Sub4Array5[local47.anInt1313].method996(Static137.anInt3510 + arg3 - 12, arg1 + -30 + Static154.anInt3821);
						}
					}
					if (Static82.anInt2391 == 1 && Static117.anIntArray523[local3 - Static112.anInt2872] == Static22.anInt590 && anInt481 % 20 < 10) {
						Static100.method2107(local9.method1438() + 15, local9);
						if (Static137.anInt3510 > -1) {
							Static118.aClass3_Sub2_Sub2_Sub4Array4[0].method996(Static137.anInt3510 + arg3 - 12, Static154.anInt3821 + (arg1 - 28));
						}
					}
				} else {
					local158 = 30;
					@Pc(161) Class3_Sub2_Sub1_Sub2_Sub1 local161 = (Class3_Sub2_Sub1_Sub2_Sub1) local9;
					if (local161.anInt881 != -1 || local161.anInt884 != -1) {
						Static100.method2107(local9.method1438() + 15, local9);
						if (Static137.anInt3510 > -1) {
							if (local161.anInt881 != -1) {
								Static106.aClass3_Sub2_Sub2_Sub4Array2[local161.anInt881].method996(arg3 + Static137.anInt3510 - 12, arg1 + -30 + Static154.anInt3821);
								local158 += 25;
							}
							if (local161.anInt884 != -1) {
								Static118.aClass3_Sub2_Sub2_Sub4Array5[local161.anInt884].method996(Static137.anInt3510 + arg3 - 12, -local158 + arg1 + Static154.anInt3821);
								local158 += 25;
							}
						}
					}
					if (local3 >= 0 && Static82.anInt2391 == 10 && Static71.anInt2137 == Static126.anIntArray557[local3]) {
						Static100.method2107(local9.method1438() + 15, local9);
						if (Static137.anInt3510 > -1) {
							Static118.aClass3_Sub2_Sub2_Sub4Array4[1].method996(Static137.anInt3510 + arg3 - 12, arg1 - (-Static154.anInt3821 + local158));
						}
					}
				}
				if (local9.aClass28_554 != null && (local3 >= Static112.anInt2872 || Static108.anInt2803 == 0 || Static108.anInt2803 == 3 || Static108.anInt2803 == 1 && Static63.method1491(((Class3_Sub2_Sub1_Sub2_Sub1) local9).aClass28_296))) {
					Static100.method2107(local9.method1438(), local9);
					if (Static137.anInt3510 > -1 && Static174.anInt4176 < Static126.anInt3252) {
						Static126.anIntArray558[Static174.anInt4176] = Static43.aClass3_Sub2_Sub2_Sub1_Sub1_2.method1805(local9.aClass28_554) / 2;
						Static126.anIntArray555[Static174.anInt4176] = Static43.aClass3_Sub2_Sub2_Sub1_Sub1_2.anInt2310;
						Static126.anIntArray563[Static174.anInt4176] = Static137.anInt3510;
						Static126.anIntArray559[Static174.anInt4176] = Static154.anInt3821;
						Static126.anIntArray560[Static174.anInt4176] = local9.anInt1785;
						Static126.anIntArray561[Static174.anInt4176] = local9.anInt1819;
						Static126.anIntArray556[Static174.anInt4176] = local9.anInt1829;
						Static126.aClass28Array20[Static174.anInt4176] = local9.aClass28_554;
						Static174.anInt4176++;
					}
				}
				if (local9.anInt1807 > anInt481) {
					Static100.method2107(local9.method1438() + 15, local9);
					if (Static137.anInt3510 > -1) {
						Static147.method1775(arg3 + Static137.anInt3510 - 15, Static154.anInt3821 + arg1 - 3, local9.anInt1803, 5, 65280);
						Static147.method1775(Static137.anInt3510 + arg3 + local9.anInt1803 - 15, arg1 + -3 + Static154.anInt3821, 30 - local9.anInt1803, 5, 16711680);
					}
				}
				for (local158 = 0; local158 < 4; local158++) {
					if (local9.anIntArray312[local158] > anInt481) {
						Static100.method2107(local9.method1438() / 2, local9);
						if (Static137.anInt3510 > -1) {
							if (local158 == 1) {
								Static154.anInt3821 -= 20;
							}
							if (local158 == 2) {
								Static154.anInt3821 -= 10;
								Static137.anInt3510 -= 15;
							}
							if (local158 == 3) {
								Static154.anInt3821 -= 10;
								Static137.anInt3510 += 15;
							}
							Static128.aClass3_Sub2_Sub2_Sub4Array6[local9.anIntArray315[local158]].method996(Static137.anInt3510 + arg3 - 12, Static154.anInt3821 + -12 + arg1);
							Static146.aClass3_Sub2_Sub2_Sub1_Sub1_5.method1787(Static146.method2793(local9.anIntArray313[local158]), arg3 + Static137.anInt3510 - 1, Static154.anInt3821 + 3 + arg1, 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(514) int local514 = 0; local514 < Static174.anInt4176; local514++) {
			@Pc(519) int local519 = Static126.anIntArray559[local514];
			local158 = Static126.anIntArray563[local514];
			@Pc(527) int local527 = Static126.anIntArray555[local514];
			@Pc(529) boolean local529 = true;
			@Pc(533) int local533 = Static126.anIntArray558[local514];
			while (local529) {
				local529 = false;
				for (@Pc(538) int local538 = 0; local538 < local514; local538++) {
					if (local519 + 2 > Static126.anIntArray559[local538] + -Static126.anIntArray555[local538] && local519 - local527 < Static126.anIntArray559[local538] + 2 && local158 - local533 < Static126.anIntArray563[local538] - -Static126.anIntArray558[local538] && Static126.anIntArray563[local538] - Static126.anIntArray558[local538] < local158 - -local533 && local519 > Static126.anIntArray559[local538] - Static126.anIntArray555[local538]) {
						local519 = Static126.anIntArray559[local538] - Static126.anIntArray555[local538];
						local529 = true;
					}
				}
			}
			Static137.anInt3510 = Static126.anIntArray563[local514];
			Static154.anInt3821 = Static126.anIntArray559[local514] = local519;
			@Pc(631) Class28 local631 = Static126.aClass28Array20[local514];
			if (Static74.anInt2220 == 0) {
				@Pc(650) int local650 = 16776960;
				if (Static126.anIntArray560[local514] < 6) {
					local650 = Static109.anIntArray491[Static126.anIntArray560[local514]];
				}
				if (Static126.anIntArray560[local514] == 6) {
					local650 = Static44.anInt3939 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static126.anIntArray560[local514] == 7) {
					local650 = Static44.anInt3939 % 20 < 10 ? 255 : 65535;
				}
				if (Static126.anIntArray560[local514] == 8) {
					local650 = Static44.anInt3939 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(722) int local722;
				if (Static126.anIntArray560[local514] == 9) {
					local722 = 150 - Static126.anIntArray556[local514];
					if (local722 < 50) {
						local650 = local722 * 1280 + 16711680;
					} else if (local722 < 100) {
						local650 = 33160960 - local722 * 327680;
					} else if (local722 < 150) {
						local650 = (local722 - 100) * 5 + 65280;
					}
				}
				if (Static126.anIntArray560[local514] == 10) {
					local722 = 150 - Static126.anIntArray556[local514];
					if (local722 < 50) {
						local650 = local722 * 5 + 16711680;
					} else if (local722 < 100) {
						local650 = 16711935 + 16384000 - local722 * 327680;
					} else if (local722 < 150) {
						local650 = local722 * 327680 - (local722 + -100) * 5 - 32767745;
					}
				}
				if (Static126.anIntArray560[local514] == 11) {
					local722 = 150 - Static126.anIntArray556[local514];
					if (local722 < 50) {
						local650 = 16777215 - local722 * 327685;
					} else if (local722 < 100) {
						local650 = local722 * 327685 + 65280 - 16384250;
					} else if (local722 < 150) {
						local650 = 16777215 + 32768000 - local722 * 327680;
					}
				}
				if (Static126.anIntArray561[local514] == 0) {
					Static43.aClass3_Sub2_Sub2_Sub1_Sub1_2.method1787(local631, Static137.anInt3510 + arg3, Static154.anInt3821 + arg1, local650, 0);
				}
				if (Static126.anIntArray561[local514] == 1) {
					Static43.aClass3_Sub2_Sub2_Sub1_Sub1_2.method1796(local631, Static137.anInt3510 + arg3, arg1 + Static154.anInt3821, local650, Static44.anInt3939);
				}
				if (Static126.anIntArray561[local514] == 2) {
					Static43.aClass3_Sub2_Sub2_Sub1_Sub1_2.method1795(local631, arg3 + Static137.anInt3510, arg1 - -Static154.anInt3821, local650, Static44.anInt3939);
				}
				if (Static126.anIntArray561[local514] == 3) {
					Static43.aClass3_Sub2_Sub2_Sub1_Sub1_2.method1783(local631, arg3 + Static137.anInt3510, Static154.anInt3821 + arg1, local650, Static44.anInt3939, 150 - Static126.anIntArray556[local514]);
				}
				if (Static126.anIntArray561[local514] == 4) {
					local722 = (150 - Static126.anIntArray556[local514]) * (Static43.aClass3_Sub2_Sub2_Sub1_Sub1_2.method1805(local631) + 100) / 150;
					Static147.method1764(Static137.anInt3510 + arg3 - 50, arg1, arg3 + Static137.anInt3510 + 50, arg2 + arg1);
					Static43.aClass3_Sub2_Sub2_Sub1_Sub1_2.method1811(local631, Static137.anInt3510 + arg3 + 50 - local722, Static154.anInt3821 + arg1, local650, 0);
					Static147.method1773(arg3, arg1, arg3 + arg0, arg2 + arg1);
				}
				if (Static126.anIntArray561[local514] == 5) {
					@Pc(999) int local999 = 0;
					local722 = 150 - Static126.anIntArray556[local514];
					if (local722 < 25) {
						local999 = local722 - 25;
					} else if (local722 > 125) {
						local999 = local722 - 125;
					}
					Static147.method1764(arg3, arg1 + Static154.anInt3821 - Static43.aClass3_Sub2_Sub2_Sub1_Sub1_2.anInt2310 - 1, arg3 - -arg0, Static154.anInt3821 + arg1 + 5);
					Static43.aClass3_Sub2_Sub2_Sub1_Sub1_2.method1787(local631, Static137.anInt3510 + arg3, local999 + Static154.anInt3821 + arg1, local650, 0);
					Static147.method1773(arg3, arg1, arg0 + arg3, arg2 + arg1);
				}
			} else {
				Static43.aClass3_Sub2_Sub2_Sub1_Sub1_2.method1787(local631, Static137.anInt3510 + arg3, Static154.anInt3821 + arg1, 16776960, 0);
			}
		}
	}
}
