import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!qs", name = "g", descriptor = "[I")
	public static int[] anIntArray487;

	@OriginalMember(owner = "client!qs", name = "l", descriptor = "Lclient!lm;")
	public static Class134 aClass134_119;

	@OriginalMember(owner = "client!qs", name = "t", descriptor = "I")
	public static int anInt5228 = 0;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IB)V")
	public static void method4536() {
		@Pc(10) Class37 local10 = Static19.aClass37_9;
		synchronized (Static19.aClass37_9) {
			Static19.aClass37_9.method920(5);
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIIII)V")
	public static void method4539(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = arg0; local7 < arg0 + arg3; local7++) {
			for (local11 = arg4; local11 < arg4 + arg2; local11++) {
				if (local11 >= 0 && Static43.anInt1151 > local11 && local7 >= 0 && local7 < Static260.anInt5348) {
					Static276.anIntArrayArrayArray12[arg1][local11][local7] = arg1 <= 0 ? 0 : Static276.anIntArrayArrayArray12[arg1 - 1][local11][local7] - 240;
				}
			}
		}
		if (arg4 > 0 && Static43.anInt1151 > arg4) {
			for (local11 = arg0 + 1; local11 < arg0 + arg3; local11++) {
				if (local11 >= 0 && Static260.anInt5348 > local11) {
					Static276.anIntArrayArrayArray12[arg1][arg4][local11] = Static276.anIntArrayArrayArray12[arg1][arg4 - 1][local11];
				}
			}
		}
		if (arg0 > 0 && Static260.anInt5348 > arg0) {
			for (local11 = arg4 + 1; local11 < arg2 + arg4; local11++) {
				if (local11 >= 0 && local11 < Static43.anInt1151) {
					Static276.anIntArrayArrayArray12[arg1][local11][arg0] = Static276.anIntArrayArrayArray12[arg1][local11][arg0 - 1];
				}
			}
		}
		if (arg4 < 0 || arg0 < 0 || arg4 >= Static43.anInt1151 || arg0 >= Static260.anInt5348) {
			return;
		}
		if (arg1 == 0) {
			if (arg4 > 0 && Static276.anIntArrayArrayArray12[arg1][arg4 - 1][arg0] != 0) {
				Static276.anIntArrayArrayArray12[arg1][arg4][arg0] = Static276.anIntArrayArrayArray12[arg1][arg4 - 1][arg0];
				return;
			}
			if (arg0 > 0 && Static276.anIntArrayArrayArray12[arg1][arg4][arg0 - 1] != 0) {
				Static276.anIntArrayArrayArray12[arg1][arg4][arg0] = Static276.anIntArrayArrayArray12[arg1][arg4][arg0 - 1];
				return;
			}
			if (arg4 > 0 && arg0 > 0 && Static276.anIntArrayArrayArray12[arg1][arg4 - 1][arg0 - 1] != 0) {
				Static276.anIntArrayArrayArray12[arg1][arg4][arg0] = Static276.anIntArrayArrayArray12[arg1][arg4 - 1][arg0 - 1];
				return;
			}
			return;
		}
		if (arg4 > 0 && Static276.anIntArrayArrayArray12[arg1][arg4 - 1][arg0] != Static276.anIntArrayArrayArray12[arg1 - 1][arg4 - 1][arg0]) {
			Static276.anIntArrayArrayArray12[arg1][arg4][arg0] = Static276.anIntArrayArrayArray12[arg1][arg4 - 1][arg0];
			return;
		}
		if (arg0 > 0 && Static276.anIntArrayArrayArray12[arg1][arg4][arg0 - 1] != Static276.anIntArrayArrayArray12[arg1 - 1][arg4][arg0 - 1]) {
			Static276.anIntArrayArrayArray12[arg1][arg4][arg0] = Static276.anIntArrayArrayArray12[arg1][arg4][arg0 - 1];
			return;
		}
		if (arg4 > 0 && arg0 > 0 && Static276.anIntArrayArrayArray12[arg1 - 1][arg4 - 1][arg0 - 1] != Static276.anIntArrayArrayArray12[arg1][arg4 - 1][arg0 - 1]) {
			Static276.anIntArrayArrayArray12[arg1][arg4][arg0] = Static276.anIntArrayArrayArray12[arg1][arg4 - 1][arg0 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(CBLjava/lang/String;)I")
	public static int method4540(@OriginalArg(0) char arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg1.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			if (arg1.charAt(local12) == arg0) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IZ)V")
	public static void method4541(@OriginalArg(1) boolean arg0) {
		for (@Pc(12) Class1_Sub43 local12 = (Class1_Sub43) Static305.aClass14_33.method302(); local12 != null; local12 = (Class1_Sub43) Static305.aClass14_33.method313()) {
			if (local12.aClass1_Sub31_Sub1_3 != null) {
				Static142.aClass1_Sub31_Sub2_1.method4444(local12.aClass1_Sub31_Sub1_3);
				local12.aClass1_Sub31_Sub1_3 = null;
			}
			if (local12.aClass1_Sub31_Sub1_2 != null) {
				Static142.aClass1_Sub31_Sub2_1.method4444(local12.aClass1_Sub31_Sub1_2);
				local12.aClass1_Sub31_Sub1_2 = null;
			}
			local12.method5796();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(56) Class1_Sub43 local56 = (Class1_Sub43) Static337.aClass14_36.method302(); local56 != null; local56 = (Class1_Sub43) Static337.aClass14_36.method313()) {
			if (local56.aClass1_Sub31_Sub1_3 != null) {
				Static142.aClass1_Sub31_Sub2_1.method4444(local56.aClass1_Sub31_Sub1_3);
				local56.aClass1_Sub31_Sub1_3 = null;
			}
			local56.method5796();
		}
		for (@Pc(85) Class1_Sub43 local85 = (Class1_Sub43) Static102.aClass207_13.method5560(); local85 != null; local85 = (Class1_Sub43) Static102.aClass207_13.method5559()) {
			if (local85.aClass1_Sub31_Sub1_3 != null) {
				Static142.aClass1_Sub31_Sub2_1.method4444(local85.aClass1_Sub31_Sub1_3);
				local85.aClass1_Sub31_Sub1_3 = null;
			}
			local85.method5796();
		}
	}
}
