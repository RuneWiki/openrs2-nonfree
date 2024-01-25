import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!gl", name = "C", descriptor = "[I")
	public static final int[] anIntArray135 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)V")
	public static void method1959() {
		if (Static43.anInt5299 <= 0) {
			Static393.aString47 = "";
			return;
		}
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < Static286.aStringArray33.length; local22++) {
			if (Static286.aStringArray33[local22].startsWith("--> ")) {
				@Pc(33) int local33 = ~Static43.anInt5299;
				local20++;
				if (local33 == ~local20) {
					Static393.aString47 = Static286.aStringArray33[local22].substring(4);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IILclient!um;IIZI)V")
	public static void method1961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class243 arg2, @OriginalArg(4) int arg3) {
		Static151.aBoolean499 = false;
		Static199.aClass243_113 = arg2;
		Static215.anInt3592 = 0;
		Static178.anInt5791 = arg0;
		Static216.anInt3609 = arg1;
		Static223.anInt3720 = 1;
		Static340.anInt5517 = Static210.aClass5_Sub22_Sub1_1.method2759() / arg3;
		if (Static340.anInt5517 < 1) {
			Static340.anInt5517 = 1;
		}
	}
}
