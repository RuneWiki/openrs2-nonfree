import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "[Lclient!ei;")
	public static Class94[] aClass94Array1;

	@OriginalMember(owner = "client!cp", name = "d", descriptor = "I")
	public static int anInt1886;

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "Lclient!wea;")
	public static final Class357 aClass357_5 = new Class357();

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)I")
	public static int method1573(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) int local11 = arg1.length();
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 0;
		@Pc(22) char local22 = 0;
		@Pc(24) char local24 = 0;
		while (local8 > local18 - local22 || local20 - local24 < local11) {
			if (local18 - local22 >= local8) {
				return -1;
			}
			if (local20 - local24 >= local11) {
				return 1;
			}
			@Pc(68) char local68;
			if (local22 == '\u0000') {
				local68 = arg0.charAt(local18++);
			} else {
				local68 = local22;
			}
			@Pc(81) char local81;
			if (local24 == '\u0000') {
				local81 = arg1.charAt(local20++);
			} else {
				local81 = local24;
			}
			local22 = Static533.method7515(local68);
			local24 = Static533.method7515(local81);
			local68 = Static536.method7529(arg2, local68);
			local81 = Static536.method7529(arg2, local81);
			if (local68 != local81 && Character.toUpperCase(local68) != Character.toUpperCase(local81)) {
				local68 = Character.toLowerCase(local68);
				local81 = Character.toLowerCase(local81);
				if (local81 != local68) {
					return Static573.method8079(arg2, local68) - Static573.method8079(arg2, local81);
				}
			}
		}
		@Pc(143) int local143 = Math.min(local8, local11);
		for (@Pc(145) int local145 = 0; local145 < local143; local145++) {
			if (arg2 == 2) {
				local18 = local8 - local145 - 1;
				local20 = local11 - local145 - 1;
			} else {
				local20 = local145;
				local18 = local145;
			}
			@Pc(174) char local174 = arg0.charAt(local18);
			@Pc(178) char local178 = arg1.charAt(local20);
			if (local178 != local174 && Character.toUpperCase(local174) != Character.toUpperCase(local178)) {
				local174 = Character.toLowerCase(local174);
				local178 = Character.toLowerCase(local178);
				if (local174 != local178) {
					return Static573.method8079(arg2, local174) - Static573.method8079(arg2, local178);
				}
			}
		}
		@Pc(222) int local222 = local8 - local11;
		if (local222 != 0) {
			return local222;
		}
		for (@Pc(228) int local228 = 0; local228 < local143; local228++) {
			@Pc(234) char local234 = arg0.charAt(local228);
			@Pc(238) char local238 = arg1.charAt(local228);
			if (local238 != local234) {
				return Static573.method8079(arg2, local234) - Static573.method8079(arg2, local238);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(CI)Z")
	public static boolean method1574(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(I[SB)[S")
	public static short[] method1575(@OriginalArg(0) int arg0, @OriginalArg(1) short[] arg1) {
		@Pc(6) short[] local6 = new short[arg0];
		Static599.method3059(arg1, 0, local6, 0, arg0);
		return local6;
	}
}
