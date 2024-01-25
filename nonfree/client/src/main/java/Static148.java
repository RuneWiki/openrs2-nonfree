import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!hi", name = "O", descriptor = "I")
	public static final int anInt2820 = 4096;

	@OriginalMember(owner = "client!hi", name = "T", descriptor = "I")
	public static final int anInt2821 = 4096;

	@OriginalMember(owner = "client!hi", name = "dc", descriptor = "I")
	public static final int anInt2829 = Static51.method1041(2200);

	@OriginalMember(owner = "client!hi", name = "ic", descriptor = "I")
	public static int anInt2830 = 0;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!rh;[Lclient!hi;)Lclient!hi;")
	public static Class7_Sub2 method2224(@OriginalArg(0) Class30_Sub2 arg0, @OriginalArg(1) Class7_Sub2[] arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class7_Sub2 local3 = null;
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			if (arg1[local5] != null) {
				local1++;
				local3 = arg1[local5];
			}
		}
		if (local1 == 1) {
			return local3;
		} else {
			return new Class7_Sub2(arg0, arg1);
		}
	}
}
