import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
	public static int anInt6641;

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
	public static int anInt6642 = -50;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)I")
	public static int method5918(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ZB)V")
	public static void method5919(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static324.anInt6226 != -1) {
				Static67.method1660(Static324.anInt6226);
			}
			for (@Pc(18) Class14_Sub27 local18 = (Class14_Sub27) Static198.aClass25_20.method697(); local18 != null; local18 = (Class14_Sub27) Static198.aClass25_20.method694()) {
				if (!local18.method5989()) {
					local18 = (Class14_Sub27) Static198.aClass25_20.method697();
					if (local18 == null) {
						break;
					}
				}
				Static81.method2015(true, false, local18);
			}
			Static324.anInt6226 = -1;
			Static198.aClass25_20 = new Class25(8);
			Static61.method1353();
			Static324.anInt6226 = Static332.anInt6436;
			Static161.method3223(false);
			Static7.method206();
			Static10.method224(Static324.anInt6226);
		}
		Static340.method5827();
		Static288.anInt5579 = -1;
		Static160.method3100(Static29.anInt4694);
		Static173.aClass10_Sub3_Sub3_Sub2_1 = new Class10_Sub3_Sub3_Sub2();
		Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5908 = 6656;
		Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5910 = 6656;
		Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray535[0] = 52;
		Static141.anInt2986 = 0;
		Static124.anInt2717 = 0;
		Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray536[0] = 52;
		if (Static205.anInt4115 == 2) {
			Static124.anInt2717 = Static273.anInt5190 << 7;
			Static141.anInt2986 = Static215.anInt4291 << 7;
		} else {
			Static171.method3336();
		}
		Static159.method3098();
		if (Static124.anInt2717 == 0 || Static141.anInt2986 == 0) {
			Static67.method1662(10);
		} else {
			Static178.method3460();
			Static67.method1662(28);
		}
	}
}
