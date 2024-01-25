import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "Lclient!am;")
	public static Class11 aClass11_51;

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "Lclient!mc;")
	public static Class49 aClass49_1;

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
	public static int anInt2455;

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString82 = "purple:";

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "[C")
	public static final char[] aCharArray1 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
	public static int anInt2454 = 0;

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString83 = " from your ignore list first.";

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
	public static int anInt2456 = -1;

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString84 = "level: ";

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[J[Ljava/lang/Object;BI)V")
	public static void method2071(@OriginalArg(0) int arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg0) {
			return;
		}
		@Pc(18) int local18 = (arg3 + arg0) / 2;
		@Pc(20) int local20 = arg3;
		@Pc(24) long local24 = arg1[local18];
		arg1[local18] = arg1[arg0];
		arg1[arg0] = local24;
		@Pc(38) Object local38 = arg2[local18];
		arg2[local18] = arg2[arg0];
		arg2[arg0] = local38;
		for (@Pc(50) int local50 = arg3; local50 < arg0; local50++) {
			if (arg1[local50] < (long) (local50 & 0x1) + local24) {
				@Pc(67) long local67 = arg1[local50];
				arg1[local50] = arg1[local20];
				arg1[local20] = local67;
				@Pc(81) Object local81 = arg2[local50];
				arg2[local50] = arg2[local20];
				arg2[local20++] = local81;
			}
		}
		arg1[arg0] = arg1[local20];
		arg1[local20] = local24;
		arg2[arg0] = arg2[local20];
		arg2[local20] = local38;
		method2071(local20 - 1, arg1, arg2, arg3);
		method2071(arg0, arg1, arg2, local20 + 1);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "([Ljava/lang/String;IBI)Ljava/lang/String;")
	public static String method2072(@OriginalArg(0) String[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(21) String local21 = arg0[arg1];
			return local21 == null ? "null" : local21.toString();
		} else {
			@Pc(32) int local32 = arg1 + arg2;
			@Pc(34) int local34 = 0;
			for (@Pc(36) int local36 = arg1; local36 < local32; local36++) {
				@Pc(42) String local42 = arg0[local36];
				if (local42 == null) {
					local34 += 4;
				} else {
					local34 += local42.length();
				}
			}
			@Pc(65) StringBuffer local65 = new StringBuffer(local34);
			for (@Pc(67) int local67 = arg1; local67 < local32; local67++) {
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
