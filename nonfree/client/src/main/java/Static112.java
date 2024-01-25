import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "Lclient!lq;")
	public static Class127 aClass127_1;

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "F")
	public static float aFloat14;

	@OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
	public static int anInt2070;

	@OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
	public static int anInt2071;

	@OriginalMember(owner = "client!hc", name = "o", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_43 = new Class117("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIII)V")
	public static void method1684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class11_Sub4_Sub12 local13 = Static35.method512(9, arg2);
		local13.method3858();
		local13.anInt4390 = arg1;
		local13.anInt4388 = arg0;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIZI)I")
	public static int method1685(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class11_Sub6 local10 = Static158.method2534(arg0, arg1);
		if (local10 == null) {
			return 0;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < local10.anIntArray46.length; local24++) {
				if (local10.anIntArray48[local24] == arg2) {
					local22 += local10.anIntArray46[local24];
				}
			}
			return local22;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!km;I)I")
	public static int method1686(@OriginalArg(0) Class67_Sub3_Sub3_Sub1 arg0) {
		@Pc(8) Class82 local8 = arg0.aClass82_1;
		if (local8.anIntArray134 != null) {
			local8 = local8.method1569();
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(22) int local22 = local8.anInt1886;
		@Pc(28) Class55 local28 = arg0.method4374();
		if (arg0.aBoolean328) {
			local22 = local8.anInt1869;
		} else if (local28.anInt1208 == arg0.anInt5040 || local28.anInt1194 == arg0.anInt5040 || arg0.anInt5040 == local28.anInt1182 || local28.anInt1195 == arg0.anInt5040) {
			local22 = local8.anInt1896;
		} else if (local28.anInt1211 == arg0.anInt5040 || local28.anInt1177 == arg0.anInt5040 || arg0.anInt5040 == local28.anInt1216 || arg0.anInt5040 == local28.anInt1190) {
			local22 = local8.anInt1877;
		}
		return local22;
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(III)V")
	public static void method1688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static212.aClass106ArrayArrayArray2[0][arg1][arg2] != null && Static212.aClass106ArrayArrayArray2[0][arg1][arg2].aClass106_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static212.aClass106ArrayArrayArray2[local22][arg1][arg2] == null) {
				@Pc(46) Class106 local46 = Static212.aClass106ArrayArrayArray2[local22][arg1][arg2] = new Class106(local22, arg1, arg2);
				if (local20) {
					local46.aByte26++;
				}
			}
		}
	}
}
