import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!og", name = "h", descriptor = "Lclient!bg;")
	public static Class1_Sub3_Sub1_Sub1 aClass1_Sub3_Sub1_Sub1_4;

	@OriginalMember(owner = "client!og", name = "l", descriptor = "J")
	public static long aLong152;

	@OriginalMember(owner = "client!og", name = "b", descriptor = "I")
	public static int anInt2817 = 0;

	@OriginalMember(owner = "client!og", name = "m", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1364 = Static187.method3089("Continue");

	@OriginalMember(owner = "client!og", name = "c", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1362 = aClass92_1364;

	@OriginalMember(owner = "client!og", name = "e", descriptor = "[I")
	public static final int[] anIntArray251 = new int[4000];

	@OriginalMember(owner = "client!og", name = "f", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1363 = Static187.method3089("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!og", name = "k", descriptor = "[Lclient!cg;")
	public static final Class21[] aClass21Array1 = new Class21[50];

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(III)I")
	public static int method2091(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(25) int local25 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local25;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(II)Z")
	public static boolean method2092(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(16) int local16 = Static120.aShortArray21[arg0];
		if (local16 >= 2000) {
			local16 -= 2000;
		}
		return local16 == 1007;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ILclient!ba;)Z")
	public static boolean method2093(@OriginalArg(1) Class11 arg0) {
		if (Static151.aBoolean178) {
			if (Static195.method3194(arg0) != 0) {
				return false;
			}
			if (arg0.anInt326 == 0) {
				return false;
			}
		}
		return arg0.aBoolean24;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(III)I")
	public static int method2094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) long local13 = (long) ((arg0 << 16) + arg1);
		return Static95.aClass1_Sub3_Sub23_1 != null && Static95.aClass1_Sub3_Sub23_1.aLong251 == local13 ? Static139.aClass1_Sub14_4.anInt4061 * 99 / (Static139.aClass1_Sub14_4.aByteArray49.length - Static95.aClass1_Sub3_Sub23_1.aByte12) + 1 : 0;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(ILclient!ba;)Lclient!ba;")
	public static Class11 method2096(@OriginalArg(1) Class11 arg0) {
		@Pc(15) Class11 local15 = Static85.method1282(arg0);
		if (local15 == null) {
			local15 = arg0.aClass11_1;
		}
		return local15;
	}
}
