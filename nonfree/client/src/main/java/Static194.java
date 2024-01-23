import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!o", name = "C", descriptor = "Lclient!ie;")
	public static Class78 aClass78_7;

	@OriginalMember(owner = "client!o", name = "D", descriptor = "Lclient!wm;")
	public static Class3_Sub4_Sub24 aClass3_Sub4_Sub24_6;

	@OriginalMember(owner = "client!o", name = "E", descriptor = "Lclient!ho;")
	public static Class3_Sub4_Sub12 aClass3_Sub4_Sub12_2;

	@OriginalMember(owner = "client!o", name = "A", descriptor = "[Lclient!bg;")
	public static Class15[] aClass15Array1 = new Class15[14];

	@OriginalMember(owner = "client!o", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString133 = "cyan:";

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIII)V")
	public static void method3232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static9.anInt187 = -1;
		Static79.anInt1913 = -1;
		@Pc(13) float local13 = (float) Static228.anInt1432 / (float) Static228.anInt1434;
		@Pc(15) int local15 = arg1;
		@Pc(17) int local17 = arg3;
		if (local13 < 1.0F) {
			local17 = (int) (local13 * (float) arg1);
		} else {
			local15 = (int) ((float) arg3 / local13);
		}
		@Pc(44) int local44 = arg2 - (arg3 - local17) / 2;
		@Pc(61) int local61 = arg0 - (arg1 - local15) / 2;
		Static168.anInt3167 = Static228.anInt1432 * local44 / local17;
		Static158.anInt2949 = local61 * Static228.anInt1434 / local15;
		Static202.method3347();
	}
}
