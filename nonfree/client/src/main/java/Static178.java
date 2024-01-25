import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!fp", name = "h", descriptor = "I")
	public static int anInt3269;

	@OriginalMember(owner = "client!fp", name = "r", descriptor = "I")
	public static final int anInt3276 = 0;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method2798(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(9) Class3_Sub5_Sub20 local9 = Static447.method6065((long) arg0, 2);
		local9.method8832();
		local9.aString117 = arg1;
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(I)V")
	public static void method2799() {
		if (Static352.aClass3_Sub5_Sub13_1 != null) {
			Static352.aClass3_Sub5_Sub13_1 = null;
			Static499.method6547(Static515.anInt8106, Static453.anInt7304, Static473.anInt7547, Static3.anInt15);
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILclient!uq;)V")
	public static void method2802(@OriginalArg(1) Class362 arg0) {
		Static512.anInt8072 = arg0.method8353("hitmarks");
		Static169.anInt3097 = arg0.method8353("hitbar_default");
		Static628.anInt10402 = arg0.method8353("timerbar_default");
		Static516.anInt8125 = arg0.method8353("headicons_pk");
		Static401.anInt6632 = arg0.method8353("headicons_prayer");
		Static600.anInt9810 = arg0.method8353("hint_headicons");
		Static21.anInt7427 = arg0.method8353("hint_mapmarkers");
		Static347.anInt5935 = arg0.method8353("mapflag");
		Static24.anInt587 = arg0.method8353("cross");
		Static26.anInt630 = arg0.method8353("mapdots");
		Static278.anInt4724 = arg0.method8353("scrollbar");
		Static504.anInt7951 = arg0.method8353("name_icons");
		Static582.anInt9464 = arg0.method8353("floorshadows");
		Static315.anInt5265 = arg0.method8353("compass");
		Static1.anInt10667 = arg0.method8353("otherlevel");
		Static116.anInt2119 = arg0.method8353("hint_mapedge");
	}
}
