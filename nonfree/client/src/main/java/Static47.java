import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
	public static int anInt1130;

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "Lclient!h;")
	public static Class30 aClass30_8 = new Class30();

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "Lclient!nd;")
	public static Class59 aClass59_9 = new Class59(50);

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "[I")
	public static int[] anIntArray95 = new int[256];

	@OriginalMember(owner = "client!fa", name = "h", descriptor = "[Lclient!pc;")
	public static Class67[] aClass67Array1 = new Class67[16];

	@OriginalMember(owner = "client!fa", name = "i", descriptor = "Lclient!tg;")
	private static Class81 aClass81_408 = Static120.method2057("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!fa", name = "j", descriptor = "Lclient!tg;")
	public static Class81 aClass81_409 = aClass81_408;

	@OriginalMember(owner = "client!fa", name = "k", descriptor = "Lclient!tg;")
	public static Class81 aClass81_410 = Static120.method2057("<img=1>");

	@OriginalMember(owner = "client!fa", name = "l", descriptor = "Lclient!tg;")
	public static Class81 aClass81_411 = Static120.method2057("http:)4)4");

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)V")
	public static void method850(@OriginalArg(0) int arg0) {
		Static132.anInt2865 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!rh;I)Z")
	public static boolean method851(@OriginalArg(0) Class77 arg0) {
		if (arg0.anIntArray340 == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < arg0.anIntArray340.length; local17++) {
			@Pc(24) int local24 = Static155.method2687(local17, arg0);
			@Pc(29) int local29 = arg0.anIntArray341[local17];
			if (arg0.anIntArray340[local17] == 2) {
				if (local29 <= local24) {
					return false;
				}
			} else if (arg0.anIntArray340[local17] == 3) {
				if (local29 >= local24) {
					return false;
				}
			} else if (arg0.anIntArray340[local17] == 4) {
				if (local29 == local24) {
					return false;
				}
			} else if (local29 != local24) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
	public static void method852() {
		aClass81_408 = null;
		anIntArray95 = null;
		aClass81_411 = null;
		aClass30_8 = null;
		aClass81_410 = null;
		aClass59_9 = null;
		aClass67Array1 = null;
		aClass81_409 = null;
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(II)Lclient!hd;")
	public static Class1_Sub2_Sub9 method854(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub2_Sub9 local12 = (Class1_Sub2_Sub9) Static10.aClass59_1.method1970((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static152.aClass82_Sub1_16.method2942(0, arg0);
		if (local22 == null) {
			return null;
		}
		local12 = new Class1_Sub2_Sub9();
		@Pc(35) Class1_Sub8 local35 = new Class1_Sub8(local22);
		@Pc(37) int local37 = 0;
		local35.anInt446 = local35.aByteArray3.length - 12;
		@Pc(48) int local48 = local35.method347();
		local12.anInt1660 = local35.method359();
		local12.anInt1654 = local35.method359();
		local12.anInt1653 = local35.method359();
		local12.anInt1652 = local35.method359();
		local35.anInt446 = 0;
		local12.aClass81_554 = local35.method346();
		local12.aClass81Array6 = new Class81[local48];
		local12.anIntArray136 = new int[local48];
		local12.anIntArray135 = new int[local48];
		while (local35.anInt446 < local35.aByteArray3.length - 12) {
			@Pc(99) int local99 = local35.method359();
			if (local99 == 3) {
				local12.aClass81Array6[local37] = local35.method344();
			} else if (local99 >= 100 || local99 == 21 || local99 == 38 || local99 == 39) {
				local12.anIntArray136[local37] = local35.method336();
			} else {
				local12.anIntArray136[local37] = local35.method347();
			}
			local12.anIntArray135[local37++] = local99;
		}
		Static10.aClass59_1.method1973(local12, (long) arg0);
		return local12;
	}
}
