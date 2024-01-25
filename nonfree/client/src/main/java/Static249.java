import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "F")
	public static float aFloat72;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_149 = new Class34(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IZILclient!nd;I)V")
	public static void method4471(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class141 arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class1_Sub22 local10 = (Class1_Sub22) Static148.aClass16_14.method410(); local10 != null; local10 = (Class1_Sub22) Static148.aClass16_14.method419()) {
			if (arg0 == local10.anInt3058 && local10.anInt3052 == arg1 * 128 && arg3 * 128 == local10.anInt3050 && local10.aClass141_1.anInt4281 == arg2.anInt4281) {
				if (local10.aClass1_Sub1_Sub2_2 != null) {
					Static145.aClass1_Sub1_Sub4_1.method5037(local10.aClass1_Sub1_Sub2_2);
					local10.aClass1_Sub1_Sub2_2 = null;
				}
				if (local10.aClass1_Sub1_Sub2_1 != null) {
					Static145.aClass1_Sub1_Sub4_1.method5037(local10.aClass1_Sub1_Sub2_1);
					local10.aClass1_Sub1_Sub2_1 = null;
				}
				local10.method5628();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lclient!aq;IIIIZ)V")
	public static void method4472(@OriginalArg(0) Class12[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class12 local13 = arg0[local7];
			if (local13 != null && local13.anInt459 == arg3) {
				Static14.method387(arg4, arg1, arg2, local13);
				Static5.method196(local13, arg2, arg1);
				if (local13.anInt400 > local13.anInt398 - local13.lb) {
					local13.anInt400 = local13.anInt398 - local13.lb;
				}
				if (local13.anInt419 > local13.anInt436 - local13.anInt446) {
					local13.anInt419 = local13.anInt436 - local13.anInt446;
				}
				if (local13.anInt400 < 0) {
					local13.anInt400 = 0;
				}
				if (local13.anInt419 < 0) {
					local13.anInt419 = 0;
				}
				if (local13.anInt416 == 0) {
					Static50.method1306(arg4, local13);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!aq;III)V")
	public static void method4473(@OriginalArg(0) Class12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!Static91.aBoolean214) {
			@Pc(55) String local55;
			for (@Pc(48) int local48 = 9; local48 >= 5; local48--) {
				local55 = Static338.method5465(arg0, local48);
				if (local55 != null) {
					Static58.method1506(Static3.method66(arg0, local48), arg0.aString5, arg0.anInt465, (long) (local48 + 1), local55, arg0.anInt410, 1010);
				}
			}
			local55 = Static143.method2869(arg0);
			if (local55 != null) {
				Static58.method1506(arg0.anInt455, arg0.aString5, arg0.anInt465, 0L, local55, arg0.anInt410, 10);
			}
			for (@Pc(108) int local108 = 4; local108 >= 0; local108--) {
				@Pc(115) String local115 = Static338.method5465(arg0, local108);
				if (local115 != null) {
					Static58.method1506(Static3.method66(arg0, local108), arg0.aString5, arg0.anInt465, (long) (local108 + 1), local115, arg0.anInt410, 58);
				}
			}
			if (Static44.method1023(arg0).method5592()) {
				if (arg0.aString7 == null) {
					Static58.method1506(-1, "", arg0.anInt465, 0L, Static259.aClass34_94.method1285(Static259.anInt2907), arg0.anInt410, 2);
				} else {
					Static58.method1506(-1, "", arg0.anInt465, 0L, arg0.aString7, arg0.anInt410, 2);
				}
			}
		} else if (Static44.method1023(arg0).method5595() && (Static257.anInt5340 & 0x20) != 0) {
			Static58.method1506(Static175.anInt3793, Static281.aString56 + " -> " + arg0.aString5, arg0.anInt465, 0L, Static24.aString15, arg0.anInt410, 57);
		}
	}
}
