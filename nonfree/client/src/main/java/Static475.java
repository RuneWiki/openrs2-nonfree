import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static475 {

	@OriginalMember(owner = "client!qf", name = "m", descriptor = "I")
	public static int anInt8169;

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
	public static int anInt8164 = 1;

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
	public static int anInt8165 = 0;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!aaa;Z)V")
	public static void method6972(@OriginalArg(0) Class2_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(2) int local2 = arg0.aShort118; local2 <= arg0.aShort119; local2++) {
			for (@Pc(6) int local6 = arg0.aShort121; local6 <= arg0.aShort120; local6++) {
				@Pc(16) Class351 local16 = Static441.aClass351ArrayArrayArray1[arg0.aByte140][local2][local6];
				if (local16 != null) {
					@Pc(21) Class67 local21 = local16.aClass67_3;
					@Pc(23) Class67 local23 = null;
					while (local21 != null) {
						if (local21.aClass2_Sub1_Sub1_1 == arg0) {
							if (local23 == null) {
								local16.aClass67_3 = local21.aClass67_1;
							} else {
								local23.aClass67_1 = local21.aClass67_1;
							}
							local21.method1723();
							break;
						}
						local23 = local21;
						local21 = local21.aClass67_1;
					}
				}
			}
		}
		if (!arg1) {
			Static571.method7962(arg0);
		}
	}
}
