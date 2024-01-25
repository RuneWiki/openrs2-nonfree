import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!lj", name = "o", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_58 = new Class21("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

	@OriginalMember(owner = "client!lj", name = "s", descriptor = "Z")
	public static boolean aBoolean293 = false;

	@OriginalMember(owner = "client!lj", name = "F", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray20 = new String[100];

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(BIIIII)V")
	public static void method3838(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(13) int local13 = arg4 * arg4;
		@Pc(17) int local17 = arg3 * arg3;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg3 << 1;
		@Pc(46) int local46 = (1 - local29) * local13 + local21;
		@Pc(54) int local54 = local17 - local25 * (local29 - 1);
		@Pc(58) int local58 = local13 << 2;
		@Pc(62) int local62 = local17 << 2;
		@Pc(70) int local70 = local21 * 3;
		@Pc(78) int local78 = local25 * ((arg3 << 1) - 3);
		@Pc(84) int local84 = local62;
		@Pc(90) int local90 = local58 * (arg3 - 1);
		@Pc(112) int local112;
		@Pc(121) int local121;
		if (arg1 >= Static162.anInt1715 && arg1 <= Static55.anInt1319) {
			local112 = Static22.method360(Static418.anInt3023, Static176.anInt3462, arg4 + arg2);
			local121 = Static22.method360(Static418.anInt3023, Static176.anInt3462, arg2 - arg4);
			Static236.method3990(local112, local121, Static400.anIntArrayArray54[arg1], arg0);
		}
		while (local9 > 0) {
			if (local46 < 0) {
				while (local46 < 0) {
					local54 += local84;
					local46 += local70;
					local7++;
					local70 += local62;
					local84 += local62;
				}
			}
			if (local54 < 0) {
				local54 += local84;
				local46 += local70;
				local7++;
				local70 += local62;
				local84 += local62;
			}
			local54 += -local78;
			local46 += -local90;
			local90 -= local58;
			local9--;
			local78 -= local58;
			local112 = arg1 - local9;
			local121 = arg1 + local9;
			if (Static162.anInt1715 <= local121 && local112 <= Static55.anInt1319) {
				@Pc(217) int local217 = Static22.method360(Static418.anInt3023, Static176.anInt3462, arg2 + local7);
				@Pc(226) int local226 = Static22.method360(Static418.anInt3023, Static176.anInt3462, arg2 - local7);
				if (local112 >= Static162.anInt1715) {
					Static236.method3990(local217, local226, Static400.anIntArrayArray54[local112], arg0);
				}
				if (Static55.anInt1319 >= local121) {
					Static236.method3990(local217, local226, Static400.anIntArrayArray54[local121], arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public static String method3845(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
			local8 = local8.substring(0, local13) + "," + local8.substring(local13);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static449.aClass21_119.method362(Static168.anInt3290) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static315.aClass21_78.method362(Static168.anInt3290) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}
}
