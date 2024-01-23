import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!ml", name = "Q", descriptor = "I")
	public static int anInt5576;

	@OriginalMember(owner = "client!ml", name = "S", descriptor = "[S")
	public static short[] aShortArray95;

	@OriginalMember(owner = "client!ml", name = "K", descriptor = "Lclient!jl;")
	public static Class89 aClass89_44 = new Class89(64);

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "(I)V")
	public static void method4212() {
		try {
			if (Static9.anInt285 == 1) {
				@Pc(12) int local12 = Static2.aClass1_Sub10_Sub3_1.method3144();
				if (local12 > 0 && Static2.aClass1_Sub10_Sub3_1.method3166()) {
					local12 -= Static309.anInt6195;
					if (local12 < 0) {
						local12 = 0;
					}
					Static2.aClass1_Sub10_Sub3_1.method3179(local12);
					return;
				}
				Static2.aClass1_Sub10_Sub3_1.method3175();
				Static2.aClass1_Sub10_Sub3_1.method3148();
				Static222.aClass1_Sub26_2 = null;
				if (Static254.aClass168_172 == null) {
					Static9.anInt285 = 0;
				} else {
					Static9.anInt285 = 2;
				}
				Static168.aClass90_1 = null;
			}
		} catch (@Pc(54) Exception local54) {
			local54.printStackTrace();
			Static2.aClass1_Sub10_Sub3_1.method3175();
			Static222.aClass1_Sub26_2 = null;
			Static254.aClass168_172 = null;
			Static9.anInt285 = 0;
			Static168.aClass90_1 = null;
		}
	}
}
