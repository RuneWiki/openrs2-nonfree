import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!fba", name = "x", descriptor = "Lclient!pga;")
	public static Class268 aClass268_1;

	@OriginalMember(owner = "client!fba", name = "f", descriptor = "Lclient!mga;")
	public static final Class223 aClass223_23 = new Class223(4);

	@OriginalMember(owner = "client!fba", name = "p", descriptor = "J")
	public static long aLong67 = -1L;

	@OriginalMember(owner = "client!fba", name = "u", descriptor = "[I")
	public static final int[] anIntArray298 = new int[2048];

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IILclient!hfa;[I)V")
	public static void method2808(@OriginalArg(1) int arg0, @OriginalArg(2) Class10_Sub1_Sub2_Sub1 arg1, @OriginalArg(3) int[] arg2) {
		@Pc(10) boolean local10;
		@Pc(12) int local12;
		if (arg1.anIntArray651 != null) {
			local10 = true;
			for (local12 = 0; local12 < arg1.anIntArray651.length; local12++) {
				if (arg1.anIntArray651[local12] != arg2[local12]) {
					local10 = false;
					break;
				}
			}
			if (local10 && arg1.anInt8483 != -1) {
				@Pc(51) Class77 local51 = Static168.aClass327_2.method7326(arg1.anInt8483);
				@Pc(54) int local54 = local51.anInt2586;
				if (local54 == 1) {
					arg1.anInt8506 = 1;
					arg1.anInt8527 = 0;
					arg1.anInt8468 = 0;
					arg1.anInt8521 = 0;
					arg1.anInt8510 = arg0;
					Static240.method4084(arg1.aByte101, arg1.anInt8934, arg1.anInt8929, arg1.anInt8521, local51, false);
				}
				if (local54 == 2) {
					arg1.anInt8527 = 0;
				}
			}
		}
		local10 = true;
		for (local12 = 0; local12 < arg2.length; local12++) {
			if (arg2[local12] != -1) {
				local10 = false;
			}
			if (arg1.anIntArray651 == null || arg1.anIntArray651[local12] == -1 || Static168.aClass327_2.method7326(arg2[local12]).anInt2582 >= Static168.aClass327_2.method7326(arg1.anIntArray651[local12]).anInt2582) {
				arg1.anIntArray651 = arg2;
				arg1.anInt8536 = arg1.anInt8537;
				arg1.anInt8510 = arg0;
			}
		}
		if (local10) {
			arg1.anInt8510 = arg0;
			arg1.anIntArray651 = arg2;
			arg1.anInt8536 = arg1.anInt8537;
		}
	}
}
