import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static297 {

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "Lclient!tl;")
	public static final Class227 aClass227_41 = new Class227(8);

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "Z")
	public static boolean aBoolean482 = false;

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
	public static int anInt5089 = 0;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)I")
	public static int method4473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static35.aByteArrayArray1 == null ? 0 : Static35.aByteArrayArray1[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZLclient!je;)I")
	public static int method4474(@OriginalArg(0) int arg0, @OriginalArg(2) Class117 arg1) {
		if (!Static50.method810(arg1).method2808(arg0) && arg1.anObjectArray16 == null) {
			return -1;
		} else if (arg1.anIntArray357 == null || arg0 >= arg1.anIntArray357.length) {
			return -1;
		} else {
			return arg1.anIntArray357[arg0];
		}
	}
}
