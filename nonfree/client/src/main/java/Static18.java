import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!bc", name = "t", descriptor = "[Z")
	public static boolean[] aBooleanArray2;

	@OriginalMember(owner = "client!bc", name = "u", descriptor = "Lclient!c;")
	public static Class5 aClass5_3;

	@OriginalMember(owner = "client!bc", name = "w", descriptor = "I")
	public static int anInt555;

	@OriginalMember(owner = "client!bc", name = "A", descriptor = "[Lclient!c;")
	public static Class5[] aClass5Array3;

	@OriginalMember(owner = "client!bc", name = "B", descriptor = "Lclient!ih;")
	public static final Class92 aClass92_2 = new Class92(64);

	@OriginalMember(owner = "client!bc", name = "C", descriptor = "I")
	public static int anInt559 = 0;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
	public static void method432() {
		if (Static177.anIntArray371 != null) {
			return;
		}
		Static177.anIntArray371 = new int[65536];
		@Pc(24) double local24 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(26) int local26 = 0; local26 < 65536; local26++) {
			@Pc(39) double local39 = (double) (local26 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(50) double local50 = (double) (local26 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(57) double local57 = (double) (local26 & 0x7F) / 128.0D;
			@Pc(59) double local59 = local57;
			@Pc(61) double local61 = local57;
			@Pc(63) double local63 = local57;
			if (local50 != 0.0D) {
				@Pc(80) double local80;
				if (local57 < 0.5D) {
					local80 = (local50 + 1.0D) * local57;
				} else {
					local80 = local50 + local57 - local57 * local50;
				}
				@Pc(94) double local94 = local57 * 2.0D - local80;
				@Pc(98) double local98 = local39 + 0.3333333333333333D;
				if (local98 > 1.0D) {
					local98--;
				}
				@Pc(112) double local112 = local39 - 0.3333333333333333D;
				if (local39 * 6.0D < 1.0D) {
					local61 = local94 + local39 * 6.0D * (local80 - local94);
				} else if (local39 * 2.0D < 1.0D) {
					local61 = local80;
				} else if (local39 * 3.0D < 2.0D) {
					local61 = local94 + (0.6666666666666666D - local39) * (local80 - local94) * 6.0D;
				} else {
					local61 = local94;
				}
				if (local98 * 6.0D < 1.0D) {
					local59 = local98 * (local80 - local94) * 6.0D + local94;
				} else if (local98 * 2.0D < 1.0D) {
					local59 = local80;
				} else if (local98 * 3.0D < 2.0D) {
					local59 = (local80 - local94) * 6.0D * (0.6666666666666666D - local98) + local94;
				} else {
					local59 = local94;
				}
				if (local112 < 0.0D) {
					local112++;
				}
				if (local112 * 6.0D < 1.0D) {
					local63 = local94 + local112 * (local80 - local94) * 6.0D;
				} else if (local112 * 2.0D < 1.0D) {
					local63 = local80;
				} else if (local112 * 3.0D < 2.0D) {
					local63 = local94 + (0.6666666666666666D - local112) * (-local94 + local80) * 6.0D;
				} else {
					local63 = local94;
				}
			}
			local59 = Math.pow(local59, local24);
			local61 = Math.pow(local61, local24);
			local63 = Math.pow(local63, local24);
			@Pc(290) int local290 = (int) (local59 * 256.0D);
			@Pc(295) int local295 = (int) (local61 * 256.0D);
			@Pc(300) int local300 = (int) (local63 * 256.0D);
			@Pc(311) int local311 = local300 + (local290 << 16) + (local295 << 8);
			Static177.anIntArray371[local26] = local311;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!wo;Z)V")
	public static void method434(@OriginalArg(0) Class216 arg0) {
		Static309.aClass216_92 = arg0;
		Static263.anInt5363 = Static309.aClass216_92.method5675(16);
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V")
	public static void method435() {
		Static227.anInt4722 = 0;
		Static85.anInt5391 = 0;
		Static308.anInt3004 = 0;
		Static22.anInt5200 = 0;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!aq;B)V")
	public static void method436(@OriginalArg(0) Class12 arg0) {
		@Pc(14) int local14 = arg0.anInt435;
		if (local14 == 327) {
			arg0.anInt468 = 150;
			arg0.anInt396 = (int) (Math.sin((double) Static5.anInt208 / 40.0D) * 256.0D) & 0x3FFF;
			arg0.anInt433 = 5;
			arg0.anInt448 = -1;
		} else if (local14 == 328) {
			if (Static198.aClass17_Sub1_Sub1_Sub1_3.aString13 == null) {
				arg0.anInt394 = 0;
				arg0.anInt448 = 0;
			} else {
				arg0.anInt468 = 150;
				arg0.anInt396 = (int) (Math.sin((double) Static5.anInt208 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt433 = 5;
				arg0.anInt448 = 2047;
				arg0.anInt394 = Static54.method1414(Static198.aClass17_Sub1_Sub1_Sub1_3.aString13);
				arg0.anInt450 = 0;
				arg0.anInt395 = Static198.aClass17_Sub1_Sub1_Sub1_3.anInt4876;
				arg0.anInt441 = Static198.aClass17_Sub1_Sub1_Sub1_3.anInt4824;
				arg0.anInt388 = Static198.aClass17_Sub1_Sub1_Sub1_3.anInt4847;
			}
		}
	}
}
