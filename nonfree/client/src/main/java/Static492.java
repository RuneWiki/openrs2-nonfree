import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static492 {

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "[I")
	public static int[] anIntArray461;

	@OriginalMember(owner = "client!qm", name = "f", descriptor = "I")
	public static int anInt7972;

	@OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
	public static int anInt7973;

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
	public static int anInt7974;

	@OriginalMember(owner = "client!qm", name = "g", descriptor = "Lclient!qr;")
	public static final Class306 aClass306_35 = new Class306(32);

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V")
	public static void method6896(@OriginalArg(0) int arg0) {
		Static548.aClass100_13.method8590(Static83.aClass10_1);
		Static548.aClass100_13.DA(Static386.anInt6538, Static638.anInt10399, Static88.anInt1479, Static189.anInt3494);
		if (arg0 != -5) {
			method6896(-92);
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IZ)V")
	public static void method6897(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == Static632.anInt10347) {
			return;
		}
		Static271.anInt4910 = Static613.anInt9909 = Static508.anIntArray467[arg0];
		Static671.method9114();
		Static109.anIntArrayArray62 = new int[Static271.anInt4910][Static613.anInt9909];
		Static653.anIntArrayArrayArray20 = new int[4][Static271.anInt4910 >> 3][Static613.anInt9909 >> 3];
		Static615.anIntArrayArray58 = new int[Static271.anInt4910][Static613.anInt9909];
		for (@Pc(41) int local41 = 0; local41 < 4; local41++) {
			Static553.aClass169Array1[local41] = Static336.method5051(Static613.anInt9909, Static271.anInt4910);
		}
		Static524.aByteArrayArrayArray22 = new byte[4][Static271.anInt4910][Static613.anInt9909];
		Static462.method6511(Static271.anInt4910, Static613.anInt9909);
		if (!arg1) {
			method6897(127, true);
		}
		Static601.method8247(Static271.anInt4910 >> 3, Static613.anInt9909 >> 3, Static273.aClass100_6);
		Static632.anInt10347 = arg0;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IZILjava/lang/String;)V")
	public static void method6899(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3) {
		Static221.method3526();
		Static434.method6248();
		Static106.method1602();
		Static514.method7054(arg3, arg2, arg1);
		Static109.method8576();
		Static187.method3195(Static273.aClass100_6);
		Static186.method3182(Static273.aClass100_6);
		Static250.method4078(Static27.aClass126_18, arg0 + 5, Static273.aClass100_6);
		Static220.method3523();
		Static502.method6975(Static326.aClass155Array13, arg0 + 15);
		if (arg0 != -5) {
			method6896(-67);
		}
		Static352.method5188(-73);
		Static569.method7681();
		if (Static652.anInt10664 == 3) {
			Static411.method6060(4, arg0 + 2);
		} else if (Static652.anInt10664 == 7) {
			Static411.method6060(8, arg0 + 2);
		} else if (Static652.anInt10664 == 9) {
			Static411.method6060(10, -3);
		} else if (Static652.anInt10664 == 11) {
			Static411.method6060(12, -3);
		} else if (Static652.anInt10664 == 1 || Static652.anInt10664 == 2) {
			Static114.method1700();
		}
	}
}
