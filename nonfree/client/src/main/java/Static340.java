import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!tl", name = "y", descriptor = "Lclient!fc;")
	public static Class71 aClass71_82;

	@OriginalMember(owner = "client!tl", name = "f", descriptor = "Z")
	public static boolean aBoolean454 = false;

	@OriginalMember(owner = "client!tl", name = "o", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_158 = new Class77(101, 6);

	@OriginalMember(owner = "client!tl", name = "x", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray38 = new String[200];

	@OriginalMember(owner = "client!tl", name = "B", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_159 = new Class77(92, 3);

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIIBI)V")
	public static void method5220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg0; local7 <= arg2; local7++) {
			Static264.method4096(Static267.anIntArrayArray38[local7], arg4, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IILclient!ms;I)V")
	public static void method5223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class155 arg2) {
		if (arg2.aByte41 == 0) {
			arg2.anInt4189 = arg2.anInt4169;
		} else if (arg2.aByte41 == 1) {
			arg2.anInt4189 = (arg0 - arg2.anInt4170) / 2 + arg2.anInt4169;
		} else if (arg2.aByte41 == 2) {
			arg2.anInt4189 = arg0 - arg2.anInt4169 - arg2.anInt4170;
		} else if (arg2.aByte41 == 3) {
			arg2.anInt4189 = arg2.anInt4169 * arg0 >> 14;
		} else if (arg2.aByte41 == 4) {
			arg2.anInt4189 = (arg0 * arg2.anInt4169 >> 14) + (arg0 - arg2.anInt4170) / 2;
		} else {
			arg2.anInt4189 = arg0 - (arg2.anInt4169 * arg0 >> 14) - arg2.anInt4170;
		}
		if (arg2.aByte43 == 0) {
			arg2.anInt4206 = arg2.anInt4200;
		} else if (arg2.aByte43 == 1) {
			arg2.anInt4206 = (arg1 - arg2.anInt4214) / 2 + arg2.anInt4200;
		} else if (arg2.aByte43 == 2) {
			arg2.anInt4206 = arg1 - arg2.anInt4200 - arg2.anInt4214;
		} else if (arg2.aByte43 == 3) {
			arg2.anInt4206 = arg1 * arg2.anInt4200 >> 14;
		} else if (arg2.aByte43 == 4) {
			arg2.anInt4206 = (arg1 - arg2.anInt4214) / 2 + (arg2.anInt4200 * arg1 >> 14);
		} else {
			arg2.anInt4206 = arg1 - (arg2.anInt4200 * arg1 >> 14) - arg2.anInt4214;
		}
		if (!Static218.aBoolean304) {
			return;
		}
		if (Static41.method878(arg2).anInt5883 == 0 && arg2.anInt4164 != 0) {
			return;
		}
		if (arg2.anInt4206 < 0) {
			arg2.anInt4206 = 0;
		} else if (arg1 < arg2.anInt4214 + arg2.anInt4206) {
			arg2.anInt4206 = arg1 - arg2.anInt4214;
		}
		if (arg2.anInt4189 < 0) {
			arg2.anInt4189 = 0;
			return;
		}
		if (arg2.anInt4189 + arg2.anInt4170 > arg0) {
			arg2.anInt4189 = arg0 - arg2.anInt4170;
			return;
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V")
	public static void method5224() {
		if (Static367.aClass82_9 != null) {
			Static367.aClass82_9.method4553();
			Static120.aClass13_3 = null;
			Static367.aClass82_9 = null;
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IB)I")
	public static int method5225(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)V")
	public static void method5226(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub1_Sub2 local8 = Static323.method4982(arg0, 2);
		local8.method412();
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(I[Lclient!aq;)V")
	public static void method5227(@OriginalArg(1) Class5[] arg0) {
		Static76.anInt1483 = arg0.length;
		Static215.anIntArray491 = new int[Static76.anInt1483 + 10];
		Static52.aClass5Array11 = new Class5[Static76.anInt1483 + 10];
		Static406.method5654(arg0, 0, Static52.aClass5Array11, 0, Static76.anInt1483);
		for (@Pc(31) int local31 = 0; local31 < Static76.anInt1483; local31++) {
			Static215.anIntArray491[local31] = Static52.aClass5Array11[local31].method4992();
		}
		for (@Pc(46) int local46 = Static76.anInt1483; local46 < Static52.aClass5Array11.length; local46++) {
			Static215.anIntArray491[local46] = 12;
		}
	}
}
