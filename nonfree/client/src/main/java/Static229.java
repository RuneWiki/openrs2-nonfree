import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!wi", name = "Vb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!wi", name = "Wb", descriptor = "Lclient!me;")
	public static Class71 aClass71_31;

	@OriginalMember(owner = "client!wi", name = "Qb", descriptor = "[I")
	public static int[] anIntArray377 = new int[2];

	@OriginalMember(owner = "client!wi", name = "Tb", descriptor = "I")
	public static int anInt4872 = 0;

	@OriginalMember(owner = "client!wi", name = "Xb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1658 = Static64.method1101("::rebuild");

	@OriginalMember(owner = "client!wi", name = "bc", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1659 = Static64.method1101("www");

	@OriginalMember(owner = "client!wi", name = "ec", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1660 = Static64.method1101("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!wi", name = "fc", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1661 = Static64.method1101("Wordpack geladen)3");

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!jb;ILclient!me;Lclient!jb;IIII)V")
	public static void method3821(@OriginalArg(0) Class1_Sub2_Sub11 arg0, @OriginalArg(2) Class71 arg1, @OriginalArg(3) Class1_Sub2_Sub11 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static82.anInt1827 = arg6;
		Static147.anInt3196 = arg4;
		Static142.anInt3125 = arg5;
		Static140.anInt3103 = arg3;
		Static159.aClass71_27 = arg1;
		if (Static32.aClass113_1 != null) {
			return;
		}
		Static118.aBoolean104 = true;
		if (Static30.aClass1_Sub2_Sub1Array10 == null) {
			Static30.aClass1_Sub2_Sub1Array10 = Static100.method1677(Static200.anInt4254, Static77.aClass70_Sub1_20);
		}
		if (Static63.aClass41Array2 == null) {
			Static63.aClass41Array2 = Static118.method1948(Static77.aClass70_Sub1_20, Static33.anInt785);
		}
		if (Static201.aClass41Array9 == null) {
			Static201.aClass41Array9 = Static118.method1948(Static77.aClass70_Sub1_20, Static37.anInt895);
		}
		if (Static57.aClass41Array1 == null) {
			Static57.aClass41Array1 = Static118.method1948(Static77.aClass70_Sub1_20, Static182.anInt3969);
		}
		@Pc(56) int local56 = Static140.anInt3103 / 5;
		@Pc(62) int local62 = Static140.anInt3103 / 5 * 4;
		Static96.method1621(Static147.anInt3196, Static82.anInt1827, Static140.anInt3103, Static142.anInt3125, 0, 168);
		Static96.method1632(Static147.anInt3196, Static82.anInt1827, local56, 23, 12425273, 9135624);
		Static96.method1632(Static147.anInt3196 + local56, Static82.anInt1827, local62, 23, 5197647, 2697513);
		arg0.method2042(Static47.aClass51_343, Static147.anInt3196 + local56 / 2, Static82.anInt1827 + 15, 0, -1);
		if (Static57.aClass41Array1 != null) {
			Static57.aClass41Array1[1].method969(local56 + Static147.anInt3196 + 2, Static82.anInt1827 + 1);
			arg2.method2038(Static90.aClass51_1610, Static147.anInt3196 + local56 + 12, Static82.anInt1827 - -10, 16777215, -1);
			Static57.aClass41Array1[0].method969(local56 + Static147.anInt3196 + 2, Static82.anInt1827 + 12);
			arg2.method2038(Static151.aClass51_1174, Static147.anInt3196 + local56 + 12, Static82.anInt1827 + 21, 16777215, -1);
		}
		@Pc(320) int local320;
		@Pc(400) int local400;
		if (Static201.aClass41Array9 != null) {
			@Pc(159) int local159 = local56 + Static147.anInt3196 + 140;
			if (Static81.anIntArray113[0] == 0 && Static127.anIntArray188[0] == 0) {
				Static201.aClass41Array9[2].method969(local159, Static82.anInt1827 + 4);
			} else {
				Static201.aClass41Array9[0].method969(local159, Static82.anInt1827 + 4);
			}
			if (Static81.anIntArray113[0] == 0 && Static127.anIntArray188[0] == 1) {
				Static201.aClass41Array9[3].method969(local159 + 15, Static82.anInt1827 + 4);
			} else {
				Static201.aClass41Array9[1].method969(local159 + 15, Static82.anInt1827 + 4);
			}
			arg0.method2038(Static91.aClass51_655, local159 + 32, Static82.anInt1827 + 17, 16777215, -1);
			@Pc(239) int local239 = Static147.anInt3196 + local56 + 250;
			if (Static81.anIntArray113[0] == 1 && Static127.anIntArray188[0] == 0) {
				Static201.aClass41Array9[2].method969(local239, Static82.anInt1827 + 4);
			} else {
				Static201.aClass41Array9[0].method969(local239, Static82.anInt1827 + 4);
			}
			if (Static81.anIntArray113[0] == 1 && Static127.anIntArray188[0] == 1) {
				Static201.aClass41Array9[3].method969(local239 + 15, Static82.anInt1827 - -4);
			} else {
				Static201.aClass41Array9[1].method969(local239 + 15, Static82.anInt1827 - -4);
			}
			arg0.method2038(Static193.aClass51_1443, local239 + 32, Static82.anInt1827 + 17, 16777215, -1);
			local320 = local56 + Static147.anInt3196 + 360;
			if (Static81.anIntArray113[0] == 2 && Static127.anIntArray188[0] == 0) {
				Static201.aClass41Array9[2].method969(local320, Static82.anInt1827 + 4);
			} else {
				Static201.aClass41Array9[0].method969(local320, Static82.anInt1827 + 4);
			}
			if (Static81.anIntArray113[0] == 2 && Static127.anIntArray188[0] == 1) {
				Static201.aClass41Array9[3].method969(local320 + 15, Static82.anInt1827 + 4);
			} else {
				Static201.aClass41Array9[1].method969(local320 + 15, Static82.anInt1827 - -4);
			}
			arg0.method2038(Static161.aClass51_1228, local320 + 32, Static82.anInt1827 - -17, 16777215, -1);
			local400 = local56 + Static147.anInt3196 + 470;
			if (Static81.anIntArray113[0] == 3 && Static127.anIntArray188[0] == 0) {
				Static201.aClass41Array9[2].method969(local400, Static82.anInt1827 + 4);
			} else {
				Static201.aClass41Array9[0].method969(local400, Static82.anInt1827 + 4);
			}
			if (Static81.anIntArray113[0] == 3 && Static127.anIntArray188[0] == 1) {
				Static201.aClass41Array9[3].method969(local400 + 15, Static82.anInt1827 + 4);
			} else {
				Static201.aClass41Array9[1].method969(local400 + 15, Static82.anInt1827 + 4);
			}
			arg0.method2038(Static14.aClass51_113, local400 + 32, Static82.anInt1827 + 17, 16777215, -1);
		}
		Static96.method1623(Static140.anInt3103 - 10 - 58, Static82.anInt1827 + 4, 58, 16, 0);
		Static132.anInt2980 = -1;
		if (Static30.aClass1_Sub2_Sub1Array10 == null) {
			return;
		}
		local320 = Static140.anInt3103 / 89;
		local400 = (Static142.anInt3125 - 23) / 20;
		@Pc(506) int local506;
		@Pc(508) int local508;
		do {
			local506 = local400;
			local508 = local320;
			if (Static39.anInt966 <= local400 * (local320 - 1)) {
				local320--;
			}
			if ((local400 - 1) * local320 >= Static39.anInt966) {
				local400--;
			}
			if (local320 * (local400 - 1) >= Static39.anInt966) {
				local400--;
			}
		} while (local506 != local400 || local320 != local508);
		local506 = (Static140.anInt3103 - local320 * 88) / (local320 + 1);
		if (local506 > 5) {
			local506 = 5;
		}
		local508 = (Static142.anInt3125 - local400 * 19 - 23) / (local400 - -1);
		if (local508 > 5) {
			local508 = 5;
		}
		@Pc(603) int local603 = (Static140.anInt3103 - (local320 - 1) * local506 - local320 * 88) / 2;
		@Pc(621) int local621 = (Static142.anInt3125 - (local400 - 1) * local508 - local400 * 19 - 23) / 2;
		@Pc(625) int local625 = local621 + 23;
		@Pc(627) int local627 = local603;
		@Pc(629) int local629 = 0;
		for (@Pc(631) int local631 = 0; local631 < Static39.anInt966; local631++) {
			@Pc(637) Class48 local637 = Static48.aClass48Array1[local631];
			@Pc(639) boolean local639 = true;
			@Pc(644) Class51 local644 = Static27.method511(local637.anInt1779);
			if (local637.anInt1779 == -1) {
				local639 = false;
				local644 = Static24.aClass51_194;
			} else if (local637.anInt1779 > 1980) {
				local639 = false;
				local644 = Static38.aClass51_260;
			}
			if (Static205.anInt4361 >= local627 && local625 <= Static15.anInt373 && local627 + 88 > Static205.anInt4361 && Static15.anInt373 < local625 + 19 && local639) {
				Static132.anInt2980 = local631;
				Static30.aClass1_Sub2_Sub1Array10[local637.aBoolean81 ? 1 : 0].method2069(local627 + Static147.anInt3196, local625 + Static82.anInt1827);
			} else {
				Static30.aClass1_Sub2_Sub1Array10[local637.aBoolean81 ? 1 : 0].method2064(local627 + Static147.anInt3196, local625 + Static82.anInt1827);
			}
			if (Static63.aClass41Array2 != null) {
				Static63.aClass41Array2[(local637.aBoolean81 ? 8 : 0) + local637.anInt1777].method969(Static147.anInt3196 + local627 + 29, local625 + Static82.anInt1827);
			}
			arg0.method2042(Static27.method511(local637.anInt1788), Static147.anInt3196 + local627 + 15, local625 + 9 + (Static82.anInt1827 - -5), 0, -1);
			arg2.method2042(local644, local627 + Static147.anInt3196 + 60, local625 + 14 + Static82.anInt1827, 268435455, -1);
			local625 += local508 + 19;
			local629++;
			if (local400 <= local629) {
				local625 = local621 + 23;
				local627 += local506 + 88;
				local629 = 0;
			}
		}
	}
}
