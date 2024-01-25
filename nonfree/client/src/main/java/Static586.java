import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static586 {

	@OriginalMember(owner = "client!tr", name = "h", descriptor = "I")
	public static int anInt9278;

	@OriginalMember(owner = "client!tr", name = "r", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_134 = new Class376(1, -1);

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void method7871(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		Static224.method3479(-1, arg0, arg1, -1);
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method7872(@OriginalArg(1) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = local10 + ": ";
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = local8[local10] + arg0[local10];
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIIIII)V")
	public static void method7874(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static74.anInt1691 = arg4;
		Static573.anInt9122 = arg2;
		Static315.anInt5889 = arg3;
		Static540.anInt7334 = arg0;
		Static404.anInt6910 = arg5;
		Static491.anInt9937 = arg1;
	}
}
