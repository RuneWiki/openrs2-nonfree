import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(ILclient!ha;IIIII)Lclient!ka;")
	public static Class83 method3433(@OriginalArg(1) Class16 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) arg5;
		@Pc(12) Class83 local12 = (Class83) Static527.aClass236_86.method6242(local6);
		if (local12 == null) {
			@Pc(22) Class344 local22 = Static600.method8252(Static517.aClass237_125, arg5);
			if (local22 == null) {
				return null;
			}
			if (local22.anInt9915 < 13) {
				local22.method8065();
			}
			local12 = arg0.method6094(local22, 2055, Static298.anInt10341, 64, 768);
			Static527.aClass236_86.method6241(local6, local12);
		}
		local12 = local12.method7993((byte) 2, 2055, true);
		if (arg4 != 0) {
			local12.a(arg4);
		}
		if (arg1 != 0) {
			local12.FA(arg1);
		}
		if (arg3 != 0) {
			local12.VA(arg3);
		}
		if (arg2 != 0) {
			local12.H(0, arg2, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(IBI)V")
	public static void method3434(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static281.aClass217_4 == Static18.aClass217_1) {
			if (Static46.method1367(false, 0, -2, arg0, 1, 1, 0, arg1)) {
				return;
			}
			Static46.method1367(false, 0, -3, arg0, 1, 1, 0, arg1);
		} else if (Static46.method1367(false, 0, -3, arg0, 1, 1, 0, arg1)) {
			return;
		} else {
			Static46.method1367(false, 0, -2, arg0, 1, 1, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(BI)Lclient!tp;")
	public static Class331 method3435(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static368.aClass331ArrayArray2[local12] == null || Static368.aClass331ArrayArray2[local12][local16] == null) {
			@Pc(30) boolean local30 = Static498.method7246(local12);
			if (!local30) {
				return null;
			}
		}
		return Static368.aClass331ArrayArray2[local12][local16];
	}
}
