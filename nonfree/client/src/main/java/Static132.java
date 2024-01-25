import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "Lclient!qa;")
	public static Class167 aClass167_4;

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "[I")
	public static final int[] anIntArray121 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)V")
	public static void method2043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub3_Sub4 local8 = Static281.method3883(7, arg0);
		local8.method1003();
		local8.anInt972 = arg1;
	}
}
