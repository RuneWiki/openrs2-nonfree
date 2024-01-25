import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!sh", name = "j", descriptor = "J")
	public static long aLong198;

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray37 = new String[100];

	@OriginalMember(owner = "client!sh", name = "g", descriptor = "Z")
	public static boolean aBoolean421 = false;

	@OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
	public static int anInt5407 = -1;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IZII)I")
	public static int method4811(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class3_Sub18 local12 = Static214.method3324(arg2, arg1);
		if (local12 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(23) int local23 = 0;
			for (@Pc(25) int local25 = 0; local25 < local12.anIntArray227.length; local25++) {
				if (arg0 == local12.anIntArray226[local25]) {
					local23 += local12.anIntArray227[local25];
				}
			}
			return local23;
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I[[I)V")
	public static void method4812(@OriginalArg(1) int[][] arg0) {
		Static325.anIntArrayArray50 = arg0;
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)V")
	public static void method4813() {
		@Pc(7) Class106 local7 = null;
		try {
			@Pc(11) Class133 local11 = Static61.aClass156_1.method3645();
			while (local11.anInt3257 == 0) {
				Static37.method613(1L);
			}
			if (local11.anInt3257 == 1) {
				local7 = (Class106) local11.anObject3;
				@Pc(41) Class3_Sub5 local41 = new Class3_Sub5(Static348.anInt4438 * 6 + 3);
				local41.method2791(1);
				local41.method2749(Static348.anInt4438);
				for (@Pc(51) int local51 = 0; local51 < Static97.anIntArray196.length; local51++) {
					if (Static29.aBooleanArray105[local51]) {
						local41.method2749(local51);
						local41.method2782(Static97.anIntArray196[local51]);
					}
				}
				local7.method2289(local41.anInt3121, 0, local41.aByteArray42);
			}
		} catch (@Pc(82) Exception local82) {
		}
		try {
			if (local7 != null) {
				local7.method2290();
			}
		} catch (@Pc(93) Exception local93) {
		}
		Static150.aLong165 = Static288.method4512();
		Static363.aBoolean483 = false;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!qc;IIIII)V")
	public static void method4815(@OriginalArg(0) Class191 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt5884 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass3_Sub12_Sub1Array3[local4] != null) {
				arg0.anInt5884++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt5884; local22++) {
			@Pc(31) long local31 = Static201.aLongArrayArrayArray1[arg1][arg2][arg3];
			@Pc(41) Class3_Sub12_Sub1 local41;
			while (local31 != 0L) {
				local41 = Static19.aClass3_Sub12_Sub1Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41 == arg0.aClass3_Sub12_Sub1Array3[local22]) {
					continue label51;
				}
			}
			local31 = Static201.aLongArrayArrayArray1[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Static19.aClass3_Sub12_Sub1Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41 == arg0.aClass3_Sub12_Sub1Array3[local22]) {
					continue label51;
				}
			}
			for (@Pc(91) int local91 = local22; local91 < arg0.anInt5884 - 1; local91++) {
				arg0.aClass3_Sub12_Sub1Array3[local91] = arg0.aClass3_Sub12_Sub1Array3[local91 + 1];
			}
			arg0.anInt5884--;
		}
	}
}
