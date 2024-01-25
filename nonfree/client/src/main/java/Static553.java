import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static553 {

	@OriginalMember(owner = "client!tu", name = "k", descriptor = "Lclient!la;")
	public static Class207 aClass207_116;

	@OriginalMember(owner = "client!tu", name = "o", descriptor = "Z")
	public static boolean aBoolean673 = false;

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(III)Z")
	public static boolean method8054(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static303.method4733(arg0, arg1) & Static214.method3666(arg0, arg1);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIII)I")
	public static int method8055(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg1 >>= 0x4;
		} else if (arg2 > 217) {
			arg1 >>= 0x3;
		} else if (arg2 > 192) {
			arg1 >>= 0x2;
		} else if (arg2 > 179) {
			arg1 >>= 0x1;
		}
		return (arg2 >> 1) + (arg1 >> 5 << 7) + ((arg0 >> 2 & 0x3F) << 10);
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(IIII)I")
	public static int method8060(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 / arg2;
		@Pc(13) int local13 = arg2 - 1 & arg0;
		@Pc(17) int local17 = arg1 / arg2;
		@Pc(23) int local23 = arg2 - 1 & arg1;
		@Pc(28) int local28 = Static325.method4932(local7, local17);
		@Pc(37) int local37 = Static325.method4932(local7 + 1, local17);
		@Pc(44) int local44 = Static325.method4932(local7, local17 + 1);
		@Pc(60) int local60 = Static325.method4932(local7 + 1, local17 + 1);
		@Pc(69) int local69 = Static29.method324(local13, local37, arg2, local28);
		@Pc(76) int local76 = Static29.method324(local13, local60, arg2, local44);
		return Static29.method324(local23, local76, arg2, local69);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IC)Z")
	public static boolean method8061(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static178.method2714(arg0)) {
			return true;
		} else {
			@Pc(20) char[] local20 = Static533.aCharArray5;
			for (@Pc(22) int local22 = 0; local22 < local20.length; local22++) {
				@Pc(28) char local28 = local20[local22];
				if (local28 == arg0) {
					return true;
				}
			}
			@Pc(48) char[] local48 = Static345.aCharArray4;
			for (@Pc(50) int local50 = 0; local50 < local48.length; local50++) {
				@Pc(56) char local56 = local48[local50];
				if (local56 == arg0) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(III)Z")
	public static boolean method8062(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IZII)V")
	public static void method8067(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static115.aClass273_5.method6581((long) arg1) != null) {
			return;
		}
		if (Static213.aBoolean303) {
			@Pc(20) Class5_Sub21 local20 = new Class5_Sub21(arg1, new Class73_Sub1(4096, Static59.aClass207_17, arg1), arg2, arg0);
			local20.aClass73_Sub1_1.method5414(Static163.aStringArray79[Static266.anInt4796]);
			Static115.aClass273_5.method6585((long) arg1, local20);
		} else {
			Static109.method1691(arg1, arg0);
		}
	}
}
