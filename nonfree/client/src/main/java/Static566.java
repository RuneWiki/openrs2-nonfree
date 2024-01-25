import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static566 {

	@OriginalMember(owner = "client!ud", name = "O", descriptor = "Lclient!wea;")
	public static Class369 aClass369_6;

	@OriginalMember(owner = "client!ud", name = "I", descriptor = "[I")
	public static final int[] anIntArray540 = new int[2048];

	@OriginalMember(owner = "client!ud", name = "M", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_107 = new Class257(76, 6);

	@OriginalMember(owner = "client!ud", name = "N", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_108 = new Class257(71, -1);

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!ig;B)Lclient!aca;")
	public static Class6_Sub1 method7876(@OriginalArg(0) Class8_Sub8 arg0) {
		@Pc(17) Class6 local17 = Static121.method2709(arg0);
		@Pc(21) int local21 = arg0.method8540();
		@Pc(25) int local25 = arg0.method8540();
		return new Class6_Sub1(local17.aClass173_14, local17.aClass60_13, local17.anInt10332, local17.anInt10334, local17.anInt10335, local17.anInt10336, local17.anInt10339, local17.anInt10342, local17.anInt10337, local21, local25);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZZLjava/lang/String;I)Z")
	public static boolean method7877(@OriginalArg(2) String arg0) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		@Pc(38) int local38 = arg0.length();
		for (@Pc(40) int local40 = 0; local40 < local38; local40++) {
			@Pc(46) char local46 = arg0.charAt(local40);
			if (local40 == 0) {
				if (local46 == '-') {
					local26 = true;
					continue;
				}
				if (local46 == '+') {
					continue;
				}
			}
			@Pc(82) int local82;
			if (local46 >= '0' && local46 <= '9') {
				local82 = local46 - '0';
			} else if (local46 >= 'A' && local46 <= 'Z') {
				local82 = local46 - '7';
			} else if (local46 >= 'a' && local46 <= 'z') {
				local82 = local46 - 'W';
			} else {
				return false;
			}
			if (local82 >= 10) {
				return false;
			}
			if (local26) {
				local82 = -local82;
			}
			@Pc(114) int local114 = local82 + local30 * 10;
			if (local30 != local114 / 10) {
				return false;
			}
			local30 = local114;
			local28 = true;
		}
		return local28;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!rr;Z[[[BIB)Z")
	public static boolean method7879(@OriginalArg(0) Class15_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!Static545.aBoolean663) {
			return false;
		}
		@Pc(8) int local8 = arg0.anInt10301 >> Static172.anInt4156;
		@Pc(10) int local10 = local8;
		@Pc(15) int local15 = arg0.anInt10298 >> Static172.anInt4156;
		@Pc(17) int local17 = local15;
		if (arg0 instanceof Class15_Sub1_Sub2) {
			local10 = ((Class15_Sub1_Sub2) arg0).aShort104;
			local17 = ((Class15_Sub1_Sub2) arg0).aShort106;
			local8 = ((Class15_Sub1_Sub2) arg0).aShort105;
			local15 = ((Class15_Sub1_Sub2) arg0).aShort103;
		}
		for (@Pc(38) int local38 = local8; local38 <= local10; local38++) {
			for (@Pc(41) int local41 = local15; local41 <= local17; local41++) {
				if (arg0.aByte125 < Static192.anInt4507 && local38 >= Static444.anInt8261 && local38 < Static239.anInt5361 && local41 >= Static614.anInt6685 && local41 < Static345.anInt6694) {
					if ((arg2 == null || arg0.aByte124 < arg3 || arg2[arg0.aByte124][local38][local41] != arg4) && arg0.method8325() && !arg0.method8324()) {
						return false;
					}
					if (!arg1 && local38 >= Static603.anInt10257 - 16 && local38 <= Static603.anInt10257 + 16 && local41 >= Static470.anInt8495 - 16 && local41 <= Static470.anInt8495 + 16) {
						if (Static403.aBoolean556) {
							Static49.aClass243Array1[Static616.anInt10361++].method6459(arg0);
							Static616.anInt10361 %= Static587.anInt10308;
						} else {
							arg0.method8327(Static269.aClass16_11);
						}
					}
				}
			}
		}
		return true;
	}
}
