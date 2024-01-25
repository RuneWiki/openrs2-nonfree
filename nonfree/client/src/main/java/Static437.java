import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!qr", name = "d", descriptor = "[I")
	public static int[] anIntArray588;

	@OriginalMember(owner = "client!qr", name = "h", descriptor = "I")
	public static int anInt7656 = 0;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIII)V")
	public static void method6086(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		@Pc(3) int local3 = arg0 << 3;
		@Pc(11) int local11 = arg1 << 3;
		Static167.aFloat59 = local11;
		Static287.aFloat117 = local3;
		if (Static340.anInt5707 == 2) {
			Static561.anInt9344 = local11;
			Static103.anInt2093 = local3;
			Static395.anInt6894 = 0;
		}
		Static25.method281();
		Static305.aBoolean423 = true;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(III)I")
	public static int method6087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0 >>> 31;
		return (arg0 + local12) / arg1 - local12;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZZLjava/lang/Object;)[B")
	public static byte[] method6088(@OriginalArg(1) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return arg0 ? Static167.method2396(local13) : local13;
		} else if (arg1 instanceof Class18) {
			@Pc(27) Class18 local27 = (Class18) arg1;
			return local27.method271();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILclient!pu;)V")
	public static void method6089(@OriginalArg(1) Class270 arg0) {
		Static238.anInt4443 = arg0.method5677("hitmarks");
		Static182.anInt3237 = arg0.method5677("hitbar_default");
		Static306.anInt4493 = arg0.method5677("timerbar_default");
		Static334.anInt5671 = arg0.method5677("headicons_pk");
		Static397.anInt9636 = arg0.method5677("headicons_prayer");
		Static394.anInt6880 = arg0.method5677("hint_headicons");
		Static11.anInt148 = arg0.method5677("hint_mapmarkers");
		Static481.anInt8098 = arg0.method5677("mapflag");
		Static65.anInt1322 = arg0.method5677("cross");
		Static124.anInt6631 = arg0.method5677("mapdots");
		Static382.anInt6461 = arg0.method5677("scrollbar");
		Static276.anInt4815 = arg0.method5677("name_icons");
		Static96.anInt2010 = arg0.method5677("floorshadows");
		Static49.anInt847 = arg0.method5677("compass");
		Static570.anInt9427 = arg0.method5677("otherlevel");
		Static471.anInt8014 = arg0.method5677("hint_mapedge");
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(III)I")
	public static int method6090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg0 >> 31 & arg1 - 1;
		return local16 + ((arg0 >>> 31) + arg0) % arg1;
	}
}
