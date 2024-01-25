import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!ev", name = "W", descriptor = "I")
	public static int anInt2023;

	@OriginalMember(owner = "client!ev", name = "X", descriptor = "I")
	public static int anInt2024;

	@OriginalMember(owner = "client!ev", name = "G", descriptor = "Z")
	public static volatile boolean aBoolean189 = true;

	@OriginalMember(owner = "client!ev", name = "L", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_22 = new Class215(77, 7);

	@OriginalMember(owner = "client!ev", name = "S", descriptor = "I")
	public static int anInt2020 = 0;

	@OriginalMember(owner = "client!ev", name = "U", descriptor = "[Z")
	public static final boolean[] aBooleanArray11 = new boolean[8];

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIBII)V")
	public static void method1772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static422.anInt6948 = arg0;
		Static189.anInt3569 = arg1;
		Static238.anInt4508 = arg3;
		Static71.anInt6919 = arg2;
	}

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "(Z)V")
	public static void method1773() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static342.aBooleanArray17[local3] = false;
		}
		Static105.anInt2321 = anInt2024;
		Static124.anInt2626 = Static163.anInt3197;
		Static59.anInt1090 = Static145.anInt2906;
		Static222.anInt4125 = 0;
		Static140.anInt2836 = -1;
		Static294.anInt446 = Static24.anInt5323;
		Static111.anInt2386 = 5;
		Static381.anInt6417 = 0;
		Static137.anInt2797 = -1;
		Static204.anInt3896 = Static431.anInt7074;
		Static179.anInt3427 = Static136.anInt2790;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lclient!ya;Lclient!fi;IIIII)V")
	public static void method1774(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static235.anInt4487) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static422.anInt6945) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static171.anInt3361 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class164 local62 = Static202.aClass164ArrayArrayArray5[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static417.aClass65Array4[local17].l(local23, local32) + Static417.aClass65Array4[local17].l(local23 + 1, local32) + Static417.aClass65Array4[local17].l(local23, local32 + 1) + Static417.aClass65Array4[local17].l(local23 + 1, local32 + 1)) / 4 - (Static417.aClass65Array4[arg2].l(arg3, arg4) + Static417.aClass65Array4[arg2].l(arg3 + 1, arg4) + Static417.aClass65Array4[arg2].l(arg3, arg4 + 1) + Static417.aClass65Array4[arg2].l(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class16_Sub5 local143 = local62.aClass16_Sub5_3;
									@Pc(146) Class16_Sub5 local146 = local62.aClass16_Sub5_2;
									if (local143 != null && local143.method5338()) {
										arg1.method5337((local32 - arg4) * Static4.anInt5935 + (1 - arg6) * Static333.anInt5747, (local23 - arg3) * Static4.anInt5935 + (1 - arg5) * Static333.anInt5747, local143, local1, arg0, local140);
									}
									if (local146 != null && local146.method5338()) {
										arg1.method5337((local32 - arg4) * Static4.anInt5935 + (1 - arg6) * Static333.anInt5747, (local23 - arg3) * Static4.anInt5935 + (1 - arg5) * Static333.anInt5747, local146, local1, arg0, local140);
									}
									for (@Pc(219) Class7 local219 = local62.aClass7_3; local219 != null; local219 = local219.aClass7_1) {
										@Pc(223) Class16_Sub1 local223 = local219.aClass16_Sub1_1;
										if (local223 != null && local223.method5338() && (local23 == local223.aShort94 || local23 == local3) && (local32 == local223.aShort96 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort97 + 1 - local223.aShort94;
											@Pc(260) int local260 = local223.aShort95 + 1 - local223.aShort96;
											arg1.method5337((local223.aShort96 - arg4) * Static4.anInt5935 + (local260 - arg6) * Static333.anInt5747, (local223.aShort94 - arg3) * Static4.anInt5935 + (local252 - arg5) * Static333.anInt5747, local223, local1, arg0, local140);
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
}
