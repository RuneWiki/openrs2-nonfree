import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static220 {

	@OriginalMember(owner = "client!hk", name = "t", descriptor = "[I")
	public static int[] anIntArray211;

	@OriginalMember(owner = "client!hk", name = "q", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_143 = new Class179(108, -2);

	@OriginalMember(owner = "client!hk", name = "s", descriptor = "I")
	public static int anInt3743 = -1;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IILjava/awt/Canvas;Lclient!d;)Lclient!ha;")
	public static Class132 method3200(@OriginalArg(1) int arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) Interface6 arg2) {
		return new Class132_Sub3(arg1, arg2, arg0);
	}
}
