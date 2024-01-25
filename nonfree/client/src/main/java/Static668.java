import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static668 {

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "Lclient!ls;")
	public static Class222 aClass222_8;

	@OriginalMember(owner = "client!wm", name = "k", descriptor = "I")
	public static int anInt11106;

	@OriginalMember(owner = "client!wm", name = "g", descriptor = "F")
	public static float aFloat270 = 0.25F;

	@OriginalMember(owner = "client!wm", name = "p", descriptor = "I")
	public static int anInt11111 = 0;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)I")
	public static int method9242(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(III)V")
	public static void method9244(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class14_Sub3_Sub9 local10 = Static142.method2219(0L, 15);
		local10.method2817();
		local10.anInt3413 = arg1;
		local10.anInt3419 = arg0;
	}
}
