import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "[I")
	public static final int[] anIntArray527 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "Lclient!vq;")
	public static Class211 aClass211_30 = new Class211();

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!ja;ZI[BBI[Lclient!c;)V")
	public static void method4415(@OriginalArg(0) Class81 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class27[] arg5) {
		@Pc(15) Class6_Sub10 local15 = new Class6_Sub10(arg3);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local15.method4010();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local15.method4017();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(48) int local48 = local32 & 0x3F;
				@Pc(54) int local54 = local32 >> 6 & 0x3F;
				@Pc(58) int local58 = local32 >> 12;
				@Pc(62) int local62 = local15.method3972();
				@Pc(66) int local66 = local62 >> 2;
				@Pc(70) int local70 = local62 & 0x3;
				@Pc(75) int local75 = local54 + arg2;
				@Pc(80) int local80 = local48 + arg4;
				if (local75 > 0 && local80 > 0 && local75 < Static153.anInt2883 - 1 && Static246.anInt4606 - 1 > local80) {
					@Pc(102) Class27 local102 = null;
					if (!arg1) {
						@Pc(106) int local106 = local58;
						if ((Static265.aByteArrayArrayArray11[1][local75][local80] & 0x2) == 2) {
							local106 = local58 - 1;
						}
						if (local106 >= 0) {
							local102 = arg5[local106];
						}
					}
					Static96.method1743(local17, local75, local58, arg1, local80, local58, -1, true, local66, local70, arg0, local102);
				}
			}
		}
	}
}
