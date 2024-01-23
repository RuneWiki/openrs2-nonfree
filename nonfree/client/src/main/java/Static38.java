import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!ck", name = "x", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!ck", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString17 = "red:";

	@OriginalMember(owner = "client!ck", name = "w", descriptor = "I")
	public static int anInt750 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILclient!lc;)V")
	public static void method622(@OriginalArg(1) Class98 arg0) {
		Static10.aClass98_2 = arg0;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(I[S)[S")
	public static short[] method623(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(20) short[] local20 = new short[arg0.length];
			Static307.method3241(arg0, 0, local20, 0, arg0.length);
			return local20;
		}
	}

	@OriginalMember(owner = "client!ck", name = "d", descriptor = "(I)V")
	public static void method624() {
		aString17 = null;
		anIntArrayArrayArray3 = null;
	}
}
