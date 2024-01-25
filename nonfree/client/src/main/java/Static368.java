import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!ws", name = "e", descriptor = "Lclient!fp;")
	public static Class63 aClass63_9;

	@OriginalMember(owner = "client!ws", name = "f", descriptor = "Lclient!ct;")
	public static Class30 aClass30_112;

	@OriginalMember(owner = "client!ws", name = "g", descriptor = "I")
	public static int anInt7056;

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_232 = new Class18(79, 15);

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_239 = new Class106(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

	@OriginalMember(owner = "client!ws", name = "d", descriptor = "Lclient!bt;")
	public static final Class21 aClass21_182 = new Class21(16);

	@OriginalMember(owner = "client!ws", name = "h", descriptor = "[I")
	public static final int[] anIntArray522 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "([[[Lclient!og;I)V")
	public static void method6083(@OriginalArg(0) Class155[][][] arg0) {
		for (@Pc(9) int local9 = 0; local9 < arg0.length; local9++) {
			@Pc(15) Class155[][] local15 = arg0[local9];
			for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
				for (@Pc(21) int local21 = 0; local21 < local15[local17].length; local21++) {
					@Pc(29) Class155 local29 = local15[local17][local21];
					if (local29 != null) {
						if (local29.aClass11_Sub1_2 instanceof Interface4) {
							((Interface4) local29.aClass11_Sub1_2).method5923();
						}
						if (local29.aClass11_Sub4_1 instanceof Interface4) {
							((Interface4) local29.aClass11_Sub4_1).method5923();
						}
						if (local29.aClass11_Sub4_2 instanceof Interface4) {
							((Interface4) local29.aClass11_Sub4_2).method5923();
						}
						if (local29.aClass11_Sub5_2 instanceof Interface4) {
							((Interface4) local29.aClass11_Sub5_2).method5923();
						}
						if (local29.aClass11_Sub5_1 instanceof Interface4) {
							((Interface4) local29.aClass11_Sub5_1).method5923();
						}
						for (@Pc(81) Class187 local81 = local29.aClass187_2; local81 != null; local81 = local81.aClass187_3) {
							@Pc(86) Class11_Sub2 local86 = local81.aClass11_Sub2_2;
							if (local86 instanceof Interface4) {
								((Interface4) local86).method5923();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(III)Z")
	public static boolean method6084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static45.anIntArrayArrayArray32[arg0][arg1][arg2];
		if (local7 == -Static339.anInt6001) {
			return false;
		} else if (local7 == Static339.anInt6001) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << Static153.anInt3177;
			@Pc(26) int local26 = arg2 << Static153.anInt3177;
			if (Static158.method2988(local22 + 1, Static258.aClass36Array2[arg0].method4431(arg1, arg2), local26 + 1) && Static158.method2988(local22 + Static66.anInt1552 - 1, Static258.aClass36Array2[arg0].method4431(arg1 + 1, arg2), local26 + 1) && Static158.method2988(local22 + Static66.anInt1552 - 1, Static258.aClass36Array2[arg0].method4431(arg1 + 1, arg2 + 1), local26 + Static66.anInt1552 - 1) && Static158.method2988(local22 + 1, Static258.aClass36Array2[arg0].method4431(arg1, arg2 + 1), local26 + Static66.anInt1552 - 1)) {
				Static45.anIntArrayArrayArray32[arg0][arg1][arg2] = Static339.anInt6001;
				return true;
			} else {
				Static45.anIntArrayArrayArray32[arg0][arg1][arg2] = -Static339.anInt6001;
				return false;
			}
		}
	}
}
