import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!id", name = "i", descriptor = "I")
	public static int anInt4238 = 0;

	@OriginalMember(owner = "client!id", name = "k", descriptor = "Lclient!ee;")
	public static final Class74 aClass74_3 = new Class74();

	@OriginalMember(owner = "client!id", name = "o", descriptor = "[I")
	public static final int[] anIntArray323 = new int[1000];

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)I")
	public static int method3716(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(6) int local6 = arg2.length();
		@Pc(9) int local9 = arg0.length();
		@Pc(16) int local16 = 0;
		@Pc(18) int local18 = 0;
		@Pc(20) char local20 = 0;
		@Pc(22) char local22 = 0;
		while (local16 - local20 < local6 || local9 > local18 - local22) {
			if (local16 - local20 >= local6) {
				return -1;
			}
			if (local9 <= local18 - local22) {
				return 1;
			}
			@Pc(66) char local66;
			if (local20 == '\u0000') {
				local66 = arg2.charAt(local16++);
			} else {
				local66 = local20;
			}
			@Pc(84) char local84;
			if (local22 == '\u0000') {
				local84 = arg0.charAt(local18++);
			} else {
				local84 = local22;
			}
			local20 = Static36.method1330(local66);
			local22 = Static36.method1330(local84);
			local66 = Static465.method6811(local66, arg1);
			local84 = Static465.method6811(local84, arg1);
			if (local66 != local84 && Character.toUpperCase(local66) != Character.toUpperCase(local84)) {
				local66 = Character.toLowerCase(local66);
				local84 = Character.toLowerCase(local84);
				if (local84 != local66) {
					return Static197.method3656(local66, arg1) - Static197.method3656(local84, arg1);
				}
			}
		}
		@Pc(143) int local143 = Math.min(local6, local9);
		for (@Pc(145) int local145 = 0; local145 < local143; local145++) {
			if (arg1 == 2) {
				local18 = local9 - local145 - 1;
				local16 = local6 - local145 - 1;
			} else {
				local18 = local145;
				local16 = local145;
			}
			@Pc(172) char local172 = arg2.charAt(local16);
			@Pc(176) char local176 = arg0.charAt(local18);
			if (local176 != local172 && Character.toUpperCase(local172) != Character.toUpperCase(local176)) {
				local172 = Character.toLowerCase(local172);
				local176 = Character.toLowerCase(local176);
				if (local172 != local176) {
					return Static197.method3656(local172, arg1) - Static197.method3656(local176, arg1);
				}
			}
		}
		@Pc(220) int local220 = local6 - local9;
		if (local220 != 0) {
			return local220;
		}
		for (@Pc(229) int local229 = 0; local229 < local143; local229++) {
			@Pc(234) char local234 = arg2.charAt(local229);
			@Pc(238) char local238 = arg0.charAt(local229);
			if (local238 != local234) {
				return Static197.method3656(local234, arg1) - Static197.method3656(local238, arg1);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!gw;B)V")
	public static void method3718(@OriginalArg(0) Class1_Sub13 arg0) {
		for (@Pc(1) int local1 = 0; local1 < Static265.anInt5151; local1++) {
			@Pc(6) int local6 = arg0.method3066();
			@Pc(10) int local10 = arg0.method3056();
			if (local10 == 65535) {
				local10 = -1;
			}
			if (Static437.aClass50_Sub1Array1[local6] != null) {
				Static437.aClass50_Sub1Array1[local6].anInt1981 = local10;
			}
		}
	}
}
