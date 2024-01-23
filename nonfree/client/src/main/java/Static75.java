import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "[Lclient!gb;")
	public static Class63_Sub1[] aClass63_Sub1Array1;

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
	public static int anInt1641 = -2;

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "Z")
	public static boolean aBoolean102 = false;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method1223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V")
	public static void method1224(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub3_Sub9 local8 = Static43.method2329(10, arg0);
		local8.method1519();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IBI)I")
	public static int method1226(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class4_Sub18 local12 = (Class4_Sub18) Static189.aClass85_17.method1845((long) arg1);
		if (local12 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(35) int local35 = 0;
			for (@Pc(37) int local37 = 0; local37 < local12.anIntArray386.length; local37++) {
				if (arg0 == local12.anIntArray385[local37]) {
					local35 += local12.anIntArray386[local37];
				}
			}
			return local35;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BIIII)V")
	public static void method1227(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static171.anInt3315 == 0 || arg2 == 0 || Static237.anInt4458 >= 50 || arg1 == -1) {
			return;
		}
		Static157.anIntArray294[Static237.anInt4458] = arg1;
		Static298.anIntArray629[Static237.anInt4458] = arg2;
		Static124.anIntArray217[Static237.anInt4458] = arg0;
		Static169.aClass7Array1[Static237.anInt4458] = null;
		Static282.anIntArray601[Static237.anInt4458] = 0;
		Static10.anIntArray21[Static237.anInt4458] = arg3;
		Static237.anInt4458++;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)I")
	public static int method1228() {
		return Static68.aClass26_12.method509();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IJ)V")
	public static void method1229(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static272.anInt5215 >= 100 && !Static306.aBoolean400 || Static272.anInt5215 >= 200) {
			Static186.method4394("", 0, Static128.aString146);
			return;
		}
		@Pc(35) String local35 = Static216.method3514(arg0);
		@Pc(37) int local37;
		for (local37 = 0; local37 < Static272.anInt5215; local37++) {
			if (arg0 == Static285.aLongArray54[local37]) {
				Static186.method4394("", 0, local35 + Static306.aString354);
				return;
			}
		}
		for (local37 = 0; local37 < Static239.anInt4517; local37++) {
			if (arg0 == Static132.aLongArray16[local37]) {
				Static186.method4394("", 0, Static105.aString122 + local35 + Static152.aString180);
				return;
			}
		}
		if (local35.equals(Static154.aClass53_Sub1_Sub1_2.aString88)) {
			Static186.method4394("", 0, Static310.aString370);
			return;
		}
		Static181.aStringArray23[Static272.anInt5215] = local35;
		Static285.aLongArray54[Static272.anInt5215] = arg0;
		Static157.anIntArray293[Static272.anInt5215] = 0;
		Static150.aStringArray22[Static272.anInt5215] = "";
		Static251.anIntArray517[Static272.anInt5215] = 0;
		Static81.aBooleanArray7[Static272.anInt5215] = false;
		Static272.anInt5215++;
		Static98.anInt2102 = Static261.anInt4980;
		Static110.aClass4_Sub10_Sub1_1.method4687(26);
		Static110.aClass4_Sub10_Sub1_1.method4619(arg0);
	}
}
