import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!f", name = "d", descriptor = "[Lclient!pg;")
	public static Class157_Sub1[] aClass157_Sub1Array7;

	@OriginalMember(owner = "client!f", name = "e", descriptor = "[Lclient!sg;")
	public static Class97[] aClass97Array24;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "[I")
	public static final int[] anIntArray443 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!f", name = "c", descriptor = "I")
	public static int anInt5684 = 0;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILclient!nq;II)Lclient!gi;")
	public static Class11_Sub4_Sub7 method4779(@OriginalArg(0) int arg0, @OriginalArg(1) Class144 arg1, @OriginalArg(2) int arg2) {
		@Pc(14) Class11_Sub25 local14 = new Class11_Sub25(arg1.method3896(arg2, arg0));
		@Pc(45) Class11_Sub4_Sub7 local45 = new Class11_Sub4_Sub7(arg2, local14.method5184(), local14.method5184(), local14.method5198(), local14.method5198(), local14.method5185() == 1, local14.method5185(), local14.method5185());
		@Pc(49) int local49 = local14.method5185();
		for (@Pc(51) int local51 = 0; local51 < local49; local51++) {
			local45.aClass16_18.method190(new Class11_Sub28(local14.method5185(), local14.method5187(), local14.method5187(), local14.method5187(), local14.method5187(), local14.method5187(), local14.method5187(), local14.method5187(), local14.method5187()));
		}
		local45.method1591();
		return local45;
	}
}
