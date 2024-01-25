import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!jh", name = "x", descriptor = "Ljava/lang/Thread;")
	public static Thread aThread3;

	@OriginalMember(owner = "client!jh", name = "v", descriptor = "Lclient!dj;")
	public static final Class74 aClass74_11 = new Class74(4, 1, 1, 1);

	@OriginalMember(owner = "client!jh", name = "A", descriptor = "Lclient!ufa;")
	public static final Class337 aClass337_8 = new Class337(0, -1);

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(BIII)V")
	public static void method4347(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg2 + Static299.anInt5307;
		@Pc(14) int local14 = Static171.anInt3340 + arg0;
		if (Static330.aClass77ArrayArrayArray2 == null || arg2 < 0 || arg0 < 0 || Static634.anInt10129 <= arg2 || arg0 >= Static638.anInt10172 || Static262.aClass3_Sub27_12.aClass21_Sub8_2.method2406() == 0 && Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aByte123 != arg1) {
			return;
		}
		@Pc(66) long local66 = (long) (local14 << 14 | arg1 << 28 | local10);
		@Pc(72) Class3_Sub51 local72 = (Class3_Sub51) Static356.aClass280_28.method7107(local66);
		if (local72 == null) {
			Static583.method8239(arg1, arg2, arg0);
			return;
		}
		@Pc(86) Class3_Sub45 local86 = (Class3_Sub45) local72.aClass223_62.method5874();
		if (local86 == null) {
			Static583.method8239(arg1, arg2, arg0);
			return;
		}
		@Pc(100) Class4_Sub1_Sub1_Sub1 local100 = (Class4_Sub1_Sub1_Sub1) Static583.method8239(arg1, arg2, arg0);
		if (local100 == null) {
			local100 = new Class4_Sub1_Sub1_Sub1(arg2 << 9, Static364.aClass51Array3[arg1].method7835(arg2, arg0), arg0 << 9, arg1, arg1);
		} else {
			local100.anInt3538 = local100.anInt3549 = -1;
		}
		local100.anInt3539 = local86.anInt8272;
		local100.anInt3545 = local86.anInt8270;
		label56: while (true) {
			@Pc(143) Class3_Sub45 local143 = (Class3_Sub45) local72.aClass223_62.method5870();
			if (local143 == null) {
				break;
			}
			if (local143.anInt8270 != local100.anInt3545) {
				local100.anInt3535 = local143.anInt8272;
				local100.anInt3538 = local143.anInt8270;
				while (true) {
					@Pc(168) Class3_Sub45 local168 = (Class3_Sub45) local72.aClass223_62.method5870();
					if (local168 == null) {
						break label56;
					}
					if (local168.anInt8270 != local100.anInt3545 && local100.anInt3538 != local168.anInt8270) {
						local100.anInt3549 = local168.anInt8270;
						local100.anInt3550 = local168.anInt8272;
					}
				}
			}
		}
		@Pc(212) int local212 = Static192.method3263((arg0 << 9) + 256, (arg2 << 9) + 256, arg1);
		local100.aByte124 = (byte) arg1;
		local100.anInt8916 = arg2 << 9;
		local100.anInt8911 = arg0 << 9;
		local100.anInt3543 = 0;
		local100.anInt8915 = local212;
		local100.aByte123 = (byte) arg1;
		if (Static486.method7232(arg0, arg2)) {
			local100.aByte124++;
		}
		Static278.method4516(arg1, arg2, arg0, local212, local100);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!cs;I)V")
	public static void method4348(@OriginalArg(0) Class4_Sub1_Sub2_Sub1 arg0) {
		if (arg0 instanceof Class4_Sub1_Sub2_Sub1_Sub1) {
			@Pc(39) Class4_Sub1_Sub2_Sub1_Sub1 local39 = (Class4_Sub1_Sub2_Sub1_Sub1) arg0;
			if (local39.aClass109_1 == null) {
				return;
			}
			Static478.method7169(local39.aByte123 != Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aByte123, local39);
		} else if (arg0 instanceof Class4_Sub1_Sub2_Sub1_Sub2) {
			@Pc(20) Class4_Sub1_Sub2_Sub1_Sub2 local20 = (Class4_Sub1_Sub2_Sub1_Sub2) arg0;
			Static428.method4110(local20, Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aByte123 != local20.aByte123);
			return;
		}
	}
}
