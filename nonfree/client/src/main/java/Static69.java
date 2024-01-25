import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "Lclient!tf;")
	public static Class322 aClass322_27;

	@OriginalMember(owner = "client!cj", name = "h", descriptor = "Lclient!du;")
	public static Class75 aClass75_1;

	@OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
	public static int anInt1582 = -1;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)Z")
	public static boolean method1487(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(B[B)[B")
	public static byte[] method1488(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class3_Sub11 local8 = new Class3_Sub11(arg0);
		@Pc(17) int local17 = local8.method5175();
		@Pc(21) int local21 = local8.method5186();
		if (local21 < 0 || Static74.anInt1699 != 0 && Static74.anInt1699 < local21) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(92) byte[] local92 = new byte[local21];
			local8.method5183(local21, local92);
			return local92;
		} else {
			@Pc(41) int local41 = local8.method5186();
			if (local41 < 0 || Static74.anInt1699 != 0 && Static74.anInt1699 < local41) {
				throw new RuntimeException();
			}
			@Pc(58) byte[] local58 = new byte[local41];
			if (local17 == 1) {
				Static356.method5266(local58, local41, arg0, local21);
			} else {
				@Pc(72) Class47 local72 = Static366.aClass47_1;
				synchronized (Static366.aClass47_1) {
					Static366.aClass47_1.method1394(local8, local58);
				}
			}
			return local58;
		}
	}

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)V")
	public static void method1493() {
		if (Static405.aClass3_Sub3_Sub1_1.method6312(Static60.anInt1312) || Static364.anInt645 == Static117.anInt2694) {
			Static296.method4402(Static505.aClass45_11);
			if (Static117.anInt2694 != Static294.anInt7434) {
				Static286.method4255();
			}
		} else {
			Static272.method4138(11, Static110.anInt2172, false, Static132.anInt9449);
		}
	}
}
