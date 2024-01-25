import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!fm", name = "l", descriptor = "[Lclient!na;")
	public static Class146[] aClass146Array1;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)V")
	public static void method1842() {
		for (@Pc(11) int local11 = 0; local11 < Static446.aClass31ArrayArray1.length; local11++) {
			for (@Pc(15) int local15 = 0; local15 < Static446.aClass31ArrayArray1[local11].length; local15++) {
				Static446.aClass31ArrayArray1[local11][local15] = Static74.aClass31_1;
			}
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZLclient!ns;IIIII)V")
	public static void method1844(@OriginalArg(1) Class166 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3) {
		Static142.anInt2689 = 1;
		Static231.anInt4228 = 0;
		Static324.aClass166_264 = arg0;
		Static449.anInt7510 = arg2;
		Static325.anInt5778 = arg1;
		Static164.aBoolean219 = false;
		Static386.anInt6719 = Static67.aClass4_Sub18_Sub4_2.method5771() / arg3;
		if (Static386.anInt6719 < 1) {
			Static386.anInt6719 = 1;
		}
	}
}
