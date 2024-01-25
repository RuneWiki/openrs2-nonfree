import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!h", name = "c", descriptor = "Lclient!qs;")
	public static Class96 aClass96_1;

	@OriginalMember(owner = "client!h", name = "e", descriptor = "I")
	public static int anInt2782;

	@OriginalMember(owner = "client!h", name = "g", descriptor = "I")
	public static int anInt2783;

	@OriginalMember(owner = "client!h", name = "d", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_49 = new Class2(29, 2);

	@OriginalMember(owner = "client!h", name = "f", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_54 = new Class253(24, 2);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Z[Lclient!go;IIII)V")
	public static void method2250(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class95[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(9) int local9 = 0; local9 < arg1.length; local9++) {
			@Pc(15) Class95 local15 = arg1[local9];
			if (local15 != null && arg3 == local15.anInt2646) {
				Static376.method4839(arg2, arg0, arg4, local15);
				Static275.method3667(arg4, local15, arg2);
				if (local15.anInt2581 - local15.anInt2595 < local15.anInt2627) {
					local15.anInt2627 = local15.anInt2581 - local15.anInt2595;
				}
				if (local15.anInt2585 > local15.anInt2645 - local15.anInt2638) {
					local15.anInt2585 = local15.anInt2645 - local15.anInt2638;
				}
				if (local15.anInt2627 < 0) {
					local15.anInt2627 = 0;
				}
				if (local15.anInt2585 < 0) {
					local15.anInt2585 = 0;
				}
				if (local15.anInt2616 == 0) {
					Static118.method1991(local15, arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(B)I")
	public static int method2251() {
		if ((double) Static93.aFloat125 == 3.0D) {
			return 37;
		} else if ((double) Static93.aFloat125 == 4.0D) {
			return 50;
		} else if ((double) Static93.aFloat125 == 6.0D) {
			return 75;
		} else if ((double) Static93.aFloat125 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}
}
