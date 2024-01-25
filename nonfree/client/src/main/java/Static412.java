import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!po", name = "i", descriptor = "Lclient!eu;")
	public static Class93 aClass93_1;

	@OriginalMember(owner = "client!po", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString75;

	@OriginalMember(owner = "client!po", name = "q", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet1;

	@OriginalMember(owner = "client!po", name = "r", descriptor = "[Z")
	public static boolean[] aBooleanArray23;

	@OriginalMember(owner = "client!po", name = "h", descriptor = "S")
	public static short aShort69 = 32767;

	@OriginalMember(owner = "client!po", name = "k", descriptor = "Lclient!gfa;")
	public static final Class117 aClass117_8 = new Class117();

	@OriginalMember(owner = "client!po", name = "n", descriptor = "I")
	public static int anInt7031 = 0;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(ZI)Z")
	public static boolean method5783(@OriginalArg(0) boolean arg0) {
		@Pc(12) boolean local12 = Static136.aClass12_8.method6451();
		if (arg0 == local12) {
			return true;
		}
		if (!arg0) {
			Static136.aClass12_8.method6436();
		} else if (!Static136.aClass12_8.method6459()) {
			arg0 = false;
		}
		if (local12 == arg0) {
			return false;
		} else {
			Static479.aClass1_Sub7_Sub1_1.aBoolean232 = arg0;
			Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
			return true;
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(BI)Z")
	public static boolean method5784(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IB)Z")
	public static boolean method5785(@OriginalArg(0) int arg0) {
		Static168.aBoolean217 = true;
		Static199.anInt4026 = arg0 + 1 & 0xFFFF;
		return true;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!he;ZI)V")
	public static void method5787(@OriginalArg(0) Class20_Sub2_Sub4_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(9) Class138 local9 = arg0.method5346();
		if (arg0.anInt6469 == 0) {
			Static312.anInt5628 = 0;
			Static569.anInt9286 = -1;
			arg0.anInt6467 = 0;
			return;
		}
		if (arg0.anInt6438 != -1 && arg0.anInt6455 == 0) {
			@Pc(40) Class131 local40 = Static594.aClass311_2.method7009(arg0.anInt6438);
			if (arg0.anInt6466 > 0 && local40.anInt3732 == 0) {
				arg0.anInt6467++;
				Static569.anInt9286 = -1;
				Static312.anInt5628 = 0;
				return;
			}
			if (arg0.anInt6466 <= 0 && local40.anInt3735 == 0) {
				Static312.anInt5628 = 0;
				Static569.anInt9286 = -1;
				arg0.anInt6467++;
				return;
			}
		}
		@Pc(104) Class131 local104;
		@Pc(91) Class116 local91;
		if (arg0.anInt6416 != -1 && arg0.anInt6439 <= Static81.anInt1910) {
			local91 = Static592.aClass98_2.method2295(arg0.anInt6416);
			if (local91.aBoolean216 && local91.anInt3012 != -1) {
				local104 = Static594.aClass311_2.method7009(local91.anInt3012);
				if (arg0.anInt6466 > 0 && local104.anInt3732 == 0) {
					arg0.anInt6467++;
					Static312.anInt5628 = 0;
					Static569.anInt9286 = -1;
					return;
				}
				if (arg0.anInt6466 <= 0 && local104.anInt3735 == 0) {
					arg0.anInt6467++;
					Static569.anInt9286 = -1;
					Static312.anInt5628 = 0;
					return;
				}
			}
		}
		if (arg0.anInt6416 != -1 && arg0.anInt6439 <= Static81.anInt1910) {
			local91 = Static592.aClass98_2.method2295(arg0.anInt6416);
			if (local91.aBoolean216 && local91.anInt3012 != -1) {
				local104 = Static594.aClass311_2.method7009(local91.anInt3012);
				if (arg0.anInt6466 > 0 && local104.anInt3732 == 0) {
					Static569.anInt9286 = -1;
					Static312.anInt5628 = 0;
					arg0.anInt6467++;
					return;
				}
				if (arg0.anInt6466 <= 0 && local104.anInt3735 == 0) {
					Static312.anInt5628 = 0;
					arg0.anInt6467++;
					Static569.anInt9286 = -1;
					return;
				}
			}
		}
		@Pc(210) int local210 = arg0.anInt8796;
		@Pc(213) int local213 = arg0.anInt8795;
		@Pc(233) int local233 = arg0.anIntArray437[arg0.anInt6469 - 1] * 512 + arg0.method5349() * 256;
		@Pc(250) int local250 = arg0.anIntArray436[arg0.anInt6469 - 1] * 512 + arg0.method5349() * 256;
		if (local210 >= local233) {
			if (local233 < local210) {
				if (local250 > local213) {
					arg0.method5341(6144);
				} else if (local213 <= local250) {
					arg0.method5341(4096);
				} else {
					arg0.method5341(2048);
				}
			} else if (local250 > local213) {
				arg0.method5341(8192);
			} else if (local250 < local213) {
				arg0.method5341(0);
			}
		} else if (local250 > local213) {
			arg0.method5341(10240);
		} else if (local250 < local213) {
			arg0.method5341(14336);
		} else {
			arg0.method5341(12288);
		}
		@Pc(348) byte local348 = arg0.aByteArray70[arg0.anInt6469 - 1];
		if (!arg1 && (local233 - local210 > 1024 || local233 - local210 < -1024 || local250 - local213 > 1024 || local250 - local213 < -1024)) {
			arg0.anInt8796 = local233;
			arg0.anInt8795 = local250;
			arg0.method5353(false, arg0.anInt6460);
			Static312.anInt5628 = 0;
			Static569.anInt9286 = -1;
			if (arg0.anInt6466 > 0) {
				arg0.anInt6466--;
			}
			arg0.anInt6469--;
			return;
		}
		@Pc(413) int local413 = 16;
		@Pc(415) boolean local415 = true;
		if (arg0 instanceof Class20_Sub2_Sub4_Sub1_Sub2) {
			local415 = ((Class20_Sub2_Sub4_Sub1_Sub2) arg0).aClass162_1.aBoolean354;
		}
		@Pc(433) int local433;
		if (local415) {
			local433 = arg0.anInt6460 - arg0.aClass66_7.anInt1959;
			if (local433 != 0 && arg0.anInt6436 == -1 && arg0.anInt6410 != 0) {
				local413 = 8;
			}
			if (!arg1 && arg0.anInt6469 > 2) {
				local413 = 24;
			}
			if (!arg1 && arg0.anInt6469 > 3) {
				local413 = 32;
			}
		} else {
			if (!arg1 && arg0.anInt6469 > 1) {
				local413 = 24;
			}
			if (!arg1 && arg0.anInt6469 > 2) {
				local413 = 32;
			}
		}
		if (arg0.anInt6467 > 0 && arg0.anInt6469 > 1) {
			arg0.anInt6467--;
			local413 = 32;
		}
		if (local348 == 2) {
			local413 <<= 0x1;
		} else if (local348 == 0) {
			local413 >>= 0x1;
		}
		if (local9.anInt3972 != -1) {
			local413 <<= 0x9;
			if (arg0.anInt6469 == 1) {
				local433 = arg0.anInt6468 * arg0.anInt6468;
				@Pc(554) int local554 = (arg0.anInt8796 <= local233 ? local233 - arg0.anInt8796 : arg0.anInt8796 - local233) << 9;
				@Pc(575) int local575 = (local250 >= arg0.anInt8795 ? local250 - arg0.anInt8795 : arg0.anInt8795 - local250) << 9;
				@Pc(582) int local582 = local554 > local575 ? local554 : local575;
				@Pc(589) int local589 = local9.anInt3972 * 2 * local582;
				if (local589 < local433) {
					arg0.anInt6468 /= 2;
				} else if (local433 / 2 > local582) {
					arg0.anInt6468 -= local9.anInt3972;
					if (arg0.anInt6468 < 0) {
						arg0.anInt6468 = 0;
					}
				} else if (local413 > arg0.anInt6468) {
					arg0.anInt6468 += local9.anInt3972;
					if (local413 < arg0.anInt6468) {
						arg0.anInt6468 = local413;
					}
				}
			} else if (local413 > arg0.anInt6468) {
				arg0.anInt6468 += local9.anInt3972;
				if (arg0.anInt6468 > local413) {
					arg0.anInt6468 = local413;
				}
			} else if (arg0.anInt6468 > 0) {
				arg0.anInt6468 -= local9.anInt3972;
				if (arg0.anInt6468 < 0) {
					arg0.anInt6468 = 0;
				}
			}
			local413 = arg0.anInt6468 >> 9;
			if (local413 < 1) {
				local413 = 1;
			}
		}
		Static312.anInt5628 = 0;
		if (local233 == local210 && local250 == local213) {
			Static569.anInt9286 = -1;
		} else {
			if (local210 < local233) {
				Static312.anInt5628 |= 0x4;
				arg0.anInt8796 += local413;
				if (local233 < arg0.anInt8796) {
					arg0.anInt8796 = local233;
				}
			} else if (local210 > local233) {
				arg0.anInt8796 -= local413;
				Static312.anInt5628 |= 0x8;
				if (local233 > arg0.anInt8796) {
					arg0.anInt8796 = local233;
				}
			}
			if (local250 > local213) {
				Static312.anInt5628 |= 0x1;
				arg0.anInt8795 += local413;
				if (arg0.anInt8795 > local250) {
					arg0.anInt8795 = local250;
				}
			} else if (local213 > local250) {
				Static312.anInt5628 |= 0x2;
				arg0.anInt8795 -= local413;
				if (arg0.anInt8795 < local250) {
					arg0.anInt8795 = local250;
				}
			}
			if (local413 >= 32) {
				Static569.anInt9286 = 2;
			} else {
				Static569.anInt9286 = local348;
			}
		}
		if (arg0.anInt8796 == local233 && local250 == arg0.anInt8795) {
			if (arg0.anInt6466 > 0) {
				arg0.anInt6466--;
			}
			arg0.anInt6469--;
		}
	}
}
