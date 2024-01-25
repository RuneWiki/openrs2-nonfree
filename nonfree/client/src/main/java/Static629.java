import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static629 {

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "[I")
	public static int[] anIntArray726;

	@OriginalMember(owner = "client!wca", name = "c", descriptor = "[Lclient!od;")
	public static Class16_Sub7[] aClass16_Sub7Array1;

	@OriginalMember(owner = "client!wca", name = "f", descriptor = "Lclient!jba;")
	public static Class171 aClass171_1;

	@OriginalMember(owner = "client!wca", name = "g", descriptor = "Lclient!jf;")
	public static Class177 aClass177_2;

	@OriginalMember(owner = "client!wca", name = "d", descriptor = "J")
	public static long aLong268 = 20000000L;

	@OriginalMember(owner = "client!wca", name = "h", descriptor = "[[Ljava/lang/String;")
	public static final String[][] aStringArrayArray1 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(ILclient!mg;)I")
	public static int method8703(@OriginalArg(1) Class222 arg0) {
		if (arg0 == Static516.aClass222_4) {
			return 9216;
		} else if (Static314.aClass222_2 == arg0) {
			return 34065;
		} else if (Static150.aClass222_1 == arg0) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(II)I")
	public static int method8704(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(B)[Lclient!fia;")
	public static Class117[] method8705() {
		return new Class117[] { Static480.aClass117_11, Static539.aClass117_13, Static643.aClass117_20, Static620.aClass117_18, Static492.aClass117_12, Static416.aClass117_10, Static315.aClass117_8, Static630.aClass117_19, Static114.aClass117_6, Static467.aClass117_21, Static558.aClass117_14, Static209.aClass117_7, Static559.aClass117_15, Static60.aClass117_4 };
	}
}
