import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!gi", name = "E", descriptor = "I")
	public static int anInt3649;

	@OriginalMember(owner = "client!gi", name = "F", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!gi", name = "K", descriptor = "Lclient!uc;")
	public static Class327 aClass327_2;

	@OriginalMember(owner = "client!gi", name = "L", descriptor = "[Lclient!kea;")
	public static Class193[] aClass193Array1;

	@OriginalMember(owner = "client!gi", name = "J", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_39 = new Class61(24, 15);

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(III)I")
	public static int method3260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static303.anIntArray464[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static572.method7817(Static252.anInt4971, arg2, Static359.anInt6232);
		@Pc(17) int local17 = Static572.method7817(Static252.anInt4971, arg5, Static359.anInt6232);
		@Pc(23) int local23 = Static572.method7817(Static68.anInt1306, arg3, Static589.anInt9684);
		@Pc(29) int local29 = Static572.method7817(Static68.anInt1306, arg0, Static589.anInt9684);
		@Pc(37) int local37 = Static572.method7817(Static252.anInt4971, arg4 + arg2, Static359.anInt6232);
		@Pc(46) int local46 = Static572.method7817(Static252.anInt4971, arg5 - arg4, Static359.anInt6232);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static336.method5023(arg1, local29, Static383.anIntArrayArray62[local48], local23);
		}
		for (@Pc(69) int local69 = local17; local69 > local46; local69--) {
			Static336.method5023(arg1, local29, Static383.anIntArrayArray62[local69], local23);
		}
		@Pc(91) int local91 = Static572.method7817(Static68.anInt1306, arg3 + arg4, Static589.anInt9684);
		@Pc(100) int local100 = Static572.method7817(Static68.anInt1306, arg0 - arg4, Static589.anInt9684);
		for (@Pc(102) int local102 = local37; local102 <= local46; local102++) {
			@Pc(108) int[] local108 = Static383.anIntArrayArray62[local102];
			Static336.method5023(arg1, local91, local108, local23);
			Static336.method5023(arg6, local100, local108, local91);
			Static336.method5023(arg1, local29, local108, local100);
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(FIIIIIFIIFII[F)V")
	public static void method3262(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) float[] arg11) {
		@Pc(9) int local9 = arg1 - arg7;
		@Pc(13) int local13 = arg3 - arg2;
		@Pc(17) int local17 = arg9 - arg4;
		@Pc(38) float local38 = (float) local13 * arg11[2] + (float) local17 * arg11[0] + (float) local9 * arg11[1];
		@Pc(59) float local59 = arg11[3] * (float) local17 + arg11[4] * (float) local9 + (float) local13 * arg11[5];
		@Pc(80) float local80 = (float) local17 * arg11[6] + arg11[7] * (float) local9 + (float) local13 * arg11[8];
		@Pc(106) float local106;
		@Pc(113) float local113;
		if (arg10 == 0) {
			local113 = arg6 + 0.5F - local80;
			local106 = arg0 + local38 + 0.5F;
		} else if (arg10 == 1) {
			local106 = arg0 + local38 + 0.5F;
			local113 = arg6 + local80 + 0.5F;
		} else if (arg10 == 2) {
			local113 = arg8 + 0.5F - local59;
			local106 = arg0 + 0.5F - local38;
		} else if (arg10 == 3) {
			local106 = arg0 + local38 + 0.5F;
			local113 = arg8 + 0.5F - local59;
		} else if (arg10 == 4) {
			local106 = local80 + arg6 + 0.5F;
			local113 = arg8 + 0.5F - local59;
		} else {
			local106 = arg6 + 0.5F - local80;
			local113 = arg8 + 0.5F - local59;
		}
		@Pc(211) float local211;
		if (arg5 == 1) {
			local211 = local106;
			local106 = -local113;
			local113 = local211;
		} else if (arg5 == 2) {
			local113 = -local113;
			local106 = -local106;
		} else if (arg5 == 3) {
			local211 = local106;
			local106 = local113;
			local113 = -local211;
		}
		Static485.aFloat165 = local113;
		Static576.aFloat203 = local106;
	}
}
