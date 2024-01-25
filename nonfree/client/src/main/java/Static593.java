import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static593 {

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "Lclient!gba;")
	public static Class115 aClass115_15;

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "I")
	public static int anInt9755 = 0;

	@OriginalMember(owner = "client!wq", name = "h", descriptor = "[I")
	public static final int[] anIntArray723 = new int[14];

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Ljava/awt/Component;I)Lclient!jca;")
	public static Class173 method7990(@OriginalArg(0) Component arg0) {
		return new Class173_Sub1(arg0);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method7991(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = arg0.charAt(local12) + (local10 << 5) - local10;
		}
		return local10;
	}
}
