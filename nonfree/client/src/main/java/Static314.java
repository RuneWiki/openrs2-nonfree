import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!ub", name = "w", descriptor = "Lclient!r;")
	public static Class7_Sub32 aClass7_Sub32_1;

	@OriginalMember(owner = "client!ub", name = "B", descriptor = "[I")
	public static int[] anIntArray756;

	@OriginalMember(owner = "client!ub", name = "E", descriptor = "[[S")
	public static short[][] aShortArrayArray7;

	@OriginalMember(owner = "client!ub", name = "N", descriptor = "[I")
	public static int[] anIntArray757;

	@OriginalMember(owner = "client!ub", name = "O", descriptor = "I")
	public static int anInt6028;

	@OriginalMember(owner = "client!ub", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString386 = "Loaded config";

	@OriginalMember(owner = "client!ub", name = "H", descriptor = "I")
	public static int anInt6024 = -1;

	@OriginalMember(owner = "client!ub", name = "I", descriptor = "Ljava/lang/String;")
	public static String aString387 = "Your ignore list is full. Max of 100 users.";

	@OriginalMember(owner = "client!ub", name = "P", descriptor = "I")
	public static int anInt6029 = 0;

	@OriginalMember(owner = "client!ub", name = "R", descriptor = "I")
	public static int anInt6030 = 100;

	@OriginalMember(owner = "client!ub", name = "V", descriptor = "[I")
	public static final int[] anIntArray758 = new int[250];

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BILjava/lang/String;IIII)V")
	public static void method5099(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) Class36_Sub5 local7 = new Class36_Sub5();
		local7.anInt3720 = arg0 + Static212.anInt4234;
		local7.anInt3715 = arg2;
		local7.anInt3717 = arg4;
		local7.anInt3713 = arg5;
		local7.aString241 = arg1;
		local7.anInt3719 = arg3;
		Static187.aClass191_4.method4872(local7);
	}

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "(I)V")
	public static void method5101() {
		Static313.anInt5999 = 0;
		Static168.aBoolean259 = false;
		Static273.anInt5393 = -1;
		Static125.anInt2778 = 1;
		Static346.anInt6535 = -3;
		Static270.anInt5321 = 0;
		Static67.anInt6311 = 0;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZBZ)V")
	public static void method5102(@OriginalArg(0) boolean arg0) {
		Static155.anInt3276++;
		Static116.method2473();
		if (arg0) {
			Static339.anInt6445++;
			Static248.method4273();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIII)I")
	public static int method5103(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) int local21 = 65536 - Class147.anIntArray603[arg1 * 8192 / arg3] >> 1;
		return (arg0 * (65536 - local21) >> 16) + (local21 * arg2 >> 16);
	}
}
