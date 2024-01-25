import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
	public static int anInt3099;

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
	public static int anInt3102;

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "[I")
	public static final int[] anIntArray118 = new int[6];

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IILjava/util/Random;)I")
	public static int method2611(@OriginalArg(1) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static152.method3040(arg0)) {
			return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
		} else {
			@Pc(41) int local41 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(44) int local44;
			do {
				local44 = arg1.nextInt();
			} while (local41 <= local44);
			return Static364.method5868(local44, arg0);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IILclient!oia;IIII)Z")
	public static boolean method2612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class243 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (!Static211.aBoolean331 || !Static260.aBoolean441) {
			return false;
		} else if (Static8.anInt519 < 100) {
			return false;
		} else if (arg3 != arg0 || arg4 != arg1) {
			for (@Pc(54) int local54 = arg0; local54 <= arg3; local54++) {
				for (@Pc(58) int local58 = arg1; local58 <= arg4; local58++) {
					if (Static483.anIntArrayArrayArray14[arg5][local54][local58] == -Static608.anInt10289) {
						return false;
					}
				}
			}
			if (Static252.method4483(arg2)) {
				Static528.anInt9204++;
				return true;
			} else {
				return false;
			}
		} else if (!Static267.method4826(arg5, arg1, arg0)) {
			return false;
		} else if (Static252.method4483(arg2)) {
			Static528.anInt9204++;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!sba;ZB)V")
	public static void method2614(@OriginalArg(0) Class302 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int local12 = arg0.anInt8891 == 0 ? arg0.anInt8909 : arg0.anInt8891;
		@Pc(24) int local24 = arg0.anInt8853 == 0 ? arg0.anInt8872 : arg0.anInt8853;
		Static239.method4875(arg1, Static299.aClass302ArrayArray2[arg0.anInt8867 >> 16], local12, local24, arg0.anInt8867);
		if (arg0.aClass302Array2 != null) {
			Static239.method4875(arg1, arg0.aClass302Array2, local12, local24, arg0.anInt8867);
		}
		@Pc(65) Class6_Sub25 local65 = (Class6_Sub25) Static214.aClass380_15.method8747((long) arg0.anInt8867);
		if (local65 != null) {
			Static644.method8780(local12, local65.anInt5034, arg1, local24);
		}
	}
}
