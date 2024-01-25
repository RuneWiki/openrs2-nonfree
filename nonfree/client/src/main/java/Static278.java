import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
	public static int anInt5374;

	@OriginalMember(owner = "client!nr", name = "f", descriptor = "I")
	public static int anInt5378;

	@OriginalMember(owner = "client!nr", name = "h", descriptor = "[Z")
	public static boolean[] aBooleanArray19;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Z)Lclient!uq;")
	public static Class1_Sub1_Sub17 method4104() {
		return Static377.aClass1_Sub1_Sub17_2;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!qs;ILclient!qs;)I")
	public static int method4105(@OriginalArg(0) Class211 arg0, @OriginalArg(2) Class211 arg1) {
		@Pc(5) int local5 = 0;
		if (arg1.method4761(Static6.anInt82)) {
			local5++;
		}
		if (arg1.method4761(Static125.anInt2790)) {
			local5++;
		}
		if (arg1.method4761(Static256.anInt2252)) {
			local5++;
		}
		if (arg0.method4761(Static6.anInt82)) {
			local5++;
		}
		if (arg0.method4761(Static125.anInt2790)) {
			local5++;
		}
		if (arg0.method4761(Static256.anInt2252)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(I[Ljava/lang/String;II)Ljava/lang/String;")
	public static String method4107(@OriginalArg(0) int arg0, @OriginalArg(1) String[] arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(14) String local14 = arg1[arg0];
			return local14 == null ? "null" : local14.toString();
		} else {
			@Pc(26) int local26 = arg2 + arg0;
			@Pc(28) int local28 = 0;
			for (@Pc(30) int local30 = arg0; local30 < local26; local30++) {
				@Pc(40) String local40 = arg1[local30];
				if (local40 == null) {
					local28 += 4;
				} else {
					local28 += local40.length();
				}
			}
			@Pc(62) StringBuffer local62 = new StringBuffer(local28);
			for (@Pc(64) int local64 = arg0; local64 < local26; local64++) {
				@Pc(69) String local69 = arg1[local64];
				if (local69 == null) {
					local62.append("null");
				} else {
					local62.append(local69);
				}
			}
			return local62.toString();
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static337.method4744(arg4, Static164.anInt6595, Static362.anInt6654);
		@Pc(17) int local17 = Static337.method4744(arg3, Static164.anInt6595, Static362.anInt6654);
		@Pc(23) int local23 = Static337.method4744(arg2, Static70.anInt1843, Static105.anInt2417);
		@Pc(29) int local29 = Static337.method4744(arg5, Static70.anInt1843, Static105.anInt2417);
		@Pc(37) int local37 = Static337.method4744(arg4 + arg0, Static164.anInt6595, Static362.anInt6654);
		@Pc(46) int local46 = Static337.method4744(arg3 - arg0, Static164.anInt6595, Static362.anInt6654);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static228.method3480(local23, arg6, Static60.anIntArrayArray14[local48], local29);
		}
		for (@Pc(68) int local68 = local17; local68 > local46; local68--) {
			Static228.method3480(local23, arg6, Static60.anIntArrayArray14[local68], local29);
		}
		@Pc(90) int local90 = Static337.method4744(arg0 + arg2, Static70.anInt1843, Static105.anInt2417);
		@Pc(99) int local99 = Static337.method4744(arg5 - arg0, Static70.anInt1843, Static105.anInt2417);
		for (@Pc(101) int local101 = local37; local101 <= local46; local101++) {
			@Pc(107) int[] local107 = Static60.anIntArrayArray14[local101];
			Static228.method3480(local23, arg6, local107, local90);
			Static228.method3480(local90, arg1, local107, local99);
			Static228.method3480(local99, arg6, local107, local29);
		}
	}
}
