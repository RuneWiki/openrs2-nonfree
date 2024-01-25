import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static533 {

	@OriginalMember(owner = "client!sea", name = "k", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!sea", name = "r", descriptor = "Ljava/lang/Object;")
	public static Object anObject17;

	@OriginalMember(owner = "client!sea", name = "l", descriptor = "Z")
	public static boolean aBoolean637 = false;

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(IIZIIBIIF)[[I")
	public static int[][] method7425(@OriginalArg(8) float arg0) {
		@Pc(7) int[][] local7 = new int[256][64];
		@Pc(11) Class5_Sub6_Sub13 local11 = new Class5_Sub6_Sub13();
		local11.anInt2704 = 4;
		local11.anInt2712 = 4;
		local11.aBoolean188 = false;
		local11.anInt2714 = 3;
		local11.anInt2708 = (int) (arg0 * 4096.0F);
		local11.method8118();
		Static289.method3978(256, 64);
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			local11.method2419(local46, local7[local46]);
		}
		return local7;
	}
}
