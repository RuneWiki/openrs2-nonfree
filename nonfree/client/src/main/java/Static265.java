import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!nn", name = "bb", descriptor = "I")
	public static int anInt4940 = 0;

	@OriginalMember(owner = "client!nn", name = "cb", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_101 = new Class265(80, 6);

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILclient!em;ILclient!ma;IILclient!dq;ILjava/lang/String;Lclient!la;II)V")
	public static void method3968(@OriginalArg(0) int arg0, @OriginalArg(1) Class68 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class73 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class58 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) String arg7, @OriginalArg(9) Class116 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(15) int local15;
		if (Static159.anInt3195 == 4) {
			local15 = (int) Static202.aFloat62 & 0x3FFF;
		} else {
			local15 = Static166.anInt3321 + (int) Static202.aFloat62 & 0x3FFF;
		}
		@Pc(36) int local36 = Math.max(arg1.anInt2188 / 2, arg1.anInt2252 / 2) + 10;
		@Pc(44) int local44 = arg10 * arg10 + arg6 * arg6;
		if (local44 > local36 * local36) {
			return;
		}
		@Pc(58) int local58 = Class162.anIntArray388[local15];
		@Pc(62) int local62 = Class162.anIntArray387[local15];
		if (Static159.anInt3195 != 4) {
			local62 = local62 * 256 / (Static261.anInt4889 + 256);
			local58 = local58 * 256 / (Static261.anInt4889 + 256);
		}
		@Pc(93) int local93 = local62 * arg10 + arg6 * local58 >> 15;
		@Pc(104) int local104 = arg6 * local62 - arg10 * local58 >> 15;
		@Pc(111) int local111 = arg5.method1338(100, null, arg7);
		@Pc(117) int local117 = local93 - local111 / 2;
		@Pc(125) int local125 = arg5.method1339(null, arg7);
		if (local117 >= -arg1.anInt2188 && arg1.anInt2188 >= local117 && -arg1.anInt2252 <= local104 && arg1.anInt2252 >= local104) {
			arg8.method4813(0, arg3, 50, arg1.anInt2188 / 2 + local117 + arg2, arg9, arg2, arg7, 0, arg0, arg0 + arg1.anInt2252 / 2 - local125 - local104 - arg4, null, local111, null);
		}
	}
}
