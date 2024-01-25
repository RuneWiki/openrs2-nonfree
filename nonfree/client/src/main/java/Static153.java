import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame3;

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "[I")
	public static final int[] anIntArray191 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method2617(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIB)V")
	public static void method2619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class3_Sub6_Sub7 local9 = Static198.method3146((long) arg1, 5);
		local9.method1712();
		local9.anInt1790 = arg0;
	}
}
