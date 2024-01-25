import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!cq", name = "i", descriptor = "Lclient!ni;")
	public static Class162 aClass162_1;

	@OriginalMember(owner = "client!cq", name = "j", descriptor = "I")
	public static int anInt1574;

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "Z")
	public static boolean aBoolean103 = false;

	@OriginalMember(owner = "client!cq", name = "e", descriptor = "[I")
	public static final int[] anIntArray101 = new int[1];

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lclient!co;IIIII)V")
	public static void method1177(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt4351 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass4_Sub8Array3[local4] != null) {
				arg0.anInt4351++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt4351; local22++) {
			@Pc(31) long local31 = Static420.aLongArrayArrayArray128[arg1][arg2][arg3];
			@Pc(41) Class169 local41;
			while (local31 != 0L) {
				local41 = Static200.aClass169Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass4_Sub8_1 == arg0.aClass4_Sub8Array3[local22]) {
					continue label51;
				}
			}
			local31 = Static420.aLongArrayArrayArray128[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Static200.aClass169Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass4_Sub8_1 == arg0.aClass4_Sub8Array3[local22]) {
					continue label51;
				}
			}
			for (@Pc(93) int local93 = local22; local93 < arg0.anInt4351 - 1; local93++) {
				arg0.aClass4_Sub8Array3[local93] = arg0.aClass4_Sub8Array3[local93 + 1];
			}
			arg0.anInt4351--;
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIIIIIB)V")
	public static void method1180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(11) int local11 = Static360.method5003(Static387.anInt6727, Static388.anInt6740, arg5);
		@Pc(17) int local17 = Static360.method5003(Static387.anInt6727, Static388.anInt6740, arg2);
		@Pc(25) int local25 = Static360.method5003(Static198.anInt3778, Static414.anInt7043, arg3);
		@Pc(31) int local31 = Static360.method5003(Static198.anInt3778, Static414.anInt7043, arg4);
		@Pc(39) int local39 = Static360.method5003(Static387.anInt6727, Static388.anInt6740, arg5 + arg1);
		@Pc(47) int local47 = Static360.method5003(Static387.anInt6727, Static388.anInt6740, arg2 - arg1);
		for (@Pc(49) int local49 = local11; local49 < local39; local49++) {
			Static335.method4533(local31, arg0, local25, Static162.anIntArrayArray58[local49]);
		}
		for (@Pc(71) int local71 = local17; local71 > local47; local71--) {
			Static335.method4533(local31, arg0, local25, Static162.anIntArrayArray58[local71]);
		}
		@Pc(99) int local99 = Static360.method5003(Static198.anInt3778, Static414.anInt7043, arg1 + arg3);
		@Pc(108) int local108 = Static360.method5003(Static198.anInt3778, Static414.anInt7043, arg4 - arg1);
		for (@Pc(121) int local121 = local39; local121 <= local47; local121++) {
			@Pc(127) int[] local127 = Static162.anIntArrayArray58[local121];
			Static335.method4533(local99, arg0, local25, local127);
			Static335.method4533(local31, arg0, local108, local127);
		}
	}
}
