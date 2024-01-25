import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static29 {

	@OriginalMember(owner = "client!bba", name = "c", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_12 = new Class47(22, 4);

	@OriginalMember(owner = "client!bba", name = "d", descriptor = "I")
	public static int anInt855 = -1;

	@OriginalMember(owner = "client!bba", name = "e", descriptor = "I")
	public static int anInt856 = -1;

	@OriginalMember(owner = "client!bba", name = "k", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_13 = new Class73(5, -2);

	@OriginalMember(owner = "client!bba", name = "l", descriptor = "[I")
	public static final int[] anIntArray42 = new int[4096];

	@OriginalMember(owner = "client!bba", name = "m", descriptor = "I")
	public static int anInt860 = -1;

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(Lclient!qf;II)V")
	public static void method889(@OriginalArg(0) Class6_Sub21_Sub2 arg0, @OriginalArg(1) int arg1) {
		Static554.anInt9174 = 0;
		Static365.aBoolean445 = false;
		Static522.method7161(arg0);
		Static406.method5938(arg0);
		if (Static365.aBoolean445) {
			System.out.println("---endgpp---");
		}
		if (arg0.anInt7338 != arg1) {
			throw new RuntimeException("gpi1 pos:" + arg0.anInt7338 + " psize:" + arg1);
		}
	}
}
