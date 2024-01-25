import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static658 {

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "[I")
	public static int[] anIntArray591 = new int[1];

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "([IIZLclient!gh;)V")
	public static void method9647(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class15_Sub3_Sub3_Sub1_Sub2 arg2) {
		@Pc(10) boolean local10;
		@Pc(12) int local12;
		if (arg2.anIntArray184 != null) {
			local10 = true;
			for (local12 = 0; local12 < arg2.anIntArray184.length; local12++) {
				if (arg2.anIntArray184[local12] != arg0[local12]) {
					local10 = false;
					break;
				}
			}
			if (local10 && arg2.anInt3985 != -1) {
				@Pc(48) Class178 local48 = Static354.aClass40_2.method1123(arg2.anInt3985);
				@Pc(51) int local51 = local48.anInt5129;
				if (local51 == 1) {
					arg2.anInt3998 = 0;
					arg2.anInt3995 = 1;
					arg2.anInt4021 = 0;
					arg2.anInt4036 = 0;
					arg2.anInt4030 = arg1;
					if (!arg2.aBoolean315) {
						Static509.method7938(local48, arg2, arg2.anInt4021);
					}
				}
				if (local51 == 2) {
					arg2.anInt3998 = 0;
				}
			}
		}
		local10 = true;
		for (local12 = 0; local12 < arg0.length; local12++) {
			if (arg0[local12] != -1) {
				local10 = false;
			}
			if (arg2.anIntArray184 == null || arg2.anIntArray184[local12] == -1 || Static354.aClass40_2.method1123(arg0[local12]).anInt5138 >= Static354.aClass40_2.method1123(arg2.anIntArray184[local12]).anInt5138) {
				arg2.anInt4030 = arg1;
				arg2.anIntArray184 = arg0;
				arg2.anInt4038 = arg2.anInt4039;
			}
		}
		if (local10) {
			arg2.anInt4038 = arg2.anInt4039;
			arg2.anIntArray184 = arg0;
			arg2.anInt4030 = arg1;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)V")
	public static void method9648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class2_Sub1_Sub5 local14 = Static653.method9595(7, (long) arg1);
		local14.method2486();
		local14.anInt2680 = arg0;
	}
}
