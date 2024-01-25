import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static535 {

	@OriginalMember(owner = "client!tea", name = "k", descriptor = "[Lclient!ov;")
	public static Class4_Sub2[] aClass4_Sub2Array5;

	@OriginalMember(owner = "client!tea", name = "h", descriptor = "Lclient!bu;")
	public static final Class43 aClass43_3 = new Class43(0);

	@OriginalMember(owner = "client!tea", name = "i", descriptor = "I")
	public static int anInt9143 = 0;

	@OriginalMember(owner = "client!tea", name = "l", descriptor = "[I")
	public static final int[] anIntArray503 = new int[50];

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(IB)Z")
	public static boolean method7883(@OriginalArg(0) int arg0) {
		return arg0 == 7 || arg0 == 8 || arg0 == 9;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(ZZ)V")
	public static void method7884(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static337.anInt5727 != -1) {
				Static431.method5476(Static337.anInt5727);
			}
			for (@Pc(15) Class5_Sub27 local15 = (Class5_Sub27) Static269.aClass273_11.method6577(); local15 != null; local15 = (Class5_Sub27) Static269.aClass273_11.method6589()) {
				if (!local15.method9048()) {
					local15 = (Class5_Sub27) Static269.aClass273_11.method6577();
					if (local15 == null) {
						break;
					}
				}
				Static609.method8688(true, local15, false);
			}
			Static337.anInt5727 = -1;
			Static269.aClass273_11 = new Class273(8);
			Static338.method5095();
			Static337.anInt5727 = Static449.anInt7648;
			Static555.method8083(false);
			Static472.method6995();
			Static370.method5466(Static337.anInt5727);
		}
		Static418.aBoolean515 = true;
	}

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "(Z)Z")
	public static boolean method7886() {
		if (Static154.aClass5_Sub5_Sub15_3 == null) {
			return false;
		} else {
			if (Static154.aClass5_Sub5_Sub15_3.anInt6765 >= 2000) {
				Static154.aClass5_Sub5_Sub15_3.anInt6765 -= 2000;
			}
			return Static154.aClass5_Sub5_Sub15_3.anInt6765 == 1001;
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(I)V")
	public static void method7889(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if (Static106.anInt2025 == 2) {
				Static56.aClass220Array1[0].method4924(Static288.aClass175Array1[0]);
				Static56.aClass220Array1[1].method4924(Static288.aClass175Array1[1]);
			} else if (Static106.anInt2025 == 3) {
				Static56.aClass220Array1[0].method4924(Static288.aClass175Array1[0]);
				Static56.aClass220Array1[1].method4924(Static288.aClass175Array1[1]);
				Static56.aClass220Array1[2].method4924(Static288.aClass175Array1[2]);
			} else {
				Static56.aClass220Array1[0].method4924(Static288.aClass175Array1[0]);
				Static56.aClass220Array1[1].method4924(Static288.aClass175Array1[1]);
				Static56.aClass220Array1[2].method4924(Static288.aClass175Array1[2]);
				Static56.aClass220Array1[3].method4924(Static288.aClass175Array1[3]);
			}
		} else if (arg0 == 1) {
			if (Static106.anInt2025 == 2) {
				Static56.aClass220Array1[0].method4924(Static288.aClass175Array1[2]);
			} else if (Static106.anInt2025 == 3) {
				Static56.aClass220Array1[0].method4924(Static288.aClass175Array1[3]);
				Static56.aClass220Array1[1].method4924(Static288.aClass175Array1[4]);
			} else {
				Static56.aClass220Array1[0].method4924(Static288.aClass175Array1[4]);
				Static56.aClass220Array1[1].method4924(Static288.aClass175Array1[5]);
				Static56.aClass220Array1[2].method4924(Static288.aClass175Array1[6]);
			}
		} else if (arg0 == 2) {
			if (Static106.anInt2025 == 2) {
				Static56.aClass220Array1[0].method4924(Static288.aClass175Array1[3]);
				return;
			}
			if (Static106.anInt2025 == 3) {
				Static56.aClass220Array1[0].method4924(Static288.aClass175Array1[5]);
				return;
			}
			Static56.aClass220Array1[0].method4924(Static288.aClass175Array1[7]);
		}
	}
}
