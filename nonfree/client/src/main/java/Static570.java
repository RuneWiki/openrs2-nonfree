import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static570 {

	@OriginalMember(owner = "client!uea", name = "j", descriptor = "F")
	public static float aFloat75;

	@OriginalMember(owner = "client!uea", name = "l", descriptor = "Lclient!ih;")
	public static Class31 aClass31_14;

	@OriginalMember(owner = "client!uea", name = "e", descriptor = "Lclient!st;")
	public static final Class314 aClass314_64 = new Class314(72, 4);

	@OriginalMember(owner = "client!uea", name = "k", descriptor = "I")
	public static int anInt3589 = 0;

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(ZIIIIII)V")
	public static void method3074(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static221.anInt10164 = arg5;
		Static397.anInt7107 = arg3;
		Static72.anInt1437 = arg4;
		Static254.anInt1414 = arg1;
		Static419.anInt7338 = arg2;
		if (arg0 && Static72.anInt1437 >= 100) {
			Static522.anInt8849 = Static397.anInt7107 * 512 + 256;
			Static419.anInt7345 = Static221.anInt10164 * 512 + 256;
			Static13.anInt232 = Static594.method8211(Static419.anInt7345, Static522.anInt8849, Static65.anInt1298) - Static419.anInt7338;
		}
		Static471.anInt8064 = 2;
		Static189.anInt3565 = -1;
		Static68.anInt1361 = -1;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(IIIBI)V")
	public static void method3077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) float local17 = (float) Static598.anInt2998 / (float) Static598.anInt2994;
		@Pc(19) int local19 = arg2;
		@Pc(21) int local21 = arg3;
		if (local17 < 1.0F) {
			local21 = (int) ((float) arg2 * local17);
		} else {
			local19 = (int) ((float) arg3 / local17);
		}
		@Pc(48) int local48 = arg1 - (arg3 - local21) / 2;
		@Pc(57) int local57 = arg0 - (arg2 - local19) / 2;
		Static108.anInt2182 = -1;
		Static168.anInt3275 = Static598.anInt2998 - local48 * Static598.anInt2998 / local21;
		Static433.anInt7555 = -1;
		Static122.anInt2649 = Static598.anInt2994 * local57 / local19;
		Static510.method7387();
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method3079(@OriginalArg(1) String arg0) {
		return Static10.aHashtable1.containsKey(arg0);
	}
}
