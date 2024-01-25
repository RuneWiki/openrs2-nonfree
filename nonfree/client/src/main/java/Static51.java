import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!bka", name = "qb", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_18 = new Class397(0, -2);

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(IIIIII)V")
	public static void method1286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static45.anInt1294 = arg3;
		Static631.anInt9738 = arg4;
		Static453.anInt6956 = arg2;
		Static512.anInt10668 = arg0;
		Static183.anInt3174 = arg1;
		if (Static45.anInt1294 >= 100) {
			@Pc(22) int local22 = Static453.anInt6956 * 512 + 256;
			@Pc(28) int local28 = Static183.anInt3174 * 512 + 256;
			@Pc(36) int local36 = Static77.method1633(local28, local22, Static723.anInt11225) - Static512.anInt10668;
			@Pc(41) int local41 = local22 - Static305.anInt4908;
			@Pc(46) int local46 = local36 - Static490.anInt7687;
			@Pc(51) int local51 = local28 - Static263.anInt4101;
			@Pc(62) int local62 = (int) Math.sqrt((double) (local51 * local51 + local41 * local41));
			Static171.anInt8707 = (int) (Math.atan2((double) local46, (double) local62) * 2607.5945876176133D) & 0x3FFF;
			Static46.anInt1301 = (int) (Math.atan2((double) local41, (double) local51) * -2607.5945876176133D) & 0x3FFF;
			if (Static171.anInt8707 < 1024) {
				Static171.anInt8707 = 1024;
			}
			Static32.anInt1120 = 0;
			if (Static171.anInt8707 > 3072) {
				Static171.anInt8707 = 3072;
			}
		}
		Static262.anInt4081 = 2;
		Static358.anInt5640 = -1;
		Static494.anInt7853 = -1;
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(Ljava/lang/String;ZIIILjava/lang/String;Z)V")
	public static void method1292(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) boolean arg5) {
		Static137.aClass182_36.anInt4310 = 1;
		@Pc(11) String local11 = arg4.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = -1;
		@Pc(18) String local18 = null;
		if (arg3 != -1) {
			@Pc(28) Class303 local28 = Static583.aClass150_2.method3385(arg3);
			if (local28 == null || arg5 != local28.method6975()) {
				return;
			}
			if (local28.method6975()) {
				local18 = local28.aString101;
			} else {
				local16 = local28.anInt8150;
			}
		}
		@Pc(58) int local58 = 0;
		for (@Pc(60) int local60 = 0; local60 < Static606.aClass62_2.anInt2047; local60++) {
			@Pc(67) Class275 local67 = Static606.aClass62_2.method1887(local60);
			if ((!arg1 || local67.aBoolean491) && local67.anInt7228 == -1 && local67.anInt7247 == -1 && local67.anInt7270 == -1 && local67.anInt7259 == 0 && local67.aString94.toLowerCase().indexOf(local11) != -1) {
				if (arg3 != -1) {
					if (arg5) {
						if (!arg0.equals(local67.method6281(local18, arg3))) {
							continue;
						}
					} else if (local67.method6283(local16, arg3) != arg2) {
						continue;
					}
				}
				if (local58 >= 250) {
					Static685.anInt6067 = -1;
					Static721.aShortArray66 = null;
					return;
				}
				if (local58 >= local14.length) {
					@Pc(174) short[] local174 = new short[local14.length * 2];
					for (@Pc(176) int local176 = 0; local176 < local58; local176++) {
						local174[local176] = local14[local176];
					}
					local14 = local174;
				}
				local14[local58++] = (short) local60;
			}
		}
		Static721.aShortArray66 = local14;
		Static685.anInt6067 = local58;
		Static528.anInt8243 = 0;
		@Pc(224) String[] local224 = new String[Static685.anInt6067];
		for (@Pc(226) int local226 = 0; local226 < Static685.anInt6067; local226++) {
			local224[local226] = Static606.aClass62_2.method1887(local14[local226]).aString94;
		}
		Static727.method9603(local224, Static721.aShortArray66);
		Static137.aClass182_36.method3982();
		Static137.aClass182_36.anInt4310 = 2;
	}
}
