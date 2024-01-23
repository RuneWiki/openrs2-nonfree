import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
	public static int anInt3939 = 0;

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
	public static volatile int anInt3940 = 0;

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "Lclient!vb;")
	public static Class121 aClass121_4 = new Class121();

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
	public static void method3138() {
		if (Static132.aClass48_2 != null) {
			Static132.aClass48_2.method3223();
		}
		if (Static58.aClass48_1 != null) {
			Static58.aClass48_1.method3223();
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILclient!hh;)I")
	public static int method3139(@OriginalArg(1) Class50 arg0) {
		if (arg0.method1249() == 0) {
			return -1;
		}
		for (@Pc(18) int local18 = 0; local18 < Static131.aClass62_2.anInt2136; local18++) {
			if (Static131.aClass62_2.aClass50Array38[local18].method1213(arg0)) {
				return local18;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IILclient!pg;IZIIII)V")
	public static void method3140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub17 arg2, @OriginalArg(3) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		@Pc(34) int local34;
		if (arg3 < 0 || arg3 >= 104 || arg0 < 0 || arg0 >= 104) {
			while (true) {
				local34 = arg2.method2142();
				if (local34 == 0) {
					return;
				}
				if (local34 == 1) {
					arg2.method2142();
					return;
				}
				if (local34 <= 49) {
					arg2.method2142();
				}
			}
			return;
		}
		Static159.aByteArrayArrayArray13[arg1][arg3][arg0] = 0;
		while (true) {
			local34 = arg2.method2142();
			if (local34 == 0) {
				if (arg1 == 0) {
					Static119.anIntArrayArrayArray10[0][arg3][arg0] = -Static191.method3136(arg3 + arg6 + 932731, arg5 + 556238 - -arg0) * 8;
					return;
				} else {
					Static119.anIntArrayArrayArray10[arg1][arg3][arg0] = Static119.anIntArrayArrayArray10[arg1 - 1][arg3][arg0] - 240;
					return;
				}
			}
			if (local34 == 1) {
				@Pc(107) int local107 = arg2.method2142();
				if (local107 == 1) {
					local107 = 0;
				}
				if (arg1 == 0) {
					Static119.anIntArrayArrayArray10[0][arg3][arg0] = -local107 * 8;
					return;
				}
				Static119.anIntArrayArrayArray10[arg1][arg3][arg0] = Static119.anIntArrayArrayArray10[arg1 - 1][arg3][arg0] - local107 * 8;
				return;
			}
			if (local34 <= 49) {
				Static80.aByteArrayArrayArray5[arg1][arg3][arg0] = arg2.method2155();
				Static120.aByteArrayArrayArray7[arg1][arg3][arg0] = (byte) ((local34 - 2) / 4);
				Static12.aByteArrayArrayArray1[arg1][arg3][arg0] = (byte) (arg4 + local34 - 2 & 0x3);
			} else if (local34 <= 81) {
				Static159.aByteArrayArrayArray13[arg1][arg3][arg0] = (byte) (local34 - 49);
			} else {
				Static118.aByteArrayArrayArray6[arg1][arg3][arg0] = (byte) (local34 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)I")
	public static int method3141(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return 0;
		}
		@Pc(26) Class1_Sub14 local26 = (Class1_Sub14) Static57.aClass90_8.method2819((long) arg0);
		if (local26 == null) {
			return Static62.method940(arg0).anInt285;
		}
		@Pc(35) int local35 = 0;
		for (@Pc(37) int local37 = 0; local37 < local26.anIntArray142.length; local37++) {
			if (local26.anIntArray142[local37] == -1) {
				local35++;
			}
		}
		return local35 + Static62.method940(arg0).anInt285 - local26.anIntArray142.length;
	}
}
