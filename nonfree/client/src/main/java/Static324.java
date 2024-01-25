import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!un", name = "L", descriptor = "Z")
	public static boolean aBoolean451 = false;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "([Ljava/lang/String;IIB)Ljava/lang/String;")
	public static String method5210(@OriginalArg(0) String[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 0) {
			return "";
		} else if (arg1 == 1) {
			@Pc(19) String local19 = arg0[arg2];
			return local19 == null ? "null" : local19.toString();
		} else {
			@Pc(30) int local30 = arg2 + arg1;
			@Pc(37) int local37 = 0;
			for (@Pc(39) int local39 = arg2; local39 < local30; local39++) {
				@Pc(44) String local44 = arg0[local39];
				if (local44 == null) {
					local37 += 4;
				} else {
					local37 += local44.length();
				}
			}
			@Pc(66) StringBuffer local66 = new StringBuffer(local37);
			for (@Pc(68) int local68 = arg2; local68 < local30; local68++) {
				@Pc(73) String local73 = arg0[local68];
				if (local73 == null) {
					local66.append("null");
				} else {
					local66.append(local73);
				}
			}
			return local66.toString();
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ZB)V")
	public static void method5211(@OriginalArg(0) boolean arg0) {
		if (Static256.aBoolean362 != arg0) {
			Static256.aBoolean362 = arg0;
			Static268.method4491();
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public static boolean method5212(@OriginalArg(1) String arg0) {
		return Static80.method1713(arg0);
	}
}
