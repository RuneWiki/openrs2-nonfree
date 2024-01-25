import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static594 {

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(BIII)I")
	public static int method8211(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static637.aClass91Array4 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg0 >> 9;
		@Pc(22) int local22 = arg1 >> 9;
		if (local11 < 0 || local22 < 0 || Static399.anInt7121 - 1 < local11 || Static24.anInt345 - 1 < local22) {
			return 0;
		}
		@Pc(43) int local43 = arg2;
		if (arg2 < 3 && (Static546.aByteArrayArrayArray18[1][local11][local22] & 0x2) != 0) {
			local43 = arg2 + 1;
		}
		return Static637.aClass91Array4[local43].method7725(arg0, arg1);
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(ILclient!dc;)Lclient!ar;")
	public static Class21 method8212(@OriginalArg(1) Class3_Sub9 arg0) {
		@Pc(7) String local7 = arg0.method5607();
		@Pc(14) Class293 local14 = Static76.method1319()[arg0.method5633()];
		@Pc(21) Class15 local21 = Static582.method8112()[arg0.method5633()];
		@Pc(25) int local25 = arg0.method5624();
		@Pc(29) int local29 = arg0.method5624();
		@Pc(33) int local33 = arg0.method5633();
		@Pc(42) int local42 = arg0.method5633();
		@Pc(46) int local46 = arg0.method5633();
		@Pc(50) int local50 = arg0.method5610();
		@Pc(54) int local54 = arg0.method5610();
		@Pc(58) int local58 = arg0.method5585();
		@Pc(62) int local62 = arg0.method5585();
		@Pc(66) int local66 = arg0.method5585();
		return new Class21(local7, local14, local21, local25, local29, local33, local42, local46, local50, local54, local58, local62, local66);
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)Ljava/lang/String;")
	public static String method8213() {
		if (Static253.aBoolean362 || Static165.aClass3_Sub7_Sub19_14 == null) {
			return "";
		} else if ((Static165.aClass3_Sub7_Sub19_14.aString83 == null || Static165.aClass3_Sub7_Sub19_14.aString83.length() == 0) && Static165.aClass3_Sub7_Sub19_14.aString84 != null && Static165.aClass3_Sub7_Sub19_14.aString84.length() > 0) {
			return Static165.aClass3_Sub7_Sub19_14.aString84;
		} else {
			return Static165.aClass3_Sub7_Sub19_14.aString83;
		}
	}
}
