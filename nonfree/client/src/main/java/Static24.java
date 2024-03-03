import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
	public static int anInt648;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILclient!tf;)V", line = 20)
	public static void method858(@OriginalArg(0) int arg0, @OriginalArg(1) Class6 arg1) {
		Static340.aClass6Array4[arg0] = arg1;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 47)
	public static int method860(@OriginalArg(0) String arg0) {
		for (@Pc(12) int local12 = 0; local12 < Class2_Sub3_Sub17.aStringArray24.length; local12++) {
			if (Class2_Sub3_Sub17.aStringArray24[local12].equalsIgnoreCase(arg0)) {
				return local12;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIII)I", line = 73)
	public static int method861(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 <= arg1) {
			return arg2 < arg1 ? arg2 : arg1;
		} else {
			return arg0;
		}
	}
}
