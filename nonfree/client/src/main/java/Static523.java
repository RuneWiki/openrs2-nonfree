import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static523 {

	@OriginalMember(owner = "client!vt", name = "l", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_19 = new Class306(4);

	@OriginalMember(owner = "client!vt", name = "h", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_15 = new Class306(1);

	@OriginalMember(owner = "client!vt", name = "e", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_12 = new Class306(1);

	@OriginalMember(owner = "client!vt", name = "f", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_13 = new Class306(2);

	@OriginalMember(owner = "client!vt", name = "g", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_14 = new Class306(4);

	@OriginalMember(owner = "client!vt", name = "i", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_16 = new Class306(2);

	@OriginalMember(owner = "client!vt", name = "j", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_17 = new Class306(4);

	@OriginalMember(owner = "client!vt", name = "k", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_18 = new Class306(2);

	@OriginalMember(owner = "client!vt", name = "m", descriptor = "[I")
	public static final int[] anIntArray682 = new int[2048];

	@OriginalMember(owner = "client!vt", name = "n", descriptor = "Z")
	public static boolean aBoolean643 = false;

	@OriginalMember(owner = "client!vt", name = "o", descriptor = "I")
	public static int anInt8857 = -1;

	@OriginalMember(owner = "client!vt", name = "p", descriptor = "[F")
	public static final float[] aFloatArray71 = new float[4];

	@OriginalMember(owner = "client!vt", name = "q", descriptor = "I")
	public static int anInt8858 = -50;

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(III)Z")
	public static boolean method7168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static481.anIntArrayArrayArray12[arg0][arg1][arg2];
		if (local7 == -Static108.anInt2350) {
			return false;
		} else if (local7 == Static108.anInt2350) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << Static270.anInt5288;
			@Pc(26) int local26 = arg2 << Static270.anInt5288;
			if (Static118.method2275(local22 + 1, Static248.aClass131Array4[arg0].ba(arg1, arg2), local26 + 1) && Static118.method2275(local22 + Static58.anInt1202 - 1, Static248.aClass131Array4[arg0].ba(arg1 + 1, arg2), local26 + 1) && Static118.method2275(local22 + Static58.anInt1202 - 1, Static248.aClass131Array4[arg0].ba(arg1 + 1, arg2 + 1), local26 + Static58.anInt1202 - 1) && Static118.method2275(local22 + 1, Static248.aClass131Array4[arg0].ba(arg1, arg2 + 1), local26 + Static58.anInt1202 - 1) && Static118.method2275(local22 + Static261.anInt5167, Static248.aClass131Array4[arg0].ba(arg1, arg2), local26 + 1) && Static118.method2275(local22 + Static58.anInt1202 - 1, Static248.aClass131Array4[arg0].ba(arg1 + 1, arg2), local26 + Static261.anInt5167) && Static118.method2275(local22 + Static261.anInt5167, Static248.aClass131Array4[arg0].ba(arg1, arg2 + 1), local26 + Static58.anInt1202 - 1) && Static118.method2275(local22 + Static58.anInt1202 - 1, Static248.aClass131Array4[arg0].ba(arg1, arg2), local26 + Static261.anInt5167) && Static118.method2275(local22 + Static261.anInt5167, Static248.aClass131Array4[arg0].ba(arg1, arg2), local26 + Static261.anInt5167)) {
				Static481.anIntArrayArrayArray12[arg0][arg1][arg2] = Static108.anInt2350;
				return true;
			} else {
				Static481.anIntArrayArrayArray12[arg0][arg1][arg2] = -Static108.anInt2350;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(III)Lclient!nba;")
	public static Class15_Sub3 method7170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class37 local7 = Static152.aClass37ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass15_Sub3_2;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIB)Z")
	public static boolean method7171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static405.method5869(arg1, arg0) | Static141.method2634(arg0, arg1) | Static124.method2348(arg0, arg1)) & Static157.method2863(arg0, arg1);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(FFFI)I")
	public static int method7172(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(17) float local17 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(26) float local26 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(35) float local35 = arg2 < 0.0F ? -arg2 : arg2;
		if (local17 < local26 && local35 < local26) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local35 > local17 && local35 > local26) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
