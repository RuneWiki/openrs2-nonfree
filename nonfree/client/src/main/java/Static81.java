import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!d", name = "y", descriptor = "I")
	public static int anInt1905;

	@OriginalMember(owner = "client!d", name = "C", descriptor = "Z")
	public static boolean aBoolean154;

	@OriginalMember(owner = "client!d", name = "G", descriptor = "Lclient!sca;")
	public static Class231_Sub1 aClass231_Sub1_1;

	@OriginalMember(owner = "client!d", name = "E", descriptor = "Lclient!kea;")
	public static final Class187 aClass187_1 = new Class187();

	@OriginalMember(owner = "client!d", name = "H", descriptor = "I")
	public static int anInt1910 = 0;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!rc;Z)V")
	public static void method1660(@OriginalArg(0) Class20_Sub2_Sub4 arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(2) int local2 = arg0.aShort100; local2 <= arg0.aShort98; local2++) {
			for (@Pc(6) int local6 = arg0.aShort97; local6 <= arg0.aShort99; local6++) {
				@Pc(16) Class293 local16 = Static118.aClass293ArrayArrayArray14[arg0.aByte116][local2][local6];
				if (local16 != null) {
					@Pc(21) Class285 local21 = local16.aClass285_6;
					@Pc(23) Class285 local23 = null;
					while (local21 != null) {
						if (local21.aClass20_Sub2_Sub4_1 == arg0) {
							if (local23 == null) {
								local16.aClass285_6 = local21.aClass285_5;
							} else {
								local23.aClass285_5 = local21.aClass285_5;
							}
							local21.method6515();
							break;
						}
						local23 = local21;
						local21 = local21.aClass285_5;
					}
				}
			}
		}
		if (!arg1) {
			Static158.method2429(arg0);
		}
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(II)V")
	public static void method1661(@OriginalArg(0) int arg0) {
		if (Static300.method4703(arg0)) {
			Static203.method3496(-1, Static249.aClass365ArrayArray3[arg0]);
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ILclient!r;)V")
	public static void method1664(@OriginalArg(1) Class12 arg0) {
		Static371.aClass281Array1 = new Class281[Static501.anIntArray575.length];
		for (@Pc(11) int local11 = 0; local11 < Static501.anIntArray575.length; local11++) {
			@Pc(17) int local17 = Static501.anIntArray575[local11];
			@Pc(22) Class13 local22 = Static252.method7834(Static559.aClass111_121, local17);
			@Pc(30) Class35 local30 = arg0.method6457(local22, Static604.method7069(Static126.aClass111_92, local17));
			Static371.aClass281Array1[local11] = new Class281(local30, local22);
		}
	}
}
