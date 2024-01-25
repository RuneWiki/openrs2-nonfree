import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!dba", name = "d", descriptor = "Lclient!nb;")
	public static Class212 aClass212_2;

	@OriginalMember(owner = "client!dba", name = "c", descriptor = "I")
	public static int anInt1957 = 0;

	@OriginalMember(owner = "client!dba", name = "g", descriptor = "I")
	public static int anInt1959 = 503;

	@OriginalMember(owner = "client!dba", name = "i", descriptor = "I")
	public static int anInt1961 = -1;

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(B)V")
	public static void method1828() {
		@Pc(14) int local14 = Static208.aClass12_Sub10_Sub1_1.method2046(Static148.anInt6867);
		if (local14 == 0) {
			Static245.aByteArrayArrayArray19 = null;
			Static299.method4820(0);
		} else if (local14 == 1) {
			Static398.method6239((byte) 0);
			Static299.method4820(512);
			if (Static387.aByteArrayArrayArray18 != null) {
				Static98.method2078();
			}
		} else {
			Static398.method6239((byte) (Static491.anInt8889 - 4 & 0xFF));
			Static299.method4820(2);
		}
		Static508.anInt9156 = Static56.anInt1418;
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(BI[F)[F")
	public static float[] method1830(@OriginalArg(1) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(14) float[] local14 = new float[arg0];
		Static554.method3500(arg1, 0, local14, 0, arg0);
		return local14;
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method1831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class37 local7 = Static120.aClass37ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class243 local13 = local7.aClass243_3; local13 != null; local13 = local13.aClass243_11) {
			@Pc(17) Class30_Sub1 local17 = local13.aClass30_Sub1_2;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort115 == arg1 && local17.aShort112 == arg2) {
				Static347.method5471(local17);
				return;
			}
		}
	}
}
