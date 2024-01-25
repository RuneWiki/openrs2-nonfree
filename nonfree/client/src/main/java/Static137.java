import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!is", name = "a", descriptor = "I")
	public static int anInt2547;

	@OriginalMember(owner = "client!is", name = "c", descriptor = "[Lclient!sg;")
	public static Class97[] aClass97Array9;

	@OriginalMember(owner = "client!is", name = "g", descriptor = "B")
	public static byte aByte23;

	@OriginalMember(owner = "client!is", name = "n", descriptor = "I")
	public static int anInt2556;

	@OriginalMember(owner = "client!is", name = "b", descriptor = "I")
	public static int anInt2548 = 0;

	@OriginalMember(owner = "client!is", name = "f", descriptor = "Z")
	public static boolean aBoolean170 = false;

	@OriginalMember(owner = "client!is", name = "o", descriptor = "Z")
	public static boolean aBoolean171 = false;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(BLclient!qa;)V")
	public static void method2131(@OriginalArg(1) Class67_Sub3_Sub3_Sub2 arg0) {
		@Pc(19) Class11_Sub1 local19 = (Class11_Sub1) Static99.aClass58_9.method1009((long) arg0.anInt5038);
		if (local19 == null) {
			Static308.method5158(arg0.anIntArray392[0], arg0, 0, null, arg0.anIntArray391[0], null, Static322.anInt6250);
		} else {
			local19.method78();
		}
	}

	@OriginalMember(owner = "client!is", name = "b", descriptor = "(B)V")
	public static void method2133() {
		Static181.method3072();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static211.aClass92Array1[local8].method1770();
		}
		Static178.method2897();
		Static42.method638();
		System.gc();
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BLjava/lang/String;)Ljava/lang/String;")
	public static String method2134(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(9) int local9 = arg1.indexOf(arg0); local9 != -1; local9 = arg1.indexOf(arg0, arg2.length() + local9)) {
			arg1 = arg1.substring(0, local9) + arg2 + arg1.substring(local9 + arg0.length());
		}
		return arg1;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(II)V")
	public static void method2136(@OriginalArg(0) int arg0) {
		Static307.anInt4795 = -1;
		Static247.anInt4959 = arg0;
		Static155.anInt2944 = -1;
		Static32.method457();
	}
}
