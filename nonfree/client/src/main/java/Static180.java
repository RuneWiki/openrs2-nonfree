import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "Lclient!qe;")
	public static Class78 aClass78_727 = Static199.method3560("headicons_pk");

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "Lclient!qe;")
	public static Class78 aClass78_728 = Static199.method3560("::");

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
	public static int anInt4191 = 0;

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "Lclient!qe;")
	public static Class78 aClass78_729 = Static199.method3560("Speicher wird zugewiesen)3");

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
	public static int anInt4193 = 0;

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
	public static int anInt4194 = 3;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(III[BIZI[Lclient!tb;)V")
	public static void method3306(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) Class90[] arg5) {
		@Pc(21) int local21;
		@Pc(25) int local25;
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			for (local21 = 0; local21 < 64; local21++) {
				for (local25 = 0; local25 < 64; local25++) {
					if (local21 + arg1 > 0 && arg1 + local21 < 103 && arg0 + local25 > 0 && local25 + arg0 < 103) {
						arg5[local17].anIntArrayArray41[local21 + arg1][local25 + arg0] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(101) Class2_Sub23 local101 = new Class2_Sub23(arg2);
		for (local21 = 0; local21 < 4; local21++) {
			for (local25 = 0; local25 < 64; local25++) {
				for (@Pc(123) int local123 = 0; local123 < 64; local123++) {
					Static147.method3178(local101, 0, arg4, arg3, local123 + arg0, local25 - -arg1, local21);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!mj;ILclient!nc;IILclient!nc;II)V")
	public static void method3307(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub3_Sub7 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class2_Sub3_Sub7 arg5, @OriginalArg(7) int arg6) {
		Static8.aClass64_3 = arg0;
		Static49.anInt886 = arg4;
		Static78.anInt1714 = arg3;
		Static61.anInt1050 = arg6;
		Static35.anInt586 = arg1;
		if (Static112.aClass47_1 != null) {
			return;
		}
		Static23.aBoolean13 = true;
		if (Static98.aClass2_Sub3_Sub8Array6 == null) {
			Static98.aClass2_Sub3_Sub8Array6 = Static74.method1234(Static215.aClass72_Sub1_33, Static194.anInt4455);
		}
		if (Static62.aClass79Array4 == null) {
			Static62.aClass79Array4 = Static59.method767(Static215.aClass72_Sub1_33, Static8.anInt266);
		}
		if (Static160.aClass79Array6 == null) {
			Static160.aClass79Array6 = Static59.method767(Static215.aClass72_Sub1_33, Static154.anInt3545);
		}
		if (Static198.aClass79Array7 == null) {
			Static198.aClass79Array7 = Static59.method767(Static215.aClass72_Sub1_33, Static187.anInt4357);
		}
		@Pc(58) int local58 = Static61.anInt1050 / 5 * 4;
		@Pc(62) int local62 = Static61.anInt1050 / 5;
		Static217.method3749(Static49.anInt886, Static35.anInt586, Static61.anInt1050, Static78.anInt1714, 0, 168);
		Static217.method3763(Static49.anInt886, Static35.anInt586, local62, 23, 12425273, 9135624);
		Static217.method3763(local62 + Static49.anInt886, Static35.anInt586, local58, 23, 5197647, 2697513);
		arg5.method886(Static57.aClass78_116, local62 / 2 + Static49.anInt886, Static35.anInt586 - -15, 0, -1);
		if (Static198.aClass79Array7 != null) {
			Static198.aClass79Array7[1].method3071(Static49.anInt886 + local62 + 2, Static35.anInt586 + 1);
			arg2.method904(Static79.aClass78_382, local62 + Static49.anInt886 + 12, Static35.anInt586 - -10, 16777215, -1);
			Static198.aClass79Array7[0].method3071(Static49.anInt886 + local62 + 2, Static35.anInt586 + 12);
			arg2.method904(Static31.aClass78_101, local62 + Static49.anInt886 + 12, Static35.anInt586 - -21, 16777215, -1);
		}
		@Pc(325) int local325;
		@Pc(406) int local406;
		if (Static160.aClass79Array6 != null) {
			@Pc(159) int local159 = Static49.anInt886 + local62 + 140;
			if (Static154.anIntArray576[0] == 0 && Static55.anIntArray155[0] == 0) {
				Static160.aClass79Array6[2].method3071(local159, Static35.anInt586 + 4);
			} else {
				Static160.aClass79Array6[0].method3071(local159, Static35.anInt586 + 4);
			}
			if (Static154.anIntArray576[0] == 0 && Static55.anIntArray155[0] == 1) {
				Static160.aClass79Array6[3].method3071(local159 + 15, Static35.anInt586 - -4);
			} else {
				Static160.aClass79Array6[1].method3071(local159 + 15, Static35.anInt586 - -4);
			}
			arg5.method904(Static195.aClass78_766, local159 + 32, Static35.anInt586 + 17, 16777215, -1);
			@Pc(241) int local241 = Static49.anInt886 + local62 + 250;
			if (Static154.anIntArray576[0] == 1 && Static55.anIntArray155[0] == 0) {
				Static160.aClass79Array6[2].method3071(local241, Static35.anInt586 + 4);
			} else {
				Static160.aClass79Array6[0].method3071(local241, Static35.anInt586 + 4);
			}
			if (Static154.anIntArray576[0] == 1 && Static55.anIntArray155[0] == 1) {
				Static160.aClass79Array6[3].method3071(local241 + 15, Static35.anInt586 + 4);
			} else {
				Static160.aClass79Array6[1].method3071(local241 + 15, Static35.anInt586 + 4);
			}
			arg5.method904(Static178.aClass78_718, local241 + 32, Static35.anInt586 + 17, 16777215, -1);
			local325 = Static49.anInt886 + local62 + 360;
			if (Static154.anIntArray576[0] == 2 && Static55.anIntArray155[0] == 0) {
				Static160.aClass79Array6[2].method3071(local325, Static35.anInt586 + 4);
			} else {
				Static160.aClass79Array6[0].method3071(local325, Static35.anInt586 + 4);
			}
			if (Static154.anIntArray576[0] == 2 && Static55.anIntArray155[0] == 1) {
				Static160.aClass79Array6[3].method3071(local325 + 15, Static35.anInt586 + 4);
			} else {
				Static160.aClass79Array6[1].method3071(local325 + 15, Static35.anInt586 + 4);
			}
			arg5.method904(Static187.aClass78_743, local325 + 32, Static35.anInt586 + 17, 16777215, -1);
			local406 = Static49.anInt886 + local62 + 470;
			if (Static154.anIntArray576[0] == 3 && Static55.anIntArray155[0] == 0) {
				Static160.aClass79Array6[2].method3071(local406, Static35.anInt586 + 4);
			} else {
				Static160.aClass79Array6[0].method3071(local406, Static35.anInt586 + 4);
			}
			if (Static154.anIntArray576[0] == 3 && Static55.anIntArray155[0] == 1) {
				Static160.aClass79Array6[3].method3071(local406 + 15, Static35.anInt586 + 4);
			} else {
				Static160.aClass79Array6[1].method3071(local406 + 15, Static35.anInt586 + 4);
			}
			arg5.method904(Static116.aClass78_556, local406 + 32, Static35.anInt586 - -17, 16777215, -1);
		}
		Static217.method3761(Static61.anInt1050 - 10 - 58, Static35.anInt586 + 4, 58, 16, 0);
		Static93.anInt2053 = -1;
		if (Static98.aClass2_Sub3_Sub8Array6 == null) {
			return;
		}
		local406 = (Static78.anInt1714 - 23) / 20;
		local325 = Static61.anInt1050 / 89;
		@Pc(516) int local516;
		@Pc(518) int local518;
		do {
			local516 = local406;
			local518 = local325;
			if (Static162.anInt3744 <= (local325 - 1) * local406) {
				local325--;
			}
			if ((local406 - 1) * local325 >= Static162.anInt3744) {
				local406--;
			}
			if (Static162.anInt3744 <= local325 * (local406 - 1)) {
				local406--;
			}
		} while (local516 != local406 || local518 != local325);
		local516 = (Static61.anInt1050 - local325 * 88) / (local325 + 1);
		local518 = (Static78.anInt1714 - local406 * 19 - 23) / (local406 + 1);
		if (local516 > 5) {
			local516 = 5;
		}
		@Pc(597) int local597 = (Static61.anInt1050 - local325 * 88 - (local325 - 1) * local516) / 2;
		if (local518 > 5) {
			local518 = 5;
		}
		@Pc(620) int local620 = (Static78.anInt1714 - (local406 - 1) * local518 - local406 * 19 - 23) / 2;
		@Pc(622) int local622 = local597;
		@Pc(626) int local626 = local620 + 23;
		@Pc(628) int local628 = 0;
		for (@Pc(630) int local630 = 0; local630 < Static162.anInt3744; local630++) {
			@Pc(636) Class9 local636 = Static132.aClass9Array1[local630];
			@Pc(641) Class78 local641 = Static19.method268(local636.anInt323);
			@Pc(643) boolean local643 = true;
			if (local636.anInt323 == -1) {
				local643 = false;
				local641 = Static116.aClass78_552;
			} else if (local636.anInt323 > 1980) {
				local641 = Static84.aClass78_414;
				local643 = false;
			}
			if (local622 <= Static44.anInt806 && Static81.anInt1744 >= local626 && Static44.anInt806 < local622 + 88 && Static81.anInt1744 < local626 + 19 && local643) {
				Static93.anInt2053 = local630;
				Static98.aClass2_Sub3_Sub8Array6[local636.aBoolean9 ? 1 : 0].method2263(Static49.anInt886 + local622, local626 + Static35.anInt586);
			} else {
				Static98.aClass2_Sub3_Sub8Array6[local636.aBoolean9 ? 1 : 0].method2262(Static49.anInt886 + local622, local626 + Static35.anInt586);
			}
			if (Static62.aClass79Array4 != null) {
				Static62.aClass79Array4[local636.anInt318 + (local636.aBoolean9 ? 8 : 0)].method3071(local622 + Static49.anInt886 + 29, local626 + Static35.anInt586);
			}
			arg5.method886(Static19.method268(local636.anInt322), local622 + Static49.anInt886 + 15, local626 + 9 + (Static35.anInt586 - -5), 0, -1);
			arg2.method886(local641, Static49.anInt886 + local622 + 60, local626 + Static35.anInt586 + 14, 268435455, -1);
			local626 += local518 + 19;
			local628++;
			if (local628 >= local406) {
				local622 += local516 + 88;
				local626 = local620 + 23;
				local628 = 0;
			}
		}
	}
}
