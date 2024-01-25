import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!sa", name = "I", descriptor = "I")
	public static int anInt5327;

	@OriginalMember(owner = "client!sa", name = "M", descriptor = "I")
	public static int anInt5330;

	@OriginalMember(owner = "client!sa", name = "D", descriptor = "Lclient!us;")
	public static final Class234 aClass234_108 = new Class234(7, -2);

	@OriginalMember(owner = "client!sa", name = "H", descriptor = "[Lclient!oa;")
	public static final Class28_Sub1_Sub1_Sub2[] aClass28_Sub1_Sub1_Sub2Array1 = new Class28_Sub1_Sub1_Sub2[2048];

	@OriginalMember(owner = "client!sa", name = "J", descriptor = "[I")
	public static final int[] anIntArray589 = new int[13];

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
	public static void method4743() {
		for (@Pc(10) Class3_Sub4 local10 = (Class3_Sub4) Static47.aClass138_7.method3051(); local10 != null; local10 = (Class3_Sub4) Static47.aClass138_7.method3050()) {
			if (Static147.method2299(local10.anInt808)) {
				Static352.method5282(local10);
			}
		}
		if (Static105.anInt2076 == 1) {
			Static287.aBoolean397 = false;
			Static203.method3170(Static321.anInt3403, Static96.anInt1932, Static392.anInt6472, Static139.anInt2635);
			return;
		}
		Static203.method3170(Static321.anInt3403, Static96.anInt1932, Static392.anInt6472, Static139.anInt2635);
		@Pc(55) int local55 = Static366.aClass190_7.method4358(Static14.aClass57_6.method1122(Static66.anInt1307));
		for (@Pc(60) Class3_Sub4 local60 = (Class3_Sub4) Static47.aClass138_7.method3051(); local60 != null; local60 = (Class3_Sub4) Static47.aClass138_7.method3050()) {
			@Pc(66) int local66 = Static133.method2093(local60);
			if (local66 > local55) {
				local55 = local66;
			}
		}
		Static392.anInt6472 = local55 + 8;
		Static139.anInt2635 = (Static349.aBoolean449 ? 26 : 22) + Static105.anInt2076 * 16;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BII)V")
	public static void method4744(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class3_Sub7_Sub8 local13 = Static275.method4307(1, arg0);
		local13.method3219();
		local13.anInt3670 = arg1;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZLclient!km;I)V")
	public static void method4745(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class28_Sub1_Sub1_Sub1 arg1) {
		if (Static105.anInt2076 >= 400) {
			return;
		}
		@Pc(14) Class61 local14 = arg1.aClass61_1;
		if (local14.anIntArray142 != null) {
			local14 = local14.method1216(Static331.aClass115_1);
			if (local14 == null) {
				return;
			}
		}
		if (!local14.aBoolean102) {
			return;
		}
		@Pc(39) String local39 = local14.aString17;
		if (local14.anInt1435 != 0) {
			@Pc(60) String local60 = Static121.aClass63_2 == Static340.aClass63_3 ? Static163.aClass57_48.method1122(Static66.anInt1307) : Static81.aClass57_30.method1122(Static66.anInt1307);
			local39 = local39 + Static142.method2268(local14.anInt1435, Static226.aClass28_Sub1_Sub1_Sub2_2.anInt4381) + " (" + local60 + local14.anInt1435 + ")";
		}
		if (!Static68.aBoolean81) {
			if (!arg0) {
				@Pc(148) String[] local148 = local14.aStringArray10;
				if (Static28.aBoolean12) {
					local148 = Static27.method327(local148);
				}
				@Pc(158) int local158;
				if (local148 != null) {
					for (local158 = 4; local158 >= 0; local158--) {
						if (local148[local158] != null && (Static121.aClass63_2 != Static17.aClass63_1 || !local148[local158].equalsIgnoreCase(Static33.aClass57_16.method1122(Static66.anInt1307)))) {
							@Pc(178) byte local178 = 0;
							@Pc(180) int local180 = Static30.anInt546;
							if (local158 == 0) {
								local178 = 9;
							}
							if (local158 == 1) {
								local178 = 58;
							}
							if (local158 == 2) {
								local178 = 46;
							}
							if (local158 == 3) {
								local178 = 10;
							}
							if (local158 == 4) {
								local178 = 4;
							}
							if (local158 == local14.anInt1436) {
								local180 = local14.anInt1450;
							}
							if (local14.anInt1442 == local158) {
								local180 = local14.anInt1449;
							}
							Static90.method1499(local178, -1, 0, 0, (long) arg1.anInt4373, "<col=ffff00>" + local39, true, local148[local158], false, local180);
						}
					}
				}
				if (Static17.aClass63_1 == Static121.aClass63_2 && local148 != null) {
					for (local158 = 4; local158 >= 0; local158--) {
						if (local148[local158] != null && local148[local158].equalsIgnoreCase(Static33.aClass57_16.method1122(Static66.anInt1307))) {
							@Pc(277) short local277 = 0;
							if (local14.anInt1435 > Static226.aClass28_Sub1_Sub1_Sub2_2.anInt4381) {
								local277 = 2000;
							}
							@Pc(290) short local290 = 0;
							if (local158 == 0) {
								local290 = 9;
							}
							if (local158 == 1) {
								local290 = 58;
							}
							if (local158 == 2) {
								local290 = 46;
							}
							if (local158 == 3) {
								local290 = 10;
							}
							if (local158 == 4) {
								local290 = 4;
							}
							if (local290 != 0) {
								local290 += local277;
							}
							Static90.method1499(local290, -1, 0, 0, (long) arg1.anInt4373, "<col=ffff00>" + local39, true, local148[local158], false, local14.anInt1463);
						}
					}
				}
			}
			Static90.method1499(1012, -1, 0, 0, (long) arg1.anInt4373, "<col=ffff00>" + local39, true, Static279.aClass57_90.method1122(Static66.anInt1307), arg0, Static185.anInt3278);
		} else if (!arg0) {
			@Pc(100) Class104 local100 = Static13.anInt5215 == -1 ? null : Static255.aClass187_2.method4279(Static13.anInt5215);
			if ((Static122.anInt2309 & 0x2) != 0) {
				if (local100 == null || local14.method1207(Static13.anInt5215, local100.anInt2631) != local100.anInt2631) {
					Static90.method1499(3, -1, 0, 0, (long) arg1.anInt4373, Static356.aString8 + " -> <col=ffff00>" + local39, true, Static208.aString38, false, Static158.anInt2845);
				}
				return;
			}
		}
	}
}
