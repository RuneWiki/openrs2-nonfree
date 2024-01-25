import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!ht", name = "Bb", descriptor = "I")
	public static int anInt3269 = 0;

	@OriginalMember(owner = "client!ht", name = "Db", descriptor = "I")
	public static int anInt3271 = 0;

	@OriginalMember(owner = "client!ht", name = "Eb", descriptor = "[I")
	public static final int[] anIntArray206 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!ht", name = "Fb", descriptor = "[I")
	public static final int[] anIntArray207 = new int[8];

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lclient!qf;IIIII)V")
	public static void method2646(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt1154 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) long local16 = Static24.aLongArrayArrayArray1[arg1][local4][local7];
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
						@Pc(35) Class191 local35 = Static375.aClass191Array2[local27 - 1];
						for (@Pc(37) int local37 = 0; local37 < arg0.anInt1154; local37++) {
							if (arg0.aClass3_Sub8Array2[local37] == local35.aClass3_Sub8_2) {
								local18 += 16L;
								continue label49;
							}
						}
						arg0.aClass3_Sub8Array2[arg0.anInt1154++] = local35.aClass3_Sub8_2;
						if (arg0.anInt1154 == 4) {
							break label56;
						}
						local18 += 16L;
					}
				}
			}
		}
		for (local7 = arg0.anInt1154; local7 < 4; local7++) {
			arg0.aClass3_Sub8Array2[local7] = null;
		}
	}

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "(IZ)V")
	public static void method2647(@OriginalArg(0) int arg0) {
		Static339.anInt5767 = -1;
		Static76.anInt1937 = arg0;
		Static339.anInt5767 = -1;
		Static197.method3120();
	}
}
