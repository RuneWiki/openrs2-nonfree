import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!oj", name = "L", descriptor = "Lclient!ju;")
	public static Class124 aClass124_11;

	@OriginalMember(owner = "client!oj", name = "P", descriptor = "[[B")
	public static byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!oj", name = "R", descriptor = "[[Lclient!ga;")
	public static Class82[][] aClass82ArrayArray2;

	@OriginalMember(owner = "client!oj", name = "M", descriptor = "I")
	public static int anInt5158 = 0;

	@OriginalMember(owner = "client!oj", name = "U", descriptor = "F")
	public static float aFloat85 = 0.25F;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IBIZ)Ljava/lang/String;")
	public static String method4258(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(37) int local37 = 2;
		for (@Pc(41) int local41 = arg0 / 10; local41 != 0; local41 /= 10) {
			local37++;
		}
		@Pc(53) char[] local53 = new char[local37];
		local53[0] = '+';
		for (@Pc(61) int local61 = local37 - 1; local61 > 0; local61--) {
			@Pc(65) int local65 = arg0;
			arg0 /= 10;
			@Pc(76) int local76 = local65 - arg0 * 10;
			if (local76 < 10) {
				local53[local61] = (char) (local76 + 48);
			} else {
				local53[local61] = (char) (local76 + 87);
			}
		}
		return new String(local53);
	}

	@OriginalMember(owner = "client!oj", name = "h", descriptor = "(I)V")
	public static void method4260() {
		Static119.anInt2103 = 0;
		@Pc(12) int local12 = Static59.anInt1127 + (Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7560 >> 7);
		@Pc(19) int local19 = (Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7557 >> 7) + Static49.anInt873;
		if (local12 >= 3053 && local12 <= 3156 && local19 >= 3056 && local19 <= 3136) {
			Static119.anInt2103 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local19 >= 9492 && local19 <= 9535) {
			Static119.anInt2103 = 1;
		}
		if (Static119.anInt2103 == 1 && local12 >= 3139 && local12 <= 3199 && local19 >= 3008 && local19 <= 3062) {
			Static119.anInt2103 = 0;
		}
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(B)V")
	public static void method4262() {
		if (Static148.aClass167_6 != null) {
			Static148.aClass167_6.method5958();
			Static148.aClass167_6 = null;
			Static434.aClass18_4 = null;
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)I")
	public static int method4263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static404.aShortArrayArray6 == null ? 0 : Static404.aShortArrayArray6[arg0][arg1] & 0xFFFF;
	}
}
