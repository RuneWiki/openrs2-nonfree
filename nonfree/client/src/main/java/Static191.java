import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!kq", name = "J", descriptor = "[[I")
	public static int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!kq", name = "K", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray3;

	@OriginalMember(owner = "client!kq", name = "P", descriptor = "[S")
	public static short[] aShortArray61;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lclient!ah;Lclient!ah;I)V")
	public static void method3041(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1) {
		if (arg0.aClass3_244 != null) {
			arg0.method5700();
		}
		arg0.aClass3_243 = arg1;
		arg0.aClass3_244 = arg1.aClass3_244;
		arg0.aClass3_244.aClass3_243 = arg0;
		arg0.aClass3_243.aClass3_244 = arg0;
	}

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "(I)V")
	public static void method3042() {
		if (Static313.aClass155_8 != null) {
			Static313.aClass155_8.method4929();
			Static358.aClass150_5 = null;
			Static313.aClass155_8 = null;
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIII)I")
	public static int method3043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg1) {
			return arg1;
		}
		@Pc(17) int local17 = 128 - arg0;
		@Pc(31) int local31 = arg0 * (arg2 & 0x7F) + local17 * (arg1 & 0x7F) >> 7;
		@Pc(45) int local45 = arg0 * (arg2 & 0x380) + local17 * (arg1 & 0x380) >> 7;
		@Pc(60) int local60 = local17 * (arg1 & 0xFC00) + (arg2 & 0xFC00) * arg0 >> 7;
		return local45 & 0x380 | local60 & 0xFC00 | local31 & 0x7F;
	}

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "(II)V")
	public static void method3045(@OriginalArg(1) int arg0) {
		@Pc(1) Class3_Sub7_Sub6 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class7 local8 = Static89.aClass7Array4[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static103.anInt2050; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static44.anInt791; local15++) {
						local1 = local8.method5641(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static187.anInt3390;
							@Pc(32) int local32 = local12 << Static187.anInt3390;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class7 local41 = Static89.aClass7Array4[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.method5648(local15, local12) - local41.method5648(local15, local12);
									@Pc(67) int local67 = local8.method5648(local15 + 1, local12) - local41.method5648(local15 + 1, local12);
									@Pc(85) int local85 = local8.method5648(local15 + 1, local12 + 1) - local41.method5648(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.method5648(local15, local12 + 1) - local41.method5648(local15, local12 + 1);
									local41.method5642(local1, local28, (local53 + local67 + local85 + local99) / 4, local32);
								}
							}
						}
					}
				}
			}
		}
	}
}
