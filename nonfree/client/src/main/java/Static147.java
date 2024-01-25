import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
	public static int anInt3170;

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "F")
	public static float aFloat28;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIBIIII)V")
	public static void method2348(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		@Pc(8) Class178[] local8 = Static393.aClass178Array1;
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class178 local16 = local8[local10];
			if (local16 != null && local16.anInt5270 == 2) {
				Static70.method1336(arg3 >> 1, local16.anInt5277, local16.anInt5272, arg2 >> 1, local16.anInt5265 * 2, local16.anInt5273);
				if (Static156.anIntArray346[0] > -1 && Static187.anInt3975 % 20 < 10) {
					Static3.aClass137Array1[local16.anInt5268].method5708(Static156.anIntArray346[0] + arg1 - 12, Static156.anIntArray346[1] + -28 + arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIZ)V")
	public static void method2349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(35) String local35 = "tele " + arg2 + "," + (arg1 >> 6) + "," + (arg0 >> 6) + "," + (arg1 & 0x3F) + "," + (arg0 & 0x3F);
		System.out.println(local35);
		Static221.method3429(local35, true, false);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)I")
	public static int method2350(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(27) int local27 = arg0 * 6 - 61440;
		@Pc(35) int local35 = (local27 * arg0 >> 12) + 40960;
		return local35 * local13 >> 12;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZZ)V")
	public static void method2351(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static456.anInt1594 != -1) {
				Static222.method3439(Static456.anInt1594);
			}
			for (@Pc(12) Class1_Sub39 local12 = (Class1_Sub39) Static177.aClass38_18.method767(); local12 != null; local12 = (Class1_Sub39) Static177.aClass38_18.method773()) {
				if (!local12.method6175()) {
					local12 = (Class1_Sub39) Static177.aClass38_18.method767();
					if (local12 == null) {
						break;
					}
				}
				Static285.method4176(local12, false, true);
			}
			Static456.anInt1594 = -1;
			Static177.aClass38_18 = new Class38(8);
			Static54.method1005();
			Static456.anInt1594 = Static97.anInt2326;
			Static191.method3101(false);
			Static179.method3014();
			Static178.method2998(Static456.anInt1594);
		}
		Static194.aString35 = "";
		Static92.aString19 = "";
		Static429.aBoolean496 = false;
		Static259.method3823();
		Static49.anInt1209 = -1;
		Static78.method1441(Static19.anInt523);
		Static429.aClass30_Sub1_Sub1_Sub2_2 = new Class30_Sub1_Sub1_Sub2();
		Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7488 = Static211.anInt4295 * 128 / 2;
		Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7490 = Static209.anInt4283 * 128 / 2;
		Static429.aClass30_Sub1_Sub1_Sub2_2.anIntArray130[0] = Static209.anInt4283 / 2;
		Static429.aClass30_Sub1_Sub1_Sub2_2.anIntArray129[0] = Static211.anInt4295 / 2;
		Static78.anInt1973 = 0;
		Static378.anInt6885 = 0;
		if (Static21.anInt6762 == 2) {
			Static78.anInt1973 = Static272.anInt5269 << 7;
			Static378.anInt6885 = Static342.anInt6261 << 7;
		} else {
			Static206.method3289();
		}
		Static448.method6102();
	}
}
