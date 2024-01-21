import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "Lclient!v;")
	public static Class76 aClass76_1286 = Static134.method2017("Diese Betatest)2Welt ist nur f-Ur eingeladene");

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "Lclient!v;")
	public static Class76 aClass76_1287 = Static134.method2017(" <col=ffffff>");

	@OriginalMember(owner = "client!vf", name = "j", descriptor = "Lclient!v;")
	private static Class76 aClass76_1290 = Static134.method2017("Loading )2 please wait)3");

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "Lclient!v;")
	public static Class76 aClass76_1288 = aClass76_1290;

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "Lclient!v;")
	public static Class76 aClass76_1289 = Static134.method2017("<col=ff7000>");

	@OriginalMember(owner = "client!vf", name = "l", descriptor = "Lclient!v;")
	public static Class76 aClass76_1291 = Static134.method2017("");

	@OriginalMember(owner = "client!vf", name = "r", descriptor = "Lclient!v;")
	public static Class76 aClass76_1292 = Static134.method2017("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!vf", name = "w", descriptor = "Lclient!v;")
	public static Class76 aClass76_1293 = Static134.method2017(" )2> ");

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
	public static void method1913() {
		@Pc(6) int local6 = Static24.aClass4_Sub10_Sub1_1.method608(8);
		@Pc(15) int local15;
		if (local6 < Static106.anInt2357) {
			for (local15 = local6; local15 < Static106.anInt2357; local15++) {
				Static88.anIntArray290[Static104.anInt2333++] = Static113.anIntArray348[local15];
			}
		}
		if (local6 > Static106.anInt2357) {
			throw new RuntimeException("gppov1");
		}
		Static106.anInt2357 = 0;
		for (local15 = 0; local15 < local6; local15++) {
			@Pc(62) int local62 = Static113.anIntArray348[local15];
			@Pc(66) Class4_Sub4_Sub3_Sub1_Sub2 local66 = Static105.aClass4_Sub4_Sub3_Sub1_Sub2Array1[local62];
			@Pc(71) int local71 = Static24.aClass4_Sub10_Sub1_1.method608(1);
			if (local71 == 0) {
				Static113.anIntArray348[Static106.anInt2357++] = local62;
				local66.anInt1391 = Static78.anInt1981;
			} else {
				@Pc(91) int local91 = Static24.aClass4_Sub10_Sub1_1.method608(2);
				if (local91 == 0) {
					Static113.anIntArray348[Static106.anInt2357++] = local62;
					local66.anInt1391 = Static78.anInt1981;
					Static60.anIntArray201[Static48.anInt1228++] = local62;
				} else {
					@Pc(136) int local136;
					@Pc(146) int local146;
					if (local91 == 1) {
						Static113.anIntArray348[Static106.anInt2357++] = local62;
						local66.anInt1391 = Static78.anInt1981;
						local136 = Static24.aClass4_Sub10_Sub1_1.method608(3);
						local66.method973(local136, false);
						local146 = Static24.aClass4_Sub10_Sub1_1.method608(1);
						if (local146 == 1) {
							Static60.anIntArray201[Static48.anInt1228++] = local62;
						}
					} else if (local91 == 2) {
						Static113.anIntArray348[Static106.anInt2357++] = local62;
						local66.anInt1391 = Static78.anInt1981;
						local136 = Static24.aClass4_Sub10_Sub1_1.method608(3);
						local66.method973(local136, true);
						local146 = Static24.aClass4_Sub10_Sub1_1.method608(3);
						local66.method973(local146, true);
						@Pc(198) int local198 = Static24.aClass4_Sub10_Sub1_1.method608(1);
						if (local198 == 1) {
							Static60.anIntArray201[Static48.anInt1228++] = local62;
						}
					} else if (local91 == 3) {
						Static88.anIntArray290[Static104.anInt2333++] = local62;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIII)V")
	public static void method1917(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) int local15 = 0; local15 < Static77.anInt1960; local15++) {
			if (arg0 < Static134.anIntArray409[local15] + Static41.anIntArray131[local15] && arg0 + arg2 > Static41.anIntArray131[local15] && arg3 < Static126.anIntArray396[local15] + Static30.anIntArray185[local15] && Static126.anIntArray396[local15] < arg3 + arg1) {
				Static132.aBooleanArray18[local15] = true;
			}
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)V")
	public static void method1918() {
		for (@Pc(6) Class4_Sub14 local6 = (Class4_Sub14) Static42.aClass28_3.method775(); local6 != null; local6 = (Class4_Sub14) Static42.aClass28_3.method771()) {
			@Pc(13) int local13 = local6.anInt1980;
			if (Static45.method816(local13)) {
				@Pc(19) boolean local19 = true;
				@Pc(23) Class4_Sub8[] local23 = Static29.aClass4_Sub8ArrayArray1[local13];
				for (@Pc(25) int local25 = 0; local25 < local23.length; local25++) {
					if (local23[local25] != null) {
						local19 = local23[local25].aBoolean37;
						break;
					}
				}
				if (!local19) {
					@Pc(49) int local49 = (int) local6.aLong99;
					@Pc(53) Class4_Sub8 local53 = Static52.method946(local49);
					if (local53 != null) {
						Static63.method1095(local53);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)V")
	public static void method1922(@OriginalArg(0) int arg0) {
		if (arg0 == -1 && !Static18.aBoolean22) {
			Static84.method1425();
		} else if (arg0 != -1 && arg0 != Static118.anInt2556 && Static32.anInt808 != 0 && !Static18.aBoolean22) {
			Static28.method379(0, arg0, Static50.aClass17_Sub1_12, Static32.anInt808);
		}
		Static118.anInt2556 = arg0;
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(Z)V")
	public static void method1926() {
		aClass76_1289 = null;
		aClass76_1293 = null;
		aClass76_1288 = null;
		aClass76_1290 = null;
		aClass76_1291 = null;
		aClass76_1286 = null;
		aClass76_1287 = null;
		aClass76_1292 = null;
	}
}
