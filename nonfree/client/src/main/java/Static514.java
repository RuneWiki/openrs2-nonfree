import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static514 {

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
	public static int anInt8683;

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "I")
	public static int anInt8682 = 0;

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "I")
	public static int anInt8684 = 0;

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!d;ILjava/awt/Canvas;I)Lclient!ha;")
	public static Class143 method7332(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2) {
		return new Class143_Sub2(arg2, arg0, arg1);
	}
}
