import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!in", name = "t", descriptor = "I")
	public static int anInt5791;

	@OriginalMember(owner = "client!in", name = "u", descriptor = "I")
	public static int anInt5792;

	@OriginalMember(owner = "client!in", name = "d", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_157 = new Class129(51, 9);

	@OriginalMember(owner = "client!in", name = "s", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_158 = new Class129(32, 3);

	@OriginalMember(owner = "client!in", name = "v", descriptor = "[I")
	public static final int[] anIntArray404 = new int[100];

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ILclient!ii;ILclient!za;II)V")
	public static void method4585(@OriginalArg(0) int arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class200 arg3, @OriginalArg(5) int arg4) {
		@Pc(9) Class59 local9 = Static203.aClass51_4.method1140(arg1.anInt2986);
		if (local9.anInt1624 == -1) {
			return;
		}
		if (arg1.aBoolean197) {
			@Pc(28) int local28 = arg2 + arg1.anInt2966;
			arg2 = local28 & 0x3;
		} else {
			arg2 = 0;
		}
		@Pc(40) Class49 local40 = local9.method1326(arg3, arg2, arg1.aBoolean195);
		if (local40 == null) {
			return;
		}
		@Pc(46) int local46 = arg1.anInt2990;
		@Pc(49) int local49 = arg1.anInt2993;
		if ((arg2 & 0x1) == 1) {
			local46 = arg1.anInt2993;
			local49 = arg1.anInt2990;
		}
		@Pc(63) int local63 = local40.RA();
		@Pc(66) int local66 = local40.Q();
		if (local9.aBoolean111) {
			local66 = local49 * 4;
			local63 = local46 * 4;
		}
		if (local9.anInt1625 == 0) {
			local40.method5789(arg4, arg0 - (local49 - 1) * 4, local63, local66);
		} else {
			local40.ya(arg4, arg0 - (local49 - 1) * 4, local63, local66, 0, local9.anInt1625 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(I)V")
	public static void method4586(@OriginalArg(0) int arg0) {
		Static252.anInt4106 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static439.anInt7318; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static459.anInt4775; local6++) {
				if (Static319.aClass258ArrayArrayArray3[arg0][local3][local6] == null) {
					Static319.aClass258ArrayArrayArray3[arg0][local3][local6] = new Class258(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(II)Z")
	public static boolean method4589(@OriginalArg(0) int arg0) {
		for (@Pc(15) Class5_Sub41 local15 = (Class5_Sub41) Static122.aClass177_13.method3618(); local15 != null; local15 = (Class5_Sub41) Static122.aClass177_13.method3619()) {
			if (Static449.method5910(local15.anInt6815) && local15.aLong215 == (long) arg0) {
				return true;
			}
		}
		return false;
	}
}
