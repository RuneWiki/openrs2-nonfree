import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!me", name = "i", descriptor = "I")
	public static int anInt5821;

	@OriginalMember(owner = "client!me", name = "j", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas11;

	@OriginalMember(owner = "client!me", name = "k", descriptor = "F")
	public static float aFloat120;

	@OriginalMember(owner = "client!me", name = "l", descriptor = "F")
	public static float aFloat121;

	@OriginalMember(owner = "client!me", name = "h", descriptor = "Lclient!lf;")
	public static final Class187 aClass187_21 = new Class187();

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIII)V")
	public static void method4835(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) String local35 = "tele " + arg2 + "," + (arg0 >> 6) + "," + (arg1 >> 6) + "," + (arg0 & 0x3F) + "," + (arg1 & 0x3F);
		System.out.println(local35);
		Static351.method5495(false, local35, true);
	}
}
