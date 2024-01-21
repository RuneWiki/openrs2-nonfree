import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!we", name = "b", descriptor = "Lclient!q;")
	public static Class62 aClass62_36;

	@OriginalMember(owner = "client!we", name = "l", descriptor = "Lclient!ua;")
	public static Class62_Sub1 aClass62_Sub1_77;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1548 = Static108.method1915("http:)4)4www)3runescape)3com");

	@OriginalMember(owner = "client!we", name = "d", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1550 = Static108.method1915("Connection timed out)3");

	@OriginalMember(owner = "client!we", name = "c", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1549 = aClass39_1550;

	@OriginalMember(owner = "client!we", name = "v", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1558 = Static108.method1915("The server is being updated)3");

	@OriginalMember(owner = "client!we", name = "e", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1551 = aClass39_1558;

	@OriginalMember(owner = "client!we", name = "g", descriptor = "I")
	public static int anInt3161 = -1;

	@OriginalMember(owner = "client!we", name = "h", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1552 = Static108.method1915(" from your friend list first");

	@OriginalMember(owner = "client!we", name = "i", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1553 = Static108.method1915("Freie Welt");

	@OriginalMember(owner = "client!we", name = "q", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1555 = Static108.method1915("slide:");

	@OriginalMember(owner = "client!we", name = "n", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1554 = aClass39_1555;

	@OriginalMember(owner = "client!we", name = "r", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1556 = aClass39_1552;

	@OriginalMember(owner = "client!we", name = "t", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1557 = aClass39_1555;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(II)V")
	public static void method2209(@OriginalArg(0) int arg0) {
		if (arg0 == -1 && !Static10.aBoolean46) {
			Static89.method1475();
		} else if (arg0 != -1 && Static95.anInt2869 != arg0 && Static90.anInt2125 != 0 && !Static10.aBoolean46) {
			Static97.method2153(Static77.aClass62_Sub1_53, 0, arg0, Static90.anInt2125);
		}
		Static95.anInt2869 = arg0;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V")
	public static void method2210() {
		aClass39_1553 = null;
		aClass62_36 = null;
		aClass39_1549 = null;
		aClass39_1551 = null;
		aClass39_1555 = null;
		aClass39_1558 = null;
		aClass39_1548 = null;
		aClass39_1556 = null;
		aClass39_1557 = null;
		aClass39_1554 = null;
		aClass62_Sub1_77 = null;
		aClass39_1552 = null;
		aClass39_1550 = null;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!q;BII)Lclient!pb;")
	public static Class1_Sub1_Sub4_Sub4 method2211(@OriginalArg(0) Class62 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static119.method2054(arg2, arg1, arg0) ? Static53.method965() : null;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!q;)V")
	public static void method2212(@OriginalArg(1) Class62 arg0) {
		Static59.aClass62_18 = arg0;
		Static22.anInt764 = Static59.aClass62_18.method1999(16);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!a;I)I")
	public static int method2213(@OriginalArg(0) Class1_Sub1_Sub1 arg0) {
		@Pc(23) Class1_Sub11 local23 = (Class1_Sub11) Static48.aClass70_3.method1961((long) arg0.anInt46 + ((long) arg0.anInt72 << 32));
		return local23 == null ? arg0.anInt79 : local23.anInt1754;
	}
}
