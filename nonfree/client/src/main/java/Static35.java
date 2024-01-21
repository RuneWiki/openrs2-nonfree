import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "Lclient!oh;")
	public static Class11_Sub1 aClass11_Sub1_7;

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
	public static int anInt894;

	@OriginalMember(owner = "client!dh", name = "k", descriptor = "[S")
	public static short[] aShortArray2;

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "Lclient!lf;")
	public static Class49 aClass49_466 = Static32.method683("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "Lclient!lf;")
	private static Class49 aClass49_467 = Static32.method683("Unexpected server response)3");

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "Lclient!lf;")
	public static Class49 aClass49_468 = Static32.method683("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "Lclient!lf;")
	public static Class49 aClass49_469 = aClass49_467;

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
	public static volatile int anInt893 = -1;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
	public static void method731() {
		Static128.aClass54_1.method2772();
		for (@Pc(15) int local15 = 0; local15 < 32; local15++) {
			Static86.aLongArray20[local15] = 0L;
		}
		for (@Pc(27) int local27 = 0; local27 < 32; local27++) {
			Static145.aLongArray18[local27] = 0L;
		}
		Static105.anInt2196 = 0;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIII)I")
	public static int method732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(20) int local20 = 65536 - Class2_Sub2_Sub2_Sub4.anIntArray218[arg3 * 1024 / arg0] >> 1;
		return (arg2 * (65536 - local20) >> 16) + (arg1 * local20 >> 16);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
	public static void method733() {
		aClass11_Sub1_7 = null;
		aClass49_468 = null;
		aShortArray2 = null;
		aClass49_467 = null;
		aClass49_469 = null;
		aClass49_466 = null;
	}
}
