import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!ge", name = "B", descriptor = "I")
	public static final int anInt2713 = Static220.method3458(2200);

	@OriginalMember(owner = "client!ge", name = "J", descriptor = "I")
	public static final int anInt2715 = 4096;

	@OriginalMember(owner = "client!ge", name = "Y", descriptor = "I")
	public static final int anInt2717 = 4096;

	@OriginalMember(owner = "client!ge", name = "pc", descriptor = "I")
	public static int anInt2726 = 0;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!cv;[Lclient!ge;)Lclient!ge;")
	public static Class91_Sub1 method2159(@OriginalArg(0) Class49_Sub1 arg0, @OriginalArg(1) Class91_Sub1[] arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class91_Sub1 local3 = null;
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			if (arg1[local5] != null) {
				local1++;
				local3 = arg1[local5];
			}
		}
		if (local1 == 1) {
			return local3;
		} else {
			return new Class91_Sub1(arg0, arg1);
		}
	}
}
