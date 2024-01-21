import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!vc", name = "Q", descriptor = "Lclient!vc;")
	public static Class98 aClass98_18;

	@OriginalMember(owner = "client!vc", name = "Sc", descriptor = "I")
	public static int anInt4423;

	@OriginalMember(owner = "client!vc", name = "I", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1258 = Static81.method1507("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!vc", name = "Tb", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1262 = Static81.method1507("hint_headicons");

	@OriginalMember(owner = "client!vc", name = "cc", descriptor = "[J")
	public static final long[] aLongArray36 = new long[500];

	@OriginalMember(owner = "client!vc", name = "Mc", descriptor = "I")
	public static int anInt4420 = 0;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
	public static void method3331() {
		Static192.aClass1_Sub7_Sub1_31.method2809();
		@Pc(15) int local15 = Static192.aClass1_Sub7_Sub1_31.method2811(1);
		if (local15 == 0) {
			return;
		}
		@Pc(26) int local26 = Static192.aClass1_Sub7_Sub1_31.method2811(2);
		if (local26 == 0) {
			Static127.anIntArray222[Static24.anInt663++] = 2047;
			return;
		}
		@Pc(55) int local55;
		@Pc(65) int local65;
		if (local26 == 1) {
			local55 = Static192.aClass1_Sub7_Sub1_31.method2811(3);
			Static87.aClass5_Sub2_Sub1_1.method1892(false, local55);
			local65 = Static192.aClass1_Sub7_Sub1_31.method2811(1);
			if (local65 == 1) {
				Static127.anIntArray222[Static24.anInt663++] = 2047;
			}
			return;
		}
		@Pc(107) int local107;
		if (local26 == 2) {
			local55 = Static192.aClass1_Sub7_Sub1_31.method2811(3);
			Static87.aClass5_Sub2_Sub1_1.method1892(true, local55);
			local65 = Static192.aClass1_Sub7_Sub1_31.method2811(3);
			Static87.aClass5_Sub2_Sub1_1.method1892(true, local65);
			local107 = Static192.aClass1_Sub7_Sub1_31.method2811(1);
			if (local107 == 1) {
				Static127.anIntArray222[Static24.anInt663++] = 2047;
			}
		} else if (local26 == 3) {
			local55 = Static192.aClass1_Sub7_Sub1_31.method2811(7);
			local65 = Static192.aClass1_Sub7_Sub1_31.method2811(1);
			if (local65 == 1) {
				Static127.anIntArray222[Static24.anInt663++] = 2047;
			}
			Static170.anInt3799 = Static192.aClass1_Sub7_Sub1_31.method2811(2);
			local107 = Static192.aClass1_Sub7_Sub1_31.method2811(1);
			@Pc(160) int local160 = Static192.aClass1_Sub7_Sub1_31.method2811(7);
			Static87.aClass5_Sub2_Sub1_1.method1889(local55, local160, local107 == 1);
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(JI)V")
	public static void method3343(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static34.anInt921 >= 100) {
			Static200.method3377(Static175.aClass24_1129, 0, Static85.aClass24_1000);
			return;
		}
		@Pc(25) Class24 local25 = Static35.method3219(arg0).method761();
		for (@Pc(27) int local27 = 0; local27 < Static34.anInt921; local27++) {
			if (Static135.aLongArray25[local27] == arg0) {
				Static200.method3377(Static63.method1281(new Class24[] { local25, Static83.aClass24_598 }), 0, Static85.aClass24_1000);
				return;
			}
		}
		for (@Pc(61) int local61 = 0; local61 < Static105.anInt2367; local61++) {
			if (Static145.aLongArray28[local61] == arg0) {
				Static200.method3377(Static63.method1281(new Class24[] { Static65.aClass24_467, local25, Static128.aClass24_851 }), 0, Static85.aClass24_1000);
				return;
			}
		}
		if (local25.method755(Static87.aClass5_Sub2_Sub1_1.aClass24_173)) {
			Static200.method3377(Static134.aClass24_900, 0, Static85.aClass24_1000);
			return;
		}
		Static135.aLongArray25[Static34.anInt921] = arg0;
		Static137.aClass24Array19[Static34.anInt921++] = Static35.method3219(arg0);
		Static127.anInt2781 = Static60.anInt3643;
		Static176.aClass1_Sub7_Sub1_34.method2808(101);
		Static176.aClass1_Sub7_Sub1_34.method2801(arg0);
	}
}
