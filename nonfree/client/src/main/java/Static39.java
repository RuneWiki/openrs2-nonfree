import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bh", name = "u", descriptor = "[[I")
	public static int[][] anIntArrayArray93;

	@OriginalMember(owner = "client!bh", name = "p", descriptor = "Lclient!iga;")
	public static final Class159 aClass159_7 = new Class159(0);

	@OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
	public static int anInt9755 = 0;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(JZ)V")
	public static void method8153(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(12) InterruptedException local12) {
		}
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(IIII)I")
	public static int method8157(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static334.anInt6170 < 100) {
			return -2;
		}
		@Pc(12) int local12 = -2;
		@Pc(14) int local14 = Integer.MAX_VALUE;
		@Pc(22) int local22 = arg1 - Static292.anInt8373;
		@Pc(27) int local27 = arg0 - Static292.anInt8380;
		for (@Pc(32) Class2_Sub36 local32 = (Class2_Sub36) Static292.aClass238_57.method5833(); local32 != null; local32 = (Class2_Sub36) Static292.aClass238_57.method5838()) {
			if (local32.anInt6596 == arg2) {
				@Pc(44) int local44 = local32.anInt6587;
				@Pc(47) int local47 = local32.anInt6590;
				@Pc(57) int local57 = Static292.anInt8380 + local47 | local44 + Static292.anInt8373 << 14;
				@Pc(77) int local77 = (local22 - local44) * (local22 + -local44) + (local27 - local47) * (-local47 + local27);
				if (local12 < 0 || local14 > local77) {
					local12 = local57;
					local14 = local77;
				}
			}
		}
		return local12;
	}
}
