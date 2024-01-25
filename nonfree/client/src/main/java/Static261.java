import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "[S")
	public static final short[] aShortArray93 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)I")
	public static int method3786(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class14_Sub37 local10 = (Class14_Sub37) Static316.aClass25_15.method691((long) arg1);
		if (local10 == null) {
			return -1;
		} else if (arg0 >= 0 && local10.anIntArray614.length > arg0) {
			return local10.anIntArray614[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZLclient!sd;)V")
	public static void method3791(@OriginalArg(1) Class10_Sub3_Sub3_Sub1 arg0) {
		for (@Pc(15) Class14_Sub28 local15 = (Class14_Sub28) Static51.aClass18_3.method459(); local15 != null; local15 = (Class14_Sub28) Static51.aClass18_3.method453()) {
			if (arg0 == local15.aClass10_Sub3_Sub3_Sub1_1) {
				if (local15.aClass14_Sub19_Sub3_2 != null) {
					Static49.aClass14_Sub19_Sub2_1.method4245(local15.aClass14_Sub19_Sub3_2);
					local15.aClass14_Sub19_Sub3_2 = null;
				}
				local15.method5986();
				return;
			}
		}
	}
}
