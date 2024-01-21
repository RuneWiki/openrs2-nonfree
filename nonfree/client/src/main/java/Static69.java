import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!h", name = "M", descriptor = "Lclient!cf;")
	public static final Class20 aClass20_5 = new Class20();

	@OriginalMember(owner = "client!h", name = "N", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_642 = Static187.method3089("Welcome to RuneScape");

	@OriginalMember(owner = "client!h", name = "P", descriptor = "Lclient!vd;")
	public static Class92 aClass92_643 = aClass92_642;

	@OriginalMember(owner = "client!h", name = "S", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_644 = Static187.method3089("Please enter your username)3");

	@OriginalMember(owner = "client!h", name = "T", descriptor = "Lclient!vd;")
	public static Class92 aClass92_645 = aClass92_644;

	@OriginalMember(owner = "client!h", name = "g", descriptor = "(I)V")
	public static void method1081() {
		@Pc(3) Class89 local3 = Static159.aClass89_1;
		synchronized (Static159.aClass89_1) {
			Static127.anInt2652 = Static195.anInt4221;
			Static11.anInt253++;
			@Pc(22) int local22;
			if (Static104.anInt2249 >= 0) {
				while (Static118.anInt2519 != Static104.anInt2249) {
					local22 = Static33.anIntArray62[Static118.anInt2519];
					Static118.anInt2519 = Static118.anInt2519 + 1 & 0x7F;
					if (local22 >= 0) {
						Static5.aBooleanArray2[local22] = true;
					} else {
						Static5.aBooleanArray2[~local22] = false;
					}
				}
			} else {
				for (local22 = 0; local22 < 112; local22++) {
					Static5.aBooleanArray2[local22] = false;
				}
				Static104.anInt2249 = Static118.anInt2519;
			}
			Static195.anInt4221 = Static59.anInt1433;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIILclient!ba;IBI)V")
	public static void method1082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(16) int local16 = arg0 * arg0 + arg1 * arg1;
		if (local16 > 360000) {
			return;
		}
		@Pc(30) int local30 = Math.min(arg3.anInt312 / 2, arg3.anInt263 / 2);
		if (local30 * local30 >= local16) {
			Static202.method3346(arg1, arg5, arg4, Static28.aClass1_Sub3_Sub1_Sub1Array6[arg2], arg0, arg3);
			return;
		}
		@Pc(46) int local46 = Static106.anInt2306 + Static31.anInt742 & 0x7FF;
		local30 -= 10;
		@Pc(51) int local51 = Class1_Sub3_Sub1_Sub4.anIntArray320[local46];
		@Pc(59) int local59 = local51 * 256 / (Static183.anInt3930 + 256);
		@Pc(63) int local63 = Class1_Sub3_Sub1_Sub4.anIntArray317[local46];
		@Pc(71) int local71 = local63 * 256 / (Static183.anInt3930 + 256);
		@Pc(81) int local81 = local71 * arg1 + local59 * arg0 >> 16;
		@Pc(91) int local91 = arg0 * local71 - local59 * arg1 >> 16;
		@Pc(97) double local97 = Math.atan2((double) local81, (double) local91);
		@Pc(104) int local104 = (int) (Math.sin(local97) * (double) local30);
		@Pc(111) int local111 = (int) ((double) local30 * Math.cos(local97));
		Static138.aClass1_Sub3_Sub1_Sub1Array18[arg2].method373(local104 + arg5 + arg3.anInt312 / 2 - 10, -local111 + -10 + arg3.anInt263 / 2 + arg4, local97);
	}
}
