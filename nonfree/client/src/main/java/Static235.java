import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!iha", name = "y", descriptor = "Lclient!nt;")
	public static Class248 aClass248_1;

	@OriginalMember(owner = "client!iha", name = "L", descriptor = "I")
	public static int anInt3999;

	@OriginalMember(owner = "client!iha", name = "k", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_37 = new Class181(43, 8);

	@OriginalMember(owner = "client!iha", name = "A", descriptor = "[I")
	public static final int[] anIntArray338 = new int[14];

	@OriginalMember(owner = "client!iha", name = "J", descriptor = "I")
	public static int anInt3998 = 0;

	@OriginalMember(owner = "client!iha", name = "K", descriptor = "[Lclient!be;")
	public static final Class5_Sub4_Sub2[] aClass5_Sub4_Sub2Array1 = new Class5_Sub4_Sub2[14];

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(Lclient!kk;ILjava/lang/Object;)V")
	public static void method3626(@OriginalArg(0) Class192 arg0, @OriginalArg(2) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg0.anEventQueue1.peekEvent() != null; local11++) {
			Static452.method7478(1L);
		}
		try {
			if (arg1 != null) {
				arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
			}
		} catch (@Pc(37) Exception local37) {
		}
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(FBFF)F")
	public static float method3627(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return arg0 + (arg1 - arg0) * arg2;
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(BI)V")
	public static void method3630(@OriginalArg(1) int arg0) {
		Static100.anInt1573 = -1;
		Static486.anInt8186 = -1;
		Static504.anInt8544 = arg0;
		Static503.method3569();
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(B)V")
	public static void method3631() {
		Static540.aClass126_21.xa(((float) Static627.aClass5_Sub46_31.aClass11_Sub2_1.method447() * 0.1F + 0.7F) * 1.1523438F);
		Static540.aClass126_21.ZA(Static135.anInt2217, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		Static540.aClass126_21.L(Static538.anInt8954, -1, 0);
		Static540.aClass126_21.method7009(Static489.aClass91_4);
	}
}
