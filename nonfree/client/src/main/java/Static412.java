import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static412 {

	@OriginalMember(owner = "client!pk", name = "P", descriptor = "I")
	public static int anInt7415;

	@OriginalMember(owner = "client!pk", name = "R", descriptor = "Lclient!ps;")
	public static Class262 aClass262_6;

	@OriginalMember(owner = "client!pk", name = "N", descriptor = "I")
	public static final int anInt7414 = Static402.method5690(1600);

	@OriginalMember(owner = "client!pk", name = "O", descriptor = "Lclient!ac;")
	public static final Class5 aClass5_7 = new Class5("LIVE", 0);

	@OriginalMember(owner = "client!pk", name = "S", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray34 = new String[100];

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIB)Z")
	public static boolean method5786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10) != 0;
	}
}
