import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "I")
	public static int anInt628 = 0;

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!es;B)V")
	public static void method684(@OriginalArg(0) Class12_Sub1_Sub2 arg0) {
		@Pc(5) boolean local5 = false;
		if (Static295.anInt5281 == arg0.anInt5374 || arg0.anInt5371 == -1 || arg0.anInt5357 != 0) {
			local5 = true;
		} else {
			@Pc(29) Class189 local29 = Static351.aClass175_3.method4107(arg0.anInt5371);
			if (local29.aBoolean384 || local29.anIntArray640[arg0.anInt5318] < arg0.anInt5370 + 1) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(57) int local57 = arg0.anInt5374 - arg0.anInt5372;
			@Pc(63) int local63 = Static295.anInt5281 - arg0.anInt5372;
			@Pc(74) int local74 = arg0.anInt5344 * 128 + arg0.method4706() * 64;
			@Pc(85) int local85 = arg0.anInt5347 * 128 + arg0.method4706() * 64;
			@Pc(97) int local97 = arg0.anInt5336 * 128 + arg0.method4706() * 64;
			@Pc(108) int local108 = arg0.anInt5362 * 128 + arg0.method4706() * 64;
			arg0.anInt6317 = (local63 * local108 + (local57 - local63) * local85) / local57;
			arg0.anInt6328 = (local63 * local97 + local74 * (local57 - local63)) / local57;
		}
		arg0.anInt5377 = 0;
		if (arg0.anInt5346 == 0) {
			arg0.method4703(8192);
		}
		if (arg0.anInt5346 == 1) {
			arg0.method4703(12288);
		}
		if (arg0.anInt5346 == 2) {
			arg0.method4703(0);
		}
		if (arg0.anInt5346 == 3) {
			arg0.method4703(4096);
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(B)V")
	public static void method685() {
		Static168.anInt3003 = 0;
		for (@Pc(14) int local14 = 0; local14 < 2048; local14++) {
			Static290.aClass2_Sub13Array1[local14] = null;
			Static258.aByteArray65[local14] = 1;
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(II)I")
	public static int method686(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILclient!pf;)V")
	public static void method687(@OriginalArg(1) Class2_Sub13_Sub2 arg0) {
		arg0.method4252();
		@Pc(14) int local14 = Static194.anInt3441;
		@Pc(24) Class12_Sub1_Sub2_Sub2 local24 = Static267.aClass12_Sub1_Sub2_Sub2_1 = Static90.aClass12_Sub1_Sub2_Sub2Array1[local14] = new Class12_Sub1_Sub2_Sub2();
		local24.anInt5365 = local14;
		@Pc(32) int local32 = arg0.method4257(30);
		@Pc(37) byte local37 = (byte) (local32 >> 28);
		@Pc(43) int local43 = local32 >> 14 & 0x3FFF;
		local24.anIntArray659[0] = local43 - Static376.anInt6607;
		@Pc(54) int local54 = local32 & 0x3FFF;
		local24.anInt6328 = (local24.anIntArray659[0] << 7) + (local24.method4706() << 6);
		local24.anIntArray658[0] = local54 - Static133.anInt2474;
		local24.anInt6317 = (local24.anIntArray658[0] << 7) + (local24.method4706() << 6);
		Static331.anInt5804 = local24.aByte74 = local37;
		if (Static290.aClass2_Sub13Array1[local14] != null) {
			local24.method4714(Static290.aClass2_Sub13Array1[local14]);
		}
		Static168.anInt3003 = 0;
		Static7.anIntArray24[Static168.anInt3003++] = local14;
		Static225.aByteArray69[local14] = 0;
		Static380.anInt6629 = 0;
		for (@Pc(124) int local124 = 1; local124 < 2048; local124++) {
			if (local124 != local14) {
				@Pc(138) int local138 = arg0.method4257(18);
				@Pc(142) int local142 = local138 >> 16;
				@Pc(148) int local148 = local138 >> 8 & 0xFF;
				@Pc(152) int local152 = local138 & 0xFF;
				Static367.anIntArray780[local124] = local152 + (local142 << 28) + (local148 << 14);
				Static203.anIntArray444[local124] = 0;
				Static299.anIntArray650[local124] = -1;
				Static363.anIntArray719[Static380.anInt6629++] = local124;
				Static225.aByteArray69[local124] = 0;
			}
		}
		arg0.method4262();
	}
}
