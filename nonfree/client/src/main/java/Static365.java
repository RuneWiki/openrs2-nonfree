import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "I")
	public static int anInt6193 = 0;

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "I")
	public static int anInt6194 = -1;

	@OriginalMember(owner = "client!rv", name = "f", descriptor = "[[S")
	public static final short[][] aShortArrayArray5 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!rv", name = "g", descriptor = "Lclient!lp;")
	public static final Class140 aClass140_34 = new Class140(16);

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(I[J[I)V")
	public static void method5100(@OriginalArg(1) long[] arg0, @OriginalArg(2) int[] arg1) {
		Static392.method5429(0, arg0, arg0.length - 1, arg1);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)V")
	public static void method5102() {
		if (Static423.anInt7131 == 6) {
			Static423.anInt7131 = 7;
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(BIII)V")
	public static void method5103(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) String local35 = "tele " + arg2 + "," + (arg0 >> 6) + "," + (arg1 >> 6) + "," + (arg0 & 0x3F) + "," + (arg1 & 0x3F);
		System.out.println(local35);
		Static199.method3075(true, local35, false);
	}
}
