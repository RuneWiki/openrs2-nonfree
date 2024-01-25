import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_83 = new Class225(42, 0);

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_84 = new Class225(104, -2);

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(B)V")
	public static void method3986() {
		if (Static688.aString118.toLowerCase().indexOf("microsoft") != -1) {
			Static201.anIntArray262[223] = 28;
			Static201.anIntArray262[188] = 71;
			Static201.anIntArray262[189] = 26;
			Static201.anIntArray262[190] = 72;
			Static201.anIntArray262[186] = 57;
			Static201.anIntArray262[220] = 74;
			Static201.anIntArray262[219] = 42;
			Static201.anIntArray262[191] = 73;
			Static201.anIntArray262[221] = 43;
			Static201.anIntArray262[187] = 27;
			Static201.anIntArray262[222] = 59;
			Static201.anIntArray262[192] = 58;
			return;
		}
		Static201.anIntArray262[92] = 74;
		Static201.anIntArray262[59] = 57;
		Static201.anIntArray262[45] = 26;
		Static201.anIntArray262[47] = 73;
		Static201.anIntArray262[61] = 27;
		Static201.anIntArray262[46] = 72;
		if (Static688.aMethod2 == null) {
			Static201.anIntArray262[222] = 59;
			Static201.anIntArray262[192] = 58;
		} else {
			Static201.anIntArray262[520] = 59;
			Static201.anIntArray262[222] = 58;
			Static201.anIntArray262[192] = 28;
		}
		Static201.anIntArray262[91] = 42;
		Static201.anIntArray262[93] = 43;
		Static201.anIntArray262[44] = 71;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(I[I[I[ILclient!sj;)V")
	public static void method3987(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) Class4_Sub2_Sub1_Sub2 arg4) {
		for (@Pc(7) int local7 = arg0; local7 < arg1.length; local7++) {
			@Pc(13) int local13 = arg1[local7];
			@Pc(17) int local17 = arg2[local7];
			@Pc(21) int local21 = arg3[local7];
			for (@Pc(23) int local23 = 0; local17 != 0 && arg4.aClass53_Sub1_Sub1Array3.length > local23; local23++) {
				if ((local17 & 0x1) != 0) {
					if (local13 == -1) {
						arg4.aClass53_Sub1_Sub1Array3[local23] = null;
					} else {
						@Pc(45) Class307 local45 = Static89.aClass274_1.method6626(local13);
						@Pc(48) int local48 = local45.anInt8120;
						@Pc(53) Class53_Sub1_Sub1 local53 = arg4.aClass53_Sub1_Sub1Array3[local23];
						if (local53 != null && local53.method4094()) {
							if (local53.method4088() == local13) {
								if (local48 == 0) {
									local53 = arg4.aClass53_Sub1_Sub1Array3[local23] = null;
								} else if (local48 == 1) {
									local53.method4087();
									local53.anInt4502 = local21;
								} else if (local48 == 2) {
									local53.method4081();
								}
							} else if (local45.anInt8124 >= local53.method4074().anInt8124) {
								local53 = arg4.aClass53_Sub1_Sub1Array3[local23] = null;
							}
						}
						if (local53 == null || !local53.method4094()) {
							local53 = arg4.aClass53_Sub1_Sub1Array3[local23] = new Class53_Sub1_Sub1(arg4);
							local53.method4089(local13);
							local53.anInt4502 = local21;
						}
					}
				}
				local17 >>>= 0x1;
			}
		}
	}
}
