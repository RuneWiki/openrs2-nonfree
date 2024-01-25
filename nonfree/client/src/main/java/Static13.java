import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!aga", name = "c", descriptor = "I")
	public static int anInt231;

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(III)V")
	public static void method183(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub5_Sub16 local8 = Static219.method3587(arg0, 16);
		local8.method7133();
		local8.anInt8736 = arg1;
	}
}
