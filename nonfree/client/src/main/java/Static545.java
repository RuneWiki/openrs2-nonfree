import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static545 {

	@OriginalMember(owner = "client!va", name = "P", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas14;

	@OriginalMember(owner = "client!va", name = "Q", descriptor = "[[S")
	public static short[][] aShortArrayArray12;

	@OriginalMember(owner = "client!va", name = "R", descriptor = "I")
	public static int anInt9831;

	@OriginalMember(owner = "client!va", name = "N", descriptor = "Lclient!eg;")
	public static final Class82 aClass82_7 = new Class82();

	@OriginalMember(owner = "client!va", name = "a", descriptor = "([JI[I)V")
	public static void method7995(@OriginalArg(0) long[] arg0, @OriginalArg(2) int[] arg1) {
		Static555.method8089(0, arg1, arg0, arg0.length - 1);
	}
}
