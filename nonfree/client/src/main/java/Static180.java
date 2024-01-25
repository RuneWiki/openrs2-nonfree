import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!gl", name = "k", descriptor = "Lclient!cu;")
	public static Class60 aClass60_3;

	@OriginalMember(owner = "client!gl", name = "m", descriptor = "D")
	public static double aDouble9;

	@OriginalMember(owner = "client!gl", name = "o", descriptor = "I")
	public static int anInt4229;

	@OriginalMember(owner = "client!gl", name = "j", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_42 = new Class71(81, 0);

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "(B)V")
	public static void method3451() {
		@Pc(5) int local5 = 0;
		if (Static155.aClass8_Sub25_6.aClass36_Sub21_1.method6959() == 1) {
			local5 = 55;
		}
		if (Static155.aClass8_Sub25_6.aClass36_Sub17_1.method5459() == 0) {
			local5 |= 0x40;
		}
		Static262.method4599(local5);
		Static437.aClass199_3.method5345(local5);
		Static497.aClass258_21.method6643(local5);
		Static297.aClass338_1.method7853(local5);
		Static202.aClass333_2.method7819(local5);
		Static203.method3755(local5);
		Static247.method4479(local5);
		Static415.method6522(local5);
		Static232.method4295(local5);
		Static33.method1194();
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method3452(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local15 = Static418.method6566(arg0.charAt(local17)) + (local15 << 5) - local15;
		}
		return local15;
	}
}
