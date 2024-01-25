import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static237 {

	@OriginalMember(owner = "client!lq", name = "e", descriptor = "I")
	public static int anInt4218 = 0;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(ZII)Z")
	public static boolean method3397(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!pe;ILclient!pe;)V")
	public static void method3398(@OriginalArg(0) Class1 arg0, @OriginalArg(2) Class1 arg1) {
		if (arg1.aClass1_262 != null) {
			arg1.method5915();
		}
		arg1.aClass1_261 = arg0;
		arg1.aClass1_262 = arg0.aClass1_262;
		arg1.aClass1_262.aClass1_261 = arg1;
		arg1.aClass1_261.aClass1_262 = arg1;
	}
}
