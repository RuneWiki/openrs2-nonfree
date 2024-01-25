import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!up", name = "e", descriptor = "[I")
	public static final int[] anIntArray464 = new int[1];

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Z)Lclient!lu;")
	public static Class51 method5292() {
		try {
			return (Class51) Class.forName("Class51_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return null;
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "([IIIII)V")
	public static void method5293(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg2--;
		@Pc(9) int local9 = arg3 - 1;
		@Pc(13) int local13 = local9 - 7;
		while (local13 > arg2) {
			@Pc(16) int local16 = arg2 + 1;
			arg0[local16] = arg1;
			@Pc(21) int local21 = local16 + 1;
			arg0[local21] = arg1;
			@Pc(26) int local26 = local21 + 1;
			arg0[local26] = arg1;
			@Pc(31) int local31 = local26 + 1;
			arg0[local31] = arg1;
			@Pc(36) int local36 = local31 + 1;
			arg0[local36] = arg1;
			@Pc(41) int local41 = local36 + 1;
			arg0[local41] = arg1;
			@Pc(46) int local46 = local41 + 1;
			arg0[local46] = arg1;
			arg2 = local46 + 1;
			arg0[arg2] = arg1;
		}
		while (arg2 < local9) {
			arg2++;
			arg0[arg2] = arg1;
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(ZBI)I")
	public static int method5295(@OriginalArg(2) int arg0) {
		@Pc(17) Class3_Sub32 local17 = Static238.method3609(arg0, false);
		if (local17 == null) {
			return Static77.aClass142_1.method3379(arg0).anInt1135;
		}
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < local17.anIntArray339.length; local29++) {
			if (local17.anIntArray339[local29] == -1) {
				local27++;
			}
		}
		return local27 + Static77.aClass142_1.method3379(arg0).anInt1135 - local17.anIntArray339.length;
	}
}
