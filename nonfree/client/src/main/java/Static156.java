import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!fl", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString36;

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "Lclient!cr;")
	public static Class63 aClass63_2 = null;

	@OriginalMember(owner = "client!fl", name = "l", descriptor = "Lclient!eda;")
	public static final Class87 aClass87_85 = new Class87(8);

	@OriginalMember(owner = "client!fl", name = "p", descriptor = "[Lclient!li;")
	public static Class214[] aClass214Array1 = null;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)V")
	public static void method2257() {
		@Pc(13) Class87 local13 = Static213.aClass87_107;
		synchronized (Static213.aClass87_107) {
			Static213.aClass87_107.method1793(5);
		}
		local13 = Static163.aClass87_242;
		synchronized (Static163.aClass87_242) {
			Static163.aClass87_242.method1793(5);
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method2258(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local14 > local11 && Static185.method2798(arg0.charAt(local11))) {
			local11++;
		}
		while (local14 > local11 && Static185.method2798(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(55) int local55 = local14 - local11;
		if (local55 < 1 || local55 > 12) {
			return null;
		}
		@Pc(68) StringBuffer local68 = new StringBuffer(local55);
		for (@Pc(70) int local70 = local11; local70 < local14; local70++) {
			@Pc(76) char local76 = arg0.charAt(local70);
			if (Static553.method8061(local76)) {
				@Pc(84) char local84 = Static52.method903(local76);
				if (local84 != '\u0000') {
					local68.append(local84);
				}
			}
		}
		if (local68.length() == 0) {
			return null;
		} else {
			return local68.toString();
		}
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(III)I")
	public static int method2259(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local7 *= arg0;
			}
			arg1 >>= 0x1;
			arg0 *= arg0;
		}
		if (arg1 == 1) {
			return arg0 * local7;
		} else {
			return local7;
		}
	}
}
