import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static189 {

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
	public static int anInt3569;

	@OriginalMember(owner = "client!jk", name = "j", descriptor = "[I")
	public static int[] anIntArray236;

	@OriginalMember(owner = "client!jk", name = "e", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_160 = new Class22(79, 6);

	@OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
	public static int anInt3572 = 0;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!cw;II)V")
	public static void method2942(@OriginalArg(0) Class4_Sub12_Sub1 arg0, @OriginalArg(2) int arg1) {
		Static449.aBoolean689 = false;
		Static441.anInt7199 = 0;
		Static31.method617(arg0);
		Static173.method2814(arg0);
		if (Static449.aBoolean689) {
			System.out.println("---endgpp---");
		}
		if (arg1 != arg0.anInt2997) {
			throw new RuntimeException("gpi1 pos:" + arg0.anInt2997 + " psize:" + arg1);
		}
	}
}
