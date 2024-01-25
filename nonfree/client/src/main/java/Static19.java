import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!at", name = "o", descriptor = "I")
	public static int anInt416 = -1;

	@OriginalMember(owner = "client!at", name = "y", descriptor = "I")
	public static int anInt422 = 0;

	@OriginalMember(owner = "client!at", name = "B", descriptor = "[I")
	public static final int[] anIntArray29 = new int[250];

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(II)I")
	public static int method261(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IIIILclient!jv;)V")
	public static void method262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub5 arg4) {
		@Pc(4) Class113 local4 = Static363.method5062(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		arg4.anInt7586 = (arg1 << Static250.anInt4056) + Static176.anInt3421;
		arg4.anInt7588 = arg3;
		arg4.anInt7583 = (arg2 << Static250.anInt4056) + Static176.anInt3421;
		for (@Pc(28) Class134 local28 = local4.aClass134_1; local28 != null; local28 = local28.aClass134_2) {
			if (local28.aClass4_Sub2_1.aBoolean603) {
				@Pc(38) int local38 = local28.aClass4_Sub2_1.method5562();
				if (local38 != -32768 && local38 < local8) {
					local8 = local38;
				}
			}
		}
		if (local8 < 0) {
			arg4.anInt7588 += local8;
			arg4.aBoolean650 = true;
		}
		local4.aClass4_Sub5_1 = arg4;
	}

	@OriginalMember(owner = "client!at", name = "d", descriptor = "(I)V")
	public static void method264() {
		Static448.method6059(Static96.aClass44_28);
		Static98.aClass2_Sub20_Sub1_1.method3745(Static436.anInt7620);
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IBLclient!cr;)Ljava/lang/String;")
	public static String method267(@OriginalArg(0) int arg0, @OriginalArg(2) Class41 arg1) {
		if (!Static56.method1112(arg1).method1588(arg0) && arg1.anObjectArray25 == null) {
			return null;
		} else if (arg1.aStringArray6 == null || arg0 >= arg1.aStringArray6.length || arg1.aStringArray6[arg0] == null || arg1.aStringArray6[arg0].trim().length() == 0) {
			return Static345.aBoolean339 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray6[arg0];
		}
	}
}
