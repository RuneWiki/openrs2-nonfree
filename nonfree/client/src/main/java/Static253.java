import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!jp", name = "J", descriptor = "Lclient!eb;")
	public static final Class81 aClass81_6 = new Class81();

	@OriginalMember(owner = "client!jp", name = "M", descriptor = "[I")
	public static final int[] anIntArray436 = new int[250];

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(III)I")
	public static int method4246(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(BI)Lclient!tga;")
	public static Class315 method4247(@OriginalArg(1) int arg0) {
		@Pc(8) Class315[] local8 = Static140.method2844();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class315 local16 = local8[local10];
			if (local16.anInt8723 == arg0) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "(B)Z")
	public static boolean method4249() {
		if (Static529.aBoolean627) {
			try {
				Static611.method6758("showVideoAd", Static55.anApplet1);
				return true;
			} catch (@Pc(21) Throwable local21) {
			}
		}
		return false;
	}
}
