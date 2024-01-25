import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!jd", name = "l", descriptor = "Lclient!fi;")
	public static Class76 aClass76_9 = null;

	@OriginalMember(owner = "client!jd", name = "r", descriptor = "Z")
	public static boolean aBoolean206 = false;

	@OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
	public static int anInt3195 = 0;

	@OriginalMember(owner = "client!jd", name = "u", descriptor = "I")
	public static int anInt3196 = 0;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!za;B)V")
	public static void method2571(@OriginalArg(0) Class200 arg0) {
		if (Static286.aBoolean295) {
			Static61.method968(arg0);
		} else {
			Static413.method5435(arg0);
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIBI)I")
	public static int method2572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static410.aClass125Array3 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg1 >> 7;
		@Pc(15) int local15 = arg0 >> 7;
		if (local11 < 0 || local15 < 0 || local11 > Static433.anInt7210 - 1 || local15 > Static418.anInt6969 - 1) {
			return 0;
		}
		@Pc(48) int local48 = arg2;
		if (arg2 < 3 && (Static452.aByteArrayArrayArray16[1][local11][local15] & 0x2) != 0) {
			local48 = arg2 + 1;
		}
		return Static410.aClass125Array3[local48].ca(arg1, arg0);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!bc;IIIII)V")
	public static void method2573(@OriginalArg(0) Class18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt6451 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass5_Sub19Array2[local4] != null) {
				arg0.anInt6451++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt6451; local22++) {
			@Pc(31) long local31 = Static76.aLongArrayArrayArray1[arg1][arg2][arg3];
			@Pc(41) Class111 local41;
			while (local31 != 0L) {
				local41 = Static68.aClass111Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass5_Sub19_2 == arg0.aClass5_Sub19Array2[local22]) {
					continue label51;
				}
			}
			local31 = Static76.aLongArrayArrayArray1[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Static68.aClass111Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass5_Sub19_2 == arg0.aClass5_Sub19Array2[local22]) {
					continue label51;
				}
			}
			for (@Pc(93) int local93 = local22; local93 < arg0.anInt6451 - 1; local93++) {
				arg0.aClass5_Sub19Array2[local93] = arg0.aClass5_Sub19Array2[local93 + 1];
			}
			arg0.anInt6451--;
		}
	}
}
