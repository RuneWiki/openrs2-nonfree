import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static578 {

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
	public static int anInt9490;

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "[Lclient!ee;")
	public static final Class5_Sub12[] aClass5_Sub12Array1 = new Class5_Sub12[2048];

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
	public static int anInt9491 = -1;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IZLjava/io/File;)V")
	public static void method8152(@OriginalArg(2) File arg0) {
		if (Static318.anObject11 == null) {
			Static634.method8764();
		}
		try {
			@Pc(14) Class local14 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
			@Pc(35) Method local35 = local14.getDeclaredMethod("dumpHeap", String.class, Boolean.TYPE);
			local35.invoke(Static318.anObject11, arg0.getAbsolutePath(), Boolean.valueOf(false));
		} catch (@Pc(55) Exception local55) {
			System.out.println("HeapDump error:");
			local55.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!nt;II)V")
	public static void method8154(@OriginalArg(0) Class248 arg0, @OriginalArg(2) int arg1) {
		if (Static94.aBoolean828) {
			Static94.aBoolean828 = false;
			arg1 = 0;
		}
		if (Static323.aClass248_2 != null && Static323.aClass248_2.method5961(arg0)) {
			return;
		}
		Static323.aClass248_2 = arg0;
		Static447.aLong212 = Static205.method3179();
		Static262.anInt4377 = arg1;
		Static580.anInt10244 = arg1;
		if (Static580.anInt10244 == 0) {
			Static342.method5253();
			return;
		}
		Static360.aFloat133 = Static528.aFloat190;
		Static320.aFloat111 = Static252.aFloat61;
		Static183.aFloat41 = Static591.aFloat198;
		Static390.aFloat142 = Static637.aFloat205;
		Static48.anInt751 = Static375.anInt6599;
		Static526.anInt8775 = Static186.anInt3362;
		Static287.aFloat69 = Static618.aFloat202;
		Static563.aFloat194 = Static13.aFloat5;
		Static88.aClass91_1 = Static339.aClass91_2;
		Static286.anInt9323 = Static91.anInt1475;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILclient!kn;Z)V")
	public static void method8155(@OriginalArg(1) Class14_Sub1_Sub1_Sub3 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(11) Class295 local11 = arg0.method2519();
		if (arg0.anInt2972 == 0) {
			Static563.anInt9268 = -1;
			arg0.anInt2971 = 0;
			Static561.anInt9239 = 0;
			return;
		}
		if (arg0.anInt2930 != -1 && arg0.anInt2918 == 0) {
			@Pc(38) Class200 local38 = Static396.aClass359_2.method8415(arg0.anInt2930);
			if (arg0.anInt2973 > 0 && local38.anInt4875 == 0) {
				arg0.anInt2971++;
				Static561.anInt9239 = 0;
				Static563.anInt9268 = -1;
				return;
			}
			if (arg0.anInt2973 <= 0 && local38.anInt4873 == 0) {
				Static561.anInt9239 = 0;
				arg0.anInt2971++;
				Static563.anInt9268 = -1;
				return;
			}
		}
		for (@Pc(80) int local80 = 0; local80 < arg0.aClass315Array3.length; local80++) {
			if (arg0.aClass315Array3[local80].anInt8720 != -1 && Static235.anInt3998 >= arg0.aClass315Array3[local80].anInt8721) {
				@Pc(110) Class68 local110 = Static452.aClass170_4.method4001(arg0.aClass315Array3[local80].anInt8720);
				if (local110.aBoolean114 && local110.anInt1416 != -1) {
					@Pc(124) Class200 local124 = Static396.aClass359_2.method8415(local110.anInt1416);
					if (arg0.anInt2973 > 0 && local124.anInt4875 == 0) {
						arg0.anInt2971++;
						Static563.anInt9268 = -1;
						Static561.anInt9239 = 0;
						return;
					}
					if (arg0.anInt2973 <= 0 && local124.anInt4873 == 0) {
						Static561.anInt9239 = 0;
						arg0.anInt2971++;
						Static563.anInt9268 = -1;
						return;
					}
				}
			}
		}
		@Pc(170) int local170 = arg0.anInt9317;
		@Pc(173) int local173 = arg0.anInt9315;
		@Pc(189) int local189 = arg0.anIntArray253[arg0.anInt2972 - 1] * 512 + arg0.method2509() * 256;
		@Pc(206) int local206 = arg0.anIntArray252[arg0.anInt2972 - 1] * 512 + arg0.method2509() * 256;
		if (local170 < local189) {
			if (local206 > local173) {
				arg0.method2507(10240);
			} else if (local173 <= local206) {
				arg0.method2507(12288);
			} else {
				arg0.method2507(14336);
			}
		} else if (local189 < local170) {
			if (local206 > local173) {
				arg0.method2507(6144);
			} else if (local173 > local206) {
				arg0.method2507(2048);
			} else {
				arg0.method2507(4096);
			}
		} else if (local206 > local173) {
			arg0.method2507(8192);
		} else if (local206 < local173) {
			arg0.method2507(0);
		}
		@Pc(304) byte local304 = arg0.aByteArray27[arg0.anInt2972 - 1];
		if (!arg1 && (local189 - local170 > 1024 || local189 - local170 < -1024 || local206 - local173 > 1024 || local206 - local173 < -1024)) {
			arg0.anInt9315 = local206;
			arg0.anInt9317 = local189;
			arg0.method2521(arg0.lb, false);
			Static563.anInt9268 = -1;
			Static561.anInt9239 = 0;
			if (arg0.anInt2973 > 0) {
				arg0.anInt2973--;
			}
			arg0.anInt2972--;
			return;
		}
		@Pc(370) int local370 = 16;
		@Pc(372) boolean local372 = true;
		if (arg0 instanceof Class14_Sub1_Sub1_Sub3_Sub2) {
			local372 = ((Class14_Sub1_Sub1_Sub3_Sub2) arg0).aClass271_1.aBoolean608;
		}
		@Pc(412) int local412;
		if (local372) {
			local412 = arg0.lb - arg0.aClass130_7.anInt3301;
			if (local412 != 0 && arg0.anInt2951 == -1 && arg0.anInt2956 != 0) {
				local370 = 8;
			}
			if (!arg1 && arg0.anInt2972 > 2) {
				local370 = 24;
			}
			if (!arg1 && arg0.anInt2972 > 3) {
				local370 = 32;
			}
		} else {
			if (!arg1 && arg0.anInt2972 > 1) {
				local370 = 24;
			}
			if (!arg1 && arg0.anInt2972 > 2) {
				local370 = 32;
			}
		}
		if (arg0.anInt2971 > 0 && arg0.anInt2972 > 1) {
			arg0.anInt2971--;
			local370 = 32;
		}
		if (local304 == 2) {
			local370 <<= 0x1;
		} else if (local304 == 0) {
			local370 >>= 0x1;
		}
		if (local11.anInt7974 != -1) {
			local370 <<= 0x9;
			if (arg0.anInt2972 == 1) {
				local412 = arg0.anInt2974 * arg0.anInt2974;
				@Pc(561) int local561 = (arg0.anInt9317 <= local189 ? local189 - arg0.anInt9317 : -local189 + arg0.anInt9317) << 9;
				@Pc(577) int local577 = (arg0.anInt9315 <= local206 ? local206 - arg0.anInt9315 : arg0.anInt9315 - local206) << 9;
				@Pc(588) int local588 = local577 >= local561 ? local577 : local561;
				@Pc(595) int local595 = local11.anInt7974 * 2 * local588;
				if (local412 > local595) {
					arg0.anInt2974 /= 2;
				} else if (local588 < local412 / 2) {
					arg0.anInt2974 -= local11.anInt7974;
					if (arg0.anInt2974 < 0) {
						arg0.anInt2974 = 0;
					}
				} else if (arg0.anInt2974 < local370) {
					arg0.anInt2974 += local11.anInt7974;
					if (arg0.anInt2974 > local370) {
						arg0.anInt2974 = local370;
					}
				}
			} else if (local370 > arg0.anInt2974) {
				arg0.anInt2974 += local11.anInt7974;
				if (local370 < arg0.anInt2974) {
					arg0.anInt2974 = local370;
				}
			} else if (arg0.anInt2974 > 0) {
				arg0.anInt2974 -= local11.anInt7974;
				if (arg0.anInt2974 < 0) {
					arg0.anInt2974 = 0;
				}
			}
			local370 = arg0.anInt2974 >> 9;
			if (local370 < 1) {
				local370 = 1;
			}
		}
		Static561.anInt9239 = 0;
		if (local189 == local170 && local173 == local206) {
			Static563.anInt9268 = -1;
		} else {
			if (local189 > local170) {
				arg0.anInt9317 += local370;
				Static561.anInt9239 |= 0x4;
				if (arg0.anInt9317 > local189) {
					arg0.anInt9317 = local189;
				}
			} else if (local170 > local189) {
				arg0.anInt9317 -= local370;
				Static561.anInt9239 |= 0x8;
				if (local189 > arg0.anInt9317) {
					arg0.anInt9317 = local189;
				}
			}
			if (local173 < local206) {
				Static561.anInt9239 |= 0x1;
				arg0.anInt9315 += local370;
				if (arg0.anInt9315 > local206) {
					arg0.anInt9315 = local206;
				}
			} else if (local173 > local206) {
				Static561.anInt9239 |= 0x2;
				arg0.anInt9315 -= local370;
				if (local206 > arg0.anInt9315) {
					arg0.anInt9315 = local206;
				}
			}
			if (local370 >= 32) {
				Static563.anInt9268 = 2;
			} else {
				Static563.anInt9268 = local304;
			}
		}
		if (arg0.anInt9317 != local189 || local206 != arg0.anInt9315) {
			return;
		}
		arg0.anInt2972--;
		if (arg0.anInt2973 > 0) {
			arg0.anInt2973--;
			return;
		}
	}
}
