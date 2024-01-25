import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static429 {

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
	public static int anInt7484;

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "Lclient!he;")
	public static Class141 aClass141_2;

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "Lclient!uv;")
	public static Class344 aClass344_9 = null;

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "Lclient!ww;")
	public static final Class384 aClass384_57 = new Class384(0, 1);

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILclient!d;IILjava/awt/Canvas;)Lclient!ha;")
	public static Class82 method6536(@OriginalArg(0) int arg0, @OriginalArg(1) Interface5 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Canvas arg3) {
		return new oa(arg3, arg1, arg2, arg0);
	}
}
