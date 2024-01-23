import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static255 {

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
	public static int anInt5535;

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "Lclient!kb;")
	public static Class83 aClass83_175;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "[I")
	public static int[] anIntArray559 = new int[5];

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString178 = "purple:";

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(BILclient!ok;I)V")
	public static void method4318(@OriginalArg(1) int arg0, @OriginalArg(2) Class116 arg1, @OriginalArg(3) int arg2) {
		if (Static204.aClass116_11 != null || Static218.aBoolean267 || (arg1 == null || Static20.method4347(arg1) == null)) {
			return;
		}
		Static204.aClass116_11 = arg1;
		Static143.aClass116_8 = Static20.method4347(arg1);
		Static142.anInt3247 = 0;
		Static87.aBoolean110 = false;
		Static193.anInt4364 = arg0;
		Static265.anInt5771 = arg2;
	}
}
