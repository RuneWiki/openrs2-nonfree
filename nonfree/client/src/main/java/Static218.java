import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!km", name = "c", descriptor = "[Lclient!tm;")
	public static Class11_Sub5[] aClass11_Sub5Array3;

	@OriginalMember(owner = "client!km", name = "h", descriptor = "Lclient!mt;")
	public static Class141 aClass141_2;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Z[BI)V")
	public static void method3051(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		if (Static4.aClass2_Sub17_1 == null) {
			Static4.aClass2_Sub17_1 = new Class2_Sub17(20000);
		}
		Static4.aClass2_Sub17_1.method6167(arg1, arg1.length);
		if (!arg0) {
			return;
		}
		Static242.method3348(Static4.aClass2_Sub17_1.aByteArray94);
		Static117.aClass65_Sub1Array1 = new Class65_Sub1[Static220.anInt3718];
		@Pc(35) int local35 = 0;
		for (@Pc(37) int local37 = Static418.anInt7172; local37 <= Static162.anInt2915; local37++) {
			@Pc(43) Class65_Sub1 local43 = Static262.method3690(local37);
			if (local43 != null) {
				Static117.aClass65_Sub1Array1[local35++] = local43;
			}
		}
		Static397.aBoolean462 = false;
		Static368.aLong402 = Static432.method5870();
		Static4.aClass2_Sub17_1 = null;
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(I)Z")
	public static boolean method3053() {
		try {
			if (Static452.anInt951 == 2) {
				if (Static408.aClass2_Sub15_2 == null) {
					Static408.aClass2_Sub15_2 = Static468.method2355(Static378.aClass171_98, Static312.anInt5619, Static252.anInt4350);
					if (Static408.aClass2_Sub15_2 == null) {
						return false;
					}
				}
				if (Static175.aClass69_1 == null) {
					Static175.aClass69_1 = new Class69(Static340.aClass171_72, Static343.aClass171_44);
				}
				if (Static386.aClass2_Sub8_Sub2_6.method3315(Static175.aClass69_1, Static314.aClass171_69, Static408.aClass2_Sub15_2)) {
					Static386.aClass2_Sub8_Sub2_6.method3303();
					Static386.aClass2_Sub8_Sub2_6.method3308(Static389.anInt6735);
					Static386.aClass2_Sub8_Sub2_6.method3323(Static293.aBoolean366, Static408.aClass2_Sub15_2);
					Static378.aClass171_98 = null;
					Static175.aClass69_1 = null;
					Static452.anInt951 = 0;
					Static408.aClass2_Sub15_2 = null;
					return true;
				}
			}
		} catch (@Pc(65) Exception local65) {
			local65.printStackTrace();
			Static386.aClass2_Sub8_Sub2_6.method3327();
			Static452.anInt951 = 0;
			Static175.aClass69_1 = null;
			Static378.aClass171_98 = null;
			Static408.aClass2_Sub15_2 = null;
		}
		return false;
	}
}
