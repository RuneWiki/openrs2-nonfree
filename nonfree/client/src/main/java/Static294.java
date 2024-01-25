import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static294 {

	@OriginalMember(owner = "client!la", name = "g", descriptor = "I")
	public static int anInt9620 = 0;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(JJ)J")
	public static long method7719(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(B)Ljava/lang/String;")
	public static String method7720() {
		return Static572.aBoolean774 || Static506.aClass2_Sub27_3 == null ? "" : Static506.aClass2_Sub27_3.aString53;
	}
}
