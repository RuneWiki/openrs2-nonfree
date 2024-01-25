import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static6 {

	@OriginalMember(owner = "client!aca", name = "k", descriptor = "I")
	public static int anInt162;

	@OriginalMember(owner = "client!aca", name = "h", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_7 = new Class362(9, 5);

	@OriginalMember(owner = "client!aca", name = "i", descriptor = "I")
	public static final int anInt161 = 7000;

	@OriginalMember(owner = "client!aca", name = "b", descriptor = "(I)[Lclient!sq;")
	public static Class307[] method138() {
		return new Class307[] { Static134.aClass307_4, Static115.aClass307_3, Static325.aClass307_14, Static283.aClass307_15, Static31.aClass307_1, Static196.aClass307_5, Static479.aClass307_13, Static268.aClass307_6, Static397.aClass307_11, Static74.aClass307_2 };
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(II)V")
	public static void method139(@OriginalArg(0) int arg0) {
		if (Static313.anInt4728 == 1) {
			Static443.anInt8248 = arg0;
		} else if (Static313.anInt4728 == 2 || Static313.anInt4728 == 3) {
			Static95.anInt2223 = arg0;
		}
	}
}
