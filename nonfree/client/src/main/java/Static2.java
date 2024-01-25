import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "Lclient!ud;")
	public static final Class245 aClass245_1 = new Class245(6, 0, 4, 2);

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_1 = new Class146(56, 4);

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "[I")
	public static final int[] anIntArray1 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method7(@OriginalArg(1) String arg0) {
		if (Static404.aClass130Array1 != null) {
			Static448.method5935(Static192.aClass146_52);
			Static247.aClass4_Sub9_Sub2_2.method4999(Static109.method5003(arg0));
			Static247.aClass4_Sub9_Sub2_2.method5039(arg0);
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IBI)Z")
	public static boolean method8(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
