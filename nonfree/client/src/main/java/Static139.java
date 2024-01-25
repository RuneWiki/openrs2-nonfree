import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!gp", name = "G", descriptor = "I")
	public static int anInt2567;

	@OriginalMember(owner = "client!gp", name = "K", descriptor = "I")
	public static int anInt2569;

	@OriginalMember(owner = "client!gp", name = "i", descriptor = "Lclient!ru;")
	public static final Class220 aClass220_15 = new Class220(8);

	@OriginalMember(owner = "client!gp", name = "L", descriptor = "I")
	public static int anInt2570 = -1;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIII)V")
	public static void method2167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class36 local7 = Static175.aClass36ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class11_Sub2 local13 = local7.aClass11_Sub2_1;
		@Pc(16) Class11_Sub2 local16 = local7.aClass11_Sub2_2;
		if (local13 != null) {
			local13.anInt4478 = local13.anInt4478 * arg3 / (0x10 << Static146.anInt2674 - 7);
			local13.anInt4475 = local13.anInt4475 * arg3 / (0x10 << Static146.anInt2674 - 7);
		}
		if (local16 != null) {
			local16.anInt4478 = local16.anInt4478 * arg3 / (0x10 << Static146.anInt2674 - 7);
			local16.anInt4475 = local16.anInt4475 * arg3 / (0x10 << Static146.anInt2674 - 7);
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(BII)Z")
	public static boolean method2169(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
