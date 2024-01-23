import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
	public static int anInt1067;

	@OriginalMember(owner = "client!lb", name = "C", descriptor = "I")
	public static int anInt1077;

	@OriginalMember(owner = "client!lb", name = "L", descriptor = "I")
	private static int anInt1085;

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "[Lclient!pg;")
	public static Class105[] aClass105Array2 = new Class105[6];

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString52 = "Attack";

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)I")
	public static int method689(@OriginalArg(0) int arg0) {
		@Pc(15) double local15 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(28) double local28 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(35) double local35 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(37) double local37 = 0.0D;
		@Pc(39) double local39 = local15;
		if (local15 < local28) {
			local39 = local28;
		}
		@Pc(47) double local47 = 0.0D;
		if (local35 > local39) {
			local39 = local35;
		}
		@Pc(55) double local55 = local15;
		if (local15 > local28) {
			local55 = local28;
		}
		if (local55 > local35) {
			local55 = local35;
		}
		@Pc(73) double local73 = (local55 + local39) / 2.0D;
		if (local39 != local55) {
			if (local73 < 0.5D) {
				local47 = (local39 - local55) / (local39 + local55);
			}
			if (local73 >= 0.5D) {
				local47 = (local39 - local55) / ((2.0D - local39) - local55);
			}
			if (local15 == local39) {
				local37 = (local28 - local35) / (local39 - local55);
			} else if (local39 == local28) {
				local37 = (local35 - local15) / (-local55 + local39) + 2.0D;
			} else if (local39 == local35) {
				local37 = (local15 - local28) / (-local55 + local39) + 4.0D;
			}
		}
		local37 /= 6.0D;
		@Pc(164) int local164 = (int) (local73 * 256.0D);
		if (local164 < 0) {
			local164 = 0;
		} else if (local164 > 255) {
			local164 = 255;
		}
		@Pc(183) int local183 = (int) (local37 * 256.0D);
		@Pc(188) int local188 = (int) (local47 * 256.0D);
		if (local188 < 0) {
			local188 = 0;
		} else if (local188 > 255) {
			local188 = 255;
		}
		if (local164 > 243) {
			local188 >>= 0x4;
		} else if (local164 > 217) {
			local188 >>= 0x3;
		} else if (local164 > 192) {
			local188 >>= 0x2;
		} else if (local164 > 179) {
			local188 >>= 0x1;
		}
		return (local164 >> 1) + (local183 >> 2 << 10) + (local188 >> 5 << 7);
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)V")
	public static void method691() {
		Static169.anInt3963 = -3;
		Static89.anInt2483 = 0;
		Static145.anInt3518 = -1;
		Static203.aBoolean224 = false;
		Static37.anInt1009 = 0;
		Static176.anInt4046 = 0;
		Static238.anInt5145 = 1;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZI)Lclient!gj;")
	public static Class49 method697(@OriginalArg(1) int arg0) {
		@Pc(10) Class49 local10 = (Class49) Static57.aClass79_7.method2483((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(29) byte[] local29 = Static121.aClass51_41.method1874(Static191.method3229(arg0), Static34.method617(arg0));
		local10 = new Class49();
		local10.anInt2191 = arg0;
		if (local29 != null) {
			local10.method1632(new Class1_Sub13(local29));
		}
		local10.method1631();
		Static57.aClass79_7.method2486(local10, (long) arg0);
		return local10;
	}
}
