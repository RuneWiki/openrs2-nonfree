import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "[[Lclient!a;")
	public static Class1_Sub1_Sub1[][] aClass1_Sub1_Sub1ArrayArray1;

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
	public static int anInt2581;

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1248 = Static108.method1915(")1p");

	@OriginalMember(owner = "client!rb", name = "m", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1253 = Static108.method1915("Continue");

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1249 = aClass39_1253;

	@OriginalMember(owner = "client!rb", name = "r", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1257 = Static108.method1915("Connecting to update server");

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1250 = aClass39_1257;

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
	public static volatile int anInt2580 = -1;

	@OriginalMember(owner = "client!rb", name = "n", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1254 = Static108.method1915("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1251 = aClass39_1254;

	@OriginalMember(owner = "client!rb", name = "k", descriptor = "[I")
	public static int[] anIntArray396 = new int[4000];

	@OriginalMember(owner = "client!rb", name = "q", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1256 = Static108.method1915("Could not complete login)3");

	@OriginalMember(owner = "client!rb", name = "l", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1252 = aClass39_1256;

	@OriginalMember(owner = "client!rb", name = "o", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1255 = Static108.method1915("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!rb", name = "s", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1258 = Static108.method1915("Benutzen");

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I[BLclient!b;[Lclient!ge;IB)V")
	public static void method1820(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(3) Class23[] arg3, @OriginalArg(4) int arg4) {
		@Pc(10) Class1_Sub18 local10 = new Class1_Sub18(arg1);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(21) int local21 = local10.method2175();
			if (local21 == 0) {
				return;
			}
			local12 += local21;
			@Pc(29) int local29 = 0;
			while (true) {
				@Pc(33) int local33 = local10.method2175();
				if (local33 == 0) {
					break;
				}
				local29 += local33 - 1;
				@Pc(47) int local47 = local29 >> 6 & 0x3F;
				@Pc(51) int local51 = local29 >> 12;
				@Pc(55) int local55 = local29 & 0x3F;
				@Pc(59) int local59 = local10.method2169();
				@Pc(63) int local63 = local59 >> 2;
				@Pc(67) int local67 = local59 & 0x3;
				@Pc(71) int local71 = arg4 + local47;
				@Pc(75) int local75 = local55 + arg0;
				if (local71 > 0 && local75 > 0 && local71 < 103 && local75 < 103) {
					@Pc(94) int local94 = local51;
					@Pc(96) Class23 local96 = null;
					if ((Static51.aByteArrayArrayArray3[1][local71][local75] & 0x2) == 2) {
						local94 = local51 - 1;
					}
					if (local94 >= 0) {
						local96 = arg3[local94];
					}
					Static110.method1945(local51, local75, local63, arg2, local67, local12, local96, local71);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
	public static void method1822() {
		aClass39_1256 = null;
		aClass39_1249 = null;
		aClass1_Sub1_Sub1ArrayArray1 = null;
		aClass39_1253 = null;
		aClass39_1255 = null;
		aClass39_1251 = null;
		aClass39_1252 = null;
		aClass39_1250 = null;
		aClass39_1257 = null;
		anIntArray396 = null;
		aClass39_1248 = null;
		aClass39_1254 = null;
		aClass39_1258 = null;
	}
}
