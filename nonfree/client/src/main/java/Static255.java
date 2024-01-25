import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(BIILclient!tc;)V")
	public static void method4559(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class305 arg2) {
		Static411.anInt8067 = arg1;
		Static297.aClass305_7 = arg2;
		Static533.anInt9677 = arg0;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V")
	public static void method4560() {
		@Pc(9) int[] local9 = new int[Static517.aClass23_2.anInt777];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static517.aClass23_2.anInt777; local13++) {
			@Pc(20) Class18 local20 = Static517.aClass23_2.method901(local13);
			if (local20.anInt671 >= 0 || local20.anInt666 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static354.anIntArray454 = new int[local11];
		for (@Pc(49) int local49 = 0; local49 < local11; local49++) {
			Static354.anIntArray454[local49] = local9[local49];
		}
	}
}
