import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static75 {

	@OriginalMember(owner = "client!id", name = "a", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1150 = Static107.method1838("Error connecting to server)3");

	@OriginalMember(owner = "client!id", name = "b", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1151 = Static107.method1838("flash1:");

	@OriginalMember(owner = "client!id", name = "f", descriptor = "I")
	public static int anInt1953 = 0;

	@OriginalMember(owner = "client!id", name = "g", descriptor = "[J")
	public static long[] aLongArray6 = new long[32];

	@OriginalMember(owner = "client!id", name = "h", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1152 = aClass28_1151;

	@OriginalMember(owner = "client!id", name = "i", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1153 = Static107.method1838("<br>(X100(U(Y");

	@OriginalMember(owner = "client!id", name = "k", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1154 = Static107.method1838("Please contact customer support)3");

	@OriginalMember(owner = "client!id", name = "r", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1155 = aClass28_1150;

	@OriginalMember(owner = "client!id", name = "s", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1156 = aClass28_1151;

	@OriginalMember(owner = "client!id", name = "z", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1157 = aClass28_1154;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
	public static void method1357() {
		aClass28_1154 = null;
		aClass28_1156 = null;
		aClass28_1157 = null;
		aClass28_1150 = null;
		aLongArray6 = null;
		aClass28_1151 = null;
		aClass28_1152 = null;
		aClass28_1153 = null;
		aClass28_1155 = null;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(SILclient!gg;IIJLclient!gg;)V")
	public static void method1358(@OriginalArg(0) short arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class28 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) long arg4, @OriginalArg(6) Class28 arg5) {
		if (Static169.aBoolean165 || Static150.anInt3365 >= 500) {
			return;
		}
		Static98.aClass28Array34[Static150.anInt3365] = arg2;
		Static80.aClass28Array29[Static150.anInt3365] = arg5;
		Static176.aShortArray41[Static150.anInt3365] = arg0;
		Static10.aLongArray2[Static150.anInt3365] = arg4;
		Static133.anIntArray281[Static150.anInt3365] = arg3;
		Static148.anIntArray315[Static150.anInt3365] = arg1;
		Static150.anInt3365++;
	}
}
