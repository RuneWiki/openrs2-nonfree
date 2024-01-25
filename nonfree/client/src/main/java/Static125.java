import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!fv", name = "i", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_47 = new Class208(53, -1);

	@OriginalMember(owner = "client!fv", name = "k", descriptor = "Lclient!cg;")
	public static final Class37 aClass37_13 = new Class37(10, 2, 2, 0);

	@OriginalMember(owner = "client!fv", name = "l", descriptor = "I")
	public static int anInt3195 = 2;

	@OriginalMember(owner = "client!fv", name = "m", descriptor = "Lclient!gi;")
	public static Class93 aClass93_11 = null;

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIII)I")
	public static int method2634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 / arg1;
		@Pc(13) int local13 = arg1 - 1 & arg0;
		@Pc(17) int local17 = arg2 / arg1;
		@Pc(23) int local23 = arg2 & arg1 - 1;
		@Pc(28) int local28 = Static350.method4925(local17, local7);
		@Pc(35) int local35 = Static350.method4925(local17, local7 + 1);
		@Pc(42) int local42 = Static350.method4925(local17 + 1, local7);
		@Pc(59) int local59 = Static350.method4925(local17 + 1, local7 + 1);
		@Pc(66) int local66 = Static138.method2162(local28, local35, local13, arg1);
		@Pc(73) int local73 = Static138.method2162(local42, local59, local13, arg1);
		return Static138.method2162(local66, local73, local23, arg1);
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "([Ljava/lang/String;III)Ljava/lang/String;")
	public static String method2636(@OriginalArg(0) String[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 0) {
			return "";
		} else if (arg1 == 1) {
			@Pc(21) String local21 = arg0[arg2];
			return local21 == null ? "null" : local21.toString();
		} else {
			@Pc(32) int local32 = arg2 + arg1;
			@Pc(34) int local34 = 0;
			for (@Pc(36) int local36 = arg2; local36 < local32; local36++) {
				@Pc(42) String local42 = arg0[local36];
				if (local42 == null) {
					local34 += 4;
				} else {
					local34 += local42.length();
				}
			}
			@Pc(65) StringBuffer local65 = new StringBuffer(local34);
			for (@Pc(67) int local67 = arg2; local67 < local32; local67++) {
				@Pc(73) String local73 = arg0[local67];
				if (local73 == null) {
					local65.append("null");
				} else {
					local65.append(local73);
				}
			}
			return local65.toString();
		}
	}
}
