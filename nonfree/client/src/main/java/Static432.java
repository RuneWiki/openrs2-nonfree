import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!vp", name = "X", descriptor = "I")
	public static final int anInt7342 = Static345.method4948(2200);

	@OriginalMember(owner = "client!vp", name = "Sb", descriptor = "I")
	public static final int anInt7349 = 4096;

	@OriginalMember(owner = "client!vp", name = "Ub", descriptor = "I")
	public static final int anInt7350 = 4096;

	@OriginalMember(owner = "client!vp", name = "lc", descriptor = "I")
	public static int anInt7352 = 0;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!fe;[Lclient!vp;)Lclient!vp;")
	public static Class31_Sub2 method5738(@OriginalArg(0) Class75_Sub1 arg0, @OriginalArg(1) Class31_Sub2[] arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class31_Sub2 local3 = null;
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			if (arg1[local5] != null) {
				local1++;
				local3 = arg1[local5];
			}
		}
		if (local1 == 1) {
			return local3;
		} else {
			return new Class31_Sub2(arg0, arg1);
		}
	}
}
