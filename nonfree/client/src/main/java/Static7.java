import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!af", name = "c", descriptor = "Lclient!ie;")
	public static Class35 aClass35_1;

	@OriginalMember(owner = "client!af", name = "h", descriptor = "Lclient!be;")
	public static Class10 aClass10_1;

	@OriginalMember(owner = "client!af", name = "l", descriptor = "[Lclient!t;")
	public static Class8_Sub1_Sub3_Sub3[] aClass8_Sub1_Sub3_Sub3Array1;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "Lclient!ic;")
	private static Class34 aClass34_40 = Static56.method816("Loaded title screen");

	@OriginalMember(owner = "client!af", name = "g", descriptor = "Lclient!ic;")
	private static Class34 aClass34_42 = Static56.method816("Please reload this page)3");

	@OriginalMember(owner = "client!af", name = "e", descriptor = "Lclient!ic;")
	public static Class34 aClass34_41 = aClass34_42;

	@OriginalMember(owner = "client!af", name = "i", descriptor = "Lclient!ic;")
	public static Class34 aClass34_43 = Static56.method816("weiss:");

	@OriginalMember(owner = "client!af", name = "n", descriptor = "Lclient!ic;")
	public static Class34 aClass34_44 = aClass34_40;

	@OriginalMember(owner = "client!af", name = "o", descriptor = "Lclient!ic;")
	private static Class34 aClass34_45 = Static56.method816("Prepared visibility map");

	@OriginalMember(owner = "client!af", name = "q", descriptor = "Lclient!ic;")
	public static Class34 aClass34_46 = aClass34_45;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
	public static void method43() {
		Static130.anIntArrayArray28 = new int[105][105];
		Static113.aByteArrayArrayArray7 = new byte[4][104][104];
		Static18.anIntArray64 = new int[104];
		Static41.anInt996 = 99;
		Static107.aByteArrayArrayArray6 = new byte[4][105][105];
		Static1.anIntArray1 = new int[104];
		Static77.anIntArray233 = new int[104];
		Static97.anIntArrayArrayArray5 = new int[4][105][105];
		Static53.aByteArrayArrayArray3 = new byte[4][104][104];
		Static60.aByteArrayArrayArray4 = new byte[4][104][104];
		Static130.anIntArray404 = new int[104];
		Static6.aByteArrayArrayArray1 = new byte[4][104][104];
		Static101.anIntArray326 = new int[104];
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
	public static void method44() {
		aClass34_41 = null;
		aClass8_Sub1_Sub3_Sub3Array1 = null;
		aClass34_43 = null;
		aClass35_1 = null;
		aClass34_45 = null;
		aClass34_42 = null;
		aClass10_1 = null;
		aClass34_44 = null;
		aClass34_46 = null;
		aClass34_40 = null;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)Lclient!lc;")
	public static Class8_Sub1_Sub13 method49(@OriginalArg(1) int arg0) {
		@Pc(10) Class8_Sub1_Sub13 local10 = (Class8_Sub1_Sub13) Static68.aClass48_31.method1100((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static119.aClass14_28.method1156(arg0, 10);
		local10 = new Class8_Sub1_Sub13();
		local10.anInt1741 = arg0;
		if (local20 != null) {
			local10.method1078(new Class8_Sub20(local20));
		}
		local10.method1082();
		if (local10.anInt1739 != -1) {
			local10.method1075(method49(local10.anInt1739), method49(local10.anInt1740));
		}
		if (!Static82.aBoolean77 && local10.aBoolean68) {
			local10.anInt1763 = 0;
			local10.aClass34Array12 = null;
			local10.aClass34Array13 = null;
			local10.aClass34_812 = Static18.aClass34_264;
		}
		Static68.aClass48_31.method1097(local10, (long) arg0);
		return local10;
	}
}
