import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!fd", name = "fb", descriptor = "[I")
	public static int[] anIntArray118;

	@OriginalMember(owner = "client!fd", name = "B", descriptor = "B")
	public static byte aByte3 = 0;

	@OriginalMember(owner = "client!fd", name = "C", descriptor = "Lclient!qe;")
	public static Class5_Sub11 aClass5_Sub11_3 = new Class5_Sub11(8);

	@OriginalMember(owner = "client!fd", name = "E", descriptor = "Lclient!vc;")
	public static Class71 aClass71_526 = Static38.method736("huffman");

	@OriginalMember(owner = "client!fd", name = "J", descriptor = "I")
	public static int anInt963 = 0;

	@OriginalMember(owner = "client!fd", name = "M", descriptor = "Lclient!vc;")
	private static Class71 aClass71_527 = Static38.method736("Enter amount:");

	@OriginalMember(owner = "client!fd", name = "R", descriptor = "Lclient!vc;")
	public static Class71 aClass71_528 = aClass71_527;

	@OriginalMember(owner = "client!fd", name = "db", descriptor = "Lclient!vc;")
	private static Class71 aClass71_537 = Static38.method736("Please try using a different world)3");

	@OriginalMember(owner = "client!fd", name = "S", descriptor = "Lclient!vc;")
	public static Class71 aClass71_529 = aClass71_537;

	@OriginalMember(owner = "client!fd", name = "T", descriptor = "Lclient!vc;")
	public static Class71 aClass71_530 = Static38.method736("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!fd", name = "U", descriptor = "Lclient!vc;")
	public static Class71 aClass71_531 = aClass71_537;

	@OriginalMember(owner = "client!fd", name = "V", descriptor = "I")
	public static int anInt969 = 0;

	@OriginalMember(owner = "client!fd", name = "W", descriptor = "Lclient!vc;")
	private static Class71 aClass71_532 = Static38.method736("Attack");

	@OriginalMember(owner = "client!fd", name = "X", descriptor = "Lclient!vc;")
	public static Class71 aClass71_533 = aClass71_537;

	@OriginalMember(owner = "client!fd", name = "Y", descriptor = "Lclient!vc;")
	public static Class71 aClass71_534 = Static38.method736("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!fd", name = "Z", descriptor = "Lclient!vc;")
	public static Class71 aClass71_535 = aClass71_537;

	@OriginalMember(owner = "client!fd", name = "ab", descriptor = "I")
	public static int anInt970 = 0;

	@OriginalMember(owner = "client!fd", name = "bb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_536 = aClass71_537;

	@OriginalMember(owner = "client!fd", name = "cb", descriptor = "[[[Lclient!pb;")
	public static Class52[][][] aClass52ArrayArrayArray1 = new Class52[4][104][104];

	@OriginalMember(owner = "client!fd", name = "eb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_538 = aClass71_537;

	@OriginalMember(owner = "client!fd", name = "gb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_539 = aClass71_532;

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V")
	public static void method700() {
		aClass71_538 = null;
		aClass71_539 = null;
		aClass71_534 = null;
		aClass71_530 = null;
		aClass71_537 = null;
		aClass71_536 = null;
		aClass71_531 = null;
		aClass71_535 = null;
		aClass71_529 = null;
		aClass52ArrayArrayArray1 = null;
		anIntArray118 = null;
		aClass71_533 = null;
		aClass5_Sub11_3 = null;
		aClass71_527 = null;
		aClass71_528 = null;
		aClass71_526 = null;
		aClass71_532 = null;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZLclient!nb;Lclient!nb;Z)V")
	public static void method701(@OriginalArg(1) Class24 arg0, @OriginalArg(2) Class24 arg1, @OriginalArg(3) boolean arg2) {
		Static20.aBoolean27 = arg2;
		Static88.aClass24_17 = arg0;
		Static23.aClass24_5 = arg1;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!nb;Lclient!vc;Lclient!vc;I)[Lclient!vd;")
	public static Class5_Sub1_Sub10_Sub3[] method702(@OriginalArg(0) Class24 arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) Class71 arg2) {
		@Pc(4) int local4 = arg0.method650(arg2);
		@Pc(19) int local19 = arg0.method664(arg1, local4);
		return Static51.method964(local19, local4, arg0);
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)V")
	public static void method703() {
		if (Static21.aBoolean28 && Static23.anInt728 != Static19.anInt644) {
			Static17.method483(Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray264[0], Static8.anInt286, Static23.anInt728, Static112.anInt2660, Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray261[0]);
		} else if (Static23.anInt728 != Static101.anInt2385) {
			Static101.anInt2385 = Static23.anInt728;
			Static38.method741(Static23.anInt728);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "([Lclient!ic;IIIILclient!l;BI[BII)V")
	public static void method704(@OriginalArg(0) Class33[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class43 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(19) Class5_Sub11 local19 = new Class5_Sub11(arg7);
		@Pc(21) int local21 = -1;
		while (true) {
			@Pc(25) int local25 = local19.method1535();
			if (local25 == 0) {
				return;
			}
			local21 += local25;
			@Pc(33) int local33 = 0;
			while (true) {
				@Pc(37) int local37 = local19.method1535();
				if (local37 == 0) {
					break;
				}
				local33 += local37 - 1;
				@Pc(49) int local49 = local33 & 0x3F;
				@Pc(55) int local55 = local33 >> 6 & 0x3F;
				@Pc(59) int local59 = local33 >> 12;
				@Pc(63) int local63 = local19.method1546();
				@Pc(67) int local67 = local63 >> 2;
				@Pc(71) int local71 = local63 & 0x3;
				if (arg4 == local59 && local55 >= arg1 && arg1 + 8 > local55 && local49 >= arg3 && local49 < arg3 + 8) {
					@Pc(94) Class5_Sub1_Sub15 local94 = Static97.method1606(local21);
					@Pc(111) int local111 = arg8 + Static58.method1032(local94.anInt2572, local49 & 0x7, local94.anInt2559, local71, arg2, local55 & 0x7);
					@Pc(128) int local128 = arg9 + Static100.method1632(arg2, local94.anInt2559, local49 & 0x7, local55 & 0x7, local94.anInt2572, local71);
					if (local111 > 0 && local128 > 0 && local111 < 103 && local128 < 103) {
						@Pc(145) int local145 = arg6;
						if ((Static59.aByteArrayArrayArray2[1][local111][local128] & 0x2) == 2) {
							local145 = arg6 - 1;
						}
						@Pc(161) Class33 local161 = null;
						if (local145 >= 0) {
							local161 = arg0[local145];
						}
						Static66.method1132(arg2 + local71 & 0x3, local67, local111, local161, arg6, local21, local128, arg5);
					}
				}
			}
		}
	}
}
