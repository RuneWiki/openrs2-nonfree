import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!md", name = "d", descriptor = "I")
	public static int anInt6059 = 0;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!oa;Lclient!gfa;IIIII)V")
	public static void method4911(@OriginalArg(0) Class90 arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static431.anInt7712) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static547.anInt9363) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static20.anInt358 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class133 local62 = Static113.aClass133ArrayArrayArray1[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static205.aClass46Array1[local17].JA(local23, local32) + Static205.aClass46Array1[local17].JA(local23 + 1, local32) + Static205.aClass46Array1[local17].JA(local23, local32 + 1) + Static205.aClass46Array1[local17].JA(local23 + 1, local32 + 1)) / 4 - (Static205.aClass46Array1[arg2].JA(arg3, arg4) + Static205.aClass46Array1[arg2].JA(arg3 + 1, arg4) + Static205.aClass46Array1[arg2].JA(arg3, arg4 + 1) + Static205.aClass46Array1[arg2].JA(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class15_Sub1 local143 = local62.aClass15_Sub1_2;
									@Pc(146) Class15_Sub1 local146 = local62.aClass15_Sub1_1;
									if (local143 != null && local143.method7162()) {
										arg1.method7163((local32 - arg4) * Static113.anInt1928 + (1 - arg6) * Static259.anInt4703, (local23 - arg3) * Static113.anInt1928 + (1 - arg5) * Static259.anInt4703, local143, local140, local1, arg0);
									}
									if (local146 != null && local146.method7162()) {
										arg1.method7163((local32 - arg4) * Static113.anInt1928 + (1 - arg6) * Static259.anInt4703, (local23 - arg3) * Static113.anInt1928 + (1 - arg5) * Static259.anInt4703, local146, local140, local1, arg0);
									}
									for (@Pc(219) Class315 local219 = local62.aClass315_1; local219 != null; local219 = local219.aClass315_3) {
										@Pc(223) Class15_Sub2 local223 = local219.aClass15_Sub2_2;
										if (local223 != null && local223.method7162() && (local23 == local223.aShort116 || local23 == local3) && (local32 == local223.aShort114 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort115 + 1 - local223.aShort116;
											@Pc(260) int local260 = local223.aShort117 + 1 - local223.aShort114;
											arg1.method7163((local223.aShort114 - arg4) * Static113.anInt1928 + (local260 - arg6) * Static259.anInt4703, (local223.aShort116 - arg3) * Static113.anInt1928 + (local252 - arg5) * Static259.anInt4703, local223, local140, local1, arg0);
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

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IBI)Z")
	public static boolean method4912(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method4913(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B)I")
	public static int method4914() {
		@Pc(7) int local7 = Static312.aClass22_32.method356();
		if (local7 < Static562.aClass22Array2.length - 1) {
			Static312.aClass22_32 = Static562.aClass22Array2[local7 + 1];
		}
		return 100;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!oa;IJ)V")
	public static void method4915(@OriginalArg(0) Class90 arg0, @OriginalArg(2) long arg1) {
		Static424.anInt7494 = Static518.anInt8889;
		Static102.anInt1603 = 0;
		Static518.anInt8889 = 0;
		@Pc(20) long local20 = Static416.method5922();
		for (@Pc(25) Class60_Sub4 local25 = (Class60_Sub4) Static357.aClass349_12.method7890(); local25 != null; local25 = (Class60_Sub4) Static357.aClass349_12.method7896()) {
			if (local25.method3589(arg0, arg1)) {
				Static102.anInt1603++;
			}
		}
		if (Static307.aBoolean407 && arg1 % 100L == 0L) {
			System.out.println("Particle system count: " + Static357.aClass349_12.method7895() + ", running: " + Static102.anInt1603 + ". Particles: " + Static518.anInt8889 + ". Time taken: " + (Static416.method5922() - local20) + "ms");
		}
	}
}
