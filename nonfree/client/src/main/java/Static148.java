import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_85 = new Class102(37, -1);

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "Lclient!mg;")
	public static final Class156 aClass156_15 = new Class156();

	@OriginalMember(owner = "client!hd", name = "j", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_64 = new Class211(10, 5);

	@OriginalMember(owner = "client!hd", name = "k", descriptor = "[I")
	public static final int[] anIntArray203 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
	public static void method2149() {
		if (!Static401.method5075()) {
			return;
		}
		if (Static382.aStringArray35 == null) {
			Static221.method2939();
		}
		Static238.anInt3827 = 0;
		Static190.aBoolean187 = true;
		try {
			Static168.aClipboard1 = Static320.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(16) Exception local16) {
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIB)I")
	public static int method2150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static14.anIntArray18[arg1 & 0x3] : Static86.anIntArray576[arg1 & 0x3];
	}
}
