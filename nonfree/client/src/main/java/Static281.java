import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
	public static int anInt5587;

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "Lclient!bj;")
	public static final Class26 aClass26_51 = new Class26(5);

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "[I")
	public static final int[] anIntArray428 = new int[25];

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/awt/Component;I)Lclient!np;")
	public static Class143 method4704(@OriginalArg(0) Component arg0) {
		return new Class143_Sub1(arg0);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)V")
	public static void method4706(@OriginalArg(1) int arg0) {
		@Pc(8) Class11_Sub4_Sub12 local8 = Static35.method512(5, arg0);
		local8.method3864();
	}
}
