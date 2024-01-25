import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!kj", name = "P", descriptor = "Lclient!da;")
	public static Class68 aClass68_8;

	@OriginalMember(owner = "client!kj", name = "L", descriptor = "Lclient!km;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!kj", name = "N", descriptor = "Lclient!jr;")
	public static final Class169 aClass169_34 = new Class169(4);

	@OriginalMember(owner = "client!kj", name = "e", descriptor = "(B)V")
	public static void method5315() {
		@Pc(10) int local10 = Static74.aClass2_Sub13_5.lb.method6912();
		if (local10 == 0) {
			Static612.aByteArrayArrayArray18 = null;
			Static24.method626(0);
		} else if (local10 == 1) {
			Static64.method1968((byte) 0);
			Static24.method626(512);
			if (Static476.aByteArrayArrayArray5 != null) {
				Static320.method5569();
			}
		} else {
			Static64.method1968((byte) (Static438.anInt8137 - 4 & 0xFF));
			Static24.method626(2);
		}
		Static550.anInt9875 = Static12.anInt172;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIB)Z")
	public static boolean method5316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x34) != 0;
	}
}
