import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!lq", name = "L", descriptor = "Z")
	public static final boolean aBoolean473 = false;

	@OriginalMember(owner = "client!lq", name = "hb", descriptor = "Z")
	public static boolean aBoolean475 = false;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I[IILclient!qi;)V")
	public static void method4922(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Class6_Sub1_Sub1_Sub1_Sub2 arg2) {
		@Pc(10) boolean local10;
		@Pc(12) int local12;
		if (arg2.anIntArray507 != null) {
			local10 = true;
			for (local12 = 0; local12 < arg2.anIntArray507.length; local12++) {
				if (arg2.anIntArray507[local12] != arg1[local12]) {
					local10 = false;
					break;
				}
			}
			if (local10 && arg2.anInt7370 != -1) {
				@Pc(53) Class84 local53 = Static116.aClass140_2.method3287(arg2.anInt7370);
				@Pc(56) int local56 = local53.anInt2056;
				if (local56 == 1) {
					arg2.anInt7378 = 0;
					arg2.anInt7406 = arg0;
					arg2.anInt7400 = 0;
					arg2.anInt7416 = 0;
					arg2.anInt7349 = 1;
					Static434.method4018(arg2.aByte112, local53, arg2.anInt8761, arg2.anInt8764, arg2.anInt7416, arg2 == Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2);
				}
				if (local56 == 2) {
					arg2.anInt7378 = 0;
				}
			}
		}
		local10 = true;
		for (local12 = 0; local12 < arg1.length; local12++) {
			if (arg1[local12] != -1) {
				local10 = false;
			}
			if (arg2.anIntArray507 == null || arg2.anIntArray507[local12] == -1 || Static116.aClass140_2.method3287(arg1[local12]).anInt2065 >= Static116.aClass140_2.method3287(arg2.anIntArray507[local12]).anInt2065) {
				arg2.anIntArray507 = arg1;
				arg2.anInt7406 = arg0;
				break;
			}
		}
		if (local10) {
			arg2.anInt7406 = arg0;
			arg2.anIntArray507 = arg1;
		}
	}

	@OriginalMember(owner = "client!lq", name = "i", descriptor = "(B)V")
	public static void method4923() {
		if (Static276.anInterface1Array2 == null) {
			return;
		}
		@Pc(13) Interface1[] local13 = Static276.anInterface1Array2;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Interface1 local21 = local13[local15];
			local21.method5714();
		}
	}
}
