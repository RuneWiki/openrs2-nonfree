import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "Lclient!f;")
	public static Class88 aClass88_18;

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "[I")
	public static int[] anIntArray359;

	@OriginalMember(owner = "client!mv", name = "e", descriptor = "I")
	public static int anInt6492;

	@OriginalMember(owner = "client!mv", name = "d", descriptor = "Z")
	public static boolean aBoolean442 = false;

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "([Ljava/lang/Object;BII[J)V")
	public static void method5139(@OriginalArg(0) Object[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long[] arg3) {
		if (arg1 <= arg2) {
			return;
		}
		@Pc(19) int local19 = (arg1 + arg2) / 2;
		@Pc(21) int local21 = arg2;
		@Pc(25) long local25 = arg3[local19];
		arg3[local19] = arg3[arg1];
		arg3[arg1] = local25;
		@Pc(39) Object local39 = arg0[local19];
		arg0[local19] = arg0[arg1];
		arg0[arg1] = local39;
		@Pc(59) int local59 = ~local25 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(61) int local61 = arg2; local61 < arg1; local61++) {
			if ((long) (local61 & local59) + local25 > arg3[local61]) {
				@Pc(82) long local82 = arg3[local61];
				arg3[local61] = arg3[local21];
				arg3[local21] = local82;
				@Pc(96) Object local96 = arg0[local61];
				arg0[local61] = arg0[local21];
				arg0[local21++] = local96;
			}
		}
		arg3[arg1] = arg3[local21];
		arg3[local21] = local25;
		arg0[arg1] = arg0[local21];
		arg0[local21] = local39;
		method5139(arg0, local21 - 1, arg2, arg3);
		method5139(arg0, arg1, local21 + 1, arg3);
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(B)I")
	public static int method5140() {
		return Static390.anInt7652++;
	}
}
