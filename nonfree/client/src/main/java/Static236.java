import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "I")
	public static int anInt4609;

	@OriginalMember(owner = "client!jq", name = "j", descriptor = "[Z")
	public static boolean[] aBooleanArray18;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method4026(@OriginalArg(1) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < local6; local10++) {
			@Pc(15) char local15 = arg0.charAt(local10);
			if (local15 == '<' || local15 == '>') {
				local8 += 3;
			}
		}
		@Pc(37) StringBuffer local37 = new StringBuffer(local6 + local8);
		for (@Pc(39) int local39 = 0; local39 < local6; local39++) {
			@Pc(44) char local44 = arg0.charAt(local39);
			if (local44 == '<') {
				local37.append("<lt>");
			} else if (local44 == '>') {
				local37.append("<gt>");
			} else {
				local37.append(local44);
			}
		}
		return local37.toString();
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(B)V")
	public static void method4027() {
		if (Static32.aBoolean102) {
			return;
		}
		Static32.aBoolean102 = true;
		if (Static89.aClass1_Sub28_Sub1_1.aBoolean324) {
			Static362.aFloat128 = (int) Static362.aFloat128 - 17 & 0xFFFFFFF0;
		} else {
			Static404.aFloat203 += (-12.0F - Static404.aFloat203) / 2.0F;
		}
		Static126.aBoolean196 = true;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Ljava/lang/String;ZBLclient!ra;)V")
	public static void method4028(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class27 arg2) {
		@Pc(20) int local20 = Static449.aClass177_9.method4663(arg0, null, 250);
		@Pc(29) int local29 = Static449.aClass177_9.method4666(null, 250, arg0) * 13;
		Static478.aClass9_10.f(6, 6, local20 + 4 + 4, 4 + 4 + local29, -16777216, 0);
		Static478.aClass9_10.method7568(6, 6, local20 + 4 + 4, local29 + 4 + 4, -1, 0);
		arg2.method7806(null, local20, local29, 0, -1, null, 10, null, -1, 1, 0, 10, arg0);
		Static520.method7425(6, 6, local29 + 4 + 4, local20 + 4 - -4);
		if (arg1) {
			try {
				Static478.aClass9_10.method7637();
			} catch (@Pc(123) Exception_Sub1 local123) {
			}
		}
	}
}
