import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ad", name = "y", descriptor = "I")
	public static int anInt137;

	@OriginalMember(owner = "client!ad", name = "E", descriptor = "Lclient!vaa;")
	public static Class365 aClass365_1;

	@OriginalMember(owner = "client!ad", name = "I", descriptor = "[I")
	public static int[] anIntArray6;

	@OriginalMember(owner = "client!ad", name = "F", descriptor = "I")
	public static int anInt143 = 0;

	@OriginalMember(owner = "client!ad", name = "i", descriptor = "(I)J")
	public static long method142() {
		return Static409.aClass13_1.method6678();
	}

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "(I)V")
	public static void method143() {
		@Pc(13) int local13 = Static490.aByteArrayArray19.length;
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			if (Static490.aByteArrayArray19[local15] != null) {
				@Pc(23) int local23 = -1;
				for (@Pc(25) int local25 = 0; local25 < Static502.anInt8529; local25++) {
					if (Static249.anIntArray245[local15] == Static643.anIntArray589[local25]) {
						local23 = local25;
						break;
					}
				}
				if (local23 == -1) {
					Static643.anIntArray589[Static502.anInt8529] = Static249.anIntArray245[local15];
					local23 = Static502.anInt8529++;
				}
				@Pc(69) Class5_Sub15 local69 = new Class5_Sub15(Static490.aByteArrayArray19[local15]);
				@Pc(71) int local71 = 0;
				while (Static490.aByteArrayArray19[local15].length > local69.anInt4144 && local71 < 511 && Static386.anInt6720 < 1023) {
					@Pc(90) int local90 = local71++ << 6 | local23;
					@Pc(94) int local94 = local69.method3698();
					@Pc(98) int local98 = local94 >> 14;
					@Pc(104) int local104 = local94 >> 7 & 0x3F;
					@Pc(108) int local108 = local94 & 0x3F;
					@Pc(122) int local122 = (Static249.anIntArray245[local15] >> 8) * 64 + local104 - Static454.anInt7910;
					@Pc(135) int local135 = local108 + (Static249.anIntArray245[local15] & 0xFF) * 64 - Static48.anInt750;
					@Pc(142) Class311 local142 = Static58.aClass230_1.method5297(local69.method3698());
					@Pc(149) Class5_Sub34 local149 = (Class5_Sub34) Static223.aClass335_19.method7766((long) local90);
					if (local149 == null && (local142.aByte107 & 0x1) > 0 && local98 == Static326.anInt5965 && local122 >= 0 && local142.anInt8641 + local122 < Static124.anInt2150 && local135 >= 0 && Static64.anInt1015 > local135 + local142.anInt8641) {
						@Pc(195) Class41_Sub1_Sub1_Sub3_Sub1 local195 = new Class41_Sub1_Sub1_Sub3_Sub1();
						local195.anInt9469 = local90;
						@Pc(203) Class5_Sub34 local203 = new Class5_Sub34(local195);
						Static223.aClass335_19.method7770((long) local90, local203);
						Static278.aClass5_Sub34Array1[Static562.anInt9155++] = local203;
						Static662.anIntArray600[Static386.anInt6720++] = local90;
						local195.anInt9500 = Static421.anInt7434;
						local195.method4716(local142);
						local195.method7928(local195.aClass311_1.anInt8641);
						local195.anInt9474 = local195.aClass311_1.anInt8678 << 3;
						local195.method7925(true, (local195.aClass311_1.aByte103 + 4 & 0x27000007) << 11);
						local195.method4713(local195.method7917(), local122, true, local135, local98);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V")
	public static void method144() {
		@Pc(5) Class281 local5 = null;
		try {
			@Pc(11) Class297 local11 = Static150.aClass202_2.method4733("2");
			while (local11.anInt8459 == 0) {
				Static127.method1985(1L);
			}
			if (local11.anInt8459 == 1) {
				local5 = (Class281) local11.anObject15;
				@Pc(34) byte[] local34 = new byte[(int) local5.method6898()];
				@Pc(47) int local47;
				for (@Pc(36) int local36 = 0; local36 < local34.length; local36 += local47) {
					local47 = local5.method6895(local34, local34.length - local36, local36);
					if (local47 == -1) {
						throw new IOException("EOF");
					}
				}
				Static442.method6607(new Class5_Sub15(local34));
			}
		} catch (@Pc(72) Exception local72) {
		}
		try {
			if (local5 != null) {
				local5.method6893();
			}
		} catch (@Pc(84) Exception local84) {
		}
	}

	@OriginalMember(owner = "client!ad", name = "k", descriptor = "(I)V")
	public static void method145() {
		if (Static612.aClass297_9 == null) {
			return;
		}
		if (Static612.aClass297_9.anInt8459 == 1) {
			Static612.aClass297_9 = null;
			return;
		}
		if (Static612.aClass297_9.anInt8459 == 2) {
			Static362.method5337(2, Static509.aClass202_6, Static193.aString31);
			Static612.aClass297_9 = null;
			return;
		}
	}
}
