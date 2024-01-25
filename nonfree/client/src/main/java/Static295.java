import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!ot", name = "g", descriptor = "I")
	public static int anInt5507;

	@OriginalMember(owner = "client!ot", name = "h", descriptor = "Lclient!eo;")
	public static Class65 aClass65_2;

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "Lclient!dc;")
	public static final Class44 aClass44_42 = new Class44(4);

	@OriginalMember(owner = "client!ot", name = "d", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_291 = new Class123(2, 3);

	@OriginalMember(owner = "client!ot", name = "e", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_292 = new Class123(48, 3);

	@OriginalMember(owner = "client!ot", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray30 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(BLclient!bn;I)V")
	public static void method4600(@OriginalArg(1) Class3_Sub2_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (Static66.anInt1741 < arg0.anInt6570) {
			Static31.method758(arg0);
		} else if (Static66.anInt1741 <= arg0.anInt6595) {
			Static297.method4400(arg0);
		} else {
			Static372.method5571(false, arg0);
			local7 = Static329.anInt5689;
			local9 = Static245.anInt4506;
		}
		if (arg0.anInt7202 < 128 || arg0.anInt7207 < 128 || Static181.anInt3574 * 128 - 128 <= arg0.anInt7202 || (Static117.anInt2450 - 1) * 128 <= arg0.anInt7207) {
			arg0.anInt6609 = -1;
			arg0.anInt6603 = -1;
			local9 = 0;
			arg0.anInt6570 = 0;
			arg0.anInt6595 = 0;
			local7 = -1;
			arg0.lb = -1;
			arg0.anInt7202 = arg0.anIntArray458[0] * 128 + arg0.method5521() * 64;
			arg0.anInt7207 = arg0.anIntArray459[0] * 128 + arg0.method5521() * 64;
			arg0.method5516();
		}
		if (arg0 == Static302.aClass3_Sub2_Sub1_Sub2_2 && (arg0.anInt7202 < 1536 || arg0.anInt7207 < 1536 || arg0.anInt7202 >= (Static181.anInt3574 - 12) * 128 || arg0.anInt7207 >= Static117.anInt2450 * 128 - 1536)) {
			local9 = 0;
			arg0.anInt6570 = 0;
			arg0.lb = -1;
			arg0.anInt6603 = -1;
			arg0.anInt6609 = -1;
			arg0.anInt6595 = 0;
			local7 = -1;
			arg0.anInt7202 = arg0.anIntArray458[0] * 128 + arg0.method5521() * 64;
			arg0.anInt7207 = arg0.anIntArray459[0] * 128 + arg0.method5521() * 64;
			arg0.method5516();
		}
		@Pc(212) int local212 = Static338.method4924(arg0);
		Static10.method337(local9, arg0, local212, local7);
		Static340.method4954(arg0);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method4601(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 < 1 || arg3 < 1 || Static181.anInt3574 - 2 < arg0 || arg3 > Static117.anInt2450 - 2) {
			return;
		}
		@Pc(25) int local25 = arg7;
		if (arg7 < 3 && Static313.method4558(arg3, arg0)) {
			local25 = arg7 + 1;
		}
		if (!Static291.aClass28_Sub1_1.method832(Static294.anInt5208) && !Static426.method6223(Static232.anInt4221, arg0, local25, arg3)) {
			return;
		}
		if (Static409.aClass101ArrayArrayArray3 == null) {
			return;
		}
		Static393.aClass115_Sub1_2.method6007(Static209.aClass210Array2[arg7], arg0, arg7, Static126.aClass66_5, arg2, arg3);
		if (arg5 >= 0) {
			@Pc(71) boolean local71 = Static291.aClass28_Sub1_1.aBoolean78;
			Static291.aClass28_Sub1_1.aBoolean78 = true;
			Static393.aClass115_Sub1_2.method5997(arg7, arg6, Static126.aClass66_5, arg4, arg3, Static209.aClass210Array2[arg7], local25, arg0, arg5, arg1);
			Static291.aClass28_Sub1_1.aBoolean78 = local71;
		}
	}
}
