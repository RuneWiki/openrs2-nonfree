import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!ic", name = "Q", descriptor = "Z")
	public static boolean aBoolean44;

	@OriginalMember(owner = "client!ic", name = "L", descriptor = "Lclient!qc;")
	public static Class60 aClass60_504 = Static121.method2047("m-Ochte sich mit Ihnen duellieren)3");

	@OriginalMember(owner = "client!ic", name = "W", descriptor = "Lclient!qc;")
	public static Class60 aClass60_505 = Static121.method2047("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)V")
	public static void method933() {
		Static51.anInt1334 = -1;
		Static3.anInt31 = 0;
		Static82.aClass40_59 = null;
		aBoolean44 = false;
		Static34.anInt895 = 2;
		Static30.anInt836 = 1;
		Static15.anInt2965 = -1;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BIII)I")
	public static int method936(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = 256 - arg0;
		return ((arg1 & 0xFF00) * local8 + (arg2 & 0xFF00) * arg0 & 0xFF0000) + (arg0 * (arg2 & 0xFF00FF) + (arg1 & 0xFF00FF) * local8 & 0xFF00FF00) >> 8;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
	public static void method938() {
		aClass60_505 = null;
		aClass60_504 = null;
	}

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "(B)V")
	public static void method940() {
		Static38.aClass8_1.method2113();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static122.aLongArray14[local10] = 0L;
		}
		for (@Pc(27) int local27 = 0; local27 < 32; local27++) {
			Static115.aLongArray11[local27] = 0L;
		}
		Static101.anInt2466 = 0;
	}
}
