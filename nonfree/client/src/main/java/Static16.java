import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static16 {

	@OriginalMember(owner = "client!am", name = "D", descriptor = "[F")
	public static final float[] aFloatArray2 = new float[4];

	@OriginalMember(owner = "client!am", name = "O", descriptor = "I")
	public static int anInt469 = 0;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "([J[Ljava/lang/Object;B)V")
	public static void method368(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1) {
		Static144.method2804(arg0, arg0.length - 1, 0, arg1);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!ji;B)Lclient!eea;")
	public static Class79_Sub1 method369(@OriginalArg(0) Class6_Sub21 arg0) {
		return new Class79_Sub1(arg0.method6058(), arg0.method6058(), arg0.method6058(), arg0.method6058(), arg0.method6031(), arg0.method6069());
	}
}
