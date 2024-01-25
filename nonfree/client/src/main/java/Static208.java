import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "Lclient!wd;")
	public static Class214 aClass214_22;

	@OriginalMember(owner = "client!nf", name = "h", descriptor = "B")
	public static byte aByte89;

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
	public static int anInt6332 = 0;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(CB)Z")
	public static boolean method5774(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)Lclient!kh;")
	public static Class20_Sub6 method5776(@OriginalArg(0) int arg0) {
		@Pc(7) Class109[] local7 = Class216.aClass109Array1;
		synchronized (Class216.aClass109Array1) {
			@Pc(30) Class20_Sub6 local30;
			if (arg0 >= Class216.aClass109Array1.length || Class216.aClass109Array1[arg0].method2937()) {
				local30 = new Class20_Sub6();
				local30.aClass20_Sub8Array1 = new Class20_Sub8[arg0];
				for (@Pc(36) int local36 = 0; local36 < arg0; local36++) {
					local30.aClass20_Sub8Array1[local36] = new Class20_Sub8();
				}
			} else {
				local30 = (Class20_Sub6) Class216.aClass109Array1[arg0].method2941();
				local30.method5103();
				@Pc(65) int local65 = Static155.anIntArray582[arg0]--;
			}
			return local30;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IZ)V")
	public static void method5781(@OriginalArg(1) boolean arg0) {
		@Pc(9) byte local9;
		@Pc(11) byte[][] local11;
		if (arg0) {
			local9 = 1;
			local11 = Static179.aByteArrayArray11;
		} else {
			local9 = 4;
			local11 = Static83.aByteArrayArray4;
		}
		for (@Pc(24) int local24 = 0; local24 < local9; local24++) {
			Static24.method359();
			for (@Pc(30) int local30 = 0; local30 < Static153.anInt2883 >> 3; local30++) {
				for (@Pc(34) int local34 = 0; local34 < Static246.anInt4606 >> 3; local34++) {
					@Pc(44) int local44 = Static176.anIntArrayArrayArray5[local24][local30][local34];
					if (local44 != -1) {
						@Pc(54) int local54 = local44 >> 24 & 0x3;
						if (!arg0 || local54 == 0) {
							@Pc(67) int local67 = local44 >> 1 & 0x3;
							@Pc(73) int local73 = local44 >> 14 & 0x3FF;
							@Pc(79) int local79 = local44 >> 3 & 0x7FF;
							@Pc(89) int local89 = local79 / 8 + (local73 / 8 << 8);
							for (@Pc(91) int local91 = 0; local91 < Static303.anIntArray647.length; local91++) {
								if (local89 == Static303.anIntArray647[local91] && local11[local91] != null) {
									Static125.method2483(Static289.aClass81_7, (local73 & 0x7) * 8, Static334.aClass27Array1, local34 * 8, local30 * 8, (local79 & 0x7) * 8, local54, arg0, local24, local11[local91], local67);
									break;
								}
							}
						}
					}
				}
			}
		}
	}
}
