import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!of", name = "a", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_131 = new Class322(18, 6);

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ZILclient!rt;I)J")
	public static long method6435(@OriginalArg(1) int arg0, @OriginalArg(2) Interface23 arg1, @OriginalArg(3) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = Long.MIN_VALUE;
		@Pc(14) Class125 local14 = Static290.aClass163_5.method4124(125, arg1.method7934());
		@Pc(35) long local35 = (long) (arg0 | arg2 << 7 | arg1.method7929(97) << 14 | arg1.method7932() << 20 | 0x40000000);
		if (local14.anInt3587 == 0) {
			local35 |= local7;
		}
		if (local14.anInt3613 == 1) {
			local35 |= local5;
		}
		return local35 | (long) arg1.method7934() << 32;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIILclient!lga;)Lclient!ifa;")
	public static Class6_Sub2_Sub9 method6436(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class223 arg2) {
		@Pc(14) Class6_Sub15 local14 = new Class6_Sub15(arg2.method5267(arg1, arg0));
		@Pc(50) Class6_Sub2_Sub9 local50 = new Class6_Sub2_Sub9(arg1, local14.method3046(), local14.method3046(), local14.method3015(), local14.method3015(), local14.method3030() == 1, local14.method3030(), local14.method3030());
		@Pc(54) int local54 = local14.method3030();
		for (@Pc(56) int local56 = 0; local56 < local54; local56++) {
			local50.aClass340_33.method8131(new Class6_Sub38(local14.method3030(), local14.method3018(), local14.method3018(), local14.method3018(), local14.method3018(), local14.method3018(), local14.method3018(), local14.method3018(), local14.method3018()));
		}
		local50.method4377();
		return local50;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
	public static void method6437() {
		if (Static352.anInt5985 != -1) {
			Static568.method8738(Static352.anInt5985, false, -1, -1);
			Static352.anInt5985 = -1;
		}
	}
}
