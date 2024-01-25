import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!k", name = "b", descriptor = "[Lclient!d;")
	public static Class52[] aClass52Array2;

	@OriginalMember(owner = "client!k", name = "d", descriptor = "Lclient!ls;")
	public static Class182 aClass182_1;

	@OriginalMember(owner = "client!k", name = "g", descriptor = "I")
	public static int anInt4976 = 765;

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(I)V")
	public static void method4167() {
		for (@Pc(3) int local3 = 0; local3 < Static221.anInt4798; local3++) {
			@Pc(9) int local9 = Static3.anIntArray80[local3];
			@Pc(16) Class3_Sub3 local16 = (Class3_Sub3) Static240.aClass267_20.method6644((long) local9);
			if (local16 != null) {
				@Pc(21) Class6_Sub1_Sub2_Sub2 local21 = local16.aClass6_Sub1_Sub2_Sub2_1;
				Static27.method795(local21, local21.aClass230_1.anInt7040);
			}
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V")
	public static void method4168() {
		Static179.anInt4933 = 0;
		Static255.aClass71_43.method2088();
		Static255.aClass71_43.method2076(Static203.aClass3_Sub11_3);
		Static179.anInt4933++;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIII)V")
	public static void method4169(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) int local15 = Static73.method7829(arg1, Static269.anInt5577, Static81.anInt1788);
		@Pc(21) int local21 = Static73.method7829(arg4, Static269.anInt5577, Static81.anInt1788);
		@Pc(27) int local27 = Static73.method7829(arg3, Static190.anInt4314, Static145.anInt2941);
		@Pc(33) int local33 = Static73.method7829(arg0, Static190.anInt4314, Static145.anInt2941);
		for (@Pc(35) int local35 = local15; local35 <= local21; local35++) {
			Static257.method4540(Static68.anIntArrayArray24[local35], arg2, local27, local33);
		}
	}
}
