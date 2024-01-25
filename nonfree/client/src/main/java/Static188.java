import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!jm", name = "I", descriptor = "Lclient!l;")
	public static Class143 aClass143_20;

	@OriginalMember(owner = "client!jm", name = "L", descriptor = "Lclient!qu;")
	public static final Class204 aClass204_11 = new Class204(2, 4, 4, 0);

	@OriginalMember(owner = "client!jm", name = "M", descriptor = "[I")
	public static int[] anIntArray301 = new int[2];

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(BI)V")
	public static void method2959(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub2_Sub6 local8 = Static371.method5808(16, arg0);
		local8.method1775();
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(BI)Lclient!gf;")
	public static Class86 method2960(@OriginalArg(1) int arg0) {
		@Pc(10) Class86 local10 = (Class86) Static393.aClass134_50.method3266((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static197.aClass246_115.method5477(0, arg0);
		local10 = new Class86();
		if (local20 != null) {
			local10.method2235(new Class1_Sub5(local20));
		}
		local10.method2233();
		Static393.aClass134_50.method3263((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IZIIIIII)V")
	public static void method2961(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg3 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(33) int local33 = local7 * (Static150.aShort49 - Static211.aShort57) / 100 + Static211.aShort57;
		@Pc(39) int local39 = local33 * arg2 >> 8;
		@Pc(46) int local46 = 16384 - arg6 & 0x3FFF;
		@Pc(52) int local52 = 16384 - arg5 & 0x3FFF;
		@Pc(54) int local54 = 0;
		@Pc(56) int local56 = 0;
		@Pc(58) int local58 = local39;
		if (local46 != 0) {
			local56 = -local39 * Class183.anIntArray433[local46] >> 15;
			local58 = local39 * Class183.anIntArray434[local46] >> 15;
		}
		if (local52 != 0) {
			local54 = Class183.anIntArray433[local52] * local58 >> 15;
			local58 = Class183.anIntArray434[local52] * local58 >> 15;
		}
		Static296.anInt5167 = arg6;
		Static142.anInt5535 = arg0 - local56;
		Static406.anInt6527 = arg5;
		Static92.anInt1946 = arg1 - local58;
		Static139.anInt2727 = arg4 - local54;
		Static264.anInt4689 = 0;
	}
}
