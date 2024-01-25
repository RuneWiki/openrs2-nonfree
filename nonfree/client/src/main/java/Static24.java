import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!bf", name = "C", descriptor = "F")
	public static float aFloat2;

	@OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
	public static int anInt527 = 0;

	@OriginalMember(owner = "client!bf", name = "F", descriptor = "I")
	public static int anInt533 = -1;

	@OriginalMember(owner = "client!bf", name = "I", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!bf", name = "K", descriptor = "I")
	public static final int anInt537 = 1338;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
	public static String method446(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(9) int local9 = arg0.indexOf(arg2); local9 != -1; local9 = arg0.indexOf(arg2, arg1.length() + local9)) {
			arg0 = arg0.substring(0, local9) + arg1 + arg0.substring(arg2.length() + local9);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(IIIIIII)V")
	public static void method447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static182.method3571(arg3);
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg3 - arg5;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(20) int local20 = arg3;
		@Pc(23) int local23 = -arg3;
		@Pc(25) int local25 = local14;
		@Pc(28) int local28 = -local14;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		@Pc(65) int local65;
		@Pc(73) int local73;
		@Pc(81) int local81;
		@Pc(91) int local91;
		if (arg2 >= Static138.anInt932 && Static40.anInt818 >= arg2) {
			@Pc(54) int[] local54 = Static15.anIntArrayArray1[arg2];
			local65 = Static93.method1862(arg4 - arg3, Static235.anInt4193, Static243.anInt4326);
			local73 = Static93.method1862(arg4 + arg3, Static235.anInt4193, Static243.anInt4326);
			local81 = Static93.method1862(arg4 - local14, Static235.anInt4193, Static243.anInt4326);
			local91 = Static93.method1862(local14 + arg4, Static235.anInt4193, Static243.anInt4326);
			Static315.method4662(local81, local54, local65, arg0);
			Static315.method4662(local91, local54, local81, arg1);
			Static315.method4662(local73, local54, local91, arg0);
		}
		while (local10 < local20) {
			local34 += 2;
			local36 += 2;
			local23 += local34;
			local28 += local36;
			if (local28 >= 0 && local25 >= 1) {
				local25--;
				Static262.anIntArray891[local25] = local10;
				local28 -= local25 << 1;
			}
			local10++;
			@Pc(206) int local206;
			@Pc(217) int local217;
			@Pc(224) int[] local224;
			@Pc(155) int local155;
			if (local23 >= 0) {
				local20--;
				local23 -= local20 << 1;
				local155 = arg2 - local20;
				local65 = arg2 + local20;
				if (local65 >= Static138.anInt932 && Static40.anInt818 >= local155) {
					if (local20 < local14) {
						local73 = Static262.anIntArray891[local20];
						local81 = Static93.method1862(local10 + arg4, Static235.anInt4193, Static243.anInt4326);
						local91 = Static93.method1862(arg4 - local10, Static235.anInt4193, Static243.anInt4326);
						local206 = Static93.method1862(arg4 + local73, Static235.anInt4193, Static243.anInt4326);
						local217 = Static93.method1862(arg4 - local73, Static235.anInt4193, Static243.anInt4326);
						if (Static40.anInt818 >= local65) {
							local224 = Static15.anIntArrayArray1[local65];
							Static315.method4662(local217, local224, local91, arg0);
							Static315.method4662(local206, local224, local217, arg1);
							Static315.method4662(local81, local224, local206, arg0);
						}
						if (local155 >= Static138.anInt932) {
							local224 = Static15.anIntArrayArray1[local155];
							Static315.method4662(local217, local224, local91, arg0);
							Static315.method4662(local206, local224, local217, arg1);
							Static315.method4662(local81, local224, local206, arg0);
						}
					} else {
						local73 = Static93.method1862(local10 + arg4, Static235.anInt4193, Static243.anInt4326);
						local81 = Static93.method1862(arg4 - local10, Static235.anInt4193, Static243.anInt4326);
						if (local65 <= Static40.anInt818) {
							Static315.method4662(local73, Static15.anIntArrayArray1[local65], local81, arg0);
						}
						if (Static138.anInt932 <= local155) {
							Static315.method4662(local73, Static15.anIntArrayArray1[local155], local81, arg0);
						}
					}
				}
			}
			local155 = arg2 - local10;
			local65 = arg2 + local10;
			if (Static138.anInt932 <= local65 && local155 <= Static40.anInt818) {
				local73 = arg4 + local20;
				local81 = arg4 - local20;
				if (Static243.anInt4326 <= local73 && Static235.anInt4193 >= local81) {
					local73 = Static93.method1862(local73, Static235.anInt4193, Static243.anInt4326);
					local81 = Static93.method1862(local81, Static235.anInt4193, Static243.anInt4326);
					if (local10 < local14) {
						local91 = local10 > local25 ? Static262.anIntArray891[local10] : local25;
						local206 = Static93.method1862(local91 + arg4, Static235.anInt4193, Static243.anInt4326);
						local217 = Static93.method1862(arg4 - local91, Static235.anInt4193, Static243.anInt4326);
						if (Static40.anInt818 >= local65) {
							local224 = Static15.anIntArrayArray1[local65];
							Static315.method4662(local217, local224, local81, arg0);
							Static315.method4662(local206, local224, local217, arg1);
							Static315.method4662(local73, local224, local206, arg0);
						}
						if (local155 >= Static138.anInt932) {
							local224 = Static15.anIntArrayArray1[local155];
							Static315.method4662(local217, local224, local81, arg0);
							Static315.method4662(local206, local224, local217, arg1);
							Static315.method4662(local73, local224, local206, arg0);
						}
					} else {
						if (Static40.anInt818 >= local65) {
							Static315.method4662(local73, Static15.anIntArrayArray1[local65], local81, arg0);
						}
						if (local155 >= Static138.anInt932) {
							Static315.method4662(local73, Static15.anIntArrayArray1[local155], local81, arg0);
						}
					}
				}
			}
		}
	}
}
