import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!mc", name = "L", descriptor = "[Lclient!pg;")
	public static Class64[] aClass64Array4;

	@OriginalMember(owner = "client!mc", name = "C", descriptor = "I")
	public static volatile int anInt2852 = -1;

	@OriginalMember(owner = "client!mc", name = "K", descriptor = "Lclient!sc;")
	public static Class107 aClass107_766 = Static231.method3737("");

	@OriginalMember(owner = "client!mc", name = "M", descriptor = "I")
	public static int anInt2857 = 0;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)Lclient!qh;")
	public static Class99 method2191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub9 local7 = Static174.aClass1_Sub9ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt1416; local13++) {
			@Pc(19) Class99 local19 = local7.aClass99Array2[local13];
			if ((local19.aLong140 >> 29 & 0x3L) == 2L && local19.anInt3819 == arg1 && local19.anInt3808 == arg2) {
				Static57.method3715(local19);
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(B)V")
	public static void method2192() {
		@Pc(8) int[] local8 = new int[Static58.anInt1424];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < Static58.anInt1424; local12++) {
			@Pc(18) Class75 local18 = Static128.method2147(local12);
			if (local18.anInt2705 >= 0 || local18.anInt2715 >= 0) {
				local8[local10++] = local12;
			}
		}
		Static7.anIntArray16 = new int[local10];
		for (@Pc(53) int local53 = 0; local53 < local10; local53++) {
			Static7.anIntArray16[local53] = local8[local53];
		}
	}
}
