import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!bi", name = "t", descriptor = "J")
	public static long aLong23;

	@OriginalMember(owner = "client!bi", name = "o", descriptor = "Lclient!el;")
	public static final Class109 aClass109_24 = new Class109(12, -2);

	@OriginalMember(owner = "client!bi", name = "q", descriptor = "Lclient!dv;")
	public static final Class96 aClass96_3 = new Class96(2, 4, 4, 0);

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)V")
	public static void method752(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class5_Sub5_Sub6 local11 = Static478.method6972((long) arg0, 6);
		local11.method2687();
		local11.anInt3058 = arg1;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method754(@OriginalArg(1) String arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(12) int local12 = arg0.length();
		for (@Pc(21) int local21 = 0; local21 < local12; local21++) {
			@Pc(29) char local29 = arg0.charAt(local21);
			if (local29 == '%' && local12 > local21 + 2) {
				local29 = arg0.charAt(local21 + 1);
				@Pc(112) int local112;
				if (local29 >= '0' && local29 <= '9') {
					local112 = local29 - 48;
				} else if (local29 >= 'a' && local29 <= 'f') {
					local112 = local29 + '\n' - 97;
				} else {
					if (local29 < 'A' || local29 > 'F') {
						local9.append('%');
						continue;
					}
					local112 = local29 - 55;
				}
				local29 = arg0.charAt(local21 + 2);
				local112 *= 16;
				if (local29 >= '0' && local29 <= '9') {
					local112 += local29 - 48;
				} else if (local29 >= 'a' && local29 <= 'f') {
					local112 += local29 + '\n' - 97;
				} else {
					if (local29 < 'A' || local29 > 'F') {
						local9.append('%');
						continue;
					}
					local112 += local29 + '\n' - 65;
				}
				if (local112 != 0 && Static296.method9071((byte) local112)) {
					local9.append(Static101.method1448((byte) local112));
				}
				local21 += 2;
			} else if (local29 == '+') {
				local9.append(' ');
			} else {
				local9.append(local29);
			}
		}
		return local9.toString();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZIIIIII)V")
	public static void method755(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static70.anInt1127 = arg4;
		Static487.anInt8166 = arg2;
		Static612.anInt10117 = arg5;
		Static650.anInt2304 = arg1;
		Static576.anInt9663 = arg3;
		if (arg0 && Static612.anInt10117 >= 100) {
			Static532.anInt9189 = Static576.anInt9663 * 512 + 256;
			Static489.anInt8202 = Static650.anInt2304 * 512 + 256;
			Static132.anInt2186 = Static380.method5559(Static532.anInt9189, Static240.anInt3974, Static489.anInt8202, 0) - Static70.anInt1127;
		}
		Static272.anInt4763 = -1;
		Static651.anInt10529 = -1;
		Static79.anInt1216 = 2;
	}
}
