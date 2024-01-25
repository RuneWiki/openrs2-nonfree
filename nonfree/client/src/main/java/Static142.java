import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(Lclient!sea;B)I")
	public static int method2757(@OriginalArg(0) Class307 arg0) {
		if (arg0 == Static534.aClass307_7) {
			return 7681;
		} else if (Static19.aClass307_1 == arg0) {
			return 8448;
		} else if (Static479.aClass307_6 == arg0) {
			return 34165;
		} else if (Static177.aClass307_2 == arg0) {
			return 260;
		} else if (Static334.aClass307_5 == arg0) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method2758(@OriginalArg(1) String arg0) {
		@Pc(15) int local15 = arg0.length();
		@Pc(17) long local17 = 0L;
		for (@Pc(19) int local19 = 0; local19 < local15; local19++) {
			local17 = (long) arg0.charAt(local19) + (local17 << 5) - local17;
		}
		return local17;
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(III)Z")
	public static boolean method2761(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!fda", name = "b", descriptor = "(II)I")
	public static int method2762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static450.aShortArrayArray31 == null ? 0 : Static450.aShortArrayArray31[arg0][arg1] & 0xFFFF;
	}

	@OriginalMember(owner = "client!fda", name = "c", descriptor = "(II)V")
	public static void method2763(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub7_Sub18 local8 = Static543.method7218(7, arg0);
		local8.method7329();
	}
}
