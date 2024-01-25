import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!lu", name = "y", descriptor = "Lclient!gm;")
	public static Class87 aClass87_6;

	@OriginalMember(owner = "client!lu", name = "B", descriptor = "[S")
	public static final short[] aShortArray73 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!lu", name = "G", descriptor = "I")
	public static int anInt4636 = 0;

	@OriginalMember(owner = "client!lu", name = "H", descriptor = "Lclient!dh;")
	public static final Class49 aClass49_15 = new Class49(14, 19);

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(III)Z")
	public static boolean method3952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static395.method5585(arg0, arg1) | (arg1 & 0x40000) != 0 || Static45.method928(arg0, arg1);
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!qa;)V")
	public static void method3953(@OriginalArg(0) Class30 arg0) {
		for (@Pc(1) int local1 = Static97.anInt2097; local1 < Static227.anInt4511; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static230.anInt4581; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static268.anInt5106; local7++) {
					@Pc(16) Class162 local16 = Static294.aClass162ArrayArrayArray2[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class11_Sub2 local21 = local16.aClass11_Sub2_2;
						@Pc(24) Class11_Sub2 local24 = local16.aClass11_Sub2_1;
						if (local21 != null && local21.method6301()) {
							Static196.method6074(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method6301()) {
								Static196.method6074(arg0, local24, local1, local4, local7, 1, 1);
								local24.method6306(0, 0, 0, arg0, local21, false);
								local24.method6307();
							}
							local21.method6307();
						}
						for (@Pc(70) Class199 local70 = local16.aClass199_1; local70 != null; local70 = local70.aClass199_2) {
							@Pc(74) Class11_Sub5 local74 = local70.aClass11_Sub5_1;
							if (local74 != null && local74.method6301()) {
								Static196.method6074(arg0, local74, local1, local4, local7, local74.aShort94 + 1 - local74.aShort95, local74.aShort92 - local74.aShort93 + 1);
								local74.method6307();
							}
						}
						@Pc(111) Class11_Sub1 local111 = local16.aClass11_Sub1_2;
						if (local111 != null && local111.method6301()) {
							Static375.method5338(arg0, local111, local1, local4, local7);
							local111.method6307();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method3954(@OriginalArg(0) String arg0) {
		@Pc(8) long local8 = (long) 0;
		@Pc(11) int local11 = arg0.length();
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			local8 *= 37L;
			@Pc(23) char local23 = arg0.charAt(local13);
			if (local23 >= 'A' && local23 <= 'Z') {
				local8 += local23 - 64;
			} else if (local23 >= 'a' && local23 <= 'z') {
				local8 += local23 + 1 - 97;
			} else if (local23 >= '0' && local23 <= '9') {
				local8 += local23 + 27 - 48;
			}
			if (local8 >= 177917621779460413L) {
				break;
			}
		}
		while (local8 % 37L == 0L && local8 != 0L) {
			local8 /= 37L;
		}
		return local8;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IZ)V")
	public static void method3955(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static248.anInt4793 != -1) {
				Static106.method6188(Static248.anInt4793);
			}
			for (@Pc(16) Class4_Sub39 local16 = (Class4_Sub39) Static157.aClass96_22.method2798(); local16 != null; local16 = (Class4_Sub39) Static157.aClass96_22.method2796()) {
				if (!local16.method6325()) {
					local16 = (Class4_Sub39) Static157.aClass96_22.method2798();
					if (local16 == null) {
						break;
					}
				}
				Static298.method4546(local16, true, false);
			}
			Static248.anInt4793 = -1;
			Static157.aClass96_22 = new Class96(8);
			Static193.method3454();
			Static248.anInt4793 = Static345.anInt6103;
			Static393.method5536(false);
			Static208.method3674();
			Static64.method1472(Static248.anInt4793);
		}
		Static82.aBoolean141 = false;
		Static410.aString67 = "";
		Static337.aString51 = "";
		Static72.method1586();
		Static457.anInt7815 = -1;
		Static249.method4104(Static5.anInt66);
		Static52.aClass11_Sub5_Sub2_Sub1_2 = new Class11_Sub5_Sub2_Sub1();
		Static52.aClass11_Sub5_Sub2_Sub1_2.anIntArray523[0] = Static193.anInt3853 / 2;
		Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7514 = Static193.anInt3853 * 128 / 2;
		Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7515 = Static301.anInt5585 * 128 / 2;
		Static52.aClass11_Sub5_Sub2_Sub1_2.anIntArray524[0] = Static301.anInt5585 / 2;
		Static108.anInt2350 = 0;
		Static235.anInt4645 = 0;
		if (Static275.anInt5173 == 2) {
			Static235.anInt4645 = Static111.anInt2407 << 7;
			Static108.anInt2350 = Static372.anInt6454 << 7;
		} else {
			Static161.method5247();
		}
		Static94.method1834();
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(ZII)V")
	public static void method3956(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class4_Sub38 local15 = Static351.method5112(arg0, arg1);
		if (local15 != null) {
			for (@Pc(20) int local20 = 0; local20 < local15.anIntArray540.length; local20++) {
				local15.anIntArray540[local20] = -1;
				local15.anIntArray541[local20] = 0;
			}
		}
	}
}
