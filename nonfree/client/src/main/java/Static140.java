import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!gp", name = "k", descriptor = "Lclient!gn;")
	public static final Class94 aClass94_2 = new Class94(14, -1);

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)V")
	public static void method793() {
		Static355.anInt3620 = -1;
		Static214.aClass11_9 = null;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIBI)I")
	public static int method798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return arg0;
		} else if (local7 == 2) {
			return 1023 - arg1;
		} else {
			return 1023 - arg0;
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Ljava/awt/Canvas;BLclient!ga;Lclient!ec;I)Lclient!ya;")
	public static Class51 method800(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Interface4 arg1, @OriginalArg(3) Class61 arg2, @OriginalArg(4) int arg3) {
		return new qa(arg3, arg0, arg1, arg2);
	}
}
