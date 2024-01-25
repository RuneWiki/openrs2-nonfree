import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
	public static int anInt3742;

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "Z")
	public static boolean aBoolean270;

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
	public static int anInt3744 = -1;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZIIII)V")
	public static void method3048(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static57.anInt1083 = arg0;
		Static86.anInt1584 = arg1;
		Static506.anInt8778 = arg3;
		Static321.anInt5862 = arg2;
		Static157.anInt2976 = arg4;
		if (Static321.anInt5862 >= 100) {
			@Pc(29) int local29 = Static506.anInt8778 * 512 + 256;
			@Pc(35) int local35 = Static57.anInt1083 * 512 + 256;
			@Pc(43) int local43 = Static538.method6114(Static240.anInt4414, local35, local29) - Static157.anInt2976;
			@Pc(48) int local48 = local29 - Static393.anInt6978;
			@Pc(53) int local53 = local43 - Static20.anInt542;
			@Pc(58) int local58 = local35 - Static78.anInt1534;
			@Pc(69) int local69 = (int) Math.sqrt((double) (local48 * local48 + local58 * local58));
			Static428.anInt7673 = (int) (Math.atan2((double) local53, (double) local69) * 2607.5945876176133D) & 0x3FFF;
			Static175.anInt3256 = (int) (-2607.5945876176133D * Math.atan2((double) local48, (double) local58)) & 0x3FFF;
			if (Static428.anInt7673 < 1024) {
				Static428.anInt7673 = 1024;
			}
			Static76.anInt6369 = 0;
			if (Static428.anInt7673 > 3072) {
				Static428.anInt7673 = 3072;
			}
		}
		Static358.anInt9363 = 2;
		Static434.anInt7761 = -1;
		Static469.anInt8080 = -1;
	}
}
