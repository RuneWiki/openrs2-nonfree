import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!e", name = "n", descriptor = "I")
	public static int anInt1110;

	@OriginalMember(owner = "client!e", name = "l", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_692 = Static118.method2249("Loading title screen )2 ");

	@OriginalMember(owner = "client!e", name = "a", descriptor = "Lclient!oc;")
	public static Class65 aClass65_683 = aClass65_692;

	@OriginalMember(owner = "client!e", name = "b", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_684 = Static118.method2249(" is already on your ignore list)3");

	@OriginalMember(owner = "client!e", name = "d", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_685 = Static118.method2249("runes");

	@OriginalMember(owner = "client!e", name = "e", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_686 = Static118.method2249("");

	@OriginalMember(owner = "client!e", name = "m", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_693 = Static118.method2249("Please remove ");

	@OriginalMember(owner = "client!e", name = "f", descriptor = "Lclient!oc;")
	public static Class65 aClass65_687 = aClass65_693;

	@OriginalMember(owner = "client!e", name = "g", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_688 = Static118.method2249("Loaded textures");

	@OriginalMember(owner = "client!e", name = "h", descriptor = "Lclient!oc;")
	public static Class65 aClass65_689 = aClass65_693;

	@OriginalMember(owner = "client!e", name = "j", descriptor = "Lclient!oc;")
	public static Class65 aClass65_690 = aClass65_684;

	@OriginalMember(owner = "client!e", name = "t", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_697 = Static118.method2249("glow3:");

	@OriginalMember(owner = "client!e", name = "k", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_691 = aClass65_697;

	@OriginalMember(owner = "client!e", name = "o", descriptor = "Lclient!oc;")
	public static Class65 aClass65_694 = aClass65_697;

	@OriginalMember(owner = "client!e", name = "p", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_695 = Static118.method2249("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!e", name = "q", descriptor = "Lclient!oc;")
	public static Class65 aClass65_696 = aClass65_695;

	@OriginalMember(owner = "client!e", name = "u", descriptor = "Lclient!oc;")
	public static Class65 aClass65_698 = aClass65_688;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BLclient!sd;II)[Lclient!cg;")
	public static Class1_Sub2_Sub5_Sub1[] method716(@OriginalArg(1) Class60 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static178.method3023(arg1, arg0, arg2) ? Static64.method1135() : null;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
	public static void method717() {
		@Pc(5) int local5 = Static169.anInt2041 * 128 + 64;
		@Pc(11) int local11 = Static136.anInt3359 * 128 + 64;
		@Pc(19) int local19 = Static171.method2896(local5, Static207.anInt4425, local11) - Static58.anInt1541;
		if (local19 > Static97.anInt2437) {
			Static97.anInt2437 += Static22.anInt667 * (local19 - Static97.anInt2437) / 1000 + Static156.anInt3584;
			if (Static97.anInt2437 > local19) {
				Static97.anInt2437 = local19;
			}
		}
		if (local5 > Static78.anInt1919) {
			Static78.anInt1919 += Static22.anInt667 * (local5 - Static78.anInt1919) / 1000 + Static156.anInt3584;
			if (local5 < Static78.anInt1919) {
				Static78.anInt1919 = local5;
			}
		}
		if (local19 < Static97.anInt2437) {
			Static97.anInt2437 -= (Static97.anInt2437 - local19) * Static22.anInt667 / 1000 + Static156.anInt3584;
			if (local19 > Static97.anInt2437) {
				Static97.anInt2437 = local19;
			}
		}
		if (local5 < Static78.anInt1919) {
			Static78.anInt1919 -= (Static78.anInt1919 - local5) * Static22.anInt667 / 1000 + Static156.anInt3584;
			if (local5 > Static78.anInt1919) {
				Static78.anInt1919 = local5;
			}
		}
		if (local11 > Static160.anInt2779) {
			Static160.anInt2779 += Static156.anInt3584 + (local11 - Static160.anInt2779) * Static22.anInt667 / 1000;
			if (local11 < Static160.anInt2779) {
				Static160.anInt2779 = local11;
			}
		}
		local5 = Static61.anInt1574 * 128 + 64;
		if (Static160.anInt2779 > local11) {
			Static160.anInt2779 -= (Static160.anInt2779 - local11) * Static22.anInt667 / 1000 + Static156.anInt3584;
			if (Static160.anInt2779 < local11) {
				Static160.anInt2779 = local11;
			}
		}
		local11 = Static14.anInt393 * 128 + 64;
		local19 = Static171.method2896(local5, Static207.anInt4425, local11) - Static145.anInt3441;
		@Pc(202) int local202 = local11 - Static160.anInt2779;
		@Pc(207) int local207 = local19 - Static97.anInt2437;
		@Pc(212) int local212 = local5 - Static78.anInt1919;
		@Pc(223) int local223 = (int) Math.sqrt((double) (local202 * local202 + local212 * local212));
		@Pc(234) int local234 = (int) (Math.atan2((double) local207, (double) local223) * 325.949D) & 0x7FF;
		if (local234 < 128) {
			local234 = 128;
		}
		@Pc(252) int local252 = (int) (-325.949D * Math.atan2((double) local212, (double) local202)) & 0x7FF;
		if (local234 > 383) {
			local234 = 383;
		}
		@Pc(261) int local261 = local252 - Static126.anInt3116;
		if (local261 > 1024) {
			local261 -= 2048;
		}
		if (Static34.anInt999 < local234) {
			Static34.anInt999 += Static63.anInt1620 + (local234 - Static34.anInt999) * Static81.anInt2021 / 1000;
			if (Static34.anInt999 > local234) {
				Static34.anInt999 = local234;
			}
		}
		if (local261 < -1024) {
			local261 += 2048;
		}
		if (local234 < Static34.anInt999) {
			Static34.anInt999 -= (Static34.anInt999 - local234) * Static81.anInt2021 / 1000 + Static63.anInt1620;
			if (local234 > Static34.anInt999) {
				Static34.anInt999 = local234;
			}
		}
		if (local261 > 0) {
			Static126.anInt3116 += local261 * Static81.anInt2021 / 1000 + Static63.anInt1620;
			Static126.anInt3116 &= 0x7FF;
		}
		if (local261 < 0) {
			Static126.anInt3116 -= -local261 * Static81.anInt2021 / 1000 + Static63.anInt1620;
			Static126.anInt3116 &= 0x7FF;
		}
		@Pc(361) int local361 = local252 - Static126.anInt3116;
		if (local361 > 1024) {
			local361 -= 2048;
		}
		if (local361 < -1024) {
			local361 += 2048;
		}
		if (local361 < 0 && local261 > 0 || local361 > 0 && local261 < 0) {
			Static126.anInt3116 = local252;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II)Z")
	public static boolean method719(@OriginalArg(0) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}
}
