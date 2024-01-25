import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static498 {

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "I")
	public static int anInt8882 = 0;

	@OriginalMember(owner = "client!ts", name = "j", descriptor = "I")
	public static int anInt8887 = 0;

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Z)V")
	public static void method7455(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static256.aClass224ArrayArrayArray1 = Static263.aClass224ArrayArrayArray2;
			Static47.aClass62Array1 = Static369.aClass62Array3;
		} else {
			Static256.aClass224ArrayArrayArray1 = Static398.aClass224ArrayArrayArray3;
			Static47.aClass62Array1 = Static53.aClass62Array2;
		}
		Static192.anInt4157 = Static256.aClass224ArrayArrayArray1.length;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)Z")
	public static boolean method7457(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(II)I")
	public static int method7458(@OriginalArg(0) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lclient!hk;Lclient!qq;Lclient!oa;IIBLclient!bv;I)V")
	public static void method7459(@OriginalArg(0) Class137 arg0, @OriginalArg(1) Class269 arg1, @OriginalArg(2) Class9 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class6_Sub7 arg5, @OriginalArg(7) int arg6) {
		@Pc(15) int local15 = arg5.anInt1367 - arg4 / 2 - 5;
		@Pc(23) int local23 = arg6 + 2;
		if (arg0.anInt4320 != 0) {
			arg2.method5409(arg1.method6548() * arg3 + arg6 + 1 - local23, arg4 + 10, arg0.anInt4320, local23, local15);
		}
		if (arg0.anInt4335 != 0) {
			arg2.method5444(local23, arg0.anInt4335, arg4 + 10, local15, arg1.method6548() * arg3 + arg6 + 1 - local23);
		}
		@Pc(76) int local76 = arg0.anInt4314;
		if (arg5.aBoolean146 && arg0.anInt4318 != -1) {
			local76 = arg0.anInt4318;
		}
		for (@Pc(88) int local88 = 0; local88 < arg3; local88++) {
			@Pc(94) String local94 = Static175.aStringArray21[local88];
			if (arg3 - 1 > local88) {
				local94 = local94.substring(0, local94.length() - 4);
			}
			arg1.method6553(arg2, local94, arg5.anInt1367, arg6, local76);
			arg6 += arg1.method6548();
		}
	}
}
