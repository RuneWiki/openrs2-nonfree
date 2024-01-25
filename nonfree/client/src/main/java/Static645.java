import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static645 {

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "[I")
	public static int[] anIntArray807;

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet2;

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "I")
	public static int anInt10796;

	@OriginalMember(owner = "client!vt", name = "d", descriptor = "Z")
	public static boolean aBoolean743;

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(III)V")
	public static void method9003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class14_Sub3_Sub9 local9 = Static142.method2219((long) arg0, 5);
		local9.method2817();
		local9.anInt3419 = arg1;
	}
}
