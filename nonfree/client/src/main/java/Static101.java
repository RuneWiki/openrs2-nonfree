import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
	public static int anInt6023;

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
	public static int anInt6027;

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "Lclient!jd;")
	public static Class84 aClass84_127;

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "Lclient!gi;")
	public static Class61 aClass61_12;

	@OriginalMember(owner = "client!ia", name = "n", descriptor = "Lclient!jd;")
	public static Class84 aClass84_128;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString293 = "flash3:";

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
	public static int anInt6024 = -1;

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "[I")
	public static int[] anIntArray517 = new int[1000];

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
	public static void method4817() {
		if (Static282.aString282.toLowerCase().indexOf("microsoft") != -1) {
			Static103.anIntArray160[191] = 73;
			Static103.anIntArray160[223] = 28;
			Static103.anIntArray160[188] = 71;
			Static103.anIntArray160[222] = 59;
			Static103.anIntArray160[221] = 43;
			Static103.anIntArray160[190] = 72;
			Static103.anIntArray160[187] = 27;
			Static103.anIntArray160[219] = 42;
			Static103.anIntArray160[186] = 57;
			Static103.anIntArray160[220] = 74;
			Static103.anIntArray160[189] = 26;
			Static103.anIntArray160[192] = 58;
			return;
		}
		Static103.anIntArray160[44] = 71;
		if (Static282.aMethod1 == null) {
			Static103.anIntArray160[192] = 58;
			Static103.anIntArray160[222] = 59;
		} else {
			Static103.anIntArray160[192] = 28;
			Static103.anIntArray160[222] = 58;
			Static103.anIntArray160[520] = 59;
		}
		Static103.anIntArray160[93] = 43;
		Static103.anIntArray160[46] = 72;
		Static103.anIntArray160[47] = 73;
		Static103.anIntArray160[59] = 57;
		Static103.anIntArray160[91] = 42;
		Static103.anIntArray160[45] = 26;
		Static103.anIntArray160[61] = 27;
		Static103.anIntArray160[92] = 74;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIZ)Z")
	public static boolean method4819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		@Pc(8) Class143 local8 = Static218.method3692(arg0);
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local8.method3655(arg1);
	}
}
