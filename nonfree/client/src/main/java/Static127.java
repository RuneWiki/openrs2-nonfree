import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static127 {

	@OriginalMember(owner = "client!ha", name = "I", descriptor = "Lclient!ii;")
	public static Class111 aClass111_5;

	@OriginalMember(owner = "client!ha", name = "U", descriptor = "[S")
	public static short[] aShortArray44;

	@OriginalMember(owner = "client!ha", name = "W", descriptor = "Lclient!bg;")
	public static Class3_Sub2 aClass3_Sub2_2;

	@OriginalMember(owner = "client!ha", name = "L", descriptor = "J")
	public static long aLong94 = 0L;

	@OriginalMember(owner = "client!ha", name = "M", descriptor = "I")
	public static int anInt2413 = -1;

	@OriginalMember(owner = "client!ha", name = "V", descriptor = "[I")
	public static final int[] anIntArray245 = new int[50];

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method2040(@OriginalArg(1) String arg0) {
		if (!arg0.equals("")) {
			Static229.method3783(Static190.aClass244_48);
			Static23.aClass3_Sub5_Sub1_1.method2791(Static269.method4260(arg0));
			Static23.aClass3_Sub5_Sub1_1.method2768(arg0);
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(BILclient!hg;)V")
	public static void method2041(@OriginalArg(1) int arg0, @OriginalArg(2) Class102 arg1) {
		if (Static264.aBoolean365) {
			arg0 = 0;
			Static264.aBoolean365 = false;
		}
		if (Static122.aClass102_3 != null && Static122.aClass102_3.method2094(arg1)) {
			return;
		}
		Static122.aClass102_3 = arg1;
		Static224.aLong154 = Static288.method4512();
		Static304.anInt3133 = arg0;
		Static3.anInt79 = arg0;
		if (Static3.anInt79 == 0) {
			Static390.method5417();
			return;
		}
		Static104.aFloat14 = Static277.aFloat58;
		Static362.anInt6084 = Static136.anInt2618;
		Static86.aFloat12 = Static375.aFloat76;
		Static32.aFloat6 = Static117.aFloat15;
		Static240.anInt5453 = Static56.anInt1131;
		Static41.aFloat8 = Static71.aFloat10;
		Static177.aFloat34 = Static186.aFloat35;
		Static17.aFloat1 = Static206.aFloat36;
		Static377.anInt6281 = Static108.anInt2131;
		Static71.aClass8_2 = Static53.aClass8_1;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZI)I")
	public static int method2043(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(III)I")
	public static int method2044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}
}
