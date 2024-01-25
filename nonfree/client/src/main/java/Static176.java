import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!fn", name = "k", descriptor = "I")
	public static int anInt3210;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(CI)Z")
	public static boolean method2775(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static669.method8387(arg0)) {
			return true;
		} else {
			@Pc(18) char[] local18 = Static232.aCharArray4;
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				@Pc(26) char local26 = local18[local20];
				if (arg0 == local26) {
					return true;
				}
			}
			@Pc(46) char[] local46 = Static523.aCharArray8;
			for (@Pc(48) int local48 = 0; local48 < local46.length; local48++) {
				@Pc(54) char local54 = local46[local48];
				if (local54 == arg0) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)Z")
	public static boolean method2776() {
		Static147.anInt2707++;
		Static212.aBoolean258 = true;
		return true;
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(Z)V")
	public static void method2777() {
		Static506.aClass3_Sub5_Sub18_6 = new Class3_Sub5_Sub18(Static114.aClass84_4.method1729(Static654.anInt10668), "", Static530.anInt8325, 1004, -1, 0L, 0, 0, true, false, 0L, true);
	}
}
