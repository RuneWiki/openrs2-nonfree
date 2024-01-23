import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!ni", name = "V", descriptor = "[I")
	public static int[] anIntArray303;

	@OriginalMember(owner = "client!ni", name = "bb", descriptor = "I")
	public static int anInt3788;

	@OriginalMember(owner = "client!ni", name = "db", descriptor = "I")
	public static int anInt3789;

	@OriginalMember(owner = "client!ni", name = "H", descriptor = "I")
	public static volatile int anInt3782 = -1;

	@OriginalMember(owner = "client!ni", name = "fb", descriptor = "J")
	public static long aLong199 = 0L;

	@OriginalMember(owner = "client!ni", name = "gb", descriptor = "Z")
	public static boolean aBoolean324 = false;

	@OriginalMember(owner = "client!ni", name = "ib", descriptor = "[I")
	public static int[] anIntArray304 = new int[25];

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "(I)V")
	public static void method3060() {
		if (Static260.anInt5416 == 0) {
			return;
		}
		try {
			if (++Static134.anInt2735 > 2000) {
				if (Static42.aClass45_1 != null) {
					Static42.aClass45_1.method1045();
					Static42.aClass45_1 = null;
				}
				if (Static217.anInt4539 >= 1) {
					Static260.anInt5416 = 0;
					Static184.anInt3908 = -5;
					return;
				}
				Static260.anInt5416 = 1;
				Static217.anInt4539++;
				Static134.anInt2735 = 0;
				if (Static205.anInt4279 == Static139.anInt3001) {
					Static205.anInt4279 = Static2.anInt5943;
				} else {
					Static205.anInt4279 = Static139.anInt3001;
				}
			}
			if (Static260.anInt5416 == 1) {
				Static23.aClass28_1 = Static299.aClass177_5.method4686(Static205.anInt4279, Static186.aString197);
				Static260.anInt5416 = 2;
			}
			@Pc(126) int local126;
			if (Static260.anInt5416 == 2) {
				if (Static23.aClass28_1.anInt726 == 2) {
					throw new IOException();
				}
				if (Static23.aClass28_1.anInt726 != 1) {
					return;
				}
				Static42.aClass45_1 = new Class45((Socket) Static23.aClass28_1.anObject2, Static299.aClass177_5);
				Static23.aClass28_1 = null;
				Static42.aClass45_1.method1043(Static95.aClass2_Sub26_Sub1_1.anInt5328, Static95.aClass2_Sub26_Sub1_1.aByteArray72);
				if (Static107.aClass3_2 != null) {
					Static107.aClass3_2.method2229();
				}
				if (Static68.aClass3_1 != null) {
					Static68.aClass3_1.method2229();
				}
				local126 = Static42.aClass45_1.method1047();
				if (Static107.aClass3_2 != null) {
					Static107.aClass3_2.method2229();
				}
				if (Static68.aClass3_1 != null) {
					Static68.aClass3_1.method2229();
				}
				if (local126 != 21) {
					Static184.anInt3908 = local126;
					Static260.anInt5416 = 0;
					Static42.aClass45_1.method1045();
					Static42.aClass45_1 = null;
					return;
				}
				Static260.anInt5416 = 3;
			}
			if (Static260.anInt5416 == 3) {
				if (Static42.aClass45_1.method1040() < 1) {
					return;
				}
				Static287.aStringArray35 = new String[Static42.aClass45_1.method1047()];
				Static260.anInt5416 = 4;
			}
			if (Static260.anInt5416 == 4) {
				if (Static42.aClass45_1.method1040() < Static287.aStringArray35.length * 8) {
					return;
				}
				Static250.aClass2_Sub26_Sub1_2.anInt5328 = 0;
				Static42.aClass45_1.method1048(Static287.aStringArray35.length * 8, 0, Static250.aClass2_Sub26_Sub1_2.aByteArray72);
				for (local126 = 0; local126 < Static287.aStringArray35.length; local126++) {
					Static287.aStringArray35[local126] = Static21.method454(Static250.aClass2_Sub26_Sub1_2.method4264());
				}
				Static184.anInt3908 = 21;
				Static260.anInt5416 = 0;
				Static42.aClass45_1.method1045();
				Static42.aClass45_1 = null;
				return;
			}
		} catch (@Pc(242) IOException local242) {
			if (Static42.aClass45_1 != null) {
				Static42.aClass45_1.method1045();
				Static42.aClass45_1 = null;
			}
			if (Static217.anInt4539 >= 1) {
				Static260.anInt5416 = 0;
				Static184.anInt3908 = -4;
			} else {
				Static217.anInt4539++;
				Static260.anInt5416 = 1;
				Static134.anInt2735 = 0;
				if (Static205.anInt4279 == Static139.anInt3001) {
					Static205.anInt4279 = Static2.anInt5943;
				} else {
					Static205.anInt4279 = Static139.anInt3001;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!jd;Lclient!jd;I)V")
	public static void method3061(@OriginalArg(0) Class84 arg0, @OriginalArg(1) Class84 arg1) {
		Static192.aClass84_81 = arg0;
		Static262.aClass84_135 = arg1;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method3063(@OriginalArg(0) String arg0) {
		@Pc(4) int local4 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(12) int local12 = 0; local12 < local4; local12++) {
			local10 = (local10 << 5) + (long) arg0.charAt(local12) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZIBIIZI)V")
	public static void method3064(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg4) {
			Static60.method1162();
		}
		if (Static8.aFrame1 != null && (arg5 != 3 || arg1 != Static163.anInt3419 || Static267.anInt4121 != arg2)) {
			Static42.method829(Static8.aFrame1, Static299.aClass177_5);
			Static8.aFrame1 = null;
		}
		if (arg5 == 3 && Static8.aFrame1 == null) {
			Static8.aFrame1 = Static44.method842(arg1, arg2, Static299.aClass177_5, 0);
			if (Static8.aFrame1 != null) {
				Static267.anInt4121 = arg2;
				Static163.anInt3419 = arg1;
				Static67.method4884(Static299.aClass177_5);
			}
		}
		if (arg5 == 3 && Static8.aFrame1 == null) {
			method3064(true, -1, -1, arg3, true, Static2.anInt5946);
			return;
		}
		@Pc(76) Container local76;
		if (Static8.aFrame1 != null) {
			local76 = Static8.aFrame1;
		} else if (Static298.aFrame3 == null) {
			local76 = Static299.aClass177_5.anApplet1;
		} else {
			local76 = Static298.aFrame3;
		}
		Static7.anInt240 = local76.getSize().width;
		Static112.anInt2423 = local76.getSize().height;
		@Pc(100) Insets local100;
		if (Static298.aFrame3 == local76) {
			local100 = Static298.aFrame3.getInsets();
			Static7.anInt240 -= local100.left + local100.right;
			Static112.anInt2423 -= local100.top + local100.bottom;
		}
		if (arg5 >= 2) {
			Static239.anInt4867 = 0;
			Static257.anInt5343 = Static7.anInt240;
			Static20.anInt1235 = Static112.anInt2423;
			Static10.anInt283 = 0;
		} else {
			Static239.anInt4867 = (Static7.anInt240 - 765) / 2;
			Static10.anInt283 = 0;
			Static20.anInt1235 = 503;
			Static257.anInt5343 = 765;
		}
		if (arg0) {
			Static299.method2234(Static105.aCanvas1);
			Static171.method2954(Static105.aCanvas1);
			if (Static260.aClass19_1 != null) {
				Static260.aClass19_1.method1060(Static105.aCanvas1);
			}
			Static262.aClient41.method684();
			Static281.method4664(Static105.aCanvas1);
			Static8.method242(Static105.aCanvas1);
			if (Static260.aClass19_1 != null) {
				Static260.aClass19_1.method1063(Static105.aCanvas1);
			}
		} else {
			if (Static60.aBoolean106) {
				Static60.method1175(Static257.anInt5343, Static20.anInt1235);
			}
			Static105.aCanvas1.setSize(Static257.anInt5343, Static20.anInt1235);
			if (local76 == Static298.aFrame3) {
				local100 = Static298.aFrame3.getInsets();
				Static105.aCanvas1.setLocation(local100.left + Static239.anInt4867, Static10.anInt283 + local100.top);
			} else {
				Static105.aCanvas1.setLocation(Static239.anInt4867, Static10.anInt283);
			}
		}
		if (arg5 == 0 && arg3 > 0) {
			Static60.method1141(Static105.aCanvas1);
		}
		if (arg4 && arg5 > 0) {
			Static105.aCanvas1.setIgnoreRepaint(true);
			if (!Static245.aBoolean441) {
				Static4.method120();
				Static170.aClass14_1 = null;
				Static170.aClass14_1 = Static280.method4660(Static20.anInt1235, Static257.anInt5343, Static105.aCanvas1);
				Static160.method2793();
				if (Static236.anInt4804 == 5) {
					Static231.method3884(true, Static153.aClass2_Sub3_Sub5_1);
				} else {
					Static264.method4420(false, Static245.aString256);
				}
				try {
					@Pc(255) Graphics local255 = Static105.aCanvas1.getGraphics();
					Static170.aClass14_1.method1194(local255);
				} catch (@Pc(263) Exception local263) {
				}
				Static241.method3944();
				if (arg3 == 0) {
					Static170.aClass14_1 = Static280.method4660(503, 765, Static105.aCanvas1);
				} else {
					Static170.aClass14_1 = null;
				}
				@Pc(284) Class28 local284 = Static299.aClass177_5.method4669(Static262.aClient41.getClass());
				while (local284.anInt726 == 0) {
					Static134.method2329(100L);
				}
				if (local284.anInt726 == 1) {
					Static245.aBoolean441 = true;
				}
			}
			if (Static245.aBoolean441) {
				Static60.method1148(Static105.aCanvas1, Static287.anInt5952 * 2);
			}
		}
		if (!Static60.aBoolean106 && arg5 > 0) {
			method3064(true, -1, -1, arg3, true, 0);
			return;
		}
		if (arg5 > 0 && arg3 == 0) {
			Static197.aThread2.setPriority(5);
			Static170.aClass14_1 = null;
			Static228.method3863();
			((Class127_Sub1) Static93.anInterface5_1).method3534(200);
			if (Static56.aBoolean96) {
				Static93.method1743(0.7F);
			}
			if (Static96.aClass147ArrayArray1 == null) {
				Static96.aClass147ArrayArray1 = new Class147[13][13];
			}
			Static128.method2278();
			Static194.method3247();
			Static206.method3480();
		} else if (arg5 == 0 && arg3 > 0) {
			Static197.aThread2.setPriority(1);
			Static170.aClass14_1 = Static280.method4660(503, 765, Static105.aCanvas1);
			Static228.method3870();
			Static179.method3101();
			((Class127_Sub1) Static93.anInterface5_1).method3534(20);
			if (Static56.aBoolean96) {
				if (Static105.anInt2269 == 1) {
					Static93.method1743(0.9F);
				}
				if (Static105.anInt2269 == 2) {
					Static93.method1743(0.8F);
				}
				if (Static105.anInt2269 == 3) {
					Static93.method1743(0.7F);
				}
				if (Static105.anInt2269 == 4) {
					Static93.method1743(0.6F);
				}
			}
			Static78.method1401();
			Static206.method3480();
		}
		Static280.aBoolean469 = !Static67.method4885();
		if (arg4) {
			Static68.method1299();
		}
		if (arg5 >= 2) {
			Static293.aBoolean484 = true;
		} else {
			Static293.aBoolean484 = false;
		}
		if (Static17.anInt427 != -1) {
			Static208.method3526(true);
		}
		if (Static42.aClass45_1 != null && (Static236.anInt4804 == 30 || Static236.anInt4804 == 25)) {
			Static181.method3133();
		}
		for (@Pc(475) int local475 = 0; local475 < 100; local475++) {
			Static165.aBooleanArray16[local475] = true;
		}
		Static248.aBoolean415 = true;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void method3065(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(11) String local11 = Static221.method3714(Static95.method1825(arg0));
		@Pc(13) boolean local13 = false;
		for (@Pc(15) int local15 = 0; local15 < Static68.anInt1507; local15++) {
			@Pc(28) Class36_Sub3_Sub2 local28 = Static212.aClass36_Sub3_Sub2Array1[Static33.anIntArray50[local15]];
			if (local28 != null && local28.aString249 != null && local28.aString249.equalsIgnoreCase(local11)) {
				local13 = true;
				if (arg1 == 1) {
					Static95.aClass2_Sub26_Sub1_1.method4287(5);
					Static95.aClass2_Sub26_Sub1_1.method4272(Static33.anIntArray50[local15]);
					Static95.aClass2_Sub26_Sub1_1.method4239(0);
				} else if (arg1 == 4) {
					Static95.aClass2_Sub26_Sub1_1.method4287(161);
					Static95.aClass2_Sub26_Sub1_1.method4231(Static33.anIntArray50[local15]);
					Static95.aClass2_Sub26_Sub1_1.method4234(0);
				} else if (arg1 == 5) {
					Static95.aClass2_Sub26_Sub1_1.method4287(92);
					Static95.aClass2_Sub26_Sub1_1.method4271(Static33.anIntArray50[local15]);
					Static95.aClass2_Sub26_Sub1_1.method4234(0);
				} else if (arg1 == 6) {
					Static95.aClass2_Sub26_Sub1_1.method4287(30);
					Static95.aClass2_Sub26_Sub1_1.method4249(Static33.anIntArray50[local15]);
					Static95.aClass2_Sub26_Sub1_1.method4234(0);
				} else if (arg1 == 7) {
					Static95.aClass2_Sub26_Sub1_1.method4287(250);
					Static95.aClass2_Sub26_Sub1_1.method4234(0);
					Static95.aClass2_Sub26_Sub1_1.method4231(Static33.anIntArray50[local15]);
				}
				break;
			}
		}
		if (!local13) {
			Static173.method2979("", Static22.aString19 + local11, 0);
		}
	}
}
