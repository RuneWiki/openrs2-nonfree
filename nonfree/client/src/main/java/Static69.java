import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
	public static int anInt1062;

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "Lclient!kia;")
	public static final Class206 aClass206_1 = new Class206(14, 5);

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
	public static int anInt1060 = 0;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II[I[JZ)V")
	public static void method852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) long[] arg3) {
		if (arg1 <= arg0) {
			return;
		}
		@Pc(23) int local23 = (arg1 + arg0) / 2;
		@Pc(25) int local25 = arg0;
		@Pc(29) long local29 = arg3[local23];
		arg3[local23] = arg3[arg1];
		arg3[arg1] = local29;
		@Pc(43) int local43 = arg2[local23];
		arg2[local23] = arg2[arg1];
		arg2[arg1] = local43;
		@Pc(62) int local62 = local29 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(64) int local64 = arg0; local64 < arg1; local64++) {
			if (local29 + (long) (local62 & local64) > arg3[local64]) {
				@Pc(84) long local84 = arg3[local64];
				arg3[local64] = arg3[local25];
				arg3[local25] = local84;
				@Pc(98) int local98 = arg2[local64];
				arg2[local64] = arg2[local25];
				arg2[local25++] = local98;
			}
		}
		arg3[arg1] = arg3[local25];
		arg3[local25] = local29;
		arg2[arg1] = arg2[local25];
		arg2[local25] = local43;
		method852(arg0, local25 - 1, arg2, arg3);
		method852(local25 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!av;III)V")
	public static void method855(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static435.anInt7611 = arg1;
		Static122.aClass20_18 = arg0;
		Static9.anInt137 = arg2;
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)V")
	public static void method856() {
		Static337.aClass338_29.method8051();
		Static682.aClass338_62.method8051();
		Static594.aClass338_56.method8051();
		Static504.aClass338_42.method8051();
	}
}
