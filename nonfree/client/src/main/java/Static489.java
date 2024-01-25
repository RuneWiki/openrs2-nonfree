import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static489 {

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
	public static int anInt8544;

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "[Lclient!ii;")
	public static Class16_Sub1_Sub1[] aClass16_Sub1_Sub1Array5;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
	public static void method7358() {
		Static502.anInt9931 = 0;
		Static375.anInt6459 = -1;
		Static583.anInt9512 = -1;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILclient!vl;)V")
	public static void method7361(@OriginalArg(1) int arg0, @OriginalArg(2) Class16_Sub1_Sub1_Sub3 arg1) {
		if (arg1.anIntArray586 == null) {
			return;
		}
		@Pc(9) int local9 = arg1.anIntArray586[arg0 + 1];
		if (arg1.anInt8049 == local9) {
			return;
		}
		arg1.anInt8135 = arg1.anInt8133;
		arg1.anInt8049 = local9;
		arg1.anInt8083 = 0;
		arg1.anInt8087 = 0;
		arg1.anInt8121 = 1;
		arg1.anInt8060 = 0;
		if (arg1.anInt8049 != -1) {
			Static145.method2602(arg1.anInt8083, arg1, Static479.aClass308_2.method7075(arg1.anInt8049));
		}
	}
}
