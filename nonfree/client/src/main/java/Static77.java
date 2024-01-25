import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static77 {

	@OriginalMember(owner = "client!cia", name = "n", descriptor = "I")
	public static int anInt1203;

	@OriginalMember(owner = "client!cia", name = "o", descriptor = "I")
	public static int anInt1204;

	@OriginalMember(owner = "client!cia", name = "p", descriptor = "I")
	public static int anInt1205;

	@OriginalMember(owner = "client!cia", name = "i", descriptor = "I")
	public static int anInt1200 = 0;

	@OriginalMember(owner = "client!cia", name = "m", descriptor = "[S")
	public static short[] aShortArray9 = new short[256];

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(B)V")
	public static void method1112() {
		Static359.aClass265_30.method6568();
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(BI)Z")
	public static boolean method1114(@OriginalArg(1) int arg0) {
		return arg0 == 19 || arg0 == 57 || arg0 == 1009 || arg0 == 60 || arg0 == 10;
	}
}
