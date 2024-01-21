import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!ed", name = "q", descriptor = "Lclient!rh;")
	public static Class77 aClass77_6;

	@OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
	public static int anInt1063;

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "Lclient!tg;")
	private static Class81 aClass81_365 = Static120.method2057("Type");

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "Lclient!tg;")
	public static Class81 aClass81_366 = Static120.method2057("titlebutton");

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "Lclient!tg;")
	public static Class81 aClass81_367 = Static120.method2057("mapflag");

	@OriginalMember(owner = "client!ed", name = "m", descriptor = "Lclient!tg;")
	public static Class81 aClass81_368 = Static120.method2057("Sprites geladen)3");

	@OriginalMember(owner = "client!ed", name = "n", descriptor = "Lclient!h;")
	public static Class30 aClass30_7 = new Class30();

	@OriginalMember(owner = "client!ed", name = "r", descriptor = "Lclient!tg;")
	public static Class81 aClass81_369 = aClass81_365;

	@OriginalMember(owner = "client!ed", name = "w", descriptor = "Lclient!tg;")
	private static Class81 aClass81_371 = Static120.method2057("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!ed", name = "t", descriptor = "Lclient!tg;")
	public static Class81 aClass81_370 = aClass81_371;

	@OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
	public static int anInt1064 = 1;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIILclient!rh;)V")
	public static void method798(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class77 arg2) {
		if (Static89.anInt4029 != 0 && Static89.anInt4029 != 3) {
			return;
		}
		@Pc(19) int local19 = arg0 - arg2.anInt3245 / 2;
		@Pc(26) int local26 = arg1 - arg2.anInt3217 / 2;
		@Pc(32) int local32 = Static35.anInt964 + Static2.anInt37 & 0x7FF;
		@Pc(36) int local36 = Class1_Sub2_Sub2_Sub1.anIntArray30[local32];
		@Pc(44) int local44 = (Static160.anInt3643 + 256) * local36 >> 8;
		@Pc(48) int local48 = Class1_Sub2_Sub2_Sub1.anIntArray33[local32];
		@Pc(56) int local56 = (Static160.anInt3643 + 256) * local48 >> 8;
		@Pc(66) int local66 = local56 * local19 - local26 * local44 >> 11;
		@Pc(77) int local77 = local19 * local44 + local56 * local26 >> 11;
		@Pc(85) int local85 = Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anInt3040 + local77 >> 7;
		@Pc(98) int local98 = Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anInt3026 - local66 >> 7;
		@Pc(118) boolean local118 = Static139.method2339(true, 0, 0, 1, 0, Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anIntArray326[0], local85, Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anIntArray324[0], local98, 0, 0);
		if (!local118) {
			return;
		}
		Static104.aClass1_Sub8_Sub1_2.method331(local26);
		Static104.aClass1_Sub8_Sub1_2.method331(local19);
		Static104.aClass1_Sub8_Sub1_2.method337(Static35.anInt964);
		Static104.aClass1_Sub8_Sub1_2.method331(57);
		Static104.aClass1_Sub8_Sub1_2.method331(Static2.anInt37);
		Static104.aClass1_Sub8_Sub1_2.method331(Static160.anInt3643);
		Static104.aClass1_Sub8_Sub1_2.method331(89);
		Static104.aClass1_Sub8_Sub1_2.method337(Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anInt3040);
		Static104.aClass1_Sub8_Sub1_2.method337(Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anInt3026);
		Static104.aClass1_Sub8_Sub1_2.method331(Static37.anInt979);
		Static104.aClass1_Sub8_Sub1_2.method331(63);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!de;IB)V")
	public static void method799(@OriginalArg(0) Class1_Sub2_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		Static43.method818(arg0.anInt3040, arg1, arg0.anInt3026);
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)Lclient!rh;")
	public static Class77 method800(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static131.aClass77ArrayArray1[local3] == null || Static131.aClass77ArrayArray1[local3][local11] == null) {
			@Pc(25) boolean local25 = Static144.method2427(local3);
			if (!local25) {
				return null;
			}
		}
		return Static131.aClass77ArrayArray1[local3][local11];
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(II)I")
	public static int method803(@OriginalArg(0) int arg0) {
		return arg0 >> 17 & 0x7;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
	public static void method804() {
		aClass81_366 = null;
		aClass77_6 = null;
		aClass81_370 = null;
		aClass81_369 = null;
		aClass81_368 = null;
		aClass30_7 = null;
		aClass81_365 = null;
		aClass81_367 = null;
		aClass81_371 = null;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
	public static void method805() {
		@Pc(1) Object local1 = Static163.anObject4;
		synchronized (Static163.anObject4) {
			if (Static13.anInt268 == 0) {
				Static86.aClass68_2.method2226(5, new Class55());
			}
			Static13.anInt268 = 600;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I[SI[Lclient!tg;I)V")
	public static void method806(@OriginalArg(1) short[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class81[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg1) {
			return;
		}
		@Pc(18) int local18 = (arg1 + arg3) / 2;
		@Pc(20) int local20 = arg1;
		@Pc(24) Class81 local24 = arg2[local18];
		arg2[local18] = arg2[arg3];
		arg2[arg3] = local24;
		@Pc(38) short local38 = arg0[local18];
		arg0[local18] = arg0[arg3];
		arg0[arg3] = local38;
		for (@Pc(50) int local50 = arg1; local50 < arg3; local50++) {
			if (local24 == null || arg2[local50] != null && (local50 & 0x1) > arg2[local50].method2827(local24)) {
				@Pc(72) Class81 local72 = arg2[local50];
				arg2[local50] = arg2[local20];
				arg2[local20] = local72;
				@Pc(86) short local86 = arg0[local50];
				arg0[local50] = arg0[local20];
				arg0[local20++] = local86;
			}
		}
		arg2[arg3] = arg2[local20];
		arg2[local20] = local24;
		arg0[arg3] = arg0[local20];
		arg0[local20] = local38;
		method806(arg0, arg1, arg2, local20 - 1);
		method806(arg0, local20 + 1, arg2, arg3);
	}
}
