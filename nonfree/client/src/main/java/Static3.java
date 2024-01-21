import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "Lclient!ba;")
	public static Class1_Sub2_Sub1_Sub3 aClass1_Sub2_Sub1_Sub3_1;

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "[I")
	public static int[] anIntArray6;

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "Lclient!dd;")
	private static Class13 aClass13_33 = Static161.method2971("Loading wordpack )2 ");

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "Lclient!dd;")
	public static Class13 aClass13_32 = aClass13_33;

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
	public static int anInt108 = -1;

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "Lclient!dd;")
	public static Class13 aClass13_34 = Static161.method2971("document)3cookie=(R");

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
	public static int anInt109 = 0;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!dd;B)Z")
	public static boolean method72(@OriginalArg(0) Class13 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(19) int local19 = 0; local19 < Static21.anInt784; local19++) {
			if (arg0.method894(Static34.aClass13Array7[local19])) {
				return true;
			}
		}
		return arg0.method894(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.aClass13_847);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)V")
	public static void method73(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9;
		if (Static65.anInt1933 != arg0) {
			Static106.anIntArray284 = new int[arg0];
			for (local9 = 0; local9 < arg0; local9++) {
				Static106.anIntArray284[local9] = (local9 << 12) / arg0;
			}
			Static64.anInt1922 = arg0 - 1;
			Static30.anInt1053 = arg0 == 64 ? 2048 : 4096;
			Static65.anInt1933 = arg0;
		}
		if (arg1 == Static30.anInt1097) {
			return;
		}
		Static18.anIntArray101 = new int[arg1];
		for (local9 = 0; local9 < arg1; local9++) {
			Static18.anIntArray101[local9] = (local9 << 12) / arg1;
		}
		Static93.anInt2716 = arg1 - 1;
		Static30.anInt1097 = arg1;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
	public static void method74() {
		aClass13_33 = null;
		aClass13_34 = null;
		aClass1_Sub2_Sub1_Sub3_1 = null;
		aClass13_32 = null;
		anIntArray6 = null;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)Lclient!dd;")
	public static Class13 method75(@OriginalArg(0) int arg0) {
		return Static84.method1799(arg0, false);
	}
}
