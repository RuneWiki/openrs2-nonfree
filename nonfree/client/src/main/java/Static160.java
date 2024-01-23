import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "[Lclient!uj;")
	public static Class79[] aClass79Array6;

	@OriginalMember(owner = "client!ph", name = "i", descriptor = "Lclient!ba;")
	public static Class10 aClass10_1;

	@OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
	public static int anInt3702;

	@OriginalMember(owner = "client!ph", name = "s", descriptor = "[[I")
	public static int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!ph", name = "u", descriptor = "J")
	public static long aLong139;

	@OriginalMember(owner = "client!ph", name = "v", descriptor = "B")
	public static byte aByte16;

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "Z")
	public static boolean aBoolean160 = false;

	@OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
	public static int anInt3697 = 0;

	@OriginalMember(owner = "client!ph", name = "k", descriptor = "[I")
	public static int[] anIntArray615 = new int[5];

	@OriginalMember(owner = "client!ph", name = "m", descriptor = "Lclient!qe;")
	public static Class78 aClass78_655 = Static199.method3560(" <col=ffffff>");

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIII)V")
	public static void method2881(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 <= arg2) {
			Static221.method3893(arg3, arg1, Static183.anIntArrayArray40[arg0], arg2);
		} else {
			Static221.method3893(arg3, arg2, Static183.anIntArrayArray40[arg0], arg1);
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)I")
	public static int method2882(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
	public static void method2883() {
		if (Static55.aClass64_4 != null || Static227.aClass64_17 != null) {
			return;
		}
		@Pc(20) int local20 = Static122.anInt1735;
		@Pc(31) int local31;
		@Pc(86) int local86;
		if (Static202.aBoolean194) {
			@Pc(29) int local29;
			if (local20 != 1) {
				local29 = Static44.anInt806;
				local31 = Static81.anInt1744;
				if (Static100.anInt2201 - 10 > local29 || local29 > Static224.anInt4847 + Static100.anInt2201 + 10 || Static189.anInt4406 - 10 > local31 || Static189.anInt4406 + Static207.anInt4608 + 10 < local31) {
					Static202.aBoolean194 = false;
					Static169.method3108(Static100.anInt2201, Static189.anInt4406, Static224.anInt4847, Static207.anInt4608);
				}
			}
			if (local20 == 1) {
				local29 = Static100.anInt2201;
				local31 = Static189.anInt4406;
				local86 = Static224.anInt4847;
				@Pc(88) int local88 = Static205.anInt740;
				@Pc(90) int local90 = -1;
				@Pc(92) int local92 = Static55.anInt981;
				for (@Pc(94) int local94 = 0; local94 < Static138.anInt3182; local94++) {
					@Pc(109) int local109 = (Static138.anInt3182 - local94 - 1) * 15 + local31 + 31;
					if (local29 < local88 && local29 + local86 > local88 && local92 > local109 - 13 && local92 < local109 + 3) {
						local90 = local94;
					}
				}
				if (local90 != -1) {
					Static70.method2260(local90);
				}
				Static202.aBoolean194 = false;
				Static169.method3108(Static100.anInt2201, Static189.anInt4406, Static224.anInt4847, Static207.anInt4608);
				return;
			}
			return;
		}
		if (local20 == 1 && Static138.anInt3182 > 0) {
			@Pc(177) short local177 = Static79.aShortArray53[Static138.anInt3182 - 1];
			if (local177 == 42 || local177 == 18 || local177 == 50 || local177 == 45 || local177 == 43 || local177 == 24 || local177 == 28 || local177 == 1 || local177 == 39 || local177 == 19 || local177 == 46 || local177 == 1003) {
				local31 = Static117.anIntArray450[Static138.anInt3182 - 1];
				local86 = Static120.anIntArray460[Static138.anInt3182 - 1];
				@Pc(239) Class64 local239 = Static204.method3618(local86);
				if (Static75.method1252(Static36.method473(local239)) || Static64.method1035(Static36.method473(local239))) {
					Static198.aBoolean193 = false;
					Static181.anInt4196 = 0;
					if (Static55.aClass64_4 != null) {
						Static70.method2259(Static55.aClass64_4);
					}
					Static55.aClass64_4 = Static204.method3618(local86);
					Static10.anInt309 = Static55.anInt981;
					Static67.anInt931 = local31;
					Static49.anInt904 = Static205.anInt740;
					Static70.method2259(Static55.aClass64_4);
					return;
				}
			}
		}
		if (local20 == 1 && (Static152.anInt3472 == 1 && Static138.anInt3182 > 2 || Static97.method1688(Static138.anInt3182 - 1))) {
			local20 = 2;
		}
		if (local20 == 1 && Static138.anInt3182 > 0) {
			Static70.method2260(Static138.anInt3182 - 1);
		}
		if (local20 != 2 || Static138.anInt3182 <= 0) {
			return;
		}
		Static75.method1257();
	}
}
