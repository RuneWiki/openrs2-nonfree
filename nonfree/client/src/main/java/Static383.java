import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!wk", name = "o", descriptor = "Lclient!d;")
	public static Class42 aClass42_1;

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_102 = new Class32("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIILclient!mm;IZ)V")
	public static void method5611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub29 arg3, @OriginalArg(4) int arg4) {
		if (arg3.anInt3905 == -1 && arg3.anIntArray770 == null) {
			return;
		}
		@Pc(13) int local13 = 0;
		if (arg3.anInt3896 < arg4) {
			local13 = arg4 - arg3.anInt3896;
		} else if (arg4 < arg3.anInt3899) {
			local13 = arg3.anInt3899 - arg4;
		}
		@Pc(45) int local45 = Static330.anInt5659 * arg3.anInt3898 >> 8;
		if (arg3.anInt3904 < arg1) {
			local13 += arg1 - arg3.anInt3904;
		} else if (arg1 < arg3.anInt3900) {
			local13 += arg3.anInt3900 - arg1;
		}
		if (arg3.anInt3902 == 0 || local13 - 64 > arg3.anInt3902 || Static330.anInt5659 == 0 || arg0 != arg3.anInt3893) {
			if (arg3.aClass2_Sub2_Sub2_3 != null) {
				Static324.aClass2_Sub2_Sub1_2.method58(arg3.aClass2_Sub2_Sub2_3);
				arg3.aClass2_Sub2_Sub2_3 = null;
			}
			if (arg3.aClass2_Sub2_Sub2_2 != null) {
				Static324.aClass2_Sub2_Sub1_2.method58(arg3.aClass2_Sub2_Sub2_2);
				arg3.aClass2_Sub2_Sub2_2 = null;
			}
			return;
		}
		local13 -= 64;
		if (local13 < 0) {
			local13 = 0;
		}
		@Pc(137) int local137 = local45 * (arg3.anInt3902 - local13) / arg3.anInt3902;
		if (arg3.aClass2_Sub2_Sub2_3 != null) {
			arg3.aClass2_Sub2_Sub2_3.method3412(local137);
		} else if (arg3.anInt3905 >= 0) {
			@Pc(157) Class130 local157 = Static400.method3010(Static329.aClass171_85, arg3.anInt3905, 0);
			if (local157 != null) {
				@Pc(164) Class2_Sub15_Sub1 local164 = local157.method3009().method4338(Static123.aClass223_1);
				@Pc(169) Class2_Sub2_Sub2 local169 = Static402.method3420(local164, local137);
				local169.method3419(-1);
				Static324.aClass2_Sub2_Sub1_2.method59(local169);
				arg3.aClass2_Sub2_Sub2_3 = local169;
			}
		}
		if (arg3.aClass2_Sub2_Sub2_2 != null) {
			arg3.aClass2_Sub2_Sub2_2.method3412(local137);
			if (arg3.aClass2_Sub2_Sub2_2.method5618()) {
				return;
			}
			arg3.aClass2_Sub2_Sub2_2 = null;
		} else if (arg3.anIntArray770 != null && (arg3.anInt3906 -= arg2) <= 0) {
			@Pc(200) int local200 = (int) ((double) arg3.anIntArray770.length * Math.random());
			@Pc(208) Class130 local208 = Static400.method3010(Static329.aClass171_85, arg3.anIntArray770[local200], 0);
			if (local208 != null) {
				@Pc(215) Class2_Sub15_Sub1 local215 = local208.method3009().method4338(Static123.aClass223_1);
				@Pc(220) Class2_Sub2_Sub2 local220 = Static402.method3420(local215, local137);
				local220.method3419(0);
				Static324.aClass2_Sub2_Sub1_2.method59(local220);
				arg3.anInt3906 = arg3.anInt3894 + (int) ((double) (arg3.anInt3907 - arg3.anInt3894) * Math.random());
				arg3.aClass2_Sub2_Sub2_2 = local220;
				return;
			}
		}
	}
}
