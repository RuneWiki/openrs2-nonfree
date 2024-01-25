import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "Lclient!uh;")
	public static Class201 aClass201_3;

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
	public static int anInt2150;

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "[Lclient!fc;")
	public static final Class64[] aClass64Array2 = new Class64[6];

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
	public static int anInt2152 = 104;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZI[III)V")
	public static void method1731(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg2--;
		@Pc(12) int local12 = arg0 - 1;
		@Pc(16) int local16 = local12 - 7;
		while (arg2 < local16) {
			@Pc(20) int local20 = arg2 + 1;
			arg1[local20] = arg3;
			@Pc(25) int local25 = local20 + 1;
			arg1[local25] = arg3;
			@Pc(30) int local30 = local25 + 1;
			arg1[local30] = arg3;
			@Pc(35) int local35 = local30 + 1;
			arg1[local35] = arg3;
			@Pc(40) int local40 = local35 + 1;
			arg1[local40] = arg3;
			@Pc(45) int local45 = local40 + 1;
			arg1[local45] = arg3;
			@Pc(50) int local50 = local45 + 1;
			arg1[local50] = arg3;
			arg2 = local50 + 1;
			arg1[arg2] = arg3;
		}
		while (arg2 < local12) {
			arg2++;
			arg1[arg2] = arg3;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	public static void method1732() {
		if (Static323.aBoolean424) {
			return;
		}
		Static323.aBoolean424 = true;
		Static105.aBoolean110 = true;
		if (Static165.aBoolean173) {
			Static57.aFloat3 = (int) Static57.aFloat3 + 191 & 0xFFFFFF80;
		} else {
			Static128.aFloat21 += (24.0F - Static128.aFloat21) / 2.0F;
		}
	}
}
