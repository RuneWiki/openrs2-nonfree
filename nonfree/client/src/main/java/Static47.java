import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
	public static int anInt1658;

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "I")
	public static int anInt1661;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
	public static int anInt1657 = 0;

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
	public static final int anInt1660 = 1337;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "([BI)Lclient!ch;")
	public static Class6_Sub5_Sub5 method1559(@OriginalArg(0) byte[] arg0) {
		@Pc(9) Class6_Sub5_Sub5 local9 = new Class6_Sub5_Sub5();
		@Pc(14) Class6_Sub8 local14 = new Class6_Sub8(arg0);
		local14.anInt10061 = local14.aByteArray102.length - 2;
		@Pc(25) int local25 = local14.method8220();
		@Pc(36) int local36 = local14.aByteArray102.length - local25 - 12 - 2;
		local14.anInt10061 = local36;
		@Pc(43) int local43 = local14.method8236();
		local9.anInt2370 = local14.method8220();
		local9.anInt2372 = local14.method8220();
		local9.anInt2374 = local14.method8220();
		local9.anInt2373 = local14.method8220();
		@Pc(67) int local67 = local14.method8246();
		@Pc(78) int local78;
		@Pc(84) int local84;
		if (local67 > 0) {
			local9.aClass380Array1 = new Class380[local67];
			for (local78 = 0; local78 < local67; local78++) {
				local84 = local14.method8220();
				@Pc(91) Class380 local91 = new Class380(Static101.method2622(local84));
				local9.aClass380Array1[local78] = local91;
				while (local84-- > 0) {
					@Pc(102) int local102 = local14.method8236();
					@Pc(106) int local106 = local14.method8236();
					local91.method8753(new Class6_Sub37(local106), (long) local102);
				}
			}
		}
		local14.anInt10061 = 0;
		local9.aString15 = local14.method8239();
		local9.aStringArray7 = new String[local43];
		local9.anIntArray78 = new int[local43];
		local9.anIntArray79 = new int[local43];
		local78 = 0;
		while (local36 > local14.anInt10061) {
			local84 = local14.method8220();
			if (local84 == 3) {
				local9.aStringArray7[local78] = local14.method8221().intern();
			} else if (local84 >= 100 || local84 == 21 || local84 == 38 || local84 == 39) {
				local9.anIntArray79[local78] = local14.method8246();
			} else {
				local9.anIntArray79[local78] = local14.method8236();
			}
			local9.anIntArray78[local78++] = local84;
		}
		return local9;
	}
}
