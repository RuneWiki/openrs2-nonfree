import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static191 {

	@OriginalMember(owner = "client!hca", name = "l", descriptor = "[J")
	public static long[] aLongArray7;

	@OriginalMember(owner = "client!hca", name = "o", descriptor = "Z")
	public static boolean aBoolean273 = false;

	@OriginalMember(owner = "client!hca", name = "p", descriptor = "I")
	public static int anInt3633 = -1;

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(III)Z")
	public static boolean method3236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x40000) != 0 | Static504.method6792(arg1, arg0) || Static380.method5566(arg1, arg0);
	}
}
