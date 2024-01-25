import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!fka", name = "t", descriptor = "I")
	public static int anInt3453;

	@OriginalMember(owner = "client!fka", name = "r", descriptor = "I")
	public static int anInt3462 = 0;

	@OriginalMember(owner = "client!fka", name = "a", descriptor = "(Lclient!rfa;)V")
	public static void method3262(@OriginalArg(0) Class60_Sub1 arg0) {
		if (arg0 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < 2; local5++) {
			@Pc(8) Class60_Sub1 local8 = null;
			for (@Pc(12) Class60_Sub1 local12 = Static403.aClass60_Sub1Array5[local5]; local12 != null; local12 = local12.aClass60_Sub1_23) {
				if (local12 == arg0) {
					if (local8 == null) {
						Static403.aClass60_Sub1Array5[local5] = local12.aClass60_Sub1_23;
					} else {
						local8.aClass60_Sub1_23 = local12.aClass60_Sub1_23;
					}
					Static429.aBoolean549 = true;
					return;
				}
				local8 = local12;
			}
			local8 = null;
			for (@Pc(47) Class60_Sub1 local47 = Static265.aClass60_Sub1Array4[local5]; local47 != null; local47 = local47.aClass60_Sub1_23) {
				if (local47 == arg0) {
					if (local8 == null) {
						Static265.aClass60_Sub1Array4[local5] = local47.aClass60_Sub1_23;
					} else {
						local8.aClass60_Sub1_23 = local47.aClass60_Sub1_23;
					}
					Static429.aBoolean549 = true;
					return;
				}
				local8 = local47;
			}
			local8 = null;
			for (@Pc(82) Class60_Sub1 local82 = Static535.aClass60_Sub1Array3[local5]; local82 != null; local82 = local82.aClass60_Sub1_23) {
				if (local82 == arg0) {
					if (local8 == null) {
						Static535.aClass60_Sub1Array3[local5] = local82.aClass60_Sub1_23;
					} else {
						local8.aClass60_Sub1_23 = local82.aClass60_Sub1_23;
					}
					Static429.aBoolean549 = true;
					return;
				}
				local8 = local82;
			}
		}
	}

	@OriginalMember(owner = "client!fka", name = "a", descriptor = "(III)Z")
	public static boolean method3263(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static163.method3216(arg0, arg1)) {
			return Static409.method6270(arg0, arg1) | (arg0 & 0x9000) != 0 | Static36.method466(arg0, arg1) ? true : (arg1 & 0x37) == 0 & (Static70.method927(arg1, arg0) | (arg0 & 0x2000) != 0 | Static516.method7468(arg1, arg0));
		} else {
			return false;
		}
	}
}
