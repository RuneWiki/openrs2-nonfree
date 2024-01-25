import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!of", name = "u", descriptor = "[Lclient!hm;")
	public static final Class156[] aClass156Array1 = new Class156[4];

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!kj;BLjava/awt/Frame;)V")
	public static void method6179(@OriginalArg(0) Class202 arg0, @OriginalArg(2) Frame arg1) {
		while (true) {
			@Pc(8) Class297 local8 = arg0.method4727(arg1);
			while (local8.anInt8459 == 0) {
				Static127.method1985(10L);
			}
			if (local8.anInt8459 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static127.method1985(100L);
		}
	}
}
