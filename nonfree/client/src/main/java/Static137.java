import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!ffa", name = "t", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_32 = new Class208(12, 3);

	@OriginalMember(owner = "client!ffa", name = "u", descriptor = "[I")
	public static final int[] anIntArray115 = new int[14];

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(III)Z")
	public static boolean method2396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!ffa", name = "c", descriptor = "(B)V")
	public static void method2398() {
		for (@Pc(15) Class1_Sub8_Sub8 local15 = (Class1_Sub8_Sub8) Static241.aClass111_21.method2547(); local15 != null; local15 = (Class1_Sub8_Sub8) Static241.aClass111_21.method2554()) {
			@Pc(20) Class11_Sub1_Sub1_Sub4 local20 = local15.aClass11_Sub1_Sub1_Sub4_1;
			if (local20.anInt4454 < Static518.anInt9331) {
				local15.method7908();
				local20.method3590();
			} else if (local20.anInt4475 <= Static518.anInt9331) {
				if (local20.anInt4464 > 0) {
					@Pc(56) Class1_Sub33 local56 = (Class1_Sub33) Static372.aClass91_30.method2271((long) (local20.anInt4464 - 1));
					if (local56 != null) {
						@Pc(61) Class11_Sub1_Sub1_Sub3_Sub2 local61 = local56.aClass11_Sub1_Sub1_Sub3_Sub2_2;
						if (local61.anInt8902 >= 0 && Static458.anInt9736 * 512 > local61.anInt8902 && local61.anInt8906 >= 0 && Static378.anInt6747 * 512 > local61.anInt8906) {
							local20.method3586(Static538.method6114(local20.aByte113, local61.anInt8906, local61.anInt8902) - local20.anInt4447, Static518.anInt9331, local61.anInt8902, local61.anInt8906);
						}
					}
				}
				if (local20.anInt4464 < 0) {
					@Pc(115) int local115 = -local20.anInt4464 - 1;
					@Pc(122) Class11_Sub1_Sub1_Sub3_Sub1 local122;
					if (local115 == Static310.anInt5693) {
						local122 = Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2;
					} else {
						local122 = Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[local115];
					}
					if (local122 != null && local122.anInt8902 >= 0 && local122.anInt8902 < Static458.anInt9736 * 512 && local122.anInt8906 >= 0 && Static378.anInt6747 * 512 > local122.anInt8906) {
						local20.method3586(Static538.method6114(local20.aByte113, local122.anInt8906, local122.anInt8902) - local20.anInt4447, Static518.anInt9331, local122.anInt8902, local122.anInt8906);
					}
				}
				local20.method3588(Static175.anInt3258);
				Static89.method1396(local20, true);
			}
		}
	}
}
