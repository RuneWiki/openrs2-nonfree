import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!id", name = "db", descriptor = "[[I")
	public static int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!id", name = "Y", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1681 = Static80.method1463("headicons_hint");

	@OriginalMember(owner = "client!id", name = "bb", descriptor = "I")
	public static int anInt3077 = -1;

	@OriginalMember(owner = "client!id", name = "eb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1682 = Static80.method1463("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!id", name = "hb", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1683 = Static80.method1463("Connecting to friendserver");

	@OriginalMember(owner = "client!id", name = "ib", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1684 = Static80.method1463("Cabbage");

	@OriginalMember(owner = "client!id", name = "lb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1685 = Static80.method1463("Menge eingeben:");

	@OriginalMember(owner = "client!id", name = "mb", descriptor = "[Lclient!we;")
	public static Class78[] aClass78Array10 = new Class78[16];

	@OriginalMember(owner = "client!id", name = "nb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1686 = aClass63_1683;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IZ)Z")
	public static boolean method2061(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(11) int local11 = Static69.anIntArray225[arg0];
		if (local11 >= 2000) {
			local11 -= 2000;
		}
		return local11 == 32;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(JZ)V")
	public static void method2063(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static20.method505(arg0 - 1L);
			Static20.method505(1L);
		} else {
			Static20.method505(arg0);
		}
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(B)V")
	public static void method2064() {
		aClass63_1682 = null;
		aClass78Array10 = null;
		aClass63_1685 = null;
		aClass63_1684 = null;
		anIntArrayArray36 = null;
		aClass63_1681 = null;
		aClass63_1683 = null;
		aClass63_1686 = null;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	public static void method2065(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static31.aClass41_1);
		arg0.addMouseMotionListener(Static31.aClass41_1);
		arg0.addFocusListener(Static31.aClass41_1);
	}
}
