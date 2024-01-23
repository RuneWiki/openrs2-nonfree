import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
	public static int anInt4625;

	@OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
	public static int anInt4628;

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "Lclient!an;")
	public static Class10 aClass10_50 = new Class10();

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "Lclient!tb;")
	public static Class59_Sub2 aClass59_Sub2_3 = null;

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString157 = "green:";

	@OriginalMember(owner = "client!sd", name = "t", descriptor = "Z")
	public static boolean aBoolean301 = false;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static222.method3559(arg2)) {
			Static40.method677(Static148.aClass22ArrayArray1[arg2], -1, arg5, arg1, arg3, arg6, arg4, arg0);
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method3694(@OriginalArg(0) String arg0) {
		@Pc(4) int local4 = arg0.length();
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < local4; local8++) {
			local6 = (local6 << 5) + Static33.method482(arg0.charAt(local8)) - local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IILjava/util/Random;)I")
	public static int method3695(@OriginalArg(0) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static299.method4399(arg0)) {
			return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(38) int local38 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(41) int local41;
			do {
				local41 = arg1.nextInt();
			} while (local38 <= local41);
			return Static34.method490(arg0, local41);
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V")
	public static void method3696() {
		aClass10_50 = null;
		aString157 = null;
		aClass59_Sub2_3 = null;
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)V")
	public static void method3697() {
		if (!Static178.aBoolean216 || Static111.aBoolean163) {
			return;
		}
		@Pc(26) Class4_Sub11[][][] local26 = Static127.aClass4_Sub11ArrayArrayArray1;
		for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
			@Pc(40) Class4_Sub11[][] local40 = local26[local28];
			for (@Pc(42) int local42 = 0; local42 < local40.length; local42++) {
				for (@Pc(48) int local48 = 0; local48 < local40[local42].length; local48++) {
					@Pc(64) Class4_Sub11 local64 = local40[local42][local48];
					if (local64 != null) {
						@Pc(84) Class12_Sub2_Sub2 local84;
						if (local64.aClass135_1 != null && local64.aClass135_1.aClass12_8 instanceof Class12_Sub2_Sub2) {
							local84 = (Class12_Sub2_Sub2) local64.aClass135_1.aClass12_8;
							if ((local64.aClass135_1.aLong147 & Long.MIN_VALUE) == 0L) {
								local84.method3197(false, true, true, false, true, true);
							} else {
								local84.method3197(true, true, true, true, true, true);
							}
						}
						if (local64.aClass104_1 != null) {
							if (local64.aClass104_1.aClass12_6 instanceof Class12_Sub2_Sub2) {
								local84 = (Class12_Sub2_Sub2) local64.aClass104_1.aClass12_6;
								if ((Long.MIN_VALUE & local64.aClass104_1.aLong112) == 0L) {
									local84.method3197(false, true, true, false, true, true);
								} else {
									local84.method3197(true, true, true, true, true, true);
								}
							}
							if (local64.aClass104_1.aClass12_7 instanceof Class12_Sub2_Sub2) {
								local84 = (Class12_Sub2_Sub2) local64.aClass104_1.aClass12_7;
								if ((Long.MIN_VALUE & local64.aClass104_1.aLong112) == 0L) {
									local84.method3197(false, true, true, false, true, true);
								} else {
									local84.method3197(true, true, true, true, true, true);
								}
							}
						}
						if (local64.aClass43_1 != null) {
							if (local64.aClass43_1.aClass12_5 instanceof Class12_Sub2_Sub2) {
								local84 = (Class12_Sub2_Sub2) local64.aClass43_1.aClass12_5;
								if ((local64.aClass43_1.aLong44 & Long.MIN_VALUE) == 0L) {
									local84.method3197(false, true, true, false, true, true);
								} else {
									local84.method3197(true, true, true, true, true, true);
								}
							}
							if (local64.aClass43_1.aClass12_4 instanceof Class12_Sub2_Sub2) {
								local84 = (Class12_Sub2_Sub2) local64.aClass43_1.aClass12_4;
								if ((Long.MIN_VALUE & local64.aClass43_1.aLong44) == 0L) {
									local84.method3197(false, true, true, false, true, true);
								} else {
									local84.method3197(true, true, true, true, true, true);
								}
							}
						}
						for (@Pc(279) int local279 = 0; local279 < local64.anInt1054; local279++) {
							if (local64.aClass173Array1[local279].aClass12_10 instanceof Class12_Sub2_Sub2) {
								@Pc(302) Class12_Sub2_Sub2 local302 = (Class12_Sub2_Sub2) local64.aClass173Array1[local279].aClass12_10;
								if ((Long.MIN_VALUE & local64.aClass173Array1[local279].aLong183) == 0L) {
									local302.method3197(false, true, true, false, true, true);
								} else {
									local302.method3197(true, true, true, true, true, true);
								}
							}
						}
					}
				}
			}
		}
		Static111.aBoolean163 = true;
	}
}
