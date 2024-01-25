import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!le", name = "K", descriptor = "[Lclient!vn;")
	public static Class242[] aClass242Array1;

	@OriginalMember(owner = "client!le", name = "M", descriptor = "[Lclient!aq;")
	public static Class5[] aClass5Array10;

	@OriginalMember(owner = "client!le", name = "O", descriptor = "I")
	public static int anInt3591 = 0;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZI)V")
	public static void method3283(@OriginalArg(1) int arg0) {
		Static150.anInt2708 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)I")
	public static int method3284(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg1.length();
		@Pc(11) int local11 = arg0.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local13 - local17 < local8 || local11 > local15 - local19) {
			if (local13 - local17 >= local8) {
				return -1;
			}
			if (local15 - local19 >= local11) {
				return 1;
			}
			@Pc(54) char local54;
			if (local17 == '\u0000') {
				local54 = arg1.charAt(local13++);
			} else {
				local54 = local17;
			}
			@Pc(73) char local73;
			if (local19 == '\u0000') {
				local73 = arg0.charAt(local15++);
			} else {
				local73 = local19;
			}
			local17 = Static297.method5189(local54);
			local19 = Static297.method5189(local73);
			local54 = Static355.method5387(local54, arg2);
			local73 = Static355.method5387(local73, arg2);
			if (local73 != local54 && Character.toUpperCase(local54) != Character.toUpperCase(local73)) {
				local54 = Character.toLowerCase(local54);
				local73 = Character.toLowerCase(local73);
				if (local54 != local73) {
					return Static387.method5196(arg2, local54) - Static387.method5196(arg2, local73);
				}
			}
		}
		@Pc(135) int local135 = Math.min(local8, local11);
		for (@Pc(137) int local137 = 0; local137 < local135; local137++) {
			if (arg2 == 2) {
				local13 = local8 - local137 - 1;
				local15 = local11 - local137 - 1;
			} else {
				local15 = local137;
				local13 = local137;
			}
			@Pc(165) char local165 = arg1.charAt(local13);
			@Pc(169) char local169 = arg0.charAt(local15);
			if (local169 != local165 && Character.toUpperCase(local165) != Character.toUpperCase(local169)) {
				local165 = Character.toLowerCase(local165);
				local169 = Character.toLowerCase(local169);
				if (local169 != local165) {
					return Static387.method5196(arg2, local165) - Static387.method5196(arg2, local169);
				}
			}
		}
		@Pc(222) int local222 = local8 - local11;
		if (local222 != 0) {
			return local222;
		}
		for (@Pc(231) int local231 = 0; local231 < local135; local231++) {
			@Pc(237) char local237 = arg1.charAt(local231);
			@Pc(241) char local241 = arg0.charAt(local231);
			if (local241 != local237) {
				return Static387.method5196(arg2, local237) - Static387.method5196(arg2, local241);
			}
		}
		return 0;
	}
}
