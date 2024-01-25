import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
	public static int anInt4405;

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "[Lclient!sf;")
	public static Class8_Sub1[] aClass8_Sub1Array1;

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "Lclient!dc;")
	public static final Class40 aClass40_1 = new Class40();

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "[I")
	public static final int[] anIntArray381 = new int[25];

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIILclient!qo;)V")
	public static void method3910(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class8_Sub5 arg3) {
		if (Static273.aClass128ArrayArrayArray4[arg0][arg1][arg2] == null) {
			Static269.method4620(arg0, arg1, arg2);
		}
		Static273.aClass128ArrayArrayArray4[arg0][arg1][arg2].aClass8_Sub5_1 = arg3;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZIBIZ)I")
	public static int method3911(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) boolean arg2) {
		@Pc(18) Class4_Sub44 local18 = Static92.method531(false, arg0);
		if (local18 == null) {
			return 0;
		}
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local18.anIntArray502.length; local26++) {
			if (local18.anIntArray502[local26] >= 0 && local18.anIntArray502[local26] < Static2.anInt58) {
				@Pc(46) Class210 local46 = Static177.method3465(local18.anIntArray502[local26]);
				@Pc(55) int local55 = local46.method5460(arg1, Static157.method3056(arg1).anInt6440);
				if (arg2) {
					local24 += local18.anIntArray503[local26] * local55;
				} else {
					local24 += local55;
				}
			}
		}
		return local24;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)V")
	public static void method3912(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static24.aClass198_22 = new Class198(arg0);
		Static105.aClass198_90 = new Class198(arg1);
	}
}
