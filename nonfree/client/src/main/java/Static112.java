import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!fo", name = "G", descriptor = "[I")
	public static final int[] anIntArray113 = new int[13];

	@OriginalMember(owner = "client!fo", name = "L", descriptor = "Lclient!dq;")
	public static final Class60 aClass60_5 = new Class60(2, 4);

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(BI)Z")
	public static boolean method1762(@OriginalArg(1) int arg0) {
		if (arg0 == 25 || arg0 == 9 || arg0 == 11 || arg0 == 19 || arg0 == 1010) {
			return true;
		} else {
			return arg0 == 5 || arg0 == 1001;
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ljava/lang/String;B)J")
	public static long method1763(@OriginalArg(0) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(17) int local17 = arg0.length();
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			local7 *= 37L;
			@Pc(29) char local29 = arg0.charAt(local19);
			if (local29 >= 'A' && local29 <= 'Z') {
				local7 += local29 + 1 - 65;
			} else if (local29 >= 'a' && local29 <= 'z') {
				local7 += local29 + 1 - 97;
			} else if (local29 >= '0' && local29 <= '9') {
				local7 += local29 + 27 - 48;
			}
			if (local7 >= 177917621779460413L) {
				break;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(III)Lclient!qd;")
	public static Class47_Sub5 method1764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class137 local7 = Static131.aClass137ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass47_Sub5_1 == null ? null : local7.aClass47_Sub5_1;
	}

	@OriginalMember(owner = "client!fo", name = "h", descriptor = "(I)V")
	public static void method1766() {
		Static224.method3272(Static52.aClass254_24);
		Static201.aClass1_Sub14_Sub2_2.method4504(Static100.anInt1967);
	}
}
