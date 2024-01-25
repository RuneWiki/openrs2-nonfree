import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!b", name = "a", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray10;

	@OriginalMember(owner = "client!b", name = "d", descriptor = "Lclient!mo;")
	public static Class143 aClass143_11;

	@OriginalMember(owner = "client!b", name = "f", descriptor = "Lclient!u;")
	public static Class197 aClass197_1;

	@OriginalMember(owner = "client!b", name = "b", descriptor = "I")
	public static int anInt297 = 0;

	@OriginalMember(owner = "client!b", name = "c", descriptor = "Lclient!al;")
	public static final Class11 aClass11_9 = new Class11(20);

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(B[B)Lclient!ic;")
	public static Class14_Sub2_Sub8 method357(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class14_Sub2_Sub8 local9 = new Class14_Sub2_Sub8();
		@Pc(14) Class14_Sub4 local14 = new Class14_Sub4(arg0);
		local14.anInt2637 = local14.aByteArray74.length - 2;
		@Pc(25) int local25 = local14.method2498();
		@Pc(36) int local36 = local14.aByteArray74.length - local25 - 2 - 12;
		local14.anInt2637 = local36;
		@Pc(43) int local43 = local14.method2510();
		local9.anInt2807 = local14.method2498();
		local9.anInt2806 = local14.method2498();
		local9.anInt2816 = local14.method2498();
		local9.anInt2817 = local14.method2498();
		@Pc(67) int local67 = local14.method2548();
		@Pc(78) int local78;
		@Pc(84) int local84;
		if (local67 > 0) {
			local9.aClass25Array1 = new Class25[local67];
			for (local78 = 0; local78 < local67; local78++) {
				local84 = local14.method2498();
				@Pc(91) Class25 local91 = new Class25(Static224.method4011(local84));
				local9.aClass25Array1[local78] = local91;
				while (local84-- > 0) {
					@Pc(102) int local102 = local14.method2510();
					@Pc(106) int local106 = local14.method2510();
					local91.method687((long) local102, new Class14_Sub34(local106));
				}
			}
		}
		local14.anInt2637 = 0;
		local9.aString100 = local14.method2493();
		local9.aStringArray37 = new String[local43];
		local9.anIntArray250 = new int[local43];
		local9.anIntArray249 = new int[local43];
		local78 = 0;
		while (local14.anInt2637 < local36) {
			local84 = local14.method2498();
			if (local84 == 3) {
				local9.aStringArray37[local78] = local14.method2496().intern();
			} else if (local84 >= 100 || local84 == 21 || local84 == 38 || local84 == 39) {
				local9.anIntArray249[local78] = local14.method2548();
			} else {
				local9.anIntArray249[local78] = local14.method2510();
			}
			local9.anIntArray250[local78++] = local84;
		}
		return local9;
	}
}
