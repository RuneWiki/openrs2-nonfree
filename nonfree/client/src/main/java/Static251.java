import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!hq", name = "Ob", descriptor = "I")
	public static int anInt3953 = 0;

	@OriginalMember(owner = "client!hq", name = "Mb", descriptor = "Z")
	public static boolean aBoolean349 = false;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IILclient!vi;B)J")
	public static long method3562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface25 arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = Long.MIN_VALUE;
		@Pc(14) Class81 local14 = Static148.aClass153_3.method3342(arg2.method8986());
		@Pc(35) long local35 = (long) (arg2.method8991((byte) 56) << 14 | arg0 | arg1 << 7 | arg2.method8992() << 20 | 0x40000000);
		if (local14.anInt1873 == 0) {
			local35 |= local7;
		}
		if (local14.anInt1851 == 1) {
			local35 |= local5;
		}
		return local35 | (long) arg2.method8986() << 32;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(BZI)Ljava/lang/String;")
	public static String method3564(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		return arg0 && arg1 >= 0 ? Static665.method9063(arg0, arg1) : Integer.toString(arg1);
	}
}
