import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!cn", name = "C", descriptor = "Lclient!aj;")
	public static Class15 aClass15_24;

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(III)Z")
	public static boolean method1578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static259.method4252(arg0, arg1) | Static450.method6576(arg1, arg0) | Static623.method8760(arg1, arg0)) & Static189.method5093(arg0, arg1);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ZIIILclient!aj;B)V")
	public static void method1579(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class15 arg2) {
		Static262.method4286(arg2, arg1, arg0, 0L);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IZLjava/lang/String;Z)I")
	public static int method1580(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		@Pc(31) int local31 = 0;
		@Pc(34) int local34 = arg1.length();
		for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
			@Pc(41) char local41 = arg1.charAt(local36);
			if (local36 == 0) {
				if (local41 == '-') {
					local22 = true;
					continue;
				}
				if (local41 == '+') {
					continue;
				}
			}
			@Pc(66) int local66;
			if (local41 >= '0' && local41 <= '9') {
				local66 = local41 - '0';
			} else if (local41 >= 'A' && local41 <= 'Z') {
				local66 = local41 - '7';
			} else if (local41 >= 'a' && local41 <= 'z') {
				local66 = local41 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local66 >= arg0) {
				throw new NumberFormatException();
			}
			if (local22) {
				local66 = -local66;
			}
			@Pc(114) int local114 = local66 + arg0 * local31;
			if (local31 != local114 / arg0) {
				throw new NumberFormatException();
			}
			local31 = local114;
			local24 = true;
		}
		if (!local24) {
			throw new NumberFormatException();
		}
		return local31;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(JI)V")
	public static void method1581(@OriginalArg(0) long arg0) {
		@Pc(7) int local7 = Static294.anInt6316;
		@Pc(9) int local9 = Static96.anInt1798;
		@Pc(24) int local24;
		@Pc(32) int local32;
		if (Static474.anInt7824 != local7) {
			local24 = local7 - Static474.anInt7824;
			local32 = (int) (arg0 * (long) local24 / 320L);
			if (local24 > 0) {
				if (local32 == 0) {
					local32 = 1;
				} else if (local24 < local32) {
					local32 = local24;
				}
			} else if (local32 == 0) {
				local32 = -1;
			} else if (local32 < local24) {
				local32 = local24;
			}
			Static474.anInt7824 += local32;
		}
		Static618.aFloat207 += (float) arg0 * Static667.aFloat213 / 40.0F * 8.0F;
		Static667.aFloat212 += (float) arg0 * Static577.aFloat226 / 40.0F * 8.0F;
		if (local9 != Static350.anInt5703) {
			local24 = local9 - Static350.anInt5703;
			local32 = (int) ((long) local24 * arg0 / 320L);
			if (local24 <= 0) {
				if (local32 == 0) {
					local32 = -1;
				} else if (local24 > local32) {
					local32 = local24;
				}
			} else if (local32 == 0) {
				local32 = 1;
			} else if (local32 > local24) {
				local32 = local24;
			}
			Static350.anInt5703 += local32;
		}
		Static58.method1275();
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIZ)Z")
	public static boolean method1583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10000) != 0;
	}
}
