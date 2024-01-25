import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!ke", name = "ib", descriptor = "Lclient!ah;")
	public static Class7 aClass7_1;

	@OriginalMember(owner = "client!ke", name = "cb", descriptor = "[C")
	public static final char[] aCharArray15 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!ke", name = "eb", descriptor = "I")
	public static int anInt3220 = 0;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZLclient!ra;Lclient!ra;)V")
	public static void method2974(@OriginalArg(1) Class170 arg0, @OriginalArg(2) Class170 arg1) {
		Static260.aClass170_121 = arg1;
		Static244.aClass170_85 = arg0;
	}

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "(I)I")
	public static int method2975() {
		return 15;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method2976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = arg3; local12 <= arg4; local12++) {
			for (@Pc(16) int local16 = arg0; local16 <= arg2; local16++) {
				if (Static123.anIntArrayArray16[local12][local16] == arg1 && Static193.anIntArrayArray31[local12][local16] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIII)Lclient!bo;")
	public static Class25_Sub1_Sub1 method2977(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class51 local11 = Static138.aClass51ArrayArrayArray1[arg0][arg2][arg1];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class25_Sub1_Sub1 local17 = null;
		@Pc(19) int local19 = -1;
		for (@Pc(28) Class103 local28 = local11.aClass103_1; local28 != null; local28 = local28.aClass103_2) {
			@Pc(32) Class25_Sub1 local32 = local28.aClass25_Sub1_1;
			if (local32 instanceof Class25_Sub1_Sub1) {
				@Pc(38) Class25_Sub1_Sub1 local38 = (Class25_Sub1_Sub1) local32;
				@Pc(48) int local48 = (local38.method4646() - 1) * 64 + 60;
				@Pc(56) int local56 = local38.anInt5769 - local48 >> 7;
				@Pc(64) int local64 = local38.anInt5773 - local48 >> 7;
				@Pc(71) int local71 = local48 + local38.anInt5769 >> 7;
				@Pc(79) int local79 = local38.anInt5773 + local48 >> 7;
				if (arg2 >= local56 && arg1 >= local64 && arg2 <= local71 && local79 >= arg1) {
					@Pc(108) int local108 = (local71 + 1 - arg2) * (local79 - (arg1 + -1));
					if (local19 < local108) {
						local19 = local108;
						local17 = local38;
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!bo;I)V")
	public static void method2978(@OriginalArg(0) Class25_Sub1_Sub1 arg0) {
		if (arg0 instanceof Class25_Sub1_Sub1_Sub2) {
			@Pc(11) Class25_Sub1_Sub1_Sub2 local11 = (Class25_Sub1_Sub1_Sub2) arg0;
			if (local11.aClass216_1 != null) {
				Static283.method4780(local11);
			}
		} else if (arg0 instanceof Class25_Sub1_Sub1_Sub1) {
			Static191.method5167((Class25_Sub1_Sub1_Sub1) arg0);
		} else {
			return;
		}
	}
}
