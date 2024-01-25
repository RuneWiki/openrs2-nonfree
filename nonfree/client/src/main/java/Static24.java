import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!ar", name = "j", descriptor = "[[B")
	public static byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!ar", name = "m", descriptor = "Lclient!pha;")
	public static final Class276 aClass276_1 = new Class276("", 17);

	@OriginalMember(owner = "client!ar", name = "o", descriptor = "I")
	public static int anInt440 = 0;

	@OriginalMember(owner = "client!ar", name = "r", descriptor = "I")
	public static int anInt443 = -50;

	@OriginalMember(owner = "client!ar", name = "t", descriptor = "Z")
	public static boolean aBoolean32 = true;

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(II[II[I)V")
	public static void method458(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg2 <= arg0) {
			return;
		}
		@Pc(19) int local19 = (arg0 + arg2) / 2;
		@Pc(21) int local21 = arg0;
		@Pc(25) int local25 = arg1[local19];
		arg1[local19] = arg1[arg2];
		arg1[arg2] = local25;
		@Pc(39) int local39 = arg3[local19];
		arg3[local19] = arg3[arg2];
		arg3[arg2] = local39;
		@Pc(58) int local58 = ~local25 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(60) int local60 = arg0; local60 < arg2; local60++) {
			if ((local60 & local58) + local25 > arg1[local60]) {
				@Pc(75) int local75 = arg1[local60];
				arg1[local60] = arg1[local21];
				arg1[local21] = local75;
				@Pc(89) int local89 = arg3[local60];
				arg3[local60] = arg3[local21];
				arg3[local21++] = local89;
			}
		}
		arg1[arg2] = arg1[local21];
		arg1[local21] = local25;
		arg3[arg2] = arg3[local21];
		arg3[local21] = local39;
		method458(arg0, arg1, local21 - 1, arg3);
		method458(local21 + 1, arg1, arg2, arg3);
	}
}
