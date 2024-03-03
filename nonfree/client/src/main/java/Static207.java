import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!ms", name = "t", descriptor = "I")
	public static int anInt3944;

	@OriginalMember(owner = "client!ms", name = "x", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IB)Z", line = 3)
	public static boolean method3917(@OriginalArg(0) int arg0) {
		if (Static120.aBooleanArray21[arg0]) {
			return true;
		} else if (Static260.aClass197_68.method5072(arg0)) {
			@Pc(23) int local23 = Static260.aClass197_68.method5082(arg0);
			if (local23 == 0) {
				Static120.aBooleanArray21[arg0] = true;
				return true;
			}
			if (Static25.aClass161ArrayArray1[arg0] == null) {
				Static25.aClass161ArrayArray1[arg0] = new Class161[local23];
			}
			for (@Pc(45) int local45 = 0; local45 < local23; local45++) {
				if (Static25.aClass161ArrayArray1[arg0][local45] == null) {
					@Pc(59) byte[] local59 = Static260.aClass197_68.method5090(local45, arg0);
					if (local59 != null) {
						@Pc(71) Class161 local71 = Static25.aClass161ArrayArray1[arg0][local45] = new Class161();
						local71.anInt4310 = local45 + (arg0 << 16);
						if (local59[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local71.method4107(new Class2_Sub4(local59));
					}
				}
			}
			Static120.aBooleanArray21[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(I)V", line = 77)
	public static void method3918() {
		@Pc(9) int local9 = Static288.anInt5798 * 128 + 64;
		@Pc(15) int local15 = Static19.anInt535 * 128 + 64;
		@Pc(23) int local23 = Static360.method6033(local9, local15, Static330.anInt6573) - Static168.anInt3400;
		if (Static334.anInt6689 >= 100) {
			Static197.anInt3773 = Static19.anInt535 * 128 + 64;
			Static127.anInt6765 = Static288.anInt5798 * 128 + 64;
			Static95.anInt3588 = Static360.method6033(Static127.anInt6765, Static197.anInt3773, Static330.anInt6573) - Static168.anInt3400;
		} else {
			if (Static127.anInt6765 < local9) {
				Static127.anInt6765 += Static323.anInt6434 + (local9 - Static127.anInt6765) * Static334.anInt6689 / 1000;
				if (local9 < Static127.anInt6765) {
					Static127.anInt6765 = local9;
				}
			}
			if (local23 > Static95.anInt3588) {
				Static95.anInt3588 += (local23 - Static95.anInt3588) * Static334.anInt6689 / 1000 + Static323.anInt6434;
				if (Static95.anInt3588 > local23) {
					Static95.anInt3588 = local23;
				}
			}
			if (local9 < Static127.anInt6765) {
				Static127.anInt6765 -= Static334.anInt6689 * (Static127.anInt6765 - local9) / 1000 + Static323.anInt6434;
				if (local9 > Static127.anInt6765) {
					Static127.anInt6765 = local9;
				}
			}
			if (Static197.anInt3773 < local15) {
				Static197.anInt3773 += Static323.anInt6434 + Static334.anInt6689 * (local15 - Static197.anInt3773) / 1000;
				if (Static197.anInt3773 > local15) {
					Static197.anInt3773 = local15;
				}
			}
			if (local23 < Static95.anInt3588) {
				Static95.anInt3588 -= Static323.anInt6434 + (Static95.anInt3588 - local23) * Static334.anInt6689 / 1000;
				if (local23 > Static95.anInt3588) {
					Static95.anInt3588 = local23;
				}
			}
			if (local15 < Static197.anInt3773) {
				Static197.anInt3773 -= Static323.anInt6434 + (Static197.anInt3773 - local15) * Static334.anInt6689 / 1000;
				if (Static197.anInt3773 < local15) {
					Static197.anInt3773 = local15;
				}
			}
		}
		local9 = Static234.anInt4689 * 128 + 64;
		local15 = Static116.anInt2417 * 128 + 64;
		local23 = Static360.method6033(local9, local15, Static330.anInt6573) - Static53.anInt1462;
		@Pc(231) int local231 = local9 - Static127.anInt6765;
		@Pc(235) int local235 = local23 - Static95.anInt3588;
		@Pc(239) int local239 = local15 - Static197.anInt3773;
		@Pc(251) int local251 = (int) Math.sqrt((double) (local231 * local231 + local239 * local239));
		@Pc(262) int local262 = (int) (Math.atan2((double) local235, (double) local251) * 2607.5945876176133D) & 0x3FFF;
		@Pc(273) int local273 = (int) (Math.atan2((double) local231, (double) local239) * -2607.5945876176133D) & 0x3FFF;
		if (local262 < 1024) {
			local262 = 1024;
		}
		if (local262 > 3072) {
			local262 = 3072;
		}
		if (local262 > Static244.anInt4847) {
			Static244.anInt4847 += Static219.anInt4302 + Static32.anInt4456 * (local262 - Static244.anInt4847 >> 3) / 1000 << 3;
			if (local262 < Static244.anInt4847) {
				Static244.anInt4847 = local262;
			}
		}
		if (local262 < Static244.anInt4847) {
			Static244.anInt4847 -= Static219.anInt4302 + (Static244.anInt4847 - local262 >> 3) * Static32.anInt4456 / 1000 << 3;
			if (Static244.anInt4847 < local262) {
				Static244.anInt4847 = local262;
			}
		}
		@Pc(347) int local347 = local273 - Static4.anInt87;
		if (local347 > 8192) {
			local347 -= 16384;
		}
		if (local347 < -8192) {
			local347 += 16384;
		}
		local347 >>= 0x3;
		if (local347 > 0) {
			Static4.anInt87 += Static32.anInt4456 * local347 / 1000 + Static219.anInt4302 << 3;
			Static4.anInt87 &= 0x3FFF;
		}
		if (local347 < 0) {
			Static4.anInt87 -= Static219.anInt4302 + -local347 * Static32.anInt4456 / 1000 << 3;
			Static4.anInt87 &= 0x3FFF;
		}
		@Pc(410) int local410 = local273 - Static4.anInt87;
		if (local410 > 8192) {
			local410 -= 16384;
		}
		if (local410 < -8192) {
			local410 += 16384;
		}
		if (local410 < 0 && local347 > 0 || local410 > 0 && local347 < 0) {
			Static4.anInt87 = local273;
		}
		Static319.anInt5645 = 0;
	}
}
