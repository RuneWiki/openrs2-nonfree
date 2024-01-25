import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
	public static int anInt5689 = 0;

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "Lclient!es;")
	public static Class72 aClass72_1 = new Class72();

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(BLclient!dt;)V")
	public static void method5112(@OriginalArg(1) Class62 arg0) {
		@Pc(7) Class62 local7 = Static352.method5281(arg0);
		@Pc(13) int local13;
		@Pc(11) int local11;
		if (local7 == null) {
			local11 = Static207.anInt2251;
			local13 = Static199.anInt3567;
		} else {
			local13 = local7.anInt1546;
			local11 = local7.anInt1551;
		}
		Static26.method322(local11, local13, arg0, false);
		Static295.method4557(local13, arg0, local11);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method5113(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static231.method3842(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static351.anInt3266; local25++) {
			@Pc(31) String local31 = Static244.aStringArray28[local25];
			if (local31.startsWith("*")) {
				local31 = local31.substring(1);
			}
			local31 = Static231.method3842(local31);
			if (local31 != null && local31.equals(local20)) {
				Static351.anInt3266--;
				for (@Pc(55) int local55 = local25; local55 < Static351.anInt3266; local55++) {
					Static244.aStringArray28[local55] = Static244.aStringArray28[local55 + 1];
					Static275.aStringArray33[local55] = Static275.aStringArray33[local55 + 1];
					Static110.anIntArray215[local55] = Static110.anIntArray215[local55 + 1];
					Static346.aStringArray39[local55] = Static346.aStringArray39[local55 + 1];
					Static351.anIntArray370[local55] = Static351.anIntArray370[local55 + 1];
					Static23.aBooleanArray7[local55] = Static23.aBooleanArray7[local55 + 1];
				}
				Static142.anInt2705 = Static28.anInt360;
				Static229.method3783(Static83.aClass244_25);
				Static23.aClass3_Sub5_Sub1_1.method2791(Static269.method4260(arg0));
				Static23.aClass3_Sub5_Sub1_1.method2768(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IILclient!gg;I)J")
	public static long method5116(@OriginalArg(1) int arg0, @OriginalArg(2) Interface3 arg1, @OriginalArg(3) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = 2147483648L;
		@Pc(14) long local14 = Long.MIN_VALUE;
		@Pc(23) Class60 local23 = Static97.aClass217_4.method5007(arg1.method5420());
		@Pc(44) long local44 = (long) (arg0 << 7 | arg2 | arg1.method5425() << 14 | arg1.method5423() << 20 | 0x40000000);
		if (local23.anInt1415 == 0) {
			local44 |= local14;
		}
		if (local23.anInt1393 == 1) {
			local44 |= local5;
		}
		if (local23.aBoolean84) {
			local44 |= local7;
		}
		return local44 | (long) arg1.method5420() << 32;
	}
}
