import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ad", name = "M", descriptor = "Lclient!de;")
	public static Class48 aClass48_1;

	@OriginalMember(owner = "client!ad", name = "Q", descriptor = "Lclient!kh;")
	public static Class136 aClass136_1;

	@OriginalMember(owner = "client!ad", name = "w", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_3 = new Class44(28, -1);

	@OriginalMember(owner = "client!ad", name = "H", descriptor = "[I")
	public static final int[] anIntArray4 = new int[8];

	@OriginalMember(owner = "client!ad", name = "K", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_4 = new Class44(34, 3);

	@OriginalMember(owner = "client!ad", name = "L", descriptor = "[Lclient!sq;")
	public static final Class4_Sub2_Sub2_Sub2[] aClass4_Sub2_Sub2_Sub2Array1 = new Class4_Sub2_Sub2_Sub2[32768];

	@OriginalMember(owner = "client!ad", name = "O", descriptor = "[Z")
	public static final boolean[] aBooleanArray4 = new boolean[8];

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(FIIF[BFLclient!v;FIZIIF)V")
	public static void method136(@OriginalArg(0) float arg0, @OriginalArg(3) float arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) float arg3, @OriginalArg(6) Class160 arg4, @OriginalArg(7) float arg5, @OriginalArg(8) int arg6, @OriginalArg(12) float arg7) {
		for (@Pc(11) int local11 = 0; local11 < 16; local11++) {
			Static314.method4492(arg4, arg7, arg5, arg6, local11, arg3, arg0, arg1, arg2);
			arg6 += 16384;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!dc;IIIIIZ)V")
	public static void method137(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (Static18.anInt404 >= 50 || (arg0 == null || arg0.anIntArrayArray8 == null || arg1 >= arg0.anIntArrayArray8.length || arg0.anIntArrayArray8[arg1] == null)) {
			return;
		}
		@Pc(30) int local30 = arg0.anIntArrayArray8[arg1][0];
		@Pc(34) int local34 = local30 >> 8;
		@Pc(40) int local40 = local30 >> 5 & 0x7;
		@Pc(44) int local44 = local30 & 0x1F;
		@Pc(68) int local68;
		if (arg0.anIntArrayArray8[arg1].length > 1) {
			local68 = (int) ((double) arg0.anIntArrayArray8[arg1].length * Math.random());
			if (local68 > 0) {
				local34 = arg0.anIntArrayArray8[arg1][local68];
			}
		}
		if (local44 == 0) {
			if (arg5) {
				Static404.method5495(255, local40, 0, local34);
			}
		} else if (Static399.aClass167_Sub1_1.anInt5567 != 0) {
			local68 = arg4 - 64 >> 7;
			@Pc(113) int local113 = arg2 - 64 >> 7;
			Static148.aClass9Array1[Static18.anInt404++] = new Class9((byte) 1, local34, local40, 0, 255, local44 + (arg3 << 24) + (local68 << 16) + (local113 << 8));
		}
	}
}
