import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!al", name = "R", descriptor = "Lclient!kk;")
	public static Class108 aClass108_1;

	@OriginalMember(owner = "client!al", name = "S", descriptor = "[Lclient!uj;")
	public static Class4_Sub3_Sub14[] aClass4_Sub3_Sub14Array1;

	@OriginalMember(owner = "client!al", name = "W", descriptor = "[[I")
	public static int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!al", name = "K", descriptor = "[I")
	public static int[] anIntArray21 = new int[50];

	@OriginalMember(owner = "client!al", name = "P", descriptor = "Lclient!ll;")
	public static Class114 aClass114_1 = new Class114();

	@OriginalMember(owner = "client!al", name = "U", descriptor = "S")
	public static short aShort1 = 32767;

	@OriginalMember(owner = "client!al", name = "X", descriptor = "I")
	public static int anInt185 = 3;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IBI)V")
	public static void method173(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static46.anIntArray62[arg0] = arg1;
		@Pc(21) Class4_Sub5 local21 = (Class4_Sub5) Static289.aClass85_25.method1845((long) arg0);
		if (local21 == null) {
			local21 = new Class4_Sub5(4611686018427387905L);
			Static289.aClass85_25.method1841(local21, (long) arg0);
		} else if (local21.aLong17 != 4611686018427387905L) {
			local21.aLong17 = Static101.method1677() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IZZZ)V")
	public static void method174(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		@Pc(7) int local7;
		@Pc(20) Class53_Sub1_Sub2 local20;
		@Pc(122) int local122;
		@Pc(128) int local128;
		@Pc(146) int local146;
		@Pc(158) int local158;
		@Pc(163) int local163;
		@Pc(176) int local176;
		for (local7 = 0; local7 < Static236.anInt4452; local7++) {
			local20 = Static110.aClass53_Sub1_Sub2Array1[Static278.anIntArray595[local7]];
			if (local20 != null && local20.method3323() && local20.aClass171_1.method4292()) {
				@Pc(35) int local35 = local20.method3324();
				if (arg2) {
					if (!local20.aClass171_1.aBoolean360) {
						continue;
					}
				} else if (local20.aClass171_1.aBoolean356 != arg1 || arg0 != 0 && arg0 != local35) {
					continue;
				}
				@Pc(113) int local113;
				if (local35 == 1) {
					if ((local20.anInt3974 & 0x7F) == 64 && (local20.anInt4002 & 0x7F) == 64) {
						local122 = local20.anInt4002 >> 7;
						local113 = local20.anInt3974 >> 7;
						if (local113 >= 0 && local113 < 104 && local122 >= 0 && local122 < 104) {
							local176 = anIntArrayArray2[local113][local122]++;
						}
					}
				} else if (((local35 & 0x1) != 0 || (local20.anInt3974 & 0x7F) == 0 && (local20.anInt4002 & 0x7F) == 0) && ((local35 & 0x1) != 1 || (local20.anInt3974 & 0x7F) == 64 && (local20.anInt4002 & 0x7F) == 64)) {
					local113 = local20.anInt3974 - local35 * 64 >> 7;
					local122 = local20.anInt4002 - local35 * 64 >> 7;
					local128 = local20.method3324() + local113;
					if (local128 > 104) {
						local128 = 104;
					}
					if (local113 < 0) {
						local113 = 0;
					}
					local146 = local122 + local20.method3324();
					if (local146 > 104) {
						local146 = 104;
					}
					if (local122 < 0) {
						local122 = 0;
					}
					for (local158 = local113; local158 < local128; local158++) {
						for (local163 = local122; local163 < local146; local163++) {
							local176 = anIntArrayArray2[local158][local163]++;
						}
					}
				}
			}
		}
		label206: for (local7 = 0; local7 < Static236.anInt4452; local7++) {
			local20 = Static110.aClass53_Sub1_Sub2Array1[Static278.anIntArray595[local7]];
			@Pc(267) long local267 = (long) Static278.anIntArray595[local7] << 32 | 0x20000000L;
			if (local20 != null && local20.method3323() && local20.aClass171_1.method4292()) {
				local122 = local20.method3324();
				if (arg2) {
					if (!local20.aClass171_1.aBoolean360) {
						continue;
					}
				} else if (arg1 != local20.aClass171_1.aBoolean356 || arg0 != 0 && arg0 != local122) {
					continue;
				}
				local20.aBoolean282 = true;
				if (local122 == 1) {
					if ((local20.anInt3974 & 0x7F) == 64 && (local20.anInt4002 & 0x7F) == 64) {
						local128 = local20.anInt3974 >> 7;
						local146 = local20.anInt4002 >> 7;
						if (local128 < 0 || local128 >= 104 || local146 < 0 || local146 >= 104) {
							continue;
						}
						if (anIntArrayArray2[local128][local146] > 1) {
							local176 = anIntArrayArray2[local128][local146]--;
							continue;
						}
					}
				} else if ((local122 & 0x1) == 0 && (local20.anInt3974 & 0x7F) == 0 && (local20.anInt4002 & 0x7F) == 0 || (local122 & 0x1) == 1 && (local20.anInt3974 & 0x7F) == 64 && (local20.anInt4002 & 0x7F) == 64) {
					local128 = local20.anInt3974 - local122 * 64 >> 7;
					local146 = local20.anInt4002 - local122 * 64 >> 7;
					local158 = local122 + local128;
					local163 = local122 + local146;
					if (local163 > 104) {
						local163 = 104;
					}
					if (local128 < 0) {
						local128 = 0;
					}
					if (local146 < 0) {
						local146 = 0;
					}
					@Pc(462) boolean local462 = true;
					if (local158 > 104) {
						local158 = 104;
					}
					@Pc(469) int local469;
					@Pc(474) int local474;
					for (local469 = local128; local469 < local158; local469++) {
						for (local474 = local146; local474 < local163; local474++) {
							if (anIntArrayArray2[local469][local474] <= 1) {
								local462 = false;
								break;
							}
						}
					}
					if (local462) {
						local469 = local128;
						while (true) {
							if (local469 >= local158) {
								continue label206;
							}
							for (local474 = local146; local474 < local163; local474++) {
								local176 = anIntArrayArray2[local469][local474]--;
							}
							local469++;
						}
					}
				}
				if (!local20.aClass171_1.aBoolean358) {
					local267 |= Long.MIN_VALUE;
				}
				local20.aBoolean282 = false;
				local20.anInt4006 = Static33.method522(local20.anInt4002, local20.anInt3974, Static281.anInt5335);
				Static40.method637(Static281.anInt5335, local20.anInt3974, local20.anInt4002, local20.anInt4006, local122 * 64 + 60 - 64, local20, local20.anInt4031, local267, local20.aBoolean284);
			}
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IZIB)V")
	public static void method175(@OriginalArg(1) boolean arg0) {
		Static164.anInt3257 = 2;
		Static138.aBoolean183 = arg0;
		Static288.anInt5395 = 22050;
	}
}
