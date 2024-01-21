import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!ve", name = "I", descriptor = "[[S")
	public static short[][] aShortArrayArray14;

	@OriginalMember(owner = "client!ve", name = "C", descriptor = "[I")
	public static int[] anIntArray344 = new int[1000];

	@OriginalMember(owner = "client!ve", name = "E", descriptor = "[Z")
	public static boolean[] aBooleanArray25 = new boolean[5];

	@OriginalMember(owner = "client!ve", name = "F", descriptor = "I")
	public static int anInt2911 = 0;

	@OriginalMember(owner = "client!ve", name = "G", descriptor = "Lclient!je;")
	public static Class40 aClass40_1578 = Static69.method1231("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!ve", name = "H", descriptor = "I")
	public static volatile int anInt2912 = -1;

	@OriginalMember(owner = "client!ve", name = "O", descriptor = "[I")
	public static int[] anIntArray346 = new int[256];

	@OriginalMember(owner = "client!ve", name = "P", descriptor = "[I")
	public static int[] anIntArray347 = new int[2048];

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)V")
	public static void method2088() {
		Static3.anIntArray6 = null;
		Static105.anIntArray287 = null;
		Static127.aByteArrayArray9 = null;
		Static3.anIntArray5 = null;
		Static57.anIntArray149 = null;
		Static69.anIntArray205 = null;
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(B)V")
	public static void method2089() {
		anIntArray346 = null;
		anIntArray347 = null;
		aShortArrayArray14 = null;
		anIntArray344 = null;
		aBooleanArray25 = null;
		aClass40_1578 = null;
	}

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "(I)V")
	public static void method2090() {
		for (@Pc(6) Class2_Sub14 local6 = (Class2_Sub14) Static49.aClass3_6.method82(); local6 != null; local6 = (Class2_Sub14) Static49.aClass3_6.method74()) {
			if (local6.aClass2_Sub1_Sub4_1 != null) {
				local6.method1109();
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!je;Lclient!je;Lclient!fd;Lclient!fd;)Lclient!oe;")
	public static Class2_Sub1_Sub2_Sub3_Sub1 method2091(@OriginalArg(1) Class40 arg0, @OriginalArg(2) Class40 arg1, @OriginalArg(3) Class24 arg2, @OriginalArg(4) Class24 arg3) {
		@Pc(8) int local8 = arg3.method1915(arg0);
		@Pc(14) int local14 = arg3.method1918(arg1, local8);
		return Static84.method1572(local8, arg3, arg2, local14);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BI)V")
	public static void method2092(@OriginalArg(1) int arg0) {
		if (arg0 == -1 && !Static86.aBoolean247) {
			Static52.method939();
		} else if (arg0 != -1 && arg0 != Static79.anInt2069 && Static81.anInt2089 != 0 && !Static86.aBoolean247) {
			Static32.method493(0, Static61.aClass24_Sub1_8, Static81.anInt2089, arg0);
		}
		Static79.anInt2069 = arg0;
	}
}
