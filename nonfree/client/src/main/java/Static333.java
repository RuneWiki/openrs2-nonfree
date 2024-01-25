import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!ve", name = "C", descriptor = "Lclient!lg;")
	public static Class60 aClass60_2;

	@OriginalMember(owner = "client!ve", name = "w", descriptor = "J")
	public static long aLong14 = 0L;

	@OriginalMember(owner = "client!ve", name = "B", descriptor = "[I")
	public static final int[] anIntArray5 = new int[4096];

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)V")
	public static void method71() {
		if (Static156.aBoolean292) {
			return;
		}
		if (Static166.aBoolean307) {
			Static174.aFloat39 = (int) Static174.aFloat39 - 17 & 0xFFFFFFF0;
		} else {
			Static203.aFloat41 += (-Static203.aFloat41 - 12.0F) / 2.0F;
		}
		Static156.aBoolean292 = true;
		Static275.aBoolean495 = true;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!fd;II)V")
	public static void method73(@OriginalArg(0) int arg0, @OriginalArg(1) Class72 arg1, @OriginalArg(3) int arg2) {
		if (Static301.aClass72_19 != null || Static173.aBoolean319 || (arg1 == null || Static284.method4848(arg1) == null)) {
			return;
		}
		Static301.aClass72_19 = arg1;
		Static352.aClass72_20 = Static284.method4848(arg1);
		Static345.anInt6765 = arg2;
		Static72.anInt1627 = arg0;
		Static181.aBoolean329 = false;
		Static203.anInt4288 = 0;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!ve;III[Z)Z")
	public static boolean method74(@OriginalArg(0) Class4_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static307.aClass26Array3 != Static5.aClass26Array1) {
			@Pc(11) int local11 = Static310.aClass26Array4[arg1].method4990(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class26 local18 = Static310.aClass26Array4[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.method4990(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method5003(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.method4991(arg0, arg2, local27, arg3);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IBI)V")
	public static void method75(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static320.aClass4_Sub7_Sub1_3.method1237(83);
		Static320.aClass4_Sub7_Sub1_3.method2408(arg1);
		Static320.aClass4_Sub7_Sub1_3.method2390(arg0);
	}

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "(I)V")
	public static void method76() {
		if (Static98.aClass53_3 != null) {
			@Pc(12) Class53 local12 = Static98.aClass53_3;
			synchronized (Static98.aClass53_3) {
				Static98.aClass53_3 = null;
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!am;Lclient!am;I)V")
	public static void method77(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class11 arg1) {
		Static68.aClass11_33 = arg1;
		Static226.aClass11_92 = arg0;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)V")
	public static void method78(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static18.aClass57ArrayArrayArray1[0][arg1][arg2] != null && Static18.aClass57ArrayArrayArray1[0][arg1][arg2].aClass57_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static18.aClass57ArrayArrayArray1[local22][arg1][arg2] == null) {
				@Pc(46) Class57 local46 = Static18.aClass57ArrayArrayArray1[local22][arg1][arg2] = new Class57(local22, arg1, arg2);
				if (local20) {
					local46.aByte31++;
				}
			}
		}
	}
}
