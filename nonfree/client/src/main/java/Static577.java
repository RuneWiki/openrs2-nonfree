import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static577 {

	@OriginalMember(owner = "client!sf", name = "I", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_137 = new Class349(49, 3);

	@OriginalMember(owner = "client!sf", name = "H", descriptor = "I")
	public static int anInt9120 = 0;

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(III)I")
	public static int method8036(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local17 *= arg0;
			}
			arg0 *= arg0;
			arg1 >>= 0x1;
		}
		if (arg1 == 1) {
			return arg0 * local17;
		} else {
			return local17;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZLclient!eu;)V")
	public static void method8037(@OriginalArg(1) Class2_Sub21 arg0) {
		Static442.aClass2_Sub23_Sub5_3.method7685(false, arg0);
		if (Static161.aClass70_1 != null) {
			Static161.aClass70_1.method9365(Static442.aClass2_Sub23_Sub5_3);
		}
		Static39.anInt535 = 0;
	}
}
