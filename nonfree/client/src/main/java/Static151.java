import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
	public static int anInt3083;

	@OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
	public static int anInt3085;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "[I")
	public static final int[] anIntArray300 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "J")
	public static volatile long aLong75 = 0L;

	@OriginalMember(owner = "client!kg", name = "j", descriptor = "Z")
	public static final boolean aBoolean238 = false;

	@OriginalMember(owner = "client!kg", name = "m", descriptor = "[B")
	public static final byte[] aByteArray39 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(I[[IZILclient!ii;)V")
	public static void method2631(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class105 arg3) {
		for (@Pc(12) int local12 = 0; local12 < arg0; local12++) {
			@Pc(18) int[][] local18;
			@Pc(30) int local30;
			@Pc(34) int local34;
			if (arg1 == null) {
				local18 = null;
			} else {
				local18 = new int[Static43.anInt1151 + 1][Static260.anInt5348 + 1];
				for (local30 = 0; local30 <= Static260.anInt5348; local30++) {
					for (local34 = 0; local34 <= Static43.anInt1151; local34++) {
						local18[local34][local30] = Static276.anIntArrayArrayArray12[local12][local34][local30] - arg1[local34][local30];
					}
				}
			}
			local30 = 0;
			local34 = 0;
			if (!arg2) {
				if (Static50.aBoolean83) {
					local30 = 2;
				}
				if (Static347.aBoolean550) {
					local34 = 8;
				}
				if (Static256.anInt5260 != 0) {
					if (local12 == 0 || Static267.anInt5492 >= 96) {
						local34 |= 0x10;
					}
					local30 |= 0x1;
				}
			}
			if (Static50.aBoolean83) {
				local34 |= 0x7;
			}
			@Pc(121) Class12 local121 = arg3.method4231(Static43.anInt1151, Static260.anInt5348, Static276.anIntArrayArrayArray12[local12], local18, local30, local34);
			Static11.method5108(local12, local121);
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)I")
	public static int method2632() {
		if (Static291.aFrame1 == null) {
			return Static3.aBoolean5 ? 2 : 1;
		} else {
			return 3;
		}
	}
}
