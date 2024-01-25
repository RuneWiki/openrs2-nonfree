import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static641 {

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "S")
	public static short aShort121 = 256;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(BLclient!cs;)Ljava/lang/String;")
	public static String method8970(@OriginalArg(1) Class6_Sub2_Sub4 arg0) {
		if (arg0.aString18 == null || arg0.aString18.length() == 0) {
			return arg0.aString20 == null || arg0.aString20.length() <= 0 ? arg0.aString19 : arg0.aString19 + Static317.aClass192_32.method5299(Static307.anInt5931) + arg0.aString20;
		} else if (arg0.aString20 == null || arg0.aString20.length() <= 0) {
			return arg0.aString19 + Static317.aClass192_32.method5299(Static307.anInt5931) + arg0.aString18;
		} else {
			return arg0.aString19 + Static317.aClass192_32.method5299(Static307.anInt5931) + arg0.aString20 + Static317.aClass192_32.method5299(Static307.anInt5931) + arg0.aString18;
		}
	}
}
