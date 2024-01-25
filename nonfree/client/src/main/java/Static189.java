import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!hba", name = "e", descriptor = "Z")
	public static boolean aBoolean295 = false;

	@OriginalMember(owner = "client!hba", name = "g", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_44 = new Class316(16, 16);

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(Z)V")
	public static void method3216() {
		Static67.anInt1146 = 0;
		@Pc(13) int local13 = (Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8911 >> 9) + Static150.anInt2792;
		@Pc(27) int local27 = (Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8913 >> 9) + Static154.anInt2878;
		if (local13 >= 3053 && local13 <= 3156 && local27 >= 3056 && local27 <= 3136) {
			Static67.anInt1146 = 1;
		}
		if (local13 >= 3072 && local13 <= 3118 && local27 >= 9492 && local27 <= 9535) {
			Static67.anInt1146 = 1;
		}
		if (Static67.anInt1146 == 1 && local13 >= 3139 && local13 <= 3199 && local27 >= 3008 && local27 <= 3062) {
			Static67.anInt1146 = 0;
		}
	}

	@OriginalMember(owner = "client!hba", name = "b", descriptor = "(Z)V")
	public static void method3217() {
		Static141.anInt2738 = Static479.aClass202_13.anInt6135 + Static479.aClass202_13.anInt6139 + 2;
		Static415.aStringArray33 = new String[500];
		Static362.anInt6648 = Static166.aClass202_9.anInt6139 + Static166.aClass202_9.anInt6135 + 2;
		for (@Pc(30) int local30 = 0; local30 < Static415.aStringArray33.length; local30++) {
			Static415.aStringArray33[local30] = "";
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lclient!tc;I)V")
	public static void method3218(@OriginalArg(0) Class301 arg0) {
		Static204.aClass301_1 = arg0;
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(III)Z")
	public static boolean method3219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(II)V")
	public static void method3220(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub5_Sub8 local8 = Static49.method760(1, arg0);
		local8.method3257();
	}
}
