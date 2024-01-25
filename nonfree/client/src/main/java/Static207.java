import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIII[B)V")
	public static void method7956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) byte[] arg3) {
		if (arg2 >= arg1) {
			return;
		}
		arg0 += arg2;
		@Pc(20) int local20 = arg1 - arg2 >> 2;
		while (true) {
			local20--;
			if (local20 < 0) {
				local20 = arg1 - arg2 & 0x3;
				while (true) {
					local20--;
					if (local20 < 0) {
						return;
					}
					arg3[arg0++] = 1;
				}
			}
			@Pc(25) int local25 = arg0 + 1;
			arg3[arg0] = 1;
			@Pc(30) int local30 = local25 + 1;
			arg3[local25] = 1;
			@Pc(35) int local35 = local30 + 1;
			arg3[local30] = 1;
			arg0 = local35 + 1;
			arg3[local35] = 1;
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIIII)V")
	public static void method7961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class138 local3 = new Class138();
		local3.anInt4402 = arg1 >> Static246.anInt4759;
		local3.anInt4401 = arg2 >> Static246.anInt4759;
		local3.anInt4394 = arg3 >> Static246.anInt4759;
		local3.anInt4389 = arg4 >> Static246.anInt4759;
		local3.anInt4403 = arg0;
		local3.anInt4404 = arg1;
		local3.anInt4405 = arg2;
		local3.anInt4398 = arg3;
		local3.anInt4397 = arg4;
		local3.anInt4407 = arg5;
		local3.anInt4388 = arg6;
		Static327.aClass138Array3[Static64.anInt1870++] = local3;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ILclient!te;)V")
	public static void method7964(@OriginalArg(1) Class9_Sub3 arg0) {
		@Pc(14) byte[] local14;
		if (Static389.anObject11 == null) {
			@Pc(5) Class61_Sub1_Sub1 local5 = new Class61_Sub1_Sub1();
			local14 = local5.method2162();
			Static389.anObject11 = Static155.method3121(local14);
		}
		if (Static489.anObject14 == null) {
			@Pc(29) Class61_Sub2_Sub1 local29 = new Class61_Sub2_Sub1();
			local14 = local29.method7051();
			Static489.anObject14 = Static155.method3121(local14);
		}
		@Pc(55) Class211 local55 = arg0.aClass211_1;
		if (local55.method5457() && Static546.anObject18 == null) {
			local14 = Static139.method2953(0.5F, 4.0F, 4.0F, new Class104_Sub1(419684), 0.6F, 16.0F);
			Static546.anObject18 = Static155.method3121(local14);
		}
	}
}
