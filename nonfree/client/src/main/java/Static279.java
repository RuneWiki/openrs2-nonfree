import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!ks", name = "C", descriptor = "J")
	public static volatile long aLong127 = 0L;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!ha;III[Z)V")
	public static void method4034(@OriginalArg(0) Class1_Sub8_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static310.aClass129Array5 == Static150.aClass129Array4) {
			return;
		}
		@Pc(10) int local10 = Static36.aClass129Array7[arg1].method6480(arg3, arg2);
		for (@Pc(12) int local12 = 0; local12 <= arg1; local12++) {
			if (arg4 == null || arg4[local12]) {
				@Pc(23) Class129 local23 = Static36.aClass129Array7[local12];
				if (local23 != null) {
					local23.DA(arg0, arg2, local10 - local23.method6480(arg3, arg2), arg3, 0, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(III[BII)Z")
	public static boolean method4038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(17) Class1_Sub3 local17 = new Class1_Sub3(arg3);
		@Pc(19) int local19 = -1;
		label56: while (true) {
			@Pc(23) int local23 = local17.method7935();
			if (local23 == 0) {
				return local7;
			}
			local19 += local23;
			@Pc(31) int local31 = 0;
			@Pc(33) boolean local33 = false;
			while (true) {
				@Pc(39) int local39;
				while (!local33) {
					local39 = local17.method7971();
					if (local39 == 0) {
						continue label56;
					}
					local31 += local39 - 1;
					@Pc(63) int local63 = local31 & 0x3F;
					@Pc(69) int local69 = local31 >> 6 & 0x3F;
					@Pc(75) int local75 = local17.method7974() >> 2;
					@Pc(79) int local79 = local69 + arg4;
					@Pc(83) int local83 = arg0 + local63;
					if (local79 > 0 && local83 > 0 && arg1 - 1 > local79 && local83 < arg2 - 1) {
						@Pc(113) Class178 local113 = Static347.aClass122_4.method2770(local19);
						if (local75 != 22 || Static86.aClass1_Sub30_Sub1_1.aBoolean487 || local113.anInt4662 != 0 || local113.anInt4666 == 1 || local113.aBoolean358) {
							if (!local113.method3707()) {
								local7 = false;
								Static104.anInt1782++;
							}
							local33 = true;
						}
					}
				}
				local39 = local17.method7971();
				if (local39 == 0) {
					break;
				}
				local17.method7974();
			}
		}
	}
}
