import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!op", name = "w", descriptor = "I")
	public static int anInt5269;

	@OriginalMember(owner = "client!op", name = "D", descriptor = "[Z")
	public static boolean[] aBooleanArray18;

	@OriginalMember(owner = "client!op", name = "G", descriptor = "F")
	public static float aFloat147;

	@OriginalMember(owner = "client!op", name = "p", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_94 = new Class36(69, 0);

	@OriginalMember(owner = "client!op", name = "x", descriptor = "I")
	public static int anInt5270 = 0;

	@OriginalMember(owner = "client!op", name = "y", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray33 = new String[200];

	@OriginalMember(owner = "client!op", name = "B", descriptor = "I")
	public static final int anInt5273 = 205;

	@OriginalMember(owner = "client!op", name = "E", descriptor = "[I")
	public static final int[] anIntArray453 = new int[8];

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(III)I")
	public static int method4051(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg1 > 0) {
			local7 = arg0 & 0x1 | local7 << 1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local7;
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(I)V")
	public static void method4052() {
		if (Static16.aClass30_11.method4686()) {
			Static16.aClass30_11.method4684(Static248.aCanvas5);
			Static216.method3072();
			Static16.aClass30_11.method4649(Static248.aCanvas5);
			Static16.aClass30_11.method4642(Static248.aCanvas5);
		} else {
			Static435.method5598(Static286.anInt5207);
		}
		Static262.method3574();
	}
}
