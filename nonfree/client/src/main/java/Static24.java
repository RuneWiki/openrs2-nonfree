import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IBILclient!rr;)V")
	public static void method789(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class292 arg2) {
		@Pc(16) Class86 local16 = arg2.method6463(Static240.aClass14_7);
		if (local16 == null) {
			return;
		}
		Static240.aClass14_7.ca(arg0, arg1, arg2.anInt7963 + arg0, arg1 - -arg2.anInt7912);
		if (Static113.anInt2183 >= 3) {
			Static240.aClass14_7.L(-16777216, local16, arg0, arg1);
		} else {
			Static13.aClass58_40.method7663((float) arg0 + (float) arg2.anInt7963 / 2.0F, (float) arg1 + (float) arg2.anInt7912 / 2.0F, ((int) -Static428.aFloat160 & 0x3FFF) << 2, local16, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(III)B")
	public static byte method790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
