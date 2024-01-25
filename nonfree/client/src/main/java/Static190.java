import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "Lclient!d;")
	public static Interface4 anInterface4_8;

	@OriginalMember(owner = "client!gn", name = "m", descriptor = "I")
	public static int anInt4466;

	@OriginalMember(owner = "client!gn", name = "f", descriptor = "I")
	public static int anInt4460 = -1;

	@OriginalMember(owner = "client!gn", name = "r", descriptor = "[I")
	public static final int[] anIntArray222 = new int[1];

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)V")
	public static void method3911() {
		@Pc(5) int local5 = 0;
		if (Static74.aClass2_Sub13_5 != null) {
			local5 = Static74.aClass2_Sub13_5.aClass14_Sub3_1.method1703();
		}
		@Pc(28) int local28;
		@Pc(46) int local46;
		if (local5 == 2) {
			local28 = Static584.anInt5338 <= 800 ? Static584.anInt5338 : 800;
			Static81.anInt2497 = local28;
			Static57.anInt1928 = (Static584.anInt5338 - local28) / 2;
			local46 = Static330.anInt6688 > 600 ? 600 : Static330.anInt6688;
			Static423.anInt7984 = local46;
			Static110.anInt3008 = 0;
		} else if (local5 == 1) {
			local28 = Static584.anInt5338 <= 1024 ? Static584.anInt5338 : 1024;
			Static57.anInt1928 = (Static584.anInt5338 - local28) / 2;
			local46 = Static330.anInt6688 <= 768 ? Static330.anInt6688 : 768;
			Static81.anInt2497 = local28;
			Static110.anInt3008 = 0;
			Static423.anInt7984 = local46;
		} else {
			Static110.anInt3008 = 0;
			Static423.anInt7984 = Static330.anInt6688;
			Static57.anInt1928 = 0;
			Static81.anInt2497 = Static584.anInt5338;
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(BLclient!in;)V")
	public static void method3912(@OriginalArg(1) Class157 arg0) {
		Static330.anInt6692 = arg0.method4571("hitmarks");
		Static349.anInt6963 = arg0.method4571("hitbar_default");
		Static34.anInt736 = arg0.method4571("timerbar_default");
		Static199.anInt8552 = arg0.method4571("headicons_pk");
		Static313.anInt6435 = arg0.method4571("headicons_prayer");
		Static359.anInt7119 = arg0.method4571("hint_headicons");
		Static615.anInt10775 = arg0.method4571("hint_mapmarkers");
		Static319.anInt6495 = arg0.method4571("mapflag");
		Static392.anInt7542 = arg0.method4571("cross");
		Static38.anInt822 = arg0.method4571("mapdots");
		Static153.anInt3903 = arg0.method4571("scrollbar");
		Static155.anInt3953 = arg0.method4571("name_icons");
		Static457.anInt8411 = arg0.method4571("floorshadows");
		Static255.anInt5461 = arg0.method4571("compass");
		Static310.anInt6429 = arg0.method4571("otherlevel");
		Static552.anInt9900 = arg0.method4571("hint_mapedge");
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(BJ)V")
	public static void method3914(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static93.method2533(arg0 - 1L);
			Static93.method2533(1L);
		} else {
			Static93.method2533(arg0);
		}
	}
}
