import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!am", name = "c", descriptor = "I")
	public static int anInt303;

	@OriginalMember(owner = "client!am", name = "b", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_10 = new Class215(40, -1);

	@OriginalMember(owner = "client!am", name = "d", descriptor = "[I")
	public static final int[] anIntArray17 = new int[3];

	@OriginalMember(owner = "client!am", name = "e", descriptor = "[Lclient!bja;")
	public static final Class37_Sub1[] aClass37_Sub1Array1 = new Class37_Sub1[37];

	@OriginalMember(owner = "client!am", name = "f", descriptor = "[I")
	public static final int[] anIntArray18 = new int[250];

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIII)V")
	public static void method369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static511.anInt9364; local3++) {
			@Pc(9) Rectangle local9 = Class272.aRectangleArray2[local3];
			if (local9.width + local9.x > arg0 && local9.x < arg1 + arg0 && local9.y + local9.height > arg2 && local9.y < arg2 + arg3) {
				Static403.aBooleanArray18[local3] = true;
			}
		}
		Static113.method2842(arg0, arg0 + arg1, arg2, arg3 + arg2);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!ga;ZZ)V")
	public static void method370(@OriginalArg(0) Class3_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		arg0.aBoolean706 = arg1;
		if (Static218.aBoolean365) {
			Static78.aClass59Array1[Static78.aClass59Array1.length - 1].method2121(arg0);
		} else {
			Static237.method4459(arg0, Static359.aClass2_Sub1Array4);
		}
	}
}
