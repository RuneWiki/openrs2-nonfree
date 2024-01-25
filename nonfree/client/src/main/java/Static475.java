import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static475 {

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "Lclient!wb;")
	public static Class370 aClass370_1;

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray8;

	@OriginalMember(owner = "client!rc", name = "s", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray65;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!bfa;IILclient!jl;BILclient!cca;I)V")
	public static void method7020(@OriginalArg(0) Class4_Sub2_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class181 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class4_Sub2_Sub1_Sub1_Sub2 arg5, @OriginalArg(7) int arg6) {
		@Pc(12) Class5_Sub20 local12 = new Class5_Sub20();
		local12.anInt2410 = arg2 << 9;
		local12.anInt2406 = arg6 << 9;
		local12.anInt2418 = arg1;
		if (arg3 != null) {
			local12.aClass181_1 = arg3;
			@Pc(162) int local162 = arg3.anInt4756;
			@Pc(165) int local165 = arg3.anInt4781;
			if (arg4 == 1 || arg4 == 3) {
				local165 = arg3.anInt4756;
				local162 = arg3.anInt4781;
			}
			local12.anInt2409 = arg3.anInt4735 << 9;
			local12.anInt2421 = arg3.anInt4765;
			local12.anInt2407 = arg2 + local162 << 9;
			local12.anInt2414 = arg3.anInt4768;
			local12.anInt2405 = arg3.anInt4746;
			local12.anInt2413 = arg3.anInt4751;
			local12.aBoolean183 = arg3.aBoolean341;
			local12.anInt2417 = arg3.anInt4759;
			local12.anInt2419 = arg3.anInt4762;
			local12.anInt2408 = local165 + arg6 << 9;
			local12.anIntArray145 = arg3.anIntArray239;
			local12.aBoolean184 = arg3.aBoolean342;
			if (arg3.anIntArray235 != null) {
				local12.aBoolean182 = true;
				local12.method2018();
			}
			if (local12.anIntArray145 != null) {
				local12.anInt2411 = (int) (Math.random() * (double) (local12.anInt2419 - local12.anInt2421)) + local12.anInt2421;
			}
			Static368.aClass330_32.method7917(local12);
			return;
		}
		if (arg5 != null) {
			local12.aClass4_Sub2_Sub1_Sub1_Sub2_2 = arg5;
			@Pc(35) Class225 local35 = arg5.aClass225_1;
			if (local35.anIntArray304 != null) {
				local12.aBoolean182 = true;
				local35 = local35.method4990(Static301.aClass59_1);
			}
			if (local35 != null) {
				local12.anInt2407 = arg2 + local35.anInt5618 << 9;
				local12.anInt2408 = arg6 + local35.anInt5618 << 9;
				local12.anInt2413 = Static65.method1091(arg5);
				local12.anInt2417 = local35.anInt5644;
				local12.anInt2414 = local35.anInt5643;
				local12.aBoolean183 = local35.aBoolean411;
				local12.anInt2409 = local35.anInt5625 << 9;
				local12.anInt2405 = local35.anInt5649;
			}
			Static497.aClass330_55.method7917(local12);
			return;
		}
		if (arg0 == null) {
			return;
		}
		local12.aClass4_Sub2_Sub1_Sub1_Sub1_1 = arg0;
		local12.anInt2407 = arg2 + arg0.method1018() << 9;
		local12.anInt2408 = arg0.method1018() + arg6 << 9;
		local12.anInt2413 = Static543.method7963(arg0);
		local12.anInt2417 = arg0.anInt919;
		local12.anInt2405 = 256;
		local12.anInt2409 = arg0.anInt926 << 9;
		local12.aBoolean183 = arg0.aBoolean45;
		local12.anInt2414 = 256;
		Static311.aClass273_13.method6585((long) arg0.anInt1225, local12);
		return;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIII)V")
	public static void method7023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static356.anInt5934 = arg1;
		Static170.anInt3041 = arg5;
		Static565.anInt9561 = arg0;
		Static609.anInt10201 = arg2;
		Static636.anInt10568 = arg3;
		Static316.anInt5385 = arg4;
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(IIIIIII)Z")
	public static boolean method7024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg0 + arg4;
		@Pc(11) int local11 = arg5 + arg2;
		@Pc(20) int local20 = arg3 + arg1;
		if (!Static606.method8668(local11, local7, arg1, local11, arg4, local11, arg4, local20, local20)) {
			return false;
		} else if (Static606.method8668(local11, local7, arg1, local11, local7, local11, arg4, local20, arg1)) {
			if (arg4 >= Static36.anInt575) {
				if (!Static606.method8668(arg2, local7, local20, local11, local7, local11, local7, local20, arg1)) {
					return false;
				}
				if (!Static606.method8668(arg2, local7, local20, local11, local7, arg2, local7, arg1, arg1)) {
					return false;
				}
			} else if (!Static606.method8668(arg2, arg4, local20, local11, arg4, local11, arg4, local20, arg1)) {
				return false;
			} else if (!Static606.method8668(arg2, arg4, local20, local11, arg4, arg2, arg4, arg1, arg1)) {
				return false;
			}
			if (Static73.anInt6083 > arg1) {
				if (!Static606.method8668(arg2, local7, arg1, local11, arg4, local11, arg4, arg1, arg1)) {
					return false;
				}
				if (!Static606.method8668(arg2, local7, arg1, local11, local7, arg2, arg4, arg1, arg1)) {
					return false;
				}
			} else if (!Static606.method8668(arg2, local7, local20, local11, arg4, local11, arg4, local20, local20)) {
				return false;
			} else if (!Static606.method8668(arg2, local7, local20, local11, local7, arg2, arg4, local20, local20)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}
}
