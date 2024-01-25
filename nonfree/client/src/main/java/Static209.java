import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "J")
	public static long aLong145 = 0L;

	@OriginalMember(owner = "client!nm", name = "h", descriptor = "[I")
	public static final int[] anIntArray300 = new int[128];

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)V")
	public static void method3724() {
		Static263.aClass126_1.method5254();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static264.aLongArray5[local10] = 0L;
		}
		for (@Pc(28) int local28 = 0; local28 < 32; local28++) {
			Static253.aLongArray7[local28] = 0L;
		}
		Static45.anInt1176 = 0;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!ra;I)V")
	public static void method3726(@OriginalArg(0) Class170 arg0) {
		Static101.aClass170_45 = arg0;
		Static19.anInt542 = Static101.aClass170_45.method4575(19);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(CB)Z")
	public static boolean method3731(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static278.method4728(arg0)) {
			return true;
		} else {
			@Pc(18) char[] local18 = Static159.aCharArray15;
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				@Pc(26) char local26 = local18[local20];
				if (arg0 == local26) {
					return true;
				}
			}
			@Pc(43) char[] local43 = Static114.aCharArray13;
			for (@Pc(45) int local45 = 0; local45 < local43.length; local45++) {
				@Pc(51) char local51 = local43[local45];
				if (arg0 == local51) {
					return true;
				}
			}
			return false;
		}
	}
}
