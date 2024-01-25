import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static470 {

	@OriginalMember(owner = "client!qv", name = "f", descriptor = "I")
	public static int anInt8495;

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(B)I")
	public static int method7022() {
		return 16;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(ZII)V")
	public static void method7024(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg0) {
			@Pc(8) Class8_Sub31 local8 = Static51.method1418(Static44.aClass257_12, Static608.aClass336_1);
			local8.aClass8_Sub8_Sub2_1.method8548(arg1);
			Static262.method4604(local8);
		} else {
			Static273.method4692(Static144.aClass165_1, arg1, -1);
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)V")
	public static void method7025() {
		if (Static266.anInt5677 > 1) {
			Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub8_1, 4);
		} else {
			Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub8_1, 2);
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lclient!oh;Z)V")
	public static void method7027(@OriginalArg(0) Class237 arg0) {
		Static335.anInt6611 = arg0.method6307("hitmarks");
		Static376.anInt7104 = arg0.method6307("hitbar_default");
		Static257.anInt5538 = arg0.method6307("timerbar_default");
		Static601.anInt10241 = arg0.method6307("headicons_pk");
		Static626.anInt10465 = arg0.method6307("headicons_prayer");
		Static248.anInt5510 = arg0.method6307("hint_headicons");
		Static337.anInt6637 = arg0.method6307("hint_mapmarkers");
		Static261.anInt5610 = arg0.method6307("mapflag");
		Static324.anInt6510 = arg0.method6307("cross");
		Static408.anInt7804 = arg0.method6307("mapdots");
		Static301.anInt5998 = arg0.method6307("scrollbar");
		Static87.anInt10283 = arg0.method6307("name_icons");
		Static416.anInt7880 = arg0.method6307("floorshadows");
		Static76.anInt2331 = arg0.method6307("compass");
		Static138.anInt8423 = arg0.method6307("otherlevel");
		Static275.anInt5763 = arg0.method6307("hint_mapedge");
	}
}
