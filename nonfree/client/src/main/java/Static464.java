import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static464 {

	@OriginalMember(owner = "client!q", name = "e", descriptor = "I")
	public static int anInt7835;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IBILclient!aia;)J")
	public static long method6626(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface1 arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = Long.MIN_VALUE;
		@Pc(14) Class164 local14 = Static568.aClass315_5.method7511(arg2.method8986());
		@Pc(35) long local35 = (long) (arg2.method8984() << 14 | arg0 | arg1 << 7 | arg2.method8987() << 20 | 0x40000000);
		if (local14.anInt4647 == 0) {
			local35 |= local7;
		}
		if (local14.anInt4667 == 1) {
			local35 |= local5;
		}
		return local35 | (long) arg2.method8986() << 32;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IJ)I")
	public static int method6627(@OriginalArg(1) long arg0) {
		return (int) (arg0 / 86400000L) - 11745;
	}
}
