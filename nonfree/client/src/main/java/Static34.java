import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "[[B")
	public static byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!cl", name = "k", descriptor = "[[Lclient!wf;")
	public static Class191[][] aClass191ArrayArray1;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString51 = "Started 3d Library";

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
	public static int anInt786 = 0;

	@OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
	public static int anInt790 = 0;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
	public static void method689() {
		Static81.anInt1887 = 0;
		Static242.anInt5012 = 0;
		Static287.method4396();
		Static195.method3120();
		Static220.method3469();
		@Pc(23) int local23;
		for (local23 = 0; local23 < Static81.anInt1887; local23++) {
			@Pc(34) int local34 = Static20.anIntArray49[local23];
			if (Static105.aClass2_Sub4_Sub1Array1[local34].anInt2824 != Static133.anInt3061) {
				if (Static105.aClass2_Sub4_Sub1Array1[local34].aClass145_1.method3714()) {
					Static75.method1317(Static105.aClass2_Sub4_Sub1Array1[local34]);
				}
				Static105.aClass2_Sub4_Sub1Array1[local34].method1239(null);
				Static105.aClass2_Sub4_Sub1Array1[local34] = null;
			}
		}
		if (Static140.aClass1_Sub14_Sub1_2.anInt3000 != Static188.anInt4164) {
			throw new RuntimeException("gnp1 pos:" + Static140.aClass1_Sub14_Sub1_2.anInt3000 + " psize:" + Static188.anInt4164);
		}
		for (local23 = 0; local23 < Static147.anInt3287; local23++) {
			if (Static105.aClass2_Sub4_Sub1Array1[Static100.anIntArray224[local23]] == null) {
				throw new RuntimeException("gnp2 pos:" + local23 + " size:" + Static147.anInt3287);
			}
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method690(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)J")
	public static long method691() {
		return Static211.aClass14_1.method3263();
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IB)Lclient!ig;")
	public static Class78 method692(@OriginalArg(0) int arg0) {
		@Pc(6) Class78 local6 = (Class78) Static105.aClass89_13.method2268((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(21) byte[] local21 = Static292.aClass168_199.method4058(arg0, 33);
		local6 = new Class78();
		if (local21 != null) {
			local6.method1839(arg0, new Class1_Sub14(local21));
		}
		Static105.aClass89_13.method2272((long) arg0, local6);
		return local6;
	}
}
