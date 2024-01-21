import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!ta", name = "M", descriptor = "J")
	public static long aLong119;

	@OriginalMember(owner = "client!ta", name = "t", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1426 = Static38.method736("@yel@");

	@OriginalMember(owner = "client!ta", name = "z", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1427 = Static38.method736("Malformed login packet)3");

	@OriginalMember(owner = "client!ta", name = "A", descriptor = "I")
	public static int anInt3010 = 1;

	@OriginalMember(owner = "client!ta", name = "B", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1428 = Static38.method736("(X100(U(Y");

	@OriginalMember(owner = "client!ta", name = "C", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1429 = Static38.method736("To play on this world move to a free area first");

	@OriginalMember(owner = "client!ta", name = "E", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1430 = aClass71_1427;

	@OriginalMember(owner = "client!ta", name = "G", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1431 = Static38.method736("mapmarker");

	@OriginalMember(owner = "client!ta", name = "I", descriptor = "I")
	public static int anInt3014 = 0;

	@OriginalMember(owner = "client!ta", name = "J", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1432 = Static38.method736("Menge eingeben:");

	@OriginalMember(owner = "client!ta", name = "N", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1433 = aClass71_1429;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)I")
	public static int method2007(@OriginalArg(0) int arg0) {
		@Pc(7) Class5_Sub1_Sub3 local7 = Static89.method1406(arg0);
		@Pc(15) int local15 = local7.anInt271;
		@Pc(18) int local18 = local7.anInt274;
		@Pc(21) int local21 = local7.anInt267;
		@Pc(27) int local27 = Class36.anIntArray159[local21 - local15];
		return Static23.anIntArray87[local18] >> local15 & local27;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V")
	public static void method2008() {
		aClass71_1426 = null;
		aClass71_1433 = null;
		aClass71_1429 = null;
		aClass71_1430 = null;
		aClass71_1431 = null;
		aClass71_1427 = null;
		aClass71_1428 = null;
		aClass71_1432 = null;
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(B)V")
	public static void method2010() {
		Static72.aClass54_29.method1402();
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIZI)Lclient!vc;")
	public static Class71 method2011(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(17) int local17 = 1;
		for (@Pc(26) int local26 = arg0 / 10; local26 != 0; local26 /= 10) {
			local17++;
		}
		@Pc(39) int local39 = local17;
		if (arg0 < 0 || arg1) {
			local39 = local17 + 1;
		}
		@Pc(50) byte[] local50 = new byte[local39];
		if (arg0 < 0) {
			local50[0] = 45;
		} else if (arg1) {
			local50[0] = 43;
		}
		for (@Pc(65) int local65 = 0; local65 < local17; local65++) {
			@Pc(70) int local70 = arg0 % 10;
			arg0 /= 10;
			if (local70 < 0) {
				local70 = -local70;
			}
			if (local70 > 9) {
				local70 += 39;
			}
			local50[local39 - local65 - 1] = (byte) (local70 + 48);
		}
		@Pc(110) Class71 local110 = new Class71();
		local110.aByteArray28 = local50;
		local110.anInt2736 = local39;
		return local110;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V")
	public static void method2012() {
		Static32.aClass54_20.method1402();
		Static3.aClass54_2.method1402();
	}
}
