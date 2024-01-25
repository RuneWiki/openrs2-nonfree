import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static620 {

	@OriginalMember(owner = "client!va", name = "h", descriptor = "[Z")
	public static boolean[] aBooleanArray33;

	@OriginalMember(owner = "client!va", name = "i", descriptor = "I")
	public static int anInt10119;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Ljava/awt/Canvas;ILclient!d;IB)Lclient!ha;")
	public static Class132 method8555(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface6 arg2, @OriginalArg(3) int arg3) {
		return new Class132_Sub2(arg0, arg2, arg1, arg3);
	}
}
