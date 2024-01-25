import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static535 {

	@OriginalMember(owner = "client!sv", name = "i", descriptor = "I")
	public static int anInt9280;

	@OriginalMember(owner = "client!sv", name = "n", descriptor = "I")
	public static int anInt9282;

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "Lclient!gm;")
	public static final Class122 aClass122_11 = new Class122("", 14);

	@OriginalMember(owner = "client!sv", name = "k", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_158 = new Class73(96, 10);

	@OriginalMember(owner = "client!sv", name = "l", descriptor = "Lclient!hda;")
	public static final Class129 aClass129_8 = new Class129(7, 2);

	@OriginalMember(owner = "client!sv", name = "m", descriptor = "Lclient!f;")
	public static Class6_Sub5_Sub11 aClass6_Sub5_Sub11_1 = null;

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIII)V")
	public static void method7570(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(3) int local3 = arg0 << 3;
		@Pc(11) int local11 = arg1 << 3;
		Static595.aFloat184 = (float) local3;
		if (Static554.anInt9497 == 2) {
			Static404.anInt4286 = local11;
			Static349.anInt6848 = local3;
			anInt9282 = 0;
		}
		Static532.aFloat179 = (float) local11;
		Static229.method4152();
		Static94.aBoolean215 = true;
	}
}
