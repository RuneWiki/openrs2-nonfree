import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(I[S)[S")
	public static short[] method5708(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) short[] local16 = new short[arg0.length];
			Static684.method5328(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(ILclient!he;II)J")
	public static long method5709(@OriginalArg(1) Interface11 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = Long.MIN_VALUE;
		@Pc(14) Class277 local14 = Static652.aClass267_4.method6682(arg0.method9221());
		@Pc(39) long local39 = (long) (arg1 | 0x40000000 | arg2 << 7 | arg0.method9216() << 14 | arg0.method9217() << 20);
		if (local14.anInt7757 == 0) {
			local39 |= local7;
		}
		if (local14.anInt7738 == 1) {
			local39 |= local5;
		}
		return local39 | (long) arg0.method9221() << 32;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(III)Z")
	public static boolean method5710(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x100) != 0;
	}
}
