import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "[I")
	public static int[] anIntArray326;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "Lclient!ic;")
	private static Class34 aClass34_1106 = Static56.method816("Create a free account");

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1107 = Static56.method816("<img=0>");

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1108 = aClass34_1106;

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "[I")
	public static int[] anIntArray325 = new int[] { 1, 1, 1, 1 };

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1109 = Static56.method816("blinken2:");

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "([Lclient!wf;IZ)V")
	public static void method1459(@OriginalArg(0) Class8_Sub24[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class8_Sub24 local13 = arg0[local7];
			if (local13 != null) {
				if (local13.anInt3145 == 0) {
					if (local13.aClass8_Sub24Array2 != null) {
						method1459(local13.aClass8_Sub24Array2, arg1);
					}
					@Pc(34) Class8_Sub7 local34 = (Class8_Sub7) Static31.aClass7_3.method45((long) local13.anInt3124);
					if (local34 != null) {
						Static22.method1598(local34.anInt954, arg1);
					}
				}
				@Pc(53) Class8_Sub19 local53;
				if (arg1 == 0 && local13.anObjectArray25 != null) {
					local53 = new Class8_Sub19();
					local53.anObjectArray3 = local13.anObjectArray25;
					local53.aClass8_Sub24_13 = local13;
					Static106.method1497(local53);
				}
				if (arg1 == 1 && local13.anObjectArray14 != null) {
					if (local13.anInt3122 >= 0) {
						@Pc(77) Class8_Sub24 local77 = Static113.method1614(local13.anInt3124);
						if (local77 == null || local77.aClass8_Sub24Array2 == null || local13.anInt3122 >= local77.aClass8_Sub24Array2.length || local77.aClass8_Sub24Array2[local13.anInt3122] != local13) {
							continue;
						}
					}
					local53 = new Class8_Sub19();
					local53.anObjectArray3 = local13.anObjectArray14;
					local53.aClass8_Sub24_13 = local13;
					Static106.method1497(local53);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
	public static void method1460() {
		anIntArray325 = null;
		anIntArray326 = null;
		aClass34_1108 = null;
		aClass34_1109 = null;
		aClass34_1107 = null;
		aClass34_1106 = null;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!ic;Lclient!dd;BLclient!ic;Lclient!dd;)Lclient!ub;")
	public static Class8_Sub1_Sub3_Sub4_Sub1 method1461(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(3) Class34 arg2, @OriginalArg(4) Class14 arg3) {
		@Pc(8) int local8 = arg3.method1164(arg2);
		@Pc(14) int local14 = arg3.method1159(local8, arg0);
		return Static19.method362(local14, local8, arg1, arg3);
	}
}
