import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static491 {

	@OriginalMember(owner = "client!sm", name = "t", descriptor = "Lclient!taa;")
	public static Class318 aClass318_1;

	@OriginalMember(owner = "client!sm", name = "r", descriptor = "I")
	public static int anInt8009 = -1;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZI)V")
	public static void method6644(@OriginalArg(0) boolean arg0) {
		for (@Pc(10) Class3_Sub18 local10 = (Class3_Sub18) Static220.aClass112_25.method3088(); local10 != null; local10 = (Class3_Sub18) Static220.aClass112_25.method3084()) {
			if (local10.aClass3_Sub4_Sub1_3 != null) {
				Static353.aClass3_Sub4_Sub2_1.method639(local10.aClass3_Sub4_Sub1_3);
				local10.aClass3_Sub4_Sub1_3 = null;
			}
			if (local10.aClass3_Sub4_Sub1_2 != null) {
				Static353.aClass3_Sub4_Sub2_1.method639(local10.aClass3_Sub4_Sub1_2);
				local10.aClass3_Sub4_Sub1_2 = null;
			}
			local10.method7825();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(53) Class3_Sub18 local53 = (Class3_Sub18) Static350.aClass112_47.method3088(); local53 != null; local53 = (Class3_Sub18) Static350.aClass112_47.method3084()) {
			if (local53.aClass3_Sub4_Sub1_3 != null) {
				Static353.aClass3_Sub4_Sub2_1.method639(local53.aClass3_Sub4_Sub1_3);
				local53.aClass3_Sub4_Sub1_3 = null;
			}
			local53.method7825();
		}
		for (@Pc(80) Class3_Sub18 local80 = (Class3_Sub18) Static173.aClass354_14.method7694(); local80 != null; local80 = (Class3_Sub18) Static173.aClass354_14.method7692()) {
			if (local80.aClass3_Sub4_Sub1_3 != null) {
				Static353.aClass3_Sub4_Sub2_1.method639(local80.aClass3_Sub4_Sub1_3);
				local80.aClass3_Sub4_Sub1_3 = null;
			}
			local80.method7825();
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IC)Z")
	public static boolean method6646(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static3.method5712(arg0)) {
			return true;
		} else {
			@Pc(23) char[] local23 = Static334.aCharArray9;
			for (@Pc(25) int local25 = 0; local25 < local23.length; local25++) {
				@Pc(31) char local31 = local23[local25];
				if (arg0 == local31) {
					return true;
				}
			}
			@Pc(51) char[] local51 = Static457.aCharArray14;
			for (@Pc(53) int local53 = 0; local53 < local51.length; local53++) {
				@Pc(59) char local59 = local51[local53];
				if (arg0 == local59) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIIIILclient!r;I)V")
	public static void method6647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class45 arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface4 local11 = (Interface4) Static184.method3149(arg1, arg2, arg3);
		@Pc(22) Class280 local22;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(39) int local39;
		if (local11 != null) {
			local22 = Static478.aClass212_3.method4793(local11.method7561());
			local28 = local11.method7562() & 0x3;
			local32 = local11.method7556();
			if (local22.anInt7383 == -1) {
				local39 = arg0;
				if (local22.anInt7380 > 0) {
					local39 = arg4;
				}
				if (local32 == 0 || local32 == 2) {
					if (local28 == 0) {
						arg6.method7383(arg7, local39, arg5, 4);
					} else if (local28 == 1) {
						arg6.method7427(arg5, arg7, 4, local39);
					} else if (local28 == 2) {
						arg6.method7383(arg7, local39, arg5 + 3, 4);
					} else if (local28 == 3) {
						arg6.method7427(arg5, arg7 + 3, 4, local39);
					}
				}
				if (local32 == 3) {
					if (local28 == 0) {
						arg6.method7425(1, arg5, arg7, local39, 1);
					} else if (local28 == 1) {
						arg6.method7425(1, arg5 + 3, arg7, local39, 1);
					} else if (local28 == 2) {
						arg6.method7425(1, arg5 + 3, arg7 + 3, local39, 1);
					} else if (local28 == 3) {
						arg6.method7425(1, arg5, arg7 + 3, local39, 1);
					}
				}
				if (local32 == 2) {
					if (local28 == 0) {
						arg6.method7427(arg5, arg7, 4, local39);
					} else if (local28 == 1) {
						arg6.method7383(arg7, local39, arg5 + 3, 4);
					} else if (local28 == 2) {
						arg6.method7427(arg5, arg7 + 3, 4, local39);
					} else if (local28 == 3) {
						arg6.method7383(arg7, local39, arg5, 4);
					}
				}
			} else {
				Static591.method7909(arg6, local28, local22, arg5, arg7);
			}
		}
		local11 = (Interface4) Static480.method6569(arg1, arg2, arg3, gda.class);
		if (local11 != null) {
			local22 = Static478.aClass212_3.method4793(local11.method7561());
			local28 = local11.method7562() & 0x3;
			local32 = local11.method7556();
			if (local22.anInt7383 != -1) {
				Static591.method7909(arg6, local28, local22, arg5, arg7);
			} else if (local32 == 9) {
				local39 = -1118482;
				if (local22.anInt7380 > 0) {
					local39 = -1179648;
				}
				if (local28 == 0 || local28 == 2) {
					arg6.method7388(arg5 + 3, arg7 - -3, local39, arg5, arg7);
				} else {
					arg6.method7388(arg5 + 3, arg7, local39, arg5, arg7 + 3);
				}
			}
		}
		local11 = (Interface4) Static508.method6867(arg1, arg2, arg3);
		if (local11 == null) {
			return;
		}
		local22 = Static478.aClass212_3.method4793(local11.method7561());
		local28 = local11.method7562() & 0x3;
		if (local22.anInt7383 != -1) {
			Static591.method7909(arg6, local28, local22, arg5, arg7);
			return;
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!fa;ILjava/awt/Canvas;)Lclient!r;")
	public static Class45 method6648(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) Canvas arg1) {
		return new Class45_Sub1(arg1, arg0);
	}
}
