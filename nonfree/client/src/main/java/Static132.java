import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!wd", name = "bb", descriptor = "Lclient!ke;")
	public static Class5_Sub11 aClass5_Sub11_15;

	@OriginalMember(owner = "client!wd", name = "cb", descriptor = "[Lclient!ke;")
	public static Class5_Sub11[] aClass5_Sub11Array2;

	@OriginalMember(owner = "client!wd", name = "db", descriptor = "Lclient!ff;")
	public static Class26 aClass26_32;

	@OriginalMember(owner = "client!wd", name = "eb", descriptor = "Lclient!ff;")
	public static Class26 aClass26_33;

	@OriginalMember(owner = "client!wd", name = "qb", descriptor = "Lclient!ba;")
	public static Class8 aClass8_6;

	@OriginalMember(owner = "client!wd", name = "gb", descriptor = "I")
	public static int anInt3364 = 1;

	@OriginalMember(owner = "client!wd", name = "mb", descriptor = "I")
	public static int anInt3370 = 0;

	@OriginalMember(owner = "client!wd", name = "ob", descriptor = "Lclient!r;")
	public static Class61 aClass61_1088 = Static129.method2060("<col=c0ff00>");

	@OriginalMember(owner = "client!wd", name = "pb", descriptor = "Lclient!r;")
	private static Class61 aClass61_1089 = Static129.method2060("Error loading your profile)3");

	@OriginalMember(owner = "client!wd", name = "sb", descriptor = "[I")
	public static int[] anIntArray445 = new int[2048];

	@OriginalMember(owner = "client!wd", name = "tb", descriptor = "Lclient!r;")
	public static Class61 aClass61_1090 = aClass61_1089;

	@OriginalMember(owner = "client!wd", name = "ub", descriptor = "I")
	public static int anInt3373 = 0;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)I")
	public static int method2183(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class5_Sub15 local12 = (Class5_Sub15) Static57.aClass20_6.method656((long) arg1);
		if (local12 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(28) int local28 = 0;
			for (@Pc(30) int local30 = 0; local30 < local12.anIntArray297.length; local30++) {
				if (arg0 == local12.anIntArray296[local30]) {
					local28 += local12.anIntArray297[local30];
				}
			}
			return local28;
		}
	}

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "(I)V")
	public static void method2184() {
		Static78.aClass58_40 = new Class58();
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(B)V")
	public static void method2185() {
		aClass61_1090 = null;
		aClass5_Sub11Array2 = null;
		aClass61_1088 = null;
		anIntArray445 = null;
		aClass26_33 = null;
		aClass5_Sub11_15 = null;
		aClass26_32 = null;
		aClass61_1089 = null;
		aClass8_6 = null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BI)Lclient!r;")
	public static Class61 method2186(@OriginalArg(1) int arg0) {
		return arg0 < 999999999 ? Static39.method730(arg0) : Static58.aClass61_451;
	}
}
