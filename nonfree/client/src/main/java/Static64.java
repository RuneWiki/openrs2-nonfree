import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static64 {

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "Lclient!f;")
	public static Class38 aClass38_7;

	@OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
	public static int anInt1146;

	@OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
	public static int anInt1147;

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "Lclient!pca;")
	public static final Class263 aClass263_1 = new Class263();

	@OriginalMember(owner = "client!cg", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString14 = "";

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)I")
	public static int method1092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static94.aShortArrayArray7 == null ? 0 : Static94.aShortArrayArray7[arg0][arg1] & 0xFFFF;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
	public static void method1093() {
		if (Static135.anInt8199 == 6) {
			Static135.anInt8199 = 7;
		}
	}
}
