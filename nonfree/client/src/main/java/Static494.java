import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static494 {

	@OriginalMember(owner = "client!qga", name = "sd", descriptor = "I")
	public static int anInt8561;

	@OriginalMember(owner = "client!qga", name = "cb", descriptor = "Lclient!sw;")
	public static Class342 aClass342_2;

	@OriginalMember(owner = "client!qga", name = "rb", descriptor = "I")
	public static int anInt8618 = -1;

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(IIILclient!rg;IZ)V")
	public static void method7429(@OriginalArg(2) int arg0, @OriginalArg(3) Class310 arg1, @OriginalArg(4) int arg2) {
		Static561.method8081(arg2, arg1, 0L, arg0);
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(ZIILclient!np;)J")
	public static long method7448(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface16 arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = Long.MIN_VALUE;
		@Pc(14) Class128 local14 = Static212.aClass249_4.method6119(arg2.method9501());
		@Pc(35) long local35 = (long) ((arg2.method9498() | 0x10000) << 14 | arg1 | arg0 << 7 | arg2.method9502() << 20);
		if (local14.anInt2945 == 0) {
			local35 |= local7;
		}
		if (local14.anInt2988 == 1) {
			local35 |= local5;
		}
		return local35 | (long) arg2.method9501() << 32;
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(B)Lclient!ija;")
	public static Class14_Sub2_Sub10 method7449() {
		return Static224.aClass14_Sub2_Sub10_2;
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)V")
	public static void method7451() {
		Static127.aClass144_17.method6952(Static214.aFloat31, Static187.aFloat25, Static196.aFloat28);
	}
}
