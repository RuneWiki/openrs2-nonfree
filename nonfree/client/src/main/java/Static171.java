import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!gfa", name = "b", descriptor = "I")
	public static int anInt9038;

	@OriginalMember(owner = "client!gfa", name = "c", descriptor = "I")
	public static int anInt9039;

	@OriginalMember(owner = "client!gfa", name = "d", descriptor = "Lclient!xa;")
	public static Class71 aClass71_55;

	@OriginalMember(owner = "client!gfa", name = "g", descriptor = "I")
	public static final int anInt9042 = 1400;

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(III)V")
	public static void method7158(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13;
		if (Static35.anInt670 != arg0) {
			Static372.anIntArray481 = new int[arg0];
			for (local13 = 0; local13 < arg0; local13++) {
				Static372.anIntArray481[local13] = (local13 << 12) / arg0;
			}
			Static147.anInt2781 = arg0 - 1;
			Static224.anInt4114 = arg0 * 32;
			Static35.anInt670 = arg0;
		}
		if (arg1 == Static170.anInt3133) {
			return;
		}
		if (Static35.anInt670 == arg1) {
			Static77.anIntArray116 = Static372.anIntArray481;
		} else {
			Static77.anIntArray116 = new int[arg1];
			for (local13 = 0; local13 < arg1; local13++) {
				Static77.anIntArray116[local13] = (local13 << 12) / arg1;
			}
		}
		Static132.anInt2511 = arg1 - 1;
		Static170.anInt3133 = arg1;
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IILclient!ba;II)Lclient!ac;")
	public static Class4 method7159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class24 arg2, @OriginalArg(3) int arg3) {
		return arg2 == null ? null : new Class4(arg0, arg1, arg3, arg2.ZA(), arg2.ha(), arg2.M(), arg2.DA(), arg2.EA(), arg2.LA(), arg2.K());
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(Z[B)V")
	public static void method7161(@OriginalArg(1) byte[] arg0) {
		@Pc(20) Class6_Sub12 local20 = new Class6_Sub12(arg0);
		while (true) {
			while (true) {
				@Pc(24) int local24 = local20.method6019();
				if (local24 == 0) {
					return;
				}
				if (local24 == 1) {
					@Pc(37) int[] local37 = Static528.anIntArray644 = new int[6];
					local37[0] = local20.method6044();
					local37[1] = local20.method6044();
					local37[2] = local20.method6044();
					local37[3] = local20.method6044();
					local37[4] = local20.method6044();
					local37[5] = local20.method6044();
				} else {
					@Pc(85) int local85;
					@Pc(90) int local90;
					if (local24 == 4) {
						local85 = local20.method6019();
						Static167.anIntArray290 = new int[local85];
						for (local90 = 0; local90 < local85; local90++) {
							Static167.anIntArray290[local90] = local20.method6044();
							if (Static167.anIntArray290[local90] == 65535) {
								Static167.anIntArray290[local90] = -1;
							}
						}
					} else if (local24 == 5) {
						local85 = local20.method6019();
						Static518.anIntArray629 = new int[local85];
						for (local90 = 0; local90 < local85; local90++) {
							Static518.anIntArray629[local90] = local20.method6044();
							if (Static518.anIntArray629[local90] == 65535) {
								Static518.anIntArray629[local90] = -1;
							}
						}
					}
				}
			}
		}
	}
}
