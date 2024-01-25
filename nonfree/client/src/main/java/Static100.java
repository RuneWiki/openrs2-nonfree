import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!cw", name = "q", descriptor = "[[B")
	public static byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!cw", name = "h", descriptor = "I")
	public static int anInt1781 = -2;

	@OriginalMember(owner = "client!cw", name = "m", descriptor = "I")
	public static int anInt1783 = 0;

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Ljava/lang/String;CI)[Ljava/lang/String;")
	public static String[] method1530(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(10) int local10 = Static437.method6344(arg1, arg0);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < local10; local21++) {
			@Pc(25) int local25;
			for (local25 = local19; arg1 != arg0.charAt(local25); local25++) {
			}
			local15[local17++] = arg0.substring(local19, local25);
			local19 = local25 + 1;
		}
		local15[local10] = arg0.substring(local19);
		return local15;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method1531(@OriginalArg(0) String arg0) {
		@Pc(16) int local16 = arg0.length();
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < local16; local20++) {
			local18 = Static575.method7988(arg0.charAt(local20)) + (local18 << 5) - local18;
		}
		return local18;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(II)I")
	public static int method1532(@OriginalArg(0) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
