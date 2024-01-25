import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static582 {

	@OriginalMember(owner = "client!uk", name = "g", descriptor = "Lclient!bba;")
	public static Class29 aClass29_2;

	@OriginalMember(owner = "client!uk", name = "j", descriptor = "F")
	public static float aFloat193;

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "Z")
	public static boolean aBoolean667 = false;

	@OriginalMember(owner = "client!uk", name = "h", descriptor = "[I")
	public static final int[] anIntArray594 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!uk", name = "i", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_174 = new Class268(52, -2);

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIII)V")
	public static void method8190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static487.anInt7457 / (float) Static487.anInt7462;
		@Pc(11) int local11 = arg2;
		@Pc(18) int local18 = arg0;
		if (local9 < 1.0F) {
			local18 = (int) (local9 * (float) arg2);
		} else {
			local11 = (int) ((float) arg0 / local9);
		}
		@Pc(44) int local44 = arg1 - (arg2 - local11) / 2;
		@Pc(53) int local53 = arg3 - (arg0 - local18) / 2;
		Static497.anInt8613 = -1;
		Static526.anInt9146 = Static487.anInt7462 * local44 / local11;
		Static78.anInt1658 = Static487.anInt7457 - local53 * Static487.anInt7457 / local18;
		Static414.anInt7551 = -1;
		Static287.method7460();
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IBI)Z")
	public static boolean method8191(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
