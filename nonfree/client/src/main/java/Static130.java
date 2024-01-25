import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!eh", name = "u", descriptor = "I")
	public static int anInt2076;

	@OriginalMember(owner = "client!eh", name = "r", descriptor = "Lclient!we;")
	public static Class389 aClass389_5;

	@OriginalMember(owner = "client!eh", name = "F", descriptor = "Lclient!rg;")
	public static Class310 aClass310_31;

	@OriginalMember(owner = "client!eh", name = "s", descriptor = "[I")
	public static int[] anIntArray134;

	@OriginalMember(owner = "client!eh", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString30 = null;

	@OriginalMember(owner = "client!eh", name = "C", descriptor = "I")
	public static int anInt2077 = 0;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method2006(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(10) int local10 = 0; local10 < Static458.anInt7639; local10++) {
			if (arg0.equalsIgnoreCase(Static331.aStringArray26[local10])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static95.aStringArray12[local10])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "(I)Z")
	public static boolean method2009() {
		@Pc(10) Class14_Sub15 local10 = (Class14_Sub15) Static79.aClass32_5.method584();
		if (local10 == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < local10.anInt2025; local17++) {
			if (local10.aClass230Array2[local17] != null && local10.aClass230Array2[local17].anInt6256 == 0) {
				return false;
			}
			if (local10.aClass230Array1[local17] != null && local10.aClass230Array1[local17].anInt6256 == 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BLclient!jc;)V")
	public static void method2010(@OriginalArg(1) Class14_Sub21 arg0) {
		if (arg0.aByteArray99.length - arg0.anInt8936 < 1) {
			return;
		}
		@Pc(20) int local20 = arg0.method7695(124);
		if (local20 < 0 || local20 > 1 || arg0.aByteArray99.length - arg0.anInt8936 < 2) {
			return;
		}
		@Pc(47) int local47 = arg0.method7717(-1978450544);
		if (local47 * 6 > arg0.aByteArray99.length - arg0.anInt8936) {
			return;
		}
		for (@Pc(74) int local74 = 0; local74 < local47; local74++) {
			@Pc(80) int local80 = arg0.method7717(-1978450544);
			@Pc(84) int local84 = arg0.method7748();
			if (Static184.anIntArray401.length > local80 && Static195.aBooleanArray6[local80] && (Static365.aClass331_1.method8080(local80).aChar7 != '1' || local84 >= -1 && local84 <= 1)) {
				Static184.anIntArray401[local80] = local84;
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "([III[IB)V")
	public static void method2011(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		if (arg2 <= arg1) {
			return;
		}
		@Pc(26) int local26 = (arg2 + arg1) / 2;
		@Pc(28) int local28 = arg1;
		@Pc(32) int local32 = arg0[local26];
		arg0[local26] = arg0[arg2];
		arg0[arg2] = local32;
		@Pc(46) int local46 = arg3[local26];
		arg3[local26] = arg3[arg2];
		arg3[arg2] = local46;
		@Pc(66) int local66 = ~local32 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(68) int local68 = arg1; local68 < arg2; local68++) {
			if (arg0[local68] < local32 + (local66 & local68)) {
				@Pc(85) int local85 = arg0[local68];
				arg0[local68] = arg0[local28];
				arg0[local28] = local85;
				@Pc(99) int local99 = arg3[local68];
				arg3[local68] = arg3[local28];
				arg3[local28++] = local99;
			}
		}
		arg0[arg2] = arg0[local28];
		arg0[local28] = local32;
		arg3[arg2] = arg3[local28];
		arg3[local28] = local46;
		method2011(arg0, arg1, local28 - 1, arg3);
		method2011(arg0, local28 + 1, arg2, arg3);
	}
}
