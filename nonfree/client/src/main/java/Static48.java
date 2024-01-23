import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!da", name = "r", descriptor = "I")
	public static int anInt1032;

	@OriginalMember(owner = "client!da", name = "y", descriptor = "B")
	public static byte aByte7;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;B)V")
	public static void method843(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		Static92.method1524(arg0, arg1, arg2, null, -1);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIII)V")
	public static void method844(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) int local14;
		if (arg2 < arg1) {
			for (local14 = arg2; local14 < arg1; local14++) {
				Static151.anIntArrayArray26[local14][arg0] = arg3;
			}
		} else {
			for (local14 = arg1; local14 < arg2; local14++) {
				Static151.anIntArrayArray26[local14][arg0] = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BII)Z")
	public static boolean method845(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		@Pc(12) Class104 local12 = Static35.method636(arg0);
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local12.method2357(arg1);
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(I)V")
	public static void method846(@OriginalArg(0) int arg0) {
		Static92.anInt1756 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static44.anInt996; local3++) {
			for (@Pc(8) int local8 = 0; local8 < Static14.anInt369; local8++) {
				if (Static130.aClass1_Sub19ArrayArrayArray1[arg0][local3][local8] == null) {
					Static130.aClass1_Sub19ArrayArrayArray1[arg0][local3][local8] = new Class1_Sub19(arg0, local3, local8);
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BLclient!jj;)Lclient!o;")
	public static Class1_Sub1 method847(@OriginalArg(1) Class1_Sub18 arg0) {
		arg0.method3122();
		@Pc(21) int local21 = arg0.method3122();
		@Pc(25) Class1_Sub1 local25 = Static288.method4407(local21);
		local25.anInt5768 = arg0.method3122();
		@Pc(34) int local34 = arg0.method3122();
		for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
			@Pc(43) int local43 = arg0.method3122();
			local25.method4446(arg0, local43);
		}
		local25.method4454();
		return local25;
	}
}
