import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!iv", name = "f", descriptor = "I")
	public static int anInt4961;

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "Lclient!st;")
	public static final Class314 aClass314_77 = new Class314(9, 4);

	@OriginalMember(owner = "client!iv", name = "g", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_142 = new Class194(44, 1);

	@OriginalMember(owner = "client!iv", name = "h", descriptor = "Z")
	public static boolean aBoolean362 = false;

	@OriginalMember(owner = "client!iv", name = "i", descriptor = "Z")
	public static boolean aBoolean363 = false;

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(I)[Lclient!pb;")
	public static Class261[] method4224() {
		return new Class261[] { Static212.aClass261_1, Static498.aClass261_6, Static355.aClass261_8 };
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(BIII)V")
	public static void method4225(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static495.anInt8393 == arg0 && Static107.anInt2177 == arg2 && arg1 == Static16.anInt245) {
			return;
		}
		Static334.aBoolean462 = true;
		Static107.anInt2177 = arg2;
		Static16.anInt245 = arg1;
		Static495.anInt8393 = arg0;
		@Pc(39) double local39 = -((double) (arg0 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(49) double local49 = -((double) (arg2 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(52) double local52 = Math.cos(local49);
		@Pc(55) double local55 = Math.sin(local49);
		@Pc(58) double local58 = Math.cos(local39);
		@Pc(61) double local61 = Math.sin(local39);
		Static208.aDouble6 = local58;
		Static109.aDouble2 = local52 * local58;
		Static328.aDouble13 = local55;
		Static350.aDouble14 = local61 * -local52;
		Static374.aDouble12 = local58 * -local55;
		Static498.aDouble19 = local61;
		Static509.aDouble17 = local52;
		Static114.aDouble3 = 0.0D;
		Static184.aDouble5 = local61 * local55;
	}
}
