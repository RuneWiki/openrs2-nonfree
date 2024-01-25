import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!kja", name = "d", descriptor = "J")
	public static long aLong160 = 0L;

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "(ILclient!ha;Lclient!qga;II)V")
	public static void method5042(@OriginalArg(0) int arg0, @OriginalArg(1) Class144 arg1, @OriginalArg(2) Class299 arg2, @OriginalArg(3) int arg3) {
		for (@Pc(11) int local11 = 63; local11 >= 0; local11--) {
			Static302.method4913(true, false);
			@Pc(35) int local35 = (local11 & 0x3F) << 10 | 0x380 | 0x3F;
			@Pc(39) int local39 = Static302.anIntArray299[local35];
			Static545.method5452(-103, false, true);
			arg1.aa(arg3, arg0 + ((63 - local11) * arg2.anInt8547 >> 6), arg2.anInt8573, (arg2.anInt8547 >> 6) + 1, local39, 0);
		}
	}

	@OriginalMember(owner = "client!kja", name = "d", descriptor = "(II)Z")
	public static boolean method5045(@OriginalArg(1) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "(IIIIII)V")
	public static void method5047(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(13) int local13 = arg2; local13 <= arg1; local13++) {
			Static240.method4038(arg0, Static144.anIntArrayArray30[local13], arg3, arg4);
		}
	}
}
