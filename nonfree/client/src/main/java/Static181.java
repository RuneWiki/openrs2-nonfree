import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!ni", name = "e", descriptor = "[S")
	public static short[] aShortArray23;

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(III)Lclient!v;")
	public static Class173 method1753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub11 local7 = Static127.aClass4_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt1054; local13++) {
			@Pc(22) Class173 local22 = local7.aClass173Array1[local13];
			if ((local22.aLong183 >> 29 & 0x3L) == 2L && local22.anInt5149 == arg1 && local22.anInt5157 == arg2) {
				Static121.method2052(local22);
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BIIII)V")
	public static void method1754(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static171.anInt3392 <= arg0 && arg0 <= Static141.anInt2889) {
			@Pc(11) int local11 = Static142.method2311(arg3, Static154.anInt3126, Static211.anInt4200);
			@Pc(17) int local17 = Static142.method2311(arg2, Static154.anInt3126, Static211.anInt4200);
			Static224.method3574(arg1, local11, arg0, local17);
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
	public static void method1755() {
		aShortArray23 = null;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)I")
	public static int method1756(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(3) int local3 = 0;
		@Pc(6) int local6 = arg2.length();
		@Pc(8) int local8 = 0;
		@Pc(15) int local15 = arg1.length();
		@Pc(17) char local17 = 0;
		@Pc(20) char local20 = 0;
		while (local3 - local17 < local6 || local8 - local20 < local15) {
			if (local3 - local17 >= local6) {
				return -1;
			}
			if (local15 <= local8 - local20) {
				return 1;
			}
			@Pc(63) char local63;
			if (local17 == '\u0000') {
				local63 = arg2.charAt(local3++);
			} else {
				local63 = local17;
			}
			@Pc(76) char local76;
			if (local20 == '\u0000') {
				local76 = arg1.charAt(local8++);
			} else {
				local76 = local20;
			}
			local17 = Static169.method2667(local63);
			local20 = Static169.method2667(local76);
			local63 = Static258.method3899(arg0, local63);
			local76 = Static258.method3899(arg0, local76);
			if (local63 != local76 && Character.toUpperCase(local63) != Character.toUpperCase(local76)) {
				local63 = Character.toLowerCase(local63);
				local76 = Character.toLowerCase(local76);
				if (local76 != local63) {
					return Static39.method4122(local63, arg0) - Static39.method4122(local76, arg0);
				}
			}
		}
		@Pc(144) int local144 = Math.min(local6, local15);
		@Pc(180) char local180;
		@Pc(146) int local146;
		for (local146 = 0; local146 < local144; local146++) {
			if (arg0 == 2) {
				local3 = local6 - local146 - 1;
				local8 = local15 - local146 - 1;
			} else {
				local8 = local146;
				local3 = local146;
			}
			@Pc(176) char local176 = arg2.charAt(local3);
			local180 = arg1.charAt(local8);
			if (local180 != local176 && Character.toUpperCase(local176) != Character.toUpperCase(local180)) {
				local176 = Character.toLowerCase(local176);
				local180 = Character.toLowerCase(local180);
				if (local176 != local180) {
					return Static39.method4122(local176, arg0) - Static39.method4122(local180, arg0);
				}
			}
		}
		local146 = local6 - local15;
		if (local146 != 0) {
			return local146;
		}
		for (@Pc(233) int local233 = 0; local233 < local144; local233++) {
			local180 = arg2.charAt(local233);
			@Pc(244) char local244 = arg1.charAt(local233);
			if (local244 != local180) {
				return Static39.method4122(local180, arg0) - Static39.method4122(local244, arg0);
			}
		}
		return 0;
	}
}
