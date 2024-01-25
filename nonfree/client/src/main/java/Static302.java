import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_78 = new Class57("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "I")
	public static int anInt5239 = -1;

	@OriginalMember(owner = "client!rn", name = "o", descriptor = "I")
	public static int anInt5248 = 0;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Z)V")
	public static void method4682() {
		Static155.aClass139_33.method3075();
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIIIIII)V")
	public static void method4683(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		@Pc(3) Class229[] local3 = Static323.aClass229Array1;
		for (@Pc(5) int local5 = 0; local5 < local3.length; local5++) {
			@Pc(20) Class229 local20 = local3[local5];
			if (local20 != null && local20.anInt5877 == 2) {
				Static219.method3671(local20.anInt5865 + (local20.anInt5868 - Static103.anInt2044 << 7), arg0 >> 1, arg2 >> 1, local20.anInt5866, local20.anInt5867 + (local20.anInt5872 - Static21.anInt265 << 7), local20.anInt5870 * 2);
				if (Static267.anIntArray621[0] > -1 && Static76.anInt1617 % 20 < 10) {
					Static161.aClass110Array7[local20.anInt5876].method5094(Static267.anIntArray621[0] + arg3 - 12, arg1 + -28 + Static267.anIntArray621[1]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZIIIB)V")
	public static void method4685(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static212.method3305(arg3)) {
			Static282.method4479(-1, arg2, arg1, Static375.aClass62ArrayArray2[arg3], arg0);
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIIIIZIIII)V")
	public static void method4687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		if (arg6 < 128 || arg5 < 128 || arg6 > Static12.anInt161 * 128 - 256 || arg5 > Static44.anInt787 * 128 - 256) {
			Static267.anIntArray621[0] = Static267.anIntArray621[1] = -1;
			return;
		}
		@Pc(50) int local50 = Static55.method1005(arg5, arg4, arg6) - arg3;
		Static19.aClass118_1.method2658(arg1, 0, 0);
		Static347.aClass155_9.method4904(Static19.aClass118_1);
		Static347.aClass155_9.method4910(arg6, local50, arg5, Static267.anIntArray621);
		Static19.aClass118_1.method2658(-arg1, 0, 0);
		Static347.aClass155_9.method4904(Static19.aClass118_1);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4688(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static351.anInt3266 >= 100 && !Static220.aBoolean317 || Static351.anInt3266 >= 200) {
			Static166.method5554(Static369.aClass57_95.method1122(Static66.anInt1307));
			return;
		}
		@Pc(29) String local29 = Static231.method3842(arg0);
		if (local29 == null) {
			return;
		}
		@Pc(72) String local72;
		for (@Pc(34) int local34 = 0; local34 < Static351.anInt3266; local34++) {
			@Pc(42) String local42 = Static231.method3842(Static244.aStringArray28[local34]);
			if (local42 != null && local42.equals(local29)) {
				Static166.method5554(arg0 + Static310.aClass57_79.method1122(Static66.anInt1307));
				return;
			}
			if (Static275.aStringArray33[local34] != null) {
				local72 = Static231.method3842(Static275.aStringArray33[local34]);
				if (local72 != null && local72.equals(local29)) {
					Static166.method5554(arg0 + Static310.aClass57_79.method1122(Static66.anInt1307));
					return;
				}
			}
		}
		for (@Pc(98) int local98 = 0; local98 < Static196.anInt5194; local98++) {
			local72 = Static231.method3842(Static152.aStringArray23[local98]);
			if (local72 != null && local72.equals(local29)) {
				Static166.method5554(Static232.aClass57_66.method1122(Static66.anInt1307) + arg0 + Static133.aClass57_45.method1122(Static66.anInt1307));
				return;
			}
			if (Static295.aStringArray36[local98] != null) {
				@Pc(141) String local141 = Static231.method3842(Static295.aStringArray36[local98]);
				if (local141 != null && local141.equals(local29)) {
					Static166.method5554(Static232.aClass57_66.method1122(Static66.anInt1307) + arg0 + Static133.aClass57_45.method1122(Static66.anInt1307));
					return;
				}
			}
		}
		if (Static231.method3842(Static226.aClass28_Sub1_Sub1_Sub2_2.aString51).equals(local29)) {
			Static166.method5554(Static179.aClass57_56.method1122(Static66.anInt1307));
		} else {
			Static229.method3783(Static249.aClass244_98);
			Static23.aClass3_Sub5_Sub1_1.method2791(Static269.method4260(arg0));
			Static23.aClass3_Sub5_Sub1_1.method2768(arg0);
		}
	}
}
