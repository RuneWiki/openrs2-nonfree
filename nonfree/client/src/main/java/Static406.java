import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "Lclient!nj;")
	public static final Class181 aClass181_46 = new Class181();

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IJ)V")
	public static void method5645(@OriginalArg(1) long arg0) {
		Static389.aClass2_Sub17_Sub1_2.anInt7523 = 0;
		Static389.aClass2_Sub17_Sub1_2.method6172(Static173.aClass78_8.anInt1850);
		Static389.aClass2_Sub17_Sub1_2.method6132(arg0);
		Static389.aClass2_Sub17_Sub1_2.method6172(Static80.anInt6195);
		Static54.anInt992 = 1;
		Static461.anInt7750 = 0;
		Static115.anInt1938 = 0;
		Static298.anInt5371 = -3;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILclient!wq;I)V")
	public static void method5646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class11_Sub5_Sub2_Sub2 arg2) {
		if (arg2.anInt7665 == arg1 && arg1 != -1) {
			@Pc(80) Class109 local80 = Static37.aClass80_1.method1879(arg1);
			@Pc(83) int local83 = local80.anInt2788;
			if (local83 == 1) {
				arg2.anInt7637 = 0;
				arg2.anInt7662 = arg0;
				arg2.anInt7693 = 0;
				arg2.anInt7654 = 0;
				arg2.anInt7704 = 1;
				Static245.method3411(false, arg2.anInt7693, local80, arg2.anInt7626, arg2.anInt7622, arg2.aByte101);
			}
			if (local83 == 2) {
				arg2.anInt7637 = 0;
			}
		} else if (arg1 == -1 || arg2.anInt7665 == -1 || Static37.aClass80_1.method1879(arg1).anInt2777 >= Static37.aClass80_1.method1879(arg2.anInt7665).anInt2777) {
			arg2.anInt7654 = 0;
			arg2.anInt7693 = 0;
			arg2.anInt7662 = arg0;
			arg2.anInt7704 = 1;
			arg2.anInt7705 = arg2.anInt7707;
			arg2.anInt7665 = arg1;
			arg2.anInt7637 = 0;
			if (arg2.anInt7665 != -1) {
				Static245.method3411(false, arg2.anInt7693, Static37.aClass80_1.method1879(arg2.anInt7665), arg2.anInt7626, arg2.anInt7622, arg2.aByte101);
			}
		}
	}
}
