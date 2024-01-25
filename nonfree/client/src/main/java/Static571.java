import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static571 {

	@OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
	public static int anInt9281 = 0;

	@OriginalMember(owner = "client!wa", name = "n", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_98 = new Class303(63, 16);

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)V")
	public static void method7686(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class344 local13 = Static554.aClass344ArrayArray1[arg1][arg0];
		if (local13 != null) {
			Static395.anInt6905 = local13.anInt8742;
			Static135.anInt2940 = local13.anInt8741;
			Static115.anInt6760 = local13.anInt8735;
		}
		Static582.method4497();
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(III)I")
	public static int method7696(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static517.anIntArray537[arg0 & 0x3] : Static444.anIntArray465[arg0 & 0x3];
	}
}
