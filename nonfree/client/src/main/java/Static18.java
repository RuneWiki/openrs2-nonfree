import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!au", name = "o", descriptor = "I")
	public static int anInt358 = 0;

	@OriginalMember(owner = "client!au", name = "p", descriptor = "[Lclient!mh;")
	public static final Interface5[] anInterface5Array1 = new Interface5[75];

	@OriginalMember(owner = "client!au", name = "x", descriptor = "Z")
	public static boolean aBoolean18 = false;

	@OriginalMember(owner = "client!au", name = "y", descriptor = "[Z")
	public static final boolean[] aBooleanArray10 = new boolean[8];

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IIII[BII)Z")
	public static boolean method303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg2 % 8;
		@Pc(13) int local13;
		if (local9 == 0) {
			local13 = 0;
		} else {
			local13 = 8 - local9;
		}
		@Pc(28) int local28 = -((arg0 + 7) / 8);
		@Pc(38) int local38 = -((arg2 + 7) / 8);
		for (@Pc(40) int local40 = local28; local40 < 0; local40++) {
			for (@Pc(44) int local44 = local38; local44 < 0; local44++) {
				if (arg3[arg1] == 0) {
					return true;
				}
				arg1 += 8;
			}
			arg1 -= local13;
			if (arg3[arg1 - 1] == 0) {
				return true;
			}
			arg1 += arg4;
		}
		return false;
	}

	@OriginalMember(owner = "client!au", name = "b", descriptor = "(I)V")
	public static void method304() {
		Static182.aClass30_12.method2084(Static363.aFloat88, Static341.aFloat84, Static199.aFloat3);
	}
}
