import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!gu", name = "k", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_86 = new Class381(92, 3);

	@OriginalMember(owner = "client!gu", name = "i", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_64 = new Class156(129, 4);

	@OriginalMember(owner = "client!gu", name = "h", descriptor = "Lclient!iha;")
	public static final Class168 aClass168_33 = new Class168(8);

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)Z")
	public static boolean method3308(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIILclient!uo;)V")
	public static void method3309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class5_Sub1_Sub20 arg2) {
		if (!Static490.aBoolean536) {
			return;
		}
		@Pc(11) int local11 = 0;
		@Pc(23) int local23;
		for (@Pc(17) Class5_Sub1_Sub13 local17 = (Class5_Sub1_Sub13) arg2.aClass388_14.method9027(); local17 != null; local17 = (Class5_Sub1_Sub13) arg2.aClass388_14.method9024()) {
			local23 = Static650.method8983(local17);
			if (local11 < local23) {
				local11 = local23;
			}
		}
		local11 += 8;
		local23 = arg2.anInt9857 * 16 + 21;
		Static389.anInt1887 = (Static116.aBoolean570 ? 26 : 22) + arg2.anInt9857 * 16;
		@Pc(76) int local76 = Static32.anInt5104 + Static482.anInt7810;
		if (local76 + local11 > Static85.anInt9921) {
			local76 = Static32.anInt5104 - local11;
		}
		if (local76 < 0) {
			local76 = 0;
		}
		@Pc(105) int local105 = Static116.aBoolean570 ? 33 : 31;
		@Pc(112) int local112 = arg0 + 13 - local105;
		if (local23 + local112 > Static256.anInt4629) {
			local112 = Static256.anInt4629 - local23;
		}
		Static240.anInt4167 = local76;
		if (local112 < 0) {
			local112 = 0;
		}
		Static272.aClass5_Sub1_Sub20_1 = arg2;
		Static145.anInt2900 = local112;
		Static498.anInt8035 = local11;
	}
}
