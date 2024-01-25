import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "Z")
	public static boolean aBoolean190 = false;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)V")
	public static void method2370() {
		try {
			@Pc(14) int local14;
			if (Static602.anInt10026 == 1) {
				local14 = Static224.aClass6_Sub3_Sub4_1.method4736();
				if (local14 > 0 && Static224.aClass6_Sub3_Sub4_1.method4717()) {
					local14 -= Static112.anInt2206;
					if (local14 < 0) {
						local14 = 0;
					}
					Static224.aClass6_Sub3_Sub4_1.method4715(local14);
					return;
				}
				Static224.aClass6_Sub3_Sub4_1.method4738();
				Static224.aClass6_Sub3_Sub4_1.method4733();
				if (Static479.aClass353_88 == null) {
					Static602.anInt10026 = 0;
				} else {
					Static602.anInt10026 = 2;
				}
				Static97.aClass6_Sub5_1 = null;
				Static594.aClass253_1 = null;
			}
			if (Static602.anInt10026 == 3) {
				local14 = Static224.aClass6_Sub3_Sub4_1.method4736();
				if (Static142.anInt2680 > local14 && Static224.aClass6_Sub3_Sub4_1.method4717()) {
					local14 += Static476.anInt10356;
					if (Static142.anInt2680 < local14) {
						local14 = Static142.anInt2680;
					}
					Static224.aClass6_Sub3_Sub4_1.method4715(local14);
				} else {
					Static476.anInt10356 = 0;
					Static602.anInt10026 = 0;
				}
			}
		} catch (@Pc(93) Exception local93) {
			local93.printStackTrace();
			Static224.aClass6_Sub3_Sub4_1.method4738();
			Static498.aClass6_Sub3_Sub4_3 = null;
			Static594.aClass253_1 = null;
			Static97.aClass6_Sub5_1 = null;
			Static479.aClass353_88 = null;
			Static602.anInt10026 = 0;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
	public static void method2371() {
		for (@Pc(11) Class6_Sub35 local11 = (Class6_Sub35) Static227.aClass128_12.method3556(); local11 != null; local11 = (Class6_Sub35) Static227.aClass128_12.method3555()) {
			if (local11.aBoolean534) {
				local11.aBoolean534 = false;
			} else {
				Static366.method5801(local11.anInt7969);
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(B)V")
	public static void method2372() {
		if (Static476.aClass274ArrayArray4 == null) {
			return;
		}
		for (@Pc(9) int local9 = 0; local9 < Static476.aClass274ArrayArray4.length; local9++) {
			for (@Pc(13) int local13 = 0; local13 < Static476.aClass274ArrayArray4[local9].length; local13++) {
				Static476.aClass274ArrayArray4[local9][local13] = Static337.aClass274_2;
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II[BI)I")
	public static int method2373(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = arg2; local9 < arg0; local9++) {
			local7 = Class117.anIntArray228[(arg1[local9] ^ local7) & 0xFF] ^ local7 >>> 8;
		}
		return ~local7;
	}
}
