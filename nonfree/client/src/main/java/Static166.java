import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!la", name = "t", descriptor = "Lclient!wo;")
	public static Class216 aClass216_59;

	@OriginalMember(owner = "client!la", name = "v", descriptor = "[Lclient!c;")
	public static Class5[] aClass5Array14;

	@OriginalMember(owner = "client!la", name = "o", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_109 = new Class34(" is already on your friend list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

	@OriginalMember(owner = "client!la", name = "u", descriptor = "[I")
	public static final int[] anIntArray328 = new int[50];

	@OriginalMember(owner = "client!la", name = "w", descriptor = "I")
	public static int anInt3592 = 0;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZI)V")
	public static void method3354(@OriginalArg(1) int arg0) {
		Static323.method5269();
		@Pc(10) int local10 = Static208.method3948(arg0).anInt4968;
		if (local10 == 0) {
			return;
		}
		@Pc(23) int local23 = Static30.anIntArray104[arg0];
		if (local10 == 5) {
			Static270.anInt5519 = local23;
		}
		if (local10 == 6) {
			Static133.anInt2966 = local23;
		}
	}
}
