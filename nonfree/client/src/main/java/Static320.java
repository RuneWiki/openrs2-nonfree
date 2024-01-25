import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!so", name = "d", descriptor = "I")
	public static int anInt5451 = 0;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(B)V")
	public static void method4849() {
		Static331.aClass138_40 = new Class138();
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIBI)V")
	public static void method4850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int local18 = arg1 * Static164.aClass154_Sub1_1.anInt6064 >> 8;
		if (arg0 == -1 && !Static298.aBoolean402) {
			Static303.method4698();
		} else if (arg0 != -1 && (Static4.anInt110 != arg0 || !Static225.method3724()) && local18 != 0 && !Static298.aBoolean402) {
			Static256.method4148(arg2, local18, arg0, Static103.aClass20_26);
		}
		Static4.anInt110 = arg0;
	}
}
