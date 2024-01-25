import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!il", name = "J", descriptor = "Lclient!kn;")
	public static final Class116 aClass116_26 = new Class116();

	@OriginalMember(owner = "client!il", name = "Q", descriptor = "I")
	public static int anInt3159 = 0;

	@OriginalMember(owner = "client!il", name = "a", descriptor = "([IIIBI)V")
	public static void method2878(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		arg3--;
		@Pc(12) int local12 = arg1 - 1;
		@Pc(16) int local16 = local12 - 7;
		while (arg3 < local16) {
			@Pc(20) int local20 = arg3 + 1;
			arg0[local20] = arg2;
			@Pc(25) int local25 = local20 + 1;
			arg0[local25] = arg2;
			@Pc(30) int local30 = local25 + 1;
			arg0[local30] = arg2;
			@Pc(35) int local35 = local30 + 1;
			arg0[local35] = arg2;
			@Pc(40) int local40 = local35 + 1;
			arg0[local40] = arg2;
			@Pc(45) int local45 = local40 + 1;
			arg0[local45] = arg2;
			@Pc(50) int local50 = local45 + 1;
			arg0[local50] = arg2;
			arg3 = local50 + 1;
			arg0[arg3] = arg2;
		}
		while (arg3 < local12) {
			arg3++;
			arg0[arg3] = arg2;
		}
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V")
	public static void method2880() {
		@Pc(1) Class198 local1 = Static269.aClass198_194;
		synchronized (Static269.aClass198_194) {
			Static269.aClass198_194.method5209();
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IB)V")
	public static void method2881(@OriginalArg(0) int arg0) {
		if (Static90.anInt2481 == arg0) {
			return;
		}
		Static350.anInt6637 = Static105.anInt2647 = Static39.anIntArray47[arg0];
		Static274.aClass47_9.method2655(50, (int) ((double) Static350.anInt6637 * 34.46D));
		Static345.anIntArrayArrayArray41 = new int[4][Static350.anInt6637 >> 3][Static105.anInt2647 >> 3];
		Static293.anIntArrayArray119 = new int[Static350.anInt6637][Static105.anInt2647];
		Static101.anIntArrayArray185 = new int[Static350.anInt6637][Static105.anInt2647];
		for (@Pc(46) int local46 = 0; local46 < 4; local46++) {
			Static16.aClass170Array1[local46] = Static125.method2587(Static105.anInt2647, Static350.anInt6637);
		}
		Static63.aByteArrayArrayArray3 = new byte[4][Static350.anInt6637][Static105.anInt2647];
		Static64.method1350(Static105.anInt2647, Static350.anInt6637);
		Static142.method2955(Static274.aClass47_9, Static105.anInt2647 >> 3, Static350.anInt6637 >> 3);
		Static90.anInt2481 = arg0;
	}

	@OriginalMember(owner = "client!il", name = "e", descriptor = "(I)V")
	public static void method2882() {
		Static24.aClass198_22.method5213();
		Static105.aClass198_90.method5213();
	}
}
