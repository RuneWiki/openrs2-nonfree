import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!fo", name = "L", descriptor = "Lclient!hl;")
	public static Class156 aClass156_54 = new Class156(72, 7);

	@OriginalMember(owner = "client!fo", name = "H", descriptor = "I")
	public static int anInt3205 = 0;

	@OriginalMember(owner = "client!fo", name = "M", descriptor = "Lclient!mp;")
	public static final Class242 aClass242_4 = new Class242("WTQA", "office", "_qa", 2);

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "(II)Z")
	public static boolean method2974(@OriginalArg(0) int arg0) {
		return arg0 == 22 || arg0 == 9 || arg0 == 1007 || arg0 == 53 || arg0 == 48;
	}

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "(II)S")
	public static short method2975(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(39) int local39 = local19 > 64 ? (127 - local19) * local15 >> 7 : local15 * local19 >> 7;
		@Pc(43) int local43 = local39 + local19;
		@Pc(60) int local60;
		if (local43 == 0) {
			local60 = local39 << 1;
		} else {
			local60 = (local39 << 8) / local43;
		}
		return (short) (local9 << 10 | local60 >> 4 << 7 | local43);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIII)V")
	public static void method2976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class5_Sub20 local6 = (Class5_Sub20) Static435.aClass20_38.method378(); local6 != null; local6 = (Class5_Sub20) Static435.aClass20_38.method366()) {
			Static468.method6606(arg3, arg2, arg0, local6, arg1);
		}
		if (3 != 3) {
			method2977(111, -43, 20, (int[]) null, -102);
		}
		@Pc(222) boolean local222;
		for (@Pc(48) Class5_Sub20 local48 = (Class5_Sub20) Static84.aClass20_5.method378(); local48 != null; local48 = (Class5_Sub20) Static84.aClass20_5.method366()) {
			@Pc(52) byte local52 = 1;
			@Pc(57) Class92 local57 = local48.aClass4_Sub1_Sub1_Sub2_Sub2_2.method5930();
			if (local48.aClass4_Sub1_Sub1_Sub2_Sub2_2.anInt6837 == -1 || local48.aClass4_Sub1_Sub1_Sub2_Sub2_2.aBoolean456) {
				local52 = 0;
			} else if (local48.aClass4_Sub1_Sub1_Sub2_Sub2_2.anInt6837 == local57.anInt1905 || local57.anInt1896 == local48.aClass4_Sub1_Sub1_Sub2_Sub2_2.anInt6837 || local57.anInt1923 == local48.aClass4_Sub1_Sub1_Sub2_Sub2_2.anInt6837 || local57.anInt1915 == local48.aClass4_Sub1_Sub1_Sub2_Sub2_2.anInt6837) {
				local52 = 2;
			} else if (local48.aClass4_Sub1_Sub1_Sub2_Sub2_2.anInt6837 == local57.anInt1931 || local48.aClass4_Sub1_Sub1_Sub2_Sub2_2.anInt6837 == local57.anInt1897 || local57.anInt1935 == local48.aClass4_Sub1_Sub1_Sub2_Sub2_2.anInt6837 || local57.anInt1911 == local48.aClass4_Sub1_Sub1_Sub2_Sub2_2.anInt6837) {
				local52 = 3;
			}
			if (local52 != local48.anInt2969) {
				@Pc(175) int local175 = Static649.method8960(local48.aClass4_Sub1_Sub1_Sub2_Sub2_2);
				@Pc(179) Class105 local179 = local48.aClass4_Sub1_Sub1_Sub2_Sub2_2.aClass105_1;
				if (local179.anIntArray134 != null) {
					local179 = local179.method2622(Static23.aClass247_1);
				}
				if (local179 == null || local175 == -1) {
					local48.anInt2979 = -1;
					local48.anInt2969 = local52;
					local48.aBoolean222 = false;
				} else if (local48.anInt2979 == local175 && local179.aBoolean210 == local48.aBoolean222) {
					local48.anInt2969 = local52;
					local48.anInt2974 = local179.anInt2800;
				} else {
					local222 = false;
					if (local48.aClass5_Sub4_Sub4_1 == null) {
						local222 = true;
					} else {
						local48.anInt2974 -= 512;
						if (local48.anInt2974 <= 0) {
							Static265.aClass5_Sub4_Sub1_2.method332(local48.aClass5_Sub4_Sub4_1);
							local222 = true;
							local48.aClass5_Sub4_Sub4_1 = null;
						}
					}
					if (local222) {
						local48.anInt2969 = local52;
						local48.aClass5_Sub27_Sub1_2 = null;
						local48.aBoolean222 = local179.aBoolean210;
						local48.anInt2979 = local175;
						local48.aClass5_Sub22_1 = null;
						local48.anInt2974 = local179.anInt2800;
					}
				}
			}
			local48.anInt2972 = local48.aClass4_Sub1_Sub1_Sub2_Sub2_2.anInt9805;
			local48.anInt2982 = local48.aClass4_Sub1_Sub1_Sub2_Sub2_2.anInt9805 + (local48.aClass4_Sub1_Sub1_Sub2_Sub2_2.method5932() << 8);
			local48.anInt2983 = local48.aClass4_Sub1_Sub1_Sub2_Sub2_2.anInt9803;
			local48.anInt2968 = local48.aClass4_Sub1_Sub1_Sub2_Sub2_2.anInt9803 + (local48.aClass4_Sub1_Sub1_Sub2_Sub2_2.method5932() << 8);
			Static468.method6606(arg3, arg2, arg0, local48, arg1);
		}
		for (@Pc(341) Class5_Sub20 local341 = (Class5_Sub20) Static342.aClass306_24.method6941(); local341 != null; local341 = (Class5_Sub20) Static342.aClass306_24.method6940()) {
			@Pc(345) byte local345 = 1;
			@Pc(352) Class92 local352 = local341.aClass4_Sub1_Sub1_Sub2_Sub1_1.method5930();
			if (local341.aClass4_Sub1_Sub1_Sub2_Sub1_1.anInt6837 == -1 || local341.aClass4_Sub1_Sub1_Sub2_Sub1_1.aBoolean456) {
				local345 = 0;
			} else if (local341.aClass4_Sub1_Sub1_Sub2_Sub1_1.anInt6837 == local352.anInt1905 || local341.aClass4_Sub1_Sub1_Sub2_Sub1_1.anInt6837 == local352.anInt1896 || local352.anInt1923 == local341.aClass4_Sub1_Sub1_Sub2_Sub1_1.anInt6837 || local341.aClass4_Sub1_Sub1_Sub2_Sub1_1.anInt6837 == local352.anInt1915) {
				local345 = 2;
			} else if (local341.aClass4_Sub1_Sub1_Sub2_Sub1_1.anInt6837 == local352.anInt1931 || local352.anInt1897 == local341.aClass4_Sub1_Sub1_Sub2_Sub1_1.anInt6837 || local341.aClass4_Sub1_Sub1_Sub2_Sub1_1.anInt6837 == local352.anInt1935 || local341.aClass4_Sub1_Sub1_Sub2_Sub1_1.anInt6837 == local352.anInt1911) {
				local345 = 3;
			}
			if (local341.anInt2969 != local345) {
				@Pc(460) int local460 = Static75.method1251(local341.aClass4_Sub1_Sub1_Sub2_Sub1_1);
				if (local460 == local341.anInt2979 && local341.aClass4_Sub1_Sub1_Sub2_Sub1_1.aBoolean305 == local341.aBoolean222) {
					local341.anInt2969 = local345;
					local341.anInt2974 = local341.aClass4_Sub1_Sub1_Sub2_Sub1_1.anInt4554;
				} else {
					local222 = false;
					if (local341.aClass5_Sub4_Sub4_1 == null) {
						local222 = true;
					} else {
						local341.anInt2974 -= 512;
						if (local341.anInt2974 <= 0) {
							Static265.aClass5_Sub4_Sub1_2.method332(local341.aClass5_Sub4_Sub4_1);
							local341.aClass5_Sub4_Sub4_1 = null;
							local222 = true;
						}
					}
					if (local222) {
						local341.anInt2979 = local460;
						local341.anInt2974 = local341.aClass4_Sub1_Sub1_Sub2_Sub1_1.anInt4554;
						local341.aClass5_Sub27_Sub1_2 = null;
						local341.aClass5_Sub22_1 = null;
						local341.aBoolean222 = local341.aClass4_Sub1_Sub1_Sub2_Sub1_1.aBoolean305;
						local341.anInt2969 = local345;
					}
				}
			}
			local341.anInt2972 = local341.aClass4_Sub1_Sub1_Sub2_Sub1_1.anInt9805;
			local341.anInt2982 = local341.aClass4_Sub1_Sub1_Sub2_Sub1_1.anInt9805 + (local341.aClass4_Sub1_Sub1_Sub2_Sub1_1.method5932() << 8);
			local341.anInt2983 = local341.aClass4_Sub1_Sub1_Sub2_Sub1_1.anInt9803;
			local341.anInt2968 = local341.aClass4_Sub1_Sub1_Sub2_Sub1_1.anInt9803 + (local341.aClass4_Sub1_Sub1_Sub2_Sub1_1.method5932() << 8);
			Static468.method6606(arg3, arg2, arg0, local341, arg1);
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(III[II)V")
	public static void method2977(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4) {
		arg0--;
		if (arg4 > -105) {
			aClass156_54 = null;
		}
		@Pc(15) int local15 = arg2 - 1;
		@Pc(18) int local18 = local15 - 7;
		while (arg0 < local18) {
			@Pc(22) int local22 = arg0 + 1;
			arg3[local22] = arg1;
			@Pc(27) int local27 = local22 + 1;
			arg3[local27] = arg1;
			@Pc(32) int local32 = local27 + 1;
			arg3[local32] = arg1;
			@Pc(37) int local37 = local32 + 1;
			arg3[local37] = arg1;
			@Pc(42) int local42 = local37 + 1;
			arg3[local42] = arg1;
			@Pc(47) int local47 = local42 + 1;
			arg3[local47] = arg1;
			@Pc(52) int local52 = local47 + 1;
			arg3[local52] = arg1;
			arg0 = local52 + 1;
			arg3[arg0] = arg1;
		}
		while (arg0 < local15) {
			arg0++;
			arg3[arg0] = arg1;
		}
	}
}
