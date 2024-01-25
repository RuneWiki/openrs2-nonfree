import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static543 {

	@OriginalMember(owner = "client!uw", name = "u", descriptor = "Lclient!pe;")
	public static Class254 aClass254_130;

	@OriginalMember(owner = "client!uw", name = "w", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_144 = new Class276(89, 7);

	@OriginalMember(owner = "client!uw", name = "y", descriptor = "[I")
	public static final int[] anIntArray653 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(ZIBIIZI)V")
	public static void method7958(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg2 <= arg5) {
			return;
		}
		@Pc(8) int local8 = (arg2 + arg5) / 2;
		@Pc(10) int local10 = arg5;
		@Pc(14) Class69_Sub1 local14 = Static228.aClass69_Sub1Array1[local8];
		Static228.aClass69_Sub1Array1[local8] = Static228.aClass69_Sub1Array1[arg2];
		Static228.aClass69_Sub1Array1[arg2] = local14;
		for (@Pc(26) int local26 = arg5; local26 < arg2; local26++) {
			if (Static528.method7776(arg1, arg3, arg0, Static228.aClass69_Sub1Array1[local26], local14, arg4) <= 0) {
				@Pc(45) Class69_Sub1 local45 = Static228.aClass69_Sub1Array1[local26];
				Static228.aClass69_Sub1Array1[local26] = Static228.aClass69_Sub1Array1[local10];
				Static228.aClass69_Sub1Array1[local10++] = local45;
			}
		}
		Static228.aClass69_Sub1Array1[arg2] = Static228.aClass69_Sub1Array1[local10];
		Static228.aClass69_Sub1Array1[local10] = local14;
		method7958(arg0, arg1, local10 - 1, arg3, arg4, arg5);
		method7958(arg0, arg1, arg2, arg3, arg4, local10 + 1);
	}
}
