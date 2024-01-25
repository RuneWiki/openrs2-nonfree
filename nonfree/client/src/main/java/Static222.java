import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "[I")
	public static int[] anIntArray502;

	@OriginalMember(owner = "client!mp", name = "i", descriptor = "Lclient!ln;")
	public static Class2_Sub2_Sub3 aClass2_Sub2_Sub3_1;

	@OriginalMember(owner = "client!mp", name = "l", descriptor = "I")
	public static int anInt4113;

	@OriginalMember(owner = "client!mp", name = "j", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray25 = new String[100];

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "([Ljava/lang/String;IBI)Ljava/lang/String;")
	public static String method3737(@OriginalArg(0) String[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(23) String local23 = arg0[arg1];
			return local23 == null ? "null" : local23.toString();
		} else {
			@Pc(34) int local34 = arg1 + arg2;
			@Pc(36) int local36 = 0;
			for (@Pc(38) int local38 = arg1; local38 < local34; local38++) {
				@Pc(44) String local44 = arg0[local38];
				if (local44 == null) {
					local36 += 4;
				} else {
					local36 += local44.length();
				}
			}
			@Pc(67) StringBuffer local67 = new StringBuffer(local36);
			for (@Pc(69) int local69 = arg1; local69 < local34; local69++) {
				@Pc(75) String local75 = arg0[local69];
				if (local75 == null) {
					local67.append("null");
				} else {
					local67.append(local75);
				}
			}
			return local67.toString();
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIII)V")
	public static void method3738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static244.aByteArrayArrayArray4 = new byte[4][arg1][arg0];
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IZBI)Ljava/lang/String;")
	public static String method3740(@OriginalArg(3) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(34) int local34 = 2;
		@Pc(38) int local38 = arg0 / 10;
		while (local38 != 0) {
			local38 /= 10;
			local34++;
		}
		@Pc(50) char[] local50 = new char[local34];
		local50[0] = '+';
		for (@Pc(58) int local58 = local34 - 1; local58 > 0; local58--) {
			@Pc(62) int local62 = arg0;
			arg0 /= 10;
			@Pc(73) int local73 = local62 - arg0 * 10;
			if (local73 < 10) {
				local50[local58] = (char) (local73 + 48);
			} else {
				local50[local58] = (char) (local73 + 87);
			}
		}
		return new String(local50);
	}
}
