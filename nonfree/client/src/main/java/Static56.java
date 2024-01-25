import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!cm", name = "x", descriptor = "I")
	public static int anInt965;

	@OriginalMember(owner = "client!cm", name = "B", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_43 = new Class56(3, 11);

	@OriginalMember(owner = "client!cm", name = "C", descriptor = "I")
	public static int anInt968 = -1;

	@OriginalMember(owner = "client!cm", name = "D", descriptor = "Lclient!tf;")
	public static final Class4_Sub9_Sub2 aClass4_Sub9_Sub2_1 = new Class4_Sub9_Sub2(5000);

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILclient!ya;)V")
	public static void method778(@OriginalArg(1) Class135 arg0) {
		if (Static339.aBoolean390) {
			Static327.method4304(arg0);
		} else {
			Static291.method3797(arg0);
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V")
	public static void method779() {
		for (@Pc(7) int local7 = 0; local7 < Static4.aByteArrayArrayArray1.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < Static4.aByteArrayArrayArray1[0].length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < Static4.aByteArrayArrayArray1[0][0].length; local15++) {
					Static4.aByteArrayArrayArray1[local7][local11][local15] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIB)V")
	public static void method782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 0) {
			Static448.method5935(Static245.aClass146_57);
		}
		if (arg1 == 1) {
			Static448.method5935(Static8.aClass146_7);
		}
		Static247.aClass4_Sub9_Sub2_2.method5018(Static366.anInt6052 + arg2);
		Static247.aClass4_Sub9_Sub2_2.method4996(Static180.aClass107_1.method2003(82) ? 1 : 0);
		Static247.aClass4_Sub9_Sub2_2.method5053(Static365.anInt6047 + arg0);
		Static25.anInt375 = arg2;
		Static363.anInt5531 = arg0;
		Static435.aBoolean509 = false;
		Static397.method5243();
	}
}
