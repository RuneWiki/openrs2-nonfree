import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "m", descriptor = "[Lclient!gf;")
	public static Class3_Sub1_Sub5_Sub3[] aClass3_Sub1_Sub5_Sub3Array1;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
	public static int anInt56 = 0;

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "[J")
	public static long[] aLongArray1 = new long[200];

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
	public static int anInt57 = 0;

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "[I")
	public static int[] anIntArray3 = new int[128];

	@OriginalMember(owner = "client!aa", name = "i", descriptor = "Lclient!na;")
	public static Class53 aClass53_13 = Static109.method1737("Icons redrawn");

	@OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
	public static int anInt63 = 0;

	@OriginalMember(owner = "client!aa", name = "l", descriptor = "Lclient!na;")
	public static Class53 aClass53_14 = Static109.method1737("Hidden)2use");

	@OriginalMember(owner = "client!aa", name = "n", descriptor = "Lclient!na;")
	private static Class53 aClass53_15 = Static109.method1737("Service unavailable)3");

	@OriginalMember(owner = "client!aa", name = "s", descriptor = "Lclient!na;")
	public static Class53 aClass53_16 = aClass53_15;

	@OriginalMember(owner = "client!aa", name = "u", descriptor = "Lclient!na;")
	public static Class53 aClass53_17 = Static109.method1737(")3runescape)3com");

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)V")
	public static void method36() {
		Static69.anInt1757 = -1;
		Static22.aClass62_4 = null;
		Static68.aBoolean61 = false;
		Static62.anInt1638 = 2;
		Static117.anInt2678 = 0;
		Static40.anInt1183 = 1;
		Static117.anInt2715 = -1;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)I")
	public static int method37() {
		return Static52.anInt1347++;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)Lclient!kd;")
	public static Class3_Sub1_Sub8 method38(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub1_Sub8 local10 = (Class3_Sub1_Sub8) Static72.aClass75_50.method1728((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static118.aClass62_25.method1512(10, arg0);
		local10 = new Class3_Sub1_Sub8();
		local10.anInt1594 = arg0;
		if (local28 != null) {
			local10.method1102(new Class3_Sub7(local28));
		}
		local10.method1100();
		if (local10.anInt1608 != -1) {
			local10.method1095(method38(local10.anInt1608), method38(local10.anInt1584));
		}
		if (!Static32.aBoolean37 && local10.aBoolean57) {
			local10.aClass53_706 = Static20.aClass53_262;
			local10.aClass53Array14 = null;
			local10.aClass53Array13 = null;
			local10.anInt1580 = 0;
		}
		Static72.aClass75_50.method1730(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)I")
	public static int method39() {
		return Static33.anInt1985++;
	}

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(B)V")
	public static void method40() {
		aClass53_14 = null;
		aLongArray1 = null;
		anIntArray3 = null;
		aClass53_17 = null;
		aClass3_Sub1_Sub5_Sub3Array1 = null;
		aClass53_16 = null;
		aClass53_15 = null;
		aClass53_13 = null;
	}
}
