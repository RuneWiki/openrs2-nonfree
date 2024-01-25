import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "[I")
	public static int[] anIntArray105;

	@OriginalMember(owner = "client!ea", name = "r", descriptor = "Lclient!to;")
	public static final Class333 aClass333_1 = new Class333("game3", "Game 3", 2);

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!lq;Ljava/lang/String;Lclient!cn;Lclient!da;IIIIIILclient!aa;I)V")
	public static void method1753(@OriginalArg(0) Class224 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class73 arg2, @OriginalArg(3) Class80 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class1 arg9, @OriginalArg(11) int arg10) {
		@Pc(15) int local15;
		if (Static79.anInt1216 == 4) {
			local15 = (int) Static429.aFloat132 & 0x3FFF;
		} else {
			local15 = Static609.anInt10107 + (int) Static429.aFloat132 & 0x3FFF;
		}
		@Pc(34) int local34 = Math.max(arg2.anInt1384 / 2, arg2.anInt1394 / 2) + 10;
		@Pc(43) int local43 = arg7 * arg7 + arg8 * arg8;
		if (local43 > local34 * local34) {
			return;
		}
		@Pc(54) int local54 = Class5_Sub12.anIntArray544[local15];
		@Pc(58) int local58 = Class5_Sub12.anIntArray543[local15];
		if (Static79.anInt1216 != 4) {
			local54 = local54 * 256 / (Static438.anInt7509 + 256);
			local58 = local58 * 256 / (Static438.anInt7509 + 256);
		}
		@Pc(90) int local90 = local54 * arg8 + arg7 * local58 >> 14;
		@Pc(108) int local108 = arg8 * local58 - arg7 * local54 >> 14;
		@Pc(115) int local115 = arg0.method5259(100, (Class134[]) null, arg1);
		@Pc(123) int local123 = arg0.method5251((Class134[]) null, 100, 0, arg1);
		@Pc(129) int local129 = local90 - local115 / 2;
		if (local129 >= -arg2.anInt1384 && local129 <= arg2.anInt1384 && local108 >= -arg2.anInt1394 && arg2.anInt1394 >= local108) {
			arg3.method8782(0, 0, 50, arg5, 0, (Class134[]) null, local115, arg1, arg4, (int[]) null, local129 + arg6 + arg2.anInt1384 / 2, arg6, arg9, arg4 + arg2.anInt1394 / 2 - local108 - arg10 - local123, 1);
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)V")
	public static void method1754(@OriginalArg(0) int arg0) {
		Static314.anInt5572 = arg0;
		Static28.aClass391_53.method9276(0);
	}
}
