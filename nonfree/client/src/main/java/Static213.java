import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!hca", name = "A", descriptor = "Lclient!cb;")
	public static Class50 aClass50_58;

	@OriginalMember(owner = "client!hca", name = "C", descriptor = "I")
	public static int anInt3438 = 0;

	@OriginalMember(owner = "client!hca", name = "E", descriptor = "I")
	public static int anInt3440 = 0;

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(Lclient!wga;Z)Z")
	public static boolean method3080(@OriginalArg(0) Class41_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static298.aClass88Array3 == Static176.aClass88Array1;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method7909();
		if (arg0.aShort109 < 0 || arg0.aShort108 < 0 || arg0.aShort107 >= Static665.anInt7330 || arg0.aShort110 >= Static92.anInt1526) {
			return false;
		}
		@Pc(33) short local33 = 0;
		@Pc(40) int local40;
		for (@Pc(36) int local36 = arg0.aShort109; local36 <= arg0.aShort107; local36++) {
			for (local40 = arg0.aShort108; local40 <= arg0.aShort110; local40++) {
				@Pc(47) Class313 local47 = Static40.method503(arg0.aByte149, local36, local40);
				if (local47 != null) {
					@Pc(53) Class40 local53 = Static338.method7929(arg0);
					@Pc(56) Class40 local56 = local47.aClass40_3;
					if (local56 == null) {
						local47.aClass40_3 = local53;
					} else {
						while (local56.aClass40_1 != null) {
							local56 = local56.aClass40_1;
						}
						local56.aClass40_1 = local53;
					}
					if (local6 && (Static498.anIntArrayArray67[local36][local40] & 0xFF000000) != 0) {
						local8 = Static498.anIntArrayArray67[local36][local40];
						local10 = Static288.aShortArrayArray13[local36][local40];
						local12 = Static106.aByteArrayArray2[local36][local40];
					}
					if (!arg1 && local47.aClass41_Sub1_Sub4_1 != null && local47.aClass41_Sub1_Sub4_1.aShort86 > local33) {
						local33 = local47.aClass41_Sub1_Sub4_1.aShort86;
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local40 = arg0.aShort109; local40 <= arg0.aShort107; local40++) {
				for (@Pc(136) int local136 = arg0.aShort108; local136 <= arg0.aShort110; local136++) {
					if ((Static498.anIntArrayArray67[local40][local136] & 0xFF000000) == 0) {
						Static498.anIntArrayArray67[local40][local136] = local8;
						Static288.aShortArrayArray13[local40][local136] = local10;
						Static106.aByteArrayArray2[local40][local136] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static545.aClass41_Sub1_Sub1Array1[Static89.anInt1482++] = arg0;
		} else {
			local40 = Static298.aClass88Array3 == Static176.aClass88Array1 ? 1 : 0;
			if (!arg0.method8650()) {
				arg0.aClass41_Sub1_23 = Static126.aClass41_Sub1Array2[local40];
				Static126.aClass41_Sub1Array2[local40] = arg0;
			} else if (arg0.method8647()) {
				arg0.aClass41_Sub1_23 = Static227.aClass41_Sub1Array3[local40];
				Static227.aClass41_Sub1Array3[local40] = arg0;
			} else {
				arg0.aClass41_Sub1_23 = Static271.aClass41_Sub1Array4[local40];
				Static271.aClass41_Sub1Array4[local40] = arg0;
				Static677.aBoolean794 = true;
			}
		}
		if (arg1) {
			arg0.anInt10370 -= local33;
		}
		return true;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(IIILclient!ge;)V")
	public static void method3081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class41_Sub1_Sub4 arg3) {
		@Pc(4) Class313 local4 = Static40.method503(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass41_Sub1_Sub4_1 = arg3;
		@Pc(16) int local16 = Static298.aClass88Array3 == Static176.aClass88Array1 ? 1 : 0;
		if (arg3.method8650()) {
			if (arg3.method8647()) {
				arg3.aClass41_Sub1_23 = Static227.aClass41_Sub1Array3[local16];
				Static227.aClass41_Sub1Array3[local16] = arg3;
				return;
			}
			arg3.aClass41_Sub1_23 = Static271.aClass41_Sub1Array4[local16];
			Static271.aClass41_Sub1Array4[local16] = arg3;
			Static677.aBoolean794 = true;
			return;
		}
		arg3.aClass41_Sub1_23 = Static126.aClass41_Sub1Array2[local16];
		Static126.aClass41_Sub1Array2[local16] = arg3;
	}
}
