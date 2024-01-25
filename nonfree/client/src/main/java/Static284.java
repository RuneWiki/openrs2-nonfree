import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_60 = new Class179(47, 2);

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(I)V")
	public static void method3921() {
		Static507.anInt8466 = -1;
		Static349.anInt5482 = -1;
		Static621.anInt9980 = -1;
		Static502.anInt2999 = 0;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(Ljava/lang/Object;Lclient!mr;Z)V")
	public static void method3923(@OriginalArg(0) Object arg0, @OriginalArg(1) Class226 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg1.anEventQueue1.peekEvent() != null; local11++) {
			Static444.method6061(1L);
		}
		try {
			if (arg0 != null) {
				arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
			}
		} catch (@Pc(42) Exception local42) {
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(IIB[B)[B")
	public static byte[] method3924(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		@Pc(11) byte[] local11 = new byte[32768];
		Static653.method5398(arg1, arg0, local11, 0, 32768);
		return local11;
	}
}
