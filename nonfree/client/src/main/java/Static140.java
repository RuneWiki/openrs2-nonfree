import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!eja", name = "c", descriptor = "I")
	public static int anInt2653;

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(IBLclient!ha;)V")
	public static void method2322(@OriginalArg(0) int arg0, @OriginalArg(2) Class95 arg1) {
		if (!Static355.aBoolean420 || !Static296.aBoolean335) {
			Static232.anInt4115 = 0;
			return;
		}
		if (Static593.aBoolean663) {
			Static142.aLong73 = Static9.aClass151_1.method4619();
		}
		Static548.anInt8557 = 0;
		Static453.anInt7307 = 0;
		Static512.anInt8073 = 0;
		@Pc(27) int[] local27 = arg1.Y();
		Static27.anInt683 = (int) ((float) local27[2] / 3.0F);
		Static333.anInt5522 = (int) ((float) local27[3] / 3.0F);
		arg1.method7994(Static86.anIntArray83);
		if ((int) ((float) Static86.anIntArray83[0] / 3.0F) != Static218.anInt3743 || (int) ((float) Static86.anIntArray83[1] / 3.0F) != Static483.anInt7683) {
			Static483.anInt7683 = (int) ((float) Static86.anIntArray83[1] / 3.0F);
			Static218.anInt3743 = (int) ((float) Static86.anIntArray83[0] / 3.0F);
			Static28.anInt695 = Static218.anInt3743 >> 1;
			Static260.anIntArray268 = new int[Static218.anInt3743 * Static483.anInt7683];
			Static294.anInt10775 = Static483.anInt7683 >> 1;
		}
		Static187.aClass17_2 = arg1.method7992();
		Static232.anInt4115 = 0;
		for (@Pc(100) int local100 = 0; local100 < Static592.anInt9569; local100++) {
			Static304.method4418(arg0, arg1, Static461.aClass272Array44[local100]);
		}
		for (@Pc(117) int local117 = 0; local117 < Static393.anInt6534; local117++) {
			Static304.method4418(arg0, arg1, Static165.aClass272Array7[local117]);
		}
		for (@Pc(136) int local136 = 0; local136 < Static667.anInt10815; local136++) {
			Static304.method4418(arg0, arg1, Static621.aClass272Array40[local136]);
		}
		Static304.anInt5127 = 0;
		if (Static232.anInt4115 > 0) {
			@Pc(159) int local159 = Static260.anIntArray268.length;
			@Pc(166) int local166 = local159 - local159 & 0x7;
			@Pc(168) int local168 = 0;
			while (local168 < local166) {
				Static260.anIntArray268[local168++] = Integer.MAX_VALUE;
				Static260.anIntArray268[local168++] = Integer.MAX_VALUE;
				Static260.anIntArray268[local168++] = Integer.MAX_VALUE;
				Static260.anIntArray268[local168++] = Integer.MAX_VALUE;
				Static260.anIntArray268[local168++] = Integer.MAX_VALUE;
				Static260.anIntArray268[local168++] = Integer.MAX_VALUE;
				Static260.anIntArray268[local168++] = Integer.MAX_VALUE;
				Static260.anIntArray268[local168++] = Integer.MAX_VALUE;
			}
			while (local168 < local159) {
				Static260.anIntArray268[local168++] = Integer.MAX_VALUE;
			}
			Static499.anInt7885 = 1;
			for (@Pc(227) int local227 = 0; local227 < Static232.anInt4115; local227++) {
				@Pc(233) Class272 local233 = Static589.aClass272Array37[local227];
				Static278.method4061(local233.aShortArray92[1], local233.aShortArray92[3], local233.aShortArray93[1], local233.aShortArray91[0], local233.aShortArray91[1], local233.aShortArray91[3], local233.aShortArray92[0], local233.aShortArray93[3], local233.aShortArray93[0]);
				Static278.method4061(local233.aShortArray92[2], local233.aShortArray92[3], local233.aShortArray93[2], local233.aShortArray91[1], local233.aShortArray91[2], local233.aShortArray91[3], local233.aShortArray92[1], local233.aShortArray93[3], local233.aShortArray93[1]);
			}
			Static499.anInt7885 = 2;
		}
		if (Static593.aBoolean663) {
			Static145.aLong74 = Static9.aClass151_1.method4619() - Static142.aLong73;
		}
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(IILclient!ofa;Z)V")
	public static void method2323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class265 arg2) {
		@Pc(8) Class1 local8 = arg2.method5906(Static119.aClass95_4);
		if (local8 == null) {
			return;
		}
		Static119.aClass95_4.KA(arg0, arg1, arg2.anInt7024 + arg0, arg1 - -arg2.anInt6997);
		if (Static585.anInt9524 >= 3) {
			Static119.aClass95_4.A(-16777216, local8, arg0, arg1);
		} else {
			Static653.aClass6_39.method5132((float) arg0 + (float) arg2.anInt7024 / 2.0F, (float) arg2.anInt6997 / 2.0F + (float) arg1, ((int) -Static318.aFloat81 & 0x3FFF) << 2, local8, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(Lclient!js;I)Z")
	public static boolean method2324(@OriginalArg(0) Class188 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean331) {
			return false;
		} else if (!arg0.method4283(Static671.anInterface6_2)) {
			return false;
		} else if (Static163.aClass333_13.method7489((long) arg0.anInt4968) == null) {
			return Static617.aClass333_23.method7489((long) arg0.anInt4980) == null;
		} else {
			return false;
		}
	}
}
