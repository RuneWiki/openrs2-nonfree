import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!ot", name = "N", descriptor = "Lclient!dr;")
	public static Class78 aClass78_1;

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method5591(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = Static333.anInt6355;
		@Pc(9) int[] local9 = Static354.anIntArray461;
		@Pc(11) boolean local11 = false;
		for (@Pc(21) int local21 = 0; local21 < local7; local21++) {
			@Pc(29) Class15_Sub2_Sub4_Sub2 local29 = Static551.aClass15_Sub2_Sub4_Sub2Array1[local9[local21]];
			if (local29 != null && Static461.aClass15_Sub2_Sub4_Sub2_2 != local29 && local29.aString82 != null && local29.aString82.equalsIgnoreCase(arg1)) {
				if (arg0 == 1) {
					Static534.method7063(Static26.aClass316_6);
					Static340.aClass6_Sub12_Sub2_1.method6001(0);
					Static340.aClass6_Sub12_Sub2_1.method6053(local9[local21]);
				} else if (arg0 == 4) {
					Static534.method7063(Static488.aClass316_122);
					Static340.aClass6_Sub12_Sub2_1.method6043(0);
					Static340.aClass6_Sub12_Sub2_1.method6053(local9[local21]);
				} else if (arg0 == 5) {
					Static534.method7063(Static301.aClass316_68);
					Static340.aClass6_Sub12_Sub2_1.method6041(local9[local21]);
					Static340.aClass6_Sub12_Sub2_1.method6047(0);
				} else if (arg0 == 6) {
					Static534.method7063(Static436.aClass316_98);
					Static340.aClass6_Sub12_Sub2_1.method6043(0);
					Static340.aClass6_Sub12_Sub2_1.method6041(local9[local21]);
				} else if (arg0 == 7) {
					Static534.method7063(Static308.aClass316_70);
					Static340.aClass6_Sub12_Sub2_1.method6047(0);
					Static340.aClass6_Sub12_Sub2_1.method6058(local9[local21]);
				}
				local11 = true;
				break;
			}
		}
		if (!local11) {
			Static141.method2337(Static146.aClass103_68.method2355(Static188.anInt28) + arg1);
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(III)B")
	public static byte method5592(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ILclient!uq;IB)J")
	public static long method5595(@OriginalArg(0) int arg0, @OriginalArg(1) Interface22 arg1, @OriginalArg(2) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(15) long local15 = 2147483648L;
		@Pc(17) long local17 = Long.MIN_VALUE;
		@Pc(24) Class192 local24 = Static85.aClass27_1.method516(arg1.method7171());
		@Pc(45) long local45 = (long) (arg0 | 0x40000000 | arg2 << 7 | arg1.method7176() << 14 | arg1.method7175() << 20);
		if (local24.anInt5582 == 0) {
			local45 |= local17;
		}
		if (local24.anInt5622 == 1) {
			local45 |= local5;
		}
		if (local24.aBoolean392) {
			local45 |= local15;
		}
		return local45 | (long) arg1.method7171() << 32;
	}
}
