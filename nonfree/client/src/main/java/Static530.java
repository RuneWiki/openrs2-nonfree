import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static530 {

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "F")
	public static float aFloat189;

	@OriginalMember(owner = "client!rw", name = "c", descriptor = "Lclient!pr;")
	public static Class284 aClass284_1;

	@OriginalMember(owner = "client!rw", name = "d", descriptor = "[I")
	public static int[] anIntArray559 = new int[1];

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(BII)Z")
	public static boolean method7396(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(Z)V")
	public static void method7397() {
		Static355.aClass16_6.L(Static637.anInt9833, Static227.aClass3_Sub15_11.aClass17_Sub27_1.method8266() == 1 ? Static256.anInt4826 + 256 << 2 : -1, 0);
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(II)I")
	public static int method7398(@OriginalArg(0) int arg0) {
		@Pc(17) byte local17;
		if (arg0 > 12000) {
			Static650.method8525();
			local17 = 4;
		} else if (arg0 > 5000) {
			Static627.method8276();
			local17 = 3;
		} else if (arg0 > 2000) {
			Static638.method8379();
			local17 = 2;
		} else {
			Static53.method1374();
			local17 = 1;
		}
		if (Static227.aClass3_Sub15_11.aClass17_Sub20_1.method6402() != 2) {
			Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub20_2, 2);
			Static422.method6016(false, 2);
		}
		Static57.method6341();
		return local17;
	}
}
