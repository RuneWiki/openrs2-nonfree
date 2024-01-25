import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!hp", name = "k", descriptor = "Lclient!qm;")
	public static Class192 aClass192_4;

	@OriginalMember(owner = "client!hp", name = "m", descriptor = "I")
	public static int anInt2675;

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_66 = new Class211(41, 3);

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "I")
	public static int anInt2670 = 0;

	@OriginalMember(owner = "client!hp", name = "h", descriptor = "[I")
	public static final int[] anIntArray323 = new int[13];

	@OriginalMember(owner = "client!hp", name = "j", descriptor = "I")
	public static int anInt2673 = 0;

	@OriginalMember(owner = "client!hp", name = "l", descriptor = "I")
	public static int anInt2674 = 0;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIIII)V")
	public static void method2169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) float local9 = (float) Static353.anInt2630 / (float) Static353.anInt2621;
		@Pc(11) int local11 = arg3;
		@Pc(13) int local13 = arg1;
		if (local9 < 1.0F) {
			local13 = (int) ((float) arg3 * local9);
		} else {
			local11 = (int) ((float) arg1 / local9);
		}
		@Pc(40) int local40 = arg0 - (arg3 - local11) / 2;
		@Pc(53) int local53 = arg2 - (arg1 - local13) / 2;
		Static359.anInt6301 = -1;
		Static386.anInt6289 = Static353.anInt2621 * local40 / local11;
		Static390.anInt6367 = -1;
		Static299.anInt6015 = Static353.anInt2630 - Static353.anInt2630 * local53 / local13;
		Static201.method2874();
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!se;Z)I")
	public static int method2170(@OriginalArg(0) Class1_Sub40 arg0) {
		@Pc(7) String local7 = Static180.method2597(arg0);
		@Pc(16) int[] local16 = null;
		if (Static5.method56(arg0.anInt5411)) {
			local16 = Static263.aClass102_2.method2172((int) arg0.aLong172).anIntArray261;
		} else if (arg0.anInt5412 != -1) {
			local16 = Static263.aClass102_2.method2172(arg0.anInt5412).anIntArray261;
		} else if (Static70.method1142(arg0.anInt5411)) {
			@Pc(45) Class25_Sub1_Sub1_Sub2 local45 = Static171.aClass25_Sub1_Sub1_Sub2Array1[(int) arg0.aLong172];
			if (local45 != null) {
				@Pc(50) Class59 local50 = local45.aClass59_1;
				if (local50.anIntArray186 != null) {
					local50 = local50.method1150(Static230.aClass72_3);
				}
				if (local50 != null) {
					local16 = local50.anIntArray188;
				}
			}
		} else if (Static265.method4069(arg0.anInt5411)) {
			@Pc(84) Class236 local84;
			if (arg0.anInt5411 == 1008) {
				local84 = Static54.aClass153_1.method3081((int) arg0.aLong172);
			} else {
				local84 = Static54.aClass153_1.method3081((int) (arg0.aLong172 >>> 32 & 0x7FFFFFFFL));
			}
			if (local84.anIntArray706 != null) {
				local84 = local84.method5074(Static230.aClass72_3);
			}
			if (local84 != null) {
				local16 = local84.anIntArray707;
			}
		}
		if (local16 != null) {
			local7 = local7 + Static139.method2130(local16);
		}
		@Pc(136) int local136 = Static102.aClass110_3.method2412(local7, Static134.aClass51Array10);
		if (arg0.aBoolean510) {
			local136 += Static294.aClass51_16.method4685() + 4;
		}
		return local136;
	}
}
