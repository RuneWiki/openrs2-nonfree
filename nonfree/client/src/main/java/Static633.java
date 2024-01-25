import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static633 {

	@OriginalMember(owner = "client!wm", name = "j", descriptor = "[I")
	public static int[] anIntArray593;

	@OriginalMember(owner = "client!wm", name = "n", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_116 = new Class257(36, 0);

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)V")
	public static void method8186() {
		Static157.method3178();
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IZILclient!d;Ljava/awt/Canvas;)Lclient!ha;")
	public static Class16 method8187(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface2 arg2, @OriginalArg(4) Canvas arg3) {
		return new oa(arg3, arg2, arg0, arg1);
	}
}
