import java.awt.Component;
import java.awt.Image;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!tc", name = "y", descriptor = "Ljava/awt/Image;")
	public static Image anImage4;

	@OriginalMember(owner = "client!tc", name = "K", descriptor = "Lclient!ic;")
	public static Class4_Sub2_Sub3_Sub1 aClass4_Sub2_Sub3_Sub1_8;

	@OriginalMember(owner = "client!tc", name = "hb", descriptor = "[I")
	public static int[] anIntArray306;

	@OriginalMember(owner = "client!tc", name = "kb", descriptor = "Lclient!ea;")
	public static Class20_Sub1 aClass20_Sub1_16;

	@OriginalMember(owner = "client!tc", name = "nb", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1483 = Static28.method504("cyan:");

	@OriginalMember(owner = "client!tc", name = "z", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1475 = aClass39_1483;

	@OriginalMember(owner = "client!tc", name = "F", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1476 = Static28.method504("Please wait)3)3)3");

	@OriginalMember(owner = "client!tc", name = "G", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1477 = aClass39_1483;

	@OriginalMember(owner = "client!tc", name = "L", descriptor = "[Z")
	public static boolean[] aBooleanArray16 = new boolean[100];

	@OriginalMember(owner = "client!tc", name = "M", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1478 = Static28.method504("bevor Sie den Vorgang wiederholen)3");

	@OriginalMember(owner = "client!tc", name = "mb", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1482 = Static28.method504("Click to switch");

	@OriginalMember(owner = "client!tc", name = "Q", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1479 = aClass39_1482;

	@OriginalMember(owner = "client!tc", name = "R", descriptor = "[[I")
	public static int[][] anIntArrayArray23 = new int[5][5000];

	@OriginalMember(owner = "client!tc", name = "Z", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1480 = aClass39_1476;

	@OriginalMember(owner = "client!tc", name = "cb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1481 = Static28.method504("scrollen:");

	@OriginalMember(owner = "client!tc", name = "db", descriptor = "I")
	public static int anInt2837 = 0;

	@OriginalMember(owner = "client!tc", name = "ob", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1484 = Static28.method504("_");

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(II)Z")
	public static boolean method1983(@OriginalArg(0) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILclient!pd;I)Z")
	public static boolean method1984(@OriginalArg(1) Class20 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method486(arg1);
		if (local8 == null) {
			return false;
		} else {
			Static91.method1640(local8);
			return true;
		}
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)V")
	public static void method1985() {
		Static96.aClass55_1.method2209();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static7.aLongArray1[local10] = 0L;
		}
		for (@Pc(27) int local27 = 0; local27 < 32; local27++) {
			Static96.aLongArray6[local27] = 0L;
		}
		Static131.anInt3187 = 0;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method1986(@OriginalArg(0) Component arg0) {
		@Pc(6) Method local6 = Static37.aMethod2;
		if (local6 != null) {
			try {
				local6.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(20) Throwable local20) {
			}
		}
		arg0.addKeyListener(Static11.aClass65_1);
		arg0.addFocusListener(Static11.aClass65_1);
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "(I)V")
	public static void method1987() {
		aClass39_1475 = null;
		aClass39_1478 = null;
		aClass39_1480 = null;
		aClass4_Sub2_Sub3_Sub1_8 = null;
		aClass39_1481 = null;
		aBooleanArray16 = null;
		aClass39_1484 = null;
		anIntArrayArray23 = null;
		aClass39_1477 = null;
		aClass39_1482 = null;
		aClass39_1479 = null;
		anIntArray306 = null;
		aClass20_Sub1_16 = null;
		aClass39_1483 = null;
		aClass39_1476 = null;
		anImage4 = null;
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "(II)V")
	public static void method1988(@OriginalArg(1) int arg0) {
		if (Static40.anInt1002 == 0) {
			Static80.aClass4_Sub1_Sub1_2.method88(arg0);
		} else {
			Static130.anInt3174 = arg0;
		}
	}
}
