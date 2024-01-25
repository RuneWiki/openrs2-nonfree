import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "Lclient!mp;")
	public static Class30 aClass30_7;

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "Lclient!al;")
	public static final Class11 aClass11_82 = new Class11(64);

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "Lclient!vd;")
	public static Class205 aClass205_8 = null;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IB)V")
	public static void method3550(@OriginalArg(0) int arg0) {
		Static214.method3858();
		Static212.method3824();
		@Pc(19) int local19 = Static228.method4032(arg0).anInt141;
		if (local19 == 0) {
			return;
		}
		@Pc(29) int local29 = Static102.anIntArray211[arg0];
		if (local19 == 6) {
			Static270.anInt5160 = local29;
		}
		if (local19 == 5) {
			Static327.anInt6303 = local29;
		}
		if (local19 == 9) {
			Static124.anInt2718 = local29;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method3562(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static28.aClass82_1);
		arg0.addMouseMotionListener(Static28.aClass82_1);
		arg0.addFocusListener(Static28.aClass82_1);
	}
}
