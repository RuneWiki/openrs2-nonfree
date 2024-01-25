import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!ca", name = "i", descriptor = "Lclient!bk;")
	public static Interface3 anInterface3_1;

	@OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
	public static int anInt820;

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_53 = new Class159(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

	@OriginalMember(owner = "client!ca", name = "j", descriptor = "Lclient!dj;")
	public static final Class43 aClass43_5 = new Class43(512);

	@OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
	public static int anInt819 = 0;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)I")
	public static int method563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static22.anIntArrayArray12 == null ? 0 : Static22.anIntArrayArray12[arg0][arg1] >>> 21 & 0x7F8;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
	public static void method566() {
		Static149.method3564();
		Static133.method2847();
		Static340.method5451();
		Static58.method1233();
		Static261.method4550();
		Static152.method3021();
		Static69.method1645();
		Static35.method719();
		Static304.method4990();
		Static157.method3057();
		Static141.method2954();
		Static135.method2882();
		Static289.method4872();
		Static31.method552();
		Static95.method2221();
		Static292.method4888();
		Static291.method4884();
		Static324.method5266();
		Static354.method5630();
		Static270.method4633();
		Static115.method2411();
		Static316.method5212();
		if (Static110.anInt2697 != 0) {
			for (@Pc(70) int local70 = 0; local70 < Static223.aByteArrayArray17.length; local70++) {
				Static223.aByteArrayArray17[local70] = null;
			}
			Static56.anInt1503 = 0;
		}
		Static333.method5390();
		Static221.method2478();
		Static314.method5186();
		Static268.method4618();
		Static88.method2159();
		Static164.aClass198_123.method5213();
		Static274.aClass47_9.method2723();
		Static124.aClass124_4.method3529();
		Static73.method1854();
		Static248.aClass193_88.method5062();
		Static247.aClass193_87.method5062();
		Static149.aClass193_69.method5062();
		Static229.aClass193_79.method5062();
		Static146.aClass193_43.method5062();
		Static287.aClass193_77.method5062();
		Static39.aClass193_11.method5062();
		Static142.aClass193_53.method5062();
		Static316.aClass193_99.method5062();
		Static302.aClass193_95.method5062();
		Static8.aClass193_5.method5062();
		Static210.aClass193_76.method5062();
		Static121.aClass193_85.method5062();
		Static103.aClass193_38.method5062();
		Static117.aClass193_41.method5062();
		Static145.aClass193_54.method5062();
		Static349.aClass193_109.method5062();
		Static167.aClass193_60.method5062();
		Static351.aClass193_110.method5062();
		Static203.aClass193_73.method5062();
		Static132.aClass193_47.method5062();
		Static301.aClass193_94.method5062();
		Static253.aClass193_89.method5062();
		Static72.aClass193_20.method5062();
		Static52.aClass193_13.method5062();
		Static181.aClass193_66.method5062();
		Static217.aClass193_78.method5062();
		Static97.aClass193_36.method5062();
		Static97.aClass193_35.method5062();
		Static248.aClass198_182.method5213();
		Static172.aClass198_133.method5213();
		Static7.aClass198_8.method5213();
		Static155.aClass198_114.method5213();
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IZ)Lclient!rb;")
	public static Class173 method569(@OriginalArg(0) int arg0) {
		@Pc(10) Class173 local10 = (Class173) Static210.aClass198_157.method5210((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static25.aClass193_7.method5047(31, arg0);
		local10 = new Class173();
		if (local20 != null) {
			local10.method4621(new Class4_Sub11(local20), arg0);
		}
		Static210.aClass198_157.method5201(local10, (long) arg0);
		return local10;
	}
}
