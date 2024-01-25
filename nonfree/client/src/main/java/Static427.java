import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!qba", name = "y", descriptor = "F")
	public static float aFloat166;

	@OriginalMember(owner = "client!qba", name = "m", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_123 = new Class287(65, -1);

	@OriginalMember(owner = "client!qba", name = "n", descriptor = "I")
	public static int anInt7540 = 0;

	@OriginalMember(owner = "client!qba", name = "t", descriptor = "I")
	public static int anInt7545 = 0;

	@OriginalMember(owner = "client!qba", name = "z", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_124 = new Class287(33, 1);

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method5897(@OriginalArg(0) String arg0) {
		System.exit(1);
	}

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "(ZI)V")
	public static void method5898(@OriginalArg(0) boolean arg0) {
		if (arg0 && Static157.aClass3_Sub7_Sub1_3 != null) {
			Static106.anInt2616 = Static157.aClass3_Sub7_Sub1_3.anInt351;
		} else {
			Static106.anInt2616 = -1;
		}
		Static157.aClass3_Sub7_Sub1_3 = null;
		Static448.aClass244_72 = null;
		Static389.aClass251_13 = null;
		Static111.anInt2675 = 0;
		Static157.method2255();
		Static157.aClass244_22.method5581();
		Static412.aClass262_6 = null;
		Static569.aClass262_9 = null;
		Static193.aClass262_4 = null;
		Static466.anInt8098 = -1;
		Static142.aClass262_3 = null;
		Static538.aClass262_7 = null;
		Static540.aClass262_8 = null;
		Static82.anInt9708 = -1;
		Static139.aClass262_5 = null;
		Static153.aClass73_12 = null;
		Static38.aClass262_1 = null;
		Static157.aClass57_2 = null;
		if (Static157.aClass189_2 != null) {
			Static157.aClass189_2.method4641();
			Static157.aClass189_2.method4643(128, 64);
		}
		if (Static157.aClass296_3 != null) {
			Static157.aClass296_3.method6526(64, 64);
		}
		if (Static157.aClass146_2 != null) {
			Static157.aClass146_2.method3724(64);
		}
		Static333.aClass177_1.method4303(64);
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IIIBIII)V")
	public static void method5899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13 = Static4.method56(arg4, Static112.anInt2687, Static333.anInt6022);
		@Pc(19) int local19 = Static4.method56(arg0, Static112.anInt2687, Static333.anInt6022);
		@Pc(25) int local25 = Static4.method56(arg5, Static384.anInt6641, Static191.anInt4134);
		@Pc(31) int local31 = Static4.method56(arg1, Static384.anInt6641, Static191.anInt4134);
		@Pc(41) int local41 = Static4.method56(arg4 + arg2, Static112.anInt2687, Static333.anInt6022);
		@Pc(49) int local49 = Static4.method56(arg0 - arg2, Static112.anInt2687, Static333.anInt6022);
		for (@Pc(51) int local51 = local13; local51 < local41; local51++) {
			Static504.method6755(arg3, local31, Static570.anIntArrayArray100[local51], local25);
		}
		for (@Pc(67) int local67 = local19; local67 > local49; local67--) {
			Static504.method6755(arg3, local31, Static570.anIntArrayArray100[local67], local25);
		}
		@Pc(96) int local96 = Static4.method56(arg5 + arg2, Static384.anInt6641, Static191.anInt4134);
		@Pc(107) int local107 = Static4.method56(arg1 - arg2, Static384.anInt6641, Static191.anInt4134);
		for (@Pc(109) int local109 = local41; local109 <= local49; local109++) {
			@Pc(115) int[] local115 = Static570.anIntArrayArray100[local109];
			Static504.method6755(arg3, local96, local115, local25);
			Static504.method6755(arg3, local31, local115, local107);
		}
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IILclient!pca;)Ljava/lang/String;")
	public static String method5902(@OriginalArg(0) int arg0, @OriginalArg(2) Class251 arg1) {
		if (!Static70.method1716(arg1).method3244(arg0) && arg1.anObjectArray30 == null) {
			return null;
		} else if (arg1.aStringArray32 == null || arg1.aStringArray32.length <= arg0 || arg1.aStringArray32[arg0] == null || arg1.aStringArray32[arg0].trim().length() == 0) {
			return Static355.aBoolean446 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray32[arg0];
		}
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(Lclient!k;I)[Lclient!ica;")
	public static Class136[] method5903(@OriginalArg(0) Class168 arg0) {
		if (!arg0.method4077()) {
			return new Class136[0];
		}
		@Pc(16) Class309 local16 = arg0.method4085();
		while (local16.anInt8650 == 0) {
			Static373.method5240(10L);
		}
		if (local16.anInt8650 == 2) {
			return new Class136[0];
		}
		@Pc(38) int[] local38 = (int[]) local16.anObject15;
		@Pc(44) Class136[] local44 = new Class136[local38.length >> 2];
		for (@Pc(46) int local46 = 0; local46 < local44.length; local46++) {
			@Pc(52) Class136 local52 = new Class136();
			local44[local46] = local52;
			local52.anInt4494 = local38[local46 << 2];
			local52.anInt4491 = local38[(local46 << 2) + 1];
			local52.anInt4495 = local38[(local46 << 2) + 2];
			local52.anInt4493 = local38[(local46 << 2) + 3];
		}
		return local44;
	}
}
