import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "Lclient!pca;")
	public static Class277 aClass277_7;

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
	public static int anInt9576;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "[Lclient!jc;")
	public static final Class6_Sub15[] aClass6_Sub15Array4 = new Class6_Sub15[2048];

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljava/lang/Object;Lclient!ft;I)V")
	public static void method8350(@OriginalArg(0) Object arg0, @OriginalArg(1) Class122 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < 50 && arg1.anEventQueue1.peekEvent() != null; local12++) {
			Static255.method4444(1L);
		}
		try {
			if (arg0 != null) {
				arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
			}
		} catch (@Pc(57) Exception local57) {
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)Lclient!lq;")
	public static Class204_Sub1 method8351() {
		Static342.anInt8952 = 0;
		return Static633.method7207();
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Z)V")
	public static void method8355() {
		@Pc(9) int local9 = Static438.anInt7455 * 512 + 256;
		@Pc(15) int local15 = Static675.anInt5495 * 512 + 256;
		@Pc(23) int local23 = Static248.method4318(local15, Static504.anInt8428, local9) - Static414.anInt7188;
		if (anInt9576 < 100) {
			if (local9 > Static475.anInt8090) {
				Static475.anInt8090 += (local9 - Static475.anInt8090) * anInt9576 / 1000 + Static193.anInt9225;
				if (Static475.anInt8090 > local9) {
					Static475.anInt8090 = local9;
				}
			}
			if (local9 < Static475.anInt8090) {
				Static475.anInt8090 -= Static193.anInt9225 + anInt9576 * (Static475.anInt8090 - local9) / 1000;
				if (local9 > Static475.anInt8090) {
					Static475.anInt8090 = local9;
				}
			}
			if (Static406.anInt7076 < local23) {
				Static406.anInt7076 += anInt9576 * (local23 - Static406.anInt7076) / 1000 + Static193.anInt9225;
				if (Static406.anInt7076 > local23) {
					Static406.anInt7076 = local23;
				}
			}
			if (Static365.anInt6155 < local15) {
				Static365.anInt6155 += Static193.anInt9225 + (local15 - Static365.anInt6155) * anInt9576 / 1000;
				if (Static365.anInt6155 > local15) {
					Static365.anInt6155 = local15;
				}
			}
			if (local23 < Static406.anInt7076) {
				Static406.anInt7076 -= Static193.anInt9225 + (Static406.anInt7076 - local23) * anInt9576 / 1000;
				if (Static406.anInt7076 < local23) {
					Static406.anInt7076 = local23;
				}
			}
			if (Static365.anInt6155 > local15) {
				Static365.anInt6155 -= (Static365.anInt6155 - local15) * anInt9576 / 1000 + Static193.anInt9225;
				if (Static365.anInt6155 < local15) {
					Static365.anInt6155 = local15;
				}
			}
		} else {
			Static365.anInt6155 = Static675.anInt5495 * 512 + 256;
			Static475.anInt8090 = Static438.anInt7455 * 512 + 256;
			Static406.anInt7076 = Static248.method4318(Static365.anInt6155, Static504.anInt8428, Static475.anInt8090) - Static414.anInt7188;
		}
		local9 = Static104.anInt2080 * 512 + 256;
		local15 = Static484.anInt8246 * 512 + 256;
		local23 = Static248.method4318(local15, Static504.anInt8428, local9) - Static26.anInt362;
		@Pc(244) int local244 = local9 - Static475.anInt8090;
		@Pc(248) int local248 = local23 - Static406.anInt7076;
		@Pc(253) int local253 = local15 - Static365.anInt6155;
		@Pc(264) int local264 = (int) Math.sqrt((double) (local244 * local244 + local253 * local253));
		@Pc(275) int local275 = (int) (Math.atan2((double) local248, (double) local264) * 2607.5945876176133D) & 0x3FFF;
		@Pc(286) int local286 = (int) (Math.atan2((double) local244, (double) local253) * -2607.5945876176133D) & 0x3FFF;
		if (local275 < 1024) {
			local275 = 1024;
		}
		if (local275 > 3072) {
			local275 = 3072;
		}
		if (Static337.anInt5759 < local275) {
			Static337.anInt5759 += Static309.anInt5362 + (local275 - Static337.anInt5759 >> 3) * Static566.anInt8430 / 1000 << 3;
			if (Static337.anInt5759 > local275) {
				Static337.anInt5759 = local275;
			}
		}
		if (Static337.anInt5759 > local275) {
			Static337.anInt5759 -= Static309.anInt5362 + (Static337.anInt5759 - local275 >> 3) * Static566.anInt8430 / 1000 << 3;
			if (local275 > Static337.anInt5759) {
				Static337.anInt5759 = local275;
			}
		}
		@Pc(369) int local369 = local286 - Static21.anInt279;
		if (local369 > 8192) {
			local369 -= 16384;
		}
		if (local369 < -8192) {
			local369 += 16384;
		}
		local369 >>= 0x3;
		if (local369 > 0) {
			Static21.anInt279 += Static309.anInt5362 + local369 * Static566.anInt8430 / 1000 << 3;
			Static21.anInt279 &= 0x3FFF;
		}
		if (local369 < 0) {
			Static21.anInt279 -= -local369 * Static566.anInt8430 / 1000 + Static309.anInt5362 << 3;
			Static21.anInt279 &= 0x3FFF;
		}
		@Pc(436) int local436 = local286 - Static21.anInt279;
		if (local436 > 8192) {
			local436 -= 16384;
		}
		if (local436 < -8192) {
			local436 += 16384;
		}
		Static200.anInt4059 = 0;
		if (local436 < 0 && local369 > 0 || local436 > 0 && local369 < 0) {
			Static21.anInt279 = local286;
		}
	}
}
