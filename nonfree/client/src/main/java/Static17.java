import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "Lclient!bl;")
	public static Class26 aClass26_1;

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "Lclient!iq;")
	public static Class104 aClass104_12;

	@OriginalMember(owner = "client!aq", name = "m", descriptor = "Lclient!hc;")
	public static Class2_Sub1 aClass2_Sub1_1;

	@OriginalMember(owner = "client!aq", name = "e", descriptor = "I")
	public static int anInt277 = 127;

	@OriginalMember(owner = "client!aq", name = "i", descriptor = "[I")
	public static final int[] anIntArray31 = new int[50];

	@OriginalMember(owner = "client!aq", name = "j", descriptor = "Z")
	public static boolean aBoolean20 = false;

	@OriginalMember(owner = "client!aq", name = "n", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_15 = new Class157(61, 2);

	@OriginalMember(owner = "client!aq", name = "o", descriptor = "[S")
	public static short[] aShortArray1 = new short[256];

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILclient!iq;)I")
	public static int method252(@OriginalArg(1) Class104 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method2755(Static149.anInt3387)) {
			local5++;
		}
		if (arg0.method2755(Static257.anInt5343)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(III)I")
	public static int method253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static72.anIntArray120[arg1 & 0x3] : Static102.anIntArray169[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IZ)V")
	public static void method254(@OriginalArg(1) boolean arg0) {
		for (@Pc(10) Class2_Sub37 local10 = (Class2_Sub37) Static309.aClass180_41.method4919(); local10 != null; local10 = (Class2_Sub37) Static309.aClass180_41.method4916()) {
			if (local10.aClass2_Sub11_Sub4_3 != null) {
				Static31.aClass2_Sub11_Sub3_1.method4110(local10.aClass2_Sub11_Sub4_3);
				local10.aClass2_Sub11_Sub4_3 = null;
			}
			if (local10.aClass2_Sub11_Sub4_2 != null) {
				Static31.aClass2_Sub11_Sub3_1.method4110(local10.aClass2_Sub11_Sub4_2);
				local10.aClass2_Sub11_Sub4_2 = null;
			}
			local10.method5723();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(53) Class2_Sub37 local53 = (Class2_Sub37) Static120.aClass180_2.method4919(); local53 != null; local53 = (Class2_Sub37) Static120.aClass180_2.method4916()) {
			if (local53.aClass2_Sub11_Sub4_3 != null) {
				Static31.aClass2_Sub11_Sub3_1.method4110(local53.aClass2_Sub11_Sub4_3);
				local53.aClass2_Sub11_Sub4_3 = null;
			}
			local53.method5723();
		}
		for (@Pc(80) Class2_Sub37 local80 = (Class2_Sub37) Static13.aClass41_1.method896(); local80 != null; local80 = (Class2_Sub37) Static13.aClass41_1.method904()) {
			if (local80.aClass2_Sub11_Sub4_3 != null) {
				Static31.aClass2_Sub11_Sub3_1.method4110(local80.aClass2_Sub11_Sub4_3);
				local80.aClass2_Sub11_Sub4_3 = null;
			}
			local80.method5723();
		}
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(III)I")
	public static int method255(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(46) int local46 = Static145.method2832(arg1 - 1, arg0 - 1) + Static145.method2832(arg1 - 1, arg0 + 1) + Static145.method2832(arg1 + 1, arg0 - 1) + Static145.method2832(arg1 + 1, arg0 + 1);
		@Pc(76) int local76 = Static145.method2832(arg1, arg0 - 1) + Static145.method2832(arg1, arg0 + 1) + Static145.method2832(arg1 + -1, arg0) + Static145.method2832(arg1 - -1, arg0);
		@Pc(81) int local81 = Static145.method2832(arg1, arg0);
		return local81 / 4 + local46 / 16 + local76 / 8;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(II)V")
	public static void method256() {
		Static250.aClass107_31.method3011(5);
		Static171.aClass107_19.method3011(5);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(BI)V")
	public static void method257(@OriginalArg(1) int arg0) {
		if (arg0 == Static294.anInt5840) {
			return;
		}
		Static66.anInt1177 = Static12.anInt213 = Static328.anIntArray511[arg0];
		Static51.aClass37_1.method3703(50, (int) ((double) Static66.anInt1177 * 34.46D));
		Static53.anIntArrayArrayArray4 = new int[4][Static66.anInt1177 >> 3][Static12.anInt213 >> 3];
		Static200.anIntArrayArray39 = new int[Static66.anInt1177][Static12.anInt213];
		Static153.anIntArrayArray32 = new int[Static66.anInt1177][Static12.anInt213];
		for (@Pc(46) int local46 = 0; local46 < 4; local46++) {
			Static182.aClass61Array2[local46] = Static79.method1616(Static12.anInt213, Static66.anInt1177);
		}
		Static332.aByteArrayArrayArray12 = new byte[4][Static66.anInt1177][Static12.anInt213];
		Static238.method4326(Static12.anInt213, Static66.anInt1177);
		Static347.method5643(Static12.anInt213 >> 3, Static51.aClass37_1, Static66.anInt1177 >> 3);
		Static294.anInt5840 = arg0;
	}
}
