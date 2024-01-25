import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!mca", name = "z", descriptor = "I")
	public static int anInt6294;

	@OriginalMember(owner = "client!mca", name = "E", descriptor = "I")
	public static int anInt6288 = 0;

	@OriginalMember(owner = "client!mca", name = "w", descriptor = "[I")
	public static final int[] anIntArray342 = new int[32];

	@OriginalMember(owner = "client!mca", name = "y", descriptor = "Lclient!c;")
	public static final Class51 aClass51_19 = new Class51(8, 1);

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(I[Lclient!qga;I)V")
	public static void method5551(@OriginalArg(0) int arg0, @OriginalArg(1) Class299[] arg1) {
		for (@Pc(10) int local10 = 0; local10 < arg1.length; local10++) {
			@Pc(16) Class299 local16 = arg1[local10];
			if (local16 != null && arg0 == local16.anInt8527 && !Static80.method1359(local16)) {
				if (local16.anInt8610 == 0) {
					method5551(local16.anInt8526, arg1);
					if (local16.aClass299Array2 != null) {
						method5551(local16.anInt8526, local16.aClass299Array2);
					}
					@Pc(63) Class14_Sub13 local63 = (Class14_Sub13) Static27.aClass125_3.method2630((long) local16.anInt8526);
					if (local63 != null) {
						Static380.method5854(local63.anInt1465);
					}
				}
				if (local16.anInt8610 == 6 && local16.anInt8567 != -1) {
					if (local16.aClass181_11 == null) {
						local16.aClass181_11 = new Class181_Sub1();
						local16.aClass181_11.method8964(local16.anInt8567, 0);
					}
					if (local16.aClass181_11.method8961(Static468.anInt7945) && local16.aClass181_11.method8962()) {
						local16.aClass181_11.method8942();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(Lclient!rea;I)I")
	public static int method5552(@OriginalArg(0) Class14_Sub21_Sub2 arg0) {
		@Pc(16) int local16 = arg0.method7764(2);
		@Pc(37) int local37;
		if (local16 == 0) {
			local37 = 0;
		} else if (local16 == 1) {
			local37 = arg0.method7764(5);
		} else if (local16 == 2) {
			local37 = arg0.method7764(8);
		} else {
			local37 = arg0.method7764(11);
		}
		return local37;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(Lclient!rea;B)V")
	public static void method5553(@OriginalArg(0) Class14_Sub21_Sub2 arg0) {
		arg0.method7730(Static126.aClass310_111.method7797());
		arg0.method7730(Static663.aClass310_134.method7797());
		arg0.method7730(Static376.aClass310_102.method7797());
		arg0.method7730(Static396.aClass310_81.method7797());
		arg0.method7730(Static620.aClass310_121.method7797());
		arg0.method7730(Static655.aClass310_132.method7797());
		arg0.method7730(Static341.aClass310_67.method7797());
		arg0.method7730(Static640.aClass310_127.method7797());
		arg0.method7730(Static99.aClass310_23.method7797());
		arg0.method7730(Static355.aClass310_72.method7797());
		arg0.method7730(Static358.aClass310_73.method7797());
		arg0.method7730(Static581.aClass310_113.method7797());
		arg0.method7730(Static413.aClass310_89.method7797());
		arg0.method7730(Static130.aClass310_31.method7797());
		arg0.method7730(Static237.aClass310_52.method7797());
		arg0.method7730(Static245.aClass310_55.method7797());
		arg0.method7730(Static403.aClass310_85.method7797());
		arg0.method7730(Static192.aClass310_135.method7797());
		arg0.method7730(Static524.aClass310_114.method7797());
		arg0.method7730(Static525.aClass310_105.method7797());
		arg0.method7730(Static214.aClass310_47.method7797());
		arg0.method7730(Static129.aClass310_28.method7797());
		arg0.method7730(Static604.aClass310_118.method7797());
		arg0.method7730(Static123.aClass310_26.method7797());
		arg0.method7730(Static228.aClass310_50.method7797());
		arg0.method7730(Static65.aClass310_16.method7797());
		arg0.method7730(Static334.aClass310_65.method7797());
		arg0.method7730(Static31.aClass310_8.method7797());
		arg0.method7730(Static4.aClass310_1.method7797());
		arg0.method7730(Static97.aClass310_22.method7797());
		arg0.method7730(Static248.aClass310_57.method7797());
		arg0.method7730(Static75.aClass310_17.method7797());
		arg0.method7730(Static477.method7150());
		arg0.method7730(Static193.method8385());
		arg0.method7730(Static64.aClass310_13.method7797());
	}
}
