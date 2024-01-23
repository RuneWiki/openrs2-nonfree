import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!mh", name = "n", descriptor = "Lclient!ai;")
	public static Class7 aClass7_22;

	@OriginalMember(owner = "client!mh", name = "o", descriptor = "Lclient!kh;")
	private static Class60 aClass60_940 = Static200.method3116("Please enter your password)3");

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "Lclient!kh;")
	public static Class60 aClass60_933 = aClass60_940;

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
	public static int anInt2763 = 0;

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
	public static int anInt2765 = 128;

	@OriginalMember(owner = "client!mh", name = "l", descriptor = "Lclient!kh;")
	private static Class60 aClass60_939 = Static200.method3116("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "Lclient!kh;")
	public static Class60 aClass60_934 = aClass60_939;

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "Lclient!kh;")
	public static Class60 aClass60_935 = Static200.method3116("::errortest");

	@OriginalMember(owner = "client!mh", name = "h", descriptor = "Lclient!kh;")
	private static Class60 aClass60_937 = Static200.method3116("Players");

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "Lclient!kh;")
	public static Class60 aClass60_936 = aClass60_937;

	@OriginalMember(owner = "client!mh", name = "j", descriptor = "Lclient!kh;")
	public static Class60 aClass60_938 = Static200.method3116("(U2");

	@OriginalMember(owner = "client!mh", name = "k", descriptor = "[I")
	public static int[] anIntArray353 = new int[2048];

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IBI)V")
	public static void method2105(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class19 local11 = Static128.aClass19ArrayArrayArray1[Static180.anInt3841][arg1][arg0];
		if (local11 == null) {
			Static135.method2252(Static180.anInt3841, arg1, arg0);
			return;
		}
		@Pc(20) Class1_Sub1_Sub16 local20 = null;
		@Pc(25) Class1_Sub1_Sub16 local25 = (Class1_Sub1_Sub16) local11.method609();
		@Pc(27) int local27 = -99999999;
		while (local25 != null) {
			@Pc(34) Class1_Sub1_Sub18 local34 = Static191.method2990(local25.aClass9_Sub5_1.anInt1521);
			@Pc(37) int local37 = local34.anInt2996;
			if (local34.anInt3014 == 1) {
				local37 *= local25.aClass9_Sub5_1.anInt1525 + 1;
			}
			if (local27 < local37) {
				local20 = local25;
				local27 = local37;
			}
			local25 = (Class1_Sub1_Sub16) local11.method615();
		}
		if (local20 == null) {
			Static135.method2252(Static180.anInt3841, arg1, arg0);
			return;
		}
		@Pc(86) Class9_Sub5 local86 = null;
		@Pc(88) Class9_Sub5 local88 = null;
		local11.method618(local20);
		for (local25 = (Class1_Sub1_Sub16) local11.method609(); local25 != null; local25 = (Class1_Sub1_Sub16) local11.method615()) {
			@Pc(101) Class9_Sub5 local101 = local25.aClass9_Sub5_1;
			if (local20.aClass9_Sub5_1.anInt1521 != local101.anInt1521) {
				if (local88 == null) {
					local88 = local101;
				}
				if (local88.anInt1521 != local101.anInt1521 && local86 == null) {
					local86 = local101;
				}
			}
		}
		@Pc(136) long local136 = (long) (arg1 + (arg0 << 7) + 1610612736);
		Static82.method1452(Static180.anInt3841, arg1, arg0, Static165.method2268(arg0 * 128 + 64, Static180.anInt3841, arg1 * 128 + 64), local20.aClass9_Sub5_1, local136, local88, local86);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLclient!mg;Lclient!mg;)V")
	public static void method2106(@OriginalArg(1) Class1_Sub1_Sub14 arg0, @OriginalArg(2) Class1_Sub1_Sub14 arg1) {
		if (Static153.aClass1_Sub1_Sub6Array8 == null) {
			Static153.aClass1_Sub1_Sub6Array8 = Static30.method549(0, Static152.aClass7_Sub1_23, Static74.anInt1831);
		}
		if (Static191.aClass73Array8 == null) {
			Static191.aClass73Array8 = Static197.method3070(Static152.aClass7_Sub1_23, 0, Static55.anInt1477);
		}
		if (Static89.aClass73Array3 == null) {
			Static89.aClass73Array3 = Static197.method3070(Static152.aClass7_Sub1_23, 0, Static218.anInt4729);
		}
		if (Static71.aClass73Array1 == null) {
			Static71.aClass73Array1 = Static197.method3070(Static152.aClass7_Sub1_23, 0, Static92.anInt2174);
		}
		Static76.method1367(0, 23, 765, 480, 0);
		Static76.method1361(0, 0, 138, 23, 12425273, 9135624);
		Static76.method1361(138, 0, 640, 23, 5197647, 2697513);
		arg0.method3314(Static139.aClass60_1091, 69, 15, 0, -1);
		if (Static71.aClass73Array1 != null) {
			Static71.aClass73Array1[1].method2270(140, 1);
			arg1.method3317(Static145.aClass60_632, 152, 10, 16777215, -1);
			Static71.aClass73Array1[0].method2270(140, 12);
			arg1.method3317(Static82.aClass60_642, 152, 21, 16777215, -1);
		}
		if (Static89.aClass73Array3 != null) {
			if (Static64.anIntArray184[0] == 0 && Static23.anIntArray333[0] == 0) {
				Static89.aClass73Array3[2].method2270(280, 4);
			} else {
				Static89.aClass73Array3[0].method2270(280, 4);
			}
			if (Static64.anIntArray184[0] == 0 && Static23.anIntArray333[0] == 1) {
				Static89.aClass73Array3[3].method2270(295, 4);
			} else {
				Static89.aClass73Array3[1].method2270(295, 4);
			}
			arg0.method3317(Static197.aClass60_1440, 312, 17, 16777215, -1);
			if (Static64.anIntArray184[0] == 1 && Static23.anIntArray333[0] == 0) {
				Static89.aClass73Array3[2].method2270(390, 4);
			} else {
				Static89.aClass73Array3[0].method2270(390, 4);
			}
			if (Static64.anIntArray184[0] == 1 && Static23.anIntArray333[0] == 1) {
				Static89.aClass73Array3[3].method2270(405, 4);
			} else {
				Static89.aClass73Array3[1].method2270(405, 4);
			}
			arg0.method3317(aClass60_936, 422, 17, 16777215, -1);
			if (Static64.anIntArray184[0] == 2 && Static23.anIntArray333[0] == 0) {
				Static89.aClass73Array3[2].method2270(500, 4);
			} else {
				Static89.aClass73Array3[0].method2270(500, 4);
			}
			if (Static64.anIntArray184[0] == 2 && Static23.anIntArray333[0] == 1) {
				Static89.aClass73Array3[3].method2270(515, 4);
			} else {
				Static89.aClass73Array3[1].method2270(515, 4);
			}
			arg0.method3317(Static162.aClass60_1627, 532, 17, 16777215, -1);
			if (Static64.anIntArray184[0] == 3 && Static23.anIntArray333[0] == 0) {
				Static89.aClass73Array3[2].method2270(610, 4);
			} else {
				Static89.aClass73Array3[0].method2270(610, 4);
			}
			if (Static64.anIntArray184[0] == 3 && Static23.anIntArray333[0] == 1) {
				Static89.aClass73Array3[3].method2270(625, 4);
			} else {
				Static89.aClass73Array3[1].method2270(625, 4);
			}
			arg0.method3317(Static129.aClass60_378, 642, 17, 16777215, -1);
		}
		Static76.method1367(700, 4, 58, 16, 0);
		arg1.method3314(Static185.aClass60_1341, 729, 16, 16777215, -1);
		Static91.anInt2135 = -1;
		if (Static153.aClass1_Sub1_Sub6Array8 == null) {
			return;
		}
		@Pc(400) int local400 = 8;
		@Pc(406) int local406 = 24;
		@Pc(408) int local408;
		@Pc(410) int local410;
		do {
			local408 = local406;
			local410 = local400;
			if (Static89.anInt2073 <= (local400 - 1) * local406) {
				local400--;
			}
			if ((local406 - 1) * local400 >= Static89.anInt2073) {
				local406--;
			}
			if (Static89.anInt2073 <= (local406 - 1) * local400) {
				local406--;
			}
		} while (local408 != local406 || local400 != local410);
		local408 = (765 - local400 * 88) / (local400 + 1);
		if (local408 > 5) {
			local408 = 5;
		}
		local410 = (480 - local406 * 19) / (local406 + 1);
		@Pc(487) int local487 = (765 - local400 * 88 - (local400 + -1) * local408) / 2;
		if (local410 > 5) {
			local410 = 5;
		}
		@Pc(496) int local496 = local487;
		@Pc(498) int local498 = 0;
		@Pc(514) int local514 = (480 - (local406 - 1) * local410 - local406 * 19) / 2;
		@Pc(518) int local518 = local514 + 23;
		for (@Pc(520) int local520 = 0; local520 < Static89.anInt2073; local520++) {
			@Pc(524) boolean local524 = true;
			@Pc(528) Class63 local528 = Static179.aClass63Array3[local520];
			@Pc(533) Class60 local533 = Static40.method681(local528.anInt2620);
			if (local528.anInt2620 == -1) {
				local533 = Static140.aClass60_1102;
				local524 = false;
			} else if (local528.anInt2620 > 1980) {
				local524 = false;
				local533 = Static8.aClass60_75;
			}
			if (Static122.anInt2732 >= local496 && Static176.anInt768 >= local518 && local496 + 88 > Static122.anInt2732 && local518 + 19 > Static176.anInt768 && local524) {
				Static91.anInt2135 = local520;
				Static153.aClass1_Sub1_Sub6Array8[local528.aBoolean143 ? 1 : 0].method2155(local496, local518);
			} else {
				Static153.aClass1_Sub1_Sub6Array8[local528.aBoolean143 ? 1 : 0].method2166(local496, local518);
			}
			if (Static191.aClass73Array8 != null) {
				Static191.aClass73Array8[(local528.aBoolean143 ? 8 : 0) + local528.anInt2623].method2270(local496 + 29, local518);
			}
			arg0.method3314(Static40.method681(local528.anInt2629), local496 + 15, local518 + 5 - -9, 0, -1);
			arg1.method3314(local533, local496 + 60, local518 + 14, 268435455, -1);
			local518 += local410 + 19;
			@Pc(664) int local664 = ~local406;
			local498++;
			if (local664 >= ~local498) {
				local496 += local408 + 88;
				local498 = 0;
				local518 = local514 + 23;
			}
		}
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(B)[Lclient!nb;")
	public static Class1_Sub1_Sub6_Sub1[] method2107() {
		@Pc(13) Class1_Sub1_Sub6_Sub1[] local13 = new Class1_Sub1_Sub6_Sub1[Static180.anInt3836];
		for (@Pc(15) int local15 = 0; local15 < Static180.anInt3836; local15++) {
			@Pc(25) int local25 = Static181.anIntArray504[local15] * Static10.anIntArray46[local15];
			@Pc(29) byte[] local29 = Static96.aByteArrayArray4[local15];
			@Pc(32) int[] local32 = new int[local25];
			for (@Pc(34) int local34 = 0; local34 < local25; local34++) {
				local32[local34] = Static110.anIntArray317[local29[local34] & 0xFF];
			}
			local13[local15] = new Class1_Sub1_Sub6_Sub1(Static97.anInt2261, Static176.anInt777, Static91.anIntArray251[local15], Static97.anIntArray263[local15], Static181.anIntArray504[local15], Static10.anIntArray46[local15], local32);
		}
		Static43.method711();
		return local13;
	}
}
