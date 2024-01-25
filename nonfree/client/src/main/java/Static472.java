import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static472 {

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "F")
	public static float aFloat156;

	@OriginalMember(owner = "client!sba", name = "c", descriptor = "I")
	public static int anInt7697;

	@OriginalMember(owner = "client!sba", name = "d", descriptor = "I")
	public static int anInt7698 = 0;

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(BI)V")
	public static void method6499(@OriginalArg(1) int arg0) {
		Static162.anInt3259 = arg0;
		Static280.aClass10_27.method263();
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(IIILclient!lk;)V")
	public static void method6500(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class203 arg2) {
		@Pc(8) Class146 local8 = arg2.method4780(Static4.aClass43_1);
		if (local8 == null) {
			return;
		}
		Static4.aClass43_1.da(arg1, arg0, arg1 + arg2.anInt5513, arg2.anInt5476 + arg0);
		if (Static355.anInt6148 < 3) {
			Static573.aClass46_35.method7605((float) arg1 + (float) arg2.anInt5513 / 2.0F, (float) arg0 + (float) arg2.anInt5476 / 2.0F, ((int) -Static439.aFloat151 & 0x3FFF) << 2, local8, arg1, arg0);
		} else {
			Static4.aClass43_1.FA(-16777216, local8, arg1, arg0);
		}
	}
}
