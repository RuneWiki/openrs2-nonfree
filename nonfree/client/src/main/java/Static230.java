import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!lq", name = "r", descriptor = "I")
	public static final int anInt3941 = 4096;

	@OriginalMember(owner = "client!lq", name = "T", descriptor = "I")
	public static final int anInt3945 = Static281.method3698(2200);

	@OriginalMember(owner = "client!lq", name = "Qb", descriptor = "I")
	public static final int anInt3953 = 4096;

	@OriginalMember(owner = "client!lq", name = "lc", descriptor = "I")
	public static int anInt3956 = 0;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!ji;[Lclient!lq;)Lclient!lq;")
	public static Class116_Sub2 method3149(@OriginalArg(0) Class135_Sub1 arg0, @OriginalArg(1) Class116_Sub2[] arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class116_Sub2 local3 = null;
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			if (arg1[local5] != null) {
				local1++;
				local3 = arg1[local5];
			}
		}
		if (local1 == 1) {
			return local3;
		} else {
			return new Class116_Sub2(arg0, arg1);
		}
	}
}
