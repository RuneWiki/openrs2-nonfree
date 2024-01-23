import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "Lclient!ek;")
	public static Class42 aClass42_82;

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString172 = " ";

	@OriginalMember(owner = "client!sk", name = "f", descriptor = "[I")
	public static int[] anIntArray493 = new int[4096];

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IFIIIBIZ)[I")
	public static int[] method4090(@OriginalArg(1) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class2_Sub1_Sub8 local10 = new Class2_Sub1_Sub8();
		local10.aBoolean94 = true;
		local10.anInt1424 = 8;
		local10.anInt1433 = 35;
		local10.anInt1431 = 4;
		local10.anInt1428 = (int) (arg0 * 4096.0F);
		local10.anInt1426 = 8;
		local10.method4595();
		Static140.method2491(1, 2048);
		local10.method1104(0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIZZ)V")
	public static void method4091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		Static72.aLong65 = 0L;
		@Pc(3) boolean local3 = false;
		@Pc(6) int local6 = Static141.method2503();
		if (arg0 == 3 || local6 == 3) {
			arg3 = true;
		}
		if (Static158.aString122.startsWith("mac") && arg0 > 0) {
			arg3 = true;
		}
		if (arg0 <= 0 != local6 <= 0) {
			local3 = true;
		}
		if (arg3 && arg0 > 0) {
			local3 = true;
		}
		Static27.method4369(local3, arg1, arg0, arg2, arg3, local6);
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZLclient!ek;)V")
	public static void method4092(@OriginalArg(1) Class42 arg0) {
		Static122.aClass93_Sub1Array1 = Static7.method120(Static56.anInt1438, arg0);
		Static175.anIntArray379 = new int[256];
		@Pc(15) int local15;
		for (local15 = 0; local15 < 3; local15++) {
			@Pc(27) float local27 = (float) (Static204.anIntArray423[local15] >> 16 & 0xFF);
			@Pc(37) int local37 = Static204.anIntArray423[local15 + 1] >> 16 & 0xFF;
			@Pc(44) float local44 = ((float) local37 - local27) / 64.0F;
			@Pc(51) float local51 = (float) (Static204.anIntArray423[local15] & 0xFF);
			@Pc(59) int local59 = Static204.anIntArray423[local15 + 1] & 0xFF;
			@Pc(68) float local68 = (float) (Static204.anIntArray423[local15] >> 8 & 0xFF);
			@Pc(78) int local78 = Static204.anIntArray423[local15 + 1] >> 8 & 0xFF;
			@Pc(85) float local85 = ((float) local59 - local51) / 64.0F;
			@Pc(93) float local93 = ((float) local78 - local68) / 64.0F;
			for (@Pc(95) int local95 = 0; local95 < 64; local95++) {
				Static175.anIntArray379[local15 * 64 + local95] = (int) local68 << 8 | (int) local27 << 16 | (int) local51;
				local51 += local85;
				local68 += local93;
				local27 += local44;
			}
		}
		for (local15 = 192; local15 < 255; local15++) {
			Static175.anIntArray379[local15] = Static204.anIntArray423[3];
		}
		Static170.anIntArray368 = new int[32768];
		Static45.anIntArray157 = new int[32768];
		Static263.method4147(null);
		Static122.anIntArray237 = new int[32768];
		Static185.anIntArray528 = new int[32768];
		Static136.aClass2_Sub8_Sub1_Sub1_2 = new Class2_Sub8_Sub1_Sub1(128, 254);
	}
}
