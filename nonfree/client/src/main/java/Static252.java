import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!sf", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString164;

	@OriginalMember(owner = "client!sf", name = "I", descriptor = "[Lclient!oh;")
	public static Class57[] aClass57Array4;

	@OriginalMember(owner = "client!sf", name = "J", descriptor = "Lclient!si;")
	public static Class157 aClass157_15 = null;

	@OriginalMember(owner = "client!sf", name = "M", descriptor = "Z")
	public static boolean aBoolean432 = true;

	@OriginalMember(owner = "client!sf", name = "O", descriptor = "I")
	public static int anInt4639 = 3353893;

	@OriginalMember(owner = "client!sf", name = "R", descriptor = "Ljava/lang/String;")
	public static String aString165 = "Choose Option";

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIBZ)Ljava/lang/String;")
	public static String method3950(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(40) int local40 = 2;
		@Pc(44) int local44 = arg0 / 10;
		while (local44 != 0) {
			local44 /= 10;
			local40++;
		}
		@Pc(59) char[] local59 = new char[local40];
		local59[0] = '+';
		for (@Pc(76) int local76 = local40 - 1; local76 > 0; local76--) {
			@Pc(81) int local81 = arg0;
			arg0 /= 10;
			@Pc(92) int local92 = local81 - arg0 * 10;
			if (local92 >= 10) {
				local59[local76] = (char) (local92 + 87);
			} else {
				local59[local76] = (char) (local92 + 48);
			}
		}
		return new String(local59);
	}

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)V")
	public static void method3951() {
		@Pc(11) boolean local11 = false;
		while (!local11) {
			local11 = true;
			for (@Pc(17) int local17 = 0; local17 < Static241.anInt4470 - 1; local17++) {
				if (Static94.aShortArray46[local17] < 1000 && Static94.aShortArray46[local17 + 1] > 1000) {
					local11 = false;
					@Pc(46) String local46 = Static246.aStringArray28[local17];
					Static246.aStringArray28[local17] = Static246.aStringArray28[local17 + 1];
					Static246.aStringArray28[local17 + 1] = local46;
					@Pc(64) String local64 = Static146.aStringArray19[local17];
					Static146.aStringArray19[local17] = Static146.aStringArray19[local17 + 1];
					Static146.aStringArray19[local17 + 1] = local64;
					@Pc(82) int local82 = Static266.anIntArray551[local17];
					Static266.anIntArray551[local17] = Static266.anIntArray551[local17 + 1];
					Static266.anIntArray551[local17 + 1] = local82;
					@Pc(100) int local100 = Static195.anIntArray409[local17];
					Static195.anIntArray409[local17] = Static195.anIntArray409[local17 + 1];
					Static195.anIntArray409[local17 + 1] = local100;
					@Pc(118) int local118 = Static4.anIntArray16[local17];
					Static4.anIntArray16[local17] = Static4.anIntArray16[local17 + 1];
					Static4.anIntArray16[local17 + 1] = local118;
					@Pc(136) short local136 = Static94.aShortArray46[local17];
					Static94.aShortArray46[local17] = Static94.aShortArray46[local17 + 1];
					Static94.aShortArray46[local17 + 1] = local136;
					@Pc(154) long local154 = Static66.aLongArray5[local17];
					Static66.aLongArray5[local17] = Static66.aLongArray5[local17 + 1];
					Static66.aLongArray5[local17 + 1] = local154;
				}
			}
		}
	}
}
