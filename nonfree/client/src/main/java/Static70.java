import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
	public static int anInt1182;

	@OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
	public static int anInt1184;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
	public static int anInt1180 = 0;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V")
	public static void method980() {
		@Pc(9) int[] local9 = new int[Static119.aClass244_4.anInt7168];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static119.aClass244_4.anInt7168; local13++) {
			@Pc(20) Class236 local20 = Static119.aClass244_4.method5726(local13);
			if (local20.anInt6786 >= 0 || local20.anInt6787 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static466.anIntArray571 = new int[local11];
		for (@Pc(49) int local49 = 0; local49 < local11; local49++) {
			Static466.anIntArray571[local49] = local9[local49];
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IB)V")
	public static void method981(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub5_Sub8 local8 = Static49.method760(16, arg0);
		local8.method3257();
	}
}
