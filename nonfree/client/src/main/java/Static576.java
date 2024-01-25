import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static576 {

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "F")
	public static float aFloat203;

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "Lclient!qw;")
	public static final Class284 aClass284_27 = new Class284(8, 17);

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
	public static int anInt9547 = 503;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IB)I")
	public static int method7839(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIILclient!gba;)V")
	public static void method7841(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class115 arg2) {
		@Pc(12) Class98 local12 = arg2.method3150(Static185.aClass66_14);
		if (local12 == null) {
			return;
		}
		Static185.aClass66_14.ca(arg1, arg0, arg2.anInt3474 + arg1, arg0 - -arg2.anInt3481);
		if (Static451.anInt9796 >= 3) {
			Static185.aClass66_14.L(-16777216, local12, arg1, arg0);
		} else {
			Static95.aClass13_35.method8022((float) arg1 + (float) arg2.anInt3474 / 2.0F, (float) arg0 + (float) arg2.anInt3481 / 2.0F, ((int) -Static477.aFloat164 & 0x3FFF) << 2, local12, arg1, arg0);
		}
	}
}
