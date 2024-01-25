import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!fba", name = "o", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_51 = new Class145(37, 1);

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(ZI)V")
	public static void method2634(@OriginalArg(0) boolean arg0) {
		if (Static113.aClass23_1 == null) {
			Static439.method6316();
		}
		if (arg0) {
			Static113.aClass23_1.method626();
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIIIIII)Z")
	public static boolean method2635(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = arg5 + arg2;
		@Pc(19) int local19 = arg0 + arg4;
		@Pc(24) int local24 = arg1 + arg3;
		if (!Static33.method735(local14, local24, local19, arg2, arg2, local24, local19, arg1, local19)) {
			return false;
		} else if (Static33.method735(local14, local24, local19, arg2, local14, arg1, local19, arg1, local19)) {
			if (arg2 < Static274.anInt5086) {
				if (!Static33.method735(arg2, local24, local19, arg2, arg2, arg1, local19, local24, arg0)) {
					return false;
				}
				if (!Static33.method735(arg2, arg1, arg0, arg2, arg2, arg1, local19, local24, arg0)) {
					return false;
				}
			} else if (!Static33.method735(local14, local24, local19, local14, local14, arg1, local19, local24, arg0)) {
				return false;
			} else if (!Static33.method735(local14, arg1, arg0, local14, local14, arg1, local19, local24, arg0)) {
				return false;
			}
			if (Static372.anInt6422 > arg1) {
				if (!Static33.method735(local14, arg1, local19, arg2, arg2, arg1, local19, arg1, arg0)) {
					return false;
				}
				if (!Static33.method735(local14, arg1, arg0, arg2, local14, arg1, local19, arg1, arg0)) {
					return false;
				}
			} else if (!Static33.method735(local14, local24, local19, arg2, arg2, local24, local19, local24, arg0)) {
				return false;
			} else if (!Static33.method735(local14, local24, arg0, arg2, local14, local24, local19, local24, arg0)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lclient!sl;I)Lclient!ie;")
	public static Class160 method2637(@OriginalArg(0) Class2_Sub17 arg0) {
		@Pc(12) int local12 = arg0.method2881();
		return new Class160(local12);
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method2638(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(16) Class2_Sub31 local16 = Static275.method4480(Static640.aClass314_2, Static386.aClass145_116);
		local16.aClass2_Sub17_Sub1_2.method2837(Static443.method6359(arg1) + 1);
		local16.aClass2_Sub17_Sub1_2.method2856(arg1);
		local16.aClass2_Sub17_Sub1_2.method2831(arg0);
		Static526.method7309(local16);
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)V")
	public static void method2641() {
		@Pc(14) Class2_Sub31 local14 = Static275.method4480(Static640.aClass314_2, Static644.aClass145_179);
		local14.aClass2_Sub17_Sub1_2.method2879(Static406.anInt6903);
		Static526.method7309(local14);
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IBI)V")
	public static void method2642(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub7_Sub2 local8 = Static188.method3210(7, arg1);
		local8.method925();
		local8.anInt852 = arg0;
	}
}
