import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "[S")
	public static final short[] aShortArray52 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V")
	public static void method3199() {
		@Pc(1) Class109 local1 = Static142.aClass109_32;
		synchronized (Static142.aClass109_32) {
			Static142.aClass109_32.method2858();
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZILjava/awt/Component;)Lclient!kr;")
	public static Class118 method3201(@OriginalArg(2) Component arg0) {
		return new Class118_Sub1(arg0, true);
	}
}
