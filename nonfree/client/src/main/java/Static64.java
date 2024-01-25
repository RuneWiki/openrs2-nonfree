import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!cn", name = "C", descriptor = "I")
	public static int anInt1870;

	@OriginalMember(owner = "client!cn", name = "x", descriptor = "I")
	public static int anInt1865 = -1;

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "(III)Lclient!nj;")
	public static Class206 method1808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static313.aClass206ArrayArrayArray2[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static313.aClass206ArrayArrayArray2[0][arg1][arg2] != null && Static313.aClass206ArrayArrayArray2[0][arg1][arg2].aClass206_1 != null;
			if (local28 && arg0 >= Static538.anInt9338 - 1) {
				return null;
			}
			Static336.method5472(arg0, arg1, arg2);
		}
		return Static313.aClass206ArrayArrayArray2[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ZIIZ)Ljava/lang/String;")
	public static String method1809(@OriginalArg(2) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(34) int local34 = 2;
		for (@Pc(38) int local38 = arg0 / 10; local38 != 0; local38 /= 10) {
			local34++;
		}
		@Pc(52) char[] local52 = new char[local34];
		local52[0] = '+';
		for (@Pc(69) int local69 = local34 - 1; local69 > 0; local69--) {
			@Pc(72) int local72 = arg0;
			arg0 /= 10;
			@Pc(83) int local83 = local72 - arg0 * 10;
			if (local83 < 10) {
				local52[local69] = (char) (local83 + 48);
			} else {
				local52[local69] = (char) (local83 + 87);
			}
		}
		return new String(local52);
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(IIII)I")
	public static int method1810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static52.anInt1508 < 100) {
			return -2;
		}
		@Pc(10) int local10 = -2;
		@Pc(12) int local12 = Integer.MAX_VALUE;
		@Pc(17) int local17 = arg2 - Static451.anInt3553;
		@Pc(21) int local21 = arg0 - Static451.anInt3558;
		for (@Pc(26) Class1_Sub25 local26 = (Class1_Sub25) Static451.aClass38_28.method1419(); local26 != null; local26 = (Class1_Sub25) Static451.aClass38_28.method1415()) {
			if (arg1 == local26.anInt4556) {
				@Pc(38) int local38 = local26.anInt4561;
				@Pc(41) int local41 = local26.anInt4557;
				@Pc(52) int local52 = local41 + Static451.anInt3558 | Static451.anInt3553 + local38 << 14;
				@Pc(71) int local71 = (local17 - local38) * (-local38 + local17) + (local21 - local41) * (local21 - local41);
				if (local10 < 0 || local71 < local12) {
					local10 = local52;
					local12 = local71;
				}
			}
		}
		return local10;
	}
}
