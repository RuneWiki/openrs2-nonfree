import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!la", name = "s", descriptor = "I")
	public static int anInt6035;

	@OriginalMember(owner = "client!la", name = "t", descriptor = "I")
	public static int anInt6036;

	@OriginalMember(owner = "client!la", name = "n", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_83 = new Class376(55, 8);

	@OriginalMember(owner = "client!la", name = "q", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_109 = new Class126(76, -1);

	@OriginalMember(owner = "client!la", name = "u", descriptor = "I")
	public static int anInt6037 = 0;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method5060(@OriginalArg(0) String arg0) {
		Static310.method4784(0, arg0, "", "", 0, "");
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BI)Lclient!ot;")
	public static Class270 method5061(@OriginalArg(1) int arg0) {
		@Pc(16) Class270[] local16 = Static447.method6465();
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(24) Class270 local24 = local16[local18];
			if (local24.anInt7654 == arg0) {
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;CI)[Ljava/lang/String;")
	public static String[] method5062(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(10) int local10 = Static104.method2039(arg0, arg1);
		@Pc(20) String[] local20 = new String[local10 + 1];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local10; local26++) {
			@Pc(30) int local30;
			for (local30 = local24; arg0.charAt(local30) != arg1; local30++) {
			}
			local20[local22++] = arg0.substring(local24, local30);
			local24 = local30 + 1;
		}
		local20[local10] = arg0.substring(local24);
		return local20;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IZI)V")
	public static void method5063(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static368.method5461(arg1)) {
			Static157.method2719(Static562.aClass208ArrayArray3[arg1], arg0);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V")
	public static void method5065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static481.method6843(arg0, arg1);
	}
}
