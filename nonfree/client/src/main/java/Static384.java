import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!tm", name = "p", descriptor = "I")
	public static int anInt6447;

	@OriginalMember(owner = "client!tm", name = "t", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_148 = new Class265(30, 6);

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(BI)V")
	public static void method5097(@OriginalArg(1) int arg0) {
		if (arg0 != -1 && Static214.aBooleanArray18[arg0]) {
			Static277.aClass160_56.method3724(arg0);
			Static60.aClass68ArrayArray1[arg0] = null;
			Static344.aClass68ArrayArray2[arg0] = null;
			Static214.aBooleanArray18[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "([BI)Lclient!eh;")
	public static Class2_Sub5_Sub5 method5099(@OriginalArg(0) byte[] arg0) {
		@Pc(9) Class2_Sub5_Sub5 local9 = new Class2_Sub5_Sub5();
		@Pc(14) Class2_Sub23 local14 = new Class2_Sub23(arg0);
		local14.anInt6952 = local14.aByteArray130.length - 2;
		@Pc(25) int local25 = local14.method5500();
		@Pc(36) int local36 = local14.aByteArray130.length - local25 - 2 - 12;
		local14.anInt6952 = local36;
		@Pc(43) int local43 = local14.method5508();
		local9.anInt2105 = local14.method5500();
		local9.anInt2108 = local14.method5500();
		local9.anInt2106 = local14.method5500();
		local9.anInt2104 = local14.method5500();
		@Pc(67) int local67 = local14.method5495();
		@Pc(78) int local78;
		@Pc(84) int local84;
		if (local67 > 0) {
			local9.aClass163Array1 = new Class163[local67];
			for (local78 = 0; local78 < local67; local78++) {
				local84 = local14.method5500();
				@Pc(91) Class163 local91 = new Class163(Static51.method863(local84));
				local9.aClass163Array1[local78] = local91;
				while (local84-- > 0) {
					@Pc(102) int local102 = local14.method5508();
					@Pc(106) int local106 = local14.method5508();
					local91.method3764((long) local102, new Class2_Sub26(local106));
				}
			}
		}
		local14.anInt6952 = 0;
		local9.aString20 = local14.method5451();
		local9.anIntArray152 = new int[local43];
		local9.anIntArray153 = new int[local43];
		local9.aStringArray9 = new String[local43];
		local78 = 0;
		while (local14.anInt6952 < local36) {
			local84 = local14.method5500();
			if (local84 == 3) {
				local9.aStringArray9[local78] = local14.method5494().intern();
			} else if (local84 >= 100 || local84 == 21 || local84 == 38 || local84 == 39) {
				local9.anIntArray153[local78] = local14.method5495();
			} else {
				local9.anIntArray153[local78] = local14.method5508();
			}
			local9.anIntArray152[local78++] = local84;
		}
		return local9;
	}
}
