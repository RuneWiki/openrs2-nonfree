import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static512 {

	@OriginalMember(owner = "client!raa", name = "c", descriptor = "F")
	public static float aFloat171;

	@OriginalMember(owner = "client!raa", name = "e", descriptor = "I")
	public static int anInt8472;

	@OriginalMember(owner = "client!raa", name = "g", descriptor = "Lclient!dfa;")
	public static final Class74 aClass74_59 = new Class74(8);

	@OriginalMember(owner = "client!raa", name = "i", descriptor = "[I")
	public static int[] anIntArray533 = null;

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(IILjava/awt/Canvas;I)Lclient!wu;")
	public static Class6_Sub41 method7385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2) {
		try {
			@Pc(8) Class local8 = Class.forName("vc");
			@Pc(12) Class6_Sub41 local12 = (Class6_Sub41) local8.getDeclaredConstructor().newInstance();
			local12.method8628(arg2, arg1, arg0);
			return local12;
		} catch (@Pc(29) Throwable local29) {
			@Pc(33) Class6_Sub41_Sub1 local33 = new Class6_Sub41_Sub1();
			local33.method8628(arg2, arg1, arg0);
			return local33;
		}
	}
}
