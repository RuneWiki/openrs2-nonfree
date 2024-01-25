import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
	public static int anInt4559;

	@OriginalMember(owner = "client!ii", name = "h", descriptor = "[Lclient!pi;")
	public static Class262[] aClass262Array1;

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "Lclient!jn;")
	public static final Class167 aClass167_16 = new Class167(64);

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I[B)Lclient!vfa;")
	public static Class4_Sub6_Sub19 method3528(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class4_Sub6_Sub19 local9 = new Class4_Sub6_Sub19();
		@Pc(14) Class4_Sub13 local14 = new Class4_Sub13(arg0);
		local14.anInt9170 = local14.aByteArray88.length - 2;
		@Pc(25) int local25 = local14.method7054();
		@Pc(36) int local36 = local14.aByteArray88.length - local25 - 2 - 12;
		local14.anInt9170 = local36;
		@Pc(43) int local43 = local14.method6990();
		local9.anInt10140 = local14.method7054();
		local9.anInt10134 = local14.method7054();
		local9.anInt10138 = local14.method7054();
		local9.anInt10136 = local14.method7054();
		@Pc(67) int local67 = local14.method7004();
		@Pc(84) int local84;
		if (local67 > 0) {
			local9.aClass221Array1 = new Class221[local67];
			for (@Pc(78) int local78 = 0; local78 < local67; local78++) {
				local84 = local14.method7054();
				@Pc(91) Class221 local91 = new Class221(Static488.method7100(local84));
				local9.aClass221Array1[local78] = local91;
				while (local84-- > 0) {
					@Pc(102) int local102 = local14.method6990();
					@Pc(106) int local106 = local14.method6990();
					local91.method5073(new Class4_Sub27(local106), (long) local102);
				}
			}
		}
		local14.anInt9170 = 0;
		local9.aString221 = local14.method7033();
		local9.anIntArray574 = new int[local43];
		local9.anIntArray575 = new int[local43];
		local9.aStringArray41 = new String[local43];
		local84 = 0;
		while (local36 > local14.anInt9170) {
			@Pc(158) int local158 = local14.method7054();
			if (local158 == 3) {
				local9.aStringArray41[local84] = local14.method7016().intern();
			} else if (local158 >= 100 || local158 == 21 || local158 == 38 || local158 == 39) {
				local9.anIntArray575[local84] = local14.method7004();
			} else {
				local9.anIntArray575[local84] = local14.method6990();
			}
			local9.anIntArray574[local84++] = local158;
		}
		return local9;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V")
	public static void method3530() {
		if (Static568.anInt10299 != -1) {
			Static231.method3755(-1, false, Static568.anInt10299, -1);
			Static568.anInt10299 = -1;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIB)Z")
	public static boolean method3531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static476.method6917(arg0, arg1) | (arg0 & 0x60000) != 0 || Static378.method5890(arg1, arg0) || Static313.method4936(arg1, arg0);
	}
}
