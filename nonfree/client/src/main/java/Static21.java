import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!am", name = "mb", descriptor = "Lclient!wv;")
	public static final Class395 aClass395_1 = new Class395(8, 7);

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IB)V")
	public static void method339(@OriginalArg(0) int arg0) {
		Static374.method5560();
		@Pc(17) int local17 = Static195.aClass76_1.method1917(arg0).anInt10573;
		if (local17 == 0) {
			return;
		}
		@Pc(28) int local28 = Static595.aClass241_1.anIntArray524[arg0];
		if (local17 == 6) {
			Static257.anInt4524 = local28;
		}
		if (local17 == 5) {
			Static113.anInt2288 = local28;
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public static boolean method342(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static592.anInt1870; local11++) {
			if (arg0.equalsIgnoreCase(Static369.aStringArray24[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aString35);
	}
}
