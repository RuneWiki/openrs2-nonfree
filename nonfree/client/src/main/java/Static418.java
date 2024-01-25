import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static418 {

	@OriginalMember(owner = "client!og", name = "d", descriptor = "I")
	public static int anInt7221;

	@OriginalMember(owner = "client!og", name = "c", descriptor = "[I")
	public static final int[] anIntArray426 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!df;IIIII)V")
	public static void method6240(@OriginalArg(0) Class8_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static490.anInt9715) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static328.anInt5870) {
						for (@Pc(35) int local35 = local11; local35 <= local15; local35++) {
							if (local35 >= 0 && local35 < Static526.anInt8863 && (!local1 || local23 >= local7 || local35 >= local15 || local35 < arg3 && local23 != arg2)) {
								@Pc(77) Class174 local77 = Static260.aClass174ArrayArrayArray2[local17][local23][local35];
								if (local77 != null) {
									@Pc(163) int local163 = (Static242.aClass22Array3[local17].method8038(local35, local23) + Static242.aClass22Array3[local17].method8038(local35, local23 + 1) + Static242.aClass22Array3[local17].method8038(local35 + 1, local23) + Static242.aClass22Array3[local17].method8038(local35 + 1, local23 + 1)) / 4 - (Static242.aClass22Array3[arg1].method8038(arg3, arg2) + Static242.aClass22Array3[arg1].method8038(arg3, arg2 + 1) + Static242.aClass22Array3[arg1].method8038(arg3 + 1, arg2) + Static242.aClass22Array3[arg1].method8038(arg3 + 1, arg2 + 1)) / 4;
									@Pc(166) Class8_Sub1_Sub4 local166 = local77.aClass8_Sub1_Sub4_2;
									@Pc(169) Class8_Sub1_Sub4 local169 = local77.aClass8_Sub1_Sub4_1;
									if (local166 != null && local166.method8899((byte) 94)) {
										arg0.method8901(local166, (local35 - arg3) * Static88.anInt7739 + (1 - arg5) * Static349.anInt6143, local1, (local23 - arg2) * Static88.anInt7739 + (1 - arg4) * Static349.anInt6143, local163, Static205.aClass57_5);
									}
									if (local169 != null && local169.method8899((byte) 94)) {
										arg0.method8901(local169, (local35 - arg3) * Static88.anInt7739 + (1 - arg5) * Static349.anInt6143, local1, (local23 - arg2) * Static88.anInt7739 + (1 - arg4) * Static349.anInt6143, local163, Static205.aClass57_5);
									}
									for (@Pc(250) Class273 local250 = local77.aClass273_67; local250 != null; local250 = local250.aClass273_114) {
										@Pc(254) Class8_Sub1_Sub3 local254 = local250.aClass8_Sub1_Sub3_1;
										if (local254 != null && local254.method8899((byte) 94) && (local23 == local254.aShort109 || local23 == local3) && (local35 == local254.aShort108 || local35 == local11)) {
											@Pc(294) int local294 = local254.aShort110 + 1 - local254.aShort109;
											@Pc(302) int local302 = local254.aShort107 + 1 - local254.aShort108;
											arg0.method8901(local254, (local254.aShort108 - arg3) * Static88.anInt7739 + (local302 - arg5) * Static349.anInt6143, local1, (local254.aShort109 - arg2) * Static88.anInt7739 + (local294 - arg4) * Static349.anInt6143, local163, Static205.aClass57_5);
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

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(B)V")
	public static void method6242() {
		Static28.aClass391_53.method9276(0);
	}
}
