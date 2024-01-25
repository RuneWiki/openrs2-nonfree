import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!bo", name = "M", descriptor = "J")
	public static long aLong36;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!haa;)V")
	public static void method919(@OriginalArg(0) Class4_Sub3 arg0) {
		if (arg0 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < 2; local5++) {
			@Pc(8) Class4_Sub3 local8 = null;
			for (@Pc(12) Class4_Sub3 local12 = Static664.aClass4_Sub3Array5[local5]; local12 != null; local12 = local12.aClass4_Sub3_25) {
				if (local12 == arg0) {
					if (local8 == null) {
						Static664.aClass4_Sub3Array5[local5] = local12.aClass4_Sub3_25;
					} else {
						local8.aClass4_Sub3_25 = local12.aClass4_Sub3_25;
					}
					Static282.aBoolean384 = true;
					return;
				}
				local8 = local12;
			}
			local8 = null;
			for (@Pc(47) Class4_Sub3 local47 = Static111.aClass4_Sub3Array2[local5]; local47 != null; local47 = local47.aClass4_Sub3_25) {
				if (local47 == arg0) {
					if (local8 == null) {
						Static111.aClass4_Sub3Array2[local5] = local47.aClass4_Sub3_25;
					} else {
						local8.aClass4_Sub3_25 = local47.aClass4_Sub3_25;
					}
					Static282.aBoolean384 = true;
					return;
				}
				local8 = local47;
			}
			local8 = null;
			for (@Pc(82) Class4_Sub3 local82 = Static170.aClass4_Sub3Array3[local5]; local82 != null; local82 = local82.aClass4_Sub3_25) {
				if (local82 == arg0) {
					if (local8 == null) {
						Static170.aClass4_Sub3Array3[local5] = local82.aClass4_Sub3_25;
					} else {
						local8.aClass4_Sub3_25 = local82.aClass4_Sub3_25;
					}
					Static282.aBoolean384 = true;
					return;
				}
				local8 = local82;
			}
		}
	}
}
