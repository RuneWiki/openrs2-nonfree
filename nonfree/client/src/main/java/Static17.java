import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!aia", name = "m", descriptor = "[I")
	public static int[] anIntArray9;

	@OriginalMember(owner = "client!aia", name = "r", descriptor = "Lclient!lk;")
	public static Class194 aClass194_1;

	@OriginalMember(owner = "client!aia", name = "o", descriptor = "Z")
	public static boolean aBoolean8 = false;

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(III)V")
	public static void method309(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class6_Sub2_Sub9 local14 = Static144.method2332(16, arg0);
		local14.method3723();
		local14.anInt4294 = arg1;
	}
}
