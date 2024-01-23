import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!fg", name = "db", descriptor = "[Lclient!uj;")
	public static Class79[] aClass79Array4;

	@OriginalMember(owner = "client!fg", name = "Q", descriptor = "Lclient!qe;")
	public static Class78 aClass78_297 = Static199.method3560("(U0a )2 non)2existant gosub script)2num: ");

	@OriginalMember(owner = "client!fg", name = "R", descriptor = "Lclient!qe;")
	private static Class78 aClass78_298 = Static199.method3560("Loading )2 please wait)3");

	@OriginalMember(owner = "client!fg", name = "U", descriptor = "Lclient!qe;")
	private static Class78 aClass78_299 = Static199.method3560(" more options");

	@OriginalMember(owner = "client!fg", name = "V", descriptor = "Lclient!qe;")
	public static Class78 aClass78_300 = aClass78_298;

	@OriginalMember(owner = "client!fg", name = "X", descriptor = "I")
	public static int anInt1225 = 0;

	@OriginalMember(owner = "client!fg", name = "Z", descriptor = "Lclient!qe;")
	public static Class78 aClass78_301 = aClass78_299;

	@OriginalMember(owner = "client!fg", name = "ab", descriptor = "I")
	public static int anInt1227 = 0;

	@OriginalMember(owner = "client!fg", name = "hb", descriptor = "Lclient!qe;")
	public static Class78 aClass78_302 = Static199.method3560("3D)2Softwarebibliothek gestartet)3");

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILclient!gg;)I")
	public static int method1004(@OriginalArg(1) Class5_Sub2_Sub1 arg0) {
		@Pc(6) Class2_Sub3_Sub9 local6 = arg0.aClass2_Sub3_Sub9_1;
		if (local6.anIntArray230 != null) {
			local6 = local6.method1059();
			if (local6 == null) {
				return -1;
			}
		}
		@Pc(25) int local25 = local6.anInt1298;
		if (arg0.anInt1878 == arg0.anInt1879) {
			local25 = local6.anInt1264;
		} else if (arg0.anInt1824 == arg0.anInt1878) {
			local25 = local6.anInt1296;
		}
		return local25;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIB)V")
	public static void method1005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13;
		if (Static54.anInt953 != arg0) {
			Static179.anIntArray682 = new int[arg0];
			for (local13 = 0; local13 < arg0; local13++) {
				Static179.anIntArray682[local13] = (local13 << 12) / arg0;
			}
			Static114.anInt2558 = arg0 == 64 ? 2048 : 4096;
			Static74.anInt1601 = arg0 - 1;
			Static54.anInt953 = arg0;
		}
		if (Static11.anInt313 == arg1) {
			return;
		}
		if (Static54.anInt953 == arg1) {
			Static157.anIntArray604 = Static179.anIntArray682;
		} else {
			Static157.anIntArray604 = new int[arg1];
			for (local13 = 0; local13 < arg1; local13++) {
				Static157.anIntArray604[local13] = (local13 << 12) / arg1;
			}
		}
		Static156.anInt3604 = arg1 - 1;
		Static11.anInt313 = arg1;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IZ)V")
	public static void method1006(@OriginalArg(0) int arg0) {
		if (Static51.anIntArray147 == null || arg0 > Static51.anIntArray147.length) {
			Static51.anIntArray147 = new int[arg0];
		}
	}
}
