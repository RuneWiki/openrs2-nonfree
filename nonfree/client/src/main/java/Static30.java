import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "[Lclient!uh;")
	public static Class1_Sub24[] aClass1_Sub24Array2;

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "Lclient!ga;")
	public static Class30 aClass30_40;

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
	public static int anInt2834;

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
	public static int anInt2832 = 0;

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1076 = Static169.method2903("Your account is already logged in)3");

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
	public static int anInt2833 = 0;

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1077 = aClass23_1076;

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1078 = Static169.method2903("<br>(X100(U(Y");

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1079 = Static169.method2903("(Udns");

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIBI)V")
	public static void method1957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
			for (local7 = 0; local7 < 8; local7++) {
				Static141.anIntArrayArrayArray3[arg0][arg1 + local3][arg2 + local7] = 0;
			}
		}
		if (arg1 > 0) {
			for (local7 = 1; local7 < 8; local7++) {
				Static141.anIntArrayArrayArray3[arg0][arg1][local7 + arg2] = Static141.anIntArrayArrayArray3[arg0][arg1 - 1][arg2 + local7];
			}
		}
		if (arg2 > 0) {
			for (local7 = 1; local7 < 8; local7++) {
				Static141.anIntArrayArrayArray3[arg0][local7 + arg1][arg2] = Static141.anIntArrayArrayArray3[arg0][arg1 + local7][arg2 - 1];
			}
		}
		if (arg1 > 0 && Static141.anIntArrayArrayArray3[arg0][arg1 - 1][arg2] != 0) {
			Static141.anIntArrayArrayArray3[arg0][arg1][arg2] = Static141.anIntArrayArrayArray3[arg0][arg1 - 1][arg2];
		} else if (arg2 > 0 && Static141.anIntArrayArrayArray3[arg0][arg1][arg2 - 1] != 0) {
			Static141.anIntArrayArrayArray3[arg0][arg1][arg2] = Static141.anIntArrayArrayArray3[arg0][arg1][arg2 - 1];
		} else if (arg1 > 0 && arg2 > 0 && Static141.anIntArrayArrayArray3[arg0][arg1 - 1][arg2 - 1] != 0) {
			Static141.anIntArrayArrayArray3[arg0][arg1][arg2] = Static141.anIntArrayArrayArray3[arg0][arg1 - 1][arg2 - 1];
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
	public static void method1958() {
		Static35.aClass1_Sub11_Sub2_1.method1782();
		Static5.aClass30_67 = null;
		Static141.anInt3602 = 1;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
	public static void method1962() {
		aClass23_1079 = null;
		aClass23_1076 = null;
		aClass1_Sub24Array2 = null;
		aClass23_1078 = null;
		aClass23_1077 = null;
		aClass30_40 = null;
	}
}
