import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static242 {

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "Lclient!hs;")
	public static final Class162 aClass162_6 = new Class162("", 21);

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_109 = new Class251(72, 7);

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
	public static int anInt4629 = 0;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)V")
	public static void method4047(@OriginalArg(0) int arg0) {
		Static130.anInt2076 = arg0;
		Static472.aClass317_54.method7873();
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BII)Z")
	public static boolean method4048(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x40000) != 0 | Static595.method8430(arg0, arg1) || Static497.method7459(arg1, arg0);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIII)V")
	public static void method4049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static468.anInt7895 <= arg2 && Static382.anInt6719 >= arg1 && Static410.anInt7068 <= arg0 && arg4 <= Static281.anInt5188) {
			Static319.method5047(arg1, arg4, arg0, arg3, arg2);
		} else {
			Static21.method323(arg0, arg3, arg1, arg4, arg2);
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)[Lclient!av;")
	public static Class27[] method4051() {
		return new Class27[] { Static293.aClass27_7, Static203.aClass27_5, Static108.aClass27_3, Static388.aClass27_11, Static598.aClass27_17, Static459.aClass27_18, Static323.aClass27_8, Static411.aClass27_12, Static474.aClass27_14, Static373.aClass27_10, Static211.aClass27_6, Static565.aClass27_16, Static338.aClass27_9, Static466.aClass27_13, Static158.aClass27_4 };
	}
}
