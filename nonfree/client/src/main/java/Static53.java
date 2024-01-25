import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!df", name = "f", descriptor = "Lclient!nq;")
	public static Class144 aClass144_20;

	@OriginalMember(owner = "client!df", name = "h", descriptor = "I")
	public static int anInt998;

	@OriginalMember(owner = "client!df", name = "e", descriptor = "[Lclient!ii;")
	public static final Class102[] aClass102Array1 = new Class102[50];

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(II)Z")
	public static boolean method798(@OriginalArg(0) int arg0) {
		if (arg0 == 44 || arg0 == 12 || arg0 == 10 || arg0 == 49 || arg0 == 1011) {
			return true;
		} else {
			return arg0 == 17 || arg0 == 1003;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IJ)V")
	public static void method799(@OriginalArg(1) long arg0) {
		@Pc(7) int local7 = Static283.anInt5592;
		@Pc(14) int local14;
		@Pc(22) int local22;
		if (Static114.anInt2169 != local7) {
			local14 = local7 - Static114.anInt2169;
			local22 = (int) (arg0 * (long) local14 / 320L);
			if (local14 <= 0) {
				if (local22 == 0) {
					local22 = -1;
				} else if (local14 > local22) {
					local22 = local14;
				}
			} else if (local22 == 0) {
				local22 = 1;
			} else if (local14 < local22) {
				local22 = local14;
			}
			Static114.anInt2169 += local22;
		}
		@Pc(68) int local68 = Static352.anInt6703;
		if (Static169.anInt6309 != local68) {
			local14 = local68 - Static169.anInt6309;
			local22 = (int) (arg0 * (long) local14 / 320L);
			if (local14 <= 0) {
				if (local22 == 0) {
					local22 = -1;
				} else if (local14 > local22) {
					local22 = local14;
				}
			} else if (local22 == 0) {
				local22 = 1;
			} else if (local22 > local14) {
				local22 = local14;
			}
			Static169.anInt6309 += local22;
		}
		if (!Static210.aBoolean290) {
			Static246.aFloat51 += Static209.aFloat44 * (float) arg0 / 40.0F * 8.0F;
			Static21.aFloat10 += Static283.aFloat53 * (float) arg0 / 40.0F * 8.0F;
		}
		Static51.method731();
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
	public static void method800() {
		Static313.aClass11_Sub25_Sub1_5.method2454(192);
		Static313.aClass11_Sub25_Sub1_5.method5186(Static104.method1587());
		Static313.aClass11_Sub25_Sub1_5.method5204(Static164.anInt3090);
		Static313.aClass11_Sub25_Sub1_5.method5204(Static79.anInt5259);
		Static313.aClass11_Sub25_Sub1_5.method5186(Static82.anInt1504);
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
	public static void method801() {
		Static85.aClass129_2.method5005(Static202.aFloat31, Static112.aFloat14, Static76.aFloat52);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BII)V")
	public static void method803(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class11_Sub4_Sub12 local10 = Static35.method512(5, arg1);
		local10.method3858();
		local10.anInt4390 = arg0;
	}
}
