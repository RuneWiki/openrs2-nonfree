import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static401 {

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet6;

	@OriginalMember(owner = "client!ofa", name = "c", descriptor = "I")
	public static int anInt8426;

	@OriginalMember(owner = "client!ofa", name = "d", descriptor = "I")
	public static int anInt8427;

	@OriginalMember(owner = "client!ofa", name = "b", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_161 = new Class136(81, 6);

	@OriginalMember(owner = "client!ofa", name = "f", descriptor = "I")
	public static int anInt8429 = 1;

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(Lclient!rda;IIII)Lclient!qd;")
	public static Class24_Sub4_Sub1 method7256(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0.aBoolean681 || Static586.method8223(arg3) && Static586.method8223(arg2)) {
			return new Class24_Sub4_Sub1(arg0, 3553, arg1, arg3, arg2);
		} else if (arg0.aBoolean667) {
			return new Class24_Sub4_Sub1(arg0, 34037, arg1, arg3, arg2);
		} else {
			return new Class24_Sub4_Sub1(arg0, arg1, arg3, arg2, Static522.method6795(arg3), Static522.method6795(arg2));
		}
	}

	@OriginalMember(owner = "client!ofa", name = "c", descriptor = "()V")
	public static void method7259() {
		Static441.method6572(Static36.anInt662);
	}
}
