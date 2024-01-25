import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!id", name = "b", descriptor = "Lclient!ir;")
	public static Class100 aClass100_61;

	@OriginalMember(owner = "client!id", name = "d", descriptor = "[S")
	public static short[] aShortArray69;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "Lclient!te;")
	public static final Class188 aClass188_5 = new Class188(64);

	@OriginalMember(owner = "client!id", name = "e", descriptor = "F")
	public static float aFloat21 = 0.0F;

	@OriginalMember(owner = "client!id", name = "f", descriptor = "Lclient!bo;")
	public static Class24 aClass24_18 = new Class24(64);

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)Z")
	public static boolean method2209(@OriginalArg(0) int arg0) {
		if (arg0 == 7 || arg0 == 10 || arg0 == 39 || arg0 == 19 || arg0 == 18) {
			return true;
		} else if (arg0 == 46 || arg0 == 17 || arg0 == 1005) {
			return true;
		} else if (arg0 == 8 || arg0 == 4 || arg0 == 47 || arg0 == 15 || arg0 == 30) {
			return true;
		} else {
			return arg0 == 21 || arg0 == 33 || arg0 == 1002 || arg0 == 3;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!sj;IIZ)V")
	public static void method2210(@OriginalArg(0) Class181 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class74 local12 = arg0.method4918(Static212.aClass122_2);
		if (local12 == null) {
			return;
		}
		Static212.aClass122_2.method4768(arg1, arg2, arg1 + arg0.anInt5704, arg2 - -arg0.anInt5721);
		if (Static251.anInt4974 < 3) {
			Static190.aClass57_11.method5442((float) arg1 + (float) arg0.anInt5704 / 2.0F, (float) arg2 + (float) arg0.anInt5721 / 2.0F, ((int) -Static57.aFloat3 & 0x3FFF) << 2, local12, arg1, arg2);
		} else {
			Static212.aClass122_2.method4711(local12, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(III)V")
	public static void method2212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static256.aClass45ArrayArrayArray2[0][arg1][arg2] != null && Static256.aClass45ArrayArrayArray2[0][arg1][arg2].aClass45_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static256.aClass45ArrayArrayArray2[local22][arg1][arg2] == null) {
				@Pc(46) Class45 local46 = Static256.aClass45ArrayArrayArray2[local22][arg1][arg2] = new Class45(local22, arg1, arg2);
				if (local20) {
					local46.aByte7++;
				}
			}
		}
	}
}
