import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static716 {

	@OriginalMember(owner = "client!wl", name = "l", descriptor = "Lclient!nca;")
	public static Class254 aClass254_170;

	@OriginalMember(owner = "client!wl", name = "h", descriptor = "I")
	public static int anInt10910;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "F")
	public static float aFloat177;

	@OriginalMember(owner = "client!wl", name = "n", descriptor = "I")
	public static final int anInt10909 = 1406;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method9519(@OriginalArg(0) String arg0) {
		return Static189.method2694(arg0);
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V")
	public static void method9520() {
		for (@Pc(19) Class2_Sub44 local19 = (Class2_Sub44) Static426.aClass218_29.method5092(); local19 != null; local19 = (Class2_Sub44) Static426.aClass218_29.method5096()) {
			if (local19.aBoolean618) {
				local19.aBoolean618 = false;
			} else {
				Static581.method8086(local19.anInt7300);
			}
		}
	}
}
