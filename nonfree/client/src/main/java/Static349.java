import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!mea", name = "k", descriptor = "[[I")
	public static int[][] anIntArrayArray71;

	@OriginalMember(owner = "client!mea", name = "n", descriptor = "I")
	public static int anInt6068 = 13156520;

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(CLjava/lang/String;Ljava/lang/String;B)Ljava/lang/String;")
	public static String method5247(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		@Pc(6) int local6 = arg0.length();
		@Pc(9) int local9 = arg1.length();
		@Pc(11) int local11 = local6;
		@Pc(15) int local15 = local9 - 1;
		if (local15 != 0) {
			@Pc(22) int local22 = 0;
			while (true) {
				local22 = arg0.indexOf(13, local22);
				if (local22 < 0) {
					break;
				}
				local11 += local15;
				local22++;
			}
		}
		@Pc(40) StringBuffer local40 = new StringBuffer(local11);
		@Pc(42) int local42 = 0;
		while (true) {
			@Pc(56) int local56 = arg0.indexOf(13, local42);
			if (local56 < 0) {
				local40.append(arg0.substring(local42));
				return local40.toString();
			}
			local40.append(arg0.substring(local42, local56));
			local40.append(arg1);
			local42 = local56 + 1;
		}
	}

	@OriginalMember(owner = "client!mea", name = "d", descriptor = "(I)V")
	public static void method5250() {
		Static355.aClass261_1 = new Class261(8);
		Static257.anInt4846 = 0;
		for (@Pc(19) Class16_Sub7 local19 = (Class16_Sub7) Static518.aClass19_9.method562(); local19 != null; local19 = (Class16_Sub7) Static518.aClass19_9.method558()) {
			local19.method5988();
		}
	}
}
