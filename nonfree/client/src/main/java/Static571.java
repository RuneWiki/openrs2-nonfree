import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static571 {

	@OriginalMember(owner = "client!st", name = "f", descriptor = "Lclient!tka;")
	public static final Class344 aClass344_5 = new Class344();

	@OriginalMember(owner = "client!st", name = "c", descriptor = "I")
	public static final int anInt9156 = 1405;

	@OriginalMember(owner = "client!st", name = "g", descriptor = "[F")
	public static final float[] aFloatArray73 = new float[2];

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(BI[S[Ljava/lang/String;I)V")
	public static void method7992(@OriginalArg(1) int arg0, @OriginalArg(2) short[] arg1, @OriginalArg(3) String[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 <= arg3) {
			return;
		}
		@Pc(23) int local23 = (arg0 + arg3) / 2;
		@Pc(25) int local25 = arg3;
		@Pc(29) String local29 = arg2[local23];
		arg2[local23] = arg2[arg0];
		arg2[arg0] = local29;
		@Pc(43) short local43 = arg1[local23];
		arg1[local23] = arg1[arg0];
		arg1[arg0] = local43;
		for (@Pc(55) int local55 = arg3; local55 < arg0; local55++) {
			if (local29 == null || arg2[local55] != null && (local55 & 0x1) > arg2[local55].compareTo(local29)) {
				@Pc(82) String local82 = arg2[local55];
				arg2[local55] = arg2[local25];
				arg2[local25] = local82;
				@Pc(96) short local96 = arg1[local55];
				arg1[local55] = arg1[local25];
				arg1[local25++] = local96;
			}
		}
		arg2[arg0] = arg2[local25];
		arg2[local25] = local29;
		arg1[arg0] = arg1[local25];
		arg1[local25] = local43;
		method7992(local25 - 1, arg1, arg2, arg3);
		method7992(arg0, arg1, arg2, local25 + 1);
	}
}
