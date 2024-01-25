import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!da", name = "r", descriptor = "F")
	public static float aFloat10;

	@OriginalMember(owner = "client!da", name = "v", descriptor = "[I")
	public static int[] anIntArray85;

	@OriginalMember(owner = "client!da", name = "x", descriptor = "Lclient!gr;")
	public static Class99 aClass99_1;

	@OriginalMember(owner = "client!da", name = "o", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_23 = new Class231("Cancel", "Abbrechen", "Annuler", "Cancelar");

	@OriginalMember(owner = "client!da", name = "t", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_15 = new Class208(59, 16);

	@OriginalMember(owner = "client!da", name = "w", descriptor = "[Lclient!hg;")
	public static final Class109[] aClass109Array1 = new Class109[14];

	@OriginalMember(owner = "client!da", name = "y", descriptor = "I")
	public static final int anInt1149 = 1338;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
	public static void method1048() {
		Static164.method2403(Static57.aClass208_14);
		Static389.aClass2_Sub17_Sub1_2.method6130(Static51.anInt840);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(JIZII)Ljava/lang/String;")
	public static String method1050(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(12) char local12 = ',';
		@Pc(14) char local14 = '.';
		if (arg1 == 0) {
			local14 = ',';
			local12 = '.';
		}
		if (arg1 == 2) {
			local14 = ' ';
		}
		@Pc(29) boolean local29 = false;
		if (arg0 < 0L) {
			local29 = true;
			arg0 = -arg0;
		}
		@Pc(45) StringBuffer local45 = new StringBuffer(26);
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (arg3 > 0) {
			for (local49 = 0; local49 < arg3; local49++) {
				local54 = (int) arg0;
				arg0 /= 10L;
				local45.append((char) (local54 + 48 - (int) arg0 * 10));
			}
			local45.append(local12);
		}
		local49 = 0;
		while (true) {
			local54 = (int) arg0;
			arg0 /= 10L;
			local45.append((char) (local54 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local29) {
					local45.append('-');
				}
				return local45.reverse().toString();
			}
			if (arg2) {
				local49++;
				if (local49 % 3 == 0) {
					local45.append(local14);
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;BC)I")
	public static int method1051(@OriginalArg(0) String arg0, @OriginalArg(2) char arg1) {
		@Pc(12) int local12 = 0;
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			if (arg1 == arg0.charAt(local17)) {
				local12++;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IBIIII)V")
	public static void method1052(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(13) int local13 = arg4 * arg4;
		@Pc(17) int local17 = arg0 * arg0;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(33) int local33 = arg0 << 1;
		@Pc(43) int local43 = local13 * (1 - local33) + local21;
		@Pc(52) int local52 = local17 - local25 * (local33 - 1);
		@Pc(56) int local56 = local13 << 2;
		@Pc(60) int local60 = local17 << 2;
		@Pc(68) int local68 = local21 * 3;
		@Pc(76) int local76 = local25 * ((arg0 << 1) - 3);
		@Pc(82) int local82 = local60;
		@Pc(97) int local97;
		@Pc(106) int local106;
		if (arg1 >= Static118.anInt2005 && Static123.anInt2069 >= arg1) {
			local97 = Static301.method3387(Static385.anInt6686, Static347.anInt6160, arg2 + arg4);
			local106 = Static301.method3387(Static385.anInt6686, Static347.anInt6160, arg2 - arg4);
			Static215.method3035(local106, local97, Static46.anIntArrayArray24[arg1], arg3);
		}
		@Pc(120) int local120 = (arg0 - 1) * local56;
		while (local9 > 0) {
			if (local43 < 0) {
				while (local43 < 0) {
					local52 += local82;
					local43 += local68;
					local7++;
					local82 += local60;
					local68 += local60;
				}
			}
			if (local52 < 0) {
				local52 += local82;
				local43 += local68;
				local68 += local60;
				local7++;
				local82 += local60;
			}
			local52 += -local76;
			local43 += -local120;
			local9--;
			local76 -= local56;
			local120 -= local56;
			local97 = arg1 - local9;
			local106 = arg1 + local9;
			if (local106 >= Static118.anInt2005 && local97 <= Static123.anInt2069) {
				@Pc(218) int local218 = Static301.method3387(Static385.anInt6686, Static347.anInt6160, arg2 + local7);
				@Pc(227) int local227 = Static301.method3387(Static385.anInt6686, Static347.anInt6160, arg2 - local7);
				if (Static118.anInt2005 <= local97) {
					Static215.method3035(local227, local218, Static46.anIntArrayArray24[local97], arg3);
				}
				if (Static123.anInt2069 >= local106) {
					Static215.method3035(local227, local218, Static46.anIntArrayArray24[local106], arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
	public static void method1053(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		Static25.anInt7276 = 1;
		Static199.anInt3422 = -1;
		Static192.method2760(arg0, arg1);
	}
}
