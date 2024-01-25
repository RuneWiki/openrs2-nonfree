import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!jg", name = "J", descriptor = "Lclient!hn;")
	public static final Class102 aClass102_23 = new Class102(200);

	@OriginalMember(owner = "client!jg", name = "O", descriptor = "I")
	public static int anInt3295 = 0;

	@OriginalMember(owner = "client!jg", name = "U", descriptor = "Lclient!wc;")
	public static final Class262 aClass262_6 = new Class262();

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!jk;III)V")
	public static void method2737(@OriginalArg(0) Class124 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null) {
			return;
		}
		if (arg0.anObjectArray11 != null) {
			@Pc(13) Class1_Sub40 local13 = new Class1_Sub40();
			local13.anObjectArray36 = arg0.anObjectArray11;
			local13.aClass124_14 = arg0;
			Static298.method4076(local13);
		}
		Static331.anInt5639 = arg0.anInt3348;
		Static257.anInt4671 = arg0.anInt3405;
		Static10.anInt181 = arg0.anInt3378;
		Static326.anInt5571 = arg2;
		Static122.anInt2253 = arg1;
		Static433.aBoolean798 = true;
		Static33.anInt530 = arg0.anInt3400;
		Static353.anInt6050 = arg0.anInt3430;
		Static160.method2323(arg0);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IZIII)V")
	public static void method2739(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class1_Sub10 local10 = (Class1_Sub10) Static448.aClass227_54.method4967(); local10 != null; local10 = (Class1_Sub10) Static448.aClass227_54.method4973()) {
			Static49.method818(arg1, arg0, arg3, arg2, local10);
		}
		for (@Pc(31) Class1_Sub10 local31 = (Class1_Sub10) Static361.aClass227_37.method4967(); local31 != null; local31 = (Class1_Sub10) Static361.aClass227_37.method4973()) {
			@Pc(35) byte local35 = 1;
			@Pc(40) Class236 local40 = local31.aClass25_Sub5_Sub1_Sub1_1.method3428();
			if (local31.aClass25_Sub5_Sub1_Sub1_1.aBoolean483) {
				local35 = 0;
			} else if (local40.anInt6463 == local31.aClass25_Sub5_Sub1_Sub1_1.anInt4287 || local40.anInt6458 == local31.aClass25_Sub5_Sub1_Sub1_1.anInt4287 || local40.anInt6477 == local31.aClass25_Sub5_Sub1_Sub1_1.anInt4287 || local40.anInt6452 == local31.aClass25_Sub5_Sub1_Sub1_1.anInt4287) {
				local35 = 2;
			} else if (local40.anInt6470 == local31.aClass25_Sub5_Sub1_Sub1_1.anInt4287 || local40.anInt6454 == local31.aClass25_Sub5_Sub1_Sub1_1.anInt4287 || local40.anInt6441 == local31.aClass25_Sub5_Sub1_Sub1_1.anInt4287 || local31.aClass25_Sub5_Sub1_Sub1_1.anInt4287 == local40.anInt6466) {
				local35 = 3;
			}
			if (local35 != local31.anInt866) {
				@Pc(123) int local123 = Static4.method58(local31.aClass25_Sub5_Sub1_Sub1_1);
				if (local123 != local31.anInt864) {
					if (local31.aClass1_Sub6_Sub3_1 != null) {
						Static355.aClass1_Sub6_Sub4_2.method5179(local31.aClass1_Sub6_Sub3_1);
						local31.aClass1_Sub6_Sub3_1 = null;
					}
					local31.anInt864 = local123;
				}
				local31.anInt866 = local35;
			}
			local31.anInt859 = local31.aClass25_Sub5_Sub1_Sub1_1.anInt5518;
			local31.anInt855 = local31.aClass25_Sub5_Sub1_Sub1_1.anInt5518 + (local31.aClass25_Sub5_Sub1_Sub1_1.method3427() << 6);
			local31.anInt856 = local31.aClass25_Sub5_Sub1_Sub1_1.anInt5514;
			local31.anInt867 = local31.aClass25_Sub5_Sub1_Sub1_1.anInt5514 + (local31.aClass25_Sub5_Sub1_Sub1_1.method3427() << 6);
			Static49.method818(arg1, arg0, arg3, arg2, local31);
		}
		for (@Pc(201) Class1_Sub10 local201 = (Class1_Sub10) Static38.aClass199_25.method4392(); local201 != null; local201 = (Class1_Sub10) Static38.aClass199_25.method4393()) {
			@Pc(205) byte local205 = 1;
			@Pc(210) Class236 local210 = local201.aClass25_Sub5_Sub1_Sub2_1.method3428();
			if (local201.aClass25_Sub5_Sub1_Sub2_1.aBoolean483) {
				local205 = 0;
			} else if (local210.anInt6463 == local201.aClass25_Sub5_Sub1_Sub2_1.anInt4287 || local210.anInt6458 == local201.aClass25_Sub5_Sub1_Sub2_1.anInt4287 || local210.anInt6477 == local201.aClass25_Sub5_Sub1_Sub2_1.anInt4287 || local201.aClass25_Sub5_Sub1_Sub2_1.anInt4287 == local210.anInt6452) {
				local205 = 2;
			} else if (local210.anInt6470 == local201.aClass25_Sub5_Sub1_Sub2_1.anInt4287 || local210.anInt6454 == local201.aClass25_Sub5_Sub1_Sub2_1.anInt4287 || local201.aClass25_Sub5_Sub1_Sub2_1.anInt4287 == local210.anInt6441 || local201.aClass25_Sub5_Sub1_Sub2_1.anInt4287 == local210.anInt6466) {
				local205 = 3;
			}
			if (local201.anInt866 != local205) {
				@Pc(297) int local297 = Static332.method4453(local201.aClass25_Sub5_Sub1_Sub2_1);
				if (local201.anInt864 != local297) {
					if (local201.aClass1_Sub6_Sub3_1 != null) {
						Static355.aClass1_Sub6_Sub4_2.method5179(local201.aClass1_Sub6_Sub3_1);
						local201.aClass1_Sub6_Sub3_1 = null;
					}
					local201.anInt864 = local297;
				}
				local201.anInt866 = local205;
			}
			local201.anInt859 = local201.aClass25_Sub5_Sub1_Sub2_1.anInt5518;
			local201.anInt855 = local201.aClass25_Sub5_Sub1_Sub2_1.anInt5518 + (local201.aClass25_Sub5_Sub1_Sub2_1.method3427() << 6);
			local201.anInt856 = local201.aClass25_Sub5_Sub1_Sub2_1.anInt5514;
			local201.anInt867 = local201.aClass25_Sub5_Sub1_Sub2_1.anInt5514 + (local201.aClass25_Sub5_Sub1_Sub2_1.method3427() << 6);
			Static49.method818(arg1, arg0, arg3, arg2, local201);
		}
	}
}
