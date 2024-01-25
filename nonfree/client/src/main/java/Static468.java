import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static468 {

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)Z")
	public static boolean method6570() {
		if (Static343.aBoolean436) {
			try {
				Static555.method5217(Static159.aClass9_10.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(14) Throwable local14) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(Z)V")
	public static void method6571() {
		@Pc(12) Class5_Sub42 local12 = (Class5_Sub42) Static483.aClass99_76.method2526();
		@Pc(23) boolean local23 = Static499.aClass220_17 != null || Static464.anInt7969 > 0;
		if (local23) {
			Static97.anInt2211 = 1;
		}
		if (Static2.aBoolean3 && Static59.aClass18_1.method5977(81) && Static257.anInt5147 > 2) {
			if (local23) {
				Static411.aClass5_Sub47_3 = (Class5_Sub47) Static521.aClass99_78.aClass5_102.aClass5_283.aClass5_283;
			} else {
				Static164.method2921((Class5_Sub47) Static521.aClass99_78.aClass5_102.aClass5_283.aClass5_283, local12.method7432(), local12.method7433());
			}
		} else if (local23) {
			Static411.aClass5_Sub47_3 = (Class5_Sub47) Static521.aClass99_78.aClass5_102.aClass5_283;
		} else {
			Static164.method2921((Class5_Sub47) Static521.aClass99_78.aClass5_102.aClass5_283, local12.method7432(), local12.method7433());
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z[FI)[F")
	public static float[] method6573(@OriginalArg(1) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) float[] local6 = new float[arg1];
		Static553.method2533(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
