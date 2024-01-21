import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!o", name = "j", descriptor = "I")
	public static int anInt3081;

	@OriginalMember(owner = "client!o", name = "k", descriptor = "I")
	public static int anInt3082;

	@OriginalMember(owner = "client!o", name = "r", descriptor = "Lclient!qd;")
	public static Class2_Sub1_Sub9_Sub3 aClass2_Sub1_Sub9_Sub3_76;

	@OriginalMember(owner = "client!o", name = "c", descriptor = "Lclient!wd;")
	private static Class80 aClass80_1174 = Static2.method59("Username: ");

	@OriginalMember(owner = "client!o", name = "b", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1173 = aClass80_1174;

	@OriginalMember(owner = "client!o", name = "f", descriptor = "Z")
	public static volatile boolean aBoolean236 = true;

	@OriginalMember(owner = "client!o", name = "g", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1175 = Static2.method59(")1");

	@OriginalMember(owner = "client!o", name = "h", descriptor = "Z")
	public static boolean aBoolean237 = false;

	@OriginalMember(owner = "client!o", name = "m", descriptor = "[Lclient!ga;")
	public static Class25[] aClass25Array56 = new Class25[50];

	@OriginalMember(owner = "client!o", name = "n", descriptor = "[I")
	public static int[] anIntArray403 = new int[5];

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ZII)Z")
	public static boolean method1957(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		@Pc(10) Class2_Sub1_Sub10 local10 = Static18.method404(arg1);
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local10.method955(arg0);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
	public static void method1959() {
		anIntArray403 = null;
		aClass80_1174 = null;
		aClass25Array56 = null;
		aClass80_1173 = null;
		aClass2_Sub1_Sub9_Sub3_76 = null;
		aClass80_1175 = null;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIBI)I")
	public static int method1960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 7 - arg1;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return arg1;
		}
	}
}
