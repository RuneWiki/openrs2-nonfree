import java.awt.Graphics;
import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!ca", name = "l", descriptor = "Lclient!jb;")
	public static Class33 aClass33_7 = new Class33(64);

	@OriginalMember(owner = "client!ca", name = "r", descriptor = "Lclient!kd;")
	private static Class39 aClass39_288 = Static108.method1915("Please reload this page)3");

	@OriginalMember(owner = "client!ca", name = "o", descriptor = "Lclient!kd;")
	public static Class39 aClass39_287 = aClass39_288;

	@OriginalMember(owner = "client!ca", name = "s", descriptor = "Lclient!kd;")
	private static Class39 aClass39_289 = Static108.method1915("Remove");

	@OriginalMember(owner = "client!ca", name = "t", descriptor = "[I")
	public static int[] anIntArray93 = new int[200];

	@OriginalMember(owner = "client!ca", name = "u", descriptor = "Lclient!kd;")
	public static Class39 aClass39_290 = aClass39_289;

	@OriginalMember(owner = "client!ca", name = "v", descriptor = "I")
	public static int anInt551 = 2;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
	public static void method292() {
		aClass39_290 = null;
		aClass39_288 = null;
		aClass39_289 = null;
		aClass39_287 = null;
		anIntArray93 = null;
		aClass33_7 = null;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IZ)V")
	public static void method293(@OriginalArg(1) boolean arg0) {
		if (Static92.aClass79_2.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && Static92.aClass79_2.anEventQueue1.peekEvent() != null; local11++) {
			Static96.method1616(1L);
		}
		if (arg0) {
			Static92.aClass79_2.anEventQueue1.postEvent(new ActionEvent(Static16.aCanvas10, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(B)V")
	public static void method294() {
		if (Static71.aClass74_3 != null) {
			Static71.aClass74_3.method2047();
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
	public static void method295() {
		try {
			@Pc(6) Graphics local6 = Static16.aCanvas10.getGraphics();
			Static116.aClass6_19.method2067(550, 4, local6);
		} catch (@Pc(16) Exception local16) {
			Static16.aCanvas10.repaint();
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!ua;Lclient!pe;BI)V")
	public static void method296(@OriginalArg(0) Class62_Sub1 arg0, @OriginalArg(1) Class61 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) byte[] local7 = null;
		@Pc(9) Class31 local9 = Static1.aClass31_4;
		synchronized (Static1.aClass31_4) {
			for (@Pc(21) Class1_Sub3 local21 = (Class1_Sub3) Static1.aClass31_4.method1000(); local21 != null; local21 = (Class1_Sub3) Static1.aClass31_4.method1003()) {
				if ((long) arg2 == local21.aLong98 && local21.aClass61_1 == arg1 && local21.anInt151 == 0) {
					local7 = local21.aByteArray6;
					break;
				}
			}
		}
		if (local7 == null) {
			@Pc(68) byte[] local68 = arg1.method1572(arg2);
			arg0.method2024(local68, arg2, true, arg1);
		} else {
			arg0.method2024(local7, arg2, true, arg1);
		}
	}
}
