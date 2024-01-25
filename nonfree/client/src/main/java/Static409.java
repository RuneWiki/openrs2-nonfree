import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_121 = new Class45(108, 20);

	@OriginalMember(owner = "client!qq", name = "k", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_222 = new Class88(" ", ": ", " ", " ");

	@OriginalMember(owner = "client!qq", name = "l", descriptor = "I")
	public static int anInt7683 = 0;

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(II[JI[Ljava/lang/Object;)V")
	public static void method6395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long[] arg2, @OriginalArg(4) Object[] arg3) {
		if (arg1 <= arg0) {
			return;
		}
		@Pc(14) int local14 = (arg0 + arg1) / 2;
		@Pc(16) int local16 = arg0;
		@Pc(20) long local20 = arg2[local14];
		arg2[local14] = arg2[arg1];
		arg2[arg1] = local20;
		@Pc(34) Object local34 = arg3[local14];
		arg3[local14] = arg3[arg1];
		arg3[arg1] = local34;
		@Pc(52) int local52 = local20 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(54) int local54 = arg0; local54 < arg1; local54++) {
			if (arg2[local54] < local20 + (long) (local52 & local54)) {
				@Pc(72) long local72 = arg2[local54];
				arg2[local54] = arg2[local16];
				arg2[local16] = local72;
				@Pc(86) Object local86 = arg3[local54];
				arg3[local54] = arg3[local16];
				arg3[local16++] = local86;
			}
		}
		arg2[arg1] = arg2[local16];
		arg2[local16] = local20;
		arg3[arg1] = arg3[local16];
		arg3[local16] = local34;
		method6395(arg0, local16 - 1, arg2, arg3);
		method6395(local16 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(B)Lclient!kf;")
	public static Class23_Sub1 method6397() {
		return Static37.anInt7514 < Static197.aClass23_Sub1Array1.length ? Static197.aClass23_Sub1Array1[Static37.anInt7514++] : null;
	}
}
