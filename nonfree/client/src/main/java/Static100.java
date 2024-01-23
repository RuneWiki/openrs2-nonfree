import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!id", name = "c", descriptor = "I")
	public static int anInt2721 = -1;

	@OriginalMember(owner = "client!id", name = "d", descriptor = "Lclient!lc;")
	public static Class79 aClass79_15 = new Class79(50);

	@OriginalMember(owner = "client!id", name = "v", descriptor = "I")
	public static int anInt2738 = 0;

	@OriginalMember(owner = "client!id", name = "F", descriptor = "J")
	public static long aLong92 = 0L;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ILclient!hc;)V")
	public static void method2095(@OriginalArg(1) Class51 arg0) {
		Static199.aClass7_Sub1Array1 = Static91.method1950(arg0, Static129.anInt3260);
		Static23.anIntArray55 = new int[256];
		for (@Pc(15) int local15 = 0; local15 < 3; local15++) {
			@Pc(26) float local26 = (float) (Static81.anIntArray169[local15] >> 16 & 0xFF);
			@Pc(36) int local36 = Static81.anIntArray169[local15 + 1] >> 16 & 0xFF;
			@Pc(45) float local45 = (float) (Static81.anIntArray169[local15] >> 8 & 0xFF);
			@Pc(52) float local52 = ((float) local36 - local26) / 64.0F;
			@Pc(62) int local62 = Static81.anIntArray169[local15 + 1] >> 8 & 0xFF;
			@Pc(70) float local70 = ((float) local62 - local45) / 64.0F;
			@Pc(77) float local77 = (float) (Static81.anIntArray169[local15] & 0xFF);
			@Pc(85) int local85 = Static81.anIntArray169[local15 + 1] & 0xFF;
			@Pc(93) float local93 = ((float) local85 - local77) / 64.0F;
			for (@Pc(95) int local95 = 0; local95 < 64; local95++) {
				Static23.anIntArray55[local15 * 64 + local95] = (int) local26 << 16 | (int) local45 << 8 | (int) local77;
				local45 += local70;
				local77 += local93;
				local26 += local52;
			}
		}
		for (@Pc(140) int local140 = 192; local140 < 255; local140++) {
			Static23.anIntArray55[local140] = Static81.anIntArray169[3];
		}
		Static254.anIntArray462 = new int[32768];
		Static50.anIntArray110 = new int[32768];
		Static16.method3752(null);
		Static63.anIntArray137 = new int[32768];
		Static178.anIntArray307 = new int[32768];
		Static2.aClass1_Sub2_Sub4_Sub1_1 = new Class1_Sub2_Sub4_Sub1(128, 254);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ZI)Lclient!ri;")
	public static Class117 method2096(@OriginalArg(1) int arg0) {
		@Pc(10) Class117 local10 = (Class117) Static174.aClass79_27.method2483((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static150.aClass51_57.method1874(16, arg0);
		local10 = new Class117();
		if (local25 != null) {
			local10.method3443(new Class1_Sub13(local25));
		}
		Static174.aClass79_27.method2486(local10, (long) arg0);
		return local10;
	}
}
