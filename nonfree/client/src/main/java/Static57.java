import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!bma", name = "d", descriptor = "Lclient!dka;")
	public static final Class85 aClass85_10 = new Class85(64);

	@OriginalMember(owner = "client!bma", name = "k", descriptor = "Z")
	public static volatile boolean aBoolean124 = false;

	@OriginalMember(owner = "client!bma", name = "a", descriptor = "(Lclient!nja;Lclient!ha;ILclient!sh;)V")
	public static void method908(@OriginalArg(0) Class259 arg0, @OriginalArg(1) Class145 arg1, @OriginalArg(3) Class2_Sub51 arg2) {
		@Pc(10) Class43 local10 = arg0.method6254(arg1);
		if (local10 == null) {
			return;
		}
		@Pc(17) int local17 = local10.method9601();
		if (local17 < local10.method9592()) {
			local17 = local10.method9592();
		}
		@Pc(29) int local29 = arg2.anInt9157;
		@Pc(32) int local32 = arg2.anInt9163;
		@Pc(34) int local34 = 0;
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = 0;
		@Pc(61) int local61;
		@Pc(84) int local84;
		if (arg0.aString75 != null) {
			local34 = Static607.aClass289_17.method6931(arg0.aString75, (int[]) null, Static512.aStringArray36, (Class43[]) null);
			for (local61 = 0; local61 < local34; local61++) {
				@Pc(67) String local67 = Static512.aStringArray36[local61];
				if (local61 < local34 - 1) {
					local67 = local67.substring(0, local67.length() - 4);
				}
				local84 = Static173.aClass76_3.method1558(local67);
				if (local43 < local84) {
					local43 = local84;
				}
			}
			local45 = local34 * Static173.aClass76_3.method1561() + Static173.aClass76_3.method1560() / 2;
		}
		local61 = arg2.anInt9157 + local17 / 2;
		if (Static90.anInt3354 + local17 > local29) {
			local61 = Static90.anInt3354 + local17 / 2 + local43 / 2 + 10 + 5;
			local29 = Static90.anInt3354;
		} else if (local29 > Static90.anInt3356 - local17) {
			local29 = Static90.anInt3356 - local17;
			local61 = Static90.anInt3356 - local17 / 2 - local43 / 2 - 10 - 5;
		}
		@Pc(175) int local175 = arg2.anInt9163;
		if (local32 < Static90.anInt3347 + local17) {
			local32 = Static90.anInt3347;
			local175 = local17 / 2 + Static90.anInt3347 + 10;
		} else if (local32 > Static90.anInt3357 - local17) {
			local175 = Static90.anInt3357 - local45 - local17 / 2 - 10;
			local32 = Static90.anInt3357 - local17;
		}
		local84 = (int) (Math.atan2((double) (local29 - arg2.anInt9157), (double) (local32 - arg2.anInt9163)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method9604((float) local29 + (float) local17 / 2.0F, (float) local32 + (float) local17 / 2.0F, 4096, local84);
		@Pc(265) int local265 = -2;
		@Pc(267) int local267 = -2;
		@Pc(269) int local269 = -2;
		@Pc(271) int local271 = -2;
		if (arg0.aString75 != null) {
			local267 = local175;
			local265 = local61 - local43 / 2 - 5;
			local271 = local175 + Static173.aClass76_3.method1561() * local34 + 3;
			local269 = local265 + local43 + 10;
			if (arg0.anInt6970 != 0) {
				arg1.method9637(local269 - local265, local271 - local175, local175, arg0.anInt6970, local265);
			}
			if (arg0.anInt6956 != 0) {
				arg1.method9635(arg0.anInt6956, local175, local271 - local175, local265, local269 - local265);
			}
			for (@Pc(343) int local343 = 0; local343 < local34; local343++) {
				@Pc(349) String local349 = Static512.aStringArray36[local343];
				if (local343 < local34 - 1) {
					local349 = local349.substring(0, local349.length() - 4);
				}
				Static173.aClass76_3.method1559(arg1, local349, local61, local175, arg0.anInt6978);
				local175 += Static173.aClass76_3.method1561();
			}
		}
		if (arg0.anInt6954 == -1 && arg0.aString75 == null) {
			return;
		}
		local17 >>= 0x1;
		@Pc(409) Class2_Sub41 local409 = new Class2_Sub41(arg2);
		local409.anInt6581 = local269;
		local409.anInt6585 = local271;
		local409.anInt6584 = local265;
		local409.anInt6591 = local29 - local17;
		local409.anInt6586 = local32 - local17;
		local409.anInt6588 = local267;
		local409.anInt6589 = local29 + local17;
		local409.anInt6587 = local17 + local32;
		Static127.aClass60_40.method1233(local409);
	}

	@OriginalMember(owner = "client!bma", name = "a", descriptor = "(IIIILclient!ss;)V")
	public static void method912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub2_Sub5 arg4) {
		@Pc(4) Class311 local4 = Static582.method8090(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		arg4.anInt10229 = (arg1 << Static260.anInt4053) + Static328.anInt5032;
		arg4.anInt10234 = arg3;
		arg4.anInt10228 = (arg2 << Static260.anInt4053) + Static328.anInt5032;
		local4.aClass4_Sub2_Sub5_1 = arg4;
		@Pc(36) int local36 = Static158.aClass133Array4 == Static685.aClass133Array5 ? 1 : 0;
		if (arg4.method8970()) {
			if (arg4.method8976()) {
				arg4.aClass4_Sub2_25 = Static161.aClass4_Sub2Array1[local36];
				Static161.aClass4_Sub2Array1[local36] = arg4;
				return;
			}
			arg4.aClass4_Sub2_25 = Static594.aClass4_Sub2Array5[local36];
			Static594.aClass4_Sub2Array5[local36] = arg4;
			Static415.aBoolean615 = true;
			return;
		}
		arg4.aClass4_Sub2_25 = Static699.aClass4_Sub2Array6[local36];
		Static699.aClass4_Sub2Array6[local36] = arg4;
	}
}
