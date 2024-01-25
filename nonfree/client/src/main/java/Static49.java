import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!bm", name = "p", descriptor = "F")
	public static float aFloat2;

	@OriginalMember(owner = "client!bm", name = "q", descriptor = "I")
	public static int anInt592;

	@OriginalMember(owner = "client!bm", name = "r", descriptor = "[I")
	public static final int[] anIntArray45 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!bm", name = "n", descriptor = "I")
	public static int anInt596 = 0;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIFBZII)[[I")
	public static int[][] method593(@OriginalArg(4) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class6_Sub8_Sub15 local13 = new Class6_Sub8_Sub15();
		local13.anInt5364 = (int) (arg0 * 4096.0F);
		local13.anInt5371 = 3;
		local13.anInt5361 = 4;
		local13.anInt5360 = 4;
		local13.aBoolean405 = false;
		local13.method8936();
		Static497.method7321(64, 256);
		for (@Pc(47) int local47 = 0; local47 < 256; local47++) {
			local13.method4916(local47, local9[local47]);
		}
		return local9;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIB)Z")
	public static boolean method595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x400) != 0;
	}
}
