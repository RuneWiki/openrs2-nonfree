import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!fe", name = "qb", descriptor = "F")
	public static float aFloat83;

	@OriginalMember(owner = "client!fe", name = "sb", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas5;

	@OriginalMember(owner = "client!fe", name = "K", descriptor = "Lclient!nt;")
	public static final Class238 aClass238_25 = new Class238();

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(FFFFFIBF)F")
	public static float method2817(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(7) float arg6) {
		@Pc(7) float local7 = 0.0F;
		@Pc(12) float local12 = arg4 - arg3;
		@Pc(16) float local16 = arg1 - arg6;
		@Pc(21) float local21 = arg2 - arg0;
		@Pc(23) float local23 = 0.0F;
		@Pc(25) float local25 = 0.0F;
		@Pc(27) float local27 = 0.0F;
		while (local7 < 1.1F) {
			@Pc(43) float local43 = local12 * local7 + arg3;
			@Pc(49) float local49 = arg6 + local7 * local16;
			@Pc(55) float local55 = local7 * local21 + arg0;
			@Pc(60) int local60 = (int) local43 >> 9;
			@Pc(65) int local65 = (int) local55 >> 9;
			if (local60 > 0 && local65 > 0 && Static3.anInt46 > local60 && local65 < Static270.anInt5194) {
				@Pc(81) int local81 = Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aByte124;
				if (local81 < 3 && (Static244.aByteArrayArrayArray9[1][local60][local65] & 0x2) != 0) {
					local81++;
				}
				@Pc(107) int local107 = Static178.aClass112Array2[local81].method7826((int) local43, (int) local55);
				if ((float) local107 < local49) {
					if (arg5 >= 2) {
						return local7 + method2817(local27, local49, local55, local23, local43, arg5 + -1, local25) * 0.1F - 0.1F;
					}
					return local7;
				}
			}
			local27 = local55;
			local7 += 0.1F;
			local23 = local43;
			local25 = local49;
		}
		return -1.0F;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIII)V")
	public static void method2818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static471.anInt8086 = arg3;
		Static507.anInt8552 = arg2;
		Static594.anInt9789 = arg4;
		Static382.anInt6846 = arg5;
		Static519.anInt8687 = arg0;
		Static416.anInt7584 = arg1;
	}
}
