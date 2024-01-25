import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static591 {

	@OriginalMember(owner = "client!sia", name = "f", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!sia", name = "g", descriptor = "I")
	public static int anInt8978;

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(IZI)Z")
	public static boolean method7611(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static325.method4735(arg1, arg0) | (arg0 & 0x10000) != 0 || Static495.method6772(arg0, arg1)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && Static571.method7409(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(IILclient!sja;Lclient!ha;I)V")
	public static void method7612(@OriginalArg(2) Class342 arg0, @OriginalArg(3) Class22 arg1) {
		Static654.aClass342_80.method7655();
		if (Static247.aBoolean242) {
			return;
		}
		for (@Pc(22) Class3_Sub48 local22 = (Class3_Sub48) arg0.method7644(); local22 != null; local22 = (Class3_Sub48) arg0.method7650()) {
			@Pc(32) Class198 local32 = Static327.aClass111_2.method2739(local22.anInt8050);
			if (Static317.method4645(local32)) {
				@Pc(44) boolean local44 = Static148.method2488(local32, arg1, local22);
				if (local44) {
					Static18.method580(local32, local22, arg1);
				}
			}
		}
	}
}
