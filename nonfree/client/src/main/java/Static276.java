import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!nr", name = "t", descriptor = "I")
	public static int anInt5105;

	@OriginalMember(owner = "client!nr", name = "u", descriptor = "[[[Lclient!iq;")
	public static Class118[][][] aClass118ArrayArrayArray3;

	@OriginalMember(owner = "client!nr", name = "o", descriptor = "[I")
	public static final int[] anIntArray343 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!nr", name = "p", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_77 = new Class217(35, -1);

	@OriginalMember(owner = "client!nr", name = "r", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_109 = new Class119(101, -1);

	@OriginalMember(owner = "client!nr", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString46 = "";

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(FII[FIIIFIII)V")
	public static void method3915(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg8 - arg5;
		@Pc(9) int local9 = arg3 - arg4;
		@Pc(13) int local13 = arg9 - arg1;
		@Pc(38) float local38 = arg2[1] * (float) local13 + arg2[0] * (float) local9 + (float) local5 * arg2[2];
		@Pc(59) float local59 = arg2[3] * (float) local9 + arg2[4] * (float) local13 + (float) local5 * arg2[5];
		@Pc(80) float local80 = arg2[8] * (float) local5 + (float) local9 * arg2[6] + arg2[7] * (float) local13;
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg6 != 1.0F) {
			local91 *= arg6;
		}
		@Pc(105) float local105 = local59 + arg0 + 0.5F;
		@Pc(110) float local110;
		if (arg7 == 1) {
			local110 = local91;
			local91 = -local105;
			local105 = local110;
		} else if (arg7 == 2) {
			local105 = -local105;
			local91 = -local91;
		} else if (arg7 == 3) {
			local110 = local91;
			local91 = local105;
			local105 = -local110;
		}
		Static119.aFloat18 = local91;
		Static286.aFloat7 = local105;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method3917(@OriginalArg(1) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
			local8 = local8.substring(0, local13) + "," + local8.substring(local13);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static1.aClass189_1.method4262(Static53.anInt1454) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static288.aClass189_167.method4262(Static53.anInt1454) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}
}
