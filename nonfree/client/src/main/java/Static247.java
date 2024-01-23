import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!t", name = "t", descriptor = "Lclient!in;")
	public static Class71 aClass71_21;

	@OriginalMember(owner = "client!t", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString288 = "Connecting to update server";

	@OriginalMember(owner = "client!t", name = "q", descriptor = "[I")
	public static int[] anIntArray428 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!t", name = "v", descriptor = "[I")
	public static int[] anIntArray430 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ILclient!bo;)V")
	public static void method3825(@OriginalArg(1) Class14_Sub2 arg0) {
		if (Static237.anInt4710 == arg0.anInt4647 || arg0.anInt4620 == -1 || arg0.anInt4695 != 0 || arg0.anInt4637 + 1 > Static90.method1591(arg0.anInt4620).anIntArray356[arg0.anInt4633]) {
			@Pc(38) int local38 = arg0.anInt4647 - arg0.anInt4692;
			@Pc(44) int local44 = Static237.anInt4710 - arg0.anInt4692;
			@Pc(55) int local55 = arg0.anInt4643 * 128 + arg0.method3656() * 64;
			@Pc(66) int local66 = arg0.anInt4634 * 128 + arg0.method3656() * 64;
			@Pc(77) int local77 = arg0.anInt4672 * 128 + arg0.method3656() * 64;
			@Pc(89) int local89 = arg0.anInt4623 * 128 + arg0.method3656() * 64;
			arg0.anInt4680 = (local77 * local44 + (local38 - local44) * local55) / local38;
			arg0.anInt4630 = (local89 * local44 + (local38 - local44) * local66) / local38;
		}
		arg0.anInt4614 = 0;
		if (arg0.anInt4649 == 0) {
			arg0.anInt4618 = 1024;
		}
		if (arg0.anInt4649 == 1) {
			arg0.anInt4618 = 1536;
		}
		if (arg0.anInt4649 == 2) {
			arg0.anInt4618 = 0;
		}
		if (arg0.anInt4649 == 3) {
			arg0.anInt4618 = 512;
		}
		arg0.anInt4681 = arg0.anInt4618;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method3828(@OriginalArg(0) String arg0) {
		for (@Pc(15) int local15 = 0; local15 < Static53.aStringArray57.length; local15++) {
			if (Static53.aStringArray57[local15].equalsIgnoreCase(arg0)) {
				return local15;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V")
	public static void method3829() {
		Static241.anInt4772++;
	}
}
