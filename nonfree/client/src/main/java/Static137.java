import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!oe", name = "L", descriptor = "Lclient!dj;")
	public static Class23_Sub1 aClass23_Sub1_18;

	@OriginalMember(owner = "client!oe", name = "O", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1083 = Static161.method2452("Fertigkeit)2");

	@OriginalMember(owner = "client!oe", name = "Q", descriptor = "I")
	public static int anInt2871 = 0;

	@OriginalMember(owner = "client!oe", name = "T", descriptor = "I")
	public static final int anInt2873 = 7759444;

	@OriginalMember(owner = "client!oe", name = "V", descriptor = "I")
	public static int anInt2874 = 0;

	@OriginalMember(owner = "client!oe", name = "Y", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1084 = Static161.method2452("::autoshadow on");

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!wa;I)V")
	public static void method2135(@OriginalArg(0) Class23 arg0) {
		Static37.aClass23_26 = arg0;
		Static98.anInt2094 = Static37.aClass23_26.method752(16);
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(III)V")
	public static void method2137() {
		for (@Pc(1) int local1 = 0; local1 < Static83.anInt1853; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static210.anInt919; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static31.anInt671; local7++) {
					@Pc(16) Class5_Sub3 local16 = Static157.aClass5_Sub3ArrayArrayArray2[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class86 local21 = local16.aClass86_1;
						if (local21 != null && local21.aClass1_9.method2448()) {
							Static168.method2557(local21.aClass1_9, local1, local4, local7, 1, 1);
							if (local21.aClass1_10 != null && local21.aClass1_10.method2448()) {
								Static168.method2557(local21.aClass1_10, local1, local4, local7, 1, 1);
								local21.aClass1_9.method2442(local21.aClass1_10, 0, 0, 0, false);
								local21.aClass1_10 = local21.aClass1_10.method2444();
							}
							local21.aClass1_9 = local21.aClass1_9.method2444();
						}
						for (@Pc(77) int local77 = 0; local77 < local16.anInt333; local77++) {
							@Pc(83) Class43 local83 = local16.aClass43Array1[local77];
							if (local83 != null && local83.aClass1_4.method2448()) {
								Static168.method2557(local83.aClass1_4, local1, local4, local7, local83.anInt1821 + 1 - local83.anInt1811, local83.anInt1810 - local83.anInt1816 + 1);
								local83.aClass1_4 = local83.aClass1_4.method2444();
							}
						}
						@Pc(125) Class73 local125 = local16.aClass73_1;
						if (local125 != null && local125.aClass1_8.method2448()) {
							Static16.method277(local125.aClass1_8, local1, local4, local7);
							local125.aClass1_8 = local125.aClass1_8.method2444();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(II)I")
	public static int method2138(@OriginalArg(0) int arg0) {
		@Pc(17) double local17 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(26) double local26 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(35) double local35 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(37) double local37 = local35;
		@Pc(39) double local39 = local35;
		if (local35 < local26) {
			local37 = local26;
		}
		@Pc(47) double local47 = 0.0D;
		if (local37 < local17) {
			local37 = local17;
		}
		@Pc(55) double local55 = 0.0D;
		if (local26 < local35) {
			local39 = local26;
		}
		if (local17 < local39) {
			local39 = local17;
		}
		@Pc(73) double local73 = (local39 + local37) / 2.0D;
		if (local39 != local37) {
			if (local73 < 0.5D) {
				local55 = (local37 - local39) / (local37 + local39);
			}
			if (local37 == local35) {
				local47 = (local26 - local17) / (local37 - local39);
			} else if (local26 == local37) {
				local47 = (local17 - local35) / (local37 - local39) + 2.0D;
			} else if (local17 == local37) {
				local47 = (local35 - local26) / (local37 - local39) + 4.0D;
			}
			if (local73 >= 0.5D) {
				local55 = (local37 - local39) / (2.0D - local37 - local39);
			}
		}
		local47 /= 6.0D;
		@Pc(161) int local161 = (int) (local47 * 256.0D);
		@Pc(166) int local166 = (int) (local73 * 256.0D);
		if (local166 < 0) {
			local166 = 0;
		} else if (local166 > 255) {
			local166 = 255;
		}
		@Pc(187) int local187 = (int) (local55 * 256.0D);
		if (local187 < 0) {
			local187 = 0;
		} else if (local187 > 255) {
			local187 = 255;
		}
		if (local166 > 243) {
			local187 >>= 0x4;
		} else if (local166 > 217) {
			local187 >>= 0x3;
		} else if (local166 > 192) {
			local187 >>= 0x2;
		} else if (local166 > 179) {
			local187 >>= 0x1;
		}
		return (local161 >> 2 << 10) + (local187 >> 5 << 7) + (local166 >> 1);
	}
}
