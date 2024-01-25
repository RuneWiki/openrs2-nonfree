import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static528 {

	@OriginalMember(owner = "client!waa", name = "e", descriptor = "F")
	public static float aFloat265;

	@OriginalMember(owner = "client!waa", name = "f", descriptor = "F")
	public static float aFloat266;

	@OriginalMember(owner = "client!waa", name = "c", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_149 = new Class67(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(I)V")
	public static void method7621() {
		Static278.method4791(Static492.aClass158_120);
		Static515.aClass3_Sub27_Sub1_2.method7576(Static212.method3885());
		Static515.aClass3_Sub27_Sub1_2.method7600(Static480.anInt8652, 30364);
		Static515.aClass3_Sub27_Sub1_2.method7600(Static412.anInt7547, 30364);
		Static515.aClass3_Sub27_Sub1_2.method7576(Static7.aClass3_Sub15_Sub1_1.anInt8366);
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(III[BIII)Z")
	public static boolean method7622(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg0 % 8;
		@Pc(19) int local19;
		if (local9 == 0) {
			local19 = 0;
		} else {
			local19 = 8 - local9;
		}
		@Pc(32) int local32 = -((arg2 + 7) / 8);
		@Pc(42) int local42 = -((arg0 + 8 - 1) / 8);
		for (@Pc(44) int local44 = local32; local44 < 0; local44++) {
			for (@Pc(48) int local48 = local42; local48 < 0; local48++) {
				if (arg1[arg4] == 0) {
					return true;
				}
				arg4 += 8;
			}
			arg4 -= local19;
			if (arg1[arg4 - 1] == 0) {
				return true;
			}
			arg4 += arg3;
		}
		return false;
	}
}
