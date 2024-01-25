import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!uv", name = "m", descriptor = "I")
	public static int anInt7198;

	@OriginalMember(owner = "client!uv", name = "n", descriptor = "[I")
	public static int[] anIntArray460;

	@OriginalMember(owner = "client!uv", name = "o", descriptor = "Lclient!iv;")
	public static final Class113 aClass113_4 = new Class113("stellardawn", 1);

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(II)V")
	public static void method5823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class227 local7 = Static389.aClass227ArrayArrayArray3[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class227 local28 = Static389.aClass227ArrayArrayArray3[local9][arg0][arg1] = Static389.aClass227ArrayArrayArray3[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte82--;
				for (@Pc(40) Class114 local40 = local28.aClass114_2; local40 != null; local40 = local40.aClass114_1) {
					@Pc(44) Class1_Sub2 local44 = local40.aClass1_Sub2_1;
					if (local44.aShort108 == arg0 && local44.aShort107 == arg1) {
						local44.aByte101--;
					}
				}
			}
		}
		if (Static389.aClass227ArrayArrayArray3[0][arg0][arg1] == null) {
			Static389.aClass227ArrayArrayArray3[0][arg0][arg1] = new Class227(0, arg0, arg1);
			Static389.aClass227ArrayArrayArray3[0][arg0][arg1].aByte81 = 1;
		}
		Static389.aClass227ArrayArrayArray3[0][arg0][arg1].aClass227_1 = local7;
		Static389.aClass227ArrayArrayArray3[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(BIILclient!ga;)V")
	public static void method5827(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class82 arg2) {
		if (Static73.aBoolean88) {
			@Pc(21) Class32 local21 = Static116.anInt2044 == -1 ? null : Static70.aClass15_1.method323(Static116.anInt2044);
			if (Static54.method1060(arg2).method5456() && (Static385.anInt6504 & 0x20) != 0 && (local21 == null || arg2.method1961(local21.anInt813, Static116.anInt2044) != local21.anInt813)) {
				Static359.method5021(false, 58, arg2.anInt2208, true, Static296.aString56 + " -> " + arg2.aString34, arg2.anInt2200, Static336.anInt5620, Static320.aString12, 0L, arg2.anInt2209);
			}
			return;
		}
		@Pc(88) String local88;
		for (@Pc(81) int local81 = 9; local81 >= 5; local81--) {
			local88 = Static325.method4505(local81, arg2);
			if (local88 != null) {
				Static359.method5021(false, 1006, arg2.anInt2208, true, arg2.aString34, arg2.anInt2200, Static59.method1110(arg2, local81), local88, (long) (local81 + 1), arg2.anInt2209);
			}
		}
		local88 = Static363.method5076(arg2);
		if (local88 != null) {
			Static359.method5021(false, 10, arg2.anInt2208, true, arg2.aString34, arg2.anInt2200, arg2.anInt2268, local88, 0L, arg2.anInt2209);
		}
		for (@Pc(149) int local149 = 4; local149 >= 0; local149--) {
			@Pc(156) String local156 = Static325.method4505(local149, arg2);
			if (local156 != null) {
				Static359.method5021(false, 45, arg2.anInt2208, true, arg2.aString34, arg2.anInt2200, Static59.method1110(arg2, local149), local156, (long) (local149 + 1), arg2.anInt2209);
			}
		}
		if (!Static54.method1060(arg2).method5453()) {
			return;
		}
		if (arg2.aString30 == null) {
			Static359.method5021(false, 60, arg2.anInt2208, true, "", arg2.anInt2200, -1, Static393.aClass174_189.method4208(Static300.anInt5192), 0L, arg2.anInt2209);
		} else {
			Static359.method5021(false, 60, arg2.anInt2208, true, "", arg2.anInt2200, -1, arg2.aString30, 0L, arg2.anInt2209);
		}
	}
}
