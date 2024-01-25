import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!lh", name = "q", descriptor = "Lclient!cr;")
	public static Class56 aClass56_4;

	@OriginalMember(owner = "client!lh", name = "F", descriptor = "Lclient!jt;")
	public static final Class166 aClass166_31 = new Class166(4);

	@OriginalMember(owner = "client!lh", name = "N", descriptor = "[[B")
	public static final byte[][] aByteArrayArray98 = new byte[1000][];

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!bs;I[II)V")
	public static void method5285(@OriginalArg(0) Class20_Sub2_Sub2_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(6) boolean local6;
		@Pc(8) int local8;
		if (arg0.anIntArray327 != null) {
			local6 = true;
			for (local8 = 0; local8 < arg0.anIntArray327.length; local8++) {
				if (arg0.anIntArray327[local8] != arg2[local8]) {
					local6 = false;
					break;
				}
			}
			if (local6 && arg0.anInt5549 != -1) {
				@Pc(45) Class21 local45 = Static294.aClass373_2.method8738(arg0.anInt5549);
				@Pc(48) int local48 = local45.anInt351;
				if (local48 == 1) {
					arg0.anInt5566 = 0;
					arg0.anInt5502 = 0;
					arg0.anInt5516 = arg1;
					arg0.anInt5546 = 1;
					arg0.anInt5503 = 0;
					if (!arg0.aBoolean377) {
						Static558.method8052(arg0.anInt5503, arg0, local45);
					}
				}
				if (local48 == 2) {
					arg0.anInt5566 = 0;
				}
			}
		}
		local6 = true;
		for (local8 = 0; local8 < arg2.length; local8++) {
			if (arg2[local8] != -1) {
				local6 = false;
			}
			if (arg0.anIntArray327 == null || arg0.anIntArray327[local8] == -1 || Static294.aClass373_2.method8738(arg2[local8]).anInt355 >= Static294.aClass373_2.method8738(arg0.anIntArray327[local8]).anInt355) {
				arg0.anInt5516 = arg1;
				arg0.anIntArray327 = arg2;
				break;
			}
		}
		if (local6) {
			arg0.anInt5516 = arg1;
			arg0.anIntArray327 = arg2;
		}
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
	public static void method5290() {
		@Pc(8) int local8 = Static327.aByteArrayArray102.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static327.aByteArrayArray102[local10] != null) {
				@Pc(18) int local18 = -1;
				for (@Pc(20) int local20 = 0; local20 < Static437.anInt7908; local20++) {
					if (Static311.anIntArray358[local20] == Static480.anIntArray523[local10]) {
						local18 = local20;
						break;
					}
				}
				if (local18 == -1) {
					Static311.anIntArray358[Static437.anInt7908] = Static480.anIntArray523[local10];
					local18 = Static437.anInt7908++;
				}
				@Pc(67) Class6_Sub40 local67 = new Class6_Sub40(Static327.aByteArrayArray102[local10]);
				@Pc(69) int local69 = 0;
				while (Static327.aByteArrayArray102[local10].length > local67.anInt10169 && local69 < 511 && Static252.anInt5066 < 1023) {
					@Pc(88) int local88 = local69++ << 6 | local18;
					@Pc(92) int local92 = local67.method8571();
					@Pc(96) int local96 = local92 >> 14;
					@Pc(102) int local102 = local92 >> 7 & 0x3F;
					@Pc(106) int local106 = local92 & 0x3F;
					@Pc(119) int local119 = (Static480.anIntArray523[local10] >> 8) * 64 + local102 - Static606.anInt8651;
					@Pc(132) int local132 = (Static480.anIntArray523[local10] & 0xFF) * 64 + local106 - Static195.anInt3961;
					@Pc(139) Class247 local139 = Static563.aClass346_2.method8199(local67.method8571());
					@Pc(146) Class6_Sub46 local146 = (Class6_Sub46) Static347.aClass128_23.method3560((long) local88);
					if (local146 == null && (local139.aByte89 & 0x1) > 0 && Static110.anInt2165 == local96 && local119 >= 0 && Static442.anInt7975 > local139.anInt7681 + local119 && local132 >= 0 && local132 + local139.anInt7681 < Static284.anInt7916) {
						@Pc(187) Class20_Sub2_Sub2_Sub1_Sub2 local187 = new Class20_Sub2_Sub2_Sub1_Sub2();
						local187.anInt5567 = local88;
						@Pc(195) Class6_Sub46 local195 = new Class6_Sub46(local187);
						Static347.aClass128_23.method3551((long) local88, local195);
						Static1.aClass6_Sub46Array5[Static273.anInt5420++] = local195;
						Static483.anIntArray525[Static252.anInt5066++] = local88;
						local187.anInt5569 = Static113.anInt2243;
						local187.method4928(local139);
						local187.method4908(local187.aClass247_1.anInt7681);
						local187.anInt5544 = local187.aClass247_1.anInt7691 << 3;
						local187.method4920(true, (local187.aClass247_1.aByte86 + 4 & 0x7C400007) << 11);
						local187.method4924(local96, true, local132, local119, local187.method4913());
					}
				}
			}
		}
	}
}
