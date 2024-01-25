import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
	public static int anInt7312;

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "Lclient!qf;")
	public static final Class271 aClass271_8 = new Class271();

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "Lclient!mq;")
	public static final Class223 aClass223_51 = new Class223(4);

	@OriginalMember(owner = "client!ok", name = "j", descriptor = "Lclient!gga;")
	public static final Class117 aClass117_7 = new Class117();

	@OriginalMember(owner = "client!ok", name = "k", descriptor = "Lclient!hq;")
	public static final Class145 aClass145_7 = new Class145("WTWIP", 3);

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
	public static void method6042() {
		@Pc(16) Class4_Sub14 local16 = Static196.method3380(Static17.aClass159_1, Static51.aClass173_17);
		local16.aClass4_Sub11_Sub1_3.method4937(Static308.anInt6171);
		Static353.method5712(local16);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIBI)V")
	public static void method6044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = Static214.aClass4_Sub19_Sub1_1.anInt3066 * arg1 >> 8;
		if (arg2 == -1 && !Static393.aBoolean519) {
			Static254.method4094();
		} else if (arg2 != -1 && (Static18.anInt281 != arg2 || !Static5.method134()) && local6 != 0 && !Static393.aBoolean519) {
			Static192.method3345(arg2, local6, arg0, Static55.aClass176_104);
			Static115.method2466();
		}
		if (Static18.anInt281 != arg2) {
			Static280.aClass4_Sub7_Sub3_3 = null;
		}
		Static18.anInt281 = arg2;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
	public static void method6045() {
		@Pc(5) int local5 = 0;
		if (Static214.aClass4_Sub19_Sub1_1.method2771(Static495.anInt9000)) {
			local5 = 55;
		}
		if (!Static214.aClass4_Sub19_Sub1_1.aBoolean256) {
			local5 |= 0x40;
		}
		Static276.method4776(local5);
		Static204.aClass139_8.method3308(local5);
		Static521.aClass273_2.method6722(local5);
		Static237.aClass31_1.method483(local5);
		Static569.aClass213_2.method5294(local5);
		Static360.method5814(local5);
		Static227.method3715(local5);
		Static112.method2454(local5);
		Static198.method3513(local5);
		Static71.method1198();
	}
}
