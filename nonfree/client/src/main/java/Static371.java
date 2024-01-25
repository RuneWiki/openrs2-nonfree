import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!pn", name = "d", descriptor = "Lclient!kr;")
	public static Class171 aClass171_111;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_88 = new Class306(" more options", " weitere Optionen", " autres options", " mais opções");

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "I")
	public static int anInt6837 = 0;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIII)Z")
	public static boolean method5719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if ((Static530.aByteArrayArrayArray17[0][arg2][arg1] & 0x2) != 0) {
			return true;
		} else if ((Static530.aByteArrayArrayArray17[arg0][arg2][arg1] & 0x10) == 0) {
			return Static435.method6297(arg0, arg2, arg1) == arg3;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!k;III[Z)V")
	public static void method5720(@OriginalArg(0) Class1_Sub1_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static544.aClass205Array3 == Static209.aClass205Array2) {
			return;
		}
		@Pc(9) int local9 = Static16.aClass205Array1[arg1].aa(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class205 local22 = Static16.aClass205Array1[local11];
				if (local22 != null) {
					local22.F(arg0, arg2, local9 - local22.aa(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V")
	public static void method5721(@OriginalArg(0) int arg0) {
		Static227.anInt4494 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static93.anInt1898; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static382.anInt6965; local6++) {
				if (Static242.aClass255ArrayArrayArray2[arg0][local3][local6] == null) {
					Static242.aClass255ArrayArrayArray2[arg0][local3][local6] = new Class255(arg0, local3, local6);
				}
			}
		}
	}
}
