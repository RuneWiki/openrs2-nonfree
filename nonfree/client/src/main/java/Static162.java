import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "J")
	public static long aLong127;

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "Lclient!dd;")
	public static Class16 aClass16_34;

	@OriginalMember(owner = "client!ug", name = "h", descriptor = "Lclient!od;")
	public static Class53 aClass53_4;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1141 = Static8.method128("blinken1:");

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "[I")
	public static int[] anIntArray401 = new int[2000];

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "[J")
	public static long[] aLongArray6 = new long[100];

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IJ)V")
	public static void method2993(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static39.anInt1205 >= 100) {
			Static88.method1922(Static62.aClass18_472, 0, Static56.aClass18_537);
			return;
		}
		@Pc(25) Class18 local25 = Static124.method2453(arg0).method739();
		for (@Pc(27) int local27 = 0; local27 < Static39.anInt1205; local27++) {
			if (aLongArray6[local27] == arg0) {
				Static88.method1922(Static62.aClass18_472, 0, Static144.method2735(new Class18[] { local25, Static87.aClass18_653 }));
				return;
			}
		}
		for (@Pc(66) int local66 = 0; local66 < Static20.anInt570; local66++) {
			if (arg0 == Static146.aLongArray5[local66]) {
				Static88.method1922(Static62.aClass18_472, 0, Static144.method2735(new Class18[] { Static156.aClass18_1099, local25, Static127.aClass18_913 }));
				return;
			}
		}
		if (local25.method723(Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.aClass18_908)) {
			Static88.method1922(Static62.aClass18_472, 0, Static170.aClass18_1199);
			return;
		}
		aLongArray6[Static39.anInt1205] = arg0;
		Static39.aClass18Array6[Static39.anInt1205++] = Static124.method2453(arg0);
		Static159.anInt4381 = Static167.anInt4526;
		Static95.aClass1_Sub6_Sub1_1.method555(152);
		Static95.aClass1_Sub6_Sub1_1.method515(arg0);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
	public static int method2994(@OriginalArg(0) KeyEvent arg0) {
		@Pc(11) int local11 = arg0.getKeyChar();
		if (local11 == 8364) {
			return 128;
		} else {
			if (local11 <= 0 || local11 >= 256) {
				local11 = -1;
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
	public static void method2995() {
		aClass53_4 = null;
		aLongArray6 = null;
		aClass18_1141 = null;
		aClass16_34 = null;
		anIntArray401 = null;
	}
}
