import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "Lclient!gp;")
	public static Class117 aClass117_164;

	@OriginalMember(owner = "client!qba", name = "f", descriptor = "Lclient!hca;")
	public static final Class125 aClass125_3 = new Class125("RC", 1);

	@OriginalMember(owner = "client!qba", name = "h", descriptor = "Lclient!uaa;")
	public static final Class288 aClass288_51 = new Class288(64);

	@OriginalMember(owner = "client!qba", name = "i", descriptor = "Z")
	public static boolean aBoolean495 = true;

	@OriginalMember(owner = "client!qba", name = "j", descriptor = "I")
	public static int anInt7056 = 0;

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(B)V")
	public static void method5726() {
		Static126.aClass25_25 = null;
		Static53.aClass25_4 = null;
		Static353.aClass25_20 = null;
		Static235.aClass25_14 = null;
		Static372.aClass25Array8 = null;
		Static169.aClass25_8 = null;
		Static12.aClass25_1 = null;
		Static318.aClass25_16 = null;
		Static494.aClass25_26 = null;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IB)V")
	public static void method5727(@OriginalArg(1) byte arg0) {
		if (Static203.aByteArrayArrayArray7 == null) {
			Static203.aByteArrayArrayArray7 = new byte[4][Static460.anInt7894][Static235.anInt4493];
		}
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static460.anInt7894; local18++) {
				for (@Pc(22) int local22 = 0; local22 < Static235.anInt4493; local22++) {
					Static203.aByteArrayArrayArray7[local14][local18][local22] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IIZII)V")
	public static void method5729(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static348.method5412(arg2)) {
			Static229.method3772(-1, arg1, arg3, Static139.aClass220ArrayArray1[arg2], arg0);
		}
	}
}
