import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!fr", name = "u", descriptor = "Lclient!pw;")
	public static final Class261 aClass261_3 = new Class261("", 17);

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "([BB)Lclient!xa;")
	public static Class58 method2820(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(21) Image local21 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(26) MediaTracker local26 = new MediaTracker(Static111.aClient1);
				local26.addImage(local21, 0);
				local26.waitForAll();
				@Pc(36) int local36 = local21.getWidth(Static111.aClient1);
				@Pc(40) int local40 = local21.getHeight(Static111.aClient1);
				if (!local26.isErrorAny() && local36 >= 0 && local40 >= 0) {
					@Pc(57) int[] local57 = new int[local40 * local36];
					@Pc(69) PixelGrabber local69 = new PixelGrabber(local21, 0, 0, local36, local40, local57, 0, local36);
					local69.grabPixels();
					return Static240.aClass14_7.method6863(local57, local36, local36, local40);
				}
				throw new RuntimeException("");
			} catch (@Pc(81) InterruptedException local81) {
			}
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(ZLclient!wv;Z)V")
	public static void method2822(@OriginalArg(1) Class4_Sub1_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) Class118 local9 = arg0.method5891();
		if (arg0.anInt7132 == 0) {
			Static72.anInt1522 = 0;
			Static135.anInt3010 = -1;
			arg0.anInt7134 = 0;
			return;
		}
		if (arg0.anInt7085 != -1 && arg0.anInt7107 == 0) {
			@Pc(37) Class57 local37 = Static78.aClass298_2.method6521(arg0.anInt7085);
			if (arg0.anInt7133 > 0 && local37.anInt1531 == 0) {
				Static72.anInt1522 = 0;
				arg0.anInt7134++;
				Static135.anInt3010 = -1;
				return;
			}
			if (arg0.anInt7133 <= 0 && local37.anInt1541 == 0) {
				Static72.anInt1522 = 0;
				Static135.anInt3010 = -1;
				arg0.anInt7134++;
				return;
			}
		}
		@Pc(102) Class57 local102;
		@Pc(89) Class10 local89;
		if (arg0.anInt7069 != -1 && Static312.anInt5688 >= arg0.anInt7095) {
			local89 = Static289.aClass66_7.method1652(arg0.anInt7069);
			if (local89.aBoolean21 && local89.anInt334 != -1) {
				local102 = Static78.aClass298_2.method6521(local89.anInt334);
				if (arg0.anInt7133 > 0 && local102.anInt1531 == 0) {
					Static135.anInt3010 = -1;
					arg0.anInt7134++;
					Static72.anInt1522 = 0;
					return;
				}
				if (arg0.anInt7133 <= 0 && local102.anInt1541 == 0) {
					Static72.anInt1522 = 0;
					Static135.anInt3010 = -1;
					arg0.anInt7134++;
					return;
				}
			}
		}
		if (arg0.anInt7069 != -1 && Static312.anInt5688 >= arg0.anInt7095) {
			local89 = Static289.aClass66_7.method1652(arg0.anInt7069);
			if (local89.aBoolean21 && local89.anInt334 != -1) {
				local102 = Static78.aClass298_2.method6521(local89.anInt334);
				if (arg0.anInt7133 > 0 && local102.anInt1531 == 0) {
					Static72.anInt1522 = 0;
					arg0.anInt7134++;
					Static135.anInt3010 = -1;
					return;
				}
				if (arg0.anInt7133 <= 0 && local102.anInt1541 == 0) {
					Static135.anInt3010 = -1;
					arg0.anInt7134++;
					Static72.anInt1522 = 0;
					return;
				}
			}
		}
		@Pc(212) int local212 = arg0.anInt9542;
		@Pc(215) int local215 = arg0.anInt9540;
		@Pc(236) int local236 = arg0.anIntArray521[arg0.anInt7132 - 1] * 512 + arg0.method5892() * 256;
		@Pc(253) int local253 = arg0.anIntArray522[arg0.anInt7132 - 1] * 512 + arg0.method5892() * 256;
		if (local212 >= local236) {
			if (local212 <= local236) {
				if (local215 < local253) {
					arg0.method5909(8192);
				} else if (local253 < local215) {
					arg0.method5909(0);
				}
			} else if (local253 > local215) {
				arg0.method5909(6144);
			} else if (local215 > local253) {
				arg0.method5909(2048);
			} else {
				arg0.method5909(4096);
			}
		} else if (local253 > local215) {
			arg0.method5909(10240);
		} else if (local253 < local215) {
			arg0.method5909(14336);
		} else {
			arg0.method5909(12288);
		}
		@Pc(339) byte local339 = arg0.aByteArray90[arg0.anInt7132 - 1];
		if (!arg1 && (local236 - local212 > 1024 || local236 - local212 < -1024 || local253 - local215 > 1024 || local253 - local215 < -1024)) {
			arg0.anInt9542 = local236;
			arg0.anInt9540 = local253;
			arg0.method5903(false, arg0.anInt7055);
			if (arg0.anInt7133 > 0) {
				arg0.anInt7133--;
			}
			Static72.anInt1522 = 0;
			Static135.anInt3010 = -1;
			arg0.anInt7132--;
			return;
		}
		@Pc(399) int local399 = 16;
		@Pc(401) boolean local401 = true;
		if (arg0 instanceof Class4_Sub1_Sub1_Sub1) {
			local401 = ((Class4_Sub1_Sub1_Sub1) arg0).aClass273_1.aBoolean514;
		}
		@Pc(419) int local419;
		if (local401) {
			local419 = arg0.anInt7055 - arg0.aClass354_7.anInt9527;
			if (local419 != 0 && arg0.anInt7123 == -1 && arg0.anInt7114 != 0) {
				local399 = 8;
			}
			if (!arg1 && arg0.anInt7132 > 2) {
				local399 = 24;
			}
			if (!arg1 && arg0.anInt7132 > 3) {
				local399 = 32;
			}
		} else {
			if (!arg1 && arg0.anInt7132 > 1) {
				local399 = 24;
			}
			if (!arg1 && arg0.anInt7132 > 2) {
				local399 = 32;
			}
		}
		if (arg0.anInt7134 > 0 && arg0.anInt7132 > 1) {
			arg0.anInt7134--;
			local399 = 32;
		}
		if (local339 == 2) {
			local399 <<= 0x1;
		} else if (local339 == 0) {
			local399 >>= 0x1;
		}
		if (local9.anInt3589 != -1) {
			local399 <<= 0x9;
			if (arg0.anInt7132 == 1) {
				local419 = arg0.anInt7135 * arg0.anInt7135;
				@Pc(600) int local600 = (local236 >= arg0.anInt9542 ? local236 - arg0.anInt9542 : -local236 + arg0.anInt9542) << 9;
				@Pc(622) int local622 = (local253 < arg0.anInt9540 ? arg0.anInt9540 - local253 : -arg0.anInt9540 + local253) << 9;
				@Pc(633) int local633 = local622 >= local600 ? local622 : local600;
				@Pc(640) int local640 = local633 * 2 * local9.anInt3589;
				if (local419 > local640) {
					arg0.anInt7135 /= 2;
				} else if (local419 / 2 > local633) {
					arg0.anInt7135 -= local9.anInt3589;
					if (arg0.anInt7135 < 0) {
						arg0.anInt7135 = 0;
					}
				} else if (arg0.anInt7135 < local399) {
					arg0.anInt7135 += local9.anInt3589;
					if (arg0.anInt7135 > local399) {
						arg0.anInt7135 = local399;
					}
				}
			} else if (local399 > arg0.anInt7135) {
				arg0.anInt7135 += local9.anInt3589;
				if (arg0.anInt7135 > local399) {
					arg0.anInt7135 = local399;
				}
			} else if (arg0.anInt7135 > 0) {
				arg0.anInt7135 -= local9.anInt3589;
				if (arg0.anInt7135 < 0) {
					arg0.anInt7135 = 0;
				}
			}
			local399 = arg0.anInt7135 >> 9;
			if (local399 < 1) {
				local399 = 1;
			}
		}
		Static72.anInt1522 = 0;
		if (local212 == local236 && local253 == local215) {
			Static135.anInt3010 = -1;
		} else {
			if (local236 > local212) {
				Static72.anInt1522 |= 0x4;
				arg0.anInt9542 += local399;
				if (local236 < arg0.anInt9542) {
					arg0.anInt9542 = local236;
				}
			} else if (local212 > local236) {
				Static72.anInt1522 |= 0x8;
				arg0.anInt9542 -= local399;
				if (local236 > arg0.anInt9542) {
					arg0.anInt9542 = local236;
				}
			}
			if (local215 < local253) {
				arg0.anInt9540 += local399;
				Static72.anInt1522 |= 0x1;
				if (local253 < arg0.anInt9540) {
					arg0.anInt9540 = local253;
				}
			} else if (local215 > local253) {
				Static72.anInt1522 |= 0x2;
				arg0.anInt9540 -= local399;
				if (local253 > arg0.anInt9540) {
					arg0.anInt9540 = local253;
				}
			}
			if (local399 >= 32) {
				Static135.anInt3010 = 2;
			} else {
				Static135.anInt3010 = local339;
			}
		}
		if (local236 == arg0.anInt9542 && local253 == arg0.anInt9540) {
			if (arg0.anInt7133 > 0) {
				arg0.anInt7133--;
			}
			arg0.anInt7132--;
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IB)I")
	public static int method2827(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}
}
