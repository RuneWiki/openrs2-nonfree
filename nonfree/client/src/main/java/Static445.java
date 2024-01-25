import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
	public static int anInt7718;

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "F")
	public static float aFloat162;

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "Lclient!ws;")
	public static final Class361 aClass361_55 = new Class361();

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
	public static int anInt7719 = 0;

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "[I")
	public static final int[] anIntArray556 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZ)V")
	public static void method6315(@OriginalArg(0) int arg0) {
		Static425.method6111();
		@Pc(16) int local16 = Static509.aClass208_6.method4919(arg0).anInt8846;
		if (local16 == 0) {
			return;
		}
		@Pc(27) int local27 = Static498.aClass101_1.anIntArray195[arg0];
		if (local16 == 6) {
			Static593.anInt9600 = local27;
		}
		if (local16 == 5) {
			Static51.anInt1132 = local27;
		}
	}
}
