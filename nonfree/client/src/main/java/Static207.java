import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "Lclient!lf;")
	public static final Class210 aClass210_17 = new Class210(0, 1);

	@OriginalMember(owner = "client!ha", name = "u", descriptor = "Z")
	public static boolean aBoolean732 = false;

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_143 = new Class216(44, 8);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(BI)I")
	public static int method8077(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(JI)V")
	public static void method8099(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(3) InterruptedException local3) {
		}
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(IIIIII)V")
	public static void method8105(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(13) int local13 = arg1 * arg1;
		@Pc(17) int local17 = arg4 * arg4;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(34) int local34 = arg4 << 1;
		@Pc(44) int local44 = (1 - local34) * local13 + local21;
		@Pc(53) int local53 = local17 - local25 * (local34 - 1);
		@Pc(57) int local57 = local13 << 2;
		@Pc(61) int local61 = local17 << 2;
		@Pc(69) int local69 = local21 * 3;
		@Pc(77) int local77 = ((arg4 << 1) - 3) * local25;
		@Pc(83) int local83 = local61;
		@Pc(101) int local101;
		@Pc(110) int local110;
		if (arg0 >= Static73.anInt1542 && Static527.anInt8177 >= arg0) {
			local101 = Static385.method4989(Static472.anInt7503, arg1 + arg3, Static257.anInt4172);
			local110 = Static385.method4989(Static472.anInt7503, arg3 - arg1, Static257.anInt4172);
			Static559.method7424(arg2, Static172.anIntArrayArray17[arg0], local101, local110);
		}
		@Pc(124) int local124 = (arg4 - 1) * local57;
		while (local9 > 0) {
			if (local44 < 0) {
				while (local44 < 0) {
					local44 += local69;
					local53 += local83;
					local83 += local61;
					local7++;
					local69 += local61;
				}
			}
			if (local53 < 0) {
				local44 += local69;
				local53 += local83;
				local7++;
				local69 += local61;
				local83 += local61;
			}
			local53 += -local77;
			local44 += -local124;
			local124 -= local57;
			local77 -= local57;
			local9--;
			local101 = arg0 - local9;
			local110 = local9 + arg0;
			if (local110 >= Static73.anInt1542 && local101 <= Static527.anInt8177) {
				@Pc(220) int local220 = Static385.method4989(Static472.anInt7503, local7 + arg3, Static257.anInt4172);
				@Pc(229) int local229 = Static385.method4989(Static472.anInt7503, arg3 - local7, Static257.anInt4172);
				if (local101 >= Static73.anInt1542) {
					Static559.method7424(arg2, Static172.anIntArrayArray17[local101], local220, local229);
				}
				if (Static527.anInt8177 >= local110) {
					Static559.method7424(arg2, Static172.anIntArrayArray17[local110], local220, local229);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILclient!d;Lclient!bt;IIILjava/awt/Canvas;B)Lclient!ha;")
	public static synchronized Class33 method8122(@OriginalArg(0) int arg0, @OriginalArg(1) Interface9 arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Canvas arg6) {
		if (arg3 == 0) {
			return Static252.method3675(arg5, arg0, arg1, arg6);
		} else if (arg3 == 2) {
			return Static277.method4054(arg5, arg0, arg6, arg1);
		} else if (arg3 == 1) {
			return Static490.method8902(arg1, arg6, arg4);
		} else if (arg3 == 5) {
			return Static494.method6886(arg4, arg6, arg1, arg2);
		} else if (arg3 == 3) {
			return Static688.method8796(arg6, arg2, arg1, arg4);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(BII)Z")
	public static boolean method8148(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0xC580) != 0;
	}
}
