import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "[I")
	public static int[] anIntArray622;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "Z")
	public static boolean aBoolean733 = true;

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "(I)V")
	public static void method7835() {
		for (@Pc(18) Class3_Sub26 local18 = (Class3_Sub26) Static469.aClass112_27.method3088(); local18 != null; local18 = (Class3_Sub26) Static469.aClass112_27.method3084()) {
			if (local18.anInt3734 > 0) {
				local18.anInt3734--;
			}
			if (local18.anInt3734 != 0) {
				if (local18.anInt3739 > 0) {
					local18.anInt3739--;
				}
				if (local18.anInt3739 == 0 && local18.anInt3738 >= 1 && local18.anInt3735 >= 1 && Static54.anInt1038 - 2 >= local18.anInt3738 && local18.anInt3735 <= Static140.anInt3026 - 2 && (local18.anInt3743 < 0 || Static151.method2862(local18.anInt3746, local18.anInt3743))) {
					Static328.method4723(local18.anInt3742, local18.anInt3746, local18.anInt3735, local18.anInt3740, -1, local18.anInt3743, local18.anInt3738, local18.anInt3745);
					local18.anInt3739 = -1;
					if (local18.anInt3744 == local18.anInt3743 && local18.anInt3744 == -1) {
						local18.method7825();
					} else if (local18.anInt3743 == local18.anInt3744 && local18.anInt3736 == local18.anInt3745 && local18.anInt3746 == local18.anInt3737) {
						local18.method7825();
					}
				}
			} else if (local18.anInt3744 < 0 || Static151.method2862(local18.anInt3737, local18.anInt3744)) {
				Static328.method4723(local18.anInt3742, local18.anInt3737, local18.anInt3735, local18.anInt3740, -1, local18.anInt3744, local18.anInt3738, local18.anInt3736);
				local18.method7825();
			}
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)V")
	public static void method7836(@OriginalArg(1) int arg0) {
		@Pc(16) Class3_Sub7_Sub18 local16 = Static543.method7218(11, arg0);
		local16.method7329();
	}
}
