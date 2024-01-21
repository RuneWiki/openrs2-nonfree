import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "[Lclient!gd;")
	public static Class2_Sub2_Sub3_Sub3[] aClass2_Sub2_Sub3_Sub3Array7;

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
	public static int anInt1191 = 0;

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "Lclient!sg;")
	public static Class77 aClass77_477 = Static146.method2172("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)[Lclient!bg;")
	public static Class2_Sub2_Sub3_Sub2[] method829() {
		@Pc(4) Class2_Sub2_Sub3_Sub2[] local4 = new Class2_Sub2_Sub3_Sub2[Static124.anInt3039];
		for (@Pc(6) int local6 = 0; local6 < Static124.anInt3039; local6++) {
			@Pc(12) Class2_Sub2_Sub3_Sub2 local12 = new Class2_Sub2_Sub3_Sub2();
			local12.anInt569 = Static138.anInt3346;
			local12.anInt572 = Static15.anInt483;
			local12.anInt570 = Static160.anIntArray642[local6];
			local12.anInt568 = Static37.anIntArray175[local6];
			local12.anInt567 = Static178.anIntArray637[local6];
			local12.anInt571 = Static2.anIntArray15[local6];
			@Pc(44) int local44 = local12.anInt567 * local12.anInt571;
			@Pc(48) byte[] local48 = Static170.aByteArrayArray10[local6];
			local12.anIntArray81 = new int[local44];
			for (@Pc(54) int local54 = 0; local54 < local44; local54++) {
				local12.anIntArray81[local54] = Static173.anIntArray623[local48[local54] & 0xFF];
			}
			local4[local6] = local12;
		}
		Static59.method1102();
		return local4;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BLclient!ke;)V")
	public static void method830(@OriginalArg(1) Class43 arg0) {
		Static17.aClass43_5 = arg0;
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V")
	public static void method831() {
		aClass77_477 = null;
		aClass2_Sub2_Sub3_Sub3Array7 = null;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZII)I")
	public static int method832(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local5 *= arg1;
			}
			arg0 >>= 0x1;
			arg1 *= arg1;
		}
		if (arg0 == 1) {
			return arg1 * local5;
		} else {
			return local5;
		}
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(B)V")
	public static void method833() {
		@Pc(7) int local7 = Static17.anInt608;
		@Pc(9) int local9 = Static64.anInt1811;
		@Pc(13) int local13 = Static147.anInt3576;
		@Pc(15) int local15 = Static156.anInt3881;
		Static113.method1243(local7, local13, local9, local15, 6116423);
		Static113.method1243(local7 + 1, local13 + 1, local9 - 2, 16, 0);
		Static113.method1250(local7 + 1, local13 + 18, local9 - 2, local15 + -19, 0);
		Static86.aClass2_Sub2_Sub3_Sub4_Sub1_4.method1256(Static131.aClass77_1493, local7 + 3, local13 + 14, 6116423, -1);
		@Pc(65) int local65 = Static20.anInt631;
		@Pc(67) int local67 = Static132.anInt3185;
		for (@Pc(69) int local69 = 0; local69 < Static18.anInt618; local69++) {
			@Pc(84) int local84 = (Static18.anInt618 - local69 - 1) * 15 + local13 + 31;
			@Pc(86) int local86 = 16777215;
			if (local65 > local7 && local65 < local9 + local7 && local67 > local84 - 13 && local67 < local84 + 3) {
				local86 = 16776960;
			}
			Static86.aClass2_Sub2_Sub3_Sub4_Sub1_4.method1256(Static129.method2202(local69), local7 + 3, local84, local86, 0);
		}
		Static150.method2566(Static64.anInt1811, Static147.anInt3576, Static17.anInt608, Static156.anInt3881);
	}
}
