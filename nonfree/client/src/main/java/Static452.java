import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!wk", name = "K", descriptor = "Z")
	private static boolean aBoolean51;

	@OriginalMember(owner = "client!wk", name = "L", descriptor = "I")
	private static int anInt953;

	@OriginalMember(owner = "client!wk", name = "M", descriptor = "I")
	private static int anInt954;

	@OriginalMember(owner = "client!wk", name = "N", descriptor = "Z")
	private static boolean aBoolean52;

	@OriginalMember(owner = "client!wk", name = "h", descriptor = "Lclient!of;")
	public static final Class188 aClass188_10 = new Class188(8);

	@OriginalMember(owner = "client!wk", name = "I", descriptor = "I")
	public static int anInt951 = 0;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!i;III[Z)Z")
	public static boolean method844(@OriginalArg(0) Class2_Sub1_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static241.aClass22Array3 != Static46.aClass22Array1) {
			@Pc(11) int local11 = Static114.aClass22Array2[arg1].ca(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class22 local18 = Static114.aClass22Array2[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.ca(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method2323(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.H(arg0, arg2, local27, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!wk", name = "providesignlink", descriptor = "(Lclient!pb;)V")
	private static void method845(@OriginalArg(0) Class194 arg0) {
		Static138.aClass194_2 = arg0;
		Static243.aClass194_4 = arg0;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)V")
	public static void method847(@OriginalArg(0) int arg0) {
		Static37.anInt611 = 100;
		Static377.anInt6587 = -1;
		Static340.anInt6086 = 3;
		Static139.anInt2570 = arg0;
	}
}
