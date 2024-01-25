import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
	public static int anInt4534 = 0;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)Lclient!pl;")
	public static Class40 method3763() {
		try {
			return (Class40) Class.forName("Class40_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IBIIII)V")
	public static void method3764(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 > Static418.anInt7030 || arg0 < Static316.anInt5349) {
			return;
		}
		@Pc(18) boolean local18;
		if (arg4 < Static399.anInt2866) {
			arg4 = Static399.anInt2866;
			local18 = false;
		} else if (arg4 <= Static372.anInt6316) {
			local18 = true;
		} else {
			arg4 = Static372.anInt6316;
			local18 = false;
		}
		@Pc(47) boolean local47;
		if (Static399.anInt2866 > arg1) {
			arg1 = Static399.anInt2866;
			local47 = false;
		} else if (Static372.anInt6316 >= arg1) {
			local47 = true;
		} else {
			local47 = false;
			arg1 = Static372.anInt6316;
		}
		if (arg3 < Static316.anInt5349) {
			arg3 = Static316.anInt5349;
		} else {
			Static201.method3084(Static296.anIntArrayArray42[arg3++], arg4, arg1, arg2);
		}
		if (arg0 > Static418.anInt7030) {
			arg0 = Static418.anInt7030;
		} else {
			Static201.method3084(Static296.anIntArrayArray42[arg0--], arg4, arg1, arg2);
		}
		@Pc(101) int local101;
		if (local18 && local47) {
			for (local101 = arg3; local101 <= arg0; local101++) {
				@Pc(107) int[] local107 = Static296.anIntArrayArray42[local101];
				local107[arg4] = local107[arg1] = arg2;
			}
		} else if (local18) {
			for (local101 = arg3; local101 <= arg0; local101++) {
				Static296.anIntArrayArray42[local101][arg4] = arg2;
			}
		} else if (local47) {
			for (local101 = arg3; local101 <= arg0; local101++) {
				Static296.anIntArrayArray42[local101][arg1] = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BLclient!ik;)V")
	public static void method3766(@OriginalArg(1) Class3_Sub25_Sub1 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static40.anInt660; local7++) {
			@Pc(13) int local13 = Static198.anIntArray224[local7];
			@Pc(17) Class1_Sub2_Sub6_Sub2 local17 = Static216.aClass1_Sub2_Sub6_Sub2Array1[local13];
			@Pc(21) int local21 = arg0.method4096();
			if ((local21 & 0x1) != 0) {
				local21 += arg0.method4096() << 8;
			}
			if ((local21 & 0x2000) != 0) {
				local21 += arg0.method4096() << 16;
			}
			Static420.method5756(local21, local13, arg0, local17);
		}
	}
}
