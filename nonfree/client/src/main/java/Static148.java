import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "Lclient!db;")
	public static Class16 aClass16_10 = new Class16(8);

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "[S")
	public static short[] aShortArray30 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1012 = Static38.method685("M");

	@OriginalMember(owner = "client!sb", name = "n", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1013 = Static38.method685(" )2> <col=ffffff>");

	@OriginalMember(owner = "client!sb", name = "o", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1014 = Static38.method685("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
	public static int anInt3458 = 99;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BLclient!h;)V")
	public static void method2276(@OriginalArg(1) Class2_Sub3_Sub5_Sub1 arg0) {
		if (arg0.anInt2696 == Static107.anInt2559 || arg0.anInt2658 == -1 || arg0.anInt2682 != 0 || arg0.anInt2669 + 1 > Static129.method2790(arg0.anInt2658).anIntArray113[arg0.anInt2688]) {
			@Pc(51) int local51 = arg0.anInt2695 * 64 + arg0.anInt2671 * 128;
			@Pc(61) int local61 = arg0.anInt2695 * 64 + arg0.anInt2666 * 128;
			@Pc(68) int local68 = arg0.anInt2696 - arg0.anInt2690;
			@Pc(74) int local74 = Static107.anInt2559 - arg0.anInt2690;
			@Pc(85) int local85 = arg0.anInt2678 * 128 + arg0.anInt2695 * 64;
			arg0.anInt2674 = (local51 * (local68 - local74) + local85 * local74) / local68;
			@Pc(110) int local110 = arg0.anInt2695 * 64 + arg0.anInt2677 * 128;
			arg0.anInt2672 = ((local68 - local74) * local61 + local74 * local110) / local68;
		}
		if (arg0.anInt2691 == 0) {
			arg0.anInt2680 = 1024;
		}
		arg0.anInt2685 = 0;
		if (arg0.anInt2691 == 1) {
			arg0.anInt2680 = 1536;
		}
		if (arg0.anInt2691 == 2) {
			arg0.anInt2680 = 0;
		}
		if (arg0.anInt2691 == 3) {
			arg0.anInt2680 = 512;
		}
		arg0.anInt2681 = arg0.anInt2680;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
	public static void method2277() {
		aClass6_1014 = null;
		aShortArray30 = null;
		aClass16_10 = null;
		aClass6_1013 = null;
		aClass6_1012 = null;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!ka;III[B[Lclient!l;)V")
	public static void method2278(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) Class48[] arg4) {
		@Pc(6) Class2_Sub13 local6 = new Class2_Sub13(arg3);
		@Pc(20) int local20 = -1;
		while (true) {
			@Pc(24) int local24 = local6.method1439();
			if (local24 == 0) {
				return;
			}
			local20 += local24;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local6.method1439();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(51) int local51 = local32 & 0x3F;
				@Pc(55) int local55 = local32 >> 12;
				@Pc(59) int local59 = local6.method1402();
				@Pc(65) int local65 = local32 >> 6 & 0x3F;
				@Pc(69) int local69 = local59 & 0x3;
				@Pc(73) int local73 = local59 >> 2;
				@Pc(77) int local77 = arg2 + local65;
				@Pc(81) int local81 = arg1 + local51;
				if (local77 > 0 && local81 > 0 && local77 < 103 && local81 < 103) {
					@Pc(98) int local98 = local55;
					if ((Static164.aByteArrayArrayArray7[1][local77][local81] & 0x2) == 2) {
						local98 = local55 - 1;
					}
					@Pc(114) Class48 local114 = null;
					if (local98 >= 0) {
						local114 = arg4[local98];
					}
					Static41.method741(arg0, local69, local114, local81, local55, local20, local73, local77);
				}
			}
		}
	}
}
