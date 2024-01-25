import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static455 {

	@OriginalMember(owner = "client!ph", name = "v", descriptor = "Lclient!gda;")
	public static Class126 aClass126_208;

	@OriginalMember(owner = "client!ph", name = "s", descriptor = "I")
	public static int anInt7375;

	@OriginalMember(owner = "client!ph", name = "t", descriptor = "I")
	public static int anInt7370 = 0;

	@OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
	public static int anInt7373 = 0;

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)V")
	public static void method6423() {
		if (Static604.aClass45_2 != null) {
			Static604.aClass45_2.method7454();
		}
		if (Static599.aClass45_1 != null) {
			Static599.aClass45_1.method7454();
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIII)I")
	public static int method6424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) int local16 = 65536 - Class42.anIntArray52[arg2 * 8192 / arg3] >> 1;
		return ((65536 - local16) * arg1 >> 16) + (arg0 * local16 >> 16);
	}
}
