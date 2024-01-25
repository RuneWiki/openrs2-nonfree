import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "Lclient!hk;")
	public static Class141 aClass141_1;

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "[I")
	public static final int[] anIntArray127 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)Lclient!ff;")
	public static Class4_Sub17 method2545() {
		if (Static455.aClass244_24 == null || Static39.aClass89_1 == null) {
			return null;
		}
		for (@Pc(24) Class4_Sub17 local24 = (Class4_Sub17) Static39.aClass89_1.method2481(); local24 != null; local24 = (Class4_Sub17) Static39.aClass89_1.method2481()) {
			@Pc(32) Class338 local32 = Static455.aClass142_2.method3366(local24.anInt2866);
			if (local32 != null && local32.aBoolean685 && local32.method7973(Static455.anInterface21_2)) {
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(JLclient!ua;IIILclient!n;IBI)V")
	public static void method2546(@OriginalArg(0) long arg0, @OriginalArg(1) Class6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class225 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) int local11 = arg2 * arg2 + arg6 * arg6;
		if (arg0 < (long) local11) {
			return;
		}
		@Pc(36) int local36 = Math.min(arg5.anInt6529 / 2, arg5.anInt6521 / 2);
		if (local36 * local36 >= local11) {
			Static192.method3340(Static32.aClass78Array3[arg7], arg3, arg5, arg2, arg6, arg1, arg4);
			return;
		}
		local36 -= 10;
		@Pc(64) int local64;
		if (Static166.anInt3419 == 4) {
			local64 = (int) Static201.aFloat128 & 0x3FFF;
		} else {
			local64 = Static368.anInt7167 + (int) Static201.aFloat128 & 0x3FFF;
		}
		@Pc(75) int local75 = Class4_Sub27.anIntArray296[local64];
		@Pc(79) int local79 = Class4_Sub27.anIntArray297[local64];
		if (Static166.anInt3419 != 4) {
			local79 = local79 * 256 / (Static595.anInt10298 + 256);
			local75 = local75 * 256 / (Static595.anInt10298 + 256);
		}
		@Pc(108) int local108 = arg6 * local79 + local75 * arg2 >> 14;
		@Pc(119) int local119 = arg2 * local79 - local75 * arg6 >> 14;
		@Pc(125) double local125 = Math.atan2((double) local108, (double) local119);
		@Pc(132) int local132 = (int) ((double) local36 * Math.sin(local125));
		@Pc(139) int local139 = (int) ((double) local36 * Math.cos(local125));
		Static353.aClass78Array15[arg7].method8189((float) local132 + (float) arg5.anInt6529 / 2.0F + (float) arg3, (float) -local139 + (float) arg5.anInt6521 / 2.0F + (float) arg4, 4096, (int) (-local125 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(III)Z")
	public static boolean method2547(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return ((arg1 & 0x2000) != 0 | Static584.method8298(arg0, arg1) | Static528.method7656(arg0, arg1)) & Static230.method3721(arg1, arg0);
	}
}
