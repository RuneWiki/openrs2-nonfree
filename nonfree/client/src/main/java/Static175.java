import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_41 = new Class187(82, 5);

	@OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
	public static int anInt2881 = 0;

	@OriginalMember(owner = "client!ga", name = "r", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_109 = new Class196(132, 10);

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BI)Z")
	public static boolean method2576(@OriginalArg(1) int arg0) {
		if (Static68.aBooleanArray1[arg0]) {
			return true;
		} else if (Static342.aClass50_98.method906(arg0)) {
			@Pc(28) int local28 = Static342.aClass50_98.method913(arg0);
			if (local28 == 0) {
				Static68.aBooleanArray1[arg0] = true;
				return true;
			}
			if (Static227.aClass394ArrayArray2[arg0] == null) {
				Static227.aClass394ArrayArray2[arg0] = new Class394[local28];
			}
			for (@Pc(50) int local50 = 0; local50 < local28; local50++) {
				if (Static227.aClass394ArrayArray2[arg0][local50] == null) {
					@Pc(63) byte[] local63 = Static342.aClass50_98.method916(local50, arg0);
					if (local63 != null) {
						@Pc(75) Class394 local75 = Static227.aClass394ArrayArray2[arg0][local50] = new Class394();
						local75.anInt10490 = (arg0 << 16) + local50;
						if (local63[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local75.method8739(new Class5_Sub15(local63));
					}
				}
			}
			Static68.aBooleanArray1[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
