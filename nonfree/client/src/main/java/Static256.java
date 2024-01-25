import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!qg", name = "w", descriptor = "I")
	public static int anInt4991;

	@OriginalMember(owner = "client!qg", name = "x", descriptor = "I")
	public static int anInt4992;

	@OriginalMember(owner = "client!qg", name = "A", descriptor = "I")
	public static int anInt4994;

	@OriginalMember(owner = "client!qg", name = "B", descriptor = "Lclient!gg;")
	public static Class5_Sub9_Sub8 aClass5_Sub9_Sub8_2;

	@OriginalMember(owner = "client!qg", name = "s", descriptor = "[I")
	public static final int[] anIntArray385 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!qg", name = "C", descriptor = "Z")
	public static boolean aBoolean382 = false;

	@OriginalMember(owner = "client!qg", name = "D", descriptor = "I")
	public static int anInt4995 = 0;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IILclient!hm;IILclient!jf;III)V")
	public static void method4449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class96 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(12) int local12 = arg6 * arg6 + arg7 * arg7;
		if (arg3 < local12) {
			return;
		}
		@Pc(30) int local30 = Math.min(arg5.anInt2943 / 2, arg5.anInt2916 / 2);
		if (local30 * local30 >= local12) {
			Static208.method3707(arg4, arg0, arg7, arg2, arg5, arg6, Static109.aClass54Array12[arg1]);
			return;
		}
		local30 -= 10;
		@Pc(50) int local50;
		if (Static215.anInt4279 == 4) {
			local50 = (int) Static155.aFloat64 & 0x3FFF;
		} else {
			local50 = Static253.anInt4957 + (int) Static155.aFloat64 & 0x3FFF;
		}
		@Pc(62) int local62 = Class5_Sub9_Sub12.anIntArray169[local50];
		@Pc(66) int local66 = Class5_Sub9_Sub12.anIntArray170[local50];
		if (Static215.anInt4279 != 4) {
			local62 = local62 * 256 / (Static339.anInt6353 + 256);
			local66 = local66 * 256 / (Static339.anInt6353 + 256);
		}
		@Pc(98) int local98 = local62 * arg7 + local66 * arg6 >> 15;
		@Pc(109) int local109 = arg7 * local66 - arg6 * local62 >> 15;
		@Pc(115) double local115 = Math.atan2((double) local98, (double) local109);
		@Pc(122) int local122 = (int) (Math.sin(local115) * (double) local30);
		@Pc(129) int local129 = (int) (Math.cos(local115) * (double) local30);
		Static32.aClass54Array3[arg1].method5579((float) arg4 + (float) arg5.anInt2943 / 2.0F + (float) local122, (float) -local129 + (float) arg5.anInt2916 / 2.0F + (float) arg0, 4096, (int) (-local115 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "(B)Z")
	public static boolean method4450() {
		return Static200.anInt5712 == 0 ? Static352.aClass5_Sub17_Sub2_3.method3186() : true;
	}
}
