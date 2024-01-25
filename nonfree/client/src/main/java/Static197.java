import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static197 {

	@OriginalMember(owner = "client!i", name = "f", descriptor = "Lclient!vb;")
	public static Class297 aClass297_2;

	@OriginalMember(owner = "client!i", name = "g", descriptor = "Lclient!vv;")
	public static Class307 aClass307_6;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray21 = new int[2][][];

	@OriginalMember(owner = "client!i", name = "b", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_364 = new Class296(44, 3);

	@OriginalMember(owner = "client!i", name = "c", descriptor = "Lclient!jq;")
	public static Class156 aClass156_16 = null;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method7005(@OriginalArg(0) String arg0) {
		return Static543.method7540(arg0, 10);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(III)V")
	public static void method7009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static481.anInt7987 == 1) {
			Static484.method6632(arg0, arg1, Static109.aClass1_Sub24_4);
		} else if (Static481.anInt7987 == 2) {
			Static95.method1650(arg1, arg0);
		}
		Static481.anInt7987 = 0;
		Static109.aClass1_Sub24_4 = null;
	}
}
