import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!l", name = "b", descriptor = "Z")
	public static boolean aBoolean231 = false;

	@OriginalMember(owner = "client!l", name = "e", descriptor = "S")
	public static short aShort42 = 32767;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(III)V")
	public static void method3300(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class61 local7 = Static241.method5342(arg0);
		@Pc(10) int local10 = local7.anInt1353;
		@Pc(13) int local13 = local7.anInt1356;
		@Pc(16) int local16 = local7.anInt1352;
		@Pc(23) int local23 = Class6_Sub2_Sub11_Sub2.anIntArray569[local16 - local13];
		if (arg1 < 0 || arg1 > local23) {
			arg1 = 0;
		}
		local23 <<= local13;
		Static37.method639(Static41.anIntArray720[local10] & ~local23 | arg1 << local13 & local23, local10);
	}
}
