import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_109 = new Class7(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

	@OriginalMember(owner = "client!ng", name = "n", descriptor = "[I")
	public static final int[] anIntArray406 = new int[3];

	@OriginalMember(owner = "client!ng", name = "t", descriptor = "I")
	public static int anInt4673 = 0;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
	public static void method3880() {
		Static194.anInt3473 = Static3.aClass151_6.anInt4134 + Static3.aClass151_6.anInt4125 + 2;
		Static206.aStringArray25 = new String[500];
		Static361.anInt5957 = Static325.aClass151_103.anInt4134 + Static325.aClass151_103.anInt4125 + 2;
		for (@Pc(25) int local25 = 0; local25 < Static206.aStringArray25.length; local25++) {
			Static206.aStringArray25[local25] = "";
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)V")
	public static void method3881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = client.lb[0][arg1][arg2] != null && client.lb[0][arg1][arg2].aClass80_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (client.lb[local22][arg1][arg2] == null) {
				@Pc(46) Class80 local46 = client.lb[local22][arg1][arg2] = new Class80(local22, arg1, arg2);
				if (local20) {
					local46.aByte52++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)Z")
	public static boolean method3883(@OriginalArg(0) int arg0) {
		if (arg0 == 47 || arg0 == 48 || arg0 == 49 || arg0 == 57 || arg0 == 1010) {
			return true;
		} else {
			return arg0 == 18 || arg0 == 1004;
		}
	}
}
