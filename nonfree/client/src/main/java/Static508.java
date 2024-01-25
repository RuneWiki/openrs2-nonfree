import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static508 {

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "Lclient!ha;")
	public static Class104 aClass104_26;

	@OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
	public static int anInt8910;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
	public static int anInt8897 = 0;

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
	public static int anInt8899 = 0;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)Z")
	public static boolean method7752(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static447.method6927(arg1, arg0) | (arg1 & 0x2000) != 0 | Static304.method5353(arg0, arg1)) & Static281.method4924(arg0, arg1);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIII)I")
	public static int method7754(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static296.aClass7Array11 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg1 >> 7;
		@Pc(15) int local15 = arg0 >> 7;
		if (local11 < 0 || local15 < 0 || local11 > Static237.anInt4563 - 1 || Static373.anInt6694 - 1 < local15) {
			return 0;
		}
		@Pc(40) int local40 = arg2;
		if (arg2 < 3 && (Static379.aByteArrayArrayArray13[1][local11][local15] & 0x2) != 0) {
			local40 = arg2 + 1;
		}
		return Static296.aClass7Array11[local40].aa(arg1, arg0);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!qa;II)V")
	public static void method7755(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(2) int arg2) {
		Static247.aClass4_7 = arg1;
		Static169.aClass126ArrayArray1 = new Class126[arg2][arg0];
		if (Static261.anIntArray418 != null) {
			Static193.aClass103_2 = Static361.method5868(Static261.anIntArray418[5], Static261.anIntArray418[2], Static261.anIntArray418[3], Static261.anIntArray418[0], Static261.anIntArray418[1], Static261.anIntArray418[4]);
		}
		Static440.aClass126_2 = new Class126();
		Static465.method7072();
	}
}
