import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
	public static int anInt5156;

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString197 = "level: ";

	@OriginalMember(owner = "client!ql", name = "g", descriptor = "I")
	public static int anInt5153 = 0;

	@OriginalMember(owner = "client!ql", name = "k", descriptor = "I")
	public static int anInt5157 = -1;

	@OriginalMember(owner = "client!ql", name = "n", descriptor = "I")
	public static int anInt5159 = 0;

	@OriginalMember(owner = "client!ql", name = "o", descriptor = "Lclient!cr;")
	public static final Class37 aClass37_80 = new Class37(64);

	@OriginalMember(owner = "client!ql", name = "q", descriptor = "[[I")
	public static final int[][] anIntArrayArray40 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIILclient!je;Lclient!je;)V")
	public static void method4473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class10_Sub4 arg3, @OriginalArg(4) Class10_Sub4 arg4) {
		if (Static347.aClass83ArrayArrayArray3[arg0][arg1][arg2] == null) {
			Static313.method5368(arg0, arg1, arg2);
		}
		Static347.aClass83ArrayArrayArray3[arg0][arg1][arg2].aClass10_Sub4_2 = arg3;
		Static347.aClass83ArrayArrayArray3[arg0][arg1][arg2].aClass10_Sub4_1 = arg4;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)V")
	public static void method4477() {
		@Pc(6) Class37 local6 = Static54.aClass37_26;
		synchronized (Static54.aClass37_26) {
			Static54.aClass37_26.method920(5);
		}
		local6 = Static239.aClass37_46;
		synchronized (Static239.aClass37_46) {
			Static239.aClass37_46.method920(5);
		}
		@Pc(38) Class75 local38 = Static61.aClass75_1;
		synchronized (Static61.aClass75_1) {
			Static61.aClass75_1.method1465();
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IZIII)V")
	public static void method4479(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static305.aClass1_Sub21_Sub2_3.method5757(189);
		Static305.aClass1_Sub21_Sub2_3.method5702(arg1);
		Static305.aClass1_Sub21_Sub2_3.method5702(arg2);
		Static305.aClass1_Sub21_Sub2_3.method5711(arg0);
		Static305.aClass1_Sub21_Sub2_3.method5696(arg3);
	}
}
