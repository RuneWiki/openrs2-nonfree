import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "Lclient!he;")
	public static Class126 aClass126_2;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "Lclient!ss;")
	public static Class273 aClass273_1;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "F")
	public static float aFloat148;

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "Lclient!si;")
	public static Class266 aClass266_1;

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "Lclient!sw;")
	public static final Class277 aClass277_58 = new Class277(64);

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
	public static final int anInt7701 = 52;

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_393 = new Class305(33, -2);

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "[C")
	public static final char[] aCharArray7 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!vi;)I")
	public static int method6821(@OriginalArg(1) Class20_Sub1_Sub1_Sub2 arg0) {
		@Pc(8) Class283 local8 = arg0.aClass283_1;
		if (local8.anIntArray743 != null) {
			local8 = local8.method7368(Static417.aClass10_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(23) int local23 = local8.anInt8415;
		@Pc(27) Class299 local27 = arg0.method7819();
		if (arg0.aBoolean677) {
			local23 = local8.anInt8450;
		} else if (arg0.anInt9030 == local27.anInt8814 || arg0.anInt9030 == local27.anInt8834 || local27.anInt8817 == arg0.anInt9030 || arg0.anInt9030 == local27.anInt8843) {
			local23 = local8.anInt8427;
		} else if (arg0.anInt9030 == local27.anInt8826 || local27.anInt8844 == arg0.anInt9030 || local27.anInt8827 == arg0.anInt9030 || local27.anInt8818 == arg0.anInt9030) {
			local23 = local8.anInt8449;
		}
		return local23;
	}
}
