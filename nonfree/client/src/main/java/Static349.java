import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "[Lclient!o;")
	public static Class55[] aClass55Array3;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIII)I")
	public static int method4872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) int local16 = 255 - arg1;
		@Pc(34) int local34 = ((arg0 & 0xFF00FF) * arg1 & 0xFF00FF00 | (arg0 & 0xFF00) * arg1 & 0xFF0000) >>> 8;
		return local34 + ((local16 * (arg2 & 0xFF00FF) & 0xFF00FF00 | (arg2 & 0xFF00) * local16 & 0xFF0000) >>> 8);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IBLclient!wk;II)V")
	public static void method4873(@OriginalArg(2) Class1_Sub2_Sub6_Sub2 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		@Pc(10) int local10 = arg0.anIntArray510[0];
		@Pc(15) int local15 = arg0.anIntArray509[0];
		if (local10 < 0 || Static373.anInt6324 <= local10 || local15 < 0 || local15 >= Static291.anInt5062 || (arg2 < 0 || arg2 >= Static373.anInt6324 || arg1 < 0 || arg1 >= Static291.anInt5062)) {
			return;
		}
		@Pc(80) int local80 = Static454.method6201(Static226.anIntArray444, 0, local15, 0, 0, -4, arg1, true, arg0.method6204(), arg2, Static296.anIntArray328, Static250.aClass128Array1[arg0.aByte101], 0, local10);
		if (local80 >= 1 && local80 <= 3) {
			for (@Pc(92) int local92 = 0; local92 < local80 - 1; local92++) {
				arg0.method6215(Static296.anIntArray328[local92], Static226.anIntArray444[local92], (byte) 2);
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLclient!hi;I)Lclient!j;")
	public static Class114 method4874(@OriginalArg(1) Class1_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class114 local9;
		if (Static455.aClass114_3 == null) {
			local9 = new Class114();
		} else {
			local9 = Static455.aClass114_3;
			Static455.aClass114_3 = Static455.aClass114_3.aClass114_1;
			Static420.anInt7106--;
			local9.aClass114_1 = null;
		}
		local9.anInt3395 = arg1;
		local9.aClass1_Sub2_1 = arg0;
		return local9;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/lang/String;IBLjava/lang/String;Ljava/lang/String;)V")
	public static void method4875(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4) {
		Static114.method1846(arg4, null, arg2, arg1, -1, arg3, arg0);
	}
}
