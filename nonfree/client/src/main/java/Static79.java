import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!id", name = "P", descriptor = "Lclient!qf;")
	public static final Class5_Sub24 aClass5_Sub24_1 = new Class5_Sub24(0, 0);

	@OriginalMember(owner = "client!id", name = "W", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_656 = Static161.method2452("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!id", name = "Z", descriptor = "I")
	public static int anInt1777 = 0;

	@OriginalMember(owner = "client!id", name = "ab", descriptor = "[[B")
	public static final byte[][] aByteArrayArray6 = new byte[50][];

	@OriginalMember(owner = "client!id", name = "d", descriptor = "(B)V")
	public static void method1387() {
		Static83.aClass8_17.method233();
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "([SB[Lclient!dc;)V")
	public static void method1388(@OriginalArg(0) short[] arg0, @OriginalArg(2) Class20[] arg1) {
		Static63.method1043(0, arg1, arg1.length - 1, arg0);
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(III)I")
	public static int method1390(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 >> 31 & arg1 - 1;
		return (arg0 + (arg0 >>> 31)) % arg1 + local7;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(II)V")
	public static void method1391() {
		Static183.anInt3678 = -1;
		Static92.anInt1963 = 1;
		Static15.anInt312 = 2;
		Static45.anInt1025 = 0;
		Static172.aClass23_68 = null;
		Static113.anInt2383 = -1;
		Static38.aBoolean50 = false;
	}
}
