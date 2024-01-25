import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
	public static int anInt4032;

	@OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
	public static int anInt4035;

	@OriginalMember(owner = "client!qd", name = "p", descriptor = "Lclient!cl;")
	public static Class45 aClass45_5;

	@OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
	public static int anInt4034 = -1;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!at;III)V")
	public static void method3369(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long local7 = Static392.aLongArrayArrayArray1[arg1][arg2][arg3];
		@Pc(9) long local9 = 0L;
		arg0.anInt300 = 0;
		@Pc(21) int local21;
		while (local9 <= 48L) {
			local21 = (int) (local7 >> (int) local9 & 0xFFFFL);
			if (local21 <= 0) {
				break;
			}
			arg0.aClass1_Sub12Array2[arg0.anInt300++] = Static352.aClass253Array1[local21 - 1].aClass1_Sub12_2;
			local9 += 16L;
		}
		for (local21 = arg0.anInt300; local21 < 4; local21++) {
			arg0.aClass1_Sub12Array2[local21] = null;
		}
	}
}
