import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "[I")
	public static int[] anIntArray63;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "Lclient!vh;")
	public static Class187 aClass187_34 = new Class187(200);

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
	public static int anInt1042 = 0;

	@OriginalMember(owner = "client!dn", name = "i", descriptor = "[I")
	public static int[] anIntArray64 = new int[2500];

	@OriginalMember(owner = "client!dn", name = "j", descriptor = "Z")
	public static boolean aBoolean58 = false;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)V")
	public static void method974() {
		Static185.aClass187_96.method4534(5);
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V")
	public static void method976() {
		Static32.aClass187_76.method4525();
		Static306.aClass187_152.method4525();
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIII)V")
	public static void method977(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class1_Sub8 local12;
		for (local12 = (Class1_Sub8) Static75.aClass59_18.method1704(); local12 != null; local12 = (Class1_Sub8) Static75.aClass59_18.method1701()) {
			Static90.method1647(arg0, local12, arg2, arg1, arg3);
		}
		@Pc(44) byte local44;
		@Pc(49) Class11 local49;
		@Pc(147) int local147;
		for (local12 = (Class1_Sub8) Static93.aClass59_20.method1704(); local12 != null; local12 = (Class1_Sub8) Static93.aClass59_20.method1701()) {
			local44 = 1;
			local49 = local12.aClass15_Sub5_Sub1_1.method4698();
			if (local12.aClass15_Sub5_Sub1_1.anInt5569 == local49.anInt206) {
				local44 = 0;
			} else if (local49.anInt187 == local12.aClass15_Sub5_Sub1_1.anInt5569 || local12.aClass15_Sub5_Sub1_1.anInt5569 == local49.anInt193 || local49.anInt212 == local12.aClass15_Sub5_Sub1_1.anInt5569 || local12.aClass15_Sub5_Sub1_1.anInt5569 == local49.anInt191) {
				local44 = 2;
			} else if (local12.aClass15_Sub5_Sub1_1.anInt5569 == local49.anInt190 || local12.aClass15_Sub5_Sub1_1.anInt5569 == local49.anInt197 || local49.anInt181 == local12.aClass15_Sub5_Sub1_1.anInt5569 || local49.anInt192 == local12.aClass15_Sub5_Sub1_1.anInt5569) {
				local44 = 3;
			}
			if (local44 != local12.anInt506) {
				local147 = Static210.method3344(local12.aClass15_Sub5_Sub1_1);
				if (local12.anInt512 != local147) {
					if (local12.aClass1_Sub24_Sub2_1 != null) {
						Static205.aClass1_Sub24_Sub3_1.method4518(local12.aClass1_Sub24_Sub2_1);
						local12.aClass1_Sub24_Sub2_1 = null;
					}
					local12.anInt512 = local147;
				}
				local12.anInt506 = local44;
			}
			local12.anInt507 = local12.aClass15_Sub5_Sub1_1.anInt5559;
			local12.anInt509 = local12.aClass15_Sub5_Sub1_1.anInt5559 + local12.aClass15_Sub5_Sub1_1.method4702() * 64;
			local12.anInt508 = local12.aClass15_Sub5_Sub1_1.anInt5557;
			local12.anInt522 = local12.aClass15_Sub5_Sub1_1.anInt5557 + local12.aClass15_Sub5_Sub1_1.method4702() * 64;
			Static90.method1647(arg0, local12, arg2, arg1, arg3);
		}
		for (local12 = (Class1_Sub8) Static132.aClass142_18.method3534(); local12 != null; local12 = (Class1_Sub8) Static132.aClass142_18.method3530()) {
			local44 = 1;
			local49 = local12.aClass15_Sub5_Sub2_1.method4698();
			if (local49.anInt206 == local12.aClass15_Sub5_Sub2_1.anInt5569) {
				local44 = 0;
			} else if (local12.aClass15_Sub5_Sub2_1.anInt5569 == local49.anInt187 || local12.aClass15_Sub5_Sub2_1.anInt5569 == local49.anInt193 || local49.anInt212 == local12.aClass15_Sub5_Sub2_1.anInt5569 || local49.anInt191 == local12.aClass15_Sub5_Sub2_1.anInt5569) {
				local44 = 2;
			} else if (local49.anInt190 == local12.aClass15_Sub5_Sub2_1.anInt5569 || local12.aClass15_Sub5_Sub2_1.anInt5569 == local49.anInt197 || local49.anInt181 == local12.aClass15_Sub5_Sub2_1.anInt5569 || local49.anInt192 == local12.aClass15_Sub5_Sub2_1.anInt5569) {
				local44 = 3;
			}
			if (local44 != local12.anInt506) {
				local147 = Static84.method1586(local12.aClass15_Sub5_Sub2_1);
				if (local147 != local12.anInt512) {
					if (local12.aClass1_Sub24_Sub2_1 != null) {
						Static205.aClass1_Sub24_Sub3_1.method4518(local12.aClass1_Sub24_Sub2_1);
						local12.aClass1_Sub24_Sub2_1 = null;
					}
					local12.anInt512 = local147;
				}
				local12.anInt506 = local44;
			}
			local12.anInt507 = local12.aClass15_Sub5_Sub2_1.anInt5559;
			local12.anInt509 = local12.aClass15_Sub5_Sub2_1.anInt5559 + local12.aClass15_Sub5_Sub2_1.method4702() * 64;
			local12.anInt508 = local12.aClass15_Sub5_Sub2_1.anInt5557;
			local12.anInt522 = local12.aClass15_Sub5_Sub2_1.anInt5557 + local12.aClass15_Sub5_Sub2_1.method4702() * 64;
			Static90.method1647(arg0, local12, arg2, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IB)Lclient!n;")
	public static Class114 method978(@OriginalArg(0) int arg0) {
		@Pc(17) Class114 local17 = (Class114) Static51.aClass187_32.method4527((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(34) byte[] local34 = Static308.aClass121_134.method3115(Static130.method2230(arg0), Static299.method4549(arg0));
		local17 = new Class114();
		local17.anInt3483 = arg0;
		if (local34 != null) {
			local17.method2989(new Class1_Sub14(local34));
		}
		Static51.aClass187_32.method4524((long) arg0, local17);
		return local17;
	}
}
