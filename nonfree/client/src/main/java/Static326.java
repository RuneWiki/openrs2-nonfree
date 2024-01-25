import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!lr", name = "z", descriptor = "Lclient!nt;")
	public static Class238 aClass238_1;

	@OriginalMember(owner = "client!lr", name = "D", descriptor = "I")
	public static int anInt6543;

	@OriginalMember(owner = "client!lr", name = "n", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray24 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!lr", name = "t", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray25 = new String[100];

	@OriginalMember(owner = "client!lr", name = "u", descriptor = "I")
	public static int anInt6537 = -1;

	@OriginalMember(owner = "client!lr", name = "B", descriptor = "Lclient!gaa;")
	public static Class108 aClass108_8 = null;

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILclient!lea;IIB)V")
	public static void method5481(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub3_Sub1_Sub2_Sub2 arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = arg1.anIntArray378[0];
		@Pc(15) int local15 = arg1.anIntArray377[0];
		if (local10 < 0 || local10 >= Static394.anInt7540 || local15 < 0 || Static462.anInt8391 <= local15 || (arg2 < 0 || Static394.anInt7540 <= arg2 || arg0 < 0 || arg0 >= Static462.anInt8391)) {
			return;
		}
		@Pc(66) int local66 = Static392.method6267(Static334.aClass291Array20[arg1.aByte128], 0, local10, 0, arg1.method5308(), Static420.anIntArray483, local15, arg0, -4, arg2, 0, true, Static105.anIntArray116, 0);
		if (local66 >= 1 && local66 <= 3) {
			for (@Pc(87) int local87 = 0; local87 < local66 - 1; local87++) {
				arg1.method5325(Static420.anIntArray483[local87], Static105.anIntArray116[local87], (byte) 2);
			}
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(I[I[IZILclient!eq;)Lclient!wg;")
	public static Class1_Sub3 method5482(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class33_Sub3 arg4) {
		@Pc(10) byte[] local10 = new byte[arg0 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			@Pc(27) int local27 = arg0 * local12 + arg1[local12];
			for (@Pc(29) int local29 = 0; local29 < arg2[local12]; local29++) {
				local10[local27++] = -1;
			}
		}
		return new Class1_Sub3(arg4, arg0, arg3, local10);
	}
}
