import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!cp", name = "l", descriptor = "I")
	public static int anInt1349;

	@OriginalMember(owner = "client!cp", name = "n", descriptor = "[I")
	public static final int[] anIntArray202 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!cp", name = "p", descriptor = "[I")
	public static final int[] anIntArray203 = new int[100];

	@OriginalMember(owner = "client!cp", name = "t", descriptor = "[I")
	public static final int[] anIntArray204 = new int[8];

	@OriginalMember(owner = "client!cp", name = "y", descriptor = "I")
	public static int anInt1359 = 0;

	@OriginalMember(owner = "client!cp", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString95 = "flash2:";

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IILclient!vj;IIILclient!bi;Lclient!kb;)V")
	public static void method1084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class64 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class26 arg5, @OriginalArg(7) Class52 arg6) {
		if (arg6 == null) {
			return;
		}
		@Pc(16) int local16;
		if (Static118.anInt6324 == 4) {
			local16 = (int) Static351.aFloat80 & 0x3FFF;
		} else {
			local16 = Static218.anInt4347 + (int) Static351.aFloat80 & 0x3FFF;
		}
		@Pc(34) int local34 = Math.max(arg5.anInt523 / 2, arg5.anInt515 / 2) + 10;
		@Pc(42) int local42 = arg0 * arg0 + arg1 * arg1;
		if (local42 > local34 * local34) {
			return;
		}
		@Pc(56) int local56 = Class147.anIntArray604[local16];
		@Pc(60) int local60 = Class147.anIntArray603[local16];
		if (Static118.anInt6324 != 4) {
			local56 = local56 * 256 / (anInt1359 + 256);
			local60 = local60 * 256 / (anInt1359 + 256);
		}
		@Pc(89) int local89 = arg0 * local56 + local60 * arg1 >> 15;
		@Pc(99) int local99 = local60 * arg0 - local56 * arg1 >> 15;
		arg6.method4122(arg3 + arg5.anInt523 / 2 + local89 - arg6.method4141() / 2, -local99 + (arg5.anInt515 / 2 + arg4 - arg6.method4140() / 2), arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(BC)C")
	public static char method1085(@OriginalArg(1) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(BI)V")
	public static void method1086(@OriginalArg(1) int arg0) {
		@Pc(1) Class202 local1 = Static263.aClass202_1;
		synchronized (Static263.aClass202_1) {
			Static81.anInt2142 = arg0;
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(BII)I")
	public static int method1087(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static246.anIntArray643[arg0 & 0x3] : Static270.anIntArray681[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(B)V")
	public static void method1088() {
		Static85.anInt2209 = 0;
		Static69.anInt1716 = 0;
		Static51.method1094();
		Static212.method3774();
		Static277.method4665();
		Static152.method2974();
		@Pc(30) int local30;
		for (@Pc(25) int local25 = 0; local25 < Static69.anInt1716; local25++) {
			local30 = Static53.anIntArray207[local25];
			if (Static157.aClass22_Sub2_Sub1_Sub1Array1[local30].anInt5096 != Static212.anInt4234) {
				if (Static157.aClass22_Sub2_Sub1_Sub1Array1[local30].anInt1004 > 0) {
					Static291.method4772(Static157.aClass22_Sub2_Sub1_Sub1Array1[local30]);
				}
				Static157.aClass22_Sub2_Sub1_Sub1Array1[local30] = null;
			}
		}
		if (Static200.aClass7_Sub3_Sub2_3.anInt3005 != Static54.anInt1421) {
			throw new RuntimeException("gpp1 pos:" + Static200.aClass7_Sub3_Sub2_3.anInt3005 + " psize:" + Static54.anInt1421);
		}
		for (local30 = 0; local30 < Static223.anInt4466; local30++) {
			if (Static157.aClass22_Sub2_Sub1_Sub1Array1[Static314.anIntArray758[local30]] == null) {
				throw new RuntimeException("gpp2 pos:" + local30 + " size:" + Static223.anInt4466);
			}
		}
	}
}
