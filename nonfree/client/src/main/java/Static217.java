import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!hm", name = "v", descriptor = "[I")
	public static final int[] anIntArray239 = new int[] { 3500, 200 };

	@OriginalMember(owner = "client!hm", name = "E", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_131 = new Class288(35, 8);

	@OriginalMember(owner = "client!hm", name = "G", descriptor = "I")
	public static int anInt3575 = -1;

	@OriginalMember(owner = "client!hm", name = "K", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_51 = new Class179(34, 3);

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIBI)V")
	public static void method2982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(13) int local13 = arg0;
		@Pc(17) int local17 = arg3 * arg3;
		@Pc(21) int local21 = arg0 * arg0;
		@Pc(25) int local25 = local21 << 1;
		@Pc(29) int local29 = local17 << 1;
		@Pc(33) int local33 = arg0 << 1;
		@Pc(42) int local42 = local25 + (1 - local33) * local17;
		@Pc(51) int local51 = local21 - local29 * (local33 - 1);
		@Pc(55) int local55 = local17 << 2;
		@Pc(59) int local59 = local21 << 2;
		@Pc(67) int local67 = local25 * 3;
		@Pc(75) int local75 = ((arg0 << 1) - 3) * local29;
		@Pc(81) int local81 = local59;
		Static134.method1841(Static543.anIntArrayArray57[arg4], arg1 - arg3, arg1 + arg3, arg2);
		@Pc(100) int local100 = local55 * (arg0 - 1);
		while (local13 > 0) {
			if (local42 < 0) {
				while (local42 < 0) {
					local51 += local81;
					local42 += local67;
					local7++;
					local67 += local59;
					local81 += local59;
				}
			}
			if (local51 < 0) {
				local51 += local81;
				local42 += local67;
				local7++;
				local67 += local59;
				local81 += local59;
			}
			local42 += -local100;
			local51 += -local75;
			local13--;
			local75 -= local55;
			local100 -= local55;
			@Pc(173) int local173 = arg4 - local13;
			@Pc(178) int local178 = arg4 + local13;
			@Pc(182) int local182 = local7 + arg1;
			@Pc(187) int local187 = arg1 - local7;
			Static134.method1841(Static543.anIntArrayArray57[local173], local187, local182, arg2);
			Static134.method1841(Static543.anIntArrayArray57[local178], local187, local182, arg2);
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)V")
	public static void method2984() {
		@Pc(8) int local8 = Static171.aByteArrayArray9.length;
		for (@Pc(14) int local14 = 0; local14 < local8; local14++) {
			if (Static171.aByteArrayArray9[local14] != null) {
				@Pc(22) int local22 = -1;
				for (@Pc(24) int local24 = 0; local24 < Static257.anInt4067; local24++) {
					if (Static137.anIntArray165[local24] == Static407.anIntArray620[local14]) {
						local22 = local24;
						break;
					}
				}
				if (local22 == -1) {
					Static137.anIntArray165[Static257.anInt4067] = Static407.anIntArray620[local14];
					local22 = Static257.anInt4067++;
				}
				@Pc(63) Class2_Sub22 local63 = new Class2_Sub22(Static171.aByteArrayArray9[local14]);
				@Pc(65) int local65 = 0;
				while (Static171.aByteArrayArray9[local14].length > local63.anInt10247 && local65 < 511 && Static639.anInt10306 < 1023) {
					@Pc(86) int local86 = local22 | local65++ << 6;
					@Pc(90) int local90 = local63.method8546();
					@Pc(94) int local94 = local90 >> 14;
					@Pc(100) int local100 = local90 >> 7 & 0x3F;
					@Pc(104) int local104 = local90 & 0x3F;
					@Pc(118) int local118 = (Static407.anIntArray620[local14] >> 8) * 64 + local100 - Static132.anInt2246;
					@Pc(131) int local131 = local104 + (Static407.anIntArray620[local14] & 0xFF) * 64 - Static123.anInt2176;
					@Pc(138) Class150 local138 = Static409.aClass107_2.method2291(local63.method8546());
					@Pc(145) Class2_Sub43 local145 = (Class2_Sub43) Static440.aClass118_41.method2595((long) local86);
					if (local145 == null && (local138.aByte46 & 0x1) > 0 && Static130.anInt2239 == local94 && local118 >= 0 && local118 + local138.anInt3793 < Static228.anInt3704 && local131 >= 0 && local138.anInt3793 + local131 < Static162.anInt2911) {
						@Pc(185) Class13_Sub1_Sub1_Sub1_Sub1 local185 = new Class13_Sub1_Sub1_Sub1_Sub1();
						local185.anInt4582 = local86;
						@Pc(193) Class2_Sub43 local193 = new Class2_Sub43(local185);
						Static440.aClass118_41.method2601(local193, (long) local86);
						Static38.aClass2_Sub43Array1[Static645.anInt9916++] = local193;
						Static147.anIntArray182[Static639.anInt10306++] = local86;
						local185.anInt4601 = Static262.anInt5597;
						local185.method405(local138);
						local185.method3955(local185.aClass150_1.anInt3793);
						local185.anInt4563 = local185.aClass150_1.anInt3800 << 3;
						local185.method3952((local185.aClass150_1.aByte48 + 4 & 0x81600007) << 11, true);
						local185.method398(local94, true, local185.method3950(), local118, local131);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIII)V")
	public static void method2987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class53 local7 = Static28.aClass53ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class13_Sub1_Sub3 local13 = local7.aClass13_Sub1_Sub3_2;
		@Pc(16) Class13_Sub1_Sub3 local16 = local7.aClass13_Sub1_Sub3_1;
		if (local13 != null) {
			local13.aShort126 = (short) (local13.aShort126 * arg3 / (0x10 << Static609.anInt9827 - 7));
			local13.aShort127 = (short) (local13.aShort127 * arg3 / (0x10 << Static609.anInt9827 - 7));
		}
		if (local16 != null) {
			local16.aShort126 = (short) (local16.aShort126 * arg3 / (0x10 << Static609.anInt9827 - 7));
			local16.aShort127 = (short) (local16.aShort127 * arg3 / (0x10 << Static609.anInt9827 - 7));
		}
	}
}
