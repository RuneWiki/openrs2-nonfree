import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static339 {

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "[I")
	public static final int[] anIntArray361 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!lq;)V")
	public static void method5178(@OriginalArg(0) Class28_Sub1 arg0) {
		Static10.aClass65_1.H(arg0.anInt10781, arg0.anInt10779 + (arg0.method8976() >> 1), arg0.anInt10784, Static170.anIntArray166);
		arg0.anInt10783 = Static170.anIntArray166[0];
		arg0.anInt10778 = Static170.anIntArray166[1];
		arg0.anInt10777 = Static170.anIntArray166[2];
	}
}
