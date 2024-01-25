import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "Lclient!op;")
	public static Class135_Sub1 aClass135_Sub1_1;

	@OriginalMember(owner = "client!bq", name = "f", descriptor = "I")
	public static int anInt764;

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "Lclient!qu;")
	public static final Class204 aClass204_4 = new Class204(4, 1, 1, 1);

	@OriginalMember(owner = "client!bq", name = "d", descriptor = "[I")
	public static final int[] anIntArray60 = new int[] { 4, 4, 1, 2, 6, 4, 2, 47, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IZ)V")
	public static void method695(@OriginalArg(0) int arg0) {
		Static138.anInt6309 = arg0;
		Static161.anInt3016 = -1;
		Static161.anInt3016 = -1;
		Static397.method5305();
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IB)V")
	public static void method696(@OriginalArg(0) int arg0) {
		if (!aClass135_Sub1_1.aBoolean368) {
			arg0 = -1;
		}
		if (arg0 == Static314.anInt5415) {
			return;
		}
		if (arg0 != -1) {
			@Pc(29) Class87 local29 = Static305.aClass84_2.method2219(arg0);
			@Pc(33) Class51 local33 = local29.method2236();
			if (local33 == null) {
				arg0 = -1;
			} else {
				Static77.aClass180_1.method4091(new Point(local29.anInt2565, local29.anInt2562), local33.method1449(), local33.method1448(), Static155.aCanvas4, local33.method1443());
				Static314.anInt5415 = arg0;
			}
		}
		if (arg0 == -1 && Static314.anInt5415 != -1) {
			Static77.aClass180_1.method4091(new Point(), null, -1, Static155.aCanvas4, -1);
			Static314.anInt5415 = -1;
		}
	}
}
