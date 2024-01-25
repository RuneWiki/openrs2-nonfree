import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static17 {

	@OriginalMember(owner = "client!am", name = "a", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_16 = new Class150(88, 11);

	@OriginalMember(owner = "client!am", name = "c", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_17 = new Class150(54, 6);

	@OriginalMember(owner = "client!am", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString14 = "";

	@OriginalMember(owner = "client!am", name = "e", descriptor = "I")
	public static int anInt459 = -1;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method594(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}
}
