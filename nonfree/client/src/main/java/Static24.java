import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "Lclient!jb;")
	public static Class28 aClass28_12;

	@OriginalMember(owner = "client!ca", name = "k", descriptor = "F")
	public static float aFloat2;

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "[I")
	public static int[] anIntArray44 = new int[256];

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
	public static int anInt448 = 0;

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "Lclient!sc;")
	public static Class107 aClass107_153 = Static231.method3737("(U0a )2 non)2existant gosub script)2num: ");

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "Lclient!sc;")
	public static Class107 aClass107_154 = Static231.method3737("Wordpack geladen)3");

	@OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
	public static int anInt450 = 0;

	@OriginalMember(owner = "client!ca", name = "i", descriptor = "Lclient!sc;")
	public static Class107 aClass107_155 = Static231.method3737("::errortest");

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
	public static void method423() {
		if (Static186.aClass62_2 != null) {
			Static186.aClass62_2.method2422();
		}
		if (Static100.aClass62_1 != null) {
			Static100.aClass62_1.method2422();
		}
		Static88.method1503(Static73.aBoolean151);
		Static186.aClass62_2 = Static228.method3718(Static117.aClass34_2, 22050, 0, Static203.aCanvas3);
		Static186.aClass62_2.method2411(Static128.aClass1_Sub6_Sub2_1);
		Static100.aClass62_1 = Static228.method3718(Static117.aClass34_2, 2048, 1, Static203.aCanvas3);
		Static100.aClass62_1.method2411(Static42.aClass1_Sub6_Sub1_1);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZI)V")
	public static void method424() {
		Static98.aClass61_36.method1695(5);
		Static192.aClass61_74.method1695(5);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!jb;Lclient!jb;I)V")
	public static void method425(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class28 arg1) {
		Static64.aClass1_Sub2_Sub15_2 = Static165.method1872(arg0, arg1, Static69.anInt1579);
		Static174.aClass1_Sub2_Sub15_Sub1_4 = (Class1_Sub2_Sub15_Sub1) Static64.aClass1_Sub2_Sub15_2;
		Static23.aClass1_Sub2_Sub15_1 = Static165.method1872(arg0, arg1, Static2.anInt115);
		Static175.aClass1_Sub2_Sub15_3 = Static165.method1872(arg0, arg1, Static59.anInt1433);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!o;I)V")
	public static void method426(@OriginalArg(0) Class86 arg0) {
		@Pc(10) Class86 local10 = Static32.method604(arg0);
		@Pc(16) int local16;
		@Pc(14) int local14;
		if (local10 == null) {
			local14 = Static180.anInt4990;
			local16 = Static158.anInt3484;
		} else {
			local14 = local10.anInt3270;
			local16 = local10.anInt3280;
		}
		Static1.method51(local16, false, arg0, local14);
		Static88.method1501(local16, local14, arg0);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIII)I")
	public static int method428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) int local17 = 65536 - Class45.anIntArray156[arg1 * 1024 / arg3] >> 1;
		return (local17 * arg2 >> 16) + ((65536 - local17) * arg0 >> 16);
	}
}
