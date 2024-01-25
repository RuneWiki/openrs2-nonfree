import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!gh", name = "B", descriptor = "Lclient!ud;")
	public static Class225 aClass225_2;

	@OriginalMember(owner = "client!gh", name = "F", descriptor = "Lclient!cs;")
	public static Class45 aClass45_1;

	@OriginalMember(owner = "client!gh", name = "I", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame3;

	@OriginalMember(owner = "client!gh", name = "J", descriptor = "I")
	public static int anInt2550;

	@OriginalMember(owner = "client!gh", name = "y", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_33 = new Class183(78, 3);

	@OriginalMember(owner = "client!gh", name = "D", descriptor = "Lclient!ss;")
	public static final Class213 aClass213_8 = new Class213(4, 5);

	@OriginalMember(owner = "client!gh", name = "G", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_64 = new Class208(23, -2);

	@OriginalMember(owner = "client!gh", name = "K", descriptor = "Lclient!wb;")
	public static final Class243 aClass243_9 = new Class243(16);

	@OriginalMember(owner = "client!gh", name = "L", descriptor = "[I")
	public static final int[] anIntArray205 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method2052(@OriginalArg(1) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			local7 *= 37L;
			@Pc(22) char local22 = arg0.charAt(local12);
			if (local22 >= 'A' && local22 <= 'Z') {
				local7 += local22 + 1 - 65;
			} else if (local22 >= 'a' && local22 <= 'z') {
				local7 += local22 + 1 - 97;
			} else if (local22 >= '0' && local22 <= '9') {
				local7 += local22 + 27 - 48;
			}
			if (local7 >= 177917621779460413L) {
				break;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)V")
	public static void method2054() {
		for (@Pc(15) int local15 = 0; local15 < Static277.anInt5160; local15++) {
			@Pc(21) int local21 = Static321.anIntArray511[local15]--;
			if (Static321.anIntArray511[local15] >= -10) {
				@Pc(100) Class80 local100 = Static349.aClass80Array1[local15];
				if (local100 == null) {
					local100 = Static393.method1856(Static141.aClass83_59, Static104.anIntArray191[local15], 0);
					if (local100 == null) {
						continue;
					}
					Static321.anIntArray511[local15] += local100.method1859();
					Static349.aClass80Array1[local15] = local100;
				}
				if (Static321.anIntArray511[local15] < 0) {
					@Pc(146) int local146;
					if (Static283.anIntArray454[local15] == 0) {
						local146 = Static135.anInt2943 * Static55.anIntArray87[local15] >> 8;
					} else {
						@Pc(140) int local140 = Static283.anIntArray454[local15] >> 24 & 0x3;
						if (local140 == Static182.aClass1_Sub2_Sub1_Sub1_1.aByte73) {
							@Pc(156) int local156 = (Static283.anIntArray454[local15] & 0xFF) * 128;
							@Pc(164) int local164 = Static283.anIntArray454[local15] >> 16 & 0xFF;
							@Pc(174) int local174 = local164 * 128 + 64 - Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6800;
							if (local174 < 0) {
								local174 = -local174;
							}
							@Pc(190) int local190 = Static283.anIntArray454[local15] >> 8 & 0xFF;
							@Pc(200) int local200 = local190 * 128 + 64 - Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6798;
							if (local200 < 0) {
								local200 = -local200;
							}
							@Pc(211) int local211 = local174 + local200 - 128;
							if (local156 < local211) {
								Static321.anIntArray511[local15] = -100;
								continue;
							}
							if (local211 < 0) {
								local211 = 0;
							}
							local146 = Static55.anIntArray87[local15] * Static107.anInt2388 * (local156 - local211) / local156 >> 8;
						} else {
							local146 = 0;
						}
					}
					if (local146 > 0) {
						@Pc(260) Class2_Sub20_Sub1 local260 = local100.method1857().method2918(Static322.aClass113_1);
						@Pc(265) Class2_Sub11_Sub2 local265 = Static397.method2997(local260, local146);
						local265.method2991(Static145.anIntArray459[local15] - 1);
						Static192.aClass2_Sub11_Sub4_1.method4878(local265);
					}
					Static321.anIntArray511[local15] = -100;
				}
			} else {
				Static277.anInt5160--;
				for (@Pc(35) int local35 = local15; local35 < Static277.anInt5160; local35++) {
					Static104.anIntArray191[local35] = Static104.anIntArray191[local35 + 1];
					Static349.aClass80Array1[local35] = Static349.aClass80Array1[local35 + 1];
					Static145.anIntArray459[local35] = Static145.anIntArray459[local35 + 1];
					Static321.anIntArray511[local35] = Static321.anIntArray511[local35 + 1];
					Static283.anIntArray454[local35] = Static283.anIntArray454[local35 + 1];
					Static55.anIntArray87[local35] = Static55.anIntArray87[local35 + 1];
				}
				local15--;
			}
		}
		if (Static361.aBoolean293 && !Static176.method3281()) {
			if (Static228.anInt4592 != 0 && Static42.anInt732 != -1) {
				Static126.method2209(Static279.aClass83_95, Static228.anInt4592, Static42.anInt732);
			}
			Static361.aBoolean293 = false;
		} else if (Static228.anInt4592 != 0 && Static42.anInt732 != -1 && !Static176.method3281()) {
			Static77.method1332(Static125.aClass183_34);
			Static76.aClass2_Sub24_Sub2_7.method5734(Static42.anInt732);
			Static42.anInt732 = -1;
		}
	}
}
