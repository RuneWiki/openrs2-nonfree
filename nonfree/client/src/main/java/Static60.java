import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!cu", name = "G", descriptor = "[Lclient!na;")
	public static Class70[] aClass70Array1;

	@OriginalMember(owner = "client!cu", name = "P", descriptor = "[Z")
	public static boolean[] aBooleanArray4;

	@OriginalMember(owner = "client!cu", name = "F", descriptor = "I")
	public static int anInt1086 = 100;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IBI)Z")
	public static boolean method911(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIIIII)V")
	public static void method912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg0 - arg1;
		@Pc(14) int local14 = arg3 - arg2;
		if (local9 == 0) {
			if (local14 != 0) {
				Static110.method1737(arg4, arg2, arg1, arg3);
			}
		} else if (local14 == 0) {
			Static412.method5589(arg2, arg0, arg4, arg1);
		} else {
			@Pc(44) int local44 = (local14 << 12) / local9;
			@Pc(52) int local52 = arg2 - (local44 * arg1 >> 12);
			@Pc(61) int local61;
			@Pc(69) int local69;
			if (Static47.anInt762 > arg1) {
				local61 = Static47.anInt762;
				local69 = (Static47.anInt762 * local44 >> 12) + local52;
			} else if (arg1 <= anInt1086) {
				local69 = arg2;
				local61 = arg1;
			} else {
				local69 = local52 + (local44 * anInt1086 >> 12);
				local61 = anInt1086;
			}
			@Pc(103) int local103;
			@Pc(101) int local101;
			if (Static47.anInt762 > arg0) {
				local101 = local52 + (local44 * Static47.anInt762 >> 12);
				local103 = Static47.anInt762;
			} else if (anInt1086 < arg0) {
				local101 = (anInt1086 * local44 >> 12) + local52;
				local103 = anInt1086;
			} else {
				local101 = arg3;
				local103 = arg0;
			}
			if (local69 < Static357.anInt6537) {
				local61 = (Static357.anInt6537 - local52 << 12) / local44;
				local69 = Static357.anInt6537;
			} else if (local69 > Static85.anInt1517) {
				local69 = Static85.anInt1517;
				local61 = (Static85.anInt1517 - local52 << 12) / local44;
			}
			if (local101 < Static357.anInt6537) {
				local101 = Static357.anInt6537;
				local103 = (Static357.anInt6537 - local52 << 12) / local44;
			} else if (Static85.anInt1517 < local101) {
				local101 = Static85.anInt1517;
				local103 = (Static85.anInt1517 - local52 << 12) / local44;
			}
			Static228.method3282(local61, local101, local69, arg4, local103);
		}
	}
}
