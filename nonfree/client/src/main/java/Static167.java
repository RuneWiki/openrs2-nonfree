import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!uh", name = "v", descriptor = "Lclient!ig;")
	public static Class30_Sub1 aClass30_Sub1_18;

	@OriginalMember(owner = "client!uh", name = "w", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1564 = Static169.method2903("::clientdrop");

	@OriginalMember(owner = "client!uh", name = "A", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1566 = Static169.method2903("compass");

	@OriginalMember(owner = "client!uh", name = "B", descriptor = "J")
	public static long aLong132 = 0L;

	@OriginalMember(owner = "client!uh", name = "C", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1567 = Static169.method2903("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!uh", name = "J", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1568 = aClass23_1567;

	@OriginalMember(owner = "client!uh", name = "K", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1569 = aClass23_1567;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZI)V")
	public static void method2884(@OriginalArg(1) int arg0) {
		Static105.method1817();
		Static75.method1344();
		@Pc(23) int local23 = Static169.method2900(arg0).anInt1282;
		if (local23 == 0) {
			return;
		}
		@Pc(30) int local30 = Static27.anIntArray108[arg0];
		if (local23 == 1) {
			if (local30 == 1) {
				Static121.method2144(0.9F);
			}
			if (local30 == 2) {
				Static121.method2144(0.8F);
			}
			if (local30 == 3) {
				Static121.method2144(0.7F);
			}
			if (local30 == 4) {
				Static121.method2144(0.6F);
			}
			Static165.method2854();
		}
		if (local23 == 3) {
			@Pc(68) short local68 = 0;
			if (local30 == 0) {
				local68 = 255;
			}
			if (local30 == 1) {
				local68 = 192;
			}
			if (local30 == 2) {
				local68 = 128;
			}
			if (local30 == 3) {
				local68 = 64;
			}
			if (local30 == 4) {
				local68 = 0;
			}
			if (Static38.anInt1035 != local68) {
				if (Static38.anInt1035 == 0 && Static77.anInt2101 != -1) {
					Static181.method3134(Static77.anInt2101, local68, aClass30_Sub1_18, 0);
					Static37.aBoolean48 = false;
				} else if (local68 == 0) {
					Static30.method1958();
					Static37.aBoolean48 = false;
				} else {
					Static180.method3103(local68);
				}
				Static38.anInt1035 = local68;
			}
		}
		if (local23 == 4) {
			if (local30 == 0) {
				Static11.anInt391 = 127;
			}
			if (local30 == 1) {
				Static11.anInt391 = 96;
			}
			if (local30 == 2) {
				Static11.anInt391 = 64;
			}
			if (local30 == 3) {
				Static11.anInt391 = 32;
			}
			if (local30 == 4) {
				Static11.anInt391 = 0;
			}
		}
		if (local23 == 9) {
			Static109.anInt2807 = local30;
		}
		if (local23 == 5) {
			Static90.anInt2406 = local30;
		}
		if (local23 == 10) {
			if (local30 == 0) {
				Static105.anInt2708 = 127;
			}
			if (local30 == 1) {
				Static105.anInt2708 = 96;
			}
			if (local30 == 2) {
				Static105.anInt2708 = 64;
			}
			if (local30 == 3) {
				Static105.anInt2708 = 32;
			}
			if (local30 == 4) {
				Static105.anInt2708 = 0;
			}
		}
		if (local23 == 6) {
			Static148.anInt3714 = local30;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIB)V")
	public static void method2885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static11.anInt391 == 0 || arg1 == 0 || Static33.anInt948 >= 50) {
			return;
		}
		Static17.anIntArray74[Static33.anInt948] = arg2;
		Static139.anIntArray473[Static33.anInt948] = arg1;
		Static68.anIntArray241[Static33.anInt948] = arg0;
		Static44.aClass6Array1[Static33.anInt948] = null;
		Static8.anIntArray48[Static33.anInt948] = 0;
		Static33.anInt948++;
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(BII)I")
	public static int method2886(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 >>> 31;
		return (arg0 + local7) / arg1 - local7;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!ga;B)V")
	public static void method2887(@OriginalArg(0) Class30 arg0) {
		Static148.aClass30_55 = arg0;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(BLclient!jg;)V")
	public static void method2888(@OriginalArg(1) Class1_Sub8 arg0) {
		if (Static44.aClass21_3 != null) {
			try {
				Static44.aClass21_3.method600(0L);
				Static44.aClass21_3.method590(24, arg0.aByteArray12, arg0.anInt1357);
			} catch (@Pc(27) Exception local27) {
			}
		}
		arg0.anInt1357 += 24;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V")
	public static void method2889() {
		aClass23_1566 = null;
		aClass23_1567 = null;
		aClass23_1564 = null;
		aClass30_Sub1_18 = null;
		aClass23_1568 = null;
		aClass23_1569 = null;
	}
}
