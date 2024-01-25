import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!qu", name = "q", descriptor = "I")
	public static int anInt6117;

	@OriginalMember(owner = "client!qu", name = "n", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray29 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!qu", name = "p", descriptor = "I")
	public static int anInt6116 = 0;

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(III)V")
	public static void method4845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class1_Sub1_Sub1 local10 = Static190.method3007(arg1, 7);
		local10.method32();
		local10.anInt35 = arg0;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(II)I")
	public static int method4846(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
