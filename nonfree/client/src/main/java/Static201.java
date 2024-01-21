import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!vi", name = "ob", descriptor = "Lclient!r;")
	public static Class1_Sub3_Sub1_Sub3_Sub1 aClass1_Sub3_Sub1_Sub3_Sub1_5;

	@OriginalMember(owner = "client!vi", name = "ab", descriptor = "[I")
	public static int[] anIntArray357 = new int[] { 1, 1, 1, 1 };

	@OriginalMember(owner = "client!vi", name = "gb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_2010 = Static187.method3089("und haben es deaktiviert)3 Klicken Sie auf der");

	@OriginalMember(owner = "client!vi", name = "jb", descriptor = "Lclient!ph;")
	public static final Class77 aClass77_11 = new Class77(500);

	@OriginalMember(owner = "client!vi", name = "pb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_2011 = Static187.method3089(" )2> <col=ff9040>");

	@OriginalMember(owner = "client!vi", name = "rb", descriptor = "[[I")
	public static final int[][] anIntArrayArray32 = new int[104][104];

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(II)V")
	public static void method3328(@OriginalArg(1) int arg0) {
		for (@Pc(10) Class1_Sub20 local10 = (Class1_Sub20) Static192.aClass97_22.method3372(); local10 != null; local10 = (Class1_Sub20) Static192.aClass97_22.method3377()) {
			if ((long) arg0 == (local10.aLong251 >> 48 & 0xFFFFL)) {
				local10.method3414();
			}
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "([BII)I")
	public static int method3329(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return Static155.method2189(arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!ab;ILclient!ab;)V")
	public static void method3330(@OriginalArg(0) Class3 arg0, @OriginalArg(2) Class3 arg1) {
		Static89.aClass3_16 = arg0;
		Static116.aClass3_22 = arg1;
	}

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "(B)[Lclient!va;")
	public static Class1_Sub3_Sub1_Sub5[] method3331() {
		@Pc(4) Class1_Sub3_Sub1_Sub5[] local4 = new Class1_Sub3_Sub1_Sub5[Static77.anInt1714];
		for (@Pc(11) int local11 = 0; local11 < Static77.anInt1714; local11++) {
			@Pc(17) Class1_Sub3_Sub1_Sub5 local17 = new Class1_Sub3_Sub1_Sub5();
			local17.anInt4206 = Static92.anInt1967;
			local17.anInt4207 = Static197.anInt4330;
			local17.anInt4205 = Static154.anIntArray285[local11];
			local17.anInt4203 = Static193.anIntArray276[local11];
			local17.anInt4204 = Static164.anIntArray302[local11];
			local17.anInt4208 = Static76.anIntArray133[local11];
			local17.anIntArray335 = Static209.anIntArray365;
			local17.aByteArray50 = Static143.aByteArrayArray6[local11];
			local4[local11] = local17;
		}
		Static145.method2153();
		return local4;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILclient!vd;)Z")
	public static boolean method3333(@OriginalArg(1) Class92 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static78.anInt1731; local16++) {
			if (arg0.method3241(Static27.aClass92Array5[local16])) {
				return true;
			}
		}
		return arg0.method3241(Static15.aClass8_Sub3_Sub1_1.aClass92_374);
	}
}
