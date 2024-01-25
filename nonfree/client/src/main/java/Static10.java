import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!ah", name = "g", descriptor = "Lclient!rw;")
	public static final Class284 aClass284_2 = new Class284(16);

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIII)Z")
	public static boolean method2062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Interface6 local9 = (Interface6) Static120.method1814(arg0, arg2, arg1);
		@Pc(16) boolean local16 = true;
		if (local9 != null) {
			local16 = Static91.method5095(local9) & true;
		}
		local9 = (Interface6) Static134.method1995(arg0, arg2, arg1, dda.class);
		if (local9 != null) {
			local16 &= Static91.method5095(local9);
		}
		local9 = (Interface6) Static315.method4904(arg0, arg2, arg1);
		if (local9 != null) {
			local16 &= Static91.method5095(local9);
		}
		return local16;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!ve;")
	public static RuntimeException_Sub1 method2064(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString116 = local9.aString116 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}
}
