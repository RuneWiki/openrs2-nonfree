import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "[Lclient!vu;")
	public static Class5_Sub1_Sub21[] aClass5_Sub1_Sub21Array2;

	@OriginalMember(owner = "client!lw", name = "g", descriptor = "I")
	public static int anInt5727;

	@OriginalMember(owner = "client!lw", name = "c", descriptor = "I")
	public static int anInt5728;

	@OriginalMember(owner = "client!lw", name = "e", descriptor = "I")
	public static int anInt5726 = 0;

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "([J[IB)V")
	public static void method5132(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1) {
		Static407.method5953(0, arg0, arg1, arg0.length - 1);
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!rda;Z[[[BIB)Z")
	public static boolean method5133(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!Static603.aBoolean683) {
			return false;
		}
		@Pc(9) int local9 = arg0.anInt9805 >> Static314.anInt5377;
		@Pc(11) int local11 = local9;
		@Pc(16) int local16 = arg0.anInt9803 >> Static314.anInt5377;
		@Pc(18) int local18 = local16;
		if (arg0 instanceof Class4_Sub1_Sub1) {
			local11 = ((Class4_Sub1_Sub1) arg0).aShort103;
			local18 = ((Class4_Sub1_Sub1) arg0).aShort102;
			local9 = ((Class4_Sub1_Sub1) arg0).aShort104;
			local16 = ((Class4_Sub1_Sub1) arg0).aShort105;
		}
		for (@Pc(39) int local39 = local9; local39 <= local11; local39++) {
			for (@Pc(42) int local42 = local16; local42 <= local18; local42++) {
				if (arg0.aByte138 < Static237.anInt4100 && local39 >= Static603.anInt9713 && local39 < Static19.anInt254 && local42 >= Static57.anInt1008 && local42 < Static65.anInt1080) {
					if ((arg2 == null || arg0.aByte139 < arg3 || arg2[arg0.aByte139][local39][local42] != arg4) && arg0.method8352(-56) && !arg0.method8343(Static44.aClass100_1)) {
						return false;
					}
					if (!arg1 && local39 >= Static220.anInt3838 - 16 && local39 <= Static220.anInt3838 + 16 && local42 >= Static377.anInt6335 - 16 && local42 <= Static377.anInt6335 + 16) {
						if (Static205.aBoolean259) {
							Static57.aClass287Array1[Static474.anInt7694++].method6429(arg0);
							Static474.anInt7694 %= Static165.anInt3244;
						} else {
							arg0.method8342(Static44.aClass100_1);
						}
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(I)I")
	public static int method5135() {
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		if (Static681.aClass349_6.aBoolean601 && !Static681.aClass349_6.aBoolean602) {
			local13 = true;
			if (Static506.aClass5_Sub32_2.anInt5619 < 512 && Static506.aClass5_Sub32_2.anInt5619 != 0) {
				local13 = false;
			}
			if (Static576.aString103.startsWith("win")) {
				local15 = true;
				local17 = true;
			} else {
				local15 = true;
			}
		}
		if (Static316.aBoolean351) {
			local15 = false;
		}
		if (Static680.aBoolean767) {
			local17 = false;
		}
		if (Static484.aBoolean528) {
			local13 = false;
		}
		if (!local13 && !local15 && !local17) {
			return Static36.method621();
		}
		@Pc(82) int local82 = -1;
		@Pc(84) int local84 = -1;
		@Pc(86) int local86 = -1;
		if (local13) {
			try {
				local82 = Static621.method3253(1000, 2);
			} catch (@Pc(95) Exception local95) {
			}
		}
		if (local17) {
			try {
				local86 = Static621.method3253(1000, 3);
				if (Static577.aClass5_Sub19_25.aClass17_Sub24_2.method8102() == 3) {
					@Pc(114) Class385 local114 = Static273.aClass100_6.method8602();
					@Pc(119) long local119 = local114.aLong301 & 0xFFFFFFFFFFFFL;
					@Pc(122) int local122 = local114.anInt10668;
					if (local122 == 4318) {
						local15 &= local119 >= 64425238954L;
					} else if (local122 == 4098) {
						local15 &= local119 >= 60129613779L;
					}
				}
			} catch (@Pc(170) Exception local170) {
			}
		}
		if (local15) {
			try {
				local84 = Static621.method3253(1000, 1);
			} catch (@Pc(180) Exception local180) {
			}
		}
		if (local82 == -1 && local84 == -1 && local86 == -1) {
			return Static36.method621();
		}
		local86 = (int) ((float) local86 * 1.1F);
		local84 = (int) ((float) local84 * 1.1F);
		if (local82 > local86 && local84 < local82) {
			return Static318.method4871(local82, (byte) 25);
		} else if (local86 <= local84) {
			return Static417.method6132(local84, 1);
		} else {
			return Static417.method6132(local86, 3);
		}
	}
}
