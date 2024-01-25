import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!ew", name = "D", descriptor = "I")
	public static int anInt2809;

	@OriginalMember(owner = "client!ew", name = "F", descriptor = "I")
	public static int anInt2811;

	@OriginalMember(owner = "client!ew", name = "G", descriptor = "I")
	public static int anInt2812 = -1;

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(I[Ljava/lang/String;)V")
	public static void method2574(@OriginalArg(1) String[] arg0) {
		if (arg0.length <= 1) {
			Static337.aString75 = Static337.aString75 + arg0[0];
			Static22.anInt708 += arg0[0].length();
			return;
		}
		for (@Pc(34) int local34 = 0; local34 < arg0.length; local34++) {
			if (arg0[local34].startsWith("pause")) {
				@Pc(53) int local53 = 5;
				try {
					local53 = Integer.parseInt(arg0[local34].substring(6));
				} catch (@Pc(62) Exception local62) {
				}
				Static339.method5160("Pausing for " + local53 + " seconds...");
				Static283.anInt5293 = local34 + 1;
				Static354.aStringArray75 = arg0;
				Static335.aLong157 = Static131.method2268() + (long) (local53 * 1000);
				return;
			}
			Static337.aString75 = arg0[local34];
			Static676.method8729(false);
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(III)Z")
	public static boolean method2575(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(Lclient!ha;Z)V")
	public static void method2576(@OriginalArg(0) Class16 arg0) {
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		if (Static649.aBoolean735) {
			local13 = Static359.method5380();
			local15 = Static265.method7952();
		}
		arg0.KA(local13, local15, local13 + Static654.anInt10064, local15 + 350);
		arg0.aa(local13, local15, Static654.anInt10064, 350, Static416.anInt7045 << 24 | 0x332277, 1);
		Static120.method2177(local13, local13 + Static654.anInt10064, local15, local15 + 350);
		@Pc(60) int local60 = 350 / Static13.anInt163;
		@Pc(69) int local69;
		if (Static275.anInt6800 > 0) {
			local69 = 346 - Static13.anInt163 - 4;
			@Pc(79) int local79 = local60 * local69 / (Static275.anInt6800 + local60 - 1);
			@Pc(81) int local81 = 4;
			if (Static275.anInt6800 > 1) {
				local81 = (Static275.anInt6800 - Static392.anInt10294 - 1) * (local69 - local79) / (Static275.anInt6800 - 1) + 4;
			}
			arg0.aa(Static654.anInt10064 + local13 - 16, local81 + local15, 12, local79, Static416.anInt7045 << 24 | 0x332277, 2);
			for (@Pc(122) int local122 = Static392.anInt10294; local122 < Static392.anInt10294 + local60 && local122 < Static275.anInt6800; local122++) {
				@Pc(131) String[] local131 = Static325.method5062(Static475.aStringArray64[local122], '\b');
				@Pc(140) int local140 = (Static654.anInt10064 - 16 - 8) / local131.length;
				for (@Pc(142) int local142 = 0; local142 < local131.length; local142++) {
					@Pc(150) int local150 = local140 * local142 + 8;
					arg0.KA(local150 + local13, local15, local150 + local13 + local140 - 8, local15 + 350);
					Static277.aClass69_9.method7451(local15 + 350 - Static117.aClass202_3.anInt5456 - Static366.anInt6485 - Static13.anInt163 * (-Static392.anInt10294 + local122) - 2, -1, -16777216, Static140.method2430(local131[local142]), local13 + local150);
				}
			}
		}
		Static157.aClass69_2.method7458(local15 + 350 - 20, local13 - -Static654.anInt10064 + -25, "Build: 642", -16777216, -1);
		arg0.KA(local13, local15, local13 + Static654.anInt10064, local15 + 350);
		arg0.method8153(Static654.anInt10064, -1, local15 + 350 - Static366.anInt6485, local13);
		Static243.aClass69_5.method7451(local15 + 350 - Static17.aClass202_1.anInt5456 - 1, -1, -16777216, "--> " + Static140.method2430(Static337.aString75), local13 + 10);
		if (!Static474.aBoolean613) {
			return;
		}
		local69 = -1;
		if (Static621.anInt9665 % 30 > 15) {
			local69 = 16777215;
		}
		arg0.method8151(local13 + Static17.aClass202_1.method4632("--> " + Static140.method2430(Static337.aString75).substring(0, Static22.anInt708)) + 10, 12, local69, local15 + 350 - Static17.aClass202_1.anInt5456 - 11);
	}
}
