import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!on", name = "q", descriptor = "Z")
	public static boolean aBoolean278 = false;

	@OriginalMember(owner = "client!on", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString233 = "Loading fonts - ";

	@OriginalMember(owner = "client!on", name = "K", descriptor = "Lclient!cc;")
	public static Class26 aClass26_43 = new Class26(500);

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!ni;BLclient!ni;)V")
	public static void method3280(@OriginalArg(0) Class4 arg0, @OriginalArg(2) Class4 arg1) {
		if (arg1.aClass4_234 != null) {
			arg1.method4854();
		}
		arg1.aClass4_235 = arg0;
		arg1.aClass4_234 = arg0.aClass4_234;
		arg1.aClass4_234.aClass4_235 = arg1;
		arg1.aClass4_235.aClass4_234 = arg1;
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(BI)V")
	public static void method3281() {
		Static253.aClass26_51.method517(5);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ILclient!wf;)V")
	public static void method3283(@OriginalArg(1) Class189 arg0) {
		if (arg0.anInt5904 == Static130.anInt2522) {
			Static85.aBooleanArray8[arg0.anInt5971] = true;
		}
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(II)I")
	public static int method3289(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(25) double local25 = local14;
		if (local23 < local14) {
			local25 = local23;
		}
		@Pc(38) double local38 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(40) double local40 = local14;
		if (local25 > local38) {
			local25 = local38;
		}
		if (local14 < local23) {
			local40 = local23;
		}
		if (local38 > local40) {
			local40 = local38;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(66) double local66 = (local25 + local40) / 2.0D;
		@Pc(68) double local68 = 0.0D;
		@Pc(73) int local73 = (int) (local66 * 256.0D);
		if (local73 < 0) {
			local73 = 0;
		} else if (local73 > 255) {
			local73 = 255;
		}
		if (local40 != local25) {
			if (local14 == local40) {
				local60 = (local23 - local38) / (-local25 + local40);
			} else if (local23 == local40) {
				local60 = (local38 - local14) / (-local25 + local40) + 2.0D;
			} else if (local38 == local40) {
				local60 = (local14 - local23) / (-local25 + local40) + 4.0D;
			}
			if (local66 < 0.5D) {
				local68 = (local40 - local25) / (local25 + local40);
			}
			if (local66 >= 0.5D) {
				local68 = (local40 - local25) / (2.0D - local40 - local25);
			}
		}
		@Pc(173) int local173 = (int) (local68 * 256.0D);
		if (local173 < 0) {
			local173 = 0;
		} else if (local173 > 255) {
			local173 = 255;
		}
		local60 /= 6.0D;
		@Pc(204) int local204 = (int) (local60 * 256.0D);
		if (local73 > 243) {
			local173 >>= 0x4;
		} else if (local73 > 217) {
			local173 >>= 0x3;
		} else if (local73 > 192) {
			local173 >>= 0x2;
		} else if (local73 > 179) {
			local173 >>= 0x1;
		}
		return (local73 >> 1) + (local173 >> 5 << 7) + (local204 >> 2 << 10);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIB)V")
	public static void method3290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static79.method1364(arg0)) {
			Static217.method3517(Static188.aClass189ArrayArray115[arg0], arg1);
		}
	}

	@OriginalMember(owner = "client!on", name = "c", descriptor = "(II)V")
	public static void method3291() {
		Static91.aClass26_19.method517(5);
		aClass26_43.method517(5);
		Static273.aClass26_18.method517(5);
		Static177.aClass26_32.method517(5);
	}

	@OriginalMember(owner = "client!on", name = "g", descriptor = "(I)V")
	public static void method3294() {
		Static287.aClass26_55.method511();
		Static210.aClass26_41.method511();
	}
}
