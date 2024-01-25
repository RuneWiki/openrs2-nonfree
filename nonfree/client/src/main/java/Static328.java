import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!lt", name = "D", descriptor = "I")
	public static int anInt6239 = 0;

	@OriginalMember(owner = "client!lt", name = "E", descriptor = "I")
	public static int anInt6240 = 0;

	@OriginalMember(owner = "client!lt", name = "F", descriptor = "I")
	public static int anInt6241 = 0;

	@OriginalMember(owner = "client!lt", name = "H", descriptor = "[[F")
	public static final float[][] aFloatArrayArray5 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(BIII)V")
	public static void method5431(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class6_Sub2_Sub9 local13 = Static144.method2332(9, arg1);
		local13.method3723();
		local13.anInt4291 = arg0;
		local13.anInt4294 = arg2;
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(I)V")
	public static void method5432() {
		Static560.aClass166_56.method4811();
		Static292.aClass166_29.method4811();
		Static284.aClass166_42.method4811();
		Static315.aClass166_31.method4811();
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lclient!jo;BLclient!vd;Lclient!vd;Lclient!vd;Lclient!vn;)Z")
	public static boolean method5434(@OriginalArg(0) Class6_Sub3_Sub4 arg0, @OriginalArg(2) Class353 arg1, @OriginalArg(3) Class353 arg2, @OriginalArg(4) Class353 arg3, @OriginalArg(5) Class190 arg4) {
		Static152.aClass353_47 = arg2;
		Static236.anIntArray269 = new int[16];
		Static373.aClass190_2 = arg4;
		Static61.aClass353_10 = arg3;
		Static224.aClass6_Sub3_Sub4_1 = arg0;
		Static557.aClass353_115 = arg1;
		for (@Pc(20) int local20 = 0; local20 < 16; local20++) {
			Static236.anIntArray269[local20] = 255;
		}
		return true;
	}
}
