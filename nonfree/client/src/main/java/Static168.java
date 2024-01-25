import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "[I")
	public static final int[] anIntArray379 = new int[16];

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_72 = new Class133(34, 8);

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "I")
	public static int anInt3862 = 0;

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZI)V")
	public static void method3213(@OriginalArg(1) int arg0) {
		@Pc(13) Class3_Sub10_Sub16 local13 = Static362.method5701(arg0, 12);
		local13.method6212();
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(BII)Z")
	public static boolean method3214(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}
}
