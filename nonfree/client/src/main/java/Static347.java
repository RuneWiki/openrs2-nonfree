import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static347 {

	@OriginalMember(owner = "client!nfa", name = "o", descriptor = "I")
	public static int anInt6680;

	@OriginalMember(owner = "client!nfa", name = "q", descriptor = "F")
	public static float aFloat195;

	@OriginalMember(owner = "client!nfa", name = "t", descriptor = "Lclient!jn;")
	public static Class176 aClass176_87;

	@OriginalMember(owner = "client!nfa", name = "C", descriptor = "I")
	public static int anInt6686;

	@OriginalMember(owner = "client!nfa", name = "O", descriptor = "Lclient!kb;")
	public static Class183 aClass183_4;

	@OriginalMember(owner = "client!nfa", name = "P", descriptor = "Lclient!kb;")
	public static Class183 aClass183_5;

	@OriginalMember(owner = "client!nfa", name = "v", descriptor = "[S")
	public static final short[] aShortArray76 = new short[] { 15, 49, 9, 4, 22, 51, 46, 47 };

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method5595(@OriginalArg(0) String arg0) {
		Static574.method8209("", arg0, "", "", 0, 0);
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IBI)Z")
	public static boolean method5596(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static217.method8380(arg0, arg1) & (Static296.method5098(arg1, arg0) | (arg1 & 0x2000) != 0 | Static240.method7426(arg0, arg1));
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(III)Z")
	public static boolean method5597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x580) != 0;
	}
}
