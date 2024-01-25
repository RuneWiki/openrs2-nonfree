import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "Lclient!fc;")
	public static Class79 aClass79_7;

	@OriginalMember(owner = "client!lq", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString44;

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "I")
	public static int anInt3655 = 2;

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "Z")
	public static boolean aBoolean355 = false;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IBIII)V")
	public static void method2977(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class1_Sub6_Sub11 local8 = Static295.method4455(arg1, 4);
		local8.method3004();
		local8.anInt3686 = arg2;
		local8.anInt3679 = arg3;
		local8.anInt3676 = arg0;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)V")
	public static void method2978(@OriginalArg(0) int arg0) {
		Static371.anIntArray329 = new int[arg0];
		Static223.anIntArray479 = new int[arg0];
		Static275.anIntArray581 = new int[arg0];
		Static81.anIntArray196 = new int[arg0];
		Static277.anIntArray586 = new int[arg0];
	}
}
