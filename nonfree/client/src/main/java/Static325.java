import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!nba", name = "A", descriptor = "Lclient!nfa;")
	public static Class158 aClass158_1;

	@OriginalMember(owner = "client!nba", name = "C", descriptor = "I")
	public static int anInt5850;

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method5027(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static300.anInt4872; local11++) {
			if (arg0.equalsIgnoreCase(Static489.aStringArray30[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static426.aClass29_Sub2_Sub1_Sub2_2.aString108);
	}

	@OriginalMember(owner = "client!nba", name = "b", descriptor = "(II)V")
	public static void method5028(@OriginalArg(0) int arg0) {
		Static445.method6398();
		@Pc(19) int local19 = Static333.aClass187_1.method4092(arg0).anInt3045;
		if (local19 == 0) {
			return;
		}
		@Pc(30) int local30 = Static505.aClass30_1.anIntArray46[arg0];
		if (local19 == 6) {
			Static181.anInt3203 = local30;
		}
		if (local19 == 5) {
			Static129.anInt2230 = local30;
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(IIB)Z")
	public static boolean method5030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(III)I")
	public static int method5031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static297.anIntArray458[arg0 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!nba", name = "b", descriptor = "(III)Z")
	public static boolean method5033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}
}
