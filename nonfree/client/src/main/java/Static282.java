import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!sl", name = "B", descriptor = "I")
	public static int anInt3511;

	@OriginalMember(owner = "client!sl", name = "G", descriptor = "Lclient!lm;")
	public static Class134 aClass134_79;

	@OriginalMember(owner = "client!sl", name = "o", descriptor = "I")
	public static int anInt3502 = -1;

	@OriginalMember(owner = "client!sl", name = "v", descriptor = "[I")
	public static final int[] anIntArray339 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!sl", name = "x", descriptor = "[S")
	public static final short[] aShortArray55 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!sl", name = "z", descriptor = "Z")
	public static boolean aBoolean269 = false;

	@OriginalMember(owner = "client!sl", name = "E", descriptor = "I")
	public static int anInt3514 = 0;

	@OriginalMember(owner = "client!sl", name = "H", descriptor = "I")
	public static int anInt3516 = 0;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(CI)Z")
	public static boolean method2953(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(B)V")
	public static void method2955() {
		Static32.anInt565 = 0;
		Static62.anInt6674 = 0;
		Static59.method1139();
		Static238.method4329();
		Static217.method741();
		@Pc(29) int local29;
		for (@Pc(23) int local23 = 0; local23 < Static32.anInt565; local23++) {
			local29 = Static127.anIntArray259[local23];
			if (Static178.aClass10_Sub1_Sub2_Sub1Array1[local29].anInt4071 != anInt3516) {
				if (Static178.aClass10_Sub1_Sub2_Sub1Array1[local29].aClass60_1.method1272()) {
					Static60.method1145(Static178.aClass10_Sub1_Sub2_Sub1Array1[local29]);
				}
				Static178.aClass10_Sub1_Sub2_Sub1Array1[local29].method677(null);
				Static178.aClass10_Sub1_Sub2_Sub1Array1[local29] = null;
			}
		}
		if (Static237.anInt4904 != Static142.aClass1_Sub21_Sub2_1.anInt6611) {
			throw new RuntimeException("gnp1 pos:" + Static142.aClass1_Sub21_Sub2_1.anInt6611 + " psize:" + Static237.anInt4904);
		}
		for (local29 = 0; local29 < Static271.anInt5578; local29++) {
			if (Static178.aClass10_Sub1_Sub2_Sub1Array1[Static79.anIntArray672[local29]] == null) {
				throw new RuntimeException("gnp2 pos:" + local29 + " size:" + Static271.anInt5578);
			}
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIIII)V")
	public static void method2957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class46 local3 = new Class46();
		local3.anInt1319 = arg1 >> 7;
		local3.anInt1325 = arg2 >> 7;
		local3.anInt1331 = arg3 >> 7;
		local3.anInt1315 = arg4 >> 7;
		local3.anInt1322 = arg0;
		local3.anInt1329 = arg1;
		local3.anInt1328 = arg2;
		local3.anInt1326 = arg3;
		local3.anInt1334 = arg4;
		local3.anInt1330 = arg5;
		local3.anInt1317 = arg6;
		Static82.aClass46Array2[Static274.anInt5613++] = local3;
	}
}
