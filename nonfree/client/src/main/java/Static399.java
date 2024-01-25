import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!pfa", name = "G", descriptor = "Lclient!eca;")
	public static final Class1_Sub19 aClass1_Sub19_1 = new Class1_Sub19(0, 0);

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(BI)V")
	public static void method5767(@OriginalArg(1) int arg0) {
		if (!Static86.aClass1_Sub30_Sub1_1.aBoolean481) {
			arg0 = -1;
		}
		if (Static389.anInt6933 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(25) Class143 local25 = Static215.aClass18_2.method495(arg0);
			@Pc(29) Class282 local29 = local25.method3094();
			if (local29 == null) {
				arg0 = -1;
			} else {
				Static361.aClass198_3.method4301(local29.method6028(), Static103.aCanvas2, local29.method6019(), new Point(local25.anInt3816, local25.anInt3809), local29.method6016());
				Static389.anInt6933 = arg0;
			}
		}
		if (arg0 == -1 && Static389.anInt6933 != -1) {
			Static361.aClass198_3.method4301(-1, Static103.aCanvas2, -1, new Point(), null);
			Static389.anInt6933 = -1;
		}
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Lclient!sea;ZIIZII)V")
	public static void method5768(@OriginalArg(0) Class308 arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int arg2) {
		Static215.anInt3929 = 0;
		Static429.anInt7683 = arg1;
		Static403.anInt7226 = arg2;
		Static144.aClass1_Sub6_Sub2_4 = null;
		Static148.aClass308_59 = arg0;
		Static167.aBoolean229 = false;
		Static2.anInt71 = 1;
		Static23.anInt578 = 2;
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IB)I")
	public static int method5769(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
