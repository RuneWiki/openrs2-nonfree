import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
	public static int anInt3014;

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "[I")
	public static final int[] anIntArray263 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
	public static int anInt3012 = 1;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZIB)Ljava/lang/String;")
	public static String method2825(@OriginalArg(1) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static515.method7895(arg0);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIBI)V")
	public static void method2827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class1_Sub2_Sub16 local15 = Static422.method6588(9, arg1);
		local15.method6693();
		local15.anInt7482 = arg0;
		local15.anInt7487 = arg2;
	}
}
