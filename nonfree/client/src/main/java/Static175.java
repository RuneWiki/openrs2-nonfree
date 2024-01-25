import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!il", name = "m", descriptor = "I")
	public static final int anInt3274 = 4096;

	@OriginalMember(owner = "client!il", name = "mb", descriptor = "I")
	public static final int anInt3281 = Static263.method5521(2200);

	@OriginalMember(owner = "client!il", name = "zb", descriptor = "I")
	public static final int anInt3283 = 4096;

	@OriginalMember(owner = "client!il", name = "lc", descriptor = "I")
	public static int anInt3288 = 0;

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lclient!vq;[Lclient!il;)Lclient!il;")
	public static Class108_Sub1 method2824(@OriginalArg(0) Class167_Sub2 arg0, @OriginalArg(1) Class108_Sub1[] arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class108_Sub1 local3 = null;
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			if (arg1[local5] != null) {
				local1++;
				local3 = arg1[local5];
			}
		}
		if (local1 == 1) {
			return local3;
		} else {
			return new Class108_Sub1(arg0, arg1);
		}
	}
}
