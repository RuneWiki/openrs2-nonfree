import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static191 {

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "[[B")
	public static byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "Lclient!bn;")
	public static Class24 aClass24_1;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "Lclient!um;")
	public static Class243 aClass243_108;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
	public static int anInt3184 = 0;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_80 = new Class129(24, 3);

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!l;Ljava/awt/Canvas;IB)Lclient!za;")
	public static Class200 method2564(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2) {
		return new Class200_Sub1(arg2, arg1, arg0);
	}
}
