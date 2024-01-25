import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static539 {

	@OriginalMember(owner = "client!tf", name = "x", descriptor = "[Lclient!jaa;")
	public static Class153_Sub1[] aClass153_Sub1Array2;

	@OriginalMember(owner = "client!tf", name = "r", descriptor = "Z")
	public static boolean aBoolean784 = false;

	@OriginalMember(owner = "client!tf", name = "s", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_126 = new Class218(73, 2);

	@OriginalMember(owner = "client!tf", name = "v", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_127 = new Class218(77, 3);

	@OriginalMember(owner = "client!tf", name = "w", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_128 = new Class218(97, 4);

	@OriginalMember(owner = "client!tf", name = "y", descriptor = "I")
	public static int anInt9289 = 0;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IB)I")
	public static int method7665(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return arg0 + local5;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIZFIIIIZ)[[I")
	public static int[][] method7668(@OriginalArg(3) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class3_Sub2_Sub13 local13 = new Class3_Sub2_Sub13();
		local13.anInt4343 = (int) (arg0 * 4096.0F);
		local13.anInt4340 = 3;
		local13.anInt4346 = 4;
		local13.anInt4345 = 4;
		local13.aBoolean370 = false;
		local13.method8332();
		Static262.method4869(64, 256);
		for (@Pc(45) int local45 = 0; local45 < 256; local45++) {
			local13.method3716(local45, local9[local45]);
		}
		return local9;
	}
}
