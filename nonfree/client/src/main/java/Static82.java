import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_49 = new Class158("flash3:", "blinken3:", "clignotant3:", "brilho3:");

	@OriginalMember(owner = "client!dq", name = "g", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_45 = new Class263(21, -1);

	@OriginalMember(owner = "client!dq", name = "m", descriptor = "[F")
	public static final float[] aFloatArray13 = new float[4];

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(B)V")
	public static void method1506() {
		Static261.aClass38_26.method774();
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIII)Z")
	public static boolean method1509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static215.method3366(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Static198.anInt7947;
			@Pc(14) int local14 = arg2 << Static198.anInt7947;
			return Static333.method4696(local10 + 1, Static396.aClass96Array5[arg0].ua(arg1, arg2) + arg3, local14 + 1) && Static333.method4696(local10 + Static251.anInt4890 - 1, Static396.aClass96Array5[arg0].ua(arg1 + 1, arg2) + arg3, local14 + 1) && Static333.method4696(local10 + Static251.anInt4890 - 1, Static396.aClass96Array5[arg0].ua(arg1 + 1, arg2 + 1) + arg3, local14 + Static251.anInt4890 - 1) && Static333.method4696(local10 + 1, Static396.aClass96Array5[arg0].ua(arg1, arg2 + 1) + arg3, local14 + Static251.anInt4890 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dq", name = "c", descriptor = "(I)V")
	public static void method1510() {
		@Pc(5) Class117[] local5 = Class41_Sub2.aClass117Array1;
		synchronized (Class41_Sub2.aClass117Array1) {
			for (@Pc(14) int local14 = 0; local14 < Class41_Sub2.aClass117Array1.length; local14++) {
				Class41_Sub2.aClass117Array1[local14] = new Class117();
				Static93.anIntArray609[local14] = 0;
			}
		}
	}
}
