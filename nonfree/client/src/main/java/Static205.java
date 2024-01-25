import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!ho", name = "p", descriptor = "I")
	public static int anInt3767;

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString25 = null;

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_79 = new Class56(112, 8);

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIILclient!wn;)V")
	public static void method3349(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class41_Sub2_Sub1_Sub4_Sub2 arg2) {
		@Pc(6) int[] local6 = new int[4];
		Static601.method2820(local6, 0, local6.length, arg0);
		Static280.method4136(arg2, arg1, local6);
	}
}
