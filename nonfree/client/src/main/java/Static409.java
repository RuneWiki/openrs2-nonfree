import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!o", name = "e", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray6;

	@OriginalMember(owner = "client!o", name = "g", descriptor = "Lclient!hk;")
	public static Class5_Sub14_Sub4 aClass5_Sub14_Sub4_22;

	@OriginalMember(owner = "client!o", name = "k", descriptor = "Lclient!ls;")
	public static Class13 aClass13_1;

	@OriginalMember(owner = "client!o", name = "f", descriptor = "Lclient!si;")
	public static final Class323 aClass323_3 = new Class323();

	@OriginalMember(owner = "client!o", name = "h", descriptor = "I")
	public static final int anInt7021 = 0;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V")
	public static void method5975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class313 local7 = Static129.aClass313ArrayArrayArray7[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class313 local28 = Static129.aClass313ArrayArrayArray7[local9][arg0][arg1] = Static129.aClass313ArrayArrayArray7[local9 + 1][arg0][arg1];
			if (local28 != null) {
				for (@Pc(33) Class40 local33 = local28.aClass40_3; local33 != null; local33 = local33.aClass40_1) {
					@Pc(37) Class41_Sub1_Sub1 local37 = local33.aClass41_Sub1_Sub1_1;
					if (local37.aShort109 == arg0 && local37.aShort108 == arg1) {
						local37.aByte149--;
					}
				}
				if (local28.aClass41_Sub1_Sub4_1 != null) {
					local28.aClass41_Sub1_Sub4_1.aByte149--;
				}
				if (local28.aClass41_Sub1_Sub3_2 != null) {
					local28.aClass41_Sub1_Sub3_2.aByte149--;
				}
				if (local28.aClass41_Sub1_Sub3_1 != null) {
					local28.aClass41_Sub1_Sub3_1.aByte149--;
				}
				if (local28.aClass41_Sub1_Sub5_1 != null) {
					local28.aClass41_Sub1_Sub5_1.aByte149--;
				}
				if (local28.aClass41_Sub1_Sub5_2 != null) {
					local28.aClass41_Sub1_Sub5_2.aByte149--;
				}
			}
		}
		if (Static129.aClass313ArrayArrayArray7[0][arg0][arg1] == null) {
			Static129.aClass313ArrayArrayArray7[0][arg0][arg1] = new Class313(0);
			Static129.aClass313ArrayArrayArray7[0][arg0][arg1].aByte112 = 1;
		}
		Static129.aClass313ArrayArrayArray7[0][arg0][arg1].aClass313_1 = local7;
		Static129.aClass313ArrayArrayArray7[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIII)V")
	public static void method5976(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = arg4;
		@Pc(11) int local11 = arg2 * arg2;
		@Pc(15) int local15 = arg4 * arg4;
		@Pc(19) int local19 = local15 << 1;
		@Pc(23) int local23 = local11 << 1;
		@Pc(27) int local27 = arg4 << 1;
		@Pc(36) int local36 = (1 - local27) * local11 + local19;
		@Pc(45) int local45 = local15 - (local27 - 1) * local23;
		@Pc(49) int local49 = local11 << 2;
		@Pc(59) int local59 = local15 << 2;
		@Pc(67) int local67 = local19 * 3;
		@Pc(75) int local75 = local23 * ((arg4 << 1) - 3);
		@Pc(81) int local81 = local59;
		@Pc(103) int local103;
		@Pc(111) int local111;
		if (Static128.anInt2200 <= arg0 && Static380.anInt6585 >= arg0) {
			local103 = Static439.method6578(arg2 + arg3, Static361.anInt6317, Static651.anInt10267);
			local111 = Static439.method6578(arg3 - arg2, Static361.anInt6317, Static651.anInt10267);
			Static343.method5202(local111, Static286.anIntArrayArray42[arg0], arg1, local103);
		}
		@Pc(125) int local125 = local49 * (arg4 - 1);
		while (local7 > 0) {
			if (local36 < 0) {
				while (local36 < 0) {
					local45 += local81;
					local36 += local67;
					local81 += local59;
					local67 += local59;
					local5++;
				}
			}
			if (local45 < 0) {
				local36 += local67;
				local45 += local81;
				local81 += local59;
				local5++;
				local67 += local59;
			}
			local36 += -local125;
			local45 += -local75;
			local75 -= local49;
			local125 -= local49;
			local7--;
			local103 = arg0 - local7;
			local111 = local7 + arg0;
			if (Static128.anInt2200 <= local111 && local103 <= Static380.anInt6585) {
				@Pc(209) int local209 = Static439.method6578(arg3 + local5, Static361.anInt6317, Static651.anInt10267);
				@Pc(218) int local218 = Static439.method6578(arg3 - local5, Static361.anInt6317, Static651.anInt10267);
				if (Static128.anInt2200 <= local103) {
					Static343.method5202(local218, Static286.anIntArrayArray42[local103], arg1, local209);
				}
				if (local111 <= Static380.anInt6585) {
					Static343.method5202(local218, Static286.anIntArrayArray42[local111], arg1, local209);
				}
			}
		}
	}
}
