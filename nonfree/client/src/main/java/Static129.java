import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!el", name = "g", descriptor = "I")
	public static int anInt3274;

	@OriginalMember(owner = "client!el", name = "b", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_53 = new Class215(31, -1);

	@OriginalMember(owner = "client!el", name = "h", descriptor = "I")
	public static int anInt3275 = -2;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!be;IIII)V")
	public static void method3010(@OriginalArg(0) Class2_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) long local16 = (long) (arg2 << 14 | arg1 << 28 | arg3);
		@Pc(22) Class2_Sub45 local22 = (Class2_Sub45) Static378.aClass99_26.method3056(local16);
		if (local22 == null) {
			local22 = new Class2_Sub45();
			Static378.aClass99_26.method3059(local16, local22);
			local22.aClass341_60.method8528(arg0);
			return;
		}
		@Pc(47) Class301 local47 = Static635.aClass336_2.method8424(arg0.anInt790);
		@Pc(50) int local50 = local47.anInt9218;
		if (local47.anInt9219 == 1) {
			local50 *= arg0.anInt789 + 1;
		}
		for (@Pc(71) Class2_Sub7 local71 = (Class2_Sub7) local22.aClass341_60.method8524(); local71 != null; local71 = (Class2_Sub7) local22.aClass341_60.method8519()) {
			local47 = Static635.aClass336_2.method8424(local71.anInt790);
			@Pc(82) int local82 = local47.anInt9218;
			if (local47.anInt9219 == 1) {
				local82 *= local71.anInt789 + 1;
			}
			if (local82 < local50) {
				Static458.method7147(arg0, local71);
				return;
			}
		}
		local22.aClass341_60.method8528(arg0);
	}
}
