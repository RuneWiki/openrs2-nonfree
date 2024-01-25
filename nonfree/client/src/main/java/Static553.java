import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static553 {

	@OriginalMember(owner = "client!vv", name = "i", descriptor = "F")
	public static float aFloat203;

	@OriginalMember(owner = "client!vv", name = "j", descriptor = "Lclient!rh;")
	public static Class275 aClass275_194;

	@OriginalMember(owner = "client!vv", name = "d", descriptor = "Z")
	public static final boolean aBoolean649 = false;

	@OriginalMember(owner = "client!vv", name = "e", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_190 = new Class40(21, 2);

	@OriginalMember(owner = "client!vv", name = "g", descriptor = "[S")
	public static short[] aShortArray145 = new short[256];

	@OriginalMember(owner = "client!vv", name = "h", descriptor = "I")
	public static int anInt9290 = 0;

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method7595(@OriginalArg(1) String arg0) {
		@Pc(14) String local14 = Static537.method7461(Static230.method3382(arg0));
		if (local14 == null) {
			local14 = "";
		}
		return local14;
	}
}
