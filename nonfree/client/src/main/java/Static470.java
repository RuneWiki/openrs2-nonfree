import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static470 {

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
	public static int anInt6888;

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "Lclient!ft;")
	public static final Class107 aClass107_7 = new Class107();

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "[I")
	public static final int[] anIntArray671 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "()V")
	public static void method6219() {
		Static294.method5133(Static63.anInt1587);
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(II)V")
	public static void method6220(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub2_Sub16 local8 = Static422.method6588(5, arg0);
		local8.method6700();
	}
}
