import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!sm", name = "R", descriptor = "I")
	public static final int anInt6502 = 4096;

	@OriginalMember(owner = "client!sm", name = "fb", descriptor = "I")
	public static final int anInt6505 = 4096;

	@OriginalMember(owner = "client!sm", name = "bc", descriptor = "I")
	public static int anInt6512 = 0;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!lg;[Lclient!sm;)Lclient!sm;")
	public static Class224_Sub1 method5485(@OriginalArg(0) Class66_Sub1 arg0, @OriginalArg(1) Class224_Sub1[] arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class224_Sub1 local3 = null;
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			if (arg1[local5] != null) {
				local1++;
				local3 = arg1[local5];
			}
		}
		if (local1 == 1) {
			return local3;
		} else {
			return new Class224_Sub1(arg0, arg1);
		}
	}
}
