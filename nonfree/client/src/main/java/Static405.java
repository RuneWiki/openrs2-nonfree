import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
	public static int anInt7035;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_172 = new Class25(13, -2);

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
	public static int anInt7034 = 0;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "[F")
	public static final float[] aFloatArray29 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "Z")
	public static final boolean aBoolean467 = false;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIII)V")
	public static void method5643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 >= Static347.anInt6160 && Static385.anInt6686 >= arg3) {
			@Pc(19) int local19 = Static301.method3387(Static123.anInt2069, Static118.anInt2005, arg0);
			@Pc(25) int local25 = Static301.method3387(Static123.anInt2069, Static118.anInt2005, arg1);
			Static190.method2747(local19, local25, arg3, arg2);
		}
	}
}
