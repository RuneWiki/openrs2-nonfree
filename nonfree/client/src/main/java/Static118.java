import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!ve", name = "D", descriptor = "I")
	public static int anInt3181;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1734 = Static80.method1463("backhmid2");

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1735 = Static80.method1463("");

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
	public static int anInt3163 = 0;

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1736 = Static80.method1463("Name eingeben:");

	@OriginalMember(owner = "client!ve", name = "j", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1737 = Static80.method1463("Take");

	@OriginalMember(owner = "client!ve", name = "n", descriptor = "[Z")
	public static boolean[] aBooleanArray14 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

	@OriginalMember(owner = "client!ve", name = "o", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1738 = Static80.method1463("(U1");

	@OriginalMember(owner = "client!ve", name = "G", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1741 = Static80.method1463("Loading fonts )2 ");

	@OriginalMember(owner = "client!ve", name = "p", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1739 = aClass63_1741;

	@OriginalMember(owner = "client!ve", name = "q", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1740 = aClass63_1737;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZZLjava/lang/Object;)[B")
	public static byte[] method2112(@OriginalArg(0) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return arg0 ? Static110.method2035(local13) : local13;
		} else if (arg1 instanceof Class59) {
			@Pc(40) Class59 local40 = (Class59) arg1;
			return local40.method1863();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
	public static void method2113() {
		if (Static61.aBoolean98 && Static47.anInt1479 != Static101.anInt2810) {
			Static93.method1704(Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray271[0], Static5.anInt49, Static101.anInt2810, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray273[0], Static2.anInt35);
		} else if (Static87.anInt2414 != Static101.anInt2810) {
			Static87.anInt2414 = Static101.anInt2810;
			Static48.method1031(Static101.anInt2810);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZ)Lclient!rd;")
	public static Class63 method2114(@OriginalArg(0) int arg0) {
		return Static54.method1094(arg0, false);
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
	public static void method2115() {
		Static1.aClass6_Sub6_Sub4_1.method1930();
		Static29.aClass7_17 = null;
		Static69.anInt1998 = 1;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIII)I")
	public static int method2116(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static103.aByteArrayArrayArray92[arg1][arg2][arg0] & 0x8) == 0) {
			return arg1 <= 0 || (Static103.aByteArrayArrayArray92[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)V")
	public static void method2117() {
		aClass63_1737 = null;
		aClass63_1738 = null;
		aClass63_1739 = null;
		aClass63_1740 = null;
		aClass63_1735 = null;
		aClass63_1741 = null;
		aClass63_1736 = null;
		aClass63_1734 = null;
		aBooleanArray14 = null;
	}
}
