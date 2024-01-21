import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
	public static int anInt960;

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "Lclient!md;")
	public static Class30 aClass30_6;

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "J")
	public static long aLong25;

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "Lclient!oa;")
	public static Class56 aClass56_527 = method650("blaugr-Un:");

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "Lclient!oa;")
	public static Class56 aClass56_528 = method650("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "[Lclient!wd;")
	public static Class3_Sub1_Sub2_Sub4_Sub2[] aClass3_Sub1_Sub2_Sub4_Sub2Array1 = new Class3_Sub1_Sub2_Sub4_Sub2[32768];

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
	public static int anInt963 = 0;

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
	public static int anInt964 = 0;

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "Lclient!oa;")
	public static Class56 aClass56_529 = method650("hel");

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILjava/lang/String;)Lclient!oa;")
	public static Class56 method650(@OriginalArg(1) String arg0) {
		@Pc(6) byte[] local6 = arg0.getBytes();
		@Pc(9) int local9 = local6.length;
		@Pc(13) Class56 local13 = new Class56();
		local13.aByteArray29 = new byte[local9];
		@Pc(24) int local24 = 0;
		while (local9 > local24) {
			@Pc(32) int local32 = local6[local24++] & 0xFF;
			if (local32 <= 45 && local32 >= 40) {
				if (local24 >= local9) {
					break;
				}
				@Pc(65) int local65 = local6[local24++] & 0xFF;
				local13.aByteArray29[local13.anInt2171++] = (byte) (local65 + (local32 - 40) * 43 - 48);
			} else if (local32 != 0) {
				local13.aByteArray29[local13.anInt2171++] = (byte) local32;
			}
		}
		local13.method1433();
		return local13.method1441();
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
	public static void method651() {
		aClass30_6 = null;
		aClass3_Sub1_Sub2_Sub4_Sub2Array1 = null;
		aClass56_527 = null;
		aClass56_529 = null;
		aClass56_528 = null;
	}
}
