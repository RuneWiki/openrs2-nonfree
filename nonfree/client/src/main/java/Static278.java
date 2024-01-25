import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!rn", name = "i", descriptor = "Lclient!ak;")
	public static Class11 aClass11_6;

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "[I")
	public static final int[] anIntArray659 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!rn", name = "f", descriptor = "[I")
	public static final int[] anIntArray660 = new int[5];

	@OriginalMember(owner = "client!rn", name = "g", descriptor = "I")
	public static int anInt5833 = 0;

	@OriginalMember(owner = "client!rn", name = "h", descriptor = "[I")
	public static final int[] anIntArray661 = new int[8];

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(JI)V")
	public static void method5283(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % (long) 10 == 0L) {
			Static237.method4194(arg0 - 1L);
			Static237.method4194(1L);
		} else {
			Static237.method4194(arg0);
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IB)Lclient!ul;")
	public static Class200 method5284(@OriginalArg(0) int arg0) {
		@Pc(15) Class200 local15 = (Class200) Static239.aClass70_109.method1396((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static34.aClass53_26.method1033(arg0, 35);
		local15 = new Class200();
		if (local25 != null) {
			local15.method5354(new Class6_Sub10(local25));
		}
		local15.method5353();
		Static239.aClass70_109.method1406(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(Z)V")
	public static void method5285() {
		try {
			if (Static319.anInt5902 == 1) {
				@Pc(10) int local10 = Static191.aClass6_Sub12_Sub1_3.method1457();
				if (local10 > 0 && Static191.aClass6_Sub12_Sub1_3.method1468()) {
					local10 -= Static281.anInt5318;
					if (local10 < 0) {
						local10 = 0;
					}
					Static191.aClass6_Sub12_Sub1_3.method1446(local10);
					return;
				}
				Static191.aClass6_Sub12_Sub1_3.method1469();
				Static191.aClass6_Sub12_Sub1_3.method1465();
				Static175.aClass6_Sub27_2 = null;
				Static21.aClass213_1 = null;
				if (Static252.aClass53_117 == null) {
					Static319.anInt5902 = 0;
				} else {
					Static319.anInt5902 = 2;
				}
			}
		} catch (@Pc(54) Exception local54) {
			local54.printStackTrace();
			Static191.aClass6_Sub12_Sub1_3.method1469();
			Static319.anInt5902 = 0;
			Static252.aClass53_117 = null;
			Static175.aClass6_Sub27_2 = null;
			Static21.aClass213_1 = null;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(III)B")
	public static byte method5286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
