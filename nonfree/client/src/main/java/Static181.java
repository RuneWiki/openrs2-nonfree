import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "[Lclient!ae;")
	public static Class5[] aClass5Array2;

	@OriginalMember(owner = "client!tb", name = "l", descriptor = "Lclient!eh;")
	public static Class28 aClass28_170;

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1052 = method2795("titlebutton");

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1053 = method2795("null");

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_1056 = method2795("Loading textures )2 ");

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "Lclient!qe;")
	public static Class83 aClass83_1054 = aClass83_1056;

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
	public static final int anInt3677 = 0;

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_1055 = method2795("Loaded textures");

	@OriginalMember(owner = "client!tb", name = "j", descriptor = "[J")
	public static final long[] aLongArray7 = new long[32];

	@OriginalMember(owner = "client!tb", name = "k", descriptor = "Lclient!qe;")
	public static Class83 aClass83_1057 = aClass83_1055;

	@OriginalMember(owner = "client!tb", name = "n", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1058 = method2795("Konfig geladen)3");

	@OriginalMember(owner = "client!tb", name = "o", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1059 = method2795("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V")
	public static void method2793() {
		Static67.aByteArrayArrayArray28 = new byte[4][104][104];
		Static61.anIntArrayArrayArray4 = new int[4][105][105];
		Static103.anIntArray236 = new int[104];
		Static14.aByteArrayArrayArray40 = new byte[4][104][104];
		Static171.anIntArray327 = new int[104];
		Static25.anIntArray391 = new int[104];
		Static153.anIntArray315 = new int[104];
		Static40.anInt1032 = 99;
		Static124.anIntArray249 = new int[104];
		Static57.aByteArrayArrayArray23 = new byte[4][104][104];
		Static10.aByteArrayArrayArray8 = new byte[4][104][104];
		Static110.aByteArrayArrayArray46 = new byte[4][105][105];
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V")
	public static void method2794() {
		@Pc(7) int local7 = 0;
		@Pc(10) int[] local10 = new int[Static52.anInt1337];
		for (@Pc(12) int local12 = 0; local12 < Static52.anInt1337; local12++) {
			@Pc(18) Class2_Sub2_Sub3 local18 = Static113.method1987(local12);
			if (local18.anInt426 >= 0 || local18.anInt425 >= 0) {
				local10[local7++] = local12;
			}
		}
		Static185.anIntArray368 = new int[local7];
		for (@Pc(48) int local48 = 0; local48 < local7; local48++) {
			Static185.anIntArray368[local48] = local10[local48];
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!qe;")
	public static Class83 method2795(@OriginalArg(0) String arg0) {
		@Pc(6) byte[] local6 = arg0.getBytes();
		@Pc(9) int local9 = local6.length;
		@Pc(13) Class83 local13 = new Class83();
		@Pc(15) int local15 = 0;
		local13.aByteArray36 = new byte[local9];
		while (local15 < local9) {
			@Pc(35) int local35 = local6[local15++] & 0xFF;
			if (local35 <= 45 && local35 >= 40) {
				if (local9 <= local15) {
					break;
				}
				@Pc(75) int local75 = local6[local15++] & 0xFF;
				local13.aByteArray36[local13.anInt3158++] = (byte) ((local35 - 40) * 43 + local75 - 48);
			} else if (local35 != 0) {
				local13.aByteArray36[local13.anInt3158++] = (byte) local35;
			}
		}
		local13.method2410();
		return local13.method2431();
	}
}
