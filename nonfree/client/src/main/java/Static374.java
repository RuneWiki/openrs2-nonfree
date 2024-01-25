import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static374 {

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "Lclient!wv;")
	public static Class2_Sub51 aClass2_Sub51_1;

	@OriginalMember(owner = "client!pn", name = "e", descriptor = "I")
	public static int anInt6956;

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "I")
	public static int anInt6954 = 0;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method5905(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}
}
