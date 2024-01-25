import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(BLclient!wia;)V")
	public static void method434(@OriginalArg(1) Class386 arg0) {
		Static550.anInt9398 = arg0.method9213("hitmarks");
		Static207.anInt3890 = arg0.method9213("hitbar_default");
		Static499.anInt8831 = arg0.method9213("timerbar_default");
		Static213.anInt4041 = arg0.method9213("headicons_pk");
		Static420.anInt7569 = arg0.method9213("headicons_prayer");
		Static475.anInt8261 = arg0.method9213("hint_headicons");
		Static506.anInt8938 = arg0.method9213("hint_mapmarkers");
		Static296.anInt6298 = arg0.method9213("mapflag");
		Static465.anInt8177 = arg0.method9213("cross");
		Static611.anInt10309 = arg0.method9213("mapdots");
		Static200.anInt3716 = arg0.method9213("scrollbar");
		Static179.anInt3447 = arg0.method9213("name_icons");
		Static604.anInt10202 = arg0.method9213("floorshadows");
		Static180.anInt3466 = arg0.method9213("compass");
		Static401.anInt7388 = arg0.method9213("otherlevel");
		Static459.anInt8008 = arg0.method9213("hint_mapedge");
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(IIZ)V")
	public static void method435(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(10) Class14_Sub50 local10 = Static250.method3683(arg0, arg1);
		if (local10 != null) {
			for (@Pc(19) int local19 = 0; local19 < local10.anIntArray699.length; local19++) {
				local10.anIntArray699[local19] = -1;
				local10.anIntArray698[local19] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(II)I")
	public static int method436(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method438(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5) {
		Static210.method3320(arg2, arg5, arg4, arg1, arg0, 0, arg3);
	}
}
