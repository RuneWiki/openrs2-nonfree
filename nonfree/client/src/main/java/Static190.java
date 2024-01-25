import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!gs", name = "o", descriptor = "[Z")
	public static boolean[] aBooleanArray49;

	@OriginalMember(owner = "client!gs", name = "v", descriptor = "Lclient!wc;")
	public static Class2_Sub5_Sub20 aClass2_Sub5_Sub20_23;

	@OriginalMember(owner = "client!gs", name = "r", descriptor = "Lclient!fga;")
	public static final Class108 aClass108_25 = new Class108();

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IILclient!dm;Lclient!kr;BIILclient!aa;)V")
	public static void method8303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class78 arg2, @OriginalArg(3) Class20 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class1 arg6) {
		if (arg3 == null) {
			return;
		}
		@Pc(16) int local16;
		if (Static2.anInt31 == 4) {
			local16 = (int) Static378.aFloat160 & 0x3FFF;
		} else {
			local16 = Static415.anInt7576 + (int) Static378.aFloat160 & 0x3FFF;
		}
		@Pc(34) int local34 = Math.max(arg2.anInt1964 / 2, arg2.anInt1991 / 2) + 10;
		@Pc(48) int local48 = arg4 * arg4 + arg5 * arg5;
		if (local34 * local34 < local48) {
			return;
		}
		@Pc(62) int local62 = Class353.anIntArray681[local16];
		@Pc(66) int local66 = Class353.anIntArray682[local16];
		if (Static2.anInt31 != 4) {
			local66 = local66 * 256 / (Static30.anInt6668 + 256);
			local62 = local62 * 256 / (Static30.anInt6668 + 256);
		}
		@Pc(97) int local97 = arg4 * local66 + arg5 * local62 >> 14;
		@Pc(108) int local108 = arg5 * local66 - arg4 * local62 >> 14;
		arg3.method4575(local97 + arg0 + arg2.anInt1964 / 2 - arg3.method4588() / 2, arg1 - -(arg2.anInt1991 / 2) - (local108 - -(arg3.method4576() / 2)), arg6, arg0, arg1);
	}
}
