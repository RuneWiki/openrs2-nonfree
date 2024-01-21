import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ca", name = "V", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!ca", name = "O", descriptor = "I")
	public static int anInt439 = 0;

	@OriginalMember(owner = "client!ca", name = "P", descriptor = "Lclient!sc;")
	public static Class66 aClass66_266 = Static106.method1849("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!ca", name = "T", descriptor = "Lclient!sc;")
	public static Class66 aClass66_267 = Static106.method1849("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!ca", name = "U", descriptor = "Lclient!sc;")
	public static Class66 aClass66_268 = Static106.method1849("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!ca", name = "X", descriptor = "[I")
	public static int[] anIntArray72 = new int[2000];

	@OriginalMember(owner = "client!ca", name = "Y", descriptor = "Lclient!sc;")
	public static Class66 aClass66_269 = Static106.method1849("gelb:");

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!sc;ILclient!sc;ILclient!sc;)V")
	public static void method384(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class66 arg2, @OriginalArg(4) Class66 arg3) {
		for (@Pc(3) int local3 = 99; local3 > 0; local3--) {
			Static58.anIntArray254[local3] = Static58.anIntArray254[local3 - 1];
			Static29.aClass66Array2[local3] = Static29.aClass66Array2[local3 - 1];
			Static53.aClass66Array10[local3] = Static53.aClass66Array10[local3 - 1];
			Static82.aClass66Array16[local3] = Static82.aClass66Array16[local3 - 1];
		}
		Static58.anIntArray254[0] = arg1;
		Static63.anInt1934++;
		Static29.anInt753 = Static112.anInt2674;
		Static29.aClass66Array2[0] = arg3;
		Static53.aClass66Array10[0] = arg2;
		Static82.aClass66Array16[0] = arg0;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
	public static void method385() {
		aByteArrayArrayArray5 = null;
		aClass66_267 = null;
		aClass66_269 = null;
		aClass66_268 = null;
		aClass66_266 = null;
		anIntArray72 = null;
		Class1_Sub4.anIntArray71 = null;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method386(@OriginalArg(1) Class1_Sub1_Sub1_Sub5 arg0) {
		arg0.aBoolean44 = false;
		@Pc(17) Class1_Sub1_Sub15 local17;
		if (arg0.anInt1247 != -1) {
			local17 = Static56.method1247(arg0.anInt1247);
			if (local17 == null || local17.anIntArray450 == null) {
				arg0.anInt1247 = -1;
			} else {
				arg0.anInt1240++;
				if (arg0.anInt1244 < local17.anIntArray450.length && local17.anIntArray452[arg0.anInt1244] < arg0.anInt1240) {
					arg0.anInt1244++;
					arg0.anInt1240 = 1;
					Static74.method1419(arg0.anInt1261, arg0.anInt1271, arg0.anInt1244, local17);
				}
				if (arg0.anInt1244 >= local17.anIntArray450.length) {
					arg0.anInt1244 = 0;
					arg0.anInt1240 = 0;
					Static74.method1419(arg0.anInt1261, arg0.anInt1271, arg0.anInt1244, local17);
				}
			}
		}
		if (arg0.anInt1255 != -1 && arg0.anInt1281 <= Static22.anInt636) {
			if (arg0.anInt1279 < 0) {
				arg0.anInt1279 = 0;
			}
			@Pc(122) int local122 = Static122.method1994(arg0.anInt1255).anInt2351;
			if (local122 == -1) {
				arg0.anInt1255 = -1;
			} else {
				@Pc(134) Class1_Sub1_Sub15 local134 = Static56.method1247(local122);
				if (local134 == null || local134.anIntArray450 == null) {
					arg0.anInt1255 = -1;
				} else {
					arg0.anInt1253++;
					if (arg0.anInt1279 < local134.anIntArray450.length && local134.anIntArray452[arg0.anInt1279] < arg0.anInt1253) {
						arg0.anInt1253 = 1;
						arg0.anInt1279++;
						Static74.method1419(arg0.anInt1261, arg0.anInt1271, arg0.anInt1279, local134);
					}
					if (arg0.anInt1279 >= local134.anIntArray450.length && (arg0.anInt1279 < 0 || arg0.anInt1279 >= local134.anIntArray450.length)) {
						arg0.anInt1255 = -1;
					}
				}
			}
		}
		if (arg0.anInt1266 != -1 && arg0.anInt1257 <= 1) {
			local17 = Static56.method1247(arg0.anInt1266);
			if (local17.anInt2650 == 1 && arg0.anInt1284 > 0 && arg0.anInt1239 <= Static22.anInt636 && arg0.anInt1292 < Static22.anInt636) {
				arg0.anInt1257 = 1;
				return;
			}
		}
		if (arg0.anInt1266 != -1 && arg0.anInt1257 == 0) {
			local17 = Static56.method1247(arg0.anInt1266);
			if (local17 == null || local17.anIntArray450 == null) {
				arg0.anInt1266 = -1;
			} else {
				arg0.anInt1246++;
				if (arg0.anInt1259 < local17.anIntArray450.length && local17.anIntArray452[arg0.anInt1259] < arg0.anInt1246) {
					arg0.anInt1259++;
					arg0.anInt1246 = 1;
					Static74.method1419(arg0.anInt1261, arg0.anInt1271, arg0.anInt1259, local17);
				}
				if (arg0.anInt1259 >= local17.anIntArray450.length) {
					arg0.anInt1259 -= local17.anInt2657;
					arg0.anInt1293++;
					if (arg0.anInt1293 >= local17.anInt2666) {
						arg0.anInt1266 = -1;
					} else if (arg0.anInt1259 >= 0 && local17.anIntArray450.length > arg0.anInt1259) {
						Static74.method1419(arg0.anInt1261, arg0.anInt1271, arg0.anInt1259, local17);
					} else {
						arg0.anInt1266 = -1;
					}
				}
				arg0.aBoolean44 = local17.aBoolean112;
			}
		}
		if (arg0.anInt1257 > 0) {
			arg0.anInt1257--;
		}
	}
}
