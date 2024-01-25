import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static535 {

	@OriginalMember(owner = "client!sf", name = "i", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray4;

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "[Lclient!kl;")
	public static final Class5_Sub5_Sub15[] aClass5_Sub5_Sub15Array4 = new Class5_Sub5_Sub15[14];

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IZ)V")
	public static void method7896(@OriginalArg(1) boolean arg0) {
		Static62.method873();
		if (!Static70.method1121(Static107.anInt1746)) {
			return;
		}
		Static453.anInt7762++;
		if (Static453.anInt7762 < 50 && !arg0) {
			return;
		}
		Static453.anInt7762 = 0;
		if (!Static246.aBoolean334 && Static492.aClass295_1 != null) {
			@Pc(48) Class5_Sub50 local48 = Static457.method6722(Static70.aClass387_18, Static80.aClass313_1);
			Static494.method7120(local48);
			try {
				Static253.method3720();
			} catch (@Pc(55) IOException local55) {
				Static246.aBoolean334 = true;
			}
		}
		Static62.method873();
	}
}
