import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static497 {

	@OriginalMember(owner = "client!te", name = "z", descriptor = "Lclient!wba;")
	public static Class353 aClass353_44;

	@OriginalMember(owner = "client!te", name = "i", descriptor = "I")
	public static int anInt6024 = 0;

	@OriginalMember(owner = "client!te", name = "r", descriptor = "Lclient!vg;")
	public static Class341 aClass341_16 = null;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(II)Z")
	public static boolean method4926(@OriginalArg(1) int arg0) {
		Static543.aBoolean700 = true;
		Static373.anInt6266 = arg0 + 1 & 0xFFFF;
		return true;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!qp;ILclient!qp;)V")
	public static void method4928(@OriginalArg(0) Class8 arg0, @OriginalArg(2) Class8 arg1) {
		if (arg0.aClass8_68 != null) {
			arg0.method7615();
		}
		arg0.aClass8_68 = arg1.aClass8_68;
		arg0.aClass8_67 = arg1;
		arg0.aClass8_68.aClass8_67 = arg0;
		arg0.aClass8_67.aClass8_68 = arg0;
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(II)I")
	public static int method4932(@OriginalArg(0) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(I)V")
	public static void method4933() {
		Static554.aBoolean708 = false;
		Static14.method148(Static518.anInt8770, Static330.anInt5532, Static110.anInt2169, Static274.anInt307);
	}
}
