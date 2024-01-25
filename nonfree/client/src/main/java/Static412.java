import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
	public static int anInt7076;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZI)V")
	public static void method5669(@OriginalArg(1) int arg0) {
		Static450.method6259();
		@Pc(11) int local11 = Static361.aClass267_1.method6044(arg0).anInt105;
		if (local11 == 0) {
			return;
		}
		@Pc(22) int local22 = Static63.aClass120_2.anIntArray259[arg0];
		if (local11 == 6) {
			Static222.anInt3728 = local22;
		}
		if (local11 == 5) {
			Static157.anInt2846 = local22;
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)I")
	public static int method5670(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(BIZ)Ljava/lang/String;")
	public static String method5671(@OriginalArg(1) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static339.method4815(arg0);
	}
}
