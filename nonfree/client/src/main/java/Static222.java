import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!kt", name = "z", descriptor = "[I")
	public static int[] anIntArray416;

	@OriginalMember(owner = "client!kt", name = "u", descriptor = "I")
	public static int anInt4181 = 0;

	@OriginalMember(owner = "client!kt", name = "C", descriptor = "I")
	public static int anInt4188 = 0;

	@OriginalMember(owner = "client!kt", name = "O", descriptor = "Ljava/lang/String;")
	public static String aString35 = null;

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(III)V")
	public static void method3354(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class10_Sub1_Sub17 local11 = Static154.method2630(5, arg0);
		local11.method5345();
		local11.anInt6806 = arg1;
	}
}
