import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "F")
	public static float aFloat121;

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
	public static int anInt4907 = 0;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
	public static int anInt4910 = 104;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
	public static void method4450() {
		if (Static611.aClass283ArrayArray1 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < Static611.aClass283ArrayArray1.length; local12++) {
			for (@Pc(16) int local16 = 0; local16 < Static611.aClass283ArrayArray1[local12].length; local16++) {
				Static611.aClass283ArrayArray1[local12][local16] = Static39.aClass283_1;
			}
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
	public static void method4451() {
		Static670.anInt6250 = 0;
		@Pc(12) int local12 = Static315.anInt5380 + (Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9805 >> 9);
		@Pc(19) int local19 = (Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9803 >> 9) + Static290.anInt5128;
		if (local12 >= 3053 && local12 <= 3156 && local19 >= 3056 && local19 <= 3136) {
			Static670.anInt6250 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local19 >= 9492 && local19 <= 9535) {
			Static670.anInt6250 = 1;
		}
		if (Static670.anInt6250 == 1 && local12 >= 3139 && local12 <= 3199 && local19 >= 3008 && local19 <= 3062) {
			Static670.anInt6250 = 0;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)I")
	public static int method4452(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method4453(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}
}
