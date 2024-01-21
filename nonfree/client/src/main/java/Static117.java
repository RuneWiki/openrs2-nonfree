import java.awt.Font;
import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!ld", name = "E", descriptor = "[I")
	public static int[] anIntArray142;

	@OriginalMember(owner = "client!ld", name = "I", descriptor = "I")
	public static int anInt2370;

	@OriginalMember(owner = "client!ld", name = "S", descriptor = "Lclient!ke;")
	public static Class52 aClass52_27;

	@OriginalMember(owner = "client!ld", name = "cb", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!ld", name = "M", descriptor = "I")
	public static int anInt2374 = 0;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;B)I")
	public static int method1689(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) int local6 = arg0.getKeyChar();
		if (local6 == 8364) {
			return 128;
		} else {
			if (local6 <= 0 || local6 >= 256) {
				local6 = -1;
			}
			return local6;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V")
	public static void method1690() {
		if (Static193.anInt3931 > 0) {
			Static5.method88();
		} else {
			Static29.method515(40);
			Static54.aClass33_1 = Static148.aClass33_2;
			Static148.aClass33_2 = null;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIII)V")
	public static void method1694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static153.anInt3166 == 0 || arg1 == 0 || Static45.anInt953 >= 50 || arg0 == -1) {
			return;
		}
		Static89.anIntArray35[Static45.anInt953] = arg0;
		Static62.anIntArray72[Static45.anInt953] = arg1;
		Static53.anIntArray63[Static45.anInt953] = arg2;
		Static182.aClass7Array1[Static45.anInt953] = null;
		Static207.anIntArray373[Static45.anInt953] = 0;
		Static45.anInt953++;
	}
}
