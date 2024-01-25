import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!lh", name = "t", descriptor = "Lclient!aj;")
	public static Class15 aClass15_90;

	@OriginalMember(owner = "client!lh", name = "q", descriptor = "Lclient!mt;")
	public static final Class228 aClass228_7 = new Class228(1, 2, 2, 0);

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILjava/lang/String;ZI)V")
	public static void method5108(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		Static601.method8442();
		Static360.method5284();
		Static302.method4647();
		Static646.method8976(arg0, arg2, arg1);
		Static528.method7630();
		Static64.method1328(Static674.aClass13_22);
		Static342.method5137(Static674.aClass13_22);
		Static572.method8072(Static674.aClass13_22, Static369.aClass15_97);
		Static75.method1423();
		Static304.method4670(Static52.aClass33Array6);
		Static540.method7765();
		Static313.method4793();
		if (Static406.anInt6454 == 3) {
			Static553.method7892(4);
		} else if (Static406.anInt6454 == 7) {
			Static553.method7892(8);
		} else if (Static406.anInt6454 == 10) {
			Static553.method7892(11);
		} else if (Static406.anInt6454 == 1 || Static406.anInt6454 == 2) {
			Static243.method7723();
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(BD)V")
	public static void method5109(@OriginalArg(1) double arg0) {
		Static161.aClass239_3.method9247(Static300.aClass239_4);
		Static161.aClass239_3.method9244(0, 0, (int) arg0);
		Static316.aClass13_10.method8501(Static161.aClass239_3);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(III[BIII[BI)V")
	public static void method5110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[] arg7) {
		@Pc(10) int local10 = -(arg2 >> 2);
		@Pc(15) int local15 = -(arg2 & 0x3);
		for (@Pc(26) int local26 = -arg6; local26 < 0; local26++) {
			@Pc(34) int local34;
			for (@Pc(30) int local30 = local10; local30 < 0; local30++) {
				local34 = arg0++;
				arg3[local34] += arg7[arg4++];
				@Pc(46) int local46 = arg0++;
				arg3[local46] += arg7[arg4++];
				@Pc(58) int local58 = arg0++;
				arg3[local58] += arg7[arg4++];
				@Pc(70) int local70 = arg0++;
				arg3[local70] += arg7[arg4++];
			}
			for (@Pc(85) int local85 = local15; local85 < 0; local85++) {
				local34 = arg0++;
				arg3[local34] += arg7[arg4++];
			}
			arg0 += arg5;
			arg4 += arg1;
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIZ)Z")
	public static boolean method5111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}
}
