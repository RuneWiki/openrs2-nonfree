import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static542 {

	@OriginalMember(owner = "client!ws", name = "C", descriptor = "Lclient!kr;")
	public static Class171 aClass171_152;

	@OriginalMember(owner = "client!ws", name = "y", descriptor = "Lclient!uda;")
	public static final Class292 aClass292_17 = new Class292(4);

	@OriginalMember(owner = "client!ws", name = "B", descriptor = "Lclient!g;")
	public static final Class101 aClass101_4 = new Class101("stellardawn", 1);

	@OriginalMember(owner = "client!ws", name = "D", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_389 = new Class296(74, 2);

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(B)V")
	public static void method7530() {
		Static166.aClass17_13.method734();
		Static337.aClass104_8.method2419();
		Static366.aClass104_9.method2419();
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(ILclient!jq;II)V")
	public static void method7532(@OriginalArg(0) int arg0, @OriginalArg(1) Class156 arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class40 local12 = arg1.method4057(Static513.aClass122_10);
		if (local12 == null) {
			return;
		}
		Static513.aClass122_10.N(arg0, arg2, arg0 + arg1.anInt4732, arg1.anInt4673 + arg2);
		if (Static329.anInt5977 >= 3) {
			Static513.aClass122_10.G(-16777216, local12, arg0, arg2);
		} else {
			Static487.aClass2_47.method7366((float) arg1.anInt4732 / 2.0F + (float) arg0, (float) arg1.anInt4673 / 2.0F + (float) arg2, ((int) -Static404.aFloat156 & 0x3FFF) << 2, local12, arg0, arg2);
		}
	}
}
