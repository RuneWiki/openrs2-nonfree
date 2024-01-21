import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!v", name = "vb", descriptor = "I")
	public static int anInt3725;

	@OriginalMember(owner = "client!v", name = "wb", descriptor = "Lclient!bg;")
	public static Class11 aClass11_133;

	@OriginalMember(owner = "client!v", name = "kb", descriptor = "Lclient!rc;")
	public static Class74 aClass74_90 = new Class74(64);

	@OriginalMember(owner = "client!v", name = "nb", descriptor = "I")
	public static int anInt3721 = -1;

	@OriginalMember(owner = "client!v", name = "ob", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1662 = Static32.method683("AUS");

	@OriginalMember(owner = "client!v", name = "qb", descriptor = "Lclient!rc;")
	public static Class74 aClass74_91 = new Class74(260);

	@OriginalMember(owner = "client!v", name = "rb", descriptor = "I")
	public static int anInt3723 = 0;

	@OriginalMember(owner = "client!v", name = "sb", descriptor = "Lclient!tf;")
	public static Class81 aClass81_14 = new Class81();

	@OriginalMember(owner = "client!v", name = "tb", descriptor = "I")
	public static int anInt3724 = 0;

	@OriginalMember(owner = "client!v", name = "ub", descriptor = "[I")
	public static int[] anIntArray330 = new int[256];

	@OriginalMember(owner = "client!v", name = "f", descriptor = "(I)V")
	public static void method2827() {
		Static77.aClass74_55.method2347();
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIII)V")
	public static void method2828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(12) int local12 = 0; local12 < Static100.anInt2133; local12++) {
			if (Static176.anIntArray361[local12] + Static55.anIntArray111[local12] > arg2 && arg2 + arg3 > Static55.anIntArray111[local12] && arg1 < Static62.anIntArray164[local12] + Static25.anIntArray48[local12] && arg0 + arg1 > Static25.anIntArray48[local12]) {
				Static171.aBooleanArray18[local12] = true;
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!lf;I)Z")
	public static boolean method2829(@OriginalArg(0) Class49 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static18.anInt381; local11++) {
			if (arg0.method1645(Static30.aClass49Array4[local11])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(JI)V")
	public static void method2830(@OriginalArg(0) long arg0) {
		if (arg0 != 0L) {
			Static176.aClass2_Sub13_Sub1_14.method2976(188);
			Static176.aClass2_Sub13_Sub1_14.method2956(arg0);
		}
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(II)Lclient!lh;")
	public static Class2_Sub2_Sub11 method2831(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub2_Sub11 local10 = (Class2_Sub2_Sub11) Static37.aClass74_30.method2345((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static6.aClass11_8.method2049(arg0, 13);
		local10 = new Class2_Sub2_Sub11();
		local10.anInt2078 = arg0;
		if (local20 != null) {
			local10.method1700(new Class2_Sub13(local20));
		}
		Static37.aClass74_30.method2341((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!v", name = "e", descriptor = "(B)V")
	public static void method2832() {
		aClass74_90 = null;
		anIntArray330 = null;
		aClass49_1662 = null;
		aClass11_133 = null;
		aClass74_91 = null;
		aClass81_14 = null;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(Z)I")
	public static int method2833() {
		return Static68.anInt1420++;
	}
}
