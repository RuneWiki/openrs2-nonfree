import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!ia", name = "H", descriptor = "I")
	public static int anInt1160;

	@OriginalMember(owner = "client!ia", name = "J", descriptor = "[Lclient!vb;")
	public static Class3_Sub1_Sub1_Sub4[] aClass3_Sub1_Sub1_Sub4Array25;

	@OriginalMember(owner = "client!ia", name = "M", descriptor = "I")
	public static int anInt1163;

	@OriginalMember(owner = "client!ia", name = "P", descriptor = "I")
	public static int anInt1166;

	@OriginalMember(owner = "client!ia", name = "A", descriptor = "Lclient!jb;")
	public static Class34 aClass34_14 = new Class34(64);

	@OriginalMember(owner = "client!ia", name = "E", descriptor = "Lclient!v;")
	public static Class62 aClass62_495 = Static45.method753("@yel@*V");

	@OriginalMember(owner = "client!ia", name = "F", descriptor = "Lclient!v;")
	public static Class62 aClass62_496 = Static45.method753("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!ia", name = "G", descriptor = "I")
	public static int anInt1159 = 0;

	@OriginalMember(owner = "client!ia", name = "R", descriptor = "Lclient!v;")
	private static Class62 aClass62_499 = Static45.method753("scroll:");

	@OriginalMember(owner = "client!ia", name = "I", descriptor = "Lclient!v;")
	public static Class62 aClass62_497 = aClass62_499;

	@OriginalMember(owner = "client!ia", name = "K", descriptor = "I")
	public static int anInt1161 = 0;

	@OriginalMember(owner = "client!ia", name = "L", descriptor = "I")
	public static int anInt1162 = -1;

	@OriginalMember(owner = "client!ia", name = "N", descriptor = "I")
	public static int anInt1164 = 0;

	@OriginalMember(owner = "client!ia", name = "Q", descriptor = "Lclient!v;")
	public static Class62 aClass62_498 = Static45.method753("Lade Schrifts\u001c1tze )2 ");

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)I")
	public static int method688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -2) {
			return 12345678;
		} else if (arg1 == -1) {
			if (arg0 < 0) {
				arg0 = 0;
			} else if (arg0 > 127) {
				arg0 = 127;
			}
			return 127 - arg0;
		} else {
			arg0 = arg0 * (arg1 & 0x7F) / 128;
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return arg0 + (arg1 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "(I)V")
	public static void method690() {
		aClass34_14 = null;
		aClass62_496 = null;
		aClass62_495 = null;
		aClass62_499 = null;
		aClass62_498 = null;
		aClass3_Sub1_Sub1_Sub4Array25 = null;
		aClass62_497 = null;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V")
	public static void method691() {
		while (true) {
			@Pc(10) Class24 local10 = Static44.aClass24_37;
			@Pc(17) Class3_Sub11 local17;
			synchronized (Static44.aClass24_37) {
				local17 = (Class3_Sub11) Static38.aClass24_35.method527();
			}
			if (local17 == null) {
				return;
			}
			local17.aClass42_Sub1_49.method1524((int) local17.aLong81, local17.aByteArray19, false, local17.aClass46_4);
		}
	}
}
