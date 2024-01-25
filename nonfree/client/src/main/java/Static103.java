import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!db", name = "a", descriptor = "I")
	public static int anInt10706 = 0;

	@OriginalMember(owner = "client!db", name = "c", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_156 = new Class349(17, 16);

	@OriginalMember(owner = "client!db", name = "d", descriptor = "[Lclient!rfa;")
	public static final Interface21[] anInterface21Array7 = new Interface21[75];

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!tl;III)V")
	public static void method9370(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class311 local12;
		if (arg2 < Static372.anInt5930) {
			local12 = Static632.aClass311ArrayArrayArray3[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass4_Sub2_Sub2_1 != null && local12.aClass4_Sub2_Sub2_1.method8968()) {
				arg0.method8967(local12.aClass4_Sub2_Sub2_1, Static60.anInt1042, Static689.aClass145_16, 0, true, 0, (byte) 89);
			}
		}
		if (arg3 < Static372.anInt5930) {
			local12 = Static632.aClass311ArrayArrayArray3[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass4_Sub2_Sub2_1 != null && local12.aClass4_Sub2_Sub2_1.method8968()) {
				arg0.method8967(local12.aClass4_Sub2_Sub2_1, 0, Static689.aClass145_16, Static60.anInt1042, true, 0, (byte) 89);
			}
		}
		if (arg2 < Static372.anInt5930 && arg3 < Static545.anInt8590) {
			local12 = Static632.aClass311ArrayArrayArray3[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass4_Sub2_Sub2_1 != null && local12.aClass4_Sub2_Sub2_1.method8968()) {
				arg0.method8967(local12.aClass4_Sub2_Sub2_1, Static60.anInt1042, Static689.aClass145_16, Static60.anInt1042, true, 0, (byte) 89);
			}
		}
		if (arg2 < Static372.anInt5930 && arg3 > 0) {
			local12 = Static632.aClass311ArrayArrayArray3[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass4_Sub2_Sub2_1 != null && local12.aClass4_Sub2_Sub2_1.method8968()) {
				arg0.method8967(local12.aClass4_Sub2_Sub2_1, Static60.anInt1042, Static689.aClass145_16, -Static60.anInt1042, true, 0, (byte) 89);
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
	public static void method9371() {
		if (Static591.aClass337_3 != null) {
			Static591.aClass337_3.method8104();
		}
		if (Static181.aThread4 == null) {
			return;
		}
		while (true) {
			try {
				Static181.aThread4.join();
				break;
			} catch (@Pc(17) InterruptedException local17) {
			}
		}
	}
}
