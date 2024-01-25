import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!tl", name = "G", descriptor = "I")
	public static int anInt6790;

	@OriginalMember(owner = "client!tl", name = "A", descriptor = "Lclient!ub;")
	public static Class240 aClass240_34 = new Class240(64);

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IILclient!np;I)J")
	public static long method5327(@OriginalArg(0) int arg0, @OriginalArg(2) Interface9 arg1, @OriginalArg(3) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(16) long local16 = 2147483648L;
		@Pc(18) long local18 = Long.MIN_VALUE;
		@Pc(25) Class250 local25 = Static406.aClass150_3.method3508(arg1.method5901());
		@Pc(46) long local46 = (long) (arg2 << 7 | arg0 | arg1.method5904() << 14 | arg1.method5902() << 20 | 0x40000000);
		if (local25.anInt7186 == 0) {
			local46 |= local18;
		}
		if (local25.anInt7142 == 1) {
			local46 |= local5;
		}
		if (local25.aBoolean605) {
			local46 |= local16;
		}
		return local46 | (long) arg1.method5901() << 32;
	}
}
