import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!gi", name = "D", descriptor = "Z")
	public static boolean aBoolean156;

	@OriginalMember(owner = "client!gi", name = "E", descriptor = "[I")
	public static int[] anIntArray170;

	@OriginalMember(owner = "client!gi", name = "F", descriptor = "I")
	public static int anInt2305 = 0;

	@OriginalMember(owner = "client!gi", name = "G", descriptor = "I")
	public static int anInt2306 = 0;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!uk;IIIII)V")
	public static void method2221(@OriginalArg(0) Class172 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt5183 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) long local16 = Static275.aLongArrayArrayArray1[arg1][local4][local7];
				@Pc(18) long local18 = 0L;
				while (true) {
					label49: while (true) {
						if (local18 > 48L) {
							continue label54;
						}
						@Pc(27) int local27 = (int) (local16 >>> (int) local18 & 0xFFFFL);
						if (local27 <= 0) {
							continue label54;
						}
						@Pc(35) Class1_Sub5_Sub1 local35 = Static13.aClass1_Sub5_Sub1Array1[local27 - 1];
						for (@Pc(37) int local37 = 0; local37 < arg0.anInt5183; local37++) {
							if (arg0.aClass1_Sub5_Sub1Array3[local37] == local35) {
								local18 += 16L;
								continue label49;
							}
						}
						arg0.aClass1_Sub5_Sub1Array3[arg0.anInt5183++] = local35;
						if (arg0.anInt5183 == 4) {
							break label56;
						}
						local18 += 16L;
					}
				}
			}
		}
		for (local7 = arg0.anInt5183; local7 < 4; local7++) {
			arg0.aClass1_Sub5_Sub1Array3[local7] = null;
		}
	}
}
