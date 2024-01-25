import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static492 {

	@OriginalMember(owner = "client!qs", name = "q", descriptor = "Lclient!vt;")
	public static Class295 aClass295_1;

	@OriginalMember(owner = "client!qs", name = "m", descriptor = "I")
	public static int anInt8231;

	@OriginalMember(owner = "client!qs", name = "r", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet2;

	@OriginalMember(owner = "client!qs", name = "p", descriptor = "I")
	public static int anInt8226 = 0;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(BII)V")
	public static void method7094(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(22) Class5_Sub5_Sub6 local22 = Static478.method6972((long) arg0 << 32 | (long) arg1, 19);
		local22.method2686();
	}
}
