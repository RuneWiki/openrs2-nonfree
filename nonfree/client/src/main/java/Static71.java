import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
	public static int anInt1412;

	@OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
	public static int anInt1416;

	@OriginalMember(owner = "client!gj", name = "s", descriptor = "Lclient!li;")
	public static Class58 aClass58_1;

	@OriginalMember(owner = "client!gj", name = "f", descriptor = "Lclient!oc;")
	public static Class70 aClass70_670 = null;

	@OriginalMember(owner = "client!gj", name = "p", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_671 = Static193.method3027(" from your friend list first)3");

	@OriginalMember(owner = "client!gj", name = "q", descriptor = "Lclient!oc;")
	public static Class70 aClass70_672 = aClass70_671;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IBIIIIII)V")
	public static void method1030(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = 2048 - arg6 & 0x7FF;
		@Pc(15) int local15 = 2048 - arg5 & 0x7FF;
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		@Pc(29) int local29 = arg3;
		@Pc(39) int local39;
		@Pc(35) int local35;
		@Pc(50) int local50;
		if (local9 != 0) {
			local35 = Class3_Sub3_Sub2_Sub5.anIntArray303[local9];
			local39 = Class3_Sub3_Sub2_Sub5.anIntArray300[local9];
			local50 = local35 * 0 - arg3 * local39 >> 16;
			local29 = local39 * 0 + local35 * arg3 >> 16;
			local19 = local50;
		}
		if (local15 != 0) {
			local39 = Class3_Sub3_Sub2_Sub5.anIntArray300[local15];
			local35 = Class3_Sub3_Sub2_Sub5.anIntArray303[local15];
			local50 = local39 * local29 + local35 * 0 >> 16;
			local29 = local29 * local35 - local39 * 0 >> 16;
			local17 = local50;
		}
		Static130.anInt2546 = arg0 - local17;
		Static183.anInt2962 = arg5;
		Static122.anInt2464 = arg6;
		Static118.anInt2400 = arg4 - local19;
		Static54.anInt1158 = arg2 - local29;
	}

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "(I)V")
	public static void method1031() {
		@Pc(1) Object local1 = Static80.anObject3;
		synchronized (Static80.anObject3) {
			if (Static111.anInt2254 == 0) {
				Static47.aClass47_1.method1363(new Class90(), 5);
			}
			Static111.anInt2254 = 600;
		}
	}
}
