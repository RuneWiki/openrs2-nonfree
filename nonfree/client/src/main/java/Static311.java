import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!kia", name = "e", descriptor = "Lclient!jq;")
	public static Class175 aClass175_1;

	@OriginalMember(owner = "client!kia", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray35 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!kia", name = "i", descriptor = "[I")
	public static final int[] anIntArray306 = new int[5];

	@OriginalMember(owner = "client!kia", name = "b", descriptor = "I")
	public static int anInt5510 = 0;

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(Lclient!df;Z[[[BIB)Z")
	public static boolean method4726(@OriginalArg(0) Class8_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!Static523.aBoolean667) {
			return false;
		}
		@Pc(9) int local9 = arg0.anInt10355 >> Static611.anInt10115;
		@Pc(11) int local11 = local9;
		@Pc(16) int local16 = arg0.anInt10363 >> Static611.anInt10115;
		@Pc(18) int local18 = local16;
		if (arg0 instanceof Class8_Sub1_Sub3) {
			local11 = ((Class8_Sub1_Sub3) arg0).aShort110;
			local18 = ((Class8_Sub1_Sub3) arg0).aShort107;
			local9 = ((Class8_Sub1_Sub3) arg0).aShort109;
			local16 = ((Class8_Sub1_Sub3) arg0).aShort108;
		}
		for (@Pc(39) int local39 = local9; local39 <= local11; local39++) {
			for (@Pc(42) int local42 = local16; local42 <= local18; local42++) {
				if (arg0.aByte146 < Static490.anInt9715 && local39 >= Static551.anInt9313 && local39 < Static236.anInt3937 && local42 >= Static609.anInt10106 && local42 < Static608.anInt10101) {
					if ((arg2 == null || arg0.aByte145 < arg3 || arg2[arg0.aByte145][local39][local42] != arg4) && arg0.method8905() && !arg0.method8896(-10204, Static205.aClass57_5)) {
						return false;
					}
					if (!arg1 && local39 >= Static128.anInt7021 - 16 && local39 <= Static128.anInt7021 + 16 && local42 >= Static97.anInt1574 - 16 && local42 <= Static97.anInt1574 + 16) {
						if (Static218.aBoolean283) {
							Static333.aClass95Array1[Static613.anInt10137++].method1685(arg0);
							Static613.anInt10137 %= Static193.anInt8198;
						} else {
							arg0.method8907(0, Static205.aClass57_5);
						}
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(III[BIII)Z")
	public static boolean method4727(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg0 % 8;
		@Pc(27) int local27;
		if (local9 == 0) {
			local27 = 0;
		} else {
			local27 = 8 - local9;
		}
		@Pc(41) int local41 = -((arg3 + 8 - 1) / 8);
		@Pc(50) int local50 = -((arg0 + 7) / 8);
		for (@Pc(52) int local52 = local41; local52 < 0; local52++) {
			for (@Pc(58) int local58 = local50; local58 < 0; local58++) {
				if (arg2[arg4] == 0) {
					return true;
				}
				arg4 += 8;
			}
			arg4 -= local27;
			if (arg2[arg4 - 1] == 0) {
				return true;
			}
			arg4 += arg1;
		}
		return false;
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(BILjava/lang/String;Z)Z")
	public static boolean method4728(@OriginalArg(2) String arg0) {
		if (10 > 36) {
			throw new IllegalArgumentException("Invalid radix:" + 10);
		}
		@Pc(39) boolean local39 = false;
		@Pc(41) boolean local41 = false;
		@Pc(43) int local43 = 0;
		@Pc(46) int local46 = arg0.length();
		for (@Pc(48) int local48 = 0; local48 < local46; local48++) {
			@Pc(56) char local56 = arg0.charAt(local48);
			if (local48 == 0) {
				if (local56 == '-') {
					local39 = true;
					continue;
				}
				if (local56 == '+' && true) {
					continue;
				}
			}
			@Pc(107) int local107;
			if (local56 >= '0' && local56 <= '9') {
				local107 = local56 - '0';
			} else if (local56 >= 'A' && local56 <= 'Z') {
				local107 = local56 - '7';
			} else if (local56 >= 'a' && local56 <= 'z') {
				local107 = local56 - 'W';
			} else {
				return false;
			}
			if (local107 >= 10) {
				return false;
			}
			if (local39) {
				local107 = -local107;
			}
			@Pc(153) int local153 = local43 * 10 + local107;
			if (local153 / 10 != local43) {
				return false;
			}
			local41 = true;
			local43 = local153;
		}
		return local41;
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(Lclient!ib;Lclient!ko;I)Lclient!rja;")
	public static Class306 method4729(@OriginalArg(0) Class5_Sub23 arg0, @OriginalArg(1) Class204 arg1) {
		@Pc(10) Class306 local10 = new Class306(arg1);
		@Pc(14) int local14 = arg0.method8529();
		@Pc(23) boolean local23 = (local14 & 0x1) != 0;
		@Pc(32) boolean local32 = (local14 & 0x2) != 0;
		@Pc(41) boolean local41 = (local14 & 0x4) != 0;
		if (local23) {
			local10.anIntArray500[0] = arg0.method8519();
			local10.anIntArray502[0] = arg0.method8519();
			if (arg1.anInt5729 != -1 || arg1.anInt5721 != -1) {
				local10.anIntArray500[1] = arg0.method8519();
				local10.anIntArray502[1] = arg0.method8519();
			}
			if (arg1.anInt5663 != -1 || arg1.anInt5722 != -1) {
				local10.anIntArray500[2] = arg0.method8519();
				local10.anIntArray502[2] = arg0.method8519();
			}
		}
		@Pc(125) boolean local125 = (local14 & 0x8) != 0;
		if (local32) {
			local10.anIntArray499[0] = arg0.method8519();
			local10.anIntArray501[0] = arg0.method8519();
			if (arg1.anInt5705 != -1 || arg1.anInt5666 != -1) {
				local10.anIntArray499[1] = arg0.method8519();
				local10.anIntArray501[1] = arg0.method8519();
			}
		}
		@Pc(184) int local184;
		@Pc(187) int[] local187;
		@Pc(219) int local219;
		if (local41) {
			local184 = arg0.method8519();
			local187 = new int[] { local184 & 0xF, local184 >> 4 & 0xF, local184 >> 8 & 0xF, local184 >> 12 & 0xF };
			for (local219 = 0; local219 < 4; local219++) {
				if (local187[local219] != 15) {
					local10.aShortArray113[local187[local219]] = (short) arg0.method8519();
				}
			}
		}
		if (local125) {
			local184 = arg0.method8529();
			local187 = new int[] { local184 & 0xF, local184 >> 4 & 0xF };
			for (local219 = 0; local219 < 2; local219++) {
				if (local187[local219] != 15) {
					local10.aShortArray112[local187[local219]] = (short) arg0.method8519();
				}
			}
		}
		return local10;
	}
}
