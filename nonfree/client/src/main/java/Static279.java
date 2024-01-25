import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static279 {

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Z)[Lclient!ga;")
	public static Class107[] method4950() {
		return new Class107[] { Static624.aClass107_7, Static200.aClass107_4, Static619.aClass107_6, Static559.aClass107_5, Static109.aClass107_3, Static85.aClass107_1 };
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lclient!pg;BI)V")
	public static void method4951(@OriginalArg(0) Class260 arg0, @OriginalArg(2) int arg1) {
		if (Static311.aBoolean525) {
			Static311.aBoolean525 = false;
			arg1 = 0;
		}
		if (Static11.aClass260_1 != null && Static11.aClass260_1.method6584(arg0)) {
			return;
		}
		Static11.aClass260_1 = arg0;
		Static592.aLong256 = Static444.method6719();
		Static115.anInt9243 = arg1;
		Static322.anInt6495 = arg1;
		if (Static322.anInt6495 != 0) {
			Static519.aFloat232 = Static609.aFloat275;
			Static245.aFloat159 = Static42.aFloat16;
			Static90.aFloat91 = Static216.aFloat151;
			Static250.anInt5551 = Static501.anInt9728;
			Static52.aClass4_3 = Static459.aClass4_11;
			Static97.aFloat93 = Static117.aFloat99;
			Static577.anInt7611 = Static565.anInt9605;
			Static43.anInt768 = Static260.anInt5718;
			Static585.aFloat278 = Static136.aFloat125;
			Static527.aFloat233 = Static572.aFloat266;
			return;
		}
		Static110.method2709();
	}
}
