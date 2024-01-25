import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!hw", name = "rd", descriptor = "I")
	public static int anInt4300;

	@OriginalMember(owner = "client!hw", name = "Xc", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_31 = new Class344(23, 7);

	@OriginalMember(owner = "client!hw", name = "Md", descriptor = "I")
	public static int anInt4320 = 0;

	@OriginalMember(owner = "client!hw", name = "Td", descriptor = "I")
	public static final int anInt4325 = 1405;

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(II[FIIFFIIIIFI)V")
	public static void method3344(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) float arg11) {
		@Pc(9) int local9 = arg4 - arg0;
		@Pc(17) int local17 = arg10 - arg7;
		@Pc(21) int local21 = arg1 - arg9;
		@Pc(42) float local42 = arg2[1] * (float) local21 + arg2[0] * (float) local9 + (float) local17 * arg2[2];
		@Pc(63) float local63 = arg2[5] * (float) local17 + arg2[4] * (float) local21 + arg2[3] * (float) local9;
		@Pc(84) float local84 = arg2[7] * (float) local21 + arg2[6] * (float) local9 + (float) local17 * arg2[8];
		@Pc(100) float local100;
		@Pc(106) float local106;
		if (arg8 == 0) {
			local106 = arg5 + 0.5F - local84;
			local100 = arg6 + local42 + 0.5F;
		} else if (arg8 == 1) {
			local100 = arg6 + local42 + 0.5F;
			local106 = arg5 + local84 + 0.5F;
		} else if (arg8 == 2) {
			local100 = arg6 + 0.5F - local42;
			local106 = arg11 + 0.5F - local63;
		} else if (arg8 == 3) {
			local106 = arg11 + 0.5F - local63;
			local100 = local42 + arg6 + 0.5F;
		} else if (arg8 == 4) {
			local100 = arg5 + local84 + 0.5F;
			local106 = arg11 + 0.5F - local63;
		} else {
			local106 = arg11 + 0.5F - local63;
			local100 = arg5 + 0.5F - local84;
		}
		@Pc(203) float local203;
		if (arg3 == 1) {
			local203 = local100;
			local100 = -local106;
			local106 = local203;
		} else if (arg3 == 2) {
			local100 = -local100;
			local106 = -local106;
		} else if (arg3 == 3) {
			local203 = local100;
			local100 = local106;
			local106 = -local203;
		}
		Static17.aFloat40 = local106;
		Static223.aFloat104 = local100;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IB)I")
	public static int method3349(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(27) int local27 = local13 | local13 >>> 2;
		@Pc(33) int local33 = local27 | local27 >>> 4;
		@Pc(39) int local39 = local33 | local33 >>> 8;
		@Pc(45) int local45 = local39 | local39 >>> 16;
		return ~local45 & arg0;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method3350(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(13) Class4_Sub6_Sub5 local13 = Static396.method6079(arg0, 2);
		local13.method2303();
		local13.aString45 = arg1;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(ZILclient!sh;Z)V")
	public static void method3352(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class4_Sub45 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) int local8 = arg1.anInt9096;
		@Pc(12) int local12 = (int) arg1.aLong295;
		arg1.method8193();
		if (arg0) {
			Static192.method3153(local8);
		}
		Static64.method1449(local8);
		@Pc(27) Class155 local27 = Static558.method7916(local12);
		if (local27 != null) {
			Static368.method5060(local27);
		}
		Static569.method5999();
		if (!arg2 && Static446.anInt8493 != -1) {
			Static396.method6077(1, Static446.anInt8493);
		}
		@Pc(57) Class217 local57 = new Class217(Static569.aClass221_27);
		for (@Pc(62) Class4_Sub45 local62 = (Class4_Sub45) local57.method5013(); local62 != null; local62 = (Class4_Sub45) local57.method5016()) {
			if (!local62.method8199()) {
				local62 = (Class4_Sub45) local57.method5013();
				if (local62 == null) {
					return;
				}
			}
			if (local62.anInt9095 == 3) {
				@Pc(84) int local84 = (int) local62.aLong295;
				if (local8 == local84 >>> 16) {
					method3352(true, local62, arg2);
				}
			}
		}
	}
}
