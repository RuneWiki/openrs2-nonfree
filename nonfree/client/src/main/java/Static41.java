import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!dj", name = "x", descriptor = "Lclient!eb;")
	public static Class23 aClass23_1;

	@OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
	public static int anInt1097 = 0;

	@OriginalMember(owner = "client!dj", name = "o", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_680 = Static118.method2249("welle2:");

	@OriginalMember(owner = "client!dj", name = "p", descriptor = "Z")
	public static boolean aBoolean46 = true;

	@OriginalMember(owner = "client!dj", name = "u", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_681 = Static118.method2249("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!dj", name = "w", descriptor = "I")
	public static int anInt1102 = 20;

	@OriginalMember(owner = "client!dj", name = "y", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_682 = Static118.method2249("; Expires=");

	@OriginalMember(owner = "client!dj", name = "z", descriptor = "I")
	public static int anInt1103 = 0;

	@OriginalMember(owner = "client!dj", name = "B", descriptor = "I")
	public static int anInt1105 = 0;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(B[B)V")
	public static void method713(@OriginalArg(1) byte[] arg0) {
		@Pc(7) int local7 = 0;
		while (true) {
			while (local7 < arg0.length) {
				@Pc(27) int local27 = arg0[local7++] * 64 - Static57.anInt1532;
				@Pc(37) int local37 = arg0[local7++] * 64 - Static33.anInt974;
				@Pc(59) int local59;
				@Pc(63) int local63;
				if (local27 > 0 && local37 > 0 && local27 + 64 < Static190.anInt4160 && Static25.anInt737 > local37 + 64) {
					local59 = local27 >> 6;
					local63 = Static25.anInt737 - local37 - 1 >> 6;
					for (@Pc(123) int local123 = 0; local123 < 64; local123++) {
						for (@Pc(127) int local127 = -64; local127 < 0; local127++) {
							@Pc(134) byte local134 = arg0[local7++];
							if (local134 != 0) {
								@Pc(146) byte local146;
								if ((local134 & 0x1) == 1) {
									local146 = arg0[local7++];
									if (Static145.aByteArrayArrayArray90[local59][local63] == null) {
										Static145.aByteArrayArrayArray90[local59][local63] = new byte[4096];
									}
									Static145.aByteArrayArrayArray90[local59][local63][local123 + (-(local127 + 1) << 6)] = (byte) local146;
								}
								if ((local134 & 0x2) == 2) {
									local146 = arg0[local7++];
									if (Static90.aByteArrayArrayArray117[local59][local63] == null) {
										Static90.aByteArrayArrayArray117[local59][local63] = new byte[4096];
									}
									Static90.aByteArrayArrayArray117[local59][local63][local123 + (-(local127 + 1) << 6)] = (byte) (local146 - 28);
								}
								if ((local134 & 0x4) == 4) {
									local7 += 3;
									@Pc(251) int local251 = (arg0[local7 - 1] & 0xFF) + ((arg0[local7 - 2] & 0xFF) << 8) + ((arg0[local7 + -3] & 0xFF) << 16);
									if (Static154.anIntArrayArrayArray6[local59][local63] == null) {
										Static154.anIntArrayArrayArray6[local59][local63] = new int[4096];
									}
									local251--;
									@Pc(269) Class1_Sub2_Sub13 local269 = Static5.method65(local251);
									if (local269.anIntArray227 != null) {
										local269 = local269.method1430();
										if (local269 == null || local269.anInt1997 == -1) {
											continue;
										}
									}
									Static154.anIntArrayArrayArray6[local59][local63][(-(local127 + 1) << 6) + local123] = local269.anInt1998 + 1;
									@Pc(306) Class1_Sub16 local306 = new Class1_Sub16();
									local306.anInt2532 = local269.anInt1997;
									local306.anInt2528 = Static25.anInt737 - local37;
									local306.anInt2531 = local27;
									Static31.aClass91_1.method3151(local306);
								}
							}
						}
					}
				} else {
					for (local59 = 0; local59 < 64; local59++) {
						for (local63 = -64; local63 < 0; local63++) {
							@Pc(70) byte local70 = arg0[local7++];
							if (local70 != 0) {
								if ((local70 & 0x1) == 1) {
									local7++;
								}
								if ((local70 & 0x2) == 2) {
									local7++;
								}
								if ((local70 & 0x4) == 4) {
									local7 += 3;
								}
							}
						}
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!w;Z)V")
	public static void method714(@OriginalArg(0) Class6_Sub4 arg0) {
		if (arg0.anInt3939 == 0) {
			return;
		}
		@Pc(33) int local33;
		@Pc(40) int local40;
		if (arg0.anInt3928 != -1 && arg0.anInt3928 < 32768) {
			@Pc(24) Class6_Sub4_Sub2 local24 = Static106.aClass6_Sub4_Sub2Array1[arg0.anInt3928];
			if (local24 != null) {
				local33 = arg0.anInt3934 - local24.anInt3934;
				local40 = arg0.anInt3976 - local24.anInt3976;
				if (local33 != 0 || local40 != 0) {
					arg0.anInt3965 = (int) (Math.atan2((double) local33, (double) local40) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(71) int local71;
		if (arg0.anInt3928 >= 32768) {
			local71 = arg0.anInt3928 - 32768;
			if (local71 == Static142.anInt3429) {
				local71 = 2047;
			}
			@Pc(84) Class6_Sub4_Sub1 local84 = Static158.aClass6_Sub4_Sub1Array1[local71];
			if (local84 != null) {
				@Pc(93) int local93 = arg0.anInt3976 - local84.anInt3976;
				local40 = arg0.anInt3934 - local84.anInt3934;
				if (local40 != 0 || local93 != 0) {
					arg0.anInt3965 = (int) (Math.atan2((double) local40, (double) local93) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt3966 != 0 || arg0.anInt3944 != 0) && (arg0.anInt3951 == 0 || arg0.anInt3955 > 0)) {
			local71 = arg0.anInt3934 - (arg0.anInt3966 - Static205.anInt4337 - Static205.anInt4337) * 64;
			local33 = arg0.anInt3976 - (arg0.anInt3944 - Static58.anInt1543 - Static58.anInt1543) * 64;
			if (local71 != 0 || local33 != 0) {
				arg0.anInt3965 = (int) (Math.atan2((double) local71, (double) local33) * 325.949D) & 0x7FF;
			}
			arg0.anInt3944 = 0;
			arg0.anInt3966 = 0;
		}
		local71 = arg0.anInt3965 - arg0.anInt3971 & 0x7FF;
		if (local71 == 0) {
			arg0.anInt3967 = 0;
			return;
		}
		arg0.anInt3967++;
		@Pc(231) boolean local231;
		if (local71 > 1024) {
			arg0.anInt3971 -= arg0.anInt3939;
			local231 = true;
			if (local71 < arg0.anInt3939 || 2048 - arg0.anInt3939 < local71) {
				arg0.anInt3971 = arg0.anInt3965;
				local231 = false;
			}
			if (arg0.anInt3954 == arg0.anInt3946 && (arg0.anInt3967 > 25 || local231)) {
				if (arg0.anInt3981 == -1) {
					arg0.anInt3946 = arg0.anInt3972;
				} else {
					arg0.anInt3946 = arg0.anInt3981;
				}
			}
		} else {
			arg0.anInt3971 += arg0.anInt3939;
			local231 = true;
			if (local71 < arg0.anInt3939 || local71 > 2048 - arg0.anInt3939) {
				local231 = false;
				arg0.anInt3971 = arg0.anInt3965;
			}
			if (arg0.anInt3946 == arg0.anInt3954 && (arg0.anInt3967 > 25 || local231)) {
				if (arg0.anInt3930 == -1) {
					arg0.anInt3946 = arg0.anInt3972;
				} else {
					arg0.anInt3946 = arg0.anInt3930;
				}
			}
		}
		arg0.anInt3971 &= 0x7FF;
	}
}
