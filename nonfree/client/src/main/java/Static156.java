import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!jo", name = "h", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray38;

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "I")
	public static int anInt3027 = 0;

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "Z")
	public static boolean aBoolean231 = false;

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
	public static int anInt3028 = 0;

	@OriginalMember(owner = "client!jo", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray37 = new String[200];

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)Z")
	public static boolean method2785() {
		if (Static259.aBoolean424) {
			try {
				if ((Boolean) Static370.method5989(Static182.aClass139_5.anApplet1, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(24) Throwable local24) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)V")
	public static void method2786() {
		for (@Pc(1) int local1 = 0; local1 < Static133.anInt2579; local1++) {
			@Pc(6) int local6 = Static95.anIntArray160[local1];
			@Pc(10) Class4_Sub5_Sub2_Sub2 local10 = Static280.aClass4_Sub5_Sub2_Sub2Array1[local6];
			if (local10 != null) {
				Static187.method3352(local10, local10.aClass106_1.anInt3135);
			}
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIIIII)V")
	public static void method2787(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 > Static346.anInt6668 || Static75.anInt1447 > arg3) {
			return;
		}
		@Pc(20) boolean local20;
		if (Static163.anInt3234 > arg4) {
			local20 = false;
			arg4 = Static163.anInt3234;
		} else if (Static353.anInt6760 < arg4) {
			local20 = false;
			arg4 = Static353.anInt6760;
		} else {
			local20 = true;
		}
		@Pc(46) boolean local46;
		if (arg1 < Static163.anInt3234) {
			arg1 = Static163.anInt3234;
			local46 = false;
		} else if (arg1 <= Static353.anInt6760) {
			local46 = true;
		} else {
			local46 = false;
			arg1 = Static353.anInt6760;
		}
		if (arg2 < Static75.anInt1447) {
			arg2 = Static75.anInt1447;
		} else {
			Static160.method2840(arg0, arg1, arg4, Static129.anIntArrayArray46[arg2++]);
		}
		if (arg3 > Static346.anInt6668) {
			arg3 = Static346.anInt6668;
		} else {
			Static160.method2840(arg0, arg1, arg4, Static129.anIntArrayArray46[arg3--]);
		}
		@Pc(101) int local101;
		if (local20 && local46) {
			for (local101 = arg2; local101 <= arg3; local101++) {
				@Pc(107) int[] local107 = Static129.anIntArrayArray46[local101];
				local107[arg4] = local107[arg1] = arg0;
			}
		} else if (local20) {
			for (local101 = arg2; local101 <= arg3; local101++) {
				Static129.anIntArrayArray46[local101][arg4] = arg0;
			}
		} else if (local46) {
			for (local101 = arg2; local101 <= arg3; local101++) {
				Static129.anIntArrayArray46[local101][arg1] = arg0;
			}
		}
	}
}
