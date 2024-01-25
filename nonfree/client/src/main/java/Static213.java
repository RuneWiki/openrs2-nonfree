import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static213 {

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "I")
	public static int anInt4082 = -1;

	@OriginalMember(owner = "client!ko", name = "f", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_131 = new Class189("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!ko", name = "h", descriptor = "I")
	public static int anInt4087 = 503;

	@OriginalMember(owner = "client!ko", name = "j", descriptor = "I")
	public static int anInt4089 = 0;

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!mq;III)V")
	public static void method3264(@OriginalArg(0) Class156 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static238.aClass156_9 != null || Static438.aBoolean636 || (arg0 == null || Static67.method1324(arg0) == null)) {
			return;
		}
		Static238.aClass156_9 = arg0;
		Static89.aClass156_3 = Static67.method1324(arg0);
		Static255.aBoolean429 = false;
		Static428.anInt7012 = 0;
		Static123.anInt2620 = arg1;
		Static371.anInt6244 = arg2;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(BI)V")
	public static void method3266(@OriginalArg(1) int arg0) {
		Static339.anInt5767 = -1;
		if (arg0 == 37) {
			Static144.aFloat58 = 3.0F;
		} else if (arg0 == 50) {
			Static144.aFloat58 = 4.0F;
		} else if (arg0 == 75) {
			Static144.aFloat58 = 6.0F;
		} else if (arg0 == 100) {
			Static144.aFloat58 = 8.0F;
		} else if (arg0 == 200) {
			Static144.aFloat58 = 16.0F;
		}
		Static339.anInt5767 = -1;
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)V")
	public static void method3267() {
		if (Static120.anInt2584 == 10) {
			Static230.method3465(28);
		}
		if (Static120.anInt2584 == 30) {
			Static230.method3465(25);
		}
	}
}
