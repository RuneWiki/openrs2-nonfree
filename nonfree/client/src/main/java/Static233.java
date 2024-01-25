import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "Lclient!ii;")
	public static Class111 aClass111_7;

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
	public static int anInt4155;

	@OriginalMember(owner = "client!ng", name = "f", descriptor = "Lclient!tr;")
	public static Class110 aClass110_9;

	@OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
	public static int anInt4157;

	@OriginalMember(owner = "client!ng", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray27 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZIII)V")
	public static void method3862(@OriginalArg(0) boolean arg0) {
		Static2.anInt60 = 2;
		Static340.aBoolean439 = arg0;
		Static374.anInt6244 = 22050;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIB)V")
	public static void method3863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class3_Sub7_Sub8 local12 = Static275.method4307(14, arg0);
		local12.method3219();
		local12.anInt3670 = arg1;
	}
}
