import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static652 {

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
	public static int anInt10283;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(JIB)Lclient!jca;")
	public static Class4_Sub5_Sub11 method8695(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class4_Sub5_Sub11 local14 = (Class4_Sub5_Sub11) Static69.aClass66_9.method1994(arg0 | (long) arg1 << 56);
		if (local14 == null) {
			local14 = new Class4_Sub5_Sub11(arg1, arg0);
			Static69.aClass66_9.method1985(local14, local14.aLong307);
		}
		return local14;
	}
}
