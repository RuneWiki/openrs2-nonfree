import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
	public static int anInt1539;

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "Z")
	public static boolean aBoolean96;

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
	public static int anInt1535 = 0;

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "Lclient!v;")
	public static Class76 aClass76_641 = Static134.method2017("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "Lclient!v;")
	private static Class76 aClass76_645 = Static134.method2017("Loaded wordpack");

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "Lclient!v;")
	public static Class76 aClass76_642 = aClass76_645;

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "Lclient!v;")
	public static Class76 aClass76_643 = Static134.method2017("::");

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
	public static int anInt1537 = 0;

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "Lclient!v;")
	public static Class76 aClass76_644 = null;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
	public static void method1015() {
		aClass76_644 = null;
		aClass76_641 = null;
		aClass76_642 = null;
		aClass76_645 = null;
		aClass76_643 = null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIBZ)Lclient!v;")
	public static Class76 method1016(@OriginalArg(1) int arg0, @OriginalArg(3) boolean arg1) {
		@Pc(13) int local13 = arg0 / 10;
		@Pc(15) int local15 = 1;
		while (local13 != 0) {
			local15++;
			local13 /= 10;
		}
		@Pc(32) int local32 = local15;
		if (arg0 < 0 || arg1) {
			local32 = local15 + 1;
		}
		@Pc(51) byte[] local51 = new byte[local32];
		if (arg0 < 0) {
			local51[0] = 45;
		} else if (arg1) {
			local51[0] = 43;
		}
		for (@Pc(66) int local66 = 0; local66 < local15; local66++) {
			@Pc(71) int local71 = arg0 % 10;
			arg0 /= 10;
			if (local71 < 0) {
				local71 = -local71;
			}
			if (local71 > 9) {
				local71 += 39;
			}
			local51[local32 - local66 - 1] = (byte) (local71 + 48);
		}
		@Pc(104) Class76 local104 = new Class76();
		local104.anInt2668 = local32;
		local104.aByteArray71 = local51;
		return local104;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([Lclient!v;B)Lclient!v;")
	public static Class76 method1017(@OriginalArg(0) Class76[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static8.method106(arg0.length, 0, arg0);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZLclient!ef;I)V")
	public static void method1018(@OriginalArg(1) Class4_Sub4_Sub3_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anInt1397 > Static78.anInt1981) {
			Static75.method1373(arg0);
		} else if (Static78.anInt1981 > arg0.anInt1427) {
			Static132.method2011(arg0);
		} else {
			Static100.method1584(arg0);
		}
		if (arg0.anInt1393 < 128 || arg0.anInt1416 < 128 || arg0.anInt1393 >= 13184 || arg0.anInt1416 >= 13184) {
			arg0.anInt1397 = 0;
			arg0.anInt1427 = 0;
			arg0.anInt1416 = arg0.anIntArray180[0] * 128 + arg0.anInt1382 * 64;
			arg0.anInt1439 = -1;
			arg0.anInt1393 = arg0.anInt1382 * 64 + arg0.anIntArray184[0] * 128;
			arg0.anInt1390 = -1;
			arg0.method975();
		}
		if (Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1 == arg0 && (arg0.anInt1393 < 1536 || arg0.anInt1416 < 1536 || arg0.anInt1393 >= 11776 || arg0.anInt1416 >= 11776)) {
			arg0.anInt1393 = arg0.anIntArray184[0] * 128 + arg0.anInt1382 * 64;
			arg0.anInt1416 = arg0.anInt1382 * 64 + arg0.anIntArray180[0] * 128;
			arg0.anInt1390 = -1;
			arg0.anInt1397 = 0;
			arg0.anInt1427 = 0;
			arg0.anInt1439 = -1;
			arg0.method975();
		}
		Static20.method313(arg0);
		Static12.method153(arg0);
	}
}
