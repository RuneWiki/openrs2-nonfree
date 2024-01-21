import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!qc", name = "db", descriptor = "Lclient!nc;")
	public static Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_21;

	@OriginalMember(owner = "client!qc", name = "rb", descriptor = "I")
	public static int anInt2165;

	@OriginalMember(owner = "client!qc", name = "ic", descriptor = "[Lclient!aa;")
	public static Class1_Sub1_Sub1_Sub1[] aClass1_Sub1_Sub1_Sub1Array34;

	@OriginalMember(owner = "client!qc", name = "oc", descriptor = "[I")
	public static int[] anIntArray335;

	@OriginalMember(owner = "client!qc", name = "qc", descriptor = "I")
	public static int anInt2193;

	@OriginalMember(owner = "client!qc", name = "S", descriptor = "Z")
	public static boolean aBoolean117 = false;

	@OriginalMember(owner = "client!qc", name = "T", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1161 = Static23.method501("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!qc", name = "Ab", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1163 = Static23.method501("(Y");

	@OriginalMember(owner = "client!qc", name = "Jb", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1165 = Static23.method501("Your friendlist is full)3 Max of 100 for free users)1 and 200 for members");

	@OriginalMember(owner = "client!qc", name = "Pb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1167 = aClass42_1165;

	@OriginalMember(owner = "client!qc", name = "Zb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1169 = Static23.method501("mapedge");

	@OriginalMember(owner = "client!qc", name = "mc", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1170 = Static23.method501("level)2");

	@OriginalMember(owner = "client!qc", name = "tc", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1172 = aClass42_1170;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)V")
	public static void method1501() {
		aClass42_1170 = null;
		aClass42_1169 = null;
		aClass42_1172 = null;
		aClass42_1165 = null;
		aClass42_1161 = null;
		aClass42_1167 = null;
		aClass42_1163 = null;
		anIntArray335 = null;
		aClass1_Sub1_Sub1_Sub4_21 = null;
		aClass1_Sub1_Sub1_Sub1Array34 = null;
	}

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "(I)V")
	public static void method1507() {
		for (@Pc(9) Class1_Sub13 local9 = (Class1_Sub13) Static73.aClass22_10.method515(); local9 != null; local9 = (Class1_Sub13) Static73.aClass22_10.method519()) {
			if (local9.aClass1_Sub1_Sub9_1 != null) {
				local9.method1518();
			}
		}
	}
}
