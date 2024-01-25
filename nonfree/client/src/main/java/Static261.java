import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!jt", name = "l", descriptor = "I")
	public static int anInt4597;

	@OriginalMember(owner = "client!jt", name = "k", descriptor = "I")
	public static int anInt4596 = 1;

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(ILclient!fa;Ljava/awt/Canvas;I)Lclient!r;")
	public static Class45 method3995(@OriginalArg(0) int arg0, @OriginalArg(1) Interface3 arg1, @OriginalArg(2) Canvas arg2) {
		return new Class45_Sub3(arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(II)V")
	public static void method3996(@OriginalArg(0) int arg0) {
		if (arg0 == Static587.anInt9573) {
			return;
		}
		Static54.anInt1038 = Static140.anInt3026 = Static519.anIntArray539[arg0];
		Static207.method3387();
		Static189.anIntArrayArray80 = new int[Static54.anInt1038][Static140.anInt3026];
		Static172.anIntArrayArray202 = new int[Static54.anInt1038][Static140.anInt3026];
		Static358.anIntArrayArrayArray18 = new int[4][Static54.anInt1038 >> 3][Static140.anInt3026 >> 3];
		for (@Pc(36) int local36 = 0; local36 < 4; local36++) {
			Static460.aClass169Array3[local36] = Static100.method1848(Static54.anInt1038, Static140.anInt3026);
		}
		Static45.aByteArrayArrayArray8 = new byte[4][Static54.anInt1038][Static140.anInt3026];
		Static527.method7027(Static54.anInt1038, Static140.anInt3026);
		Static217.method4645(Static140.anInt3026 >> 3, Static54.anInt1038 >> 3, Static505.aClass45_11);
		Static587.anInt9573 = arg0;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method3998(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg0.charAt(local12);
			if (local18 == '<' || local18 == '>') {
				local10 += 3;
			}
		}
		@Pc(42) StringBuffer local42 = new StringBuffer(local10 + local8);
		for (@Pc(44) int local44 = 0; local44 < local8; local44++) {
			@Pc(55) char local55 = arg0.charAt(local44);
			if (local55 == '<') {
				local42.append("<lt>");
			} else if (local55 == '>') {
				local42.append("<gt>");
			} else {
				local42.append(local55);
			}
		}
		return local42.toString();
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "([I[IIILclient!mj;I)Lclient!pp;")
	public static Class81_Sub2 method4000(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class45_Sub2 arg4) {
		@Pc(22) int local22;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (!arg4.method4955(Static471.aClass298_15, Static213.aClass314_19)) {
			@Pc(72) int[] local72 = new int[arg3 * arg2];
			for (local22 = 0; local22 < arg3; local22++) {
				local32 = arg2 * local22 + arg1[local22];
				for (local34 = 0; local34 < arg0[local22]; local34++) {
					local72[local32++] = -16777216;
				}
			}
			return new Class81_Sub2(arg4, arg2, arg3, local72);
		}
		@Pc(20) byte[] local20 = new byte[arg2 * arg3];
		for (local22 = 0; local22 < arg3; local22++) {
			local32 = arg1[local22] + arg2 * local22;
			for (local34 = 0; local34 < arg0[local22]; local34++) {
				local20[local32++] = -1;
			}
		}
		return new Class81_Sub2(arg4, arg2, arg3, local20);
	}
}
