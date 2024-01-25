import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!aaa", name = "D", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_3 = new Class239(102, 12);

	@OriginalMember(owner = "client!aaa", name = "L", descriptor = "I")
	public static int anInt104 = 0;

	@OriginalMember(owner = "client!aaa", name = "X", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_4 = new Class239(41, -1);

	@OriginalMember(owner = "client!aaa", name = "Z", descriptor = "I")
	public static int anInt111 = 0;

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(BIIII)I")
	public static int method261(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg0 & 0xF;
		@Pc(16) int local16 = local7 >= 8 ? arg1 : arg2;
		@Pc(41) int local41 = local7 < 4 ? arg1 : local7 == 12 || local7 == 14 ? arg2 : arg3;
		return ((local7 & 0x1) == 0 ? local16 : -local16) + ((local7 & 0x2) == 0 ? local41 : -local41);
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(BZ)Z")
	public static boolean method262(@OriginalArg(1) boolean arg0) {
		@Pc(6) boolean local6 = Static103.aClass39_3.method6043();
		if (arg0 == local6) {
			return true;
		}
		if (!arg0) {
			Static103.aClass39_3.method6076();
		} else if (!Static103.aClass39_3.method6025()) {
			arg0 = false;
		}
		if (local6 == arg0) {
			return false;
		} else {
			Static281.aClass2_Sub19_Sub1_1.aBoolean192 = arg0;
			Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
			return true;
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Lclient!wo;I)I")
	public static int method263(@OriginalArg(0) Class316 arg0) {
		if (arg0 == Static441.aClass316_4) {
			return 9216;
		} else if (Static244.aClass316_2 == arg0) {
			return 34065;
		} else if (arg0 == Static421.aClass316_3) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Lclient!jq;IFFIIFIFIF)[B")
	public static byte[] method265(@OriginalArg(0) Class148 arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(6) float arg3, @OriginalArg(8) float arg4, @OriginalArg(10) float arg5) {
		@Pc(26) byte[] local26 = new byte[262144];
		Static150.method2605(arg1, 0, arg2, local26, arg3, arg5, arg0, arg4);
		return local26;
	}
}
