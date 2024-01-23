import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
	public static int anInt3837;

	@OriginalMember(owner = "client!oc", name = "t", descriptor = "Lclient!in;")
	public static Class71 aClass71_16;

	@OriginalMember(owner = "client!oc", name = "m", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray5 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

	@OriginalMember(owner = "client!oc", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString226 = "Choose Option";

	@OriginalMember(owner = "client!oc", name = "p", descriptor = "Lclient!hi;")
	public static Class61 aClass61_20 = new Class61();

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method3085(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < Static49.anInt1128; local17++) {
			if (arg0.equalsIgnoreCase(Static149.aStringArray43[local17])) {
				return true;
			}
		}
		if (arg0.equalsIgnoreCase(Static197.aClass14_Sub2_Sub1_2.aString99)) {
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILclient!km;Lclient!km;)V")
	public static void method3086(@OriginalArg(1) Class91 arg0, @OriginalArg(2) Class91 arg1) {
		Static255.aClass91_183 = arg0;
		Static184.aClass91_147 = arg1;
	}
}
