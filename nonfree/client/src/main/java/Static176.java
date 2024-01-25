import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIII)I")
	public static int method2504(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 <= arg0) {
			return arg1 >= arg0 ? arg0 : arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(Z)V")
	public static void method2505() {
		for (@Pc(16) int local16 = 0; local16 < Static507.anInt8646; local16++) {
			@Pc(22) Class104 local22 = Static150.aClass104Array1[local16];
			if (local22.aByte59 == 3) {
				if (local22.aClass1_Sub7_Sub4_1 == null) {
					local22.anInt2640 = Integer.MIN_VALUE;
				} else {
					Static309.aClass1_Sub7_Sub1_2.method477(local22.aClass1_Sub7_Sub4_1);
				}
			}
		}
	}
}
