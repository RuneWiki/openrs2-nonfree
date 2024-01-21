import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "O", descriptor = "Lclient!cb;")
	public static Class13_Sub1 aClass13_Sub1_1;

	@OriginalMember(owner = "client!ab", name = "P", descriptor = "Lclient!vd;")
	public static Class83 aClass83_1;

	@OriginalMember(owner = "client!ab", name = "ib", descriptor = "[Lclient!kf;")
	public static Class3_Sub1_Sub3_Sub3[] aClass3_Sub1_Sub3_Sub3Array1;

	@OriginalMember(owner = "client!ab", name = "gb", descriptor = "Lclient!sd;")
	private static Class73 aClass73_44 = Static122.method531("Please reload this page)3");

	@OriginalMember(owner = "client!ab", name = "W", descriptor = "Lclient!sd;")
	public static Class73 aClass73_41 = aClass73_44;

	@OriginalMember(owner = "client!ab", name = "X", descriptor = "Lclient!sd;")
	private static Class73 aClass73_42 = Static122.method531("Loading wordpack )2 ");

	@OriginalMember(owner = "client!ab", name = "bb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_43 = aClass73_42;

	@OriginalMember(owner = "client!ab", name = "cb", descriptor = "Lclient!b;")
	public static Class7 aClass7_1 = new Class7(30);

	@OriginalMember(owner = "client!ab", name = "jb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_45 = Static122.method531("welle2:");

	@OriginalMember(owner = "client!ab", name = "kb", descriptor = "Lclient!sd;")
	private static Class73 aClass73_46 = Static122.method531("Free world");

	@OriginalMember(owner = "client!ab", name = "lb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_47 = Static122.method531("::fpson");

	@OriginalMember(owner = "client!ab", name = "mb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_48 = aClass73_46;

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "(I)V")
	public static void method40() {
		aClass3_Sub1_Sub3_Sub3Array1 = null;
		aClass73_47 = null;
		aClass73_46 = null;
		aClass7_1 = null;
		aClass73_45 = null;
		aClass73_42 = null;
		aClass13_Sub1_1 = null;
		aClass73_48 = null;
		aClass73_41 = null;
		aClass73_43 = null;
		aClass73_44 = null;
		aClass83_1 = null;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(IZ)Lclient!ga;")
	public static Class3_Sub1_Sub7 method42(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub1_Sub7 local10 = (Class3_Sub1_Sub7) Static68.aClass7_9.method183((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static31.aClass13_6.method348(10, arg0);
		local10 = new Class3_Sub1_Sub7();
		local10.anInt1233 = arg0;
		if (local25 != null) {
			local10.method948(new Class3_Sub12(local25));
		}
		local10.method944();
		if (local10.anInt1204 != -1) {
			local10.method935(method42(local10.anInt1204), method42(local10.anInt1222));
		}
		if (!Static45.aBoolean73 && local10.aBoolean83) {
			local10.aClass73_680 = Static90.aClass73_1139;
			local10.aClass73Array9 = null;
			local10.anInt1221 = 0;
			local10.aClass73Array8 = null;
			local10.aBoolean84 = false;
		}
		Static68.aClass7_9.method186(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V")
	public static void method44() {
		Static5.anIntArrayArrayArray1 = new int[4][105][105];
		Static96.anIntArray222 = new int[104];
		Static139.anIntArrayArray22 = new int[105][105];
		Static22.anIntArray61 = new int[104];
		Static65.aByteArrayArrayArray3 = new byte[4][105][105];
		Static90.aByteArrayArrayArray4 = new byte[4][104][104];
		Static181.anIntArray434 = new int[104];
		Static165.aByteArrayArrayArray2 = new byte[4][104][104];
		Static135.aByteArrayArrayArray6 = new byte[4][104][104];
		Static125.anIntArray309 = new int[104];
		Static98.anIntArray224 = new int[104];
		Static108.anInt2483 = 99;
		Static167.aByteArrayArrayArray8 = new byte[4][104][104];
	}
}
