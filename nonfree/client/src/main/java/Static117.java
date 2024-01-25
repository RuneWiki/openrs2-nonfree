import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!hd", name = "K", descriptor = "I")
	public static int anInt2167;

	@OriginalMember(owner = "client!hd", name = "t", descriptor = "J")
	public static long aLong77 = 0L;

	@OriginalMember(owner = "client!hd", name = "v", descriptor = "Lclient!le;")
	public static final Class122 aClass122_4 = new Class122(64);

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(Z)Z")
	public static boolean method2040() {
		if (Static259.aBoolean424) {
			try {
				Static370.method5989(Static182.aClass139_5.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(19) Throwable local19) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!rg;ILjava/lang/String;)I")
	public static int method2041(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) String arg1) {
		@Pc(13) int local13 = arg0.anInt5731;
		@Pc(17) byte[] local17 = Static153.method2741(arg1);
		arg0.method5093(local17.length);
		arg0.anInt5731 += Static9.aClass154_1.method4168(arg0.aByteArray90, 0, local17, arg0.anInt5731, local17.length);
		return arg0.anInt5731 - local13;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)V")
	public static void method2044() {
		for (@Pc(10) Class5_Sub22 local10 = (Class5_Sub22) Static28.aClass103_21.method2756(); local10 != null; local10 = (Class5_Sub22) Static28.aClass103_21.method2748()) {
			if (local10.anInt2663 > 0) {
				local10.anInt2663--;
			}
			if (local10.anInt2663 != 0) {
				if (local10.anInt2670 > 0) {
					local10.anInt2670--;
				}
				if (local10.anInt2670 == 0 && local10.anInt2675 >= 1 && local10.anInt2674 >= 1 && Static22.anInt481 - 2 >= local10.anInt2675 && local10.anInt2674 <= Static269.anInt5281 - 2 && (local10.anInt2667 < 0 || Static297.method5151(local10.anInt2666, local10.anInt2667))) {
					Static170.method3100(local10.anInt2667, local10.anInt2675, local10.anInt2664, local10.anInt2668, local10.anInt2674, local10.anInt2669, local10.anInt2666, -1);
					local10.anInt2670 = -1;
					if (local10.anInt2667 == local10.anInt2671 && local10.anInt2671 == -1) {
						local10.method6005();
					} else if (local10.anInt2667 == local10.anInt2671 && local10.anInt2664 == local10.anInt2676 && local10.anInt2666 == local10.anInt2665) {
						local10.method6005();
					}
				}
			} else if (local10.anInt2671 < 0 || Static297.method5151(local10.anInt2665, local10.anInt2671)) {
				Static170.method3100(local10.anInt2671, local10.anInt2675, local10.anInt2676, local10.anInt2668, local10.anInt2674, local10.anInt2669, local10.anInt2665, -1);
				local10.method6005();
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZLclient!ea;Lclient!vg;)V")
	public static void method2046(@OriginalArg(1) Class55 arg0, @OriginalArg(2) Class201 arg1) {
		@Pc(30) boolean local30 = Static194.method3452(arg1.anInt6535 | 0xFF000000, arg0, arg1.aBoolean562 ? Static192.aClass4_Sub5_Sub2_Sub1_2.aClass31_2 : null, arg1.anInt6509, arg1.anInt6537, arg1.anInt6536, arg1.anInt6499) == null;
		if (local30) {
			Static72.aClass103_34.method2745(new Class5_Sub8(arg1.anInt6509, arg1.anInt6499, arg1.anInt6536, arg1.anInt6535 | 0xFF000000, arg1.anInt6537, arg1.aBoolean562));
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIII)V")
	public static void method2047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static127.anIntArrayArray45 != null) {
			Static127.anIntArrayArray45[arg0][arg1] = (arg3 & 0x7F8) << 21 | arg2 & 0xFFFFFF;
		}
	}
}
