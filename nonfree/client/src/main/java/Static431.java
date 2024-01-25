import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static431 {

	@OriginalMember(owner = "client!vo", name = "M", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray6;

	@OriginalMember(owner = "client!vo", name = "Q", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray47;

	@OriginalMember(owner = "client!vo", name = "S", descriptor = "Lclient!fo;")
	public static Class82 aClass82_98;

	@OriginalMember(owner = "client!vo", name = "G", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_174 = new Class119("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

	@OriginalMember(owner = "client!vo", name = "N", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_175 = new Class119("flash1:", "blinken1:", "clignotant1:", "flash1:");

	@OriginalMember(owner = "client!vo", name = "P", descriptor = "[I")
	public static final int[] anIntArray490 = new int[13];

	@OriginalMember(owner = "client!vo", name = "R", descriptor = "I")
	public static final int anInt7287 = 1403;

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "(III)I")
	public static int method5699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local7 *= arg1;
			}
			arg0 >>= 0x1;
			arg1 *= arg1;
		}
		if (arg0 == 1) {
			return arg1 * local7;
		} else {
			return local7;
		}
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(IB)V")
	public static void method5700(@OriginalArg(0) int arg0) {
		Static233.anInt4144 = arg0;
		@Pc(7) Class102 local7 = Static311.aClass102_42;
		synchronized (Static311.aClass102_42) {
			Static311.aClass102_42.method2271();
		}
		local7 = Static218.aClass102_26;
		synchronized (Static218.aClass102_26) {
			Static218.aClass102_26.method2271();
		}
	}

	@OriginalMember(owner = "client!vo", name = "k", descriptor = "(I)V")
	public static void method5702() {
		if (Static289.anIntArray328 != null && Static98.anIntArray123 != null) {
			return;
		}
		Static289.anIntArray328 = new int[256];
		Static98.anIntArray123 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(22) double local22 = (double) local13 / 255.0D * 6.283185307179586D;
			Static289.anIntArray328[local13] = (int) (Math.sin(local22) * 4096.0D);
			Static98.anIntArray123[local13] = (int) (Math.cos(local22) * 4096.0D);
		}
	}
}
