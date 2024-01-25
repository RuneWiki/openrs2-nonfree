import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!ij", name = "N", descriptor = "F")
	public static float aFloat37;

	@OriginalMember(owner = "client!ij", name = "O", descriptor = "Lclient!oc;")
	public static Class178 aClass178_2;

	@OriginalMember(owner = "client!ij", name = "m", descriptor = "I")
	public static int anInt2824 = 0;

	@OriginalMember(owner = "client!ij", name = "F", descriptor = "I")
	public static final int anInt2834 = 1405;

	@OriginalMember(owner = "client!ij", name = "J", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_108 = new Class214(83, 6);

	@OriginalMember(owner = "client!ij", name = "M", descriptor = "Z")
	public static boolean aBoolean219 = false;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)I")
	public static int method2326() {
		if (Static68.aClass250_2 == null) {
			if (!Static263.aBoolean329 && Static19.anInt396 > 0) {
				if (Static314.aBoolean419 && Static321.aClass31_4.method3798(81) && Static19.anInt396 > 2) {
					return ((Class1_Sub45) Static50.aClass254_8.aClass1_249.aClass1_261.aClass1_261).anInt7399;
				}
				return ((Class1_Sub45) Static50.aClass254_8.aClass1_249.aClass1_261).anInt7399;
			}
			@Pc(41) int local41 = Static210.aClass26_1.method576();
			@Pc(45) int local45 = Static210.aClass26_1.method574();
			@Pc(47) int local47 = Static351.anInt5784;
			@Pc(49) int local49 = Static430.anInt7189;
			@Pc(51) int local51 = Static163.anInt2682;
			if (local47 < local41 && local41 < local51 + local47) {
				@Pc(69) int local69 = -1;
				@Pc(89) int local89;
				for (@Pc(71) int local71 = 0; local71 < Static19.anInt396; local71++) {
					if (Static411.aBoolean546) {
						local89 = local49 + (-local71 + Static19.anInt396 + -1) * 16 + 33;
						if (local45 > local89 - 13 && local45 <= local89 + 3) {
							local69 = local71;
						}
					} else {
						local89 = (Static19.anInt396 - local71 - 1) * 16 + local49 + 31;
						if (local89 - 13 < local45 && local89 + 3 >= local45) {
							local69 = local71;
						}
					}
				}
				if (local69 != -1) {
					local89 = 0;
					@Pc(150) Class172 local150 = new Class172(Static50.aClass254_8);
					for (@Pc(155) Class1_Sub45 local155 = (Class1_Sub45) local150.method3434(); local155 != null; local155 = (Class1_Sub45) local150.method3435()) {
						if (local69 == local89++) {
							return local155.anInt7399;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)Lclient!ub;")
	public static Class20_Sub5 method2327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class82 local7 = Static159.aClass82ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class20_Sub5 local14 = local7.aClass20_Sub5_1;
			local7.aClass20_Sub5_1 = null;
			return local14;
		}
	}
}
