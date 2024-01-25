import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static589 {

	@OriginalMember(owner = "client!wn", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString132;

	@OriginalMember(owner = "client!wn", name = "m", descriptor = "Lclient!ah;")
	public static Class9 aClass9_5;

	@OriginalMember(owner = "client!wn", name = "d", descriptor = "J")
	public static long aLong260 = 0L;

	@OriginalMember(owner = "client!wn", name = "k", descriptor = "I")
	public static int anInt10307 = 0;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIB)Z")
	public static boolean method8328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static548.method8015(arg1, arg0) | (arg0 & 0x70000) != 0 || Static237.method4127(arg0, arg1);
	}
}
