import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!re", name = "t", descriptor = "[Lclient!da;")
	public static Class4_Sub4_Sub3_Sub1[] aClass4_Sub4_Sub3_Sub1Array6;

	@OriginalMember(owner = "client!re", name = "y", descriptor = "Z")
	public static boolean aBoolean61 = false;

	@OriginalMember(owner = "client!re", name = "D", descriptor = "Lclient!qc;")
	private static Class60 aClass60_595 = Static121.method2047(" has logged in)3");

	@OriginalMember(owner = "client!re", name = "gb", descriptor = "I")
	public static int anInt1662 = 0;

	@OriginalMember(owner = "client!re", name = "ob", descriptor = "Lclient!qc;")
	public static Class60 aClass60_596 = aClass60_595;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "([Lclient!m;[BLclient!ha;IIB)V")
	public static void method1202(@OriginalArg(0) Class45[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class28 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(20) Class4_Sub13 local20 = new Class4_Sub13(arg1);
		@Pc(22) int local22 = -1;
		while (true) {
			@Pc(26) int local26 = local20.method1237();
			if (local26 == 0) {
				return;
			}
			@Pc(30) int local30 = 0;
			local22 += local26;
			while (true) {
				@Pc(38) int local38 = local20.method1237();
				if (local38 == 0) {
					break;
				}
				local30 += local38 - 1;
				@Pc(53) int local53 = local30 & 0x3F;
				@Pc(59) int local59 = local30 >> 6 & 0x3F;
				@Pc(63) int local63 = local20.method1223();
				@Pc(67) int local67 = local63 >> 2;
				@Pc(71) int local71 = local30 >> 12;
				@Pc(75) int local75 = arg4 + local53;
				@Pc(79) int local79 = local63 & 0x3;
				@Pc(84) int local84 = local59 + arg3;
				if (local84 > 0 && local75 > 0 && local84 < 103 && local75 < 103) {
					@Pc(103) int local103 = local71;
					if ((Static95.aByteArrayArrayArray5[1][local84][local75] & 0x2) == 2) {
						local103 = local71 - 1;
					}
					@Pc(119) Class45 local119 = null;
					if (local103 >= 0) {
						local119 = arg0[local103];
					}
					Static55.method1026(local67, local75, local71, local84, local22, local119, arg2, local79);
				}
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(Z)V")
	public static void method1217() {
		aClass60_595 = null;
		aClass60_596 = null;
		aClass4_Sub4_Sub3_Sub1Array6 = null;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IBI[B)I")
	public static int method1233(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(15) int local15 = -1;
		for (@Pc(17) int local17 = arg0; local17 < arg1; local17++) {
			local15 = Class8_Sub2.anIntArray335[(local15 ^ arg2[local17]) & 0xFF] ^ local15 >>> 8;
		}
		return ~local15;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!ec;Lclient!lc;Lclient!lc;ILclient!lc;)Z")
	public static boolean method1251(@OriginalArg(0) Class4_Sub2_Sub2 arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(4) Class40 arg3) {
		Static51.aClass40_41 = arg1;
		Static20.aClass40_15 = arg3;
		Static59.aClass4_Sub2_Sub2_2 = arg0;
		Static1.aClass40_2 = arg2;
		return true;
	}
}
