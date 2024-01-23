import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "i", descriptor = "Lclient!gi;")
	public static Class61 aClass61_1;

	@OriginalMember(owner = "client!a", name = "c", descriptor = "[I")
	public static int[] anIntArray1 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!a", name = "n", descriptor = "[I")
	public static int[] anIntArray2 = new int[4];

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!jd;III)Lclient!hk;")
	public static Class71_Sub1 method5(@OriginalArg(0) Class84 arg0, @OriginalArg(2) int arg1) {
		return Static288.method4789(0, arg1, arg0) ? Static83.method1595() : null;
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(I)V")
	public static void method6() {
		Static2.aClass2_Sub5_Sub3_4.method2758();
		Static101.aClass84_127 = null;
		Static131.anInt2692 = 1;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ZLjava/lang/String;II)Z")
	public static boolean method7(@OriginalArg(1) String arg0) {
		@Pc(27) boolean local27 = false;
		@Pc(29) int local29 = 0;
		@Pc(31) boolean local31 = false;
		@Pc(34) int local34 = arg0.length();
		for (@Pc(42) int local42 = 0; local42 < local34; local42++) {
			@Pc(53) char local53 = arg0.charAt(local42);
			if (local42 == 0) {
				if (local53 == '-') {
					local27 = true;
					continue;
				}
				if (local53 == '+') {
					continue;
				}
			}
			@Pc(90) int local90;
			if (local53 >= '0' && local53 <= '9') {
				local90 = local53 - '0';
			} else if (local53 >= 'A' && local53 <= 'Z') {
				local90 = local53 - '7';
			} else if (local53 >= 'a' && local53 <= 'z') {
				local90 = local53 - 'W';
			} else {
				return false;
			}
			if (local90 >= 10) {
				return false;
			}
			if (local27) {
				local90 = -local90;
			}
			@Pc(128) int local128 = local90 + local29 * 10;
			if (local29 != local128 / 10) {
				return false;
			}
			local31 = true;
			local29 = local128;
		}
		return local31;
	}
}
