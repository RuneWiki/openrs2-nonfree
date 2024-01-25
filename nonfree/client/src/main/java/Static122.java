import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!gs", name = "L", descriptor = "Lclient!fc;")
	public static Class71 aClass71_27;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIIBI)Z")
	public static boolean method2233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if ((Static244.aByteArrayArrayArray4[0][arg1][arg3] & 0x2) != 0) {
			return true;
		} else if ((Static244.aByteArrayArrayArray4[arg2][arg1][arg3] & 0x10) == 0) {
			return arg0 == Static206.method3519(arg3, arg2, arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIIIIII)I")
	public static int method2234(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg2 & 0x1) == 1) {
			@Pc(12) int local12 = arg4;
			arg4 = arg3;
			arg3 = local12;
		}
		@Pc(20) int local20 = arg5 & 0x3;
		if (local20 == 0) {
			return arg0;
		} else if (local20 == 1) {
			return arg1;
		} else if (local20 == 2) {
			return 1 + 7 - arg4 - arg0;
		} else {
			return 1 + 7 - arg3 - arg1;
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void method2235(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static379.anInt1197 >= 100) {
			Static366.method5530(Static55.aClass221_36.method5229(Static189.anInt5185));
			return;
		}
		@Pc(22) String local22 = Static236.method3861(arg0);
		if (local22 == null) {
			return;
		}
		@Pc(70) String local70;
		for (@Pc(27) int local27 = 0; local27 < Static379.anInt1197; local27++) {
			@Pc(40) String local40 = Static236.method3861(Static235.aStringArray28[local27]);
			if (local40 != null && local40.equals(local22)) {
				Static366.method5530(arg0 + Static309.aClass221_187.method5229(Static189.anInt5185));
				return;
			}
			if (Static184.aStringArray42[local27] != null) {
				local70 = Static236.method3861(Static184.aStringArray42[local27]);
				if (local70 != null && local70.equals(local22)) {
					Static366.method5530(arg0 + Static309.aClass221_187.method5229(Static189.anInt5185));
					return;
				}
			}
		}
		for (@Pc(96) int local96 = 0; local96 < Static244.anInt1014; local96++) {
			local70 = Static236.method3861(Static340.aStringArray38[local96]);
			if (local70 != null && local70.equals(local22)) {
				Static366.method5530(Static296.aClass221_178.method5229(Static189.anInt5185) + arg0 + Static175.aClass221_174.method5229(Static189.anInt5185));
				return;
			}
			if (Static278.aStringArray8[local96] != null) {
				@Pc(139) String local139 = Static236.method3861(Static278.aStringArray8[local96]);
				if (local139 != null && local139.equals(local22)) {
					Static366.method5530(Static296.aClass221_178.method5229(Static189.anInt5185) + arg0 + Static175.aClass221_174.method5229(Static189.anInt5185));
					return;
				}
			}
		}
		if (Static236.method3861(Static267.aClass12_Sub1_Sub2_Sub2_1.aString51).equals(local22)) {
			Static366.method5530(Static31.aClass221_27.method5229(Static189.anInt5185));
		} else {
			Static19.method552(Static128.aClass41_65);
			Static39.aClass2_Sub13_Sub2_4.method4207(Static346.method5273(arg0) + 1);
			Static39.aClass2_Sub13_Sub2_4.method4230(arg0);
			Static39.aClass2_Sub13_Sub2_4.method4207(arg1 ? 1 : 0);
		}
	}
}
