import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!ml", name = "R", descriptor = "[Lclient!kb;")
	public static final Class107[] aClass107Array1 = new Class107[14];

	@OriginalMember(owner = "client!ml", name = "S", descriptor = "[I")
	public static final int[] anIntArray315 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!ml", name = "T", descriptor = "I")
	public static int anInt3957 = -1;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIZI)I")
	public static int method3640(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class2_Sub26 local17 = Static42.method991(arg1, arg2);
		if (local17 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local17.anIntArray270.length) {
			return local17.anIntArray270[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BIII)V")
	public static void method3642(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		@Pc(14) Class105 local14 = Static122.aClass105ArrayArray3[arg0][arg1];
		Static86.method1932(5000, local14 == null ? Static49.aClass105_2 : local14);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIZJ)Ljava/lang/String;")
	public static String method3643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) long arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg0 == 0) {
			local9 = ',';
			local7 = '.';
		}
		if (arg0 == 2) {
			local9 = ' ';
		}
		@Pc(22) boolean local22 = false;
		if (arg3 < 0L) {
			local22 = true;
			arg3 = -arg3;
		}
		@Pc(41) StringBuffer local41 = new StringBuffer(26);
		@Pc(45) int local45;
		@Pc(50) int local50;
		if (arg1 > 0) {
			for (local45 = 0; local45 < arg1; local45++) {
				local50 = (int) arg3;
				arg3 /= 10L;
				local41.append((char) (local50 + 48 - (int) arg3 * 10));
			}
			local41.append(local7);
		}
		local45 = 0;
		while (true) {
			local50 = (int) arg3;
			arg3 /= 10L;
			local41.append((char) (local50 + 48 - (int) arg3 * 10));
			if (arg3 == 0L) {
				if (local22) {
					local41.append('-');
				}
				return local41.reverse().toString();
			}
			if (arg2) {
				local45++;
				if (local45 % 3 == 0) {
					local41.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(III)V")
	public static void method3644(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class211 local7 = Static40.method942(arg0);
		@Pc(10) int local10 = local7.anInt6888;
		@Pc(13) int local13 = local7.anInt6893;
		@Pc(24) int local24 = local7.anInt6895;
		@Pc(31) int local31 = Class61.anIntArray237[local24 - local13];
		if (arg1 < 0 || arg1 > local31) {
			arg1 = 0;
		}
		local31 <<= local13;
		Static169.method3191(local10, local31 & arg1 << local13 | Static147.anIntArray22[local10] & ~local31);
	}

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "(I)V")
	public static void method3645() {
		if (Static77.aClass4_6 != null) {
			Static77.aClass4_6.method4238();
			Static77.aClass4_6 = null;
			Static283.aClass37_6 = null;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method3646(@OriginalArg(1) String arg0) {
		if (Static88.aClass11Array1 != null) {
			Static74.aClass2_Sub10_Sub1_2.method2049(212);
			Static74.aClass2_Sub10_Sub1_2.method4430(Static124.method3876(arg0));
			Static74.aClass2_Sub10_Sub1_2.method4443(arg0);
		}
	}
}
