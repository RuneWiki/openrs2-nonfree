import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!fs", name = "O", descriptor = "I")
	public static final int anInt2526 = 4096;

	@OriginalMember(owner = "client!fs", name = "Bb", descriptor = "I")
	public static final int anInt2532 = 4096;

	@OriginalMember(owner = "client!fs", name = "Hb", descriptor = "I")
	public static final int anInt2533 = Static365.method2559(2200);

	@OriginalMember(owner = "client!fs", name = "rc", descriptor = "I")
	public static int anInt2536 = 0;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lclient!sr;[Lclient!fs;)Lclient!fs;")
	public static Class63_Sub1 method2145(@OriginalArg(0) Class50_Sub2 arg0, @OriginalArg(1) Class63_Sub1[] arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class63_Sub1 local3 = null;
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			if (arg1[local5] != null) {
				local1++;
				local3 = arg1[local5];
			}
		}
		if (local1 == 1) {
			return local3;
		} else {
			return new Class63_Sub1(arg0, arg1);
		}
	}
}
