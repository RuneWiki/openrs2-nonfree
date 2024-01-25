import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static520 {

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "F")
	public static float aFloat189;

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "I")
	public static int anInt9345;

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)V")
	public static void method7734(@OriginalArg(1) int arg0) {
		@Pc(10) Class12_Sub4_Sub1 local10 = Static389.method6156(10, arg0);
		local10.method823();
	}
}
