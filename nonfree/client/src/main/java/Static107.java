import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!dja", name = "g", descriptor = "I")
	public static int anInt2106 = 0;

	@OriginalMember(owner = "client!dja", name = "h", descriptor = "I")
	public static int anInt2107 = 0;

	@OriginalMember(owner = "client!dja", name = "j", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_18 = new Class208(61, 7);

	@OriginalMember(owner = "client!dja", name = "k", descriptor = "[I")
	public static final int[] anIntArray146 = new int[1000];

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(II)V")
	public static void method1754(@OriginalArg(1) int arg0) {
		Static540.anIntArray572 = new int[arg0];
		Static112.anIntArray154 = new int[arg0];
		Static360.anIntArray415 = new int[arg0];
		Static335.anIntArray379 = new int[arg0];
		Static502.anIntArray539 = new int[arg0];
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(BI)Lclient!ki;")
	public static Class173 method1755(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static118.aClass173Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(JI)V")
	public static void method1758(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(12) InterruptedException local12) {
		}
	}
}
