import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!il", name = "e", descriptor = "I")
	public static int anInt4321;

	@OriginalMember(owner = "client!il", name = "d", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_71 = new Class337(85, -1);

	@OriginalMember(owner = "client!il", name = "f", descriptor = "I")
	public static int anInt4322 = 0;

	@OriginalMember(owner = "client!il", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray29 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!il", name = "k", descriptor = "I")
	public static int anInt4326 = 0;

	@OriginalMember(owner = "client!il", name = "l", descriptor = "[Z")
	public static final boolean[] aBooleanArray13 = new boolean[200];

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(BLclient!oj;)I")
	public static int method3913(@OriginalArg(1) Class5_Sub5_Sub15 arg0) {
		@Pc(7) String local7 = Static404.method6045(arg0);
		@Pc(9) int[] local9 = null;
		if (Static155.method1877(arg0.anInt6765)) {
			local9 = Static643.aClass275_2.method6641((int) arg0.aLong172).anIntArray365;
		} else if (arg0.anInt6766 != -1) {
			local9 = Static643.aClass275_2.method6641(arg0.anInt6766).anIntArray365;
		} else if (Static390.method5792(arg0.anInt6765)) {
			@Pc(85) Class5_Sub3 local85 = (Class5_Sub3) Static445.aClass273_29.method6581((long) arg0.aLong172);
			if (local85 != null) {
				@Pc(90) Class4_Sub2_Sub1_Sub1_Sub2 local90 = local85.aClass4_Sub2_Sub1_Sub1_Sub2_1;
				@Pc(93) Class225 local93 = local90.aClass225_1;
				if (local93.anIntArray304 != null) {
					local93 = local93.method4990(Static301.aClass59_1);
				}
				if (local93 != null) {
					local9 = local93.anIntArray305;
				}
			}
		} else if (Static327.method4978(arg0.anInt6765)) {
			@Pc(50) Class181 local50;
			if (arg0.anInt6765 == 1006) {
				local50 = Static61.aClass246_7.method5497((int) arg0.aLong172);
			} else {
				local50 = Static61.aClass246_7.method5497((int) (arg0.aLong172 >>> 32 & 0x7FFFFFFFL));
			}
			if (local50.anIntArray235 != null) {
				local50 = local50.method4279(Static301.aClass59_1);
			}
			if (local50 != null) {
				local9 = local50.anIntArray238;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static439.method6671(local9);
		}
		@Pc(142) int local142 = Static485.aClass272_16.method6568(Static236.aClass28Array10, local7);
		if (arg0.aBoolean472) {
			local142 += Static17.aClass28_2.method4032() + 4;
		}
		return local142;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IZILclient!ha;)V")
	public static void method3914(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class133 arg2) {
		Static20.aClass48ArrayArray1 = new Class48[arg1][arg0];
		Static550.aClass133_14 = arg2;
		if (Static224.anIntArray214 != null) {
			Static575.aClass130_3 = Static376.method5534(Static224.anIntArray214[5], Static224.anIntArray214[2], Static224.anIntArray214[3], Static224.anIntArray214[0], Static224.anIntArray214[4], Static224.anIntArray214[1]);
		}
		Static484.aClass48_1 = new Class48();
		Static120.method1843();
	}
}
