import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "Lclient!r;")
	public static Class174 aClass174_2;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)I")
	public static int method3710() {
		return Static5.anInt94;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
	public static void method3711() {
		for (@Pc(7) int local7 = 0; local7 < Static139.aClass14ArrayArray1.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < Static139.aClass14ArrayArray1[local7].length; local11++) {
				Static139.aClass14ArrayArray1[local7][local11] = Static54.aClass14_1;
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZLjava/lang/String;Lclient!dp;)Lclient!d;")
	public static Class41 method3712(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class53 arg2) {
		@Pc(12) int local12 = arg2.method1037(arg1);
		if (local12 == -1) {
			return new Class41(0);
		}
		@Pc(25) int[] local25 = arg2.method1027(local12);
		@Pc(31) Class41 local31 = new Class41(local25.length);
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		while (true) {
			while (local33 < local31.anInt969) {
				@Pc(49) Class6_Sub10 local49 = new Class6_Sub10(arg2.method1033(local25[local35++], local12));
				@Pc(55) int local55 = local49.method3979();
				@Pc(59) int local59 = local49.method4021();
				@Pc(63) int local63 = local49.method3972();
				if (!arg0 && local63 == 1) {
					local31.anInt969--;
				} else {
					local31.anIntArray111[local33] = local55;
					local31.anIntArray110[local33] = local59;
					local33++;
				}
			}
			return local31;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)V")
	public static void method3713(@OriginalArg(1) int arg0) {
		Static36.anIntArray86 = new int[arg0];
		Static326.anIntArray687 = new int[arg0];
		Static22.anIntArray36 = new int[arg0];
		Static102.anIntArray566 = new int[arg0];
		Static247.anIntArray485 = new int[arg0];
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)Lclient!jo;")
	public static Class64_Sub1 method3715() {
		Static262.anInt4777 = 0;
		return Static174.method3400();
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILclient!nc;)V")
	public static void method3716(@OriginalArg(0) int arg0, @OriginalArg(1) Class106 arg1) {
		Static203.aClass106Array3[arg0] = arg1;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIBLclient!kq;I)V")
	public static void method3717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class6_Sub23 arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) (arg3 | arg0 << 14 | arg1 << 28);
		@Pc(24) Class6_Sub8 local24 = (Class6_Sub8) Static33.aClass108_3.method2900(local16);
		if (local24 == null) {
			local24 = new Class6_Sub8();
			Static33.aClass108_3.method2898(local16, local24);
			local24.aClass211_4.method5585(arg2);
			return;
		}
		@Pc(46) Class147 local46 = Static211.method3762(arg2.anInt3151);
		@Pc(49) int local49 = local46.anInt3964;
		if (local46.anInt3997 == 1) {
			local49 *= arg2.anInt3148 + 1;
		}
		for (@Pc(68) Class6_Sub23 local68 = (Class6_Sub23) local24.aClass211_4.method5594(); local68 != null; local68 = (Class6_Sub23) local24.aClass211_4.method5582()) {
			local46 = Static211.method3762(local68.anInt3151);
			@Pc(78) int local78 = local46.anInt3964;
			if (local46.anInt3997 == 1) {
				local78 *= local68.anInt3148 + 1;
			}
			if (local78 < local49) {
				Static11.method200(local68, arg2);
				return;
			}
		}
		local24.aClass211_4.method5585(arg2);
	}
}
