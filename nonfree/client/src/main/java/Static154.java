import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!kd", name = "q", descriptor = "I")
	public static int anInt3448;

	@OriginalMember(owner = "client!kd", name = "w", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray27;

	@OriginalMember(owner = "client!kd", name = "s", descriptor = "Lclient!ph;")
	public static final Class154 aClass154_55 = new Class154(64);

	@OriginalMember(owner = "client!kd", name = "u", descriptor = "[C")
	public static final char[] aCharArray4 = new char[128];

	@OriginalMember(owner = "client!kd", name = "F", descriptor = "I")
	public static int anInt3459 = 0;

	@OriginalMember(owner = "client!kd", name = "G", descriptor = "Z")
	public static boolean aBoolean287 = false;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
	public static void method2986() {
		Static189.aClass154_65.method4212();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)I")
	public static int method2989() {
		if (Static336.aBoolean578) {
			return 0;
		} else if (Static313.method5257()) {
			return Static336.aBoolean579 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIBIIIII)V")
	public static void method2990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg0 == arg7 && arg2 == arg4 && arg8 == arg6 && arg3 == arg5) {
			Static18.method363(arg1, arg5, arg0, arg8, arg4);
			return;
		}
		@Pc(40) int local40 = arg0;
		@Pc(42) int local42 = arg4;
		@Pc(46) int local46 = arg0 * 3;
		@Pc(50) int local50 = arg4 * 3;
		@Pc(54) int local54 = arg7 * 3;
		@Pc(58) int local58 = arg2 * 3;
		@Pc(62) int local62 = arg6 * 3;
		@Pc(66) int local66 = arg3 * 3;
		@Pc(75) int local75 = local54 + arg8 - local62 - arg0;
		@Pc(85) int local85 = local58 + arg5 - arg4 - local66;
		@Pc(96) int local96 = local62 + local46 - local54 - local54;
		@Pc(105) int local105 = local66 + local50 - local58 - local58;
		@Pc(109) int local109 = local54 - local46;
		@Pc(113) int local113 = local58 - local50;
		for (@Pc(115) int local115 = 128; local115 <= 4096; local115 += 128) {
			@Pc(123) int local123 = local115 * local115 >> 12;
			@Pc(129) int local129 = local123 * local115 >> 12;
			@Pc(133) int local133 = local75 * local129;
			@Pc(137) int local137 = local129 * local85;
			@Pc(141) int local141 = local123 * local96;
			@Pc(145) int local145 = local105 * local123;
			@Pc(149) int local149 = local115 * local109;
			@Pc(153) int local153 = local115 * local113;
			@Pc(163) int local163 = (local149 + local133 + local141 >> 12) + arg0;
			@Pc(173) int local173 = (local153 + local145 + local137 >> 12) + arg4;
			Static18.method363(arg1, local173, local40, local163, local42);
			local42 = local173;
			local40 = local163;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!fd;B)Z")
	public static boolean method2991(@OriginalArg(0) Class72 arg0) {
		if (arg0.anInt1804 == 205) {
			Static49.anInt1089 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(III)Z")
	public static boolean method2992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class56 local12 = Static320.method5290(arg0);
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local12.method1084(arg1);
	}
}
