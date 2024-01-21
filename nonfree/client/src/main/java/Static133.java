import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "[[[B")
	public static final byte[][][] aByteArrayArrayArray11 = new byte[4][104][104];

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1007 = Static151.method2243("Drop");

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
	public static int anInt2867 = 0;

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1008 = aClass62_1007;

	@OriginalMember(owner = "client!ng", name = "f", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1009 = Static151.method2243("sch-Utteln:");

	@OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
	public static int anInt2869 = 0;

	@OriginalMember(owner = "client!ng", name = "h", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1010 = Static151.method2243("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!ng", name = "i", descriptor = "Z")
	public static boolean aBoolean125 = false;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
	public static void method2034() {
		Static196.anInt4032 = 0;
		Static39.anInt4460 = 0;
		Static17.method335();
		Static158.method2341();
		Static14.method236();
		@Pc(28) int local28;
		for (@Pc(22) int local22 = 0; local22 < Static39.anInt4460; local22++) {
			local28 = Static111.anIntArray226[local22];
			if (Static25.anInt581 != Static9.aClass7_Sub2_Sub1Array1[local28].anInt3043) {
				Static9.aClass7_Sub2_Sub1Array1[local28].aClass2_Sub1_Sub20_1 = null;
				Static9.aClass7_Sub2_Sub1Array1[local28] = null;
			}
		}
		if (Static108.aClass2_Sub11_Sub1_3.anInt2235 != Static35.anInt838) {
			throw new RuntimeException("gnp1 pos:" + Static108.aClass2_Sub11_Sub1_3.anInt2235 + " psize:" + Static35.anInt838);
		}
		for (local28 = 0; local28 < Static118.anInt2607; local28++) {
			if (Static9.aClass7_Sub2_Sub1Array1[Static199.anIntArray373[local28]] == null) {
				throw new RuntimeException("gnp2 pos:" + local28 + " size:" + Static118.anInt2607);
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IB)Lclient!ud;")
	public static Class2_Sub1_Sub24 method2036(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub1_Sub24 local10 = (Class2_Sub1_Sub24) Static23.aClass53_3.method1648((long) arg0);
		if (local10 != null) {
			return local10;
		}
		local10 = Static195.method2785(Static109.aClass71_21, arg0, Static126.aClass71_24);
		if (local10 != null) {
			Static23.aClass53_3.method1645((long) arg0, local10);
		}
		return local10;
	}
}
