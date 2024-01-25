import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static192 {

	@OriginalMember(owner = "client!gga", name = "d", descriptor = "[I")
	public static final int[] anIntArray251 = new int[14];

	@OriginalMember(owner = "client!gga", name = "c", descriptor = "[[Ljava/lang/String;")
	public static final String[][] aStringArrayArray2 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(I)V")
	public static void method3805() {
		Static199.aClass291_36.method6986(-109);
		Static566.aClass149_9.method2891();
		Static184.aClass149_7.method2891();
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(II)I")
	public static int method3808(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(IIILclient!cn;)V")
	public static void method3809(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class73 arg2) {
		if (Static370.aClass73_22 != null || Static526.aBoolean669 || (arg2 == null || Static639.method8925(arg2) == null)) {
			return;
		}
		Static370.aClass73_22 = arg2;
		Static142.aClass73_6 = Static639.method8925(arg2);
		Static408.anInt7078 = 0;
		Static161.aBoolean202 = false;
		Static59.anInt893 = arg0;
		Static665.anInt10653 = arg1;
	}
}
