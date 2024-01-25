import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static515 {

	@OriginalMember(owner = "client!vj", name = "n", descriptor = "[I")
	public static int[] anIntArray677;

	@OriginalMember(owner = "client!vj", name = "p", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_90 = new Class77(69, -1);

	@OriginalMember(owner = "client!vj", name = "s", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_144 = new Class45(60, 2);

	@OriginalMember(owner = "client!vj", name = "t", descriptor = "Z")
	public static boolean aBoolean655 = false;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIFIIZIII)[[I")
	public static int[][] method7623(@OriginalArg(2) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class12_Sub1_Sub33 local13 = new Class12_Sub1_Sub33();
		local13.anInt8609 = 8;
		local13.anInt8613 = (int) (arg0 * 4096.0F);
		local13.anInt8608 = 4;
		local13.aBoolean611 = false;
		local13.anInt8619 = 3;
		local13.method7797();
		Static33.method3595(256, 64);
		for (@Pc(47) int local47 = 0; local47 < 256; local47++) {
			local13.method7080(local47, local9[local47]);
		}
		return local9;
	}
}
