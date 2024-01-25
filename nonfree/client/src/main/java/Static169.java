import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!fs", name = "i", descriptor = "I")
	public static int anInt3333 = -1;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method2761(@OriginalArg(0) String arg0) {
		@Pc(6) Class14_Sub19 local6 = Static621.method8714();
		local6.aClass14_Sub29_Sub1_1.method5854(Static453.aClass174_11.anInt4603);
		local6.aClass14_Sub29_Sub1_1.method5859(0);
		@Pc(21) int local21 = local6.aClass14_Sub29_Sub1_1.anInt7264;
		local6.aClass14_Sub29_Sub1_1.method5859(650);
		@Pc(30) int[] local30 = Static302.method8417(local6);
		@Pc(34) int local34 = local6.aClass14_Sub29_Sub1_1.anInt7264;
		local6.aClass14_Sub29_Sub1_1.method5855(arg0);
		local6.aClass14_Sub29_Sub1_1.method5854(Static232.anInt4258);
		local6.aClass14_Sub29_Sub1_1.anInt7264 += 7;
		local6.aClass14_Sub29_Sub1_1.method5865(local30, local34, local6.aClass14_Sub29_Sub1_1.anInt7264);
		local6.aClass14_Sub29_Sub1_1.method5839(local6.aClass14_Sub29_Sub1_1.anInt7264 - local21);
		Static576.method8234(local6);
		Static408.anInt7106 = -3;
		Static101.anInt2152 = 1;
		Static132.anInt2538 = 0;
		Static622.anInt10474 = 0;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)V")
	public static void method2762() {
		@Pc(7) Class285 local7 = null;
		try {
			@Pc(23) Class150 local23 = Static234.aClass333_5.method8140("");
			while (local23.anInt4247 == 0) {
				Static20.method9254(1L);
			}
			if (local23.anInt4247 == 1) {
				local7 = (Class285) local23.anObject8;
				@Pc(43) Class14_Sub29 local43 = Static56.aClass14_Sub22_5.method3007();
				local7.method7148(local43.anInt7264, 0, local43.aByteArray84);
			}
		} catch (@Pc(53) Exception local53) {
		}
		try {
			if (local7 != null) {
				local7.method7142();
			}
		} catch (@Pc(60) Exception local60) {
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method2764(@OriginalArg(1) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static204.aStringArray36.length; local7++) {
			if (Static204.aStringArray36[local7].equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(IIIII)Z")
	public static boolean method2765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if ((Static553.aByteArrayArrayArray18[0][arg0][arg2] & 0x2) != 0) {
			return true;
		} else if ((Static553.aByteArrayArrayArray18[arg1][arg0][arg2] & 0x10) == 0) {
			return arg3 == Static633.method8844(arg1, arg0, arg2);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(ZIB)V")
	public static void method2766(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg0) {
			@Pc(6) Class14_Sub19 local6 = Static286.method4081(Static205.aClass394_1, Static195.aClass100_54);
			local6.aClass14_Sub29_Sub1_1.method5859(arg1);
			Static576.method8234(local6);
		} else {
			Static632.method8833(Static494.aClass276_12, arg1, -1);
		}
	}
}
