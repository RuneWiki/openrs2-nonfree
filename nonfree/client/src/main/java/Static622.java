import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static622 {

	@OriginalMember(owner = "client!vc", name = "t", descriptor = "I")
	public static int anInt9017;

	@OriginalMember(owner = "client!vc", name = "w", descriptor = "[F")
	public static final float[] aFloatArray65 = new float[2];

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZII)Lclient!wq;")
	public static Class394 method7590(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class394 local7 = Static238.method3422(arg1);
		if (arg0 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass394Array2 == null || arg0 >= local7.aClass394Array2.length) {
			return null;
		} else {
			return local7.aClass394Array2[arg0];
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(BII)Z")
	public static boolean method7592(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method7593(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		Static119.method1903(arg1, arg0, -1, -1);
	}
}
