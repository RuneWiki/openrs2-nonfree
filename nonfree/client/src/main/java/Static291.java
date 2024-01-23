import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
	public static int anInt5650;

	@OriginalMember(owner = "client!vj", name = "i", descriptor = "Lclient!lg;")
	public static Class97 aClass97_22;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "Lclient!fa;")
	public static Class48 aClass48_1 = new Class48();

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "[I")
	public static int[] anIntArray457 = new int[2048];

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "Lclient!id;")
	public static Class4_Sub18 aClass4_Sub18_1 = new Class4_Sub18(0, 0);

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
	public static int anInt5649 = 0;

	@OriginalMember(owner = "client!vj", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString188 = "flash2:";

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method4528(@OriginalArg(0) String arg0) {
		if (Static209.aClass100_3 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(16) int local16 = 0; local16 < Static209.aClass100_3.anInt3236; local16++) {
			if (Static64.method1170(" ", Static209.aClass100_3.aStringArray22[local16], "<br>").equals(arg0)) {
				return local16;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
	public static void method4529() {
		Static84.aClass172_14.method4350();
	}
}
