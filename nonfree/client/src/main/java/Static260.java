import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!jd", name = "n", descriptor = "F")
	public static float aFloat123;

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
	public static int anInt5570 = 0;

	@OriginalMember(owner = "client!jd", name = "i", descriptor = "Z")
	public static boolean aBoolean441 = true;

	@OriginalMember(owner = "client!jd", name = "p", descriptor = "Lclient!fc;")
	public static final Class94 aClass94_23 = new Class94(128, 4);

	@OriginalMember(owner = "client!jd", name = "u", descriptor = "[I")
	public static final int[] anIntArray232 = new int[13];

	@OriginalMember(owner = "client!jd", name = "v", descriptor = "S")
	public static short aShort49 = 320;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIZIFIIBI)[[I")
	public static int[][] method4607(@OriginalArg(4) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class6_Sub1_Sub35 local13 = new Class6_Sub1_Sub35();
		local13.anInt9674 = 4;
		local13.anInt9675 = 4;
		local13.anInt9672 = 3;
		local13.aBoolean770 = false;
		local13.anInt9677 = (int) (arg0 * 4096.0F);
		local13.method8732();
		Static25.method714(64, 256);
		for (@Pc(40) int local40 = 0; local40 < 256; local40++) {
			local13.method7919(local9[local40], local40);
		}
		return local9;
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)V")
	public static void method4613() {
		@Pc(15) int local15 = Static87.aClass6_Sub33_6.aClass14_Sub15_2.method5352();
		if (local15 == 0) {
			Static538.aByteArrayArrayArray18 = null;
			Static74.method2091(0);
		} else if (local15 == 1) {
			Static365.method5875((byte) 0);
			Static74.method2091(512);
			if (Static495.aByteArrayArrayArray17 != null) {
				Static447.method6817();
			}
		} else {
			Static365.method5875((byte) (Static322.anInt6388 - 4 & 0xFF));
			Static74.method2091(2);
		}
		Static282.anInt5926 = Static86.anInt10575;
	}
}
