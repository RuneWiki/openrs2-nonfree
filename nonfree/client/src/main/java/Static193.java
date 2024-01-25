import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!go", name = "h", descriptor = "I")
	public static int anInt2613;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIIZIII)V")
	public static void method2211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg1 + arg4;
		@Pc(13) int local13 = arg5 - arg1;
		for (@Pc(15) int local15 = arg4; local15 < local9; local15++) {
			Static571.method7990(arg0, Static173.anIntArrayArray15[local15], arg3, arg2);
		}
		@Pc(38) int local38 = arg2 - arg1;
		for (@Pc(40) int local40 = arg5; local40 > local13; local40--) {
			Static571.method7990(arg0, Static173.anIntArrayArray15[local40], arg3, arg2);
		}
		@Pc(63) int local63 = arg1 + arg3;
		for (@Pc(65) int local65 = local9; local65 <= local13; local65++) {
			@Pc(71) int[] local71 = Static173.anIntArrayArray15[local65];
			Static571.method7990(arg0, local71, arg3, local63);
			Static571.method7990(arg6, local71, local63, local38);
			Static571.method7990(arg0, local71, local38, arg2);
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIILclient!ni;)Lclient!gga;")
	public static Class6_Sub5_Sub13 method2213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class223 arg2) {
		@Pc(14) Class6_Sub8 local14 = new Class6_Sub8(arg2.method5954(arg0, arg1));
		@Pc(47) Class6_Sub5_Sub13 local47 = new Class6_Sub5_Sub13(arg0, local14.method8221(), local14.method8221(), local14.method8236(), local14.method8236(), local14.method8246() == 1, local14.method8246(), local14.method8246());
		@Pc(51) int local51 = local14.method8246();
		for (@Pc(53) int local53 = 0; local53 < local51; local53++) {
			local47.aClass163_21.method4967(new Class6_Sub11(local14.method8246(), local14.method8220(), local14.method8220(), local14.method8220(), local14.method8220(), local14.method8220(), local14.method8220(), local14.method8220(), local14.method8220()));
		}
		local47.method3440();
		return local47;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!kaa;IIIZ)V")
	public static void method2214(@OriginalArg(0) Class6_Sub32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) long local16 = (long) (arg1 << 28 | arg2 << 14 | arg3);
		@Pc(22) Class6_Sub47 local22 = (Class6_Sub47) Static283.aClass380_37.method8747(local16);
		if (local22 == null) {
			local22 = new Class6_Sub47();
			Static283.aClass380_37.method8753(local22, local16);
			local22.aClass163_56.method4967(arg0);
			return;
		}
		@Pc(45) Class306 local45 = Static356.aClass221_1.method5923(arg0.anInt5945);
		@Pc(48) int local48 = local45.anInt9092;
		if (local45.anInt9086 == 1) {
			local48 *= arg0.anInt5947 + 1;
		}
		for (@Pc(67) Class6_Sub32 local67 = (Class6_Sub32) local22.aClass163_56.method4966(); local67 != null; local67 = (Class6_Sub32) local22.aClass163_56.method4965()) {
			local45 = Static356.aClass221_1.method5923(local67.anInt5945);
			@Pc(78) int local78 = local45.anInt9092;
			if (local45.anInt9086 == 1) {
				local78 *= local67.anInt5947 + 1;
			}
			if (local48 > local78) {
				Static492.method7159(local67, arg0);
				return;
			}
		}
		local22.aClass163_56.method4967(arg0);
	}
}
