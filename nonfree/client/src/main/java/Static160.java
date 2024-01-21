import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "[I")
	public static int[] anIntArray245;

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "[[I")
	public static int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!qi", name = "g", descriptor = "Lclient!ah;")
	public static Class3_Sub3_Sub2_Sub1 aClass3_Sub3_Sub2_Sub1_7;

	@OriginalMember(owner = "client!qi", name = "n", descriptor = "[I")
	public static int[] anIntArray248;

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "[I")
	public static final int[] anIntArray244 = new int[1000];

	@OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
	public static int anInt3303 = 99;

	@OriginalMember(owner = "client!qi", name = "o", descriptor = "[Lclient!oc;")
	public static final Class70[] aClass70Array58 = new Class70[100];

	@OriginalMember(owner = "client!qi", name = "p", descriptor = "J")
	public static long aLong100 = 0L;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!oc;B)Lclient!ab;")
	public static Class3_Sub1 method2408(@OriginalArg(0) Class70 arg0) {
		if (arg0.method2045() == 0) {
			return null;
		}
		for (@Pc(26) Class3_Sub1 local26 = (Class3_Sub1) Static172.aClass10_94.method267(); local26 != null; local26 = (Class3_Sub1) Static172.aClass10_94.method268()) {
			if (local26.aClass70_19.method2017(arg0)) {
				return local26;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)I")
	public static int method2409(@OriginalArg(1) int arg0) {
		@Pc(7) Class3_Sub3_Sub4 local7 = Static35.method617(arg0);
		@Pc(10) int local10 = local7.anInt341;
		@Pc(13) int local13 = local7.anInt340;
		@Pc(21) int local21 = local7.anInt349;
		@Pc(27) int local27 = Class80.anIntArray247[local13 - local21];
		return Static16.anIntArray27[local10] >> local21 & local27;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILclient!oc;)V")
	public static void method2410(@OriginalArg(1) Class70 arg0) {
		if (Static86.aClass3_Sub13Array1 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		@Pc(12) long local12 = arg0.method2018();
		if (local12 == 0L) {
			return;
		}
		while (Static86.aClass3_Sub13Array1.length > local8 && local12 != Static86.aClass3_Sub13Array1[local8].aLong147) {
			local8++;
		}
		if (Static86.aClass3_Sub13Array1.length > local8 && Static86.aClass3_Sub13Array1[local8] != null) {
			Static93.aClass3_Sub4_Sub1_18.method1298(123);
			Static93.aClass3_Sub4_Sub1_18.method1250(Static86.aClass3_Sub13Array1[local8].aLong147);
		}
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)I")
	public static int method2412() {
		return Static83.anInt1645;
	}
}
