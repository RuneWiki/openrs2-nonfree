import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static306 {

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!mq", name = "e", descriptor = "Lclient!os;")
	public static final Class1_Sub17 aClass1_Sub17_6 = new Class1_Sub17(new byte[5000]);

	@OriginalMember(owner = "client!mq", name = "f", descriptor = "[I")
	public static final int[] anIntArray459 = new int[500];

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(III)Z")
	public static boolean method5364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static516.method7901(arg0, arg1) || Static420.method6572(arg0, arg1);
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(III)Z")
	public static boolean method5366(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x40000) != 0 | Static276.method7564(arg0, arg1) || Static461.method7923(arg1, arg0);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)V")
	public static void method5367() {
		Static210.anIntArray331 = Static99.method2037(0.4F);
	}
}
