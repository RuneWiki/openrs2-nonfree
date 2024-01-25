import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!hea", name = "v", descriptor = "I")
	public static int anInt4555;

	@OriginalMember(owner = "client!hea", name = "x", descriptor = "[I")
	public static final int[] anIntArray202 = new int[32];

	@OriginalMember(owner = "client!hea", name = "C", descriptor = "[I")
	public static final int[] anIntArray203 = new int[4];

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(II)V")
	public static void method3777(@OriginalArg(1) int arg0) {
		@Pc(16) Class6_Sub5_Sub19 local16 = Static348.method5721(arg0, 6);
		local16.method5174();
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(ZLclient!nba;Lclient!ha;)I")
	public static int method3779(@OriginalArg(1) Class215 arg0, @OriginalArg(2) Class5 arg1) {
		if (arg0.anInt7042 != -1) {
			return arg0.anInt7042;
		}
		if (arg0.anInt7046 != -1) {
			@Pc(26) Class254 local26 = arg1.anInterface7_10.method6931(arg0.anInt7046);
			if (!local26.aBoolean618) {
				return local26.aShort91;
			}
		}
		return arg0.anInt7040;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIIIZ)V")
	public static void method3780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static409.method6426();
		Static408.aLong202 = 0L;
		@Pc(12) int local12 = Static326.method5447();
		if (arg0 == 3 || local12 == 3) {
			arg3 = true;
		}
		if (!Static467.aClass5_13.method6163()) {
			arg3 = true;
		}
		Static215.method3837(arg0, arg3, local12, arg1, arg2);
	}
}
