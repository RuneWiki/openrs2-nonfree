import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!kd", name = "j", descriptor = "Lclient!la;")
	public static Class17 aClass17_21;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "Lclient!v;")
	private static Class76 aClass76_662 = Static134.method2017("Loading wordpack )2 ");

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "Lclient!v;")
	public static Class76 aClass76_663 = Static134.method2017("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "Lclient!v;")
	public static Class76 aClass76_664 = Static134.method2017("leuchten1:");

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "Lclient!v;")
	public static Class76 aClass76_665 = aClass76_662;

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "Lclient!v;")
	public static Class76 aClass76_666 = Static134.method2017(")1");

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "B")
	public static byte aByte3 = 0;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)Lclient!ic;")
	public static Class4_Sub4_Sub7 method1040(@OriginalArg(1) int arg0) {
		@Pc(10) Class4_Sub4_Sub7 local10 = (Class4_Sub4_Sub7) Static107.aClass72_25.method1781((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static118.aClass17_37.method290(10, arg0);
		local10 = new Class4_Sub4_Sub7();
		local10.anInt1254 = arg0;
		if (local25 != null) {
			local10.method859(new Class4_Sub10(local25));
		}
		local10.method863();
		if (local10.anInt1262 != -1) {
			local10.method866(method1040(local10.anInt1262), method1040(local10.anInt1276));
		}
		if (!Static12.aBoolean9 && local10.aBoolean75) {
			local10.anInt1245 = 0;
			local10.aClass76_556 = Static96.aClass76_1014;
			local10.aClass76Array10 = null;
			local10.aClass76Array11 = null;
		}
		Static107.aClass72_25.method1783(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
	public static void method1041() {
		aClass76_665 = null;
		aClass17_21 = null;
		aClass76_663 = null;
		aClass76_666 = null;
		aClass76_664 = null;
		aClass76_662 = null;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
	public static void method1042() {
		if (Static16.aString2.toLowerCase().indexOf("microsoft") != -1) {
			Static9.anIntArray25[192] = 58;
			Static9.anIntArray25[190] = 72;
			Static9.anIntArray25[219] = 42;
			Static9.anIntArray25[188] = 71;
			Static9.anIntArray25[223] = 28;
			Static9.anIntArray25[189] = 26;
			Static9.anIntArray25[222] = 59;
			Static9.anIntArray25[221] = 43;
			Static9.anIntArray25[220] = 74;
			Static9.anIntArray25[191] = 73;
			Static9.anIntArray25[187] = 27;
			Static9.anIntArray25[186] = 57;
			return;
		}
		Static9.anIntArray25[46] = 72;
		Static9.anIntArray25[47] = 73;
		Static9.anIntArray25[92] = 74;
		Static9.anIntArray25[91] = 42;
		if (Static16.aMethod1 == null) {
			Static9.anIntArray25[192] = 58;
			Static9.anIntArray25[222] = 59;
		} else {
			Static9.anIntArray25[192] = 28;
			Static9.anIntArray25[222] = 58;
			Static9.anIntArray25[520] = 59;
		}
		Static9.anIntArray25[45] = 26;
		Static9.anIntArray25[59] = 57;
		Static9.anIntArray25[93] = 43;
		Static9.anIntArray25[44] = 71;
		Static9.anIntArray25[61] = 27;
	}
}
