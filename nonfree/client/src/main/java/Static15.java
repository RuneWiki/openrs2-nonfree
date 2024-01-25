import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(IIB)Z")
	public static boolean method837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(Lclient!jw;IIIII)V")
	public static void method838(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static442.anInt7929) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static569.anInt9425) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static293.anInt5181 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class77 local62 = Static330.aClass77ArrayArrayArray2[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static364.aClass51Array3[local17].method7835(local23, local32) + Static364.aClass51Array3[local17].method7835(local23 + 1, local32) + Static364.aClass51Array3[local17].method7835(local23, local32 + 1) + Static364.aClass51Array3[local17].method7835(local23 + 1, local32 + 1)) / 4 - (Static364.aClass51Array3[arg1].method7835(arg2, arg3) + Static364.aClass51Array3[arg1].method7835(arg2 + 1, arg3) + Static364.aClass51Array3[arg1].method7835(arg2, arg3 + 1) + Static364.aClass51Array3[arg1].method7835(arg2 + 1, arg3 + 1)) / 4;
									@Pc(151) Class4_Sub1_Sub3 local151 = local62.aClass4_Sub1_Sub3_2;
									@Pc(154) Class4_Sub1_Sub3 local154 = local62.aClass4_Sub1_Sub3_1;
									if (local151 != null && local151.method7690()) {
										arg0.method7696((local23 - arg2) * Static384.anInt7200 + (1 - arg4) * Static161.anInt3180, local151, Static232.aClass5_8, local148, local1, (local32 - arg3) * Static384.anInt7200 + (1 - arg5) * Static161.anInt3180);
									}
									if (local154 != null && local154.method7690()) {
										arg0.method7696((local23 - arg2) * Static384.anInt7200 + (1 - arg4) * Static161.anInt3180, local154, Static232.aClass5_8, local148, local1, (local32 - arg3) * Static384.anInt7200 + (1 - arg5) * Static161.anInt3180);
									}
									for (@Pc(227) Class128 local227 = local62.aClass128_1; local227 != null; local227 = local227.aClass128_2) {
										@Pc(231) Class4_Sub1_Sub2 local231 = local227.aClass4_Sub1_Sub2_1;
										if (local231 != null && local231.method7690() && (local23 == local231.aShort118 || local23 == local3) && (local32 == local231.aShort116 || local32 == local11)) {
											@Pc(260) int local260 = local231.aShort117 + 1 - local231.aShort118;
											@Pc(268) int local268 = local231.aShort119 + 1 - local231.aShort116;
											arg0.method7696((local231.aShort118 - arg2) * Static384.anInt7200 + (local260 - arg4) * Static161.anInt3180, local231, Static232.aClass5_8, local148, local1, (local231.aShort116 - arg3) * Static384.anInt7200 + (local268 - arg5) * Static161.anInt3180);
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

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(ZII)Z")
	public static boolean method839(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class299 local13 = Static105.aClass302_1.method7466(arg0);
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local13.method7410(arg1);
	}
}
