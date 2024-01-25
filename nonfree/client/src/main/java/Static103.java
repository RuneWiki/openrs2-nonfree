import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!dc", name = "q", descriptor = "Lclient!fk;")
	public static Class114 aClass114_1;

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
	public static int anInt1658;

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_22 = new Class286(30, 15);

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "J")
	public static long aLong79 = 0L;

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
	public static int anInt1659 = -1;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
	public static void method1356() {
		Static167.aClass400_1.method9230();
		Static167.aClass400_1.aClass186_194 = null;
		Static49.anInt834 = 0;
		Static167.aClass400_1.aClass3_Sub28_Sub2_2.anInt6241 = 0;
		Static167.aClass400_1.aClass186_195 = null;
		Static167.aClass400_1.anInt11061 = 0;
		Static167.aClass400_1.anInt11055 = 0;
		Static167.aClass400_1.aClass186_196 = null;
		Static167.aClass400_1.aClass186_197 = null;
		Static499.method7199();
		Static24.method9441();
		for (@Pc(38) int local38 = 0; local38 < 2048; local38++) {
			Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1[local38] = null;
		}
		Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2 = null;
		for (@Pc(54) int local54 = 0; local54 < Static32.anInt518; local54++) {
			@Pc(63) Class19_Sub1_Sub3_Sub2_Sub1 local63 = Static95.aClass3_Sub13Array1[local54].aClass19_Sub1_Sub3_Sub2_Sub1_2;
			if (local63 != null) {
				local63.anInt7780 = -1;
			}
		}
		Static626.method8480();
		Static573.anInt9429 = -1;
		Static283.anInt5140 = -1;
		Static175.anInt10579 = 1;
		Static638.method8657(11);
		for (@Pc(96) int local96 = 0; local96 < 100; local96++) {
			Static195.aBooleanArray17[local96] = true;
		}
		Static281.method4258();
		Static78.aLong62 = 0L;
		Static647.aClass3_Sub46_2 = null;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!faa;Lclient!ha;ILclient!bs;)V")
	public static void method1357(@OriginalArg(0) Class105 arg0, @OriginalArg(1) Class67 arg1, @OriginalArg(3) Class3_Sub12 arg2) {
		@Pc(10) Class9 local10 = arg0.method2656(arg1);
		if (local10 == null) {
			return;
		}
		@Pc(17) int local17 = local10.method8602();
		if (local17 < local10.method8611()) {
			local17 = local10.method8611();
		}
		@Pc(29) int local29 = arg2.anInt948;
		@Pc(39) int local39 = arg2.anInt949;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = 0;
		@Pc(59) int local59;
		@Pc(86) int local86;
		if (arg0.aString57 != null) {
			local41 = Static48.aClass330_1.method7912(arg0.aString57, (int[]) null, Static503.aStringArray32, (Class9[]) null);
			for (local59 = 0; local59 < local41; local59++) {
				@Pc(65) String local65 = Static503.aStringArray32[local59];
				if (local41 - 1 > local59) {
					local65 = local65.substring(0, local65.length() - 4);
				}
				local86 = Static11.aClass38_1.method747(local65);
				if (local43 < local86) {
					local43 = local86;
				}
			}
			local45 = Static11.aClass38_1.method745() * local41 + Static11.aClass38_1.method746() / 2;
		}
		local59 = local17 / 2 + arg2.anInt948;
		if (Static654.anInt8145 + local17 > local29) {
			local29 = Static654.anInt8145;
			local59 = local17 / 2 + Static654.anInt8145 + local43 / 2 + 5 + 10;
		} else if (Static654.anInt8149 - local17 < local29) {
			local59 = Static654.anInt8149 - local43 / 2 - local17 / 2 - 5 - 10;
			local29 = Static654.anInt8149 - local17;
		}
		@Pc(178) int local178 = arg2.anInt949;
		if (local17 + Static654.anInt8152 > local39) {
			local178 = Static654.anInt8152 + local17 / 2 + 10;
			local39 = Static654.anInt8152;
		} else if (local39 > Static654.anInt8147 - local17) {
			local39 = Static654.anInt8147 - local17;
			local178 = Static654.anInt8147 - local45 - local17 / 2 - 10;
		}
		local86 = (int) (Math.atan2((double) (local29 - arg2.anInt948), (double) (local39 - arg2.anInt949)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method8606((float) local29 + (float) local17 / 2.0F, (float) local39 + (float) local17 / 2.0F, 4096, local86);
		@Pc(265) int local265 = -2;
		@Pc(267) int local267 = -2;
		@Pc(269) int local269 = -2;
		@Pc(271) int local271 = -2;
		if (arg0.aString57 != null) {
			local265 = local59 - local43 / 2 - 5;
			local267 = local178;
			local271 = local41 * Static11.aClass38_1.method745() + local178 + 3;
			local269 = local43 + local265 + 10;
			if (arg0.anInt3106 != 0) {
				arg1.method7696(local265, local271 - local178, -local265 + local269, local178, arg0.anInt3106);
			}
			if (arg0.anInt3083 != 0) {
				arg1.method7647(arg0.anInt3083, local265, local178, local271 - local178, -local265 + local269);
			}
			for (@Pc(345) int local345 = 0; local345 < local41; local345++) {
				@Pc(351) String local351 = Static503.aStringArray32[local345];
				if (local41 - 1 > local345) {
					local351 = local351.substring(0, local351.length() - 4);
				}
				Static11.aClass38_1.method744(arg1, local351, local59, local178, arg0.anInt3076);
				local178 += Static11.aClass38_1.method745();
			}
		}
		if (arg0.anInt3103 == -1 && arg0.aString57 == null) {
			return;
		}
		@Pc(403) Class3_Sub45 local403 = new Class3_Sub45(arg2);
		local17 >>= 0x1;
		local403.anInt8646 = local271;
		local403.anInt8641 = local267;
		local403.anInt8642 = local39 - local17;
		local403.anInt8647 = local29 - local17;
		local403.anInt8640 = local39 + local17;
		local403.anInt8638 = local269;
		local403.anInt8643 = local29 + local17;
		local403.anInt8645 = local265;
		Static335.aClass357_28.method8401(local403);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
	public static void method1360() {
		if (Static258.aClass67_8 != null) {
			Static258.aClass67_8.method7681();
			Static224.aClass44_16 = null;
			Static258.aClass67_8 = null;
		}
	}
}
