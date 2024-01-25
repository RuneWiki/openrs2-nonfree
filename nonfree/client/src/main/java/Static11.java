import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!aea", name = "c", descriptor = "Lclient!wf;")
	public static final Class316 aClass316_1 = new Class316(64);

	@OriginalMember(owner = "client!aea", name = "i", descriptor = "[I")
	public static final int[] anIntArray19 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!aea", name = "k", descriptor = "[I")
	public static final int[] anIntArray20 = new int[1];

	@OriginalMember(owner = "client!aea", name = "m", descriptor = "I")
	public static int anInt130 = 0;

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IZILclient!vp;I)V")
	public static void method240(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class309 arg2, @OriginalArg(4) int arg3) {
		@Pc(6) int local6 = arg2.anInt8790;
		if (arg2.aByte107 == 0) {
			arg2.anInt8790 = arg2.anInt8745;
		} else if (arg2.aByte107 == 1) {
			arg2.anInt8790 = arg1 - arg2.anInt8745;
		} else if (arg2.aByte107 == 2) {
			arg2.anInt8790 = arg1 * arg2.anInt8745 >> 14;
		}
		@Pc(43) int local43 = arg2.anInt8752;
		if (arg2.aByte105 == 0) {
			arg2.anInt8752 = arg2.anInt8768;
		} else if (arg2.aByte105 == 1) {
			arg2.anInt8752 = arg3 - arg2.anInt8768;
		} else if (arg2.aByte105 == 2) {
			arg2.anInt8752 = arg3 * arg2.anInt8768 >> 14;
		}
		if (arg2.aByte107 == 4) {
			arg2.anInt8790 = arg2.anInt8752 * arg2.anInt8740 / arg2.anInt8737;
		}
		if (arg2.aByte105 == 4) {
			arg2.anInt8752 = arg2.anInt8737 * arg2.anInt8790 / arg2.anInt8740;
		}
		if (Static192.aBoolean246 && (Static62.method1740(arg2).anInt9474 != 0 || arg2.anInt8802 == 0)) {
			if (arg2.anInt8752 < 5 && arg2.anInt8790 < 5) {
				arg2.anInt8790 = 5;
				arg2.anInt8752 = 5;
			} else {
				if (arg2.anInt8790 <= 0) {
					arg2.anInt8790 = 5;
				}
				if (arg2.anInt8752 <= 0) {
					arg2.anInt8752 = 5;
				}
			}
		}
		if (arg2.anInt8761 == Static287.anInt5617) {
			Static13.aClass309_1 = arg2;
		}
		if (arg0 && arg2.anObjectArray19 != null && (arg2.anInt8790 != local6 || arg2.anInt8752 != local43)) {
			@Pc(182) Class1_Sub40 local182 = new Class1_Sub40();
			local182.aClass309_10 = arg2;
			local182.anObjectArray5 = arg2.anObjectArray19;
			Static524.aClass38_75.method1426(local182);
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(Lclient!k;III[Z)V")
	public static void method241(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static290.aClass10Array7 == Static106.aClass10Array5) {
			return;
		}
		@Pc(9) int local9 = Static53.aClass10Array3[arg1].aa(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class10 local22 = Static53.aClass10Array3[local11];
				if (local22 != null) {
					local22.F(arg0, arg2, local9 - local22.aa(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}
}
