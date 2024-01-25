import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static464 {

	@OriginalMember(owner = "client!pm", name = "g", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_113 = new Class218(83, 0);

	@OriginalMember(owner = "client!pm", name = "i", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_158 = new Class180(119, 2);

	@OriginalMember(owner = "client!pm", name = "j", descriptor = "Z")
	public static boolean aBoolean567 = false;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)I")
	public static int method6729() {
		return Static114.anInt2325++;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z[I[I)V")
	public static void method6730(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1) {
		if (arg1 == null || arg0 == null) {
			Static623.anIntArray862 = null;
			Static519.anIntArray708 = null;
			Static458.aByteArrayArrayArray23 = null;
			return;
		}
		Static519.anIntArray708 = arg1;
		Static623.anIntArray862 = new int[arg1.length];
		Static458.aByteArrayArrayArray23 = new byte[arg1.length][][];
		for (@Pc(33) int local33 = 0; local33 < Static519.anIntArray708.length; local33++) {
			Static458.aByteArrayArrayArray23[local33] = new byte[arg0[local33]][];
		}
	}
}
