import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!rf", name = "r", descriptor = "[Lclient!ig;")
	public static Class12[] aClass12Array16;

	@OriginalMember(owner = "client!rf", name = "m", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_105 = new Class186(81, -1);

	@OriginalMember(owner = "client!rf", name = "x", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_93 = new Class25(5, -1);

	@OriginalMember(owner = "client!rf", name = "y", descriptor = "I")
	public static int anInt5771 = 0;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4844(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static214.method3328(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(37) int local37 = 0; local37 < Static203.anInt3584; local37++) {
			@Pc(43) String local43 = Static411.aStringArray46[local37];
			if (local43.startsWith("*")) {
				local43 = local43.substring(1);
			}
			local43 = Static214.method3328(local43);
			if (local43 != null && local43.equals(local20)) {
				Static203.anInt3584--;
				for (@Pc(67) int local67 = local37; local67 < Static203.anInt3584; local67++) {
					Static411.aStringArray46[local67] = Static411.aStringArray46[local67 + 1];
					Static115.aStringArray15[local67] = Static115.aStringArray15[local67 + 1];
					Static371.aStringArray43[local67] = Static371.aStringArray43[local67 + 1];
					Static451.aStringArray44[local67] = Static451.aStringArray44[local67 + 1];
					Static323.aBooleanArray22[local67] = Static323.aBooleanArray22[local67 + 1];
				}
				Static31.anInt507 = Static323.anInt5265;
				Static298.method4373(Static220.aClass25_54);
				Static449.aClass6_Sub15_Sub1_2.method3075(Static384.method5308(arg0));
				Static449.aClass6_Sub15_Sub1_2.method3094(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILclient!tq;)Z")
	public static boolean method4845(@OriginalArg(1) Class239 arg0) {
		if (arg0.anInt6442 == Static6.anInt85) {
			Static275.anInt4710 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIIB[B)Z")
	public static boolean method4848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) byte[] arg4) {
		@Pc(9) int local9 = arg1 % 8;
		@Pc(16) int local16;
		if (local9 == 0) {
			local16 = 0;
		} else {
			local16 = 8 - local9;
		}
		@Pc(33) int local33 = -((arg0 + 8 - 1) / 8);
		@Pc(42) int local42 = -((arg1 + 8 - 1) / 8);
		for (@Pc(51) int local51 = local33; local51 < 0; local51++) {
			for (@Pc(55) int local55 = local42; local55 < 0; local55++) {
				if (arg4[arg3] == 0) {
					return true;
				}
				arg3 += 8;
			}
			arg3 -= local16;
			if (arg4[arg3 - 1] == 0) {
				return true;
			}
			arg3 += arg2;
		}
		return false;
	}
}
