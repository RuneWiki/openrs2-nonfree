import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "Lclient!tg;")
	public static Class1_Sub2_Sub2 aClass1_Sub2_Sub2_104;

	@OriginalMember(owner = "client!rb", name = "i", descriptor = "Lclient!dg;")
	public static Class28_Sub1 aClass28_Sub1_133;

	@OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
	public static int anInt4990;

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "Z")
	public static boolean aBoolean444 = false;

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "Z")
	public static boolean aBoolean445 = false;

	@OriginalMember(owner = "client!rb", name = "q", descriptor = "Lclient!sc;")
	private static Class107 aClass107_1348 = Static231.method3737("FULL");

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1345 = aClass107_1348;

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1346 = Static231.method3737("<col=ff0000>");

	@OriginalMember(owner = "client!rb", name = "k", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1347 = Static231.method3737("Lade)3)3)3");

	@OriginalMember(owner = "client!rb", name = "t", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1349 = Static231.method3737("sl_flags");

	@OriginalMember(owner = "client!rb", name = "u", descriptor = "I")
	public static volatile int anInt4993 = 0;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!jb;I)V")
	public static void method3733(@OriginalArg(0) Class28 arg0) {
		Static63.aClass64_Sub1Array3 = Static166.method3209(Static121.anInt2656, arg0);
		Static8.anIntArray20 = new int[256];
		for (@Pc(15) int local15 = 0; local15 < 3; local15++) {
			@Pc(27) int local27 = Static156.anIntArray299[local15 + 1] >> 16 & 0xFF;
			@Pc(36) float local36 = (float) (Static156.anIntArray299[local15] >> 16 & 0xFF);
			@Pc(43) float local43 = ((float) local27 - local36) / 64.0F;
			@Pc(50) float local50 = (float) (Static156.anIntArray299[local15] & 0xFF);
			@Pc(59) float local59 = (float) (Static156.anIntArray299[local15] >> 8 & 0xFF);
			@Pc(67) int local67 = Static156.anIntArray299[local15 + 1] & 0xFF;
			@Pc(75) float local75 = ((float) local67 - local50) / 64.0F;
			@Pc(85) int local85 = Static156.anIntArray299[local15 + 1] >> 8 & 0xFF;
			@Pc(93) float local93 = ((float) local85 - local59) / 64.0F;
			for (@Pc(95) int local95 = 0; local95 < 64; local95++) {
				Static8.anIntArray20[local15 * 64 + local95] = (int) local50 | (int) local36 << 16 | (int) local59 << 8;
				local50 += local75;
				local59 += local93;
				local36 += local43;
			}
		}
		for (@Pc(143) int local143 = 192; local143 < 255; local143++) {
			Static8.anIntArray20[local143] = Static156.anIntArray299[3];
		}
		Static163.anIntArray311 = new int[32768];
		Static160.anIntArray307 = new int[32768];
		Static195.method3186(null);
		Static2.anIntArray2 = new int[32768];
		Static22.anIntArray43 = new int[32768];
		Static59.aClass1_Sub2_Sub2_Sub1_1 = new Class1_Sub2_Sub2_Sub1(128, 254);
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
	public static void method3734() {
		Static7.aClass61_9.method1697();
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)Lclient!ja;")
	public static Class1_Sub2_Sub9 method3736(@OriginalArg(0) int arg0) {
		@Pc(6) Class1_Sub2_Sub9 local6 = (Class1_Sub2_Sub9) Static52.aClass8_4.method312((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(29) byte[] local29;
		if (arg0 < 32768) {
			local29 = Static43.aClass28_19.method819(arg0, 0);
		} else {
			local29 = Static19.aClass28_8.method819(arg0 & 0x7FFF, 0);
		}
		local6 = new Class1_Sub2_Sub9();
		if (local29 != null) {
			local6.method1664(new Class1_Sub26(local29));
		}
		if (arg0 >= 32768) {
			local6.method1662();
		}
		Static52.aClass8_4.method304(local6, (long) arg0);
		return local6;
	}
}
