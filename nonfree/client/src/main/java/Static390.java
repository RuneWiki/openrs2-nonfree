import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!ti", name = "i", descriptor = "F")
	public static float aFloat150;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
	public static int anInt6394 = -1;

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString67 = "";

	@OriginalMember(owner = "client!ti", name = "g", descriptor = "Z")
	public static boolean aBoolean424 = false;

	@OriginalMember(owner = "client!ti", name = "p", descriptor = "[[I")
	public static final int[][] anIntArrayArray58 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!ti", name = "r", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_173 = new Class129(64, 1);

	@OriginalMember(owner = "client!ti", name = "u", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_109 = new Class198("wave2:", "welle2:", "ondulation2:", "onda2:");

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(III)I")
	public static int method5093(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(44) int local44 = Static119.method2857(arg1 + 91923, arg0 + 45365, 4) + (Static119.method2857(arg1 + 37821, arg0 - -10294, 2) - 128 >> 1) + (Static119.method2857(arg1, arg0, 1) + -128 >> 2) - 128;
		local44 = (int) ((double) local44 * 0.3D) + 35;
		if (local44 < 10) {
			local44 = 10;
		} else if (local44 > 60) {
			local44 = 60;
		}
		return local44;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZ)V")
	public static void method5094(@OriginalArg(0) int arg0) {
		if (!Static216.aClass1_Sub1_1.aBoolean301) {
			arg0 = -1;
		}
		if (Static203.anInt3350 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(25) Class72 local25 = Static272.aClass171_2.method3454(arg0);
			@Pc(29) Class214 local29 = local25.method1550();
			if (local29 == null) {
				arg0 = -1;
			} else {
				Static7.aClass93_1.method2090(local29.method4676(), local29.method4677(), Static246.aCanvas2, local29.method4666(), new Point(local25.anInt1892, local25.anInt1902));
				Static203.anInt3350 = arg0;
			}
		}
		if (arg0 == -1 && Static203.anInt3350 != -1) {
			Static7.aClass93_1.method2090(null, -1, Static246.aCanvas2, -1, new Point());
			Static203.anInt3350 = -1;
		}
	}
}
