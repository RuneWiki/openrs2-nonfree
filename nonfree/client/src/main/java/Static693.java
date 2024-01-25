import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static693 {

	@OriginalMember(owner = "client!vp", name = "l", descriptor = "Lclient!kw;")
	public static Class178 aClass178_30;

	@OriginalMember(owner = "client!vp", name = "s", descriptor = "Lclient!qw;")
	public static final Class319 aClass319_14 = new Class319();

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIIB)V")
	public static void method9178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static303.anInt4881 == arg0 && Static119.anInt6368 == arg1 && Static424.anInt6490 == arg2) {
			return;
		}
		Static424.anInt6490 = arg2;
		Static119.anInt6368 = arg1;
		Static303.anInt4881 = arg0;
		Static632.aBoolean653 = true;
		@Pc(51) double local51 = -((double) (arg0 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(61) double local61 = -((double) (arg1 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(64) double local64 = Math.cos(local61);
		@Pc(67) double local67 = Math.sin(local61);
		@Pc(70) double local70 = Math.cos(local51);
		@Pc(73) double local73 = Math.sin(local51);
		Static112.aDouble1 = local70;
		Static638.aDouble23 = local64;
		Static442.aDouble15 = local73;
		Static640.aDouble24 = 0.0D;
		Static381.aDouble11 = local67;
		Static504.aDouble18 = -local67 * local70;
		Static602.aDouble21 = local73 * local67;
		Static404.aDouble13 = local64 * local70;
		Static452.aDouble16 = local73 * -local64;
	}
}
