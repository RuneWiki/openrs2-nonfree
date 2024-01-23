import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!on", name = "f", descriptor = "Lclient!gk;")
	public static Class67 aClass67_3;

	@OriginalMember(owner = "client!on", name = "g", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(III)I")
	public static int method3572(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub18 local8 = (Class1_Sub18) Static1.aClass86_1.method2136((long) arg1);
		if (local8 == null) {
			return 0;
		} else if (arg0 >= 0 && arg0 < local8.anIntArray218.length) {
			return local8.anIntArray218[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ID)V")
	public static void method3586(@OriginalArg(1) double arg0) {
		if (Static88.aDouble9 == arg0) {
			return;
		}
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			@Pc(21) int local21 = (int) (Math.pow((double) local8 / 255.0D, arg0) * 255.0D);
			Static192.anIntArray395[local8] = local21 > 255 ? 255 : local21;
		}
		Static88.aDouble9 = arg0;
	}
}
