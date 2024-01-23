import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
	public static int anInt5668;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "[I")
	public static int[] anIntArray665 = new int[14];

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "J")
	public static volatile long aLong189 = 0L;

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "Z")
	public static boolean aBoolean429 = true;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(III)J")
	public static long method4359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub19 local7 = Static130.aClass1_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass167_1 == null ? 0L : local7.aClass167_1.aLong178;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILclient!ak;)V")
	public static void method4361(@OriginalArg(1) Class7 arg0) {
		Static186.aClass7_152 = arg0;
		Static47.anInt5867 = Static186.aClass7_152.method265(4);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(CB)Z")
	public static boolean method4362(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(31) char[] local31 = Static119.aCharArray16;
			for (@Pc(33) int local33 = 0; local33 < local31.length; local33++) {
				@Pc(41) char local41 = local31[local33];
				if (arg0 == local41) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(BLclient!jj;)V")
	public static void method4363(@OriginalArg(1) Class1_Sub18 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static110.anInt2065; local7++) {
			@Pc(18) int local18 = arg0.method3117();
			@Pc(22) int local22 = arg0.method3107();
			if (local22 == 65535) {
				local22 = -1;
			}
			if (Static46.aClass152_Sub1Array2[local18] != null) {
				Static46.aClass152_Sub1Array2[local18].anInt5084 = local22;
			}
		}
	}
}
