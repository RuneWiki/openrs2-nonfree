import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!rc", name = "R", descriptor = "I")
	public static int anInt3267;

	@OriginalMember(owner = "client!rc", name = "ob", descriptor = "[I")
	public static int[] anIntArray314;

	@OriginalMember(owner = "client!rc", name = "M", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_958 = Static181.method2795("");

	@OriginalMember(owner = "client!rc", name = "O", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_959 = Static181.method2795("Loading sprites )2 ");

	@OriginalMember(owner = "client!rc", name = "Q", descriptor = "I")
	public static int anInt3266 = 0;

	@OriginalMember(owner = "client!rc", name = "S", descriptor = "Lclient!qe;")
	public static Class83 aClass83_960 = aClass83_959;

	@OriginalMember(owner = "client!rc", name = "Y", descriptor = "[Lclient!pb;")
	public static final Class76[] aClass76Array1 = new Class76[4];

	@OriginalMember(owner = "client!rc", name = "gb", descriptor = "Lclient!qe;")
	public static Class83 aClass83_961 = null;

	@OriginalMember(owner = "client!rc", name = "ib", descriptor = "Lclient!qe;")
	public static Class83 aClass83_962 = null;

	@OriginalMember(owner = "client!rc", name = "kb", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_963 = Static181.method2795("");

	@OriginalMember(owner = "client!rc", name = "nb", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_964 = Static181.method2795("(U2");

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIZII)V")
	public static void method2502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static147.anInt4074 <= arg0 && arg0 <= Static61.anInt1501) {
			@Pc(15) int local15 = Static50.method998(Static36.anInt940, Static209.anInt4155, arg1);
			@Pc(21) int local21 = Static50.method998(Static36.anInt940, Static209.anInt4155, arg3);
			Static99.method1686(local21, local15, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!qe;ILclient!qe;Lclient!qe;)V")
	public static void method2503(@OriginalArg(1) Class83 arg0, @OriginalArg(3) Class83 arg1, @OriginalArg(4) Class83 arg2) {
		Static51.method1183(arg2, 9, arg1, arg0, -1);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IBI)I")
	public static int method2504(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) Class2_Sub22 local6 = (Class2_Sub22) Static135.aClass63_10.method2110((long) arg1);
		if (local6 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local6.anIntArray307.length) {
			return local6.anIntArray307[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BLclient!eh;Lclient!eh;Lclient!eh;Lclient!eh;)V")
	public static void method2506(@OriginalArg(1) Class28 arg0, @OriginalArg(2) Class28 arg1, @OriginalArg(3) Class28 arg2, @OriginalArg(4) Class28 arg3) {
		Static177.aClass28_167 = arg2;
		Static87.aClass28_91 = arg0;
		Static175.aClass28_166 = arg3;
		Static201.aClass28_190 = arg1;
		Static175.aClass5ArrayArray1 = new Class5[Static201.aClass28_190.method849()][];
		Static210.aBooleanArray29 = new boolean[Static201.aClass28_190.method849()];
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(II)V")
	public static void method2507(@OriginalArg(0) int arg0) {
		if (arg0 == -1 && !Static125.aBoolean136) {
			Static59.method1139();
		} else if (arg0 != -1 && (arg0 != Static118.anInt2711 || !Static173.method2669()) && Static112.anInt1949 != 0 && !Static125.aBoolean136) {
			Static167.method2588(arg0, Static112.anInt1949, Static157.aClass28_Sub1_23);
		}
		Static118.anInt2711 = arg0;
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(III)Lclient!ec;")
	public static Class26 method2508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub23 local7 = Static203.aClass2_Sub23ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass26_1 == null ? null : local7.aClass26_1;
	}
}
