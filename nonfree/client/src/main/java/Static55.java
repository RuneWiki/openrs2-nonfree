import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!ct", name = "N", descriptor = "F")
	public static float aFloat18;

	@OriginalMember(owner = "client!ct", name = "P", descriptor = "Lclient!od;")
	public static Class23_Sub1 aClass23_Sub1_1;

	@OriginalMember(owner = "client!ct", name = "S", descriptor = "Lclient!l;")
	public static Class17 aClass17_9;

	@OriginalMember(owner = "client!ct", name = "G", descriptor = "I")
	public static int anInt1188 = -1;

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(ILclient!jn;IB)J")
	public static long method919(@OriginalArg(0) int arg0, @OriginalArg(1) Interface6 arg1, @OriginalArg(2) int arg2) {
		@Pc(10) long local10 = 4194304L;
		@Pc(12) long local12 = 2147483648L;
		@Pc(14) long local14 = Long.MIN_VALUE;
		@Pc(21) Class134 local21 = Static118.aClass165_2.method3799(arg1.method5153());
		@Pc(44) long local44 = (long) (arg0 | arg2 << 7 | arg1.method5149() << 14 | arg1.method5155() << 20 | 0x40000000);
		if (local21.anInt3653 == 0) {
			local44 |= local14;
		}
		if (local21.anInt3633 == 1) {
			local44 |= local10;
		}
		if (local21.aBoolean267) {
			local44 |= local12;
		}
		return local44 | (long) arg1.method5153() << 32;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(BII)Z")
	public static boolean method921(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "(Z)V")
	public static void method922() {
		Static251.method5213(false);
		if (Static179.anInt3489 >= 0 && Static179.anInt3489 != 0) {
			Static171.method2780(Static179.anInt3489);
			Static179.anInt3489 = -1;
		}
	}
}
