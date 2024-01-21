import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!le", name = "a", descriptor = "I")
	public static int anInt1729;

	@OriginalMember(owner = "client!le", name = "h", descriptor = "Lclient!fd;")
	public static Class24 aClass24_19;

	@OriginalMember(owner = "client!le", name = "j", descriptor = "Lclient!bf;")
	public static Class7 aClass7_1;

	@OriginalMember(owner = "client!le", name = "m", descriptor = "Lclient!ua;")
	public static Class24_Sub1 aClass24_Sub1_9;

	@OriginalMember(owner = "client!le", name = "b", descriptor = "Z")
	public static boolean aBoolean129 = false;

	@OriginalMember(owner = "client!le", name = "c", descriptor = "Lclient!ob;")
	public static Class55 aClass55_45 = new Class55(64);

	@OriginalMember(owner = "client!le", name = "d", descriptor = "[[S")
	public static short[][] aShortArrayArray11 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!le", name = "e", descriptor = "I")
	public static int anInt1730 = 0;

	@OriginalMember(owner = "client!le", name = "f", descriptor = "Lclient!kc;")
	public static Class2_Sub13 aClass2_Sub13_11 = null;

	@OriginalMember(owner = "client!le", name = "k", descriptor = "I")
	public static int anInt1733 = 0;

	@OriginalMember(owner = "client!le", name = "l", descriptor = "Z")
	public static boolean aBoolean130 = false;

	@OriginalMember(owner = "client!le", name = "n", descriptor = "Lclient!je;")
	public static Class40 aClass40_855 = Static69.method1231("Clientscript error )2 check log for details");

	@OriginalMember(owner = "client!le", name = "o", descriptor = "[Lclient!je;")
	public static Class40[] aClass40Array8 = new Class40[1000];

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
	public static void method1143() {
		Static57.aClass2_Sub9_Sub1_2.method673(146);
		for (@Pc(23) Class2_Sub11 local23 = (Class2_Sub11) Static61.aClass77_6.method2031(); local23 != null; local23 = (Class2_Sub11) Static61.aClass77_6.method2039()) {
			if (local23.anInt1312 == 0 || local23.anInt1312 == 3) {
				Static50.method891(true, local23);
			}
		}
		if (Static56.aClass2_Sub13_7 != null) {
			Static17.method316(Static56.aClass2_Sub13_7);
			Static56.aClass2_Sub13_7 = null;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
	public static void method1144() {
		aClass7_1 = null;
		aShortArrayArray11 = null;
		aClass24_19 = null;
		aClass55_45 = null;
		aClass2_Sub13_11 = null;
		aClass40Array8 = null;
		aClass40_855 = null;
		aClass24_Sub1_9 = null;
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(B)V")
	public static void method1145() {
		for (@Pc(10) Class2_Sub22 local10 = (Class2_Sub22) Static19.aClass3_4.method82(); local10 != null; local10 = (Class2_Sub22) Static19.aClass3_4.method74()) {
			if (local10.anInt2652 > 0) {
				local10.anInt2652--;
			}
			if (local10.anInt2652 != 0) {
				if (local10.anInt2639 > 0) {
					local10.anInt2639--;
				}
				if (local10.anInt2639 == 0 && local10.anInt2642 >= 1 && local10.anInt2653 >= 1 && local10.anInt2642 <= 102 && local10.anInt2653 <= 102 && (local10.anInt2646 < 0 || Static3.method83(local10.anInt2646, local10.anInt2640))) {
					Static114.method1893(local10.anInt2642, local10.anInt2646, local10.anInt2640, local10.anInt2647, local10.anInt2653, local10.anInt2648, local10.anInt2654);
					local10.anInt2639 = -1;
					if (local10.anInt2646 == local10.anInt2644 && local10.anInt2644 == -1) {
						local10.method2209();
					} else if (local10.anInt2644 == local10.anInt2646 && local10.anInt2649 == local10.anInt2648 && local10.anInt2643 == local10.anInt2640) {
						local10.method2209();
					}
				}
			} else if (local10.anInt2644 < 0 || Static3.method83(local10.anInt2644, local10.anInt2643)) {
				Static114.method1893(local10.anInt2642, local10.anInt2644, local10.anInt2643, local10.anInt2647, local10.anInt2653, local10.anInt2649, local10.anInt2654);
				local10.method2209();
			}
		}
	}
}
