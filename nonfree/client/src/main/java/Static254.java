import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!me", name = "L", descriptor = "I")
	public static final int anInt4121 = 4096;

	@OriginalMember(owner = "client!me", name = "Fb", descriptor = "I")
	public static final int anInt4125 = 4096;

	@OriginalMember(owner = "client!me", name = "cc", descriptor = "I")
	public static final int anInt4128 = Static160.method2271(2200);

	@OriginalMember(owner = "client!me", name = "kc", descriptor = "I")
	public static int anInt4132 = 0;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!qf;[Lclient!me;)Lclient!me;")
	public static Class57_Sub1 method3266(@OriginalArg(0) Class200_Sub1 arg0, @OriginalArg(1) Class57_Sub1[] arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class57_Sub1 local3 = null;
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			if (arg1[local5] != null) {
				local1++;
				local3 = arg1[local5];
			}
		}
		if (local1 == 1) {
			return local3;
		} else {
			return new Class57_Sub1(arg0, arg1);
		}
	}
}
