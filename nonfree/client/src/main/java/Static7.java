import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ada", name = "p", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray2;

	@OriginalMember(owner = "client!ada", name = "x", descriptor = "[I")
	public static int[] anIntArray5;

	@OriginalMember(owner = "client!ada", name = "v", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray3 = new String[100];

	@OriginalMember(owner = "client!ada", name = "y", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_2 = new Class274(28, -2);

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(IIIII)V")
	public static void method127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(5) int local5 = 0; local5 < Static320.anInt5804; local5++) {
			@Pc(10) Rectangle local10 = Class2_Sub5_Sub21.aRectangleArray2[local5];
			if (arg3 < local10.x + local10.width && arg3 + arg1 > local10.x && arg2 < local10.height + local10.y && local10.y < arg2 + arg0) {
				Static473.aBooleanArray43[local5] = true;
			}
		}
		Static233.method3884(arg2 + arg0, arg2, arg3, arg1 + arg3);
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(IILclient!ha;)V")
	public static void method128(@OriginalArg(0) int arg0, @OriginalArg(2) Class87 arg1) {
		if (!Static417.aBoolean571 || !Static253.aBoolean399) {
			Static612.anInt9984 = 0;
			return;
		}
		if (Static551.aBoolean668) {
			Static557.aLong251 = Static284.aClass13_33.method4548();
		}
		Static451.anInt7925 = 0;
		Static120.anInt5454 = 0;
		Static33.anInt861 = 0;
		@Pc(25) int[] local25 = arg1.Y();
		Static48.anInt1059 = (int) ((float) local25[3] / 3.0F);
		Static509.anInt8574 = (int) ((float) local25[2] / 3.0F);
		arg1.method7887(Static407.anIntArray503);
		if (Static64.anInt1374 != (int) ((float) Static407.anIntArray503[0] / 3.0F) || Static16.anInt299 != (int) ((float) Static407.anIntArray503[1] / 3.0F)) {
			Static64.anInt1374 = (int) ((float) Static407.anIntArray503[0] / 3.0F);
			Static16.anInt299 = (int) ((float) Static407.anIntArray503[1] / 3.0F);
			Static385.anIntArray465 = new int[Static64.anInt1374 * Static16.anInt299];
			Static404.anInt889 = Static16.anInt299 >> 1;
			Static519.anInt8686 = Static64.anInt1374 >> 1;
		}
		Static303.aClass6_22 = arg1.method7951();
		Static612.anInt9984 = 0;
		for (@Pc(102) int local102 = 0; local102 < Static509.anInt8568; local102++) {
			Static445.method6594(Static527.aClass10Array4[local102], arg1, arg0);
		}
		for (@Pc(125) int local125 = 0; local125 < Static220.anInt4569; local125++) {
			Static445.method6594(Static526.aClass10Array3[local125], arg1, arg0);
		}
		for (@Pc(139) int local139 = 0; local139 < Static156.anInt3553; local139++) {
			Static445.method6594(Static448.aClass10Array2[local139], arg1, arg0);
		}
		Static141.anInt3106 = 0;
		if (Static612.anInt9984 > 0) {
			@Pc(162) int local162 = Static385.anIntArray465.length;
			@Pc(169) int local169 = local162 - local162 & 0x7;
			@Pc(171) int local171 = 0;
			while (local169 > local171) {
				Static385.anIntArray465[local171++] = Integer.MAX_VALUE;
				Static385.anIntArray465[local171++] = Integer.MAX_VALUE;
				Static385.anIntArray465[local171++] = Integer.MAX_VALUE;
				Static385.anIntArray465[local171++] = Integer.MAX_VALUE;
				Static385.anIntArray465[local171++] = Integer.MAX_VALUE;
				Static385.anIntArray465[local171++] = Integer.MAX_VALUE;
				Static385.anIntArray465[local171++] = Integer.MAX_VALUE;
				Static385.anIntArray465[local171++] = Integer.MAX_VALUE;
			}
			while (local162 > local171) {
				Static385.anIntArray465[local171++] = Integer.MAX_VALUE;
			}
			Static299.anInt5571 = 1;
			for (@Pc(228) int local228 = 0; local228 < Static612.anInt9984; local228++) {
				@Pc(233) Class10 local233 = Static76.aClass10Array1[local228];
				Static259.method4237(local233.aShortArray2[1], local233.aShortArray3[3], local233.aShortArray4[1], local233.aShortArray3[1], local233.aShortArray3[0], local233.aShortArray2[0], local233.aShortArray4[3], local233.aShortArray4[0], local233.aShortArray2[3]);
				Static259.method4237(local233.aShortArray2[2], local233.aShortArray3[3], local233.aShortArray4[2], local233.aShortArray3[2], local233.aShortArray3[1], local233.aShortArray2[1], local233.aShortArray4[3], local233.aShortArray4[1], local233.aShortArray2[3]);
			}
			Static299.anInt5571 = 2;
		}
		if (Static551.aBoolean668) {
			Static427.aLong216 = Static284.aClass13_33.method4548() - Static557.aLong251;
		}
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(Lclient!vg;II)V")
	public static void method129(@OriginalArg(0) Class11_Sub1_Sub1_Sub2 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anIntArray226 == null) {
			return;
		}
		@Pc(17) int local17 = arg0.anIntArray226[arg1 + 1];
		if (local17 == arg0.anInt3258) {
			return;
		}
		arg0.anInt3257 = 0;
		arg0.anInt3235 = 1;
		arg0.anInt3258 = local17;
		arg0.anInt3225 = 0;
		arg0.anInt3263 = 0;
		arg0.anInt3294 = arg0.anInt3296;
		if (arg0.anInt3258 != -1) {
			Static330.method3630(arg0.anInt3263, Static185.aClass303_1.method7201(arg0.anInt3258), arg0);
			return;
		}
	}
}
