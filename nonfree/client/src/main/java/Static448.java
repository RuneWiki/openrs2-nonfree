import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!r", name = "a", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_217 = new Class363(34, 8);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IILclient!fa;Ljava/awt/Canvas;Lclient!pl;I)Lclient!r;")
	public static synchronized Class100 method6213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface5 arg2, @OriginalArg(3) Canvas arg3, @OriginalArg(4) Class259 arg4) {
		if (arg1 == 0) {
			return Static579.method7831(arg2, arg3);
		} else if (arg1 == 2) {
			return Static114.method1695(arg3, arg2);
		} else if (arg1 == 1) {
			return Static406.method5918(arg0, arg3, arg2);
		} else if (arg1 == 5) {
			return Static2.method13(arg2, arg3, arg0, arg4);
		} else if (arg1 == 3) {
			return Static597.method325(arg4, arg3, arg2, arg0);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIB)V")
	public static void method6253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class2_Sub42 local6 = Static180.method3103();
		local6.aClass2_Sub15_Sub2_2.method4333(Static193.aClass180_7.anInt4831);
		local6.aClass2_Sub15_Sub2_2.method4333(arg0);
		local6.aClass2_Sub15_Sub2_2.method4333(arg3);
		local6.aClass2_Sub15_Sub2_2.method4350(arg2);
		local6.aClass2_Sub15_Sub2_2.method4350(arg1);
		Static531.method7296(local6);
		Static109.anInt2235 = 1;
		Static317.anInt5928 = 0;
		Static508.anInt8480 = 0;
		Static257.anInt4784 = -3;
	}
}
