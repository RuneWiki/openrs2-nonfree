import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!ov", name = "c", descriptor = "(I)V")
	public static void method6681() {
		Static399.aBoolean493 = true;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Ljava/awt/Frame;ILclient!iha;)V")
	public static void method6682(@OriginalArg(0) Frame arg0, @OriginalArg(2) Class173 arg1) {
		while (true) {
			@Pc(8) Class230 local8 = arg1.method4239(arg0);
			while (local8.anInt6256 == 0) {
				Static548.method7968(10L);
			}
			if (local8.anInt6256 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static548.method7968(100L);
		}
	}
}
