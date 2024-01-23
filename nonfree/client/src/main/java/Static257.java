import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!tj", name = "I", descriptor = "I")
	public static int anInt5096;

	@OriginalMember(owner = "client!tj", name = "L", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!tj", name = "O", descriptor = "F")
	public static float aFloat59;

	@OriginalMember(owner = "client!tj", name = "Q", descriptor = "Z")
	public static boolean aBoolean412 = false;

	@OriginalMember(owner = "client!tj", name = "T", descriptor = "[S")
	public static short[] aShortArray56 = new short[256];

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(B)Z")
	public static boolean method3870() {
		try {
			return Static81.method1349();
		} catch (@Pc(17) IOException local17) {
			Static134.method2184();
			return true;
		} catch (@Pc(22) Exception local22) {
			@Pc(64) String local64 = "T2 - " + Static277.anInt5667 + "," + Static188.anInt3774 + "," + Static173.anInt3442 + " - " + Static68.anInt1687 + "," + (Static49.anInt1089 + Static21.aClass36_Sub3_Sub1_1.anIntArray310[0]) + "," + (Static21.aClass36_Sub3_Sub1_1.anIntArray308[0] + Static130.anInt2601) + " - ";
			for (@Pc(66) int local66 = 0; local66 < Static68.anInt1687 && local66 < 50; local66++) {
				local64 = local64 + Static275.aClass8_Sub2_Sub1_6.aByteArray24[local66] + ",";
			}
			Static88.method1444(local64, local22);
			Static206.method3267();
			return true;
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(BIIII)V")
	public static void method3871(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static119.anInt2398 = -1;
		Static218.anInt4483 = arg3 * Static221.anInt4539 / arg1;
		Static52.anInt1147 = Static156.anInt3157 * arg0 / arg2;
		Static64.anInt1385 = -1;
		Static286.method4120();
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIBIIII)V")
	public static void method3872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static2.method4(Static244.anInt4872, arg0, Static228.anInt4643);
		@Pc(17) int local17 = Static2.method4(Static244.anInt4872, arg3, Static228.anInt4643);
		@Pc(23) int local23 = Static2.method4(Static52.anInt1146, arg5, Static253.anInt4996);
		@Pc(29) int local29 = Static2.method4(Static52.anInt1146, arg2, Static253.anInt4996);
		@Pc(37) int local37 = Static2.method4(Static244.anInt4872, arg4 + arg0, Static228.anInt4643);
		@Pc(45) int local45 = Static2.method4(Static244.anInt4872, arg3 - arg4, Static228.anInt4643);
		@Pc(47) int local47;
		for (local47 = local11; local47 < local37; local47++) {
			Static19.method343(local23, arg1, Static181.anIntArrayArray19[local47], local29);
		}
		for (local47 = local17; local47 > local45; local47--) {
			Static19.method343(local23, arg1, Static181.anIntArrayArray19[local47], local29);
		}
		@Pc(90) int local90 = Static2.method4(Static52.anInt1146, arg5 + arg4, Static253.anInt4996);
		@Pc(99) int local99 = Static2.method4(Static52.anInt1146, arg2 - arg4, Static253.anInt4996);
		for (@Pc(109) int local109 = local37; local109 <= local45; local109++) {
			@Pc(120) int[] local120 = Static181.anIntArrayArray19[local109];
			Static19.method343(local23, arg1, local120, local90);
			Static19.method343(local99, arg1, local120, local29);
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(BI)V")
	public static void method3873(@OriginalArg(1) int arg0) {
		Static153.aFloatArray15[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
		Static153.aFloatArray15[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static153.aFloatArray15[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
		Static88.method1439(3);
		Static88.method1439(4);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIII)V")
	public static void method3874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) int local15 = arg3 - arg0;
		@Pc(20) int local20 = arg4 - arg1;
		if (local15 == 0) {
			if (local20 != 0) {
				Static240.method3615(arg1, arg4, arg2, arg0);
			}
		} else if (local20 == 0) {
			Static40.method621(arg2, arg3, arg1, arg0);
		} else {
			@Pc(51) int local51 = (local20 << 12) / local15;
			@Pc(60) int local60 = arg1 - (local51 * arg0 >> 12);
			@Pc(76) int local76;
			@Pc(78) int local78;
			if (Static253.anInt4996 > arg0) {
				local78 = local60 + (local51 * Static253.anInt4996 >> 12);
				local76 = Static253.anInt4996;
			} else if (Static52.anInt1146 >= arg0) {
				local76 = arg0;
				local78 = arg1;
			} else {
				local76 = Static52.anInt1146;
				local78 = local60 + (local51 * Static52.anInt1146 >> 12);
			}
			@Pc(108) int local108;
			@Pc(116) int local116;
			if (arg3 < Static253.anInt4996) {
				local108 = Static253.anInt4996;
				local116 = local60 + (Static253.anInt4996 * local51 >> 12);
			} else if (arg3 <= Static52.anInt1146) {
				local116 = arg4;
				local108 = arg3;
			} else {
				local116 = local60 + (Static52.anInt1146 * local51 >> 12);
				local108 = Static52.anInt1146;
			}
			if (Static228.anInt4643 > local116) {
				local108 = (Static228.anInt4643 - local60 << 12) / local51;
				local116 = Static228.anInt4643;
			} else if (local116 > Static244.anInt4872) {
				local108 = (Static244.anInt4872 - local60 << 12) / local51;
				local116 = Static244.anInt4872;
			}
			if (local78 < Static228.anInt4643) {
				local78 = Static228.anInt4643;
				local76 = (Static228.anInt4643 - local60 << 12) / local51;
			} else if (Static244.anInt4872 < local78) {
				local76 = (Static244.anInt4872 - local60 << 12) / local51;
				local78 = Static244.anInt4872;
			}
			Static197.method3038(arg2, local78, local116, local108, local76);
		}
	}
}
