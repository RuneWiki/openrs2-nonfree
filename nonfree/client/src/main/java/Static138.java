import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!fca", name = "p", descriptor = "I")
	public static int anInt2935;

	@OriginalMember(owner = "client!fca", name = "u", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(ILclient!lt;)I")
	public static int method2590(@OriginalArg(1) Class6_Sub26_Sub2 arg0) {
		@Pc(15) int local15 = arg0.method5008(2);
		@Pc(19) int local19;
		if (local15 == 0) {
			local19 = 0;
		} else if (local15 == 1) {
			local19 = arg0.method5008(5);
		} else if (local15 == 2) {
			local19 = arg0.method5008(8);
		} else {
			local19 = arg0.method5008(11);
		}
		return local19;
	}
}
