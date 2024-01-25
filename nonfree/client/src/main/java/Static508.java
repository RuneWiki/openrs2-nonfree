import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static508 {

	@OriginalMember(owner = "client!saa", name = "k", descriptor = "Lclient!ip;")
	public static Class3_Sub4_Sub13 aClass3_Sub4_Sub13_3;

	@OriginalMember(owner = "client!saa", name = "o", descriptor = "Lclient!la;")
	public static Class196 aClass196_106;

	@OriginalMember(owner = "client!saa", name = "j", descriptor = "[Lclient!wf;")
	public static Class371[] aClass371Array1 = new Class371[50];

	@OriginalMember(owner = "client!saa", name = "b", descriptor = "(I)V")
	public static void method7595() {
		Static53.method8687();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static271.aClass105Array1[local8].method2737();
		}
		Static628.method4779();
		Static518.method7722();
		Static540.method7898();
		System.gc();
		Static323.aClass5_9.ya();
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(ILclient!qk;B)I")
	public static int method7597(@OriginalArg(0) int arg0, @OriginalArg(1) Class279 arg1) {
		if (!Static76.method1833(arg1).method2318(arg0) && arg1.anObjectArray27 == null) {
			return -1;
		} else if (arg1.anIntArray512 == null || arg1.anIntArray512.length <= arg0) {
			return -1;
		} else {
			return arg1.anIntArray512[arg0];
		}
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(IIIIII)V")
	public static void method7598(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(11) int local11 = arg4; local11 <= arg1; local11++) {
			Static611.method8472(arg0, arg2, Static460.anIntArrayArray53[local11], arg3);
		}
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(IZZII)I")
	public static int method7599(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(4) int arg2) {
		@Pc(10) Class3_Sub32 local10 = Static210.method3568(false, arg0);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < local10.anIntArray268.length; local18++) {
			if (local10.anIntArray268[local18] >= 0 && Static320.aClass53_2.anInt1780 > local10.anIntArray268[local18]) {
				@Pc(43) Class38 local43 = Static320.aClass53_2.method1770(local10.anIntArray268[local18]);
				@Pc(53) int local53 = local43.method1485(Static449.aClass55_2.method1843(arg2).anInt8686, arg2);
				if (arg1) {
					local16 += local10.anIntArray267[local18] * local53;
				} else {
					local16 += local53;
				}
			}
		}
		return local16;
	}
}
