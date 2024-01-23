import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!pc", name = "V", descriptor = "I")
	public static int anInt3851;

	@OriginalMember(owner = "client!pc", name = "ab", descriptor = "[I")
	public static int[] anIntArray451;

	@OriginalMember(owner = "client!pc", name = "P", descriptor = "Lclient!db;")
	public static Class31 aClass31_29 = new Class31(4);

	@OriginalMember(owner = "client!pc", name = "Q", descriptor = "I")
	public static int anInt3846 = 1;

	@OriginalMember(owner = "client!pc", name = "bb", descriptor = "Ljava/lang/String;")
	public static String aString133 = "red:";

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZIIII)V")
	public static void method3031(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(13) int local13 = 0; local13 < Static166.anInt3059; local13++) {
			if (Static171.anIntArray380[local13] + Static174.anIntArray383[local13] > arg1 && arg0 + arg1 > Static174.anIntArray383[local13] && Static38.anIntArray118[local13] + Static217.anIntArray514[local13] > arg3 && Static217.anIntArray514[local13] < arg3 + arg2) {
				Static267.aBooleanArray25[local13] = true;
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!og;BI)V")
	public static void method3032(@OriginalArg(0) int arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(3) int arg2) {
		if (Static29.anInt626 < 2 && Static282.anInt5856 == 0 && !Static75.aBoolean115) {
			return;
		}
		@Pc(21) String local21 = Static163.method3580();
		if (arg1 == null) {
			@Pc(37) int local37 = Static10.aClass1_Sub2_Sub12_1.method4377(local21, arg2 + 4, arg0 + 15, Static54.aRandom1, Static246.anInt3362);
			method3031(Static10.aClass1_Sub2_Sub12_1.method4390(local21) + local37, arg2 + 4, 15, arg0);
			return;
		}
		@Pc(57) Class1_Sub2_Sub12 local57 = arg1.method2856(Static211.aClass48Array2);
		if (local57 == null) {
			local57 = Static10.aClass1_Sub2_Sub12_1;
		}
		local57.method4373(local21, arg2, arg0, arg1.anInt3567, arg1.anInt3595, arg1.anInt3550, arg1.anInt3580, arg1.anInt3633, arg1.anInt3610, Static54.aRandom1, Static246.anInt3362, Static247.anIntArray590);
		method3031(Static247.anIntArray590[2], Static247.anIntArray590[0], Static247.anIntArray590[3], Static247.anIntArray590[1]);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!ak;I)V")
	public static void method3033(@OriginalArg(0) Class7 arg0) {
		Static146.aClass7_124 = arg0;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)I")
	public static int method3034(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(45) int local45 = Static138.method2190(arg1 - 1, arg0 + -1) + Static138.method2190(arg1 + 1, arg0 - 1) + Static138.method2190(arg1 - 1, arg0 - -1) + Static138.method2190(arg1 + 1, arg0 + 1);
		@Pc(75) int local75 = Static138.method2190(arg1 - 1, arg0) + Static138.method2190(arg1 + 1, arg0) + Static138.method2190(arg1, arg0 - 1) + Static138.method2190(arg1, arg0 + 1);
		@Pc(80) int local80 = Static138.method2190(arg1, arg0);
		return local45 / 16 + local75 / 8 + local80 / 4;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLclient!ak;)I")
	public static int method3036(@OriginalArg(1) Class7 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method242(Static173.anInt3185)) {
			local5++;
		}
		if (arg0.method242(Static197.anInt3815)) {
			local5++;
		}
		if (arg0.method242(Static44.anInt992)) {
			local5++;
		}
		if (arg0.method242(Static49.anInt1061)) {
			local5++;
		}
		if (arg0.method242(Static196.anInt3779)) {
			local5++;
		}
		if (arg0.method242(Static126.anInt2417)) {
			local5++;
		}
		if (arg0.method242(Static273.anInt5454)) {
			local5++;
		}
		if (arg0.method242(Static244.anInt5022)) {
			local5++;
		}
		if (arg0.method242(Static36.anInt4786)) {
			local5++;
		}
		if (arg0.method242(Static14.anInt370)) {
			local5++;
		}
		if (arg0.method242(Static291.anInt5792)) {
			local5++;
		}
		if (arg0.method242(Static174.anInt3208)) {
			local5++;
		}
		if (arg0.method242(Static289.anInt5741)) {
			local5++;
		}
		if (arg0.method242(Static119.anInt4991)) {
			local5++;
		}
		if (arg0.method242(Static81.anInt1617)) {
			local5++;
		}
		return local5;
	}
}
