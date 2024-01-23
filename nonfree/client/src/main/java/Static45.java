import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!d", name = "l", descriptor = "Lclient!nm;")
	public static Class119 aClass119_15;

	@OriginalMember(owner = "client!d", name = "f", descriptor = "Lclient!jo;")
	public static Class96 aClass96_3 = new Class96();

	@OriginalMember(owner = "client!d", name = "h", descriptor = "Lclient!ui;")
	public static Class175 aClass175_9 = new Class175(20);

	@OriginalMember(owner = "client!d", name = "m", descriptor = "I")
	public static int anInt1043 = 0;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IC)Z")
	public static boolean method872(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(III)V")
	public static void method873(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class16 local3 = Static311.method4642(arg0);
		@Pc(10) int local10 = local3.anInt538;
		@Pc(20) int local20 = local3.anInt535;
		@Pc(23) int local23 = local3.anInt539;
		@Pc(29) int local29 = Class110.anIntArray296[local23 - local10];
		if (arg1 < 0 || arg1 > local29) {
			arg1 = 0;
		}
		local29 <<= local10;
		Static131.method2286(~local29 & Static193.anIntArray402[local20] | arg1 << local10 & local29, local20);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!nm;B)V")
	public static void method874(@OriginalArg(0) Class119 arg0) {
		Static76.aClass119_79 = arg0;
	}
}
