import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static557 {

	@OriginalMember(owner = "client!tw", name = "x", descriptor = "I")
	public static int anInt9973;

	@OriginalMember(owner = "client!tw", name = "G", descriptor = "[[B")
	public static byte[][] aByteArrayArray24;

	@OriginalMember(owner = "client!tw", name = "I", descriptor = "Lclient!cs;")
	public static Class66 aClass66_10;

	@OriginalMember(owner = "client!tw", name = "C", descriptor = "Lclient!sj;")
	public static final Class316 aClass316_6 = new Class316("stellardawn", 1);

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(IZI)Ljava/lang/String;")
	public static String method8308(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = arg0 - arg1;
		if (local13 < -9) {
			return "<col=ff0000>";
		} else if (local13 < -6) {
			return "<col=ff3000>";
		} else if (local13 < -3) {
			return "<col=ff7000>";
		} else if (local13 < 0) {
			return "<col=ffb000>";
		} else if (local13 > 9) {
			return "<col=00ff00>";
		} else if (local13 > 6) {
			return "<col=40ff00>";
		} else if (local13 > 3) {
			return "<col=80ff00>";
		} else if (local13 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(II)Z")
	public static boolean method8310(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIIII)V")
	public static void method8311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = arg3;
		@Pc(17) int local17 = -arg3;
		@Pc(19) int local19 = -1;
		Static280.method5108(arg1 + arg3, Static208.anIntArrayArray20[arg0], arg1 - arg3, arg2);
		while (local14 > local12) {
			local19 += 2;
			local17 += local19;
			local12++;
			if (local17 >= 0) {
				local14--;
				local17 -= local14 << 1;
				@Pc(61) int[] local61 = Static208.anIntArrayArray20[arg0 + local14];
				@Pc(68) int[] local68 = Static208.anIntArrayArray20[arg0 - local14];
				@Pc(72) int local72 = local12 + arg1;
				@Pc(77) int local77 = arg1 - local12;
				Static280.method5108(local72, local61, local77, arg2);
				Static280.method5108(local72, local68, local77, arg2);
			}
			@Pc(93) int local93 = local14 + arg1;
			@Pc(97) int local97 = arg1 - local14;
			@Pc(103) int[] local103 = Static208.anIntArrayArray20[local12 + arg0];
			@Pc(110) int[] local110 = Static208.anIntArrayArray20[arg0 - local12];
			Static280.method5108(local93, local103, local97, arg2);
			Static280.method5108(local93, local110, local97, arg2);
		}
	}

	@OriginalMember(owner = "client!tw", name = "c", descriptor = "(IB)V")
	public static void method8312(@OriginalArg(0) int arg0) {
		if (Static26.anInt543 == 1) {
			Static353.anInt7027 = arg0;
		} else if (Static26.anInt543 == 2) {
			Static173.anInt4167 = arg0;
		}
	}
}
