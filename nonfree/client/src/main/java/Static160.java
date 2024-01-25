import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!hs", name = "m", descriptor = "Lclient!ur;")
	public static Class253 aClass253_3;

	@OriginalMember(owner = "client!hs", name = "k", descriptor = "I")
	public static int anInt3220 = 100;

	@OriginalMember(owner = "client!hs", name = "l", descriptor = "I")
	public static int anInt3221 = 0;

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Z)Lclient!wk;")
	public static Class10_Sub46 method2692() {
		if (Static143.aClass163_27 == null || Static92.aClass90_1 == null) {
			return null;
		}
		for (@Pc(16) Class10_Sub46 local16 = (Class10_Sub46) Static92.aClass90_1.method2299(); local16 != null; local16 = (Class10_Sub46) Static92.aClass90_1.method2299()) {
			@Pc(24) Class208 local24 = Static143.aClass88_2.method2268(local16.anInt7522);
			if (local24 != null && local24.aBoolean388 && local24.method4759(Static143.anInterface5_2)) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIILclient!rj;)J")
	public static long method2693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Interface10 arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = 2147483648L;
		@Pc(9) long local9 = Long.MIN_VALUE;
		@Pc(16) Class126 local16 = Static342.aClass237_4.method5212(arg2.method5706());
		@Pc(37) long local37 = (long) ((arg1 | 0x800000) << 7 | arg0 | arg2.method5702() << 14 | arg2.method5705() << 20);
		if (local16.anInt3778 == 0) {
			local37 |= local9;
		}
		if (local16.anInt3786 == 1) {
			local37 |= local5;
		}
		if (local16.aBoolean252) {
			local37 |= local7;
		}
		return local37 | (long) arg2.method5706() << 32;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!ph;I)I")
	public static int method2699(@OriginalArg(0) Class187 arg0) {
		@Pc(10) int local10 = 0;
		if (arg0.method4282(Static343.anInt5846)) {
			local10++;
		}
		if (arg0.method4282(Static217.anInt4139)) {
			local10++;
		}
		return local10;
	}
}
