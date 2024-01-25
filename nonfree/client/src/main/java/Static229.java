import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
	public static int anInt3812 = 0;

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
	public static int anInt3813 = -1;

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
	public static int anInt3814 = 0;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)Lclient!ej;")
	public static Class11_Sub4 method3108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class36 local7 = Static175.aClass36ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class11_Sub4 local14 = local7.aClass11_Sub4_1;
			local7.aClass11_Sub4_1 = null;
			return local14;
		}
	}
}
