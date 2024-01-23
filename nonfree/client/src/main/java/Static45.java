import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "Lclient!lc;")
	public static Class98 aClass98_25;

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString23 = "Loaded config";

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "[I")
	public static int[] anIntArray116 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "Lclient!cc;")
	public static Class22 aClass22_6 = null;

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString24 = "glow3:";

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)Lclient!ef;")
	public static Class41 method707(@OriginalArg(0) int arg0) {
		@Pc(6) Class41 local6 = (Class41) Static247.aClass33_35.method841((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(22) byte[] local22 = Static276.aClass98_162.method2396(arg0, 30);
		local6 = new Class41();
		if (local22 != null) {
			local6.method960(new Class4_Sub17(local22), arg0);
		}
		Static247.aClass33_35.method845(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
	public static void method709() {
		Static106.method1732();
		Static196.method3057();
		Static44.method703();
		Static190.method3013();
		Static180.method2837();
		Static43.method4371();
		Static278.method4124();
		Static161.method2517();
		Static28.method434();
		Static164.method2591();
		Static30.method460();
		Static18.method328();
		Static122.method2060();
		Static99.method1611();
		Static68.method1043();
		Static179.method2816();
		Static176.method667();
		Static57.method927();
		Static290.method4308();
		Static126.method2090();
		Static3.aClass33_1.method843();
		Static95.aClass33_14.method843();
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZJIZZILjava/lang/String;Ljava/lang/String;II)V")
	public static void method710(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7, @OriginalArg(8) String arg8, @OriginalArg(9) int arg9) {
		@Pc(25) int[] local25 = new int[4];
		for (@Pc(27) int local27 = 0; local27 < 3; local27++) {
			local25[local27] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(45) Class4_Sub17 local45 = new Class4_Sub17(128);
		local45.method1861(10);
		local45.method1875((arg1 ? 1 : 0) | (arg4 ? 2 : 0) | (arg5 ? 4 : 0));
		local45.method1891(arg2);
		local45.method1854(local25[0]);
		local45.method1849(arg7);
		local45.method1854(local25[1]);
		local45.method1875(Static168.anInt3340);
		local45.method1861(arg9);
		local45.method1861(arg6);
		local45.method1854(local25[2]);
		local45.method1875(arg3);
		local45.method1875(arg0);
		local45.method1854(local25[3]);
		local45.method1857(Static138.aBigInteger1, Static172.aBigInteger2);
		@Pc(133) Class4_Sub17 local133 = new Class4_Sub17(350);
		local133.method1849(arg8);
		@Pc(146) int local146 = 8 - Static255.method3839(arg8) % 8;
		for (@Pc(148) int local148 = 0; local148 < local146; local148++) {
			local133.method1861((int) (Math.random() * 255.0D));
		}
		local133.method1881(local25);
		Static142.aClass4_Sub17_Sub1_3.anInt2400 = 0;
		Static142.aClass4_Sub17_Sub1_3.method1861(22);
		Static142.aClass4_Sub17_Sub1_3.method1875(local45.anInt2400 + local133.anInt2400 + 2);
		Static142.aClass4_Sub17_Sub1_3.method1875(542);
		Static142.aClass4_Sub17_Sub1_3.method1878(local45.anInt2400, local45.aByteArray30);
		Static142.aClass4_Sub17_Sub1_3.method1878(local133.anInt2400, local133.aByteArray30);
		Static171.anInt3391 = -3;
		Static81.anInt4026 = 1;
		Static227.anInt3978 = 0;
		Static101.anInt4751 = 0;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BCILjava/lang/StringBuffer;)Ljava/lang/StringBuffer;")
	public static StringBuffer method711(@OriginalArg(3) StringBuffer arg0) {
		@Pc(8) int local8 = arg0.length();
		arg0.setLength(0);
		for (@Pc(13) int local13 = local8; local13 < 0; local13++) {
			arg0.setCharAt(local13, ' ');
		}
		return arg0;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
	public static void method712() {
		aClass98_25 = null;
		anIntArray116 = null;
		aString23 = null;
		aString24 = null;
		aClass22_6 = null;
	}
}
