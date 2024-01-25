import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!mg", name = "q", descriptor = "Lclient!rk;")
	public static Class180 aClass180_53;

	@OriginalMember(owner = "client!mg", name = "G", descriptor = "[I")
	public static int[] anIntArray548;

	@OriginalMember(owner = "client!mg", name = "L", descriptor = "I")
	public static int anInt3944;

	@OriginalMember(owner = "client!mg", name = "P", descriptor = "[[S")
	public static short[][] aShortArrayArray4;

	@OriginalMember(owner = "client!mg", name = "C", descriptor = "Lclient!ik;")
	public static final Class103 aClass103_37 = new Class103(64);

	@OriginalMember(owner = "client!mg", name = "D", descriptor = "[[I")
	public static final int[][] anIntArrayArray30 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!mg", name = "E", descriptor = "[S")
	public static short[] aShortArray63 = new short[256];

	@OriginalMember(owner = "client!mg", name = "J", descriptor = "Lclient!io;")
	public static final Class7_Sub3_Sub2 aClass7_Sub3_Sub2_3 = new Class7_Sub3_Sub2(5000);

	@OriginalMember(owner = "client!mg", name = "Q", descriptor = "Ljava/lang/String;")
	public static String aString258 = " from your friend list first.";

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)Lclient!tj;")
	public static Class7_Sub37 method3574() {
		if (Static306.aClass74_23 == null || Static67.aClass166_2 == null) {
			return null;
		}
		for (@Pc(21) Class7_Sub37 local21 = (Class7_Sub37) Static67.aClass166_2.method4266(); local21 != null; local21 = (Class7_Sub37) Static67.aClass166_2.method4266()) {
			@Pc(29) Class155 local29 = Static84.method1785(local21.anInt5839);
			if (local29 != null && local29.aBoolean347 && local29.method4084()) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(B)Lclient!ap;")
	public static Class7_Sub3 method3575() {
		@Pc(8) Class7_Sub3 local8 = new Class7_Sub3(37);
		local8.method2735(14);
		local8.method2735(Static289.anInt2339);
		local8.method2735(Static352.aBoolean484 ? 1 : 0);
		local8.method2735(Class22_Sub2_Sub5.lb ? 1 : 0);
		local8.method2735(Static155.aBoolean244 ? 1 : 0);
		local8.method2735(Static342.aBoolean471 ? 1 : 0);
		local8.method2735(0);
		local8.method2735(Static308.aBoolean431 ? 1 : 0);
		local8.method2735(Static70.aBoolean128 ? 1 : 0);
		local8.method2735(Static231.aBoolean341 ? 1 : 0);
		local8.method2735(Static336.anInt4180);
		local8.method2735(Static325.aBoolean452 ? 1 : 0);
		local8.method2735(Static140.aBoolean228 ? 1 : 0);
		local8.method2735(Static296.aBoolean432 ? 1 : 0);
		local8.method2735(Static27.anInt622);
		local8.method2735(Static108.aBoolean108 ? 1 : 0);
		local8.method2735(Static110.anInt2524);
		local8.method2735(Static254.anInt4943);
		local8.method2735(Static165.anInt3445);
		local8.method2788(Static345.anInt6528);
		local8.method2788(Static227.anInt6305);
		local8.method2735(Static290.method4749());
		local8.method2765(Static275.anInt5447);
		local8.method2735(Static6.anInt126);
		local8.method2735(Static294.aBoolean459 ? 1 : 0);
		local8.method2735(Static268.aBoolean393 ? 1 : 0);
		local8.method2735(Static186.anInt3771);
		local8.method2735(Static324.aBoolean451 ? 1 : 0);
		local8.method2735(Static35.aBoolean76 ? 1 : 0);
		local8.method2735(Static2.anInt18);
		local8.method2735(Static53.aBoolean112 ? 1 : 0);
		local8.method2735(Static244.anInt4807);
		return local8;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!tg;Lclient!tg;I)V")
	public static void method3577(@OriginalArg(0) Class7_Sub1 arg0, @OriginalArg(1) Class7_Sub1 arg1) {
		if (arg0.aClass7_Sub1_62 != null) {
			arg0.method5509();
		}
		arg0.aClass7_Sub1_61 = arg1.aClass7_Sub1_61;
		arg0.aClass7_Sub1_62 = arg1;
		arg0.aClass7_Sub1_62.aClass7_Sub1_61 = arg0;
		arg0.aClass7_Sub1_61.aClass7_Sub1_62 = arg0;
	}
}
