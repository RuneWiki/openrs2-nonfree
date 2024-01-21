import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "[Lclient!bg;")
	public static Class1_Sub3_Sub1_Sub1[] aClass1_Sub3_Sub1_Sub1Array5;

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "Lclient!bg;")
	public static Class1_Sub3_Sub1_Sub1 aClass1_Sub3_Sub1_Sub1_1;

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_255 = Static187.method3089("Loaded textures");

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "Lclient!vd;")
	public static Class92 aClass92_256 = null;

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_257 = Static187.method3089("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
	public static int anInt588 = 1;

	@OriginalMember(owner = "client!cf", name = "o", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_258 = Static187.method3089("(U0a )2 non)2existant gosub script)2num: ");

	@OriginalMember(owner = "client!cf", name = "q", descriptor = "Lclient!vd;")
	public static Class92 aClass92_259 = aClass92_255;

	@OriginalMember(owner = "client!cf", name = "y", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_261 = Static187.method3089("Loaded interfaces");

	@OriginalMember(owner = "client!cf", name = "s", descriptor = "Lclient!vd;")
	public static Class92 aClass92_260 = aClass92_261;

	@OriginalMember(owner = "client!cf", name = "w", descriptor = "I")
	public static int anInt597 = 0;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)Lclient!tc;")
	public static Class85 method470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static179.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass85_1;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
	public static void method474() {
		if (Static47.aClass57_2 != null) {
			Static47.aClass57_2.method1672();
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIZIIBLclient!ve;)V")
	public static void method476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) Class3_Sub1 arg5) {
		@Pc(12) long local12 = (long) ((arg1 << 16) + arg0);
		@Pc(22) Class1_Sub3_Sub23 local22 = (Class1_Sub3_Sub23) Static106.aClass97_12.method3375(local12);
		if (local22 != null) {
			return;
		}
		local22 = (Class1_Sub3_Sub23) Static193.aClass97_16.method3375(local12);
		if (local22 != null) {
			return;
		}
		local22 = (Class1_Sub3_Sub23) Static153.aClass97_18.method3375(local12);
		if (local22 == null) {
			if (!arg2) {
				local22 = (Class1_Sub3_Sub23) Static193.aClass97_17.method3375(local12);
				if (local22 != null) {
					return;
				}
			}
			local22 = new Class1_Sub3_Sub23();
			local22.aClass3_Sub1_25 = arg5;
			local22.aByte12 = arg4;
			local22.anInt4096 = arg3;
			if (arg2) {
				Static106.aClass97_12.method3374(local22, local12);
				Static106.anInt2305++;
			} else {
				Static143.aClass86_2.method2883(local22);
				Static153.aClass97_18.method3374(local22, local12);
				Static104.anInt2259++;
			}
		} else if (arg2) {
			local22.method3367();
			Static106.aClass97_12.method3374(local22, local12);
			Static106.anInt2305++;
			Static104.anInt2259--;
		}
	}
}
