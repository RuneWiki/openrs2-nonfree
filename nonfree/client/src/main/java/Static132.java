import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!na", name = "Y", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1051 = Static64.method1101("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

	@OriginalMember(owner = "client!na", name = "bb", descriptor = "I")
	public static int anInt2980 = -1;

	@OriginalMember(owner = "client!na", name = "cb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1052 = Static64.method1101("Fertigkeit)2");

	@OriginalMember(owner = "client!na", name = "gb", descriptor = "I")
	public static int anInt2984 = 0;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BLclient!k;)Lclient!mg;")
	public static Class1_Sub1 method2331(@OriginalArg(1) Class1_Sub16 arg0) {
		arg0.method3793();
		@Pc(18) int local18 = arg0.method3793();
		@Pc(22) Class1_Sub1 local22 = Static68.method1186(local18);
		local22.anInt4768 = arg0.method3793();
		@Pc(31) int local31 = arg0.method3793();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(39) int local39 = arg0.method3793();
			local22.method3738(arg0, local39);
		}
		local22.method3739();
		return local22;
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(II)V")
	public static void method2333(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub10 local12 = (Class1_Sub10) Static23.aClass102_3.method3093((long) arg0);
		if (local12 != null) {
			for (@Pc(22) int local22 = 0; local22 < local12.anIntArray95.length; local22++) {
				local12.anIntArray95[local22] = -1;
				local12.anIntArray96[local22] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IZI)V")
	public static void method2334(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = arg1;
		if (arg1 > 25) {
			local3 = 25;
		}
		arg1--;
		@Pc(17) int local17 = Static223.anIntArray372[arg1];
		@Pc(21) int local21 = Static144.anIntArray214[arg1];
		if (arg0 == 0) {
			Static167.aClass1_Sub16_Sub1_2.method3823(19);
			Static167.aClass1_Sub16_Sub1_2.method3765(local3 + local3 + 3);
		}
		if (arg0 == 1) {
			Static167.aClass1_Sub16_Sub1_2.method3823(98);
			Static167.aClass1_Sub16_Sub1_2.method3765(local3 + local3 + 17);
		}
		if (arg0 == 2) {
			Static167.aClass1_Sub16_Sub1_2.method3823(75);
			Static167.aClass1_Sub16_Sub1_2.method3765(local3 + local3 + 3);
		}
		Static167.aClass1_Sub16_Sub1_2.method3789(Static198.anInt4217 + local17);
		Static167.aClass1_Sub16_Sub1_2.method3765(Static208.aBooleanArray25[82] ? 1 : 0);
		Static32.anInt707 = Static144.anIntArray214[0];
		Static79.anInt1782 = Static223.anIntArray372[0];
		for (@Pc(105) int local105 = 1; local105 < local3; local105++) {
			arg1--;
			Static167.aClass1_Sub16_Sub1_2.method3790(Static223.anIntArray372[arg1] - local17);
			Static167.aClass1_Sub16_Sub1_2.method3778(Static144.anIntArray214[arg1] - local21);
		}
		Static167.aClass1_Sub16_Sub1_2.method3807(local21 + Static118.anInt2541);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IBIIIIIIII)V")
	public static void method2335(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(3) Class1_Sub5 local3 = null;
		for (@Pc(20) Class1_Sub5 local20 = (Class1_Sub5) Static51.aClass105_6.method3120(); local20 != null; local20 = (Class1_Sub5) Static51.aClass105_6.method3109()) {
			if (local20.anInt672 == arg4 && local20.anInt666 == arg1 && local20.anInt667 == arg3 && arg5 == local20.anInt665) {
				local3 = local20;
				break;
			}
		}
		if (local3 == null) {
			local3 = new Class1_Sub5();
			local3.anInt665 = arg5;
			local3.anInt672 = arg4;
			local3.anInt667 = arg3;
			local3.anInt666 = arg1;
			Static16.method295(local3);
			Static51.aClass105_6.method3119(local3);
		}
		local3.anInt663 = arg0;
		local3.anInt674 = arg2;
		local3.anInt662 = arg7;
		local3.anInt675 = arg8;
		local3.anInt664 = arg6;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I[Lclient!ia;ZI)Lclient!ia;")
	public static Class51 method2336(@OriginalArg(0) int arg0, @OriginalArg(1) Class51[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = 0;
		for (@Pc(14) int local14 = 0; local14 < arg0; local14++) {
			if (arg1[arg2 + local14] == null) {
				arg1[arg2 + local14] = Static182.aClass51_1367;
			}
			local7 += arg1[arg2 + local14].anInt1858;
		}
		@Pc(50) byte[] local50 = new byte[local7];
		@Pc(52) int local52 = 0;
		@Pc(62) Class51 local62;
		for (@Pc(54) int local54 = 0; local54 < arg0; local54++) {
			local62 = arg1[local54 + arg2];
			Static233.method868(local62.aByteArray17, 0, local50, local52, local62.anInt1858);
			local52 += local62.anInt1858;
		}
		local62 = new Class51();
		local62.aByteArray17 = local50;
		local62.anInt1858 = local7;
		return local62;
	}
}
