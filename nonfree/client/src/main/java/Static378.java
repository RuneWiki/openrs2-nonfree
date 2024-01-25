import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!ms", name = "m", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_118 = new Class289(55, -1);

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method6989(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5) {
		Static234.method3564(arg3, arg4, arg5, arg1, arg0, 0, arg2);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V")
	public static void method6991() {
		Static678.aClass3_4.method6623();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static512.aLongArray21[local10] = 0L;
		}
		for (@Pc(30) int local30 = 0; local30 < 32; local30++) {
			Static106.aLongArray6[local30] = 0L;
		}
		Static410.anInt7178 = 0;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!ae;I)V")
	public static void method6992(@OriginalArg(0) Class8 arg0) {
		Static517.anInt8622 = arg0.method252("hitmarks");
		Static477.anInt8199 = arg0.method252("hitbar_default");
		Static572.anInt9467 = arg0.method252("timerbar_default");
		Static323.anInt5423 = arg0.method252("headicons_pk");
		Static540.anInt9108 = arg0.method252("headicons_prayer");
		Static419.anInt7282 = arg0.method252("hint_headicons");
		Static195.anInt3357 = arg0.method252("hint_mapmarkers");
		Static453.anInt1589 = arg0.method252("mapflag");
		Static608.anInt9870 = arg0.method252("cross");
		Static641.anInt10368 = arg0.method252("mapdots");
		Static423.anInt7315 = arg0.method252("scrollbar");
		Static390.anInt6563 = arg0.method252("name_icons");
		Static154.anInt2564 = arg0.method252("floorshadows");
		Static445.anInt7485 = arg0.method252("compass");
		Static414.anInt7227 = arg0.method252("otherlevel");
		Static170.anInt2857 = arg0.method252("hint_mapedge");
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)V")
	public static void method6994() {
		if (Static145.anInt2483 <= 0) {
			Static330.aString6 = "";
			return;
		}
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < Static241.aStringArray30.length; local15++) {
			if (Static241.aStringArray30[local15].indexOf("--> ") != -1) {
				@Pc(27) int local27 = ~Static145.anInt2483;
				local13++;
				if (local27 == ~local13) {
					Static330.aString6 = Static241.aStringArray30[local15].substring(Static241.aStringArray30[local15].indexOf(">") + 2);
					break;
				}
			}
		}
	}
}
