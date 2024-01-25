import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!iu", name = "o", descriptor = "[I")
	public static int[] anIntArray280;

	@OriginalMember(owner = "client!iu", name = "e", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_117 = new Class363(37, 5);

	@OriginalMember(owner = "client!iu", name = "k", descriptor = "[I")
	public static final int[] anIntArray279 = new int[25];

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lclient!es;B)Lclient!js;")
	public static Class179 method3636(@OriginalArg(0) Class2_Sub15 arg0) {
		@Pc(7) int local7 = arg0.method4325();
		@Pc(19) Class62 local19 = Static92.method1451()[arg0.method4325()];
		@Pc(30) Class279 local30 = Static90.method1419()[arg0.method4325()];
		@Pc(34) int local34 = arg0.method4334();
		@Pc(40) int local40 = arg0.method4334();
		@Pc(44) int local44 = arg0.method4294();
		@Pc(50) int local50 = arg0.method4294();
		@Pc(54) int local54 = arg0.method4307();
		@Pc(58) int local58 = arg0.method4307();
		@Pc(62) int local62 = arg0.method4307();
		@Pc(73) boolean local73 = arg0.method4325() == 1;
		return new Class179(local7, local19, local30, local34, local40, local44, local50, local54, local58, local62, local73);
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIZ)I")
	public static int method3639(@OriginalArg(1) int arg0) {
		@Pc(14) Class2_Sub23 local14 = Static124.method1801(false, arg0);
		if (local14 == null) {
			return Static557.aClass307_1.method6856(arg0).anInt6492;
		}
		@Pc(24) int local24 = 0;
		for (@Pc(31) int local31 = 0; local31 < local14.anIntArray234.length; local31++) {
			if (local14.anIntArray234[local31] == -1) {
				local24++;
			}
		}
		return local24 + Static557.aClass307_1.method6856(arg0).anInt6492 - local14.anIntArray234.length;
	}
}
