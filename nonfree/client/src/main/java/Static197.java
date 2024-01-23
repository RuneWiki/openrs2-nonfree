import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
	public static int anInt5226;

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
	public static int anInt5232;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
	public static void method4292() {
		if (Static179.aFloat48 < 128.0F) {
			Static179.aFloat48 = 128.0F;
		}
		if (Static179.aFloat48 > 383.0F) {
			Static179.aFloat48 = 383.0F;
		}
		@Pc(21) int local21 = Static308.anInt6040 >> 7;
		@Pc(25) int local25 = Static2.anInt22 >> 7;
		while (Static84.aFloat21 >= 2048.0F) {
			Static84.aFloat21 -= 2048.0F;
		}
		while (Static84.aFloat21 < 0.0F) {
			Static84.aFloat21 += 2048.0F;
		}
		@Pc(51) int local51 = Static122.method2036(Static2.anInt22, Static308.anInt6040, Static99.anInt1826);
		@Pc(53) int local53 = 0;
		@Pc(78) int local78;
		if (local21 > 3 && local25 > 3 && local21 < 100 && local25 < 100) {
			for (local78 = local21 - 4; local78 <= local21 + 4; local78++) {
				for (@Pc(87) int local87 = local25 - 4; local87 <= local25 + 4; local87++) {
					@Pc(98) int local98 = Static99.anInt1826;
					if (local98 < 3 && (Static41.aByteArrayArrayArray2[1][local78][local87] & 0x2) == 2) {
						local98++;
					}
					@Pc(138) int local138 = local51 + (Static48.aByteArrayArrayArray3[local98][local78][local87] & 0xFF) * 8 - Static256.anIntArrayArrayArray14[local98][local78][local87];
					if (local138 > local53) {
						local53 = local138;
					}
				}
			}
		}
		local78 = local53 * 192;
		if (local78 > 98048) {
			local78 = 98048;
		}
		if (local78 < 32768) {
			local78 = 32768;
		}
		if (Static152.anInt2874 < local78) {
			Static152.anInt2874 += (local78 - Static152.anInt2874) / 24;
		} else if (local78 < Static152.anInt2874) {
			Static152.anInt2874 += (local78 - Static152.anInt2874) / 80;
		}
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
	public static void method4296() {
		if (Static304.anInt5996 == 0) {
			return;
		}
		try {
			if (++Static301.anInt5946 > 1500) {
				if (Static150.aClass139_3 != null) {
					Static150.aClass139_3.method3559();
					Static150.aClass139_3 = null;
				}
				if (Static51.anInt988 >= 1) {
					Static98.anInt1803 = -5;
					Static304.anInt5996 = 0;
					return;
				}
				Static304.anInt5996 = 1;
				Static301.anInt5946 = 0;
				Static51.anInt988++;
				if (Static311.anInt6114 == Static94.anInt1707) {
					Static311.anInt6114 = Static239.anInt4856;
				} else {
					Static311.anInt6114 = Static94.anInt1707;
				}
			}
			if (Static304.anInt5996 == 1) {
				Static203.aClass178_2 = Static274.aClass176_4.method4521(Static109.aString107, Static311.anInt6114);
				Static304.anInt5996 = 2;
			}
			@Pc(134) int local134;
			if (Static304.anInt5996 == 2) {
				if (Static203.aClass178_2.anInt5649 == 2) {
					throw new IOException();
				}
				if (Static203.aClass178_2.anInt5649 != 1) {
					return;
				}
				Static150.aClass139_3 = new Class139((Socket) Static203.aClass178_2.anObject6, Static274.aClass176_4);
				Static203.aClass178_2 = null;
				Static150.aClass139_3.method3556(Static215.aClass3_Sub26_Sub1_2.aByteArray64, Static215.aClass3_Sub26_Sub1_2.anInt4615);
				if (Static32.aClass105_1 != null) {
					Static32.aClass105_1.method2774();
				}
				if (Static187.aClass105_2 != null) {
					Static187.aClass105_2.method2774();
				}
				local134 = Static150.aClass139_3.method3553();
				if (Static32.aClass105_1 != null) {
					Static32.aClass105_1.method2774();
				}
				if (Static187.aClass105_2 != null) {
					Static187.aClass105_2.method2774();
				}
				if (local134 != 101) {
					Static304.anInt5996 = 0;
					Static98.anInt1803 = local134;
					Static150.aClass139_3.method3559();
					Static150.aClass139_3 = null;
					return;
				}
				Static304.anInt5996 = 3;
			}
			if (Static304.anInt5996 == 3) {
				if (Static150.aClass139_3.method3554() < 2) {
					return;
				}
				local134 = Static150.aClass139_3.method3553() << 8 | Static150.aClass139_3.method3553();
				Static155.method2592(local134);
				if (Static203.anInt3980 == -1) {
					Static98.anInt1803 = 6;
					Static304.anInt5996 = 0;
					Static150.aClass139_3.method3559();
					Static150.aClass139_3 = null;
					return;
				}
				Static304.anInt5996 = 0;
				Static150.aClass139_3.method3559();
				Static150.aClass139_3 = null;
				Static83.method1272();
				return;
			}
		} catch (@Pc(216) IOException local216) {
			if (Static150.aClass139_3 != null) {
				Static150.aClass139_3.method3559();
				Static150.aClass139_3 = null;
			}
			if (Static51.anInt988 < 1) {
				Static51.anInt988++;
				Static301.anInt5946 = 0;
				if (Static311.anInt6114 == Static94.anInt1707) {
					Static311.anInt6114 = Static239.anInt4856;
				} else {
					Static311.anInt6114 = Static94.anInt1707;
				}
				Static304.anInt5996 = 1;
			} else {
				Static304.anInt5996 = 0;
				Static98.anInt1803 = -4;
			}
		}
	}
}
