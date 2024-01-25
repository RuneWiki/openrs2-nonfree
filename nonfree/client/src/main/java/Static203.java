import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!nc", name = "Q", descriptor = "Lclient!am;")
	public static Class11 aClass11_84;

	@OriginalMember(owner = "client!nc", name = "R", descriptor = "I")
	public static int anInt4288;

	@OriginalMember(owner = "client!nc", name = "bb", descriptor = "I")
	public static int anInt4295;

	@OriginalMember(owner = "client!nc", name = "V", descriptor = "F")
	public static float aFloat41 = 0.0F;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public static boolean method3608(@OriginalArg(1) String arg0) {
		return Static245.method4234(arg0);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!fd;Lclient!go;IIIIIII)V")
	public static void method3610(@OriginalArg(0) Class72 arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = arg2 * arg2 + arg5 * arg5;
		if (arg3 < local16) {
			return;
		}
		@Pc(34) int local34 = Math.min(arg0.anInt1829 / 2, arg0.anInt1806 / 2);
		if (local16 <= local34 * local34) {
			Static2.method4193(arg0, arg2, Static108.aClass60Array5[arg6], arg7, arg4, arg1, arg5);
			return;
		}
		local34 -= 10;
		@Pc(64) int local64;
		if (Static303.anInt3065 == 4) {
			local64 = (int) Static138.aFloat35 & 0x3FFF;
		} else {
			local64 = (int) Static138.aFloat35 + Static222.anInt4620 & 0x3FFF;
		}
		@Pc(77) int local77 = Class4_Sub4_Sub25.anIntArray384[local64];
		@Pc(81) int local81 = Class4_Sub4_Sub25.anIntArray383[local64];
		if (Static303.anInt3065 != 4) {
			local77 = local77 * 256 / (Static48.anInt1082 + 256);
			local81 = local81 * 256 / (Static48.anInt1082 + 256);
		}
		@Pc(113) int local113 = arg2 * local77 + local81 * arg5 >> 15;
		@Pc(123) int local123 = local81 * arg2 - arg5 * local77 >> 15;
		@Pc(129) double local129 = Math.atan2((double) local113, (double) local123);
		@Pc(136) int local136 = (int) (Math.sin(local129) * (double) local34);
		@Pc(143) int local143 = (int) ((double) local34 * Math.cos(local129));
		Static244.aClass60Array15[arg6].method5685((float) local136 + (float) arg7 + (float) arg0.anInt1829 / 2.0F, (float) -local143 + (float) arg4 + (float) arg0.anInt1806 / 2.0F, 4096, (int) (-local129 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IILclient!fd;)I")
	public static int method3611(@OriginalArg(1) int arg0, @OriginalArg(2) Class72 arg1) {
		if (!Static46.method876(arg1).method257(arg0) && arg1.anObjectArray12 == null) {
			return -1;
		} else if (arg1.anIntArray178 == null || arg1.anIntArray178.length <= arg0) {
			return -1;
		} else {
			return arg1.anIntArray178[arg0];
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BI)V")
	public static void method3613(@OriginalArg(1) int arg0) {
		if (Static110.anIntArray234 == null || arg0 > Static110.anIntArray234.length) {
			Static110.anIntArray234 = new int[arg0];
		}
	}
}
