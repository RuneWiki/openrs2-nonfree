import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!ok", name = "B", descriptor = "Z")
	public static boolean aBoolean588;

	@OriginalMember(owner = "client!ok", name = "D", descriptor = "Lclient!vaa;")
	public static Class350 aClass350_1;

	@OriginalMember(owner = "client!ok", name = "y", descriptor = "Lclient!rga;")
	public static final Class290 aClass290_34 = new Class290("runescape", 0);

	@OriginalMember(owner = "client!ok", name = "J", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_136 = new Class73(101, 6);

	@OriginalMember(owner = "client!ok", name = "N", descriptor = "Z")
	public static boolean aBoolean589 = true;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIBII)Z")
	public static boolean method6366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg1 + arg5;
		@Pc(12) int local12 = arg0 + arg2;
		@Pc(16) int local16 = arg3 + arg4;
		if (!Static447.method6818(local12, arg5, arg4, local12, local16, local12, local16, local7, arg5)) {
			return false;
		} else if (Static447.method6818(local12, local7, arg4, local12, local16, local12, arg4, local7, arg5)) {
			if (arg5 < Static244.anInt5341) {
				if (!Static447.method6818(local12, arg5, local16, arg0, local16, local12, arg4, arg5, arg5)) {
					return false;
				}
				if (!Static447.method6818(arg0, arg5, local16, arg0, arg4, local12, arg4, arg5, arg5)) {
					return false;
				}
			} else if (!Static447.method6818(local12, local7, local16, arg0, local16, local12, arg4, local7, local7)) {
				return false;
			} else if (!Static447.method6818(arg0, local7, local16, arg0, arg4, local12, arg4, local7, local7)) {
				return false;
			}
			if (Static599.anInt10170 <= arg4) {
				if (!Static447.method6818(local12, arg5, local16, arg0, local16, local12, local16, local7, arg5)) {
					return false;
				}
				if (!Static447.method6818(arg0, local7, local16, arg0, local16, local12, local16, local7, arg5)) {
					return false;
				}
			} else if (!Static447.method6818(local12, arg5, arg4, arg0, arg4, local12, arg4, local7, arg5)) {
				return false;
			} else if (!Static447.method6818(arg0, local7, arg4, arg0, arg4, local12, arg4, local7, arg5)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method6369(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static604.method8337(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < Static437.anInt7955; local31++) {
			@Pc(37) String local37 = Static241.aStringArray14[local31];
			if (local37.startsWith("*")) {
				local37 = local37.substring(1);
			}
			local37 = Static604.method8337(local37);
			if (local37 != null && local37.equals(local20)) {
				Static437.anInt7955--;
				for (@Pc(61) int local61 = local31; local61 < Static437.anInt7955; local61++) {
					Static241.aStringArray14[local61] = Static241.aStringArray14[local61 + 1];
					Static448.aStringArray27[local61] = Static448.aStringArray27[local61 + 1];
					Static548.aStringArray35[local61] = Static548.aStringArray35[local61 + 1];
					Static202.aStringArray12[local61] = Static202.aStringArray12[local61 + 1];
					Static633.aBooleanArray27[local61] = Static633.aBooleanArray27[local61 + 1];
				}
				Static617.anInt10423 = Static51.anInt1750;
				@Pc(124) Class6_Sub17 local124 = Static330.method7824(Static336.aClass185_67, Static569.aClass134_2);
				local124.aClass6_Sub8_Sub1_2.method8211(Static190.method3507(arg0));
				local124.aClass6_Sub8_Sub1_2.method8205(arg0);
				Static452.method6867(local124);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IBI)Z")
	public static boolean method6371(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(III)Z")
	public static boolean method6372(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!ni;ZIIII)V")
	public static void method6373(@OriginalArg(0) Class223 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static187.method3470(arg1, arg0, arg2, 0L);
	}
}
