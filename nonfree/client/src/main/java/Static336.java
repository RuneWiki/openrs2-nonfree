import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!te", name = "P", descriptor = "Lclient!mt;")
	public static Class156 aClass156_1;

	@OriginalMember(owner = "client!te", name = "L", descriptor = "Lclient!ib;")
	public static final Class109 aClass109_1 = new Class109();

	@OriginalMember(owner = "client!te", name = "O", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_153 = new Class77(19, 12);

	@OriginalMember(owner = "client!te", name = "Q", descriptor = "[I")
	public static final int[] anIntArray716 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BIIIIZFII)[[I")
	public static int[][] method5151(@OriginalArg(6) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class2_Sub6_Sub39 local13 = new Class2_Sub6_Sub39();
		local13.anInt6596 = 4;
		local13.anInt6599 = (int) (arg0 * 4096.0F);
		local13.anInt6593 = 8;
		local13.aBoolean492 = false;
		local13.anInt6602 = 3;
		local13.method5639();
		Static31.method736(256, 64);
		for (@Pc(40) int local40 = 0; local40 < 256; local40++) {
			local13.method5645(local40, local9[local40]);
		}
		return local9;
	}
}
