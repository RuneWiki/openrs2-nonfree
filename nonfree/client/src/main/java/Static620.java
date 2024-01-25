import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static620 {

	@OriginalMember(owner = "client!va", name = "m", descriptor = "I")
	public static int anInt8145;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!rda;IIIII)V")
	public static void method7040(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static237.anInt4100) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static672.anInt10829) {
						for (@Pc(35) int local35 = local11; local35 <= local15; local35++) {
							if (local35 >= 0 && local35 < Static532.anInt8517 && (!local1 || local23 >= local7 || local35 >= local15 || local35 < arg3 && local23 != arg2)) {
								@Pc(77) Class128 local77 = Static283.aClass128ArrayArrayArray1[local17][local23][local35];
								if (local77 != null) {
									@Pc(163) int local163 = (Static177.aClass84Array2[local17].method7620(local35, local23) + Static177.aClass84Array2[local17].method7620(local35, local23 + 1) + Static177.aClass84Array2[local17].method7620(local35 + 1, local23) + Static177.aClass84Array2[local17].method7620(local35 + 1, local23 + 1)) / 4 - (Static177.aClass84Array2[arg1].method7620(arg3, arg2) + Static177.aClass84Array2[arg1].method7620(arg3, arg2 + 1) + Static177.aClass84Array2[arg1].method7620(arg3 + 1, arg2) + Static177.aClass84Array2[arg1].method7620(arg3 + 1, arg2 + 1)) / 4;
									@Pc(166) Class4_Sub1_Sub2 local166 = local77.aClass4_Sub1_Sub2_2;
									@Pc(169) Class4_Sub1_Sub2 local169 = local77.aClass4_Sub1_Sub2_1;
									if (local166 != null && local166.method8339()) {
										arg0.method8354(local1, local163, Static44.aClass100_1, (local35 - arg3) * Static492.anInt7972 + (1 - arg5) * Static377.anInt6337, local166, -103, (local23 - arg2) * Static492.anInt7972 + (1 - arg4) * Static377.anInt6337);
									}
									if (local169 != null && local169.method8339()) {
										arg0.method8354(local1, local163, Static44.aClass100_1, (local35 - arg3) * Static492.anInt7972 + (1 - arg5) * Static377.anInt6337, local169, -109, (local23 - arg2) * Static492.anInt7972 + (1 - arg4) * Static377.anInt6337);
									}
									for (@Pc(250) Class299 local250 = local77.aClass299_2; local250 != null; local250 = local250.aClass299_3) {
										@Pc(254) Class4_Sub1_Sub1 local254 = local250.aClass4_Sub1_Sub1_1;
										if (local254 != null && local254.method8339() && (local23 == local254.aShort104 || local23 == local3) && (local35 == local254.aShort105 || local35 == local11)) {
											@Pc(294) int local294 = local254.aShort103 + 1 - local254.aShort104;
											@Pc(302) int local302 = local254.aShort102 + 1 - local254.aShort105;
											arg0.method8354(local1, local163, Static44.aClass100_1, (local254.aShort105 - arg3) * Static492.anInt7972 + (local302 - arg5) * Static377.anInt6337, local254, -65, (local254.aShort104 - arg2) * Static492.anInt7972 + (local294 - arg4) * Static377.anInt6337);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(III)Z")
	public static boolean method7044(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static197.method3296(arg1, arg0) | (arg1 & 0x70000) != 0 || Static328.method4972(arg0, arg1);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IJ)V")
	public static void method7045(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		if (arg1 <= 0L) {
			return;
		}
		if (arg1 % 10L == 0L) {
			Static587.method8104(arg1 - 1L);
			Static587.method8104(1L);
		} else {
			Static587.method8104(arg1);
		}
	}
}
