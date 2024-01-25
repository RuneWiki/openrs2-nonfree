import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!kk", name = "J", descriptor = "Lclient!ad;")
	public static final Class4 aClass4_4 = new Class4();

	@OriginalMember(owner = "client!kk", name = "M", descriptor = "[I")
	public static final int[] anIntArray408 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!kk", name = "N", descriptor = "I")
	public static int anInt3451 = 0;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/lang/String;Lclient!rg;IBILclient!di;Lclient!rj;IIIILclient!tm;)V")
	public static void method3184(@OriginalArg(0) String arg0, @OriginalArg(1) Class177 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class38 arg4, @OriginalArg(6) Class13 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class97 arg10) {
		@Pc(15) int local15;
		if (Static81.anInt1609 == 4) {
			local15 = (int) Static304.aFloat110 & 0x3FFF;
		} else {
			local15 = Static277.anInt6206 + (int) Static304.aFloat110 & 0x3FFF;
		}
		@Pc(34) int local34 = Math.max(arg1.anInt5179 / 2, arg1.anInt5209 / 2) + 10;
		@Pc(42) int local42 = arg9 * arg9 + arg2 * arg2;
		if (local34 * local34 < local42) {
			return;
		}
		@Pc(56) int local56 = Class1_Sub1_Sub16.anIntArray587[local15];
		@Pc(60) int local60 = Class1_Sub1_Sub16.anIntArray586[local15];
		if (Static81.anInt1609 != 4) {
			local60 = local60 * 256 / (Static311.anInt5996 + 256);
			local56 = local56 * 256 / (Static311.anInt5996 + 256);
		}
		@Pc(91) int local91 = arg2 * local60 + local56 * arg9 >> 15;
		@Pc(101) int local101 = arg9 * local60 - arg2 * local56 >> 15;
		@Pc(108) int local108 = arg4.method1309(null, 100, arg0);
		@Pc(116) int local116 = arg4.method1310(arg0, null);
		@Pc(122) int local122 = local91 - local108 / 2;
		if (local122 >= -arg1.anInt5179 && local122 <= arg1.anInt5179 && local101 >= -arg1.anInt5209 && local101 <= arg1.anInt5209) {
			arg5.method4442(arg0, 1, arg7, 0, null, 0, local108, arg8, 0, arg8 + local122 + arg1.anInt5179 / 2, arg6, arg1.anInt5209 / 2 + arg7 - local116 - arg3 - local101, arg10, 50, null);
		}
	}
}
