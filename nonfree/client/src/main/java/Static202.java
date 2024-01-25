import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!hca", name = "c", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!hca", name = "h", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_124 = new Class288(82, 1);

	@OriginalMember(owner = "client!hca", name = "n", descriptor = "I")
	public static int anInt3422 = 0;

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)V")
	public static void method2856() {
		if (Static262.anInt5604 != -1) {
			Static545.method7522(Static262.anInt5604, -1, -1, false);
			Static262.anInt5604 = -1;
		}
	}

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "(I)V")
	public static void method2859() {
		@Pc(7) Class92 local7 = null;
		try {
			local7 = Static359.method4856("2");
			@Pc(20) Class2_Sub22 local20 = new Class2_Sub22(Static532.anInt8750 * 6 + 3);
			local20.method8537(1);
			local20.method8500(Static532.anInt8750);
			for (@Pc(34) int local34 = 0; local34 < Static171.anIntArray203.length; local34++) {
				if (Static410.aBooleanArray116[local34]) {
					local20.method8500(local34);
					local20.method8552(Static171.anIntArray203[local34]);
				}
			}
			local7.method1839(local20.aByteArray115, local20.anInt10247, 0);
		} catch (@Pc(65) Exception local65) {
		}
		try {
			if (local7 != null) {
				local7.method1845();
			}
		} catch (@Pc(72) Exception local72) {
		}
		Static74.aLong49 = Static476.method6413();
		Static365.aBoolean427 = false;
	}
}
