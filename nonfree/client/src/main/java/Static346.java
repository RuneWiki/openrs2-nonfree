import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!rf", name = "q", descriptor = "[I")
	public static int[] anIntArray387;

	@OriginalMember(owner = "client!rf", name = "w", descriptor = "Lclient!bu;")
	public static Class32 aClass32_76;

	@OriginalMember(owner = "client!rf", name = "l", descriptor = "I")
	public static int anInt5873 = 1;

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "(I)V")
	public static void method4585() {
		@Pc(9) int local9 = Static194.anInt3883 * 128 + 64;
		@Pc(15) int local15 = Static57.anInt5083 * 128 + 64;
		@Pc(24) int local24 = Static231.method3482(Static6.anInt93, local9, local15) - Static386.anInt6440;
		if (Static305.anInt5449 >= 100) {
			Static276.anInt5105 = Static194.anInt3883 * 128 + 64;
			Static265.anInt5008 = Static57.anInt5083 * 128 + 64;
			Static439.anInt7400 = Static231.method3482(Static6.anInt93, Static276.anInt5105, Static265.anInt5008) - Static386.anInt6440;
		} else {
			if (local9 > Static276.anInt5105) {
				Static276.anInt5105 += Static21.anInt707 + Static305.anInt5449 * (local9 - Static276.anInt5105) / 1000;
				if (local9 < Static276.anInt5105) {
					Static276.anInt5105 = local9;
				}
			}
			if (Static439.anInt7400 < local24) {
				Static439.anInt7400 += (local24 - Static439.anInt7400) * Static305.anInt5449 / 1000 + Static21.anInt707;
				if (local24 < Static439.anInt7400) {
					Static439.anInt7400 = local24;
				}
			}
			if (local9 < Static276.anInt5105) {
				Static276.anInt5105 -= Static305.anInt5449 * (Static276.anInt5105 - local9) / 1000 + Static21.anInt707;
				if (local9 > Static276.anInt5105) {
					Static276.anInt5105 = local9;
				}
			}
			if (local24 < Static439.anInt7400) {
				Static439.anInt7400 -= Static21.anInt707 + (Static439.anInt7400 - local24) * Static305.anInt5449 / 1000;
				if (local24 > Static439.anInt7400) {
					Static439.anInt7400 = local24;
				}
			}
			if (local15 > Static265.anInt5008) {
				Static265.anInt5008 += Static21.anInt707 + Static305.anInt5449 * (local15 - Static265.anInt5008) / 1000;
				if (local15 < Static265.anInt5008) {
					Static265.anInt5008 = local15;
				}
			}
			if (Static265.anInt5008 > local15) {
				Static265.anInt5008 -= Static21.anInt707 + Static305.anInt5449 * (Static265.anInt5008 - local15) / 1000;
				if (local15 > Static265.anInt5008) {
					Static265.anInt5008 = local15;
				}
			}
		}
		local15 = Static202.anInt3951 * 128 + 64;
		local9 = Static348.anInt5916 * 128 + 64;
		local24 = Static231.method3482(Static6.anInt93, local9, local15) - Static185.anInt3725;
		@Pc(230) int local230 = local9 - Static276.anInt5105;
		@Pc(235) int local235 = local24 - Static439.anInt7400;
		@Pc(239) int local239 = local15 - Static265.anInt5008;
		@Pc(250) int local250 = (int) Math.sqrt((double) (local239 * local239 + local230 * local230));
		@Pc(261) int local261 = (int) (Math.atan2((double) local235, (double) local250) * 2607.5945876176133D) & 0x3FFF;
		@Pc(272) int local272 = (int) (Math.atan2((double) local230, (double) local239) * -2607.5945876176133D) & 0x3FFF;
		if (local261 < 1024) {
			local261 = 1024;
		}
		if (local261 > 3072) {
			local261 = 3072;
		}
		if (local261 > Static298.anInt5734) {
			Static298.anInt5734 += Static20.anInt684 * (local261 - Static298.anInt5734 >> 3) / 1000 + Static194.anInt3884 << 3;
			if (Static298.anInt5734 > local261) {
				Static298.anInt5734 = local261;
			}
		}
		if (local261 < Static298.anInt5734) {
			Static298.anInt5734 -= Static194.anInt3884 + (Static298.anInt5734 - local261 >> 3) * Static20.anInt684 / 1000 << 3;
			if (local261 > Static298.anInt5734) {
				Static298.anInt5734 = local261;
			}
		}
		@Pc(345) int local345 = local272 - Static445.anInt7532;
		if (local345 > 8192) {
			local345 -= 16384;
		}
		if (local345 < -8192) {
			local345 += 16384;
		}
		local345 >>= 0x3;
		if (local345 > 0) {
			Static445.anInt7532 += Static194.anInt3884 + Static20.anInt684 * local345 / 1000 << 3;
			Static445.anInt7532 &= 0x3FFF;
		}
		if (local345 < 0) {
			Static445.anInt7532 -= Static194.anInt3884 + Static20.anInt684 * -local345 / 1000 << 3;
			Static445.anInt7532 &= 0x3FFF;
		}
		@Pc(408) int local408 = local272 - Static445.anInt7532;
		if (local408 > 8192) {
			local408 -= 16384;
		}
		if (local408 < -8192) {
			local408 += 16384;
		}
		if (local408 < 0 && local345 > 0 || local408 > 0 && local345 < 0) {
			Static445.anInt7532 = local272;
		}
		Static445.anInt7524 = 0;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/lang/Object;Lclient!li;I)V")
	public static void method4591(@OriginalArg(0) Object arg0, @OriginalArg(1) Class143 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(9) int local9 = 0; local9 < 50 && arg1.anEventQueue1.peekEvent() != null; local9++) {
			Static360.method4758(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}
}
