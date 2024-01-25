import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static159 {

	@OriginalMember(owner = "client!fka", name = "A", descriptor = "F")
	public static float aFloat111;

	@OriginalMember(owner = "client!fka", name = "a", descriptor = "F")
	public static float aFloat112;

	@OriginalMember(owner = "client!fka", name = "o", descriptor = "[C")
	public static final char[] aCharArray7 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!fka", name = "a", descriptor = "(II)V")
	public static void method2932(@OriginalArg(0) int arg0) {
		if (Static564.aBoolean591 && Static522.aClass5_Sub1_Sub21Array4.length >= arg0) {
			return;
		}
		Static522.aClass5_Sub1_Sub21Array4 = new Class5_Sub1_Sub21[arg0];
		Static212.anIntArray188 = new int[arg0];
		Static638.aClass264Array2 = new Class264[arg0];
		Static572.anIntArray519 = new int[arg0];
		Static53.anIntArray62 = new int[arg0];
		Static89.anIntArray79 = new int[arg0];
		Static517.aClass5_Sub1_Sub21Array3 = new Class5_Sub1_Sub21[arg0];
	}
}
