import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "[I")
	public static final int[] anIntArray230 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IZ)V")
	public static void method2663(@OriginalArg(1) boolean arg0) {
		Static186.method3607();
		if (!Static343.method5603(Static325.anInt6149)) {
			return;
		}
		Static42.anInt1241++;
		if (Static42.anInt1241 < 50 && !arg0) {
			return;
		}
		Static42.anInt1241 = 0;
		if (!Static519.aBoolean682 && Static52.aClass64_1 != null) {
			Static298.method4854(Static84.aClass181_21);
			try {
				Static52.aClass64_1.method1819(Static547.aClass6_Sub26_Sub2_2.anInt5769, Static547.aClass6_Sub26_Sub2_2.aByteArray65);
				Static547.aClass6_Sub26_Sub2_2.anInt5769 = 0;
			} catch (@Pc(51) IOException local51) {
				Static519.aBoolean682 = true;
			}
		}
		Static186.method3607();
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)Z")
	public static boolean method2664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static238.method4200(arg1, arg0) | (arg1 & 0x70000) != 0 || Static188.method3617(arg1, arg0);
	}
}
