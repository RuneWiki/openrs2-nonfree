import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!aba", name = "d", descriptor = "Lclient!du;")
	public static Class85 aClass85_1;

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

	@OriginalMember(owner = "client!aba", name = "g", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_1 = new Class196(44, 0);

	@OriginalMember(owner = "client!aba", name = "i", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_2 = new Class196(80, -1);

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(IIIII)V")
	public static void method47(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(4) int local4;
		if (arg2 <= arg1) {
			for (local4 = arg2; local4 < arg1; local4++) {
				Static286.anIntArrayArray42[local4][arg3] = arg0;
			}
		} else {
			for (local4 = arg1; local4 < arg2; local4++) {
				Static286.anIntArrayArray42[local4][arg3] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(IILclient!rv;)V")
	public static void method48(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub15 arg1) {
		if (Static405.aClass85_3 == null) {
			return;
		}
		try {
			Static405.aClass85_3.method1847(0L);
			Static405.aClass85_3.method1849(24, arg1.aByteArray45, arg0);
		} catch (@Pc(27) Exception local27) {
		}
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(II)Z")
	public static boolean method50(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}
}
