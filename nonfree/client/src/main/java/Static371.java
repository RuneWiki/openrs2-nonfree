import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!ss", name = "D", descriptor = "J")
	public static long aLong198 = -1L;

	@OriginalMember(owner = "client!ss", name = "I", descriptor = "I")
	public static int anInt6722 = 0;

	@OriginalMember(owner = "client!ss", name = "f", descriptor = "(I)V")
	public static void method5266() {
		if (Static418.aBoolean626) {
			return;
		}
		if (Static327.aClass230_Sub1_1.aBoolean621) {
			Static90.aFloat25 = (int) Static90.aFloat25 - 17 & 0xFFFFFFF0;
		} else {
			Static1.aFloat2 += (-12.0F - Static1.aFloat2) / 2.0F;
		}
		Static5.aBoolean541 = true;
		Static418.aBoolean626 = true;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!at;IIIII)V")
	public static void method5267(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt300 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass1_Sub12Array2[local4] != null) {
				arg0.anInt300++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt300; local22++) {
			@Pc(31) long local31 = Static392.aLongArrayArrayArray1[arg1][arg2][arg3];
			@Pc(41) Class253 local41;
			while (local31 != 0L) {
				local41 = Static352.aClass253Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass1_Sub12_2 == arg0.aClass1_Sub12Array2[local22]) {
					continue label51;
				}
			}
			local31 = Static392.aLongArrayArrayArray1[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Static352.aClass253Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass1_Sub12_2 == arg0.aClass1_Sub12Array2[local22]) {
					continue label51;
				}
			}
			for (@Pc(93) int local93 = local22; local93 < arg0.anInt300 - 1; local93++) {
				arg0.aClass1_Sub12Array2[local93] = arg0.aClass1_Sub12Array2[local93 + 1];
			}
			arg0.anInt300--;
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIII)V")
	public static void method5268(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg0 * Static327.aClass230_Sub1_1.anInt7311 >> 8;
		if (arg2 == -1 && !Static292.aBoolean390) {
			Static288.method3962();
		} else if (arg2 != -1 && (Static274.anInt4619 != arg2 || !Static210.method3169()) && local10 != 0 && !Static292.aBoolean390) {
			Static103.method1643(local10, arg2, arg1, Static297.aClass109_69);
		}
		Static274.anInt4619 = arg2;
	}
}
