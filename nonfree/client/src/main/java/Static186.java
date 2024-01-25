import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "I")
	public static int anInt3149 = 0;

	@OriginalMember(owner = "client!iv", name = "i", descriptor = "[Lclient!wi;")
	public static final Class266[] aClass266Array1 = new Class266[8];

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(ILclient!wl;I)V")
	public static void method2537(@OriginalArg(1) Class2_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = -1;
		@Pc(14) int local14 = 0;
		if (arg0.anInt6148 > Static85.anInt1536) {
			Static347.method4518(arg0);
		} else if (Static85.anInt1536 <= arg0.anInt6144) {
			Static236.method3054(arg0);
		} else {
			Static154.method5156(arg0, false);
			local14 = Static307.anInt4787;
			local12 = Static56.anInt1079;
		}
		if (arg0.anInt7500 < 128 || arg0.anInt7502 < 128 || (Static433.anInt7210 - 1) * 128 <= arg0.anInt7500 || arg0.anInt7502 >= Static418.anInt6969 * 128 - 128) {
			local12 = -1;
			arg0.anInt6173 = -1;
			arg0.anInt6144 = 0;
			arg0.anInt6125 = -1;
			arg0.anInt6193 = -1;
			arg0.anInt6148 = 0;
			local14 = 0;
			arg0.anInt7500 = arg0.anIntArray434[0] * 128 + arg0.method4913() * 64;
			arg0.anInt7502 = arg0.anIntArray433[0] * 128 + arg0.method4913() * 64;
			arg0.method4919();
		}
		if (Static220.aClass2_Sub1_Sub3_Sub2_1 == arg0 && (arg0.anInt7500 < 1536 || arg0.anInt7502 < 1536 || (Static433.anInt7210 - 12) * 128 <= arg0.anInt7500 || arg0.anInt7502 >= Static418.anInt6969 * 128 - 1536)) {
			arg0.anInt6193 = -1;
			arg0.anInt6144 = 0;
			arg0.anInt6148 = 0;
			arg0.anInt6173 = -1;
			local12 = -1;
			arg0.anInt6125 = -1;
			local14 = 0;
			arg0.anInt7500 = arg0.anIntArray434[0] * 128 + arg0.method4913() * 64;
			arg0.anInt7502 = arg0.anIntArray433[0] * 128 + arg0.method4913() * 64;
			arg0.method4919();
		}
		@Pc(220) int local220 = Static70.method1070(arg0);
		Static271.method3664(local14, local12, local220, arg0);
		Static379.method3484(arg0);
	}
}
