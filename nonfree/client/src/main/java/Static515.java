import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static515 {

	@OriginalMember(owner = "client!re", name = "b", descriptor = "I")
	public static int anInt8106;

	@OriginalMember(owner = "client!re", name = "h", descriptor = "Lclient!uq;")
	public static Class362 aClass362_110;

	@OriginalMember(owner = "client!re", name = "i", descriptor = "I")
	public static int anInt8111;

	@OriginalMember(owner = "client!re", name = "j", descriptor = "Lclient!ef;")
	public static Class97 aClass97_6;

	@OriginalMember(owner = "client!re", name = "g", descriptor = "Lclient!nc;")
	public static final Class243 aClass243_12 = new Class243();

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BIIII)V")
	public static void method6716(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) int local14 = Static263.anInt2100;
		if (local14 == 0) {
			return;
		}
		if (local14 == 1) {
			Static521.anInt8230 = arg1;
			Static263.anInt2100 = 2;
			Static392.anInt6523 = arg0;
			Static669.anInt10276 = arg2;
			Static82.anInt1509 = arg3;
		} else if (local14 == 2) {
			if (Static521.anInt8230 > arg1) {
				Static521.anInt8230 = arg1;
			}
			if (Static669.anInt10276 < arg2) {
				Static669.anInt10276 = arg2;
			}
			if (Static82.anInt1509 > arg3) {
				Static82.anInt1509 = arg3;
			}
			if (Static392.anInt6523 < arg0) {
				Static392.anInt6523 = arg0;
			}
		}
	}
}
