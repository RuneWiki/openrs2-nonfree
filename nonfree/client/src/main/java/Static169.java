import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!fn", name = "N", descriptor = "I")
	public static final int anInt2625 = 0;

	@OriginalMember(owner = "client!fn", name = "K", descriptor = "Z")
	public static final boolean aBoolean182 = false;

	@OriginalMember(owner = "client!fn", name = "O", descriptor = "I")
	public static int anInt2629 = 0;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!ha;IB)Lclient!fia;")
	public static Class45 method2461(@OriginalArg(0) Class144 arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class14_Sub27 local16 = (Class14_Sub27) Static445.aClass125_30.method2630((long) arg1);
		if (local16 != null) {
			@Pc(23) Class14_Sub4_Sub4 local23 = local16.aClass147_Sub1_1.method5245();
			local16.aBoolean478 = true;
			if (local23 != null) {
				return local23.method9269(arg0);
			}
		}
		return null;
	}
}
