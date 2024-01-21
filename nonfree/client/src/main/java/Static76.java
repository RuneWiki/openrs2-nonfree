import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!jb", name = "gb", descriptor = "Lclient!ga;")
	public static Class30 aClass30_30;

	@OriginalMember(owner = "client!jb", name = "ib", descriptor = "Lclient!ed;")
	private static Class23 aClass23_754 = Static169.method2903("glow3:");

	@OriginalMember(owner = "client!jb", name = "bb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_751 = aClass23_754;

	@OriginalMember(owner = "client!jb", name = "hb", descriptor = "Lclient!ed;")
	private static Class23 aClass23_753 = Static169.method2903("New User");

	@OriginalMember(owner = "client!jb", name = "db", descriptor = "Lclient!ed;")
	public static Class23 aClass23_752 = aClass23_753;

	@OriginalMember(owner = "client!jb", name = "jb", descriptor = "[[I")
	public static int[][] anIntArrayArray22 = new int[104][104];

	@OriginalMember(owner = "client!jb", name = "nb", descriptor = "Lclient!ed;")
	private static Class23 aClass23_757 = Static169.method2903(" is already on your friend list)3");

	@OriginalMember(owner = "client!jb", name = "kb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_755 = aClass23_757;

	@OriginalMember(owner = "client!jb", name = "mb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_756 = aClass23_754;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!ga;Lclient!ed;Lclient!ed;B)[Lclient!tg;")
	public static Class1_Sub1_Sub12_Sub4[] method1367(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(2) Class23 arg2) {
		@Pc(8) int local8 = arg0.method1281(arg1);
		@Pc(14) int local14 = arg0.method1296(arg2, local8);
		return Static73.method1333(arg0, local8, local14);
	}

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "(I)V")
	public static void method1368() {
		aClass23_753 = null;
		aClass23_755 = null;
		anIntArrayArray22 = null;
		aClass23_754 = null;
		aClass23_757 = null;
		aClass23_752 = null;
		aClass23_756 = null;
		aClass30_30 = null;
		aClass23_751 = null;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!ed;Lclient!ed;Lclient!ed;)V")
	public static void method1369(@OriginalArg(1) Class23 arg0, @OriginalArg(2) Class23 arg1, @OriginalArg(3) Class23 arg2) {
		Static61.aClass23_604 = arg1;
		Static61.aClass23_602 = arg0;
		Static61.aClass23_610 = arg2;
	}
}
