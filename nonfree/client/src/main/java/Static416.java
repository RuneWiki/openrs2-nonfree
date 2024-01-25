import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
	public static int anInt7438 = 0;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V")
	public static void method6102() {
		if (Static305.aBoolean347) {
			return;
		}
		Static65.aBoolean151 = true;
		Static305.aBoolean347 = true;
		if (Static291.aClass28_Sub1_1.aBoolean85) {
			Static165.aFloat28 = (int) Static165.aFloat28 + 47 & 0xFFFFFFF0;
		} else {
			Static408.aFloat98 += (12.0F - Static408.aFloat98) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIII)V")
	public static void method6103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = arg0 * Static291.aClass28_Sub1_1.anInt1033 >> 8;
		if (arg2 == -1 && !Static5.aBoolean10) {
			Static432.method6289();
		} else if (arg2 != -1 && (Static168.anInt3378 != arg2 || !Static434.method6300()) && local6 != 0 && !Static5.aBoolean10) {
			Static70.method1418(arg2, arg1, local6, Static263.aClass100_51);
		}
		Static168.anInt3378 = arg2;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(II[I[Ljava/lang/Object;I)V")
	public static void method6104(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Object[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg0) {
			return;
		}
		@Pc(18) int local18 = (arg3 + arg0) / 2;
		@Pc(20) int local20 = arg0;
		@Pc(24) int local24 = arg1[local18];
		arg1[local18] = arg1[arg3];
		arg1[arg3] = local24;
		@Pc(38) Object local38 = arg2[local18];
		arg2[local18] = arg2[arg3];
		arg2[arg3] = local38;
		@Pc(57) int local57 = ~local24 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(59) int local59 = arg0; local59 < arg3; local59++) {
			if (local24 + (local59 & local57) > arg1[local59]) {
				@Pc(74) int local74 = arg1[local59];
				arg1[local59] = arg1[local20];
				arg1[local20] = local74;
				@Pc(88) Object local88 = arg2[local59];
				arg2[local59] = arg2[local20];
				arg2[local20++] = local88;
			}
		}
		arg1[arg3] = arg1[local20];
		arg1[local20] = local24;
		arg2[arg3] = arg2[local20];
		arg2[local20] = local38;
		method6104(arg0, arg1, arg2, local20 - 1);
		method6104(local20 + 1, arg1, arg2, arg3);
	}
}
