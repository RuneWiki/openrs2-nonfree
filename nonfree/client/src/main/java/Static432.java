import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!vp", name = "vb", descriptor = "I")
	public static final int anInt7004 = 4096;

	@OriginalMember(owner = "client!vp", name = "Eb", descriptor = "I")
	public static final int anInt7005 = Static43.method647(2200);

	@OriginalMember(owner = "client!vp", name = "Rb", descriptor = "I")
	public static final int anInt7007 = 4096;

	@OriginalMember(owner = "client!vp", name = "lc", descriptor = "I")
	public static int anInt7008 = 0;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!ms;[Lclient!vp;)Lclient!vp;")
	public static Class59_Sub2 method5448(@OriginalArg(0) Class163_Sub1 arg0, @OriginalArg(1) Class59_Sub2[] arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class59_Sub2 local3 = null;
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			if (arg1[local5] != null) {
				local1++;
				local3 = arg1[local5];
			}
		}
		if (local1 == 1) {
			return local3;
		} else {
			return new Class59_Sub2(arg0, arg1);
		}
	}
}
