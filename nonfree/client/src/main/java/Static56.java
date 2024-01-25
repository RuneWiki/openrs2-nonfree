import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static56 {

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "I")
	public static int anInt1868;

	@OriginalMember(owner = "client!bw", name = "d", descriptor = "Lclient!oh;")
	public static Class237 aClass237_17;

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "Z")
	public static final boolean aBoolean129 = false;

	@OriginalMember(owner = "client!bw", name = "c", descriptor = "[I")
	public static final int[] anIntArray74 = new int[6];

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(ILclient!wp;B)V")
	public static void method1616(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub8_Sub2 arg1) {
		Static48.aBoolean304 = false;
		Static94.anInt6311 = 0;
		Static203.method3756(arg1);
		Static365.method5682(arg1);
		if (Static48.aBoolean304) {
			System.out.println("---endgpp---");
		}
		if (arg1.anInt10588 != arg0) {
			throw new RuntimeException("gpi1 pos:" + arg1.anInt10588 + " psize:" + arg0);
		}
	}
}
