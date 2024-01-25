import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!ll", name = "H", descriptor = "Lclient!sn;")
	public static final Class308 aClass308_4 = new Class308("WTQA", 2);

	@OriginalMember(owner = "client!ll", name = "K", descriptor = "Lclient!mf;")
	public static final Class222 aClass222_32 = new Class222(64);

	@OriginalMember(owner = "client!ll", name = "M", descriptor = "I")
	public static int anInt5240 = -1;

	@OriginalMember(owner = "client!ll", name = "N", descriptor = "Lclient!uc;")
	public static final Class324 aClass324_29 = new Class324("", 14);

	@OriginalMember(owner = "client!ll", name = "O", descriptor = "Ljava/lang/String;")
	public static String aString46 = null;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method4255(@OriginalArg(1) String arg0) {
		if (!Static573.aBoolean740 || (Static258.anInt4645 & 0x18) == 0) {
			return;
		}
		@Pc(17) boolean local17 = false;
		@Pc(19) int local19 = Static220.anInt4237;
		@Pc(21) int[] local21 = Static572.anIntArray717;
		for (@Pc(23) int local23 = 0; local23 < local19; local23++) {
			@Pc(31) Class8_Sub3_Sub3_Sub1_Sub1 local31 = Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[local21[local23]];
			if (local31.aString16 != null && local31.aString16.equalsIgnoreCase(arg0) && (Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1 == local31 && (Static258.anInt4645 & 0x10) != 0 || local31 != null && (Static258.anInt4645 & 0x8) != 0)) {
				@Pc(67) Class1_Sub11 local67 = Static276.method3885(Static362.aClass70_38, Static481.aClass276_2);
				local67.aClass1_Sub35_Sub2_1.method5740(Static78.anInt1494);
				local67.aClass1_Sub35_Sub2_1.method5789(Static84.anInt8888);
				local67.aClass1_Sub35_Sub2_1.method5784(Static48.anInt840);
				local67.aClass1_Sub35_Sub2_1.method5776(local21[local23]);
				local67.aClass1_Sub35_Sub2_1.method5795(0);
				Static48.method743(local67);
				Static136.method2083(local31.anIntArray533[0], local31.method5434(), -2, local31.anIntArray534[0], true, local31.method5434(), 0, 0);
				local17 = true;
				break;
			}
		}
		if (!local17) {
			Static571.method7692(Static568.aClass351_25.method7651(Static307.anInt5279) + arg0);
		}
		if (Static573.aBoolean740) {
			Static50.method827();
		}
	}
}
