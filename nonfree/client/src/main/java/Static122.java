import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!ge", name = "eb", descriptor = "I")
	public static final int anInt2324 = 4096;

	@OriginalMember(owner = "client!ge", name = "ec", descriptor = "I")
	public static final int anInt2328 = Static113.method1791(2200);

	@OriginalMember(owner = "client!ge", name = "gc", descriptor = "I")
	public static final int anInt2329 = 4096;

	@OriginalMember(owner = "client!ge", name = "oc", descriptor = "I")
	public static int anInt2331 = 0;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!in;[Lclient!ge;)Lclient!ge;")
	public static Class37_Sub1 method1911(@OriginalArg(0) Class121_Sub1 arg0, @OriginalArg(1) Class37_Sub1[] arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class37_Sub1 local3 = null;
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			if (arg1[local5] != null) {
				local1++;
				local3 = arg1[local5];
			}
		}
		if (local1 == 1) {
			return local3;
		} else {
			return new Class37_Sub1(arg0, arg1);
		}
	}
}
