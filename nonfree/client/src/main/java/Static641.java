import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static641 {

	@OriginalMember(owner = "client!vl", name = "f", descriptor = "Lclient!jw;")
	public static Class180 aClass180_205;

	@OriginalMember(owner = "client!vl", name = "g", descriptor = "Lclient!aj;")
	public static Class15 aClass15_159;

	@OriginalMember(owner = "client!vl", name = "m", descriptor = "I")
	public static int anInt10179 = 0;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method8909(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local10 = Static265.method4367(arg0.charAt(local17)) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)V")
	public static void method8916(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		if (arg2.length() > 320 || !Static524.method7315()) {
			return;
		}
		Static370.method5390();
		Static492.aString90 = arg0;
		Static506.aString86 = arg2;
		Static41.anInt961 = arg1;
		Static553.method7892(6);
	}
}
