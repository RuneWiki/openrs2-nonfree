import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!af", name = "c", descriptor = "Lclient!gt;")
	public static Class93 aClass93_1;

	@OriginalMember(owner = "client!af", name = "e", descriptor = "Lclient!eg;")
	public static final Class60 aClass60_1 = new Class60("", 12);

	@OriginalMember(owner = "client!af", name = "f", descriptor = "[B")
	public static final byte[] aByteArray1 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILclient!gt;Lclient!l;Ljava/awt/Canvas;II)Lclient!za;")
	public static Class200 method97(@OriginalArg(1) Class93 arg0, @OriginalArg(2) Interface8 arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		return new Class200_Sub2(arg4, arg2, arg1, arg3, arg0);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIII)V")
	public static void method99(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(12) int local12 = -arg0;
		Static291.method3606(arg0 + arg2, Static133.anIntArrayArray15[arg1], arg3, arg2 - arg0);
		@Pc(38) int local38 = -1;
		while (local7 < local9) {
			local38 += 2;
			local12 += local38;
			local7++;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(64) int[] local64 = Static133.anIntArrayArray15[local9 + arg1];
				@Pc(70) int[] local70 = Static133.anIntArrayArray15[arg1 - local9];
				@Pc(74) int local74 = local7 + arg2;
				@Pc(79) int local79 = arg2 - local7;
				Static291.method3606(local74, local64, arg3, local79);
				Static291.method3606(local74, local70, arg3, local79);
			}
			@Pc(95) int local95 = local9 + arg2;
			@Pc(99) int local99 = arg2 - local9;
			@Pc(105) int[] local105 = Static133.anIntArrayArray15[local7 + arg1];
			@Pc(112) int[] local112 = Static133.anIntArrayArray15[arg1 - local7];
			Static291.method3606(local95, local105, arg3, local99);
			Static291.method3606(local95, local112, arg3, local99);
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(B)Z")
	public static boolean method100() {
		if (Static348.aBoolean387) {
			try {
				if ((Boolean) Static471.method4680("showingVideoAd", aClass93_1.anApplet1)) {
					return false;
				}
				return true;
			} catch (@Pc(26) Throwable local26) {
			}
		}
		return true;
	}
}
