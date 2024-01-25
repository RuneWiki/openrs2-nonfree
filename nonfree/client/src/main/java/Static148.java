import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
	public static int anInt2359;

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
	public static int anInt2360;

	@OriginalMember(owner = "client!fm", name = "g", descriptor = "F")
	public static float aFloat56;

	@OriginalMember(owner = "client!fm", name = "h", descriptor = "J")
	public static long aLong56;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "Z")
	public static boolean aBoolean166 = false;

	@OriginalMember(owner = "client!fm", name = "f", descriptor = "Lclient!dc;")
	public static Class70 aClass70_6 = new Class70();

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Z)V")
	public static void method2023() {
		@Pc(9) int[] local9 = new int[Static466.aClass130_2.anInt2699];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static466.aClass130_2.anInt2699; local13++) {
			@Pc(25) Class164 local25 = Static466.aClass130_2.method2311(local13);
			if (local25.anInt3856 >= 0 || local25.anInt3842 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static112.anIntArray169 = new int[local11];
		for (@Pc(49) int local49 = 0; local49 < local11; local49++) {
			Static112.anIntArray169[local49] = local9[local49];
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(III)V")
	public static void method2025(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class2_Sub2_Sub18 local10 = Static508.method6607(arg0, 14);
		local10.method6227();
		local10.anInt7701 = arg1;
	}
}
