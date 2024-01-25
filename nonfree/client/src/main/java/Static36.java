import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static36 {

	@OriginalMember(owner = "client!bda", name = "J", descriptor = "B")
	public static byte aByte14;

	@OriginalMember(owner = "client!bda", name = "U", descriptor = "I")
	public static int anInt609;

	@OriginalMember(owner = "client!bda", name = "T", descriptor = "I")
	public static int anInt617;

	@OriginalMember(owner = "client!bda", name = "P", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_23 = new Class251(33, 8);

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILclient!sfa;)Ljava/lang/String;")
	public static String method632(@OriginalArg(1) Class14_Sub2_Sub17 arg0) {
		return arg0.aString104 + " <col=ffffff>>";
	}

	@OriginalMember(owner = "client!bda", name = "c", descriptor = "(BII)Z")
	public static boolean method634(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static221.method3810(arg1, arg0) | (arg1 & 0x70000) != 0 || Static282.method4747(arg1, arg0);
	}
}
