import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!ct", name = "k", descriptor = "[Lclient!vj;")
	public static Class236[] aClass236Array1;

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(II)I")
	public static int method990(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(JI)V")
	public static void method991(@OriginalArg(0) long arg0) {
		Static23.aClass3_Sub5_Sub1_1.anInt3121 = 0;
		Static23.aClass3_Sub5_Sub1_1.method2791(Static56.aClass76_7.anInt1930);
		Static23.aClass3_Sub5_Sub1_1.method2760(arg0);
		Static270.anInt5905 = 1;
		Static115.anInt2217 = 0;
		Static116.anInt2222 = -3;
		Static24.anInt334 = 0;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(ZLclient!dt;B)V")
	public static void method993(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class62 arg1) {
		@Pc(12) int local12 = arg1.anInt1562 == 0 ? arg1.anInt1546 : arg1.anInt1562;
		@Pc(21) int local21 = arg1.anInt1537 == 0 ? arg1.anInt1551 : arg1.anInt1537;
		Static282.method4479(arg1.anInt1500, local21, local12, Static375.aClass62ArrayArray2[arg1.anInt1500 >> 16], arg0);
		if (arg1.aClass62Array1 != null) {
			Static282.method4479(arg1.anInt1500, local21, local12, arg1.aClass62Array1, arg0);
		}
		@Pc(61) Class3_Sub22 local61 = (Class3_Sub22) Static29.aClass44_26.method942((long) arg1.anInt1500);
		if (local61 != null) {
			Static302.method4685(arg0, local12, local21, local61.anInt3029);
		}
	}
}
