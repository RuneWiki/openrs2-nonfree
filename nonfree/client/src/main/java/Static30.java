import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static30 {

	@OriginalMember(owner = "client!aw", name = "f", descriptor = "I")
	public static int anInt495;

	@OriginalMember(owner = "client!aw", name = "g", descriptor = "I")
	public static int anInt491 = 0;

	@OriginalMember(owner = "client!aw", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray4 = new String[100];

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "Lclient!wq;")
	public static final Class391 aClass391_4 = new Class391(8);

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IB)Lclient!fe;")
	public static Class121 method490() {
		return new Class121(1, false);
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(BI)Lclient!iu;")
	public static Class180_Sub1 method492(@OriginalArg(1) int arg0) {
		return Static537.aBoolean294 && arg0 >= Static466.anInt7934 && Static463.anInt7897 >= arg0 ? Static407.aClass180_Sub1Array2[arg0 - Static466.anInt7934] : null;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(II)Z")
	public static boolean method493(@OriginalArg(0) int arg0) {
		if (arg0 == 58 || arg0 == 44 || arg0 == 18 || arg0 == 49 || arg0 == 57) {
			return true;
		} else {
			return arg0 == 30 || arg0 == 1009;
		}
	}
}
