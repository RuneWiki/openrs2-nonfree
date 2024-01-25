import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static46 {

	@OriginalMember(owner = "client!bga", name = "g", descriptor = "I")
	public static int anInt958;

	@OriginalMember(owner = "client!bga", name = "h", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!bga", name = "i", descriptor = "[[[Lclient!q;")
	public static Class291[][][] aClass291ArrayArrayArray1;

	@OriginalMember(owner = "client!bga", name = "e", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_12 = new Class341(49, 8);

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(III)V")
	public static void method954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static576.anInt10034 == 1) {
			Static104.method1882(arg1, arg0, Static477.aClass2_Sub1_Sub13_3);
		} else if (Static576.anInt10034 == 2) {
			if (Static450.aBoolean606) {
				Static19.method378(Static207.method3926() + arg0, Static106.method1934() + arg1);
			} else {
				Static19.method378(arg0, arg1);
			}
		}
		Static477.aClass2_Sub1_Sub13_3 = null;
		Static576.anInt10034 = 0;
	}
}
