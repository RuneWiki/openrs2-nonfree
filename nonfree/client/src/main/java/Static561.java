import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static561 {

	@OriginalMember(owner = "client!vea", name = "d", descriptor = "[Z")
	public static boolean[] aBooleanArray34;

	@OriginalMember(owner = "client!vea", name = "e", descriptor = "I")
	public static int anInt9766;

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(Lclient!ofa;III)J")
	public static long method7673(@OriginalArg(0) Interface14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = Long.MIN_VALUE;
		@Pc(14) Class194 local14 = Static536.aClass146_4.method3721(arg0.method4958());
		@Pc(35) long local35 = (long) (arg2 | arg1 << 7 | arg0.method4959() << 14 | arg0.method4961() << 20 | 0x40000000);
		if (local14.anInt5831 == 0) {
			local35 |= local7;
		}
		if (local14.anInt5807 == 1) {
			local35 |= local5;
		}
		return local35 | (long) arg0.method4958() << 32;
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(B)V")
	public static void method7674() {
		Static148.aClass342_58.method7693();
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(BI)Lclient!wg;")
	public static Class358 method7676(@OriginalArg(1) int arg0) {
		@Pc(17) Class358 local17 = (Class358) Static362.aClass342_129.method7684((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(27) byte[] local27 = Static166.aClass284_53.method6331(0, arg0);
		local17 = new Class358();
		if (local27 != null) {
			local17.method7970(new Class3_Sub26(local27));
		}
		local17.method7971();
		Static362.aClass342_129.method7683(local17, (long) arg0);
		return local17;
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(B[BI)[B")
	public static byte[] method7677(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) byte[] local6 = new byte[arg1];
		Static604.method6225(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(Lclient!ll;IIILclient!da;I)V")
	public static void method7678(@OriginalArg(0) Class190 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class52 arg3, @OriginalArg(5) int arg4) {
		if (arg3 != null) {
			arg0.method4649(arg4, arg3.OA(), arg3.H(), arg3.K(), arg3.l(), arg3.za(), arg3.KA(), arg3.J(), arg1, arg2);
		}
	}
}
