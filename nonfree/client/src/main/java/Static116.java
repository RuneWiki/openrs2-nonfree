import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!ea", name = "x", descriptor = "I")
	public static int anInt2276;

	@OriginalMember(owner = "client!ea", name = "y", descriptor = "I")
	public static int anInt2277;

	@OriginalMember(owner = "client!ea", name = "C", descriptor = "I")
	public static int anInt2278 = 0;

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)Z")
	public static boolean method1910() {
		return Static602.anInt10026 != 0;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIB)I")
	public static int method1911(@OriginalArg(1) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(37) int local37 = (arg0 & 0x7F) * 96 >> 7;
			if (local37 < 2) {
				local37 = 2;
			} else if (local37 > 126) {
				local37 = 126;
			}
			return (arg0 & 0xFF80) + local37;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg7 < 1 || arg2 < 1 || arg7 > Static442.anInt7975 - 2 || arg2 > Static284.anInt7916 - 2) {
			return;
		}
		@Pc(29) int local29 = arg0;
		if (arg0 < 3 && Static492.method7384(arg7, arg2)) {
			local29 = arg0 + 1;
		}
		if (Static348.aClass6_Sub22_19.aClass15_Sub28_2.method8677() == 0 && !Static510.method7565(Static110.anInt2165, arg2, local29, arg7)) {
			return;
		}
		if (Static272.aClass97ArrayArrayArray3 == null) {
			return;
		}
		Static3.aClass96_Sub1_1.method4575(Static619.aClass319Array1[arg0], arg4, arg2, arg7, Static162.aClass100_7, arg0);
		if (arg6 >= 0) {
			@Pc(75) int local75 = Static348.aClass6_Sub22_19.aClass15_Sub2_1.method484();
			Static348.aClass6_Sub22_19.method3534(1, Static348.aClass6_Sub22_19.aClass15_Sub2_1);
			Static3.aClass96_Sub1_1.method4584(local29, arg5, arg0, arg7, arg6, arg3, arg1, Static162.aClass100_7, arg2, Static619.aClass319Array1[arg0]);
			Static348.aClass6_Sub22_19.method3534(local75, Static348.aClass6_Sub22_19.aClass15_Sub2_1);
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILclient!ns;)V")
	public static void method1913(@OriginalArg(1) Class20_Sub2_Sub2_Sub1 arg0) {
		@Pc(5) boolean local5 = false;
		if (Static113.anInt2243 == arg0.anInt5553 || arg0.anInt5549 == -1 || arg0.anInt5516 != 0) {
			local5 = true;
		} else {
			@Pc(25) Class21 local25 = Static294.aClass373_2.method8738(arg0.anInt5549);
			if (local25.aBoolean13 || arg0.anInt5502 + 1 > local25.anIntArray17[arg0.anInt5503]) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(57) int local57 = arg0.anInt5553 - arg0.anInt5512;
			@Pc(62) int local62 = Static113.anInt2243 - arg0.anInt5512;
			@Pc(73) int local73 = arg0.anInt5548 * 512 + arg0.method4913() * 256;
			@Pc(85) int local85 = arg0.anInt5563 * 512 + arg0.method4913() * 256;
			@Pc(97) int local97 = arg0.anInt5542 * 512 + arg0.method4913() * 256;
			@Pc(109) int local109 = arg0.anInt5490 * 512 + arg0.method4913() * 256;
			arg0.anInt10729 = (local109 * local62 + (local57 - local62) * local85) / local57;
			arg0.anInt10725 = (local73 * (local57 - local62) + local97 * local62) / local57;
		}
		arg0.anInt5575 = 0;
		if (arg0.anInt5525 == 0) {
			arg0.method4920(false, 8192);
		}
		if (arg0.anInt5525 == 1) {
			arg0.method4920(false, 12288);
		}
		if (arg0.anInt5525 == 2) {
			arg0.method4920(false, 0);
		}
		if (arg0.anInt5525 == 3) {
			arg0.method4920(false, 4096);
		}
	}
}
