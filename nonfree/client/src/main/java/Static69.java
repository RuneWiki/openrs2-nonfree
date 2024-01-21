import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "[Lclient!ra;")
	public static Class6_Sub3_Sub3_Sub3[] aClass6_Sub3_Sub3_Sub3Array3;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "Lclient!ke;")
	public static Class43 aClass43_1;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
	public static int anInt1998 = 0;

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1044 = Static80.method1463("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1045 = Static80.method1463("Prepared visibility map");

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "[I")
	public static int[] anIntArray225 = new int[500];

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1046 = Static80.method1463("(U2");

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "Z")
	public static boolean aBoolean105 = false;

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
	public static int anInt2002 = 0;

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1047 = aClass63_1045;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLjava/awt/event/KeyEvent;)I")
	public static int method1359(@OriginalArg(1) KeyEvent arg0) {
		@Pc(10) int local10 = arg0.getKeyChar();
		if (local10 <= 0 || local10 >= 256) {
			local10 = -1;
		}
		return local10;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIB)I")
	public static int method1360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class6_Sub7 local15 = (Class6_Sub7) Static72.aClass2_8.method20((long) arg0);
		if (local15 == null) {
			return -1;
		} else if (arg1 >= 0 && local15.anIntArray147.length > arg1) {
			return local15.anIntArray147[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
	public static void method1361() {
		aClass6_Sub3_Sub3_Sub3Array3 = null;
		aClass63_1045 = null;
		aClass63_1046 = null;
		aClass63_1044 = null;
		aClass63_1047 = null;
		aClass43_1 = null;
		anIntArray225 = null;
	}
}
