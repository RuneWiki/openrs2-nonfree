import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "Lclient!wo;")
	public static Class216 aClass216_22;

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "Lclient!gd;")
	public static Interface2 anInterface2_3;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "Lclient!hq;")
	public static Class87 aClass87_15 = new Class87(128);

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
	public static int anInt1820 = -1;

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
	public static int anInt1821 = -1;

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
	public static int anInt1822 = 0;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Z)V")
	public static void method1616() {
		Static113.anInt2650 = 0;
		Static125.anInt2818 = 0;
		Static139.method4223();
		Static241.method4376();
		Static315.method5213();
		Static57.method1493();
		@Pc(25) int local25;
		for (@Pc(19) int local19 = 0; local19 < Static113.anInt2650; local19++) {
			local25 = Static87.anIntArray210[local19];
			if (Static102.aClass17_Sub1_Sub1_Sub1Array1[local25].anInt4852 != Static5.anInt208) {
				if (Static102.aClass17_Sub1_Sub1_Sub1Array1[local25].anInt804 > 0) {
					Static34.method848(Static102.aClass17_Sub1_Sub1_Sub1Array1[local25]);
				}
				Static102.aClass17_Sub1_Sub1_Sub1Array1[local25] = null;
			}
		}
		if (Static85.anInt5393 != Static311.aClass1_Sub8_Sub1_8.anInt5182) {
			throw new RuntimeException("gpp1 pos:" + Static311.aClass1_Sub8_Sub1_8.anInt5182 + " psize:" + Static85.anInt5393);
		}
		for (local25 = 0; local25 < Static357.anInt4331; local25++) {
			if (Static102.aClass17_Sub1_Sub1_Sub1Array1[Static298.anIntArray492[local25]] == null) {
				throw new RuntimeException("gpp2 pos:" + local25 + " size:" + Static357.anInt4331);
			}
		}
	}
}
