import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
	public static int anInt1756;

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
	public static int anInt1758;

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "F")
	public static float aFloat69;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "F")
	public static float aFloat68 = 0.0F;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!iv;IIII)V")
	public static void method1658(@OriginalArg(0) Class161 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(15) Class2_Sub21 local15 = (Class2_Sub21) Static501.aClass341_59.method8524(); local15 != null; local15 = (Class2_Sub21) Static501.aClass341_59.method8519()) {
			if (arg3 == local15.anInt4690 && arg1 << 9 == local15.anInt4682 && arg2 << 9 == local15.anInt4688 && arg0.anInt5398 == local15.aClass161_1.anInt5398) {
				if (local15.aClass2_Sub8_Sub5_3 != null) {
					Static614.aClass2_Sub8_Sub4_2.method7925(local15.aClass2_Sub8_Sub5_3);
					local15.aClass2_Sub8_Sub5_3 = null;
				}
				if (local15.aClass2_Sub8_Sub5_2 != null) {
					Static614.aClass2_Sub8_Sub4_2.method7925(local15.aClass2_Sub8_Sub5_2);
					local15.aClass2_Sub8_Sub5_2 = null;
				}
				local15.method9253();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(FZFF)F")
	public static float method1659(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return arg0 + (arg1 - arg0) * arg2;
	}
}
