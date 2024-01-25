import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static494 {

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "J")
	public static long aLong257 = 0L;

	@OriginalMember(owner = "client!sw", name = "d", descriptor = "Lclient!nea;")
	public static final Class240 aClass240_4 = new Class240();

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(IIIII)V")
	public static void method7057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class4_Sub7_Sub5 local8 = Static218.method3780(4, arg0);
		local8.method3066();
		local8.anInt3353 = arg3;
		local8.anInt3351 = arg2;
		local8.anInt3348 = arg1;
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(III)I")
	public static int method7059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local7 *= arg1;
			}
			arg0 >>= 0x1;
			arg1 *= arg1;
		}
		if (arg0 == 1) {
			return arg1 * local7;
		} else {
			return local7;
		}
	}
}
