import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static635 {

	@OriginalMember(owner = "client!wm", name = "u", descriptor = "I")
	public static int anInt10140;

	@OriginalMember(owner = "client!wm", name = "p", descriptor = "Lclient!hr;")
	public static final Class146 aClass146_11 = new Class146(6, 1);

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ljava/awt/Canvas;Lclient!d;III)Lclient!ha;")
	public static Class5 method8696(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface7 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class5_Sub3(arg0, arg1, arg2, arg3);
	}
}
